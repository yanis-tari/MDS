package com.mds.ontologyaccess.manager;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import virtuoso.jena.driver.VirtGraph;
import virtuoso.jena.driver.VirtuosoQueryExecution;
import virtuoso.jena.driver.VirtuosoQueryExecutionFactory;

import com.hp.hpl.jena.graph.Node;
import com.hp.hpl.jena.graph.Triple;
import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.query.ResultSetFormatter;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.util.iterator.ExtendedIterator;
import com.mds.decisionsupport.MedicalItem;
import com.mds.decisionsupport.MedicalRecord;
import com.mds.decisionsupport.SnomedCT;
import com.mds.ontologyaccess.rdf.MDSNode;
public class VirtuosoQueryManager {
	private VirtGraph graph;

	
	public VirtuosoQueryManager(String urlDB, String usr, String pwd){

		this.graph = new VirtGraph ("snomedCT",urlDB, usr, pwd);	
	
	
	}
	
	public VirtuosoQueryManager(String graphName, String urlDB, String usr, String pwd){
		this.graph = new VirtGraph (graphName,urlDB, usr, pwd);			
	}
	
	
	public VirtGraph getGraph() {
		return graph;
	}

	public void setGraph(VirtGraph graph) {
		this.graph = graph;
	}

	//////////////////////////////////////
   // Execution of SPARQL Select Query //
  //////////////////////////////////////	
	public List<QuerySolution> execSelect(String sparqlQuery){

		Query sparql = QueryFactory.create(sparqlQuery);
		VirtuosoQueryExecution vqe =VirtuosoQueryExecutionFactory.create(sparql, graph);
		ResultSet resultSet =vqe.execSelect();		
		List<QuerySolution> results = ResultSetFormatter.toList(resultSet);
		vqe.close();		
		return results;
		
	}
	
	   //////////////////////////////////////////////////////////////////////////////////////
	  //					Execution of SPARQL CONSTRUCT query							  //	 				
	 //CONSTRUCT { ?x <http://test> ?y } FROM <http://test1> WHERE { ?x <http://bb> ?y }///
	//////////////////////////////////////////////////////////////////////////////////////

	public Model execConstruct(String sparqlQuery){	
		Query sparql = QueryFactory.create(sparqlQuery);
		VirtuosoQueryExecution vqe =VirtuosoQueryExecutionFactory.create(sparql, graph);		
	    Model model = vqe.execConstruct();
	    vqe.close();
		return model;
	} 
	
       ///////////////////////////////////////////////
	  /// 	Execution of SPARQL DESCRIBE query    ///	
	 /// DESCRIBE <http://aa> FROM <http://test1>///
	///////////////////////////////////////////////
	 
	public Model execDescribe(String sparqlQuery){	
		Query sparql = QueryFactory.create(sparqlQuery);
		VirtuosoQueryExecution vqe =VirtuosoQueryExecutionFactory.create(sparql, graph);		
		Model model = vqe.execDescribe();
		vqe.close();
		return model;
	}

	   //////////////////////////////////////////////////////////////////
	  /// 	           Execution of SPARQL ASK query                 ///	
	 /// ASK FROM <http://test1> WHERE { <http://aa> <http://bb> ?y ///
	//////////////////////////////////////////////////////////////////
	public boolean execAsk(String sparqlQuery){	
		Query sparql = QueryFactory.create(sparqlQuery);
		VirtuosoQueryExecution vqe =VirtuosoQueryExecutionFactory.create(sparql, graph);		
		boolean ask =vqe.execAsk();
		System.out.println(ask);
		vqe.close(); 
		return ask;
	}
	
