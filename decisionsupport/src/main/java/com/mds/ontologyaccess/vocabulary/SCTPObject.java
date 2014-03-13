package com.mds.ontologyaccess.vocabulary;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.Resource;

public class SCTPObject {


	private static Model m_model = ModelFactory.createDefaultModel();

	public static final String NS = "http://snomed.info/id/";

	public static String getURI() {return NS;}

	public static final Resource NAMESPACE = m_model.createResource( NS );
	  /////////////////////////////////
	 // Vocabulary Object Properties//
	/////////////////////////////////	
	public static final Property AssociatedMorphology  = m_model.createProperty(NS+"116676008");

	public static final Property HasSpecimen  = m_model.createProperty(NS+"116686009");

	public static final Property SpecimenSourceMorphology  = m_model.createProperty(NS+"118168003");

	public static final Property SpecimenSourceTopography  = m_model.createProperty(NS+"118169006");

	public static final Property SpecimenSourceIdentity  = m_model.createProperty(NS+"118170007");

	public static final Property SpecimenProcedure  = m_model.createProperty(NS+"118171006");

	public static final Property PartOf  = m_model.createProperty(NS+"123005000");         

	public static final Property HasActiveIngredient  = m_model.createProperty(NS+"127489000");

	public static final Property SubjectOfInformation  = m_model.createProperty(NS+"131195008");

	public static final Property CausativeAgent  = m_model.createProperty(NS+"246075003");

	public static final Property AssociatedFinding  = m_model.createProperty(NS+"246090004");

	public static final Property Component  = m_model.createProperty(NS+"246093002");

	public static final Property Severity  = m_model.createProperty(NS+"246112005");

	public static final Property Occurrence  = m_model.createProperty(NS+"246454002");

	public static final Property Episodicity  = m_model.createProperty(NS+"246456000");

	public static final Property RevisionStatus  = m_model.createProperty(NS+"246513007");

	public static final Property After  = m_model.createProperty(NS+"255234002");

	public static final Property Access  = m_model.createProperty(NS+"260507000");

	public static final Property Method  = m_model.createProperty(NS+"260686004");

	public static final Property Priority  = m_model.createProperty(NS+"260870009");

	public static final Property ClinicalCourse  = m_model.createProperty(NS+"263502005");

	public static final Property Laterality  = m_model.createProperty(NS+"272741003");

	public static final Property AssociatedProcedure  = m_model.createProperty(NS+"363589002");

	public static final Property FindingSite  = m_model.createProperty(NS+"363698007");

	public static final Property DirectDevice  = m_model.createProperty(NS+"363699004");

	public static final Property DirectMorphology  = m_model.createProperty(NS+"363700003");

	public static final Property DirectSubstance  = m_model.createProperty(NS+"363701004");               

	public static final Property HasFocus  = m_model.createProperty(NS+"363702006");

	public static final Property HasIntent  = m_model.createProperty(NS+"363703001");

	public static final Property ProcedureSite  = m_model.createProperty(NS+"363704007");

	public static final Property HasDefinitionalManifestation  = m_model.createProperty(NS+"363705008");

	public static final Property IndirectMorphology  = m_model.createProperty(NS+"363709002");

	public static final Property IndirectDevice  = m_model.createProperty(NS+"363710007");

	public static final Property HasInterpretation  = m_model.createProperty(NS+"363713009");

	public static final Property Interprets  = m_model.createProperty(NS+"363714003");

	public static final Property MeasurementMethod  = m_model.createProperty(NS+"370129005");

	public static final Property Property  = m_model.createProperty(NS+"370130000"); 

	public static final Property RecipientCategory  = m_model.createProperty(NS+"370131001");

	public static final Property ScaleType  = m_model.createProperty(NS+"370132008");

	public static final Property SpecimenSubstance  = m_model.createProperty(NS+"370133003");

	public static final Property TimeAspect  = m_model.createProperty(NS+"370134009"); 

	public static final Property PathologicalProcess  = m_model.createProperty(NS+"370135005"); 

	public static final Property ProcedureSiteDirect  = m_model.createProperty(NS+"405813007");

	public static final Property ProcedureSiteIndirect  = m_model.createProperty(NS+"405814001");

	public static final Property ProcedureDevice  = m_model.createProperty(NS+"405815000");

	public static final Property ProcedureMorphology  = m_model.createProperty(NS+"405816004");

	public static final Property FindingContext  = m_model.createProperty(NS+"408729009");

	public static final Property ProcedureContext  = m_model.createProperty(NS+"408730004");

	public static final Property TemporalContext  = m_model.createProperty(NS+"408731000"); 

	public static final Property SubjectRelationshipContext  = m_model.createProperty(NS+"408732007");

	public static final Property RouteOfAdministration  = m_model.createProperty(NS+"410675002");

	public static final Property HasDoseForm  = m_model.createProperty(NS+"411116001");

	public static final Property FindingMethod  = m_model.createProperty(NS+"418775008");

	public static final Property FindingInformer  = m_model.createProperty(NS+"419066007");

	public static final Property UsingDevice  = m_model.createProperty(NS+"424226004");

	public static final Property UsingEnergy  = m_model.createProperty(NS+"424244007"); 

	public static final Property UsingSubstance  = m_model.createProperty(NS+"424361007");

	public static final Property SurgicalApproach  = m_model.createProperty(NS+"424876005");

	public static final Property UsingAccessDevice  = m_model.createProperty(NS+"425391005");

	public static final Property DueTo  = m_model.createProperty(NS+"42752001");

	public static final Property AssociatedWith  = m_model.createProperty(NS+"47429007");

	public static final Property RoleGroup  = m_model.createProperty(NS+"609096000");

	
	
}
