package com.mds.ontologyaccess.vocabulary;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Resource;

public class MDSClass {
	
		private static Model m_model = ModelFactory.createDefaultModel();

		public static final String NS = "http://maidis.decisions.support/modules/EMR_with_snomed-ct.owl#";
		
		public static String getURI() {return NS;}

		public static final Resource NAMESPACE = m_model.createResource( NS );

		public static final Resource ElectronicMedicalReccord = m_model.createResource( NS+"ElectronicMedicalReccord" );				
		
		public static final Resource Person = m_model.createResource( NS+"Person" );
					
		public static final Resource Patient = m_model.createResource( NS+"Patient" );
		
		public static final Resource MedicalItem = m_model.createResource( NS+"MedicalItem" );
		
		public static final Resource Action = m_model.createResource( NS+"Action" );
				
		public static final Resource Subjective = m_model.createResource( NS+"Subjective" );
		
		public static final Resource Objective = m_model.createResource( NS+"Objective" );
		
		public static final Resource Diagnostic = m_model.createResource( NS+"Diagnostic" );
		
		public static final Resource Motif = m_model.createResource( NS+"Motif" );
		
		
		
		
		
}
