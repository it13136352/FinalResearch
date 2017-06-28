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
import java.util.ArrayList;

/**
 *
 * @author ARUNI PC
 */
public class ChangeValues {
     
    
//    public String selected_fil1()
//     {
//         String n ="c:/owl/dataowl.owl" ;
//         
//         return n;
//         
//     }
    
    public ArrayList<Double> changedCutOff() throws FileNotFoundException, IOException
    {
        ArrayList<Double> updateVal =new  ArrayList<Double>();
        
         FileReader reader = new  FileReader("update.txt");
         BufferedReader br = new  BufferedReader(reader);
         String line;
         double agree_u=0;
         double ext_u=0;
         double emo_u=0;
         double con_u=0;
         double ope_u=0;
         
        while((line = br.readLine()) != null)
{ 
    if(line.charAt(0)=='A'){
 
        String agree_u1;
        agree_u1 = line.substring(1,6);
        agree_u= Double.parseDouble(agree_u1);
        
    }
    else if(line.charAt(0)=='E'){
 
        String ext_u1;
        ext_u1 = line.substring(1,6);
        ext_u= Double.parseDouble(ext_u1);
        
    }
     else if(line.charAt(0)=='C'){
 
        String con_u1;
        con_u1 = line.substring(1,6);
        con_u= Double.parseDouble(con_u1);
        
    }
     else if(line.charAt(0)=='N'){
 
        String emo_u1;
        emo_u1 = line.substring(1,6);
        emo_u= Double.parseDouble(emo_u1);
        
    }
     else if(line.charAt(0)=='O'){
 
        String ope_u1;
        ope_u1 = line.substring(1,6);
        ope_u= Double.parseDouble(ope_u1);
        
    }
    }
      updateVal.add(0, agree_u);
      updateVal.add(1, ext_u);
      updateVal.add(2, ope_u);
      updateVal.add(3, emo_u);
      updateVal.add(4, con_u);
      
    //  System.out.println(updateVal);
    
        return updateVal;
    }
    
// public String selected_fill()
//     {
//         String S = null;
//         Behavour bbb = new Behavour();
//         String getse= bbb.get_selected();
//        if (getse=="Prabath Lakmal Rupasinghe _ LinkedIn")
//        {
//           S= "dataowl.owl";
//        }
//        else if(getse=="Namal Rajapaksa (@RajapaksaNamal) _ Twitter")
//        {
//           S= "dataowl1.owl";
//        }
//        
//       return S;   
//     }
    
}
