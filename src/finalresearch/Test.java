/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalresearch;

/**
 *
 * @author Sithum Sandaruwan
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Test {
    
//one of main method  
public static void main(String[] args) throws IOException
{
  StaticQueryOut qo = new StaticQueryOut();
            ArrayList<String> al1 = new ArrayList<String>();
            ArrayList<String> al2 = new ArrayList<String>();
            ArrayList<String> al3 = new ArrayList<String>();
            ArrayList<String> al4 = new ArrayList<String>();
            ArrayList<String> al5 = new ArrayList<String>();
            ArrayList<String> al6 = new ArrayList<String>();
           
            al1=qo.Esp();
            al2=qo.Ag();
            al3 =qo.Co();
            al4 =qo.Exp();
            al5=qo.Op();
            al6=qo.Ed();
     

//System.out.println("array list" +al1);
//System.out.println("array list agr" +al2);
//System.out.println("Ext ops "+ BA.printlistcon());
}



}