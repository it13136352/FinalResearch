

package researchbehaviour;
import java.io.*;
/**
 *
 * @author THAMARA ATHAUDA
 */
public class readtxt {

//    void rea(String[] fileArray) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    void readFile(String[] fileArray) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    void fileread(String[] fileArray) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
//public class FileRead 
//{
public void readFile(String[] args) {
for (String textfile : args) {

try{
      // Open the file that is the first 
      // command line parameter
      FileInputStream fstream = new FileInputStream(textfile);
      // Get the object of DataInputStream
      DataInputStream in = new DataInputStream(fstream);
      BufferedReader br = new BufferedReader(new InputStreamReader(in));
      String strLine;
      //Read File Line By Line
      while ((strLine = br.readLine()) != null)   {
      // Print the content on the console
      System.out.println (strLine);

    // Write to the new file
      FileWriter filestream = new FileWriter("all.txt",true);
      BufferedWriter out = new BufferedWriter(filestream);
      out.write(strLine +" \n");
      //Close the output stream
      out.close();

      }
      //Close the input stream
      in.close();
        }catch (Exception e){//Catch exception if any
      //System.err.println("Error: " + e.getMessage());
      }
}
}

public  void clearTheFile() throws IOException {
        FileWriter fwOb = new FileWriter("all.txt", false); 
        PrintWriter pwOb = new PrintWriter(fwOb, false);
        pwOb.flush();
        pwOb.close();
        fwOb.close();
    }

}
    
//}
