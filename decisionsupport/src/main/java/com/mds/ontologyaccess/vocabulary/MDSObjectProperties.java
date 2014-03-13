package com.mds.ontologyaccess.vocabulary;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.Resource;

public class MDSObjectProperties {
	private static Model m_model = ModelFactory.createDefaultModel();

	public static final String NS = "http://maidis.decisions.support/modules/EMR_with_snomed-ct.owl#";
	
	public static String getURI() {return NS;}

	public static final Resource NAMESPACE = m_model.createResource( NS );
	
	public static final Property hasStaticInformation  = m_model.createProperty(NS+"hasStaticInformation");
	
	public static final Property hasMedicalItems  = m_model.createProperty(NS+"hasMedicalItems");

	public static final Property hasSnomedConcept  = m_model.createProperty(NS+"hasSnomedConcept");

}