	  ///////////////////////////////////////////////////////////////////////
	 //				Insert a Patient into snomedCT the ontology			////  
	///////////////////////////////////////////////////////////////////////
	public Node insertPatient(String hasGender, String hasFirstName,String hasLastName, Date hasBirthDate,String hasEmail,String hasPhoneNumber){
		Node patientIndividual = MDSNode.getNewPatientIndividual();
		
		graph.getTransactionHandler().begin();
		
		graph.add(Triple.create(patientIndividual, MDSNode.typeProperty, MDSNode.patientClass));
		graph.add(Triple.create(patientIndividual, MDSNode.hasFirstName,Node.createLiteral(hasFirstName)));
		graph.add(Triple.create(patientIndividual, MDSNode.hasLastName,Node.createLiteral(hasLastName ) ));
		java.text.SimpleDateFormat form = new java.text.SimpleDateFormat();
		
		graph.add(Triple.create(patientIndividual, MDSNode.hasBirthDate,Node.createLiteral(form.format(hasBirthDate))));
		graph.add(Triple.create(patientIndividual, MDSNode.hasEmail,Node.createLiteral(hasEmail) ));
		graph.add(Triple.create(patientIndividual, MDSNode.hasPhoneNumber,Node.createLiteral(hasPhoneNumber) ));
		graph.add(Triple.create(patientIndividual, MDSNode.hasGender,Node.createLiteral(hasGender ) ));
		
		graph.getTransactionHandler().commit();
		
		return patientIndividual;
	}
	public void closeConnexion(){
		graph.close();		
	}
	
	  ///////////////////////////////////////////////////////////////////////
	 //				Insert a Medical Item into snomedCT the ontology	////  
	///////////////////////////////////////////////////////////////////////
	public Node insertMedicalItem(MedicalItem mi){
		Node miNode = null;
		graph.getTransactionHandler().begin();
		
		if(mi.getItemType().equalsIgnoreCase("Action")){
			 miNode = MDSNode.getNewActionIndividual();
			graph.add(Triple.create(miNode, MDSNode.typeProperty, MDSNode.ActionClass));
		}else{
			if(mi.getItemType().equalsIgnoreCase("Subjective")){
				 miNode = MDSNode.getNewSubjectiveIndividual();
				 graph.add(Triple.create(miNode, MDSNode.typeProperty, MDSNode.SubjectiveClass));
			}else{
				if(mi.getItemType().equalsIgnoreCase("Objective")){
					 miNode = MDSNode.getNewObjectiveIndividual();
					 graph.add(Triple.create(miNode, MDSNode.typeProperty, MDSNode.ObjectiveClass));
				}else{
					if(mi.getItemType().equalsIgnoreCase("Diagnostic")){
						 miNode = MDSNode.getNewDiagnosticIndividual();
						 graph.add(Triple.create(miNode, MDSNode.typeProperty, MDSNode.DiagnosticClass));
					}else{
					}if(mi.getItemType().equalsIgnoreCase("Motif")){
						 miNode = MDSNode.getNewMotifIndividual();
						 graph.add(Triple.create(miNode, MDSNode.typeProperty, MDSNode.MotifClass));
					}
				}
			}

		}
		
		if(mi.getValue() != null && mi.getValue() !=""){						
			graph.add(Triple.create(miNode, MDSNode.hasValue, Node.createLiteral(mi.getValue())));			
		}
		
		if(mi.getUnit() != null && mi.getUnit() !=""){						
			graph.add(Triple.create(miNode, MDSNode.hasUnit, Node.createLiteral(mi.getUnit())));			
		}
		
		if(mi.getDate() != null ){ 						
			java.text.SimpleDateFormat format = new java.text.SimpleDateFormat();							
			graph.add(Triple.create(miNode, MDSNode.hasDate, Node.createLiteral(format.format(mi.getDate()))));			
			
		}
		graph.getTransactionHandler().commit();
		
		return miNode;
	}
	
