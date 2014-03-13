package com.mds.ontologyaccess.rdf;

public class MDSTripleModel {


	//Class
	public static final com.hp.hpl.jena.graph.Triple electronicMedicalRecordClass = com.hp.hpl.jena.graph.Triple.create(com.mds.ontologyaccess.rdf.MDSNode.electronicMedicalRecordClass, com.mds.ontologyaccess.rdf.MDSNode.typeProperty, com.mds.ontologyaccess.rdf.MDSNode.classProperty);

	public static final com.hp.hpl.jena.graph.Triple medicalItemClass = com.hp.hpl.jena.graph.Triple.create(com.mds.ontologyaccess.rdf.MDSNode.medicalItemClass, com.mds.ontologyaccess.rdf.MDSNode.typeProperty, com.mds.ontologyaccess.rdf.MDSNode.classProperty);
	
	public static final com.hp.hpl.jena.graph.Triple personClass = com.hp.hpl.jena.graph.Triple.create(com.mds.ontologyaccess.rdf.MDSNode.personClass, com.mds.ontologyaccess.rdf.MDSNode.typeProperty, com.mds.ontologyaccess.rdf.MDSNode.classProperty);
		
	public static final com.hp.hpl.jena.graph.Triple patientClass = com.hp.hpl.jena.graph.Triple.create(com.mds.ontologyaccess.rdf.MDSNode.patientClass, com.mds.ontologyaccess.rdf.MDSNode.typeProperty, com.mds.ontologyaccess.rdf.MDSNode.classProperty);

	public static final com.hp.hpl.jena.graph.Triple patientSubClassOfPerson = com.hp.hpl.jena.graph.Triple.create(com.mds.ontologyaccess.rdf.MDSNode.patientClass, com.mds.ontologyaccess.rdf.MDSNode.subClassOfProperty, com.mds.ontologyaccess.rdf.MDSNode.personClass);

	//hasStaticInformation Property
	public static final com.hp.hpl.jena.graph.Triple hasStaticInformationProperty = com.hp.hpl.jena.graph.Triple.create(com.mds.ontologyaccess.rdf.MDSNode.hasStaticInformationObjectProperty, com.mds.ontologyaccess.rdf.MDSNode.typeProperty, com.mds.ontologyaccess.rdf.MDSNode.objectProperty);	    

	public static final com.hp.hpl.jena.graph.Triple hasStaticInformationRange = com.hp.hpl.jena.graph.Triple.create(com.mds.ontologyaccess.rdf.MDSNode.hasStaticInformationObjectProperty, com.mds.ontologyaccess.rdf.MDSNode.rangeProperty, com.mds.ontologyaccess.rdf.MDSNode.patientClass);

	public static final com.hp.hpl.jena.graph.Triple hasStaticInformationDomain = com.hp.hpl.jena.graph.Triple.create(com.mds.ontologyaccess.rdf.MDSNode.hasStaticInformationObjectProperty, com.mds.ontologyaccess.rdf.MDSNode.domainProperty, com.mds.ontologyaccess.rdf.MDSNode.electronicMedicalRecordClass);

	//hashasMedicalItem Property
	public static final com.hp.hpl.jena.graph.Triple hashasMedicalItemProperty = com.hp.hpl.jena.graph.Triple.create(com.mds.ontologyaccess.rdf.MDSNode.hasStaticInformationObjectProperty, com.mds.ontologyaccess.rdf.MDSNode.typeProperty, com.mds.ontologyaccess.rdf.MDSNode.objectProperty);	    

	public static final com.hp.hpl.jena.graph.Triple hashasMedicalItemRange = com.hp.hpl.jena.graph.Triple.create(com.mds.ontologyaccess.rdf.MDSNode.hasMedicalItemObjectProperty, com.mds.ontologyaccess.rdf.MDSNode.rangeProperty, com.mds.ontologyaccess.rdf.MDSNode.medicalItemClass);

	public static final com.hp.hpl.jena.graph.Triple hashasMedicalItemDomain = com.hp.hpl.jena.graph.Triple.create(com.mds.ontologyaccess.rdf.MDSNode.hasMedicalItemObjectProperty, com.mds.ontologyaccess.rdf.MDSNode.domainProperty, com.mds.ontologyaccess.rdf.MDSNode.electronicMedicalRecordClass);

