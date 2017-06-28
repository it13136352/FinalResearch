/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package researchbehaviour;

import com.itextpdf.text.Document;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.*;

public class TextToPDF{

  public void convertToPdf()
  {
  try{
       FileReader f=new FileReader("data2.txt");
       BufferedReader bin= new BufferedReader(f);
     
        String text=bin.readLine();
        Document document = new Document(PageSize.A4, 36, 72, 108, 180);
        PdfWriter.getInstance(document,new FileOutputStream("pdfFile1.pdf"));
        document.open();
        document.add(new Paragraph(text));
        System.out.println("Text is inserted into pdf file");
        document.close();
    }catch(Exception e){}
  }
}