	  ////////////////////////////////////////////////////////////////////////////////
	 //				Insert a List of Medical Items into snomedCT the ontology	 ////
	//				Return the inserted medical items as Node					////
   ////////////////////////////////////////////////////////////////////////////////
	public List<Node> insertMedicalItemList(List<MedicalItem> miList){
		List<Node> miNodeList = new ArrayList<Node>();
		
		graph.getTransactionHandler().begin();
		for (MedicalItem mi : miList) {
			
			Node miNode = null;
		
			if(mi.getItemType().equalsIgnoreCase("Action")){
				 miNode = MDSNode.getNewActionIndividual();
				graph.add(Triple.create(miNode, MDSNode.typeProperty, MDSNode.ActionClass));
			}else{
				if(mi.getItemType().equalsIgnoreCase("Subjective")){
					 miNode = MDSNode.getNewSubjectiveIndividual();
					 graph.add(Triple.create(miNode, MDSNode.typeProperty, MDSNode.SubjectiveClass));
				}else{
					if(mi.getItemType().equalsIgnoreCase("Objective")){
						 miNode = MDSNode.getNewObjectiveIndividual();
						 graph.add(Triple.create(miNode, MDSNode.typeProperty, MDSNode.ObjectiveClass));
					}else{
						if(mi.getItemType().equalsIgnoreCase("Diagnostic")){
							 miNode = MDSNode.getNewDiagnosticIndividual();
							 graph.add(Triple.create(miNode, MDSNode.typeProperty, MDSNode.DiagnosticClass));
						}else{
						}if(mi.getItemType().equalsIgnoreCase("Motif")){
							 miNode = MDSNode.getNewMotifIndividual();
							 graph.add(Triple.create(miNode, MDSNode.typeProperty, MDSNode.MotifClass));
						}
					}
				}

			}
			if(mi.getSnomedCT() != null ){
				List<SnomedCT> snomedCTList = mi.getSnomedCT();
				for (SnomedCT snomedCT : snomedCTList) {
					graph.add(Triple.create(miNode, MDSNode.hasSnomedConceptObjectProperty, Node.createURI(snomedCT.getUri())));		
				}
								
			}
			
			if(mi.getValue() != null && mi.getValue() !=""){						
				graph.add(Triple.create(miNode, MDSNode.hasValue, Node.createLiteral(mi.getValue())));			
			}
			
			if(mi.getUnit() != null && mi.getUnit() !=""){						
				graph.add(Triple.create(miNode, MDSNode.hasUnit, Node.createLiteral(mi.getUnit())));			
			}
			
			if(mi.getDate() != null ){ 						
				java.text.SimpleDateFormat format = new java.text.SimpleDateFormat();							
				graph.add(Triple.create(miNode, MDSNode.hasDate, Node.createLiteral(format.format(mi.getDate()))));			
			}
			
			miNodeList.add(miNode);
		
		}
		graph.getTransactionHandler().commit();
		
		return miNodeList;
	}
	
	  /////////////////////////////////////////////////////////////////////////////////////////////
 	 //   Select a snomedCT term from the ontology and instanciate a new java snomedCt object  ///
	/////////////////////////////////////////////////////////////////////////////////////////////
	
	public List<com.mds.decisionsupport.SnomedCT> selectSnomedCT(String uriMi){				
		
		List<com.mds.decisionsupport.SnomedCT> snomedCtList = new ArrayList<SnomedCT>();
		ExtendedIterator<Triple> snomedConcept = graph.find(Node.createURI(uriMi), MDSNode.hasSnomedConceptObjectProperty, Node.ANY);
		while(snomedConcept.hasNext()){
			Triple snomedCTriple = snomedConcept.next();
			Node sct = snomedCTriple.getObject();

			
			String descriptionPreferred = null;
			String descriptionSynonyms = "";
			String definition = "";
			
			ExtendedIterator<Triple> prefLList = graph.find(sct,MDSNode.Description_term_en_us_preferred, Node.ANY);		
			for(;prefLList.hasNext();){				
				Triple t = prefLList.next();					
				Node objectNode = t.getObject();
				
				descriptionPreferred = (String)objectNode.getLiteralValue();	
			}			
			ExtendedIterator<Triple> defList = graph.find(sct, MDSNode.TextDefinition_term, Node.ANY);
			
			for(;defList.hasNext();){				
					definition+="<p>"+((String) defList.next().getObject().getLiteralValue())+"</p>";						
			}
			
			ExtendedIterator<Triple> synList = graph.find(sct,MDSNode.Description_term_en_us_synonym, Node.ANY);
			Boolean first = true;
			for(;synList.hasNext();){	
				if(first){
					descriptionSynonyms=((String)synList.next().getObject().getLiteralValue());
					first = false;
				}else{
					descriptionSynonyms+=", "+((String)synList.next().getObject().getLiteralValue());
				}				
			}
			descriptionSynonyms= "<p>"+descriptionSynonyms+"</p>";
			
			snomedCtList.add(new com.mds.decisionsupport.SnomedCT(sct.getURI(), descriptionPreferred, descriptionSynonyms, definition));				
		}
		return snomedCtList;		
	}
	