	//hasSnomedConcept propertie
	public static final com.hp.hpl.jena.graph.Triple hasSnomedConceptPropertie = com.hp.hpl.jena.graph.Triple.create(com.mds.ontologyaccess.rdf.MDSNode.hasSnomedConceptObjectProperty, com.mds.ontologyaccess.rdf.MDSNode.typeProperty, com.mds.ontologyaccess.rdf.MDSNode.objectProperty);

	public static final com.hp.hpl.jena.graph.Triple hasSnomedConceptRange = com.hp.hpl.jena.graph.Triple.create(com.mds.ontologyaccess.rdf.MDSNode.hasSnomedConceptObjectProperty, com.mds.ontologyaccess.rdf.MDSNode.rangeProperty,com.mds.ontologyaccess.rdf.MDSNode.snomedCTClass );

	public static final com.hp.hpl.jena.graph.Triple hasSnomedConceptDomain = com.hp.hpl.jena.graph.Triple.create(com.mds.ontologyaccess.rdf.MDSNode.hasSnomedConceptObjectProperty, com.mds.ontologyaccess.rdf.MDSNode.domainProperty, com.mds.ontologyaccess.rdf.MDSNode.medicalItemClass);


	//medicalItem subClass ...
	public static final com.hp.hpl.jena.graph.Triple ActionClass = com.hp.hpl.jena.graph.Triple.create(com.mds.ontologyaccess.rdf.MDSNode.ActionClass, com.mds.ontologyaccess.rdf.MDSNode.typeProperty, com.mds.ontologyaccess.rdf.MDSNode.classProperty);
	
	public static final com.hp.hpl.jena.graph.Triple SubjectiveClass = com.hp.hpl.jena.graph.Triple.create(com.mds.ontologyaccess.rdf.MDSNode.SubjectiveClass, com.mds.ontologyaccess.rdf.MDSNode.typeProperty, com.mds.ontologyaccess.rdf.MDSNode.classProperty);
	
	public static final com.hp.hpl.jena.graph.Triple ObjectiveClass = com.hp.hpl.jena.graph.Triple.create(com.mds.ontologyaccess.rdf.MDSNode.ObjectiveClass, com.mds.ontologyaccess.rdf.MDSNode.typeProperty, com.mds.ontologyaccess.rdf.MDSNode.classProperty);
	
	public static final com.hp.hpl.jena.graph.Triple DiagnosticClass = com.hp.hpl.jena.graph.Triple.create(com.mds.ontologyaccess.rdf.MDSNode.DiagnosticClass, com.mds.ontologyaccess.rdf.MDSNode.typeProperty, com.mds.ontologyaccess.rdf.MDSNode.classProperty);
	
	public static final com.hp.hpl.jena.graph.Triple MotifClass= com.hp.hpl.jena.graph.Triple.create(com.mds.ontologyaccess.rdf.MDSNode.MotifClass, com.mds.ontologyaccess.rdf.MDSNode.typeProperty, com.mds.ontologyaccess.rdf.MDSNode.classProperty);	 
	
	//medicalItem subClass constraint ...
	public static final com.hp.hpl.jena.graph.Triple ActionSubClassOfMI = com.hp.hpl.jena.graph.Triple.create(com.mds.ontologyaccess.rdf.MDSNode.ActionClass, com.mds.ontologyaccess.rdf.MDSNode.subClassOfProperty, com.mds.ontologyaccess.rdf.MDSNode.medicalItemClass);
	
	public static final com.hp.hpl.jena.graph.Triple SubjectiveSubClassOfMI = com.hp.hpl.jena.graph.Triple.create(com.mds.ontologyaccess.rdf.MDSNode.SubjectiveClass, com.mds.ontologyaccess.rdf.MDSNode.subClassOfProperty, com.mds.ontologyaccess.rdf.MDSNode.medicalItemClass);
	
	public static final com.hp.hpl.jena.graph.Triple ObjectiveSubClassOfMI = com.hp.hpl.jena.graph.Triple.create(com.mds.ontologyaccess.rdf.MDSNode.ObjectiveClass, com.mds.ontologyaccess.rdf.MDSNode.subClassOfProperty, com.mds.ontologyaccess.rdf.MDSNode.medicalItemClass);
	
	public static final com.hp.hpl.jena.graph.Triple DiagnosticSubClassOfMI = com.hp.hpl.jena.graph.Triple.create(com.mds.ontologyaccess.rdf.MDSNode.DiagnosticClass, com.mds.ontologyaccess.rdf.MDSNode.subClassOfProperty, com.mds.ontologyaccess.rdf.MDSNode.medicalItemClass);
	
