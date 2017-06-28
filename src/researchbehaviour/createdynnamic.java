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
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author THAMARA ATHAUDA
 */
public class createdynnamic {

        
        public void  createdynnamiconto() throws FileNotFoundException, UnsupportedEncodingException, IOException
        {

        FileReader reader = new FileReader("all.txt");
        BufferedReader br = new BufferedReader(reader);
        String linea;
        String category1 = null;
        String individual = null;

//        String l = null;
//        String m = null;
//        String n = null;
//        String o = null;
//        String p = null;
//        String q = null;
//        String r = null;
        String a = "<rdf:RDF";
        String b = "xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"";
        String c = "xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"";
        String d = "xmlns:foaf=\"http://xmlns.com/foaf/0.1/\"";
        String e = "xmlns:admin=\"http://webns.net/mvcb/\">";
        String f = "<foaf:PersonalProfileDocument rdf:about=\"\">";
        String g = "<foaf:maker rdf:resource=\"#me\"/>";
        String h = "<foaf:primaryTopic rdf:resource=\"#me\"/>";
        String i = "<admin:generatorAgent rdf:resource=\"http://www.ldodds.com/foaf/foaf-a-matic\"/>";
        String j = "<admin:errorReportsTo rdf:resource=\"mailto:leigh@ldodds.com\"/>";
        String k = "</foaf:PersonalProfileDocument>";

        try (PrintWriter out = new PrintWriter("dynnamic.owl", "UTF-8")) {

            String z = "</rdf:RDF>";

            out.write(a + "\n");
            out.write(b + "\n");
            out.write(c + "\n");
            out.write(d + "\n");
            out.write(e + "\n");
            out.write(f + "\n");
            out.write(g + "\n");
            out.write(h + "\n");
            out.write(i + "\n");
            out.write(j + "\n");
            out.write(k + "\n");

            while ((linea = br.readLine()) != null) {

                String[] dyanamicontowords = linea.split(" ");

                category1 = dyanamicontowords[1];
                individual = dyanamicontowords[0];
//        System.out.println(category1);
//        System.out.println(individual);
                
                String st = getCategory(category1);

                String l = "<foaf:" + category1 + " rdf:ID=\"me\">";
                String m = "\t<foaf:knows>";
                String n = "\t\t<foaf:" + category1 + ">";
                String o = "\t\t\t<foaf:"+st+">" + individual + "</foaf:"+st+">";
                String p = "\t\t</foaf:" + category1 + ">";
                String q = "\t</foaf:knows>";
                String r = "</foaf:" + category1 + ">";

                out.write(l + "\n");
                out.write(m + "\n");
                out.write(n + "\n");
                out.write(o + "\n");
                out.write(p + "\n");
                out.write(q + "\n");
                out.write(r + "\n");
            }

            out.write(z + "\n");

        }
    }

    
    private static String getCategory(String category) {
        String s;
        
        if (category.equals("Education"))
            s = "ed";
        else if (category.equals("Extraversion_positive"))
            s = "Exp";
        else if (category.equals("Extraversion_negative"))
            s = "Exn";
        else if (category.equals("Openness_positive"))
            s = "opp";
        else if (category.equals("Openness_negative"))
            s = "opn";
        else if (category.equals("Agreeableness_negative"))
            s = "agn";
        else if (category.equals("Agreeableness_positive"))
            s = "agp";
        else if (category.equals("Conscientious_positive"))
            s = "ccp";
        else if (category.equals("Conscientious_negative"))
            s = "ccn";
        else if (category.equals("EmotionalStability_negative"))
            s = "emn";
        else if (category.equals("EmotionalStability_positive"))
            s = "emp";
//        else if (category.equals("Emotional_Stability"))
//            s = "Ex";
        else
            s = "TODO";
        
        return s;
    }
}