	  //////////////////////////////////////////////////////////////////////////////////////////////////
	 //				Select a list of Medical items and return instantiated MedicalItem List 		///
	//////////////////////////////////////////////////////////////////////////////////////////////////
	public List<MedicalItem> selectMedicalItems(String uriMedicalRecordIndividual) throws ParseException{
		ExtendedIterator<Triple> medicalItems = graph.find(Node.createURI(uriMedicalRecordIndividual), MDSNode.hasMedicalItemObjectProperty, Node.ANY);			
		List<MedicalItem> miList = new ArrayList<MedicalItem>();
		while(medicalItems.hasNext()){
			MedicalItem mi =  new MedicalItem();
			Triple t = medicalItems.next();
			Node miNode = t.getObject();
			
			ExtendedIterator<Triple> itemType = graph.find(miNode, MDSNode.typeProperty, Node.ANY);
			if(itemType.hasNext()){
				
				Triple itemTypeTriple = itemType.next();
				Node type =itemTypeTriple.getObject();
				if(type.matches(MDSNode.ActionClass)){
					mi.setItemType("Action");
				}
				if(type.matches(MDSNode.ObjectiveClass)){
					mi.setItemType("Objective");
				}
				if(type.matches(MDSNode.SubjectiveClass)){
					mi.setItemType("Subjective");
				}
				if(type.matches(MDSNode.DiagnosticClass)){
					mi.setItemType("Diagnostic");
				}
				if(type.matches(MDSNode.MotifClass)){
					mi.setItemType("Motif");
				}								
			}			
			ExtendedIterator<Triple> dates = graph.find(miNode, MDSNode.hasDate, Node.ANY);
			if(dates.hasNext()){
				String date =((String)dates.next().getObject().getLiteralValue());
				java.text.SimpleDateFormat format = new java.text.SimpleDateFormat();
				mi.setDate(format.parse(date));
				
			}
			
			ExtendedIterator<Triple> value = graph.find(miNode, MDSNode.hasValue, Node.ANY);
			if(value.hasNext()){
				mi.setValue(((String)value.next().getObject().getLiteralValue()));
			}
			
			
			ExtendedIterator<Triple> unit = graph.find(miNode, MDSNode.hasUnit, Node.ANY);
			if(unit.hasNext()){
				mi.setUnit(((String)unit.next().getObject().getLiteralValue()));
			}
			
			mi.setSnomedCT(selectSnomedCT(miNode.getURI()));
		miList.add(mi);
		}
		
		
		
		return miList;
	}
	  ///////////////////////////////////////////////////////////////////////////////////////////////////
	 //		Insert a Electronic medical record into the ontology and return the EMR as Node 		////
	///////////////////////////////////////////////////////////////////////////////////////////////////
	public Node insertElectronicMedicalRecord(MedicalRecord emr){
		Node emrNode = MDSNode.getNewElectronicMedicalRecordIndividual();
		Triple medicalRecord = Triple.create(emrNode, MDSNode.typeProperty, MDSNode.electronicMedicalRecordClass);				
		Node patientIndividual = insertPatient(emr.getGender(), emr.getFirstName(),emr.getLastName() , emr.getBirthDate() ,emr.getMail() ,emr.getPhoneNumber() );
		Triple hasStaticInformation = Triple.create(emrNode, MDSNode.hasStaticInformationObjectProperty, patientIndividual);
		List<MedicalItem> miList = emr.getMedicalItems();
		List<Node> miNodeList = insertMedicalItemList(miList);
		
		graph.getTransactionHandler().begin();
		
		graph.add(medicalRecord);
		graph.add(hasStaticInformation);		
			for (Node node : miNodeList) {
				graph.add(Triple.create(emrNode, MDSNode.hasMedicalItemObjectProperty, node));		
			}								
		graph.getTransactionHandler().commit();
		
		return emrNode;
	}
	
