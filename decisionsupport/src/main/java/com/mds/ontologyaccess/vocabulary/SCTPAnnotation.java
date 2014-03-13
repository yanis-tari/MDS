package com.mds.ontologyaccess.vocabulary;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.Resource;


public class SCTPAnnotation {


	private static Model m_model = ModelFactory.createDefaultModel();

	public static final String NS = "http://snomed.info/field/";

	public static String getURI() {return NS;}

	public static final Resource NAMESPACE = m_model.createResource( NS );

	// Vocabulary Annotation properties
	///////////////////////////

	public static final Property Description_term_en_us_preferred = m_model.createProperty( NS+"Description.term.en-us.preferred" );

	public static final Property Description_term_en_us_synonym = m_model.createProperty( NS+"Description.term.en-us.synonym" );

	public static final Property TextDefinition_term = m_model.createProperty( NS+"TextDefinition.term" );

}