	public static final com.hp.hpl.jena.graph.Triple MotifSubClassOfMI = com.hp.hpl.jena.graph.Triple.create(com.mds.ontologyaccess.rdf.MDSNode.MotifClass, com.mds.ontologyaccess.rdf.MDSNode.subClassOfProperty, com.mds.ontologyaccess.rdf.MDSNode.medicalItemClass); 
	
	//patient datatype Property
	
	public static final com.hp.hpl.jena.graph.Triple hasFirstNameDatatypeProperty = com.hp.hpl.jena.graph.Triple.create(com.mds.ontologyaccess.rdf.MDSNode.hasFirstName, com.mds.ontologyaccess.rdf.MDSNode.dataTypeProperty,com.mds.ontologyaccess.rdf.MDSNode.valueString );
	
	public static final com.hp.hpl.jena.graph.Triple hasLastNameDatatypeProperty = com.hp.hpl.jena.graph.Triple.create(com.mds.ontologyaccess.rdf.MDSNode.hasLastName, com.mds.ontologyaccess.rdf.MDSNode.dataTypeProperty,com.mds.ontologyaccess.rdf.MDSNode.valueString );
	
	public static final com.hp.hpl.jena.graph.Triple hasBirthDateDatatypeProperty = com.hp.hpl.jena.graph.Triple.create(com.mds.ontologyaccess.rdf.MDSNode.hasBirthDate, com.mds.ontologyaccess.rdf.MDSNode.dataTypeProperty,com.mds.ontologyaccess.rdf.MDSNode.valueDate );
	
	public static final com.hp.hpl.jena.graph.Triple hasAdressDatatypeProperty = com.hp.hpl.jena.graph.Triple.create(com.mds.ontologyaccess.rdf.MDSNode.hasAdress, com.mds.ontologyaccess.rdf.MDSNode.dataTypeProperty,com.mds.ontologyaccess.rdf.MDSNode.valueString );
	
	public static final com.hp.hpl.jena.graph.Triple hasEmailDatatypeProperty = com.hp.hpl.jena.graph.Triple.create(com.mds.ontologyaccess.rdf.MDSNode.hasEmail, com.mds.ontologyaccess.rdf.MDSNode.dataTypeProperty,com.mds.ontologyaccess.rdf.MDSNode.valueString );
	
	public static final com.hp.hpl.jena.graph.Triple hasGenderDatatypeProperty = com.hp.hpl.jena.graph.Triple.create(com.mds.ontologyaccess.rdf.MDSNode.hasGender, com.mds.ontologyaccess.rdf.MDSNode.dataTypeProperty,com.mds.ontologyaccess.rdf.MDSNode.valueString );
	
	public static final com.hp.hpl.jena.graph.Triple hasPhoneNumberDatatypeProperty = com.hp.hpl.jena.graph.Triple.create(com.mds.ontologyaccess.rdf.MDSNode.hasPhoneNumber, com.mds.ontologyaccess.rdf.MDSNode.dataTypeProperty,com.mds.ontologyaccess.rdf.MDSNode.valueString );
	
	public static final com.hp.hpl.jena.graph.Triple hasValueDatatypeProperty = com.hp.hpl.jena.graph.Triple.create(com.mds.ontologyaccess.rdf.MDSNode.hasValue, com.mds.ontologyaccess.rdf.MDSNode.dataTypeProperty,com.mds.ontologyaccess.rdf.MDSNode.valueString );
	
	public static final com.hp.hpl.jena.graph.Triple hasUnitDatatypeProperty = com.hp.hpl.jena.graph.Triple.create(com.mds.ontologyaccess.rdf.MDSNode.hasUnit, com.mds.ontologyaccess.rdf.MDSNode.dataTypeProperty,com.mds.ontologyaccess.rdf.MDSNode.valueString );
	
	public static final com.hp.hpl.jena.graph.Triple hasDateDatatypeProperty = com.hp.hpl.jena.graph.Triple.create(com.mds.ontologyaccess.rdf.MDSNode.hasDate, com.mds.ontologyaccess.rdf.MDSNode.dataTypeProperty,com.mds.ontologyaccess.rdf.MDSNode.valueString );
	
		
}