	 ///////////////////////////////////////////////////////////////////////////////////////////////////
	//			Select a Electronic medical record from the ontology and return instantiated EMR	///
   ///////////////////////////////////////////////////////////////////////////////////////////////////	
		public MedicalRecord selectMedicalRecord(String uriMedicalRecordIndividual) throws ParseException{

			
			MedicalRecord mr = new MedicalRecord();
			
			ExtendedIterator<Triple> staticInf = graph.find(Node.createURI(uriMedicalRecordIndividual), MDSNode.hasStaticInformationObjectProperty, Node.ANY);			
			
			while(staticInf.hasNext()){
				Triple t = staticInf.next();							
				ExtendedIterator<Triple> genders=	graph.find(t.getObject(), MDSNode.hasGender, Node.ANY);
				if(genders != null && genders.hasNext()){								
					mr.setGender(((String)(genders.next().getObject().getLiteralValue())));				
				}
				
				ExtendedIterator<Triple> hasFirstNames=	graph.find(t.getObject(), MDSNode.hasFirstName, Node.ANY);
				if(hasFirstNames != null && hasFirstNames.hasNext()){								
					mr.setFirstName(((String)(hasFirstNames.next().getObject().getLiteralValue())));					
				}
				
				ExtendedIterator<Triple> hasLastNames=	graph.find(t.getObject(), MDSNode.hasLastName, Node.ANY);
				if(hasLastNames != null && hasLastNames.hasNext()){					
					mr.setLastName(((String)(hasLastNames.next().getObject().getLiteralValue())));
				}
				
				ExtendedIterator<Triple> hasBirthDates=	graph.find(t.getObject(), MDSNode.hasBirthDate, Node.ANY);
				if(hasBirthDates != null && hasBirthDates.hasNext()){
					java.text.SimpleDateFormat format = new java.text.SimpleDateFormat();								
					mr.setBirthDate(format.parse(((String)(hasBirthDates.next().getObject().getLiteralValue()))));					
				}
								
				ExtendedIterator<Triple> hasEmails=	graph.find(t.getObject(), MDSNode.hasEmail, Node.ANY);
				if(hasEmails != null && hasEmails.hasNext()){					
					mr.setMail(((String)(hasEmails.next().getObject().getLiteralValue())));					
				}
				
				ExtendedIterator<Triple> hasPhoneNumbers =graph.find(t.getObject(), MDSNode.hasPhoneNumber, Node.ANY);
				if(hasPhoneNumbers != null && hasPhoneNumbers.hasNext()){
					mr.setPhoneNumber(((String)(hasPhoneNumbers.next().getObject().getLiteralValue())));					
				}
								
			}							
			mr.setMedicalItems(selectMedicalItems(uriMedicalRecordIndividual));
			
			return mr;
			}
	
