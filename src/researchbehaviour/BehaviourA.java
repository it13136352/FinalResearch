/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package researchbehaviour;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author ARUNI PC
 */
public class BehaviourA {
    
        int eduCount=0;
        double eduweight=0;
        int opeCount=0;
        double opeweight=0;
        int extCount=0;
        double extweight=0;
        int emoCount=0;
        double emoweight=0;
        int agrCount=0;
        double agrweight=0;
        int conCount=0;
        double conweight=0;
    

 
  ///////////////////
 

public double extraversionPersentage() throws IOException,FileNotFoundException{

    FileReader reader = new  FileReader("staticcomparisoncount.txt");
    BufferedReader br = new  BufferedReader(reader);
    String line;
    String personality = null ;      
     String positivity = null ;  
      String positivitycount =null;
       double extraversionp=0;
while((line = br.readLine()) != null)
{
   
        String[] parts = line.split(" ");

        personality =parts[0];
        positivity =parts[1];
        positivitycount =parts[2];

  if(personality.equals("Extraversion"))
      {
      extCount=extCount+Integer.parseInt(positivitycount);
    
             if(positivity.equals("positive"))
             {
                 extweight = extweight+Double.parseDouble(positivitycount);
             }
             else{
                 extweight = extweight-Double.parseDouble(positivitycount);
             }
      }  
  double extraversion=((extweight/extCount)*19)-1.8;
  extraversionp=(extraversion/19)*100;

}  

br.close();
return extraversionp;
} 



public double educationPersentage() throws IOException,FileNotFoundException{
  
    FileReader reader = new  FileReader("staticcomparisoncount.txt");
    BufferedReader br = new  BufferedReader(reader);
    String line;
    String personality = null ;      
     String positivity = null ;  
      String positivitycount =null;
       double educationp=0;
while((line = br.readLine()) != null)
{
   
        String[] parts = line.split(" ");

        personality =parts[0];
        positivity =parts[1];
        positivitycount =parts[2];
  if(personality.equals("Education"))
      {
      eduCount=eduCount+Integer.parseInt(positivitycount);
    
             if(positivity.equals("positive"))
             {
                 eduweight = eduweight+Double.parseDouble(positivitycount);
             }
             else{
                 eduweight = eduweight-Double.parseDouble(positivitycount);
             }
      }
  double education =(eduweight/eduCount)*20;
  educationp =(education/20)*100;
   
}
    br.close();
    return educationp;

} 
public double opennessPersentage() throws IOException,FileNotFoundException{
    
  FileReader reader = new  FileReader("staticcomparisoncount.txt");
    BufferedReader br = new  BufferedReader(reader);
    String line;
    String personality = null ;      
     String positivity = null ;  
      String positivitycount =null;
       double opennessp=0;
while((line = br.readLine()) != null)
{
   
        String[] parts = line.split(" ");

        personality =parts[0];
        positivity =parts[1];
        positivitycount =parts[2];
  if(personality.equals("Openness"))
      {
      opeCount=opeCount+Integer.parseInt(positivitycount);
   
             if(positivity.equals("positive"))
             {
                 opeweight = opeweight+Double.parseDouble(positivitycount);
             }
             else{
                 opeweight = opeweight-Double.parseDouble(positivitycount);
             }
      }
 double openness=((opeweight/opeCount)*19)-3.05;
 opennessp=(openness/20)*100;
}  
    br.close();
    return opennessp;

} 
public double emotional_stabilityPersentage() throws IOException,FileNotFoundException{
      
   FileReader reader = new  FileReader("staticcomparisoncount.txt");
    BufferedReader br = new  BufferedReader(reader);
    String line;
    String personality = null ;      
     String positivity = null ;  
      String positivitycount =null;
       double emotional_stabilityp=0;
while((line = br.readLine()) != null)
{
   
        String[] parts = line.split(" ");

        personality =parts[0];
        positivity =parts[1];
        positivitycount =parts[2];
  if(personality.equals("EmotionalStability"))
      {
      emoCount=emoCount+Integer.parseInt(positivitycount);
    
             if(positivity.equals("positive"))
             {
                 emoweight = emoweight+Double.parseDouble(positivitycount);
             }
             else{
                 emoweight = emoweight-Double.parseDouble(positivitycount);
             }
      }
  double emotional_stability=((emoweight/emoCount)*20)-2.76;
 emotional_stabilityp=(emotional_stability/20)*100;
}  
    br.close();
    return emotional_stabilityp;

} 
public double agreeablenessPersentage() throws IOException,FileNotFoundException{
    
    FileReader reader = new  FileReader("staticcomparisoncount.txt");
    BufferedReader br = new  BufferedReader(reader);
     String line;
     String personality = null ;      
     String positivity = null ;  
     String positivitycount =null;
       double agreeablenessp=0;
while((line = br.readLine()) != null)
{
   
        String[] parts = line.split(" ");

        personality =parts[0];
        positivity =parts[1];
        positivitycount =parts[2];
if(personality.equals("Agreeableness"))
      {
      agrCount=agrCount+Integer.parseInt(positivitycount);
    
             if(positivity.equals("positive"))
             {
                 agrweight = agrweight+Double.parseDouble(positivitycount);
             }
             else{
                 agrweight = agrweight-Double.parseDouble(positivitycount);
             }
      }
  double agreeableness=((agrweight/agrCount)*15)-2.56;
agreeablenessp=(agreeableness/15)*100;

}
    br.close();
    return agreeablenessp;

} 
public double conscientiousPersentage() throws IOException,FileNotFoundException{
//      Research rrr = new Research();
//            String presonff =rrr.getaccordingto();
//    FileReader reader = new  FileReader(presonff);
    FileReader reader = new  FileReader("staticcomparisoncount.txt");
    BufferedReader br = new  BufferedReader(reader);
      String line;
      String personality = null ;      
      String positivity = null ;  
      String positivitycount =null;
      
       double conscientiousp=0;
while((line = br.readLine()) != null)
{
   
        String[] parts = line.split(" ");

        personality =parts[0];
        positivity =parts[1];
        positivitycount =parts[2];
if(personality.equals("Conscientious"))
      {
      conCount=conCount+Integer.parseInt(positivitycount);
    
             if(positivity.equals("positive"))
             {
                 conweight = conweight+Double.parseDouble(positivitycount);
             }
             else{
                 conweight = conweight-Double.parseDouble(positivitycount);
             }
      }
 double conscientious=((conweight/conCount)*17)-2.31;
conscientiousp=(conscientious/17)*100;
}  
    br.close();
    return conscientiousp;

} 





}

