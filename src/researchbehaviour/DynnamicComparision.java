/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package researchbehaviour;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author THAMARA ATHAUDA
 */
public class DynnamicComparision {
    
    
    
    public void printpersonDy() throws IOException
{
    
  DynnaicBaseAlogo BA = new DynnaicBaseAlogo();  
   ////
  
   FileWriter fa =null;
   
            int education = 0;
        
          
           int emotional_stability_p = BA.printlistemoDyp();
           int emotional_stability_n = BA.printlistemoDyn();
           int openness_p = BA.printlistopeDyp();
           int openness_n = BA.printlistopeDyn();
           int extraversion_p = BA.printlistExptDyp();
           int extraversion_n = BA.printlistExtDyn();
           int agrreableness_p = BA.printlistagrDyp();
           int agrreableness_n = BA.printlistagrDyn();
           int con_p = BA.printlistconDyp();
           int con_n = BA.printlistconDyn();
           education = BA.printlistEduDy();
           
          

          fa = new FileWriter(new File("dynnamiccomparisoncount.txt"));
          fa.write("agreeableness positive "+Integer.toString(agrreableness_p)+"\n"+
                  "agreeableness negative "+Integer.toString(agrreableness_n)+"\n"+
                  "extraversion positive "+Integer.toString(extraversion_p)+"\n"+
                  "extraversion negative "+Integer.toString(extraversion_n)+"\n"+
                  "openness positive "+Integer.toString(openness_p)+"\n"+
                  "openness negative "+Integer.toString(openness_n)+"\n"+
                  "emotional_stability positive "+Integer.toString(emotional_stability_p)+"\n"+
                  "emotional_stability negative "+Integer.toString(emotional_stability_n)+"\n"+
                  "conscientious positive "+Integer.toString(con_p)+"\n"+
                  "conscientious negative "+Integer.toString(con_n)+"\n"+
                  "education positive "+Integer.toString(education));
          fa.close();
            
}
}
