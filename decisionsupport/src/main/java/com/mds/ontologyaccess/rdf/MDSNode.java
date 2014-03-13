package com.mds.ontologyaccess.rdf;


public class MDSNode {

	private static java.util.Random randomGenerator = new java.util.Random();
	//model.getGraph().commitTransaction(); ModelOracleSem

	
	//NODE
	//Class
	public static final com.hp.hpl.jena.graph.Node electronicMedicalRecordClass = com.hp.hpl.jena.graph.Node.createURI(com.mds.ontologyaccess.vocabulary.MDSClass.ElectronicMedicalReccord.getURI());
	
	public static final com.hp.hpl.jena.graph.Node medicalItemClass = com.hp.hpl.jena.graph.Node.createURI(com.mds.ontologyaccess.vocabulary.MDSClass.MedicalItem.getURI());
	
	public static final com.hp.hpl.jena.graph.Node personClass = com.hp.hpl.jena.graph.Node.createURI(com.mds.ontologyaccess.vocabulary.MDSClass.Person.getURI());
	
	public static final com.hp.hpl.jena.graph.Node patientClass = com.hp.hpl.jena.graph.Node.createURI(com.mds.ontologyaccess.vocabulary.MDSClass.Patient.getURI());	
	
	public static final com.hp.hpl.jena.graph.Node ActionClass = com.hp.hpl.jena.graph.Node.createURI(com.mds.ontologyaccess.vocabulary.MDSClass.Action.getURI());
	
	public static final com.hp.hpl.jena.graph.Node SubjectiveClass = com.hp.hpl.jena.graph.Node.createURI(com.mds.ontologyaccess.vocabulary.MDSClass.Subjective.getURI());
	
	public static final com.hp.hpl.jena.graph.Node ObjectiveClass = com.hp.hpl.jena.graph.Node.createURI(com.mds.ontologyaccess.vocabulary.MDSClass.Objective.getURI());
	
	public static final com.hp.hpl.jena.graph.Node DiagnosticClass = com.hp.hpl.jena.graph.Node.createURI(com.mds.ontologyaccess.vocabulary.MDSClass.Diagnostic.getURI());
	
	public static final com.hp.hpl.jena.graph.Node MotifClass = com.hp.hpl.jena.graph.Node.createURI(com.mds.ontologyaccess.vocabulary.MDSClass.Motif.getURI());
	
	public static final com.hp.hpl.jena.graph.Node snomedCTClass =  com.hp.hpl.jena.graph.Node.createURI(com.mds.ontologyaccess.vocabulary.SCTClass.snomedCT.getURI());
	
	//property
	public static final com.hp.hpl.jena.graph.Node classProperty = com.hp.hpl.jena.graph.Node.createURI(com.hp.hpl.jena.vocabulary.RDFS.Class.getURI());
	
	public static final com.hp.hpl.jena.graph.Node subClassOfProperty = com.hp.hpl.jena.graph.Node.createURI(com.hp.hpl.jena.vocabulary.RDFS.subClassOf.getURI());
	
	public static final com.hp.hpl.jena.graph.Node dataTypeProperty = com.hp.hpl.jena.graph.Node.createURI(com.hp.hpl.jena.vocabulary.RDFS.Datatype.getURI());
	
	public static final com.hp.hpl.jena.graph.Node domainProperty = com.hp.hpl.jena.graph.Node.createURI(com.hp.hpl.jena.vocabulary.RDFS.domain.getURI());
	
	public static final com.hp.hpl.jena.graph.Node rangeProperty = com.hp.hpl.jena.graph.Node.createURI(com.hp.hpl.jena.vocabulary.RDFS.range.getURI());
	
	public static final com.hp.hpl.jena.graph.Node typeProperty = com.hp.hpl.jena.graph.Node.createURI(com.hp.hpl.jena.vocabulary.RDF.type.getURI());
	
