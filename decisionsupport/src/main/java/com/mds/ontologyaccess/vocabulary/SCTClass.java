package com.mds.ontologyaccess.vocabulary;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Resource;


public class SCTClass {
	

	private static Model m_model = ModelFactory.createDefaultModel();
	
	//private static Node n ;
	public static final String NS = "http://snomed.info/id/";

	public static String getURI() {return NS;}

	public static final Resource NAMESPACE = m_model.createResource( NS );

	public static final Resource snomedCT = m_model.createResource(NS+"138875005");

}
