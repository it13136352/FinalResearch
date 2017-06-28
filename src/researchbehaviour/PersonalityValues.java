/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package researchbehaviour;

import java.io.IOException;
import static java.lang.Double.NaN;

/**
 *
 * @author ARUNI PC
 */
public class PersonalityValues {
   
    
    
    Dyanamicqueryvalues dcv = new Dyanamicqueryvalues();
    Staticqueryvalues aqv  = new Staticqueryvalues();
    
    double p;
    double q;
    public double convalue() throws IOException
    {
        p=dcv.conscientiousValuesD();
        q=aqv.conscientiousValuesS();
         if(Double.isNaN(p))
        {
         p=0;   
        }
        if(Double.isNaN(q))
        {
            q=0;
        }
        double conv = (p+q)/2;
        return conv;
       
        
    }
    public double agrvalue() throws IOException
    {
       
         p=dcv.agreeablenessValuesD();
         q=aqv.agreeablenessValuesS();
         if(Double.isNaN(p))
        {
         p=0;   
        }
        if(Double.isNaN(q))
        {
            q=0;
        }
        double agr = (p+q)/2;
        return agr;
        
    }
    public double emovalue() throws IOException
    {
       
         p=dcv.emotional_stabilityValuesD();
         q=aqv.emotional_stabilityValuesS();
         if(Double.isNaN(p))
        {
         p=0;   
        }
        if(Double.isNaN(q))
        {
            q=0;
        }
        double emo = (p+q)/2;
        return emo;
        
        
    }
    public double extvalue() throws IOException
    {
       
         p=dcv.extraversionValuesD();
         q=aqv.extraversionValuesS();
         if(Double.isNaN(p))
        {
         p=0;   
        }
        if(Double.isNaN(q))
        {
            q=0;
        }
        double ext = (p+q)/2;
        return ext;
        
    }
    public double opevalue() throws IOException
    {
       
         p=dcv.opennessValuesD();
         q=aqv.opennessValuesS();
         if(Double.isNaN(p))
        {
         p=0;   
        }
        if(Double.isNaN(q))
        {
            q=0;
        }
        double ope = (p+q)/2;
        return ope;
        
    }
    public double eduvalue() throws IOException
    {
       
         p =dcv.educationValuesD();
         q = aqv.educationValuesS();
        if(Double.isNaN(p))
        {
         p=0;   
        }
        if(Double.isNaN(q))
        {
            q=0;
        }

        double edu=(p+q)/2;
        return edu;
        
    }
    
}