	public static final String searchQuery(String search){
	String query=
				"prefix fn: <http://www.w3.org/2005/xpath-functions#>"
				+ "prefix sct: <http://snomed.info/field/>"
				
				+"SELECT * "					
				+"WHERE {"
				+"?term sct:Description.term.en-us.preferred ?pref ."
				+"FILTER ( fn:contains(?pref, \""+search+"\") )." 									
				+"}";
		return query;
	}
	public static final String searchAndEquivalentClassQuery(String words){
		String query=
						"prefix owl: <http://www.w3.org/2002/07/owl#>"
						+"prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#>"
						+"prefix rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>"
						+"prefix list: <http://jena.hpl.hp.com/ARQ/list#>"
						+"prefix fn: <http://www.w3.org/2005/xpath-functions#>"
						+ "prefix sct: <http://snomed.info/field/>"
						
						+"SELECT ?term ?pref ?ClassLabel  ?roleGroup ?attribute ?value from <snomedCT>"					
						+"WHERE {"
						+"?term sct:Description.term.en-us.preferred ?pref ."
						+"FILTER ( fn:contains(?pref, \""+words+"\") )." 
						
						+"OPTIONAL{ ?term owl:equivalentClass ?class.}"
						+"OPTIONAL{ ?class  owl:intersectionOf ?list . }"
						+"OPTIONAL{ ?list rdf:rest*/rdf:first ?equivalentClass . }"
						+"OPTIONAL{ ?equivalentClass rdfs:label ?ClassLabel .}"
						+"OPTIONAL{ ?equivalentClass owl:onProperty ?ontProperty . ?ontProperty rdfs:label ?roleGroup .}"
						
						+"OPTIONAL{?equivalentClass owl:someValuesFrom ?someValuesFrom ."
						+"         ?someValuesFrom owl:intersectionOf ?listSomeVal ."
						+"         ?listSomeVal rdf:rest*/rdf:first ?equivalentClassSomeVal ."
						+"			OPTIONAL{	?equivalentClassSomeVal owl:onProperty ?ontProperty2 . ?ontProperty2  rdfs:label ?attribute .}"		
						+"			OPTIONAL{	?equivalentClassSomeVal owl:someValuesFrom ?someValuesFrom2 . ?someValuesFrom2 rdfs:label ?value.}"			    
						+"			}"
						+"		}"
						+" group by ?term ?pref ?ClassLabel  ?roleGroup ?attribute ?value"
						+" order by ?term ?pref ?ClassLabel ";
			return query;
		}
	
	
	public static final String equivalentClassQuery(String uri){
		String query=
				"prefix ghi: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>"
				+"prefix mno: <http://www.w3.org/2001/XMLSchema#>"
				+"prefix owl: <http://www.w3.org/2002/07/owl#>"
				+"prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#>"
				+"prefix rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>"
				+"prefix list: <http://jena.hpl.hp.com/ARQ/list#>"
				+"prefix fn: <http://www.w3.org/2005/xpath-functions#>"
				
				+"SELECT ?pref ?ClassLabel  ?roleGroup ?attribute ?value "					
				+"WHERE {"
				+"<"+uri+"> <http://snomed.info/field/Description.term.en-us.preferred> ?pref ."
				
				+"OPTIONAL{ <"+uri+"> owl:equivalentClass ?class.}"
				+"OPTIONAL{ ?class  owl:intersectionOf ?list . }"
				+"OPTIONAL{ ?list rdf:rest*/rdf:first ?equivalentClass . }"
				+"OPTIONAL{ ?equivalentClass rdfs:label ?ClassLabel .}"
				+"OPTIONAL{ ?equivalentClass owl:onProperty ?ontProperty . ?ontProperty rdfs:label ?roleGroup .}"
				
				+"OPTIONAL{?equivalentClass owl:someValuesFrom ?someValuesFrom ."
				+"         ?someValuesFrom owl:intersectionOf ?listSomeVal ."
				+"         ?listSomeVal rdf:rest*/rdf:first ?equivalentClassSomeVal ."
				+"			OPTIONAL{	?equivalentClassSomeVal owl:onProperty ?ontProperty2 . ?ontProperty2  rdfs:label ?attribute .}"		
				+"			OPTIONAL{	?equivalentClassSomeVal owl:someValuesFrom ?someValuesFrom2 . ?someValuesFrom2 rdfs:label ?value.}"			    
				+"			}"
				+"		}"
				+" group by ?pref ?ClassLabel  ?roleGroup ?attribute ?value"
				+" order by ?pref ?ClassLabel ";
			return query;
		}
	public static final String subClassQuery(String uri){
		String query=
				"prefix ghi: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>"
				+"prefix mno: <http://www.w3.org/2001/XMLSchema#>"
				+"prefix owl: <http://www.w3.org/2002/07/owl#>"
				+"prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#>"
				+"prefix rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>"
				+"prefix list: <http://jena.hpl.hp.com/ARQ/list#>"
				+"prefix fn: <http://www.w3.org/2005/xpath-functions#>"
				
				+"SELECT ?pref ?ClassLabel  ?roleGroup ?attribute ?value"					
				+"WHERE {"
				+"<"+uri+"> <http://snomed.info/field/Description.term.en-us.preferred> ?pref ."
				
				+"OPTIONAL{ <"+uri+"> rdfs:subClassOf ?class.}"
				+"OPTIONAL{ ?class  owl:intersectionOf ?list . }"
				+"OPTIONAL{ ?list rdf:rest*/rdf:first ?subClassof . }"
				+"OPTIONAL{ ?subClassof rdfs:label ?ClassLabel .}"
				+"OPTIONAL{ ?subClassof owl:onProperty ?ontProperty . ?ontProperty rdfs:label ?roleGroup .}"
				
				+"OPTIONAL{?subClassof owl:someValuesFrom ?someValuesFrom ."
				+"         ?someValuesFrom owl:intersectionOf ?listSomeVal ."
				+"         ?listSomeVal rdf:rest*/rdf:first ?subClassofSomeVal ."
				+"			OPTIONAL{	?subClassofSomeVal owl:onProperty ?ontProperty2 . ?ontProperty2  rdfs:label ?attribute .}"		
				+"			OPTIONAL{	?subClassofSomeVal owl:someValuesFrom ?someValuesFrom2 . ?someValuesFrom2 rdfs:label ?value.}"			    
				+"			}"
				+"		}"
				+" group by ?pref ?ClassLabel  ?roleGroup ?attribute ?value"
				+" order by ?pref ?ClassLabel ";
			return query;
		}	

}
