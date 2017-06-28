
package researchbehaviour;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.BreakIterator;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sithum Sandaruwan
 */
public class dividSentence {

   public String  sentence(String fileName, String paragraph) throws FileNotFoundException {
        String applicantName=null;
        FileWriter fw = null;
        try {
            fw = new FileWriter(new File(fileName));

            //remove unwanted lines
            
            BreakIterator iterator = BreakIterator.getSentenceInstance(Locale.ENGLISH);
            iterator.setText(paragraph);
            int start = iterator.first();
            int i = 1;
            for (int end = iterator.next(); end != BreakIterator.DONE; start = end, end = iterator.next()) {
                if (i < 2 || i > 17) {

                    String sentence = "<Sentence" + i + ">" + paragraph.substring(start, end) + "</Sentence" + i + ">";
                    fw.write(sentence + "\n");
                    
                    if(i==1){
                         String[] partsname = paragraph.split(" ");
                        applicantName =partsname[0]+" "+partsname[1];
                      applicantName=paragraph.substring(0, 2);
                      System.out.println( applicantName);
                    }
                }
                i++;
            }
        } catch (IOException ex) {
            Logger.getLogger(dividSentence.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(dividSentence.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       return applicantName;
    }
}
