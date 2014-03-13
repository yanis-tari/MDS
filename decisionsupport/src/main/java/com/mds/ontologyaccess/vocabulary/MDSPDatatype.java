package com.mds.ontologyaccess.vocabulary;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.Resource;

public class MDSPDatatype {
	
	private static Model m_model = ModelFactory.createDefaultModel();

	public static final String NS = "http://snomed.info/sct/900000000000207008#";
	
	public static String getURI() {return NS;}

	public static final Resource NAMESPACE = m_model.createResource( NS );
	
	// Vocabulary Datatype Property
		///////////////////////////

		public static final Property hasFirstName = m_model.createProperty(NS+"hasFirstName");

		public static final Property hasBirthDate= m_model.createProperty(NS+"hasBirthDate");

		public static final Property hasEmail = m_model.createProperty(NS+"hasEmail");

		public static final Property hasGender= m_model.createProperty(NS+"hasGender");

		public static final Property hasLastName= m_model.createProperty(NS+"hasLastName");

		public static final Property hasAdress= m_model.createProperty(NS+"hasAdress");

		public static final Property hasPhoneNumber= m_model.createProperty(NS+"hasPhoneNumber");
		
		public static final Property hasValue= m_model.createProperty(NS+"hasValue");
		
		public static final Property hasUnit= m_model.createProperty(NS+"hasUnit");
		
		public static final Property hasDate= m_model.createProperty(NS+"hasDate");

}