	public static final com.hp.hpl.jena.graph.Node objectProperty = com.hp.hpl.jena.graph.Node.createURI( com.hp.hpl.jena.vocabulary.OWL.ObjectProperty.getURI());
		
	
	//ObjectProperty														
	public static final com.hp.hpl.jena.graph.Node hasStaticInformationObjectProperty = com.hp.hpl.jena.graph.Node.createURI(com.mds.ontologyaccess.vocabulary.MDSObjectProperties.hasStaticInformation.getURI());
	
	public static final com.hp.hpl.jena.graph.Node hasSnomedConceptObjectProperty = com.hp.hpl.jena.graph.Node.createURI(com.mds.ontologyaccess.vocabulary.MDSObjectProperties.hasSnomedConcept.getURI());
	
	public static final com.hp.hpl.jena.graph.Node hasMedicalItemObjectProperty = com.hp.hpl.jena.graph.Node.createURI(com.mds.ontologyaccess.vocabulary.MDSObjectProperties.hasMedicalItems.getURI());


	//DataProperty
	public static final com.hp.hpl.jena.graph.Node hasGender = com.hp.hpl.jena.graph.Node.createURI(com.mds.ontologyaccess.vocabulary.MDSPDatatype.hasGender.getURI());
	
	public static final com.hp.hpl.jena.graph.Node hasFirstName = com.hp.hpl.jena.graph.Node.createURI(com.mds.ontologyaccess.vocabulary.MDSPDatatype.hasFirstName.getURI());
	
	public static final com.hp.hpl.jena.graph.Node hasLastName = com.hp.hpl.jena.graph.Node.createURI(com.mds.ontologyaccess.vocabulary.MDSPDatatype.hasLastName.getURI());
	
	public static final com.hp.hpl.jena.graph.Node hasBirthDate = com.hp.hpl.jena.graph.Node.createURI(com.mds.ontologyaccess.vocabulary.MDSPDatatype.hasBirthDate.getURI());
	
	public static final com.hp.hpl.jena.graph.Node hasAdress = com.hp.hpl.jena.graph.Node.createURI(com.mds.ontologyaccess.vocabulary.MDSPDatatype.hasAdress.getURI());
	
	public static final com.hp.hpl.jena.graph.Node hasEmail = com.hp.hpl.jena.graph.Node.createURI(com.mds.ontologyaccess.vocabulary.MDSPDatatype.hasEmail.getURI());
	
	public static final com.hp.hpl.jena.graph.Node hasPhoneNumber = com.hp.hpl.jena.graph.Node.createURI(com.mds.ontologyaccess.vocabulary.MDSPDatatype.hasPhoneNumber.getURI());
	
	public static final com.hp.hpl.jena.graph.Node valueString = com.hp.hpl.jena.graph.Node.createURI(com.hp.hpl.jena.vocabulary.XSD.xstring.getURI());
	
	public static final com.hp.hpl.jena.graph.Node valueDate = com.hp.hpl.jena.graph.Node.createURI(com.hp.hpl.jena.vocabulary.XSD.date.getURI());
	
	public static final com.hp.hpl.jena.graph.Node valueInteger = com.hp.hpl.jena.graph.Node.createURI(com.hp.hpl.jena.vocabulary.XSD.integer.getURI());

	public static final com.hp.hpl.jena.graph.Node hasValue = com.hp.hpl.jena.graph.Node.createURI(com.mds.ontologyaccess.vocabulary.MDSPDatatype.hasValue.getURI());
	
	public static final com.hp.hpl.jena.graph.Node hasUnit = com.hp.hpl.jena.graph.Node.createURI(com.mds.ontologyaccess.vocabulary.MDSPDatatype.hasUnit.getURI());
	
	public static final com.hp.hpl.jena.graph.Node hasDate = com.hp.hpl.jena.graph.Node.createURI(com.mds.ontologyaccess.vocabulary.MDSPDatatype.hasDate.getURI());

	//Annotaion
	
	public static final com.hp.hpl.jena.graph.Node Description_term_en_us_preferred = com.hp.hpl.jena.graph.Node.createURI(com.mds.ontologyaccess.vocabulary.SCTPAnnotation.Description_term_en_us_preferred.getURI());
	
