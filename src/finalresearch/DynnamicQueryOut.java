/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalresearch;

//import static testbehaviour.StaticQueryOut.sparqlTest;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.rdf.model.Literal;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.util.FileManager;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.jena.iri.impl.Main;

/**
 *
 * @author THAMARA ATHAUDA
 */
public class DynnamicQueryOut {
     public static void main(String[] args) throws IOException
    {
     
      //one of main method  
        
    }
     
    public ArrayList<String> AgD() throws IOException
    {
          ArrayList Ag =new ArrayList();
        FileManager.get().addLocatorClassLoader(Main.class.getClassLoader());
           Model model = FileManager.get().loadModel("c:/owl/dynnamic.owl");
        String queryString1 ="PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> " + 
                "PREFIX foaf: <http://xmlns.com/foaf/0.1/>" +
                "SELECT * WHERE { " + 
                " ?Agreeableness foaf:ag ?a ."+
                "}";
        
        com.hp.hpl.jena.query.Query query1 = QueryFactory.create(queryString1);
        QueryExecution qexec1 = QueryExecutionFactory.create(query1, model);
        try 
        {
                ResultSet results1 = qexec1.execSelect();
                
                 while (results1.hasNext()) 
            {
                QuerySolution soln1 = results1.nextSolution();
                Literal name1 = soln1.getLiteral("a");
                String s1 = name1.toString();
                Ag.add(s1);
                
                
               
            }
         // System.out.println("Agreeableness pos"+Ag);
            }

            finally
            {
            qexec1.close();
            
            }
         return Ag;
        
    }
    public ArrayList<String> CoD() throws IOException
    {
          ArrayList Co =new ArrayList();
        FileManager.get().addLocatorClassLoader(Main.class.getClassLoader());
           Model model = FileManager.get().loadModel("c:/owl/dynnamic.owl");
                 String queryString1 ="PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> " + 
                "PREFIX foaf: <http://xmlns.com/foaf/0.1/>" +
                "SELECT * WHERE { " + 
                " ?Conscientiousness foaf:cc ?b " +
                "}";
        
        com.hp.hpl.jena.query.Query query1 = QueryFactory.create(queryString1);
        QueryExecution qexec2 = QueryExecutionFactory.create(query1, model);
        try 
        {
                ResultSet results2 = qexec2.execSelect();
                
                 while (results2.hasNext()) 
            {
                QuerySolution soln1 = results2.nextSolution();
                Literal name2 = soln1.getLiteral("b");
                String s2 = name2.toString();
                Co.add(s2);
                
                
               
            }
      
            }

            finally
            {
            qexec2.close();
            
            }
         return Co;
        
    }
    
    public ArrayList<String> EspD() throws IOException
    {
          ArrayList Esp =new ArrayList();
        FileManager.get().addLocatorClassLoader(Main.class.getClassLoader());
           Model model = FileManager.get().loadModel("c:/owl/dynnamic.owl");
        String queryString3 ="PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> " + 
                "PREFIX foaf: <http://xmlns.com/foaf/0.1/>" +
                "SELECT * WHERE { " + 
                " ?Emotional_Stability_positive foaf:esp ?c ."+
                "}";
        
        com.hp.hpl.jena.query.Query query3 = QueryFactory.create(queryString3);
        QueryExecution qexec3 = QueryExecutionFactory.create(query3, model);
        try 
        {
                ResultSet results3 = qexec3.execSelect();
                
                 while (results3.hasNext()) 
            {
                QuerySolution soln1 = results3.nextSolution();
                Literal name1 = soln1.getLiteral("c");
                
                String s3 = name1.toString();
              
                Esp.add(s3);
                
               //System.out.println(s3);
               
            }
       
            }

            finally
            {
            qexec3.close();
            
            }
         return Esp;
        
    }
    public ArrayList<String> ExpD() throws IOException
    {
          ArrayList Exp =new ArrayList();
        FileManager.get().addLocatorClassLoader(Main.class.getClassLoader());
           Model model = FileManager.get().loadModel("c:/owl/dynnamic.owl");
                 String queryString4 ="PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> " + 
                "PREFIX foaf: <http://xmlns.com/foaf/0.1/>" +
                "SELECT * WHERE { " + 
                " ?Extraversion_positive foaf:exp ?d " +
                "}";
        
        com.hp.hpl.jena.query.Query query4 = QueryFactory.create(queryString4);
        QueryExecution qexec4 = QueryExecutionFactory.create(query4, model);
        try 
        {
                ResultSet results4 = qexec4.execSelect();
                
                 while (results4.hasNext()) 
            {
                QuerySolution soln1 = results4.nextSolution();
                Literal name4 = soln1.getLiteral("d");
                String s4 = name4.toString();
                Exp.add(s4);
                
                
               
            }
      
            }

            finally
            {
            qexec4.close();
            
            }
         return Exp;
        
    }
    
    public ArrayList<String> OpD() throws IOException
    {
          ArrayList Op =new ArrayList();
        FileManager.get().addLocatorClassLoader(Main.class.getClassLoader());
           Model model = FileManager.get().loadModel("c:/owl/dynnamic.owl");
                 String queryString5 ="PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> " + 
                "PREFIX foaf: <http://xmlns.com/foaf/0.1/>" +
                "SELECT * WHERE { " + 
                " ?Openness foaf:op ?e " +
                "}";
        
        com.hp.hpl.jena.query.Query query5 = QueryFactory.create(queryString5);
        QueryExecution qexec5 = QueryExecutionFactory.create(query5, model);
        try 
        {
                ResultSet results5 = qexec5.execSelect();
                
                 while (results5.hasNext()) 
            {
                QuerySolution soln1 = results5.nextSolution();
                Literal name5 = soln1.getLiteral("e");
                String s5 = name5.toString();
                Op.add(s5);
            
                
               
            }
      
        }

            finally
            {
            qexec5.close();
            
            }
         return Op;
        
    }
    
     public ArrayList<String> EdD() throws IOException
    {
          ArrayList Ed =new ArrayList();
        FileManager.get().addLocatorClassLoader(Main.class.getClassLoader());
           Model model = FileManager.get().loadModel("c:/owl/dynnamic.owl");
                 String queryString6 ="PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> " + 
                "PREFIX foaf: <http://xmlns.com/foaf/0.1/>" +
                "SELECT * WHERE { " + 
                " ?Education foaf:ed ?ed1 " +
                "}";
        
        com.hp.hpl.jena.query.Query query6 = QueryFactory.create(queryString6);
        QueryExecution qexec6 = QueryExecutionFactory.create(query6, model);
        try 
        {
                ResultSet results6 = qexec6.execSelect();
                
                 while (results6.hasNext()) 
            {
                QuerySolution soln1 = results6.nextSolution();
                Literal name6 = soln1.getLiteral("ed1");
                String s6 = name6.toString();
                Ed.add(s6);
            
                
               
            }
      
        }

            finally
            {
            qexec6.close();
            
            }
         return Ed;
        
    }
}
