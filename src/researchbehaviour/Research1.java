/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package researchbehaviour;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;

import org.semanticweb.owlapi.io.RDFXMLOntologyFormat;
import org.semanticweb.owlapi.util.DefaultPrefixManager;


/**
 *
 * @author Chathuraga
 */
public class Research1 {


    /**
     * @param args the command line arguments
     */
  // public static void main(String[] args) throws OWLOntologyCreationException, OWLOntologyStorageException, FileNotFoundException, IOException {
        // TODO code application logic here
       
      public void dyanamicOnto() throws OWLOntologyStorageException, IOException, OWLOntologyCreationException{  
        OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
        
        // load an ontology from the web
        IRI iri = IRI.create("http://thamara.lilydigital.com/chathu01/Newonto.owl");
     
        OWLOntology behoviourOntology = manager.loadOntologyFromOntologyDocument(iri);
        System.out.println("Loaded ontology: " + behoviourOntology);
        
        // We can always obtain the location where an ontology was loaded from
		IRI documentIRI = manager.getOntologyDocumentIRI(behoviourOntology);
		System.out.println(" from: " + documentIRI);
        
                OWLDataFactory dataFactory = manager.getOWLDataFactory();
                PrefixManager pm = new DefaultPrefixManager(iri.toString());
   
//                String base = "http://www.semanticweb.org/ontologies/individualsexample";
//                OWLOntology ont = manager.createOntology(IRI.create(base));

//--------------------------------------------------------------------------------------------------    
        FileReader reader = new  FileReader("outonto.txt");
        BufferedReader br = new  BufferedReader(reader);
        String linea;
        String category1 = null ;      
        String individual = null ;  
        
        while((linea = br.readLine()) != null)
        {
       String[] dyanamicontowords = linea.split(" ");

        category1 = dyanamicontowords[1];
        individual =dyanamicontowords[0];
                
        OWLClass category = dataFactory.getOWLClass(category1, pm);
        
        OWLNamedIndividual mary = dataFactory.getOWLNamedIndividual(individual, pm);
        OWLClassAssertionAxiom classAssertion = dataFactory.getOWLClassAssertionAxiom(category, mary);
        manager.addAxiom(behoviourOntology, classAssertion);
    
        }    
        /////////////////////
          /////////////////////////////////////////////////////
        FileReader reader1 = new  FileReader("outonto1.txt");
        
        BufferedReader br1 = new  BufferedReader(reader1);
        String linea1;
        String category2 = null ;      
        String individua2 = null ;  
        
        while((linea1 = br1.readLine()) != null)
        {
        String[] dyanamicontowords = linea1.split(" ");

        category2 = dyanamicontowords[1];
        individua2 =dyanamicontowords[0];
                
        OWLClass category = dataFactory.getOWLClass(category2, pm);
        
        OWLNamedIndividual indiv = dataFactory.getOWLNamedIndividual(individua2, pm);
        OWLClassAssertionAxiom classAssertion = dataFactory.getOWLClassAssertionAxiom(category, indiv);
        manager.addAxiom(behoviourOntology, classAssertion);
        }
    ///////////////////////////////////////////////////////////////////
        FileReader reader2 = new  FileReader("outonto2.txt");
        
        BufferedReader br2 = new  BufferedReader(reader1);
        String linea2;
        String category3 = null ;      
        String individua3 = null ;  
        
        while((linea1 = br1.readLine()) != null)
        {
        String[] dyanamicontowords = linea1.split(" ");

        category2 = dyanamicontowords[1];
        individua2 =dyanamicontowords[0];
                
        OWLClass category = dataFactory.getOWLClass(category3, pm);
        
        OWLNamedIndividual indiv = dataFactory.getOWLNamedIndividual(individua3, pm);
        OWLClassAssertionAxiom classAssertion = dataFactory.getOWLClassAssertionAxiom(category, indiv);
        manager.addAxiom(behoviourOntology, classAssertion);
        } 
        /////////////////////////////////////////////
        
        FileReader reader3 = new  FileReader("outonto3.txt");
        
        BufferedReader br3 = new  BufferedReader(reader1);
        String linea3;
        String category4 = null ;      
        String individua4 = null ;  
        
        while((linea1 = br1.readLine()) != null)
        {
        String[] dyanamicontowords = linea1.split(" ");

        category2 = dyanamicontowords[1];
        individua2 =dyanamicontowords[0];
                
        OWLClass category = dataFactory.getOWLClass(category4, pm);
        
        OWLNamedIndividual indiv = dataFactory.getOWLNamedIndividual(individua4, pm);
        OWLClassAssertionAxiom classAssertion = dataFactory.getOWLClassAssertionAxiom(category, indiv);
        manager.addAxiom(behoviourOntology, classAssertion);
        } 
        ////////////////////
        
            RDFXMLOntologyFormat rdfxmlFormat = new RDFXMLOntologyFormat();
            File file1 = new File("C:\\Users\\THAMARA ATHAUDA\\Documents\\ResearchBehaviour\\Dynamic onto", "Dynamic.owl");
            manager.saveOntology(behoviourOntology,rdfxmlFormat ,IRI.create(file1.toURI()));
        


    }
    
}