	public static final com.hp.hpl.jena.graph.Node Description_term_en_us_synonym = com.hp.hpl.jena.graph.Node.createURI(com.mds.ontologyaccess.vocabulary.SCTPAnnotation.Description_term_en_us_synonym.getURI());
	
	public static final com.hp.hpl.jena.graph.Node TextDefinition_term = com.hp.hpl.jena.graph.Node.createURI(com.mds.ontologyaccess.vocabulary.SCTPAnnotation.TextDefinition_term.getURI());
		
	//Instance
	
	public static com.hp.hpl.jena.graph.Node getNewPersonIndividual(){
		int randomInt = randomGenerator.nextInt(999999999);
		return com.hp.hpl.jena.graph.Node.createURI(com.mds.ontologyaccess.vocabulary.MDSClass.Person.getURI()+"/"+String.valueOf(randomInt));
	}
	public static com.hp.hpl.jena.graph.Node getNewPatientIndividual(){
		int randomInt = randomGenerator.nextInt(999999999);
		return com.hp.hpl.jena.graph.Node.createURI(com.mds.ontologyaccess.vocabulary.MDSClass.Patient.getURI()+"/"+String.valueOf(randomInt));
	}

	public static com.hp.hpl.jena.graph.Node getNewElectronicMedicalRecordIndividual(){
		int randomInt = randomGenerator.nextInt(999999999);
		return com.hp.hpl.jena.graph.Node.createURI(com.mds.ontologyaccess.vocabulary.MDSClass.ElectronicMedicalReccord.getURI()+"/"+String.valueOf(randomInt));
	}
	public static com.hp.hpl.jena.graph.Node getNewMedicalItemIndividual(){
		int randomInt = randomGenerator.nextInt(999999999);
		return com.hp.hpl.jena.graph.Node.createURI(com.mds.ontologyaccess.vocabulary.MDSClass.MedicalItem.getURI()+"/"+String.valueOf(randomInt));
	}

	public static com.hp.hpl.jena.graph.Node getNewActionIndividual(){
		int randomInt = randomGenerator.nextInt(999999999);
		return com.hp.hpl.jena.graph.Node.createURI(com.mds.ontologyaccess.vocabulary.MDSClass.Action.getURI()+"/"+String.valueOf(randomInt));
	}
	public static com.hp.hpl.jena.graph.Node getNewSubjectiveIndividual(){
		int randomInt = randomGenerator.nextInt(999999999);
		return com.hp.hpl.jena.graph.Node.createURI(com.mds.ontologyaccess.vocabulary.MDSClass.Subjective.getURI()+"/"+String.valueOf(randomInt));
	}
	public static com.hp.hpl.jena.graph.Node getNewObjectiveIndividual(){
		int randomInt = randomGenerator.nextInt(999999999);
		return com.hp.hpl.jena.graph.Node.createURI(com.mds.ontologyaccess.vocabulary.MDSClass.Objective.getURI()+"/"+String.valueOf(randomInt));
	}
	public static com.hp.hpl.jena.graph.Node getNewDiagnosticIndividual(){
		int randomInt = randomGenerator.nextInt(999999999);
		return com.hp.hpl.jena.graph.Node.createURI(com.mds.ontologyaccess.vocabulary.MDSClass.Diagnostic.getURI()+"/"+String.valueOf(randomInt));
	}
	public static com.hp.hpl.jena.graph.Node getNewMotifIndividual(){
		int randomInt = randomGenerator.nextInt(999999999);
		return com.hp.hpl.jena.graph.Node.createURI(com.mds.ontologyaccess.vocabulary.MDSClass.Motif.getURI()+"/"+String.valueOf(randomInt));
	}
	
	public static com.hp.hpl.jena.graph.Node getNewSnomedCTIndividual(String snomedCTuri){
		int randomInt = randomGenerator.nextInt(999999999);
		return com.hp.hpl.jena.graph.Node.createURI(snomedCTuri+"/"+String.valueOf(randomInt));
	}
	
}
