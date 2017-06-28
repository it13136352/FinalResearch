package researchbehaviour;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import opennlp.tools.namefind.NameFinderME;
import opennlp.tools.namefind.NameSample;
import opennlp.tools.namefind.NameSampleDataStream;
import opennlp.tools.namefind.TokenNameFinderModel;
import opennlp.tools.sentdetect.SentenceDetectorME;
import opennlp.tools.sentdetect.SentenceModel;
import opennlp.tools.tokenize.Tokenizer;
import opennlp.tools.tokenize.TokenizerME;
import opennlp.tools.tokenize.TokenizerModel;
import opennlp.tools.util.InvalidFormatException;
import opennlp.tools.util.ObjectStream;
import opennlp.tools.util.PlainTextByLineStream;
import opennlp.tools.util.Span;
import opennlp.tools.util.featuregen.AdaptiveFeatureGenerator;

/**
 *
 * @author Sithum Sandaruwan
 */

public class OpenNLPEntityExtractor {

	static String read;
	static String read1;
        static String read2;
        static String read3;
        
	static String extract;
        static String extract1;
        static String extract2;
        static String extract3;
	
	
	static String[] finds;
        static String[] finds1;
        static String[] finds2;
        static String[] finds3;

	
	
	/**
	 * 
	 * @param inputStr
	 *            Input String from which entity(or key value pair) to be
	 *            extracted
	 */
	public void getEntities(String inputStr) throws IOException {
		HashMap<String, String> entityMap = new HashMap<String, String>();

		// Loading name finder model into memory from disk
		InputStream modelIn = null;
		try {
			modelIn = new FileInputStream(
					"resources/customModels/nameModel1.bin");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		TokenNameFinderModel model = null;
		try {
			model = new TokenNameFinderModel(modelIn);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (modelIn != null) {
				try {
					modelIn.close();
				} catch (IOException e) {
				}
			}
		}

		// After the model is loaded the NameFinderME is instantiated.
		NameFinderME nameFinder = new NameFinderME(model);

		// extract entity using the loaded model
		String tokens[] = stringTokenizer(inputStr);
		Span nameSpans[] = nameFinder.find(tokens);

		displayEntity(nameSpans, tokens);

	}
             public void getEntities1(String inputStr) throws IOException {
		HashMap<String, String> entityMap = new HashMap<String, String>();

		// Loading name finder model into memory from disk
		InputStream modelIn = null;
		try {
			modelIn = new FileInputStream(
					"resources/customModels/nameModel12.bin");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		TokenNameFinderModel model = null;
		try {
			model = new TokenNameFinderModel(modelIn);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (modelIn != null) {
				try {
					modelIn.close();
				} catch (IOException e) {
				}
			}
		}

		// After the model is loaded the NameFinderME is instantiated.
		NameFinderME nameFinder = new NameFinderME(model);

		// extract entity using the loaded model
		String tokens[] = stringTokenizer(inputStr);
		Span nameSpans[] = nameFinder.find(tokens);

		displayEntity1(nameSpans, tokens);

	}
                     public void getEntities2(String inputStr) throws IOException {
		HashMap<String, String> entityMap = new HashMap<String, String>();

		// Loading name finder model into memory from disk
		InputStream modelIn = null;
		try {
			modelIn = new FileInputStream(
					"resources/customModels/nameModel123.bin");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		TokenNameFinderModel model = null;
		try {
			model = new TokenNameFinderModel(modelIn);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (modelIn != null) {
				try {
					modelIn.close();
				} catch (IOException e) {
				}
			}
		}

		// After the model is loaded the NameFinderME is instantiated.
		NameFinderME nameFinder = new NameFinderME(model);

		// extract entity using the loaded model
		String tokens[] = stringTokenizer(inputStr);
		Span nameSpans[] = nameFinder.find(tokens);

		displayEntity2(nameSpans, tokens);

	}
            public void getEntities3(String inputStr) throws IOException {
		HashMap<String, String> entityMap = new HashMap<String, String>();

		// Loading name finder model into memory from disk
		InputStream modelIn = null;
		try {
			modelIn = new FileInputStream(
					"resources/customModels/nameModel1234.bin");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		TokenNameFinderModel model = null;
		try {
			model = new TokenNameFinderModel(modelIn);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (modelIn != null) {
				try {
					modelIn.close();
				} catch (IOException e) {
				}
			}
		}

		// After the model is loaded the NameFinderME is instantiated.
		NameFinderME nameFinder = new NameFinderME(model);

		// extract entity using the loaded model
		String tokens[] = stringTokenizer(inputStr);
		Span nameSpans[] = nameFinder.find(tokens);

		displayEntity3(nameSpans, tokens);

	}
        
	/**
	 * 
	 * @param inputStr
	 *            String to be tokenized using pre-trained tokenizer model
	 * @return token array
	 */
	public String[] stringTokenizer(String inputStr) {
		InputStream is = null;
		try {
			is = new FileInputStream("resources/defaultModels/en-token.bin");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		TokenizerModel model = null;
		try {
			model = new TokenizerModel(is);
                        
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		Tokenizer tokenizer = new TokenizerME(model);

		String tokens[] = tokenizer.tokenize(inputStr);
                //System.out.println(tokens);
		try {
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return tokens;
                
	}

	/**
	 * Use below to create and train a fresh openNLP model
	 */
	public void trainModel( ArrayList<String> filename) throws IOException {
            filename = new  ArrayList<String>();
                filename = readFile();
                System.out.println(filename);
                  
		String destDir = "resources/customModels";
             String taggedSent=null;
             String taggedSent1=null;
             String taggedSent2=null;
             String taggedSent3=null;

             for(int i=0;i<filename.size();i++){
          String  fileNamex = filename.get(i);
           File outFile;
           FileOutputStream outFileStream = null;
	 if( fileNamex.equals("resources/customModels/EduExPo.txt"))
         {
		taggedSent = read;
                ObjectStream<NameSample> nss = new NameSampleDataStream(
				(ObjectStream<String>) new PlainTextByLineStream(
						new StringReader(taggedSent)));
                TokenNameFinderModel model = null;
                
                model = NameFinderME.train("en", "default", nss,
					(AdaptiveFeatureGenerator) null,
					Collections.<String, Object> emptyMap(), 70, 0);
                outFile = new File(destDir, "nameModel1.bin");
                
                try {
			outFileStream = new FileOutputStream(outFile);
                        model.serialize(outFileStream);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
         }
         else if( fileNamex.equals("resources/customModels/AgPoAgNeExNe.txt"))
         {
                taggedSent1=read1;
                 ObjectStream<NameSample> nss1 = new NameSampleDataStream(
				(ObjectStream<String>) new PlainTextByLineStream(
						new StringReader(taggedSent1)));
                TokenNameFinderModel model1 = null;
                 model1 = NameFinderME.train("en", "default", nss1,
					(AdaptiveFeatureGenerator) null,
					Collections.<String, Object> emptyMap(), 70, 0);
                 outFile = new File(destDir, "nameModel12.bin");  
                 try {
			outFileStream = new FileOutputStream(outFile);
                         model1.serialize(outFileStream);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
         }
                 
         else if( fileNamex.equals("resources/customModels/EmoNeEmoPoConPo.txt"))
         {
                taggedSent2=read2;
                 ObjectStream<NameSample> nss2 = new NameSampleDataStream(
				(ObjectStream<String>) new PlainTextByLineStream(
						new StringReader(taggedSent2)));
                TokenNameFinderModel model2 = null;
                 model2 = NameFinderME.train("en", "default", nss2,
					(AdaptiveFeatureGenerator) null,
					Collections.<String, Object> emptyMap(), 70, 0);
                 outFile = new File(destDir, "nameModel123.bin");  
                 try {
			outFileStream = new FileOutputStream(outFile);
                         model2.serialize(outFileStream);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
                
         } 
          else if( fileNamex.equals("resources/customModels/OpNeConNeOpPo.txt"))
         {
                taggedSent3=read3;
                 ObjectStream<NameSample> nss3 = new NameSampleDataStream(
				(ObjectStream<String>) new PlainTextByLineStream(
						new StringReader(taggedSent3)));
                TokenNameFinderModel model3 = null;
                 model3 = NameFinderME.train("en", "default", nss3,
					(AdaptiveFeatureGenerator) null,
					Collections.<String, Object> emptyMap(), 70, 0);
                 outFile = new File(destDir, "nameModel1234.bin");  
                 try {
			outFileStream = new FileOutputStream(outFile);
                         model3.serialize(outFileStream);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
                
         }
         
         else
                {
                        System.out.println("error");
                        }
               
         
             }
       		
               
		
            
	}

	/**
	 * 
	 * @param nameSpans
	 *            entity extracted name span array
	 * @param sentence
	 *            token array of the input String
	 */
	private static void displayEntity(Span[] nameSpans, String[] sentence) throws IOException {
               
        File fout = new File("outonto.txt");
	FileOutputStream fos = new FileOutputStream(fout);
 
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
		finds = new String[nameSpans.length];
                
		for (int si = 0; si < nameSpans.length; si++) {
			StringBuilder cb = new StringBuilder();
			for (int ti = nameSpans[si].getStart(); ti < nameSpans[si].getEnd(); ti++) {
				cb.append(sentence[ti]).append(" ");
			}
                         String aaa = cb.substring(0, cb.length() - 1);
                         String bbb =nameSpans[si].getType();
                        bw.write(aaa+" "+bbb);
	        	bw.newLine();

			// System.out.println(cb.substring(0, cb.length() - 1) + " : "
			//		+ nameSpans[si].getType());
			 finds[si] = cb.substring(0, cb.length() - 1);
		}

		bw.close();       
	}
        //////////3
       private static void displayEntity1(Span[] nameSpans, String[] sentence) throws IOException {
               
        File fout = new File("outonto1.txt");
	FileOutputStream fos = new FileOutputStream(fout);
 
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
		finds1 = new String[nameSpans.length];
                
		for (int si = 0; si < nameSpans.length; si++) {
			StringBuilder cb = new StringBuilder();
			for (int ti = nameSpans[si].getStart(); ti < nameSpans[si].getEnd(); ti++) {
				cb.append(sentence[ti]).append(" ");
			}
                         String aaa = cb.substring(0, cb.length() - 1);
                         String bbb =nameSpans[si].getType();
                        bw.write(aaa+" "+bbb);
	        	bw.newLine();

			// System.out.println(cb.substring(0, cb.length() - 1) + " : "
			//		+ nameSpans[si].getType());
			 finds1[si] = cb.substring(0, cb.length() - 1);
		}

		bw.close();                     
	}
       
        private static void displayEntity2(Span[] nameSpans, String[] sentence) throws IOException {
               
        File fout = new File("outonto2.txt");
	FileOutputStream fos = new FileOutputStream(fout);
 
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
		finds2 = new String[nameSpans.length];
                
		for (int si = 0; si < nameSpans.length; si++) {
			StringBuilder cb = new StringBuilder();
			for (int ti = nameSpans[si].getStart(); ti < nameSpans[si].getEnd(); ti++) {
				cb.append(sentence[ti]).append(" ");
			}
                         String aaa = cb.substring(0, cb.length() - 1);
                         String bbb =nameSpans[si].getType();
                        bw.write(aaa+" "+bbb);
	        	bw.newLine();

			// System.out.println(cb.substring(0, cb.length() - 1) + " : "
			//		+ nameSpans[si].getType());
			 finds2[si] = cb.substring(0, cb.length() - 1);
			
		}

		bw.close();
                      
	}
        
        private static void displayEntity3(Span[] nameSpans, String[] sentence) throws IOException {
               
        File fout = new File("outonto3.txt");
	FileOutputStream fos = new FileOutputStream(fout);
 
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
		finds3 = new String[nameSpans.length];
                
		for (int si = 0; si < nameSpans.length; si++) {
			StringBuilder cb = new StringBuilder();
			for (int ti = nameSpans[si].getStart(); ti < nameSpans[si].getEnd(); ti++) {
				cb.append(sentence[ti]).append(" ");
			}
                         String aaa = cb.substring(0, cb.length() - 1);
                         String bbb =nameSpans[si].getType();
                        bw.write(aaa+" "+bbb);
	        	bw.newLine();

			// System.out.println(cb.substring(0, cb.length() - 1) + " : "
			//		+ nameSpans[si].getType());
			 finds3[si] = cb.substring(0, cb.length() - 1);
			
		}

		bw.close();
                      
	}
        ////////3
	
	
	public   ArrayList<String> readFile(){
	 ArrayList<String> Ag =new ArrayList<String>();	
		// The name of the file to open.
       
       String fileName = "resources/customModels/AgPoAgNeExNe.txt";
       String fileName1 = "resources/customModels/EduExPo.txt";
       String fileName2 = "resources/customModels/EmoNeEmoPoConPo.txt";
       String fileName3 = "resources/customModels/OpNeConNeOpPo.txt";
         Ag.add(0,fileName); 
         Ag.add(1,fileName1);
         Ag.add(2,fileName2);
         Ag.add(3,fileName3);
       
        
        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
          for(int i=0;i<Ag.size();i++){
          String  fileNamex = Ag.get(i);
            FileReader fileReader = 
                new FileReader( fileNamex);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);
            
            StringBuilder sb = new StringBuilder();

            while((line = bufferedReader.readLine()) != null) {
               
            	sb.append(line.trim());
                
               if(fileNamex.equals("resources/customModels/EduExPo.txt")){
            	read = sb.toString();
               }
               else if(fileNamex.equals("resources/customModels/AgPoAgNeExNe.txt"))
               {
                read1 = sb.toString();   
               }
               else if(fileNamex.equals("resources/customModels/EmoNeEmoPoConPo.txt"))
               {
                read2 = sb.toString();   
               }
                else if(fileNamex.equals("resources/customModels/OpNeConNeOpPo.txt"))
               {
                read3 = sb.toString();   
               }
               else
                {
                        System.out.println("error");
                        }
               
            }   

            // Always close files.
            bufferedReader.close();   
            }
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
            return Ag;
        	
		
	}
	
	public static void SentenceDetect() throws InvalidFormatException,
	IOException {
		
		String paragraph = extract.toString();
		
		
		// always start with a model, a model is learned from training data
		InputStream is = new FileInputStream("en-sent.zip");
		SentenceModel model = new SentenceModel(is);
		SentenceDetectorME sdetector = new SentenceDetectorME(model);

		String sentences[] = sdetector.sentDetect(paragraph);

		//System.out.println(sentences[0]);
		//System.out.println(sentences[1]);
		
		int index;
		
		
		for (String sent : sentences) {
			
			//System.out.println(sent);
			for ( int i =0 ; i <finds.length ; i++){
				index = sent.indexOf(finds[i]);
			
				if( index == -1)
				{
					//System.out.println("Not Found");
				}
				else{
					//System.out.println(sent);
				}
			}
			
			
		}
		
		
		is.close();
		
	}
        /////////////2
         public static void SentenceDetect1() throws InvalidFormatException,
	IOException {
		
		String paragraph = extract1.toString();
		
		
		// always start with a model, a model is learned from training data
		InputStream is = new FileInputStream("en-sent.zip");
		SentenceModel model = new SentenceModel(is);
		SentenceDetectorME sdetector = new SentenceDetectorME(model);

		String sentences[] = sdetector.sentDetect(paragraph);

		//System.out.println(sentences[0]);
		//System.out.println(sentences[1]);
		
		int index;
		
		
		for (String sent : sentences) {
			
			//System.out.println(sent);
			for ( int i =0 ; i <finds1.length ; i++){
				index = sent.indexOf(finds1[i]);
			
				if( index == -1)
				{
					System.out.println("Not Found");
				}
				else{
					System.out.println(sent);
				}
			}
			
			
		}
		
		
		is.close();
		
	}
         
          public static void SentenceDetect2() throws InvalidFormatException,
	IOException {
		
		String paragraph = extract2.toString();
		
		
		// always start with a model, a model is learned from training data
		InputStream is = new FileInputStream("en-sent.zip");
		SentenceModel model = new SentenceModel(is);
		SentenceDetectorME sdetector = new SentenceDetectorME(model);

		String sentences[] = sdetector.sentDetect(paragraph);

		//System.out.println(sentences[0]);
		//System.out.println(sentences[1]);
		
		int index;
		
		
		for (String sent : sentences) {
			
			//System.out.println(sent);
			for ( int i =0 ; i <finds2.length ; i++){
				index = sent.indexOf(finds2[i]);
			
				if( index == -1)
				{
					System.out.println("Not Found");
				}
				else{
					System.out.println(sent);
				}
			}
			
			
		}
		
		
		is.close();
		
	}
        public static void SentenceDetect3() throws InvalidFormatException,
	IOException {
		
		String paragraph = extract3.toString();
		
		
		// always start with a model, a model is learned from training data
		InputStream is = new FileInputStream("en-sent.zip");
		SentenceModel model = new SentenceModel(is);
		SentenceDetectorME sdetector = new SentenceDetectorME(model);

		String sentences[] = sdetector.sentDetect(paragraph);

		//System.out.println(sentences[0]);
		//System.out.println(sentences[1]);
		
		int index;
		
		
		for (String sent : sentences) {
			
			//System.out.println(sent);
			for ( int i =0 ; i <finds3.length ; i++){
				index = sent.indexOf(finds3[i]);
			
				if( index == -1)
				{
					System.out.println("Not Found");
				}
				else{
					System.out.println(sent);
				}
			}
			
			
		}
		
		
		is.close();
		
	}
        
        ///////////2
        
	
	
	public static void print(){
		
		for(int i = 0 ; i < finds.length ; i++ )
		{
			System.out.println(finds[i]);
		}
		
	}
	
	

}
