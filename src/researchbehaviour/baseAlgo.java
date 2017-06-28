/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package researchbehaviour;


import java.io.IOException;
import java.util.ArrayList;


/**
 *
 * @author Sithum Sandaruwan
 */

public class baseAlgo {
    
  StaticComparision test =new StaticComparision();  
 StaticQueryOut qo = new StaticQueryOut();

 ArrayList<String> outalope = new ArrayList<String>();
 ArrayList<String> outalcon = new ArrayList<String>();
 ArrayList<String> outalemo = new ArrayList<String>();
 ArrayList<String> outalagr = new ArrayList<String>();
 ArrayList<String> outalExt = new ArrayList<String>();
 ArrayList<String> outalEdu = new ArrayList<String>();
 
 String inputSearch = null;
 
 public int printlistEdu() throws IOException
 {
       outalEdu = qo.Ed();
       int totalcountEdu = 0;
   
    int sizeoutalEdu= outalEdu.size();
 
    for(int i=0;i<sizeoutalEdu;i++)
    {
        String outalEduIndex = outalEdu.get(i);
     
      int countEdu=  test.searchWord(outalEduIndex);
      totalcountEdu=totalcountEdu+countEdu;
   
    }
      return totalcountEdu;
 }
 
 
 
 public int printlistExt() throws IOException
 {
       outalExt = qo.Exp();
       int totalcountExt = 0;
   
 
    
    int sizeoutalExt= outalExt.size();
 
    for(int i=0;i<sizeoutalExt;i++)
    {
        String outalExtIndex = outalExt.get(i);
     
      int countExt=  test.searchWord(outalExtIndex);
      totalcountExt=totalcountExt+countExt;
   
    }
      return totalcountExt;
 }

  public int printlistope() throws IOException
 {
       int totalcountope = 0;
    outalope = qo.Op(); 
  
    
    int sizeoutalope= outalope.size();

    for(int i=0;i<sizeoutalope;i++)
    {
        String outalopeIndex = outalope.get(i);
  
      int countope=  test.searchWord(outalopeIndex);
      totalcountope=totalcountope+countope;
       
       
    }
      return totalcountope;
 }
 
  public int printlistcon() throws IOException
 {
       int totalcountcon = 0;
    outalcon = qo.Co(); 
  
    
    int sizeoutal1= outalcon.size();

    for(int i=0;i<sizeoutal1;i++)
    {
        String outal1conIndex = outalcon.get(i);
   
      int countcon=  test.searchWord(outal1conIndex);
      totalcountcon=totalcountcon+countcon;
      
     
       
    }
      return totalcountcon;
 }
 
  public int printlistemo() throws IOException
 {
       int totalcountemo = 0;
    outalemo = qo.Esp(); 

    
    int sizeoutal1= outalemo.size();
 
    for(int i=0;i<sizeoutal1;i++)
    {
        String outal1emoIndex = outalemo.get(i);
    
      int countemo=  test.searchWord(outal1emoIndex);
      totalcountemo=totalcountemo+countemo;
     // System.out.println(totalcountemo);
  
       
    }
      return totalcountemo;
      
 }
 
  
  public int printlistagr() throws IOException
 {
       int totalcountagr = 0;
    outalagr = qo.Ag(); 
  
    
    int sizeoutalagr= outalagr.size();
  
    for(int i=0;i<sizeoutalagr;i++)
    {
        String outal1agrIndex = outalagr.get(i);
     
      int countagr=  test.searchWord(outal1agrIndex);
      totalcountagr=totalcountagr+countagr;
      
     
       
    }
      return totalcountagr;
 }
 
 ///////////////////////////base algo////////////

//     static int count1 = 0 ;
//     static int count2 = 0 ;
// 
//     static String arrayLines1[] = new String[countLines("xml.txt")];
//     static String arrayLines2[] = new String[countLines("data44.txt")];
//     
//
//      
//     public static int countLines(String File){
//          
//         int lineCount = 0;
//         try {
//            BufferedReader br = new BufferedReader(new FileReader(File));
//            while ((br.readLine()) != null) {
//                lineCount++;
//            }
//             
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//            return lineCount;
//     }
      
//     public static void findDifference(String File1, String File2){
//         String contents1 = null;  
//         String contents2 = null; 
//         try  
//         {  
//             FileReader file1 = new FileReader(File1);  
//             FileReader file2 = new FileReader(File2);
//             BufferedReader buf1 = new BufferedReader(file1); 
//             BufferedReader buf2 = new BufferedReader(file2);
//            
//            while ((contents1 = buf1.readLine()) != null)  
//             {  
//                arrayLines1[count1] = contents1 ;
//                count1++;
//             }  
//           
//            while ((contents2 = buf2.readLine()) != null)  
//             {  
//                arrayLines2[count2] = contents2 ;
//                count2++;
//             }
//        }catch (Exception e){
//            e.printStackTrace();
//        }
// }

}

