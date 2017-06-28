/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package researchbehaviour;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



/**
 *
 * @author THAMARA ATHAUDA
 */
public class StaticComparision {
   
    public int  searchWord(String i){
    
    int count = 0,countBuffer=0,countLine=0;
    String lineNumber = "";
    String filePath = "xml.txt";
    BufferedReader br;
    String inputSearch = i;
    String line = "";

    try {
        br = new BufferedReader(new FileReader(filePath));
        try {
            while((line = br.readLine()) != null)
            {
                countLine++;
                //System.out.println(line);
                String[] words = line.split(" ");

                for (String word : words) {
                  if (word.equals(inputSearch)) {
                    count++;
                    countBuffer++;
                  }
                }

                if(countBuffer > 0)
                {
                    countBuffer = 0;
                    lineNumber += countLine + ",";
                }

            }
            br.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    } catch (FileNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }

//    System.out.println("Times found at--"+count);
//   System.out.println("Word found at--"+lineNumber);
    return count;
}
    
    
    public void printpersonst() throws IOException
{
    
  baseAlgo BA = new baseAlgo();  
   ////
  
   FileWriter fa =null;
        
          
           int emotional_stability_p1 = BA.printlistemo();
           int openness_p1 = BA.printlistope();
           int extraversion_p1 = BA.printlistExt();
           int agrreableness_p1 = BA.printlistagr();
           int con_p1 = BA.printlistcon();
           int education = BA.printlistEdu();
           
           
            fa = new FileWriter(new File("staticcomparisoncount.txt"));       
       
            fa.write("agreeableness positive "+Integer.toString(agrreableness_p1)+"\n"+"extraversion positive "+Integer.toString(extraversion_p1)+"\n"+"openness positive "+Integer.toString(openness_p1)+"\n"+"emotional_stability positive "+Integer.toString(emotional_stability_p1)+"\n"+"conscientious positive "+Integer.toString(con_p1)+"\n"+"education positive "+Integer.toString(education));
            fa.close();
            
}
}


