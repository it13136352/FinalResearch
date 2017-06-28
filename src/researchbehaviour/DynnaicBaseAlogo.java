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
 * @author THAMARA ATHAUDA
 */
public class DynnaicBaseAlogo {
 DynnamicComparision test =new DynnamicComparision();  
 DynnamicQueryOut qo = new DynnamicQueryOut();

 ArrayList<String> outalopep = new ArrayList<String>();
 ArrayList<String> outalopen = new ArrayList<String>();
 ArrayList<String> outalconp = new ArrayList<String>();
 ArrayList<String> outalconn = new ArrayList<String>();
 ArrayList<String> outalemop = new ArrayList<String>();
 ArrayList<String> outalemon = new ArrayList<String>();
 ArrayList<String> outalagrp = new ArrayList<String>();
 ArrayList<String> outalagrn = new ArrayList<String>();
 ArrayList<String> outalExtp = new ArrayList<String>();
 ArrayList<String> outalExtn = new ArrayList<String>();
 ArrayList<String> outalEdu = new ArrayList<String>();
 
 String inputSearch = null;
 
 public int printlistEduDy() throws IOException
 {
        outalEdu = qo.EdD();
        int totalcountEdu;
        totalcountEdu = outalEdu.size();
        return totalcountEdu;
 }
 
 
 
 public int printlistExptDyp() throws IOException
 {
        outalExtp = qo.ExpDp();
        int totalcountExtpDyp;
        totalcountExtpDyp = outalExtp.size();
        return totalcountExtpDyp;
 }
 
 public int printlistExtDyn() throws IOException
 {
        outalExtn = qo.ExpDn();
        int totalcountExtDyn;
        totalcountExtDyn = outalExtn.size();
        return totalcountExtDyn;
 }

  public int printlistopeDyp() throws IOException
 {
        outalopep = qo.OpDp(); 
        int totalcountopeDy;
        totalcountopeDy= outalopep.size();
        return totalcountopeDy;
 }
   public int printlistopeDyn() throws IOException
 {
        outalopen = qo.OpDn();
        int totalcountopeDy;
        totalcountopeDy= outalopen.size();
        return totalcountopeDy;
 }
 
  public int printlistconDyp() throws IOException
 {
        outalconp = qo.CoDp();
        int totalcountconDy;
        totalcountconDy= outalconp.size();
        return totalcountconDy;
 }
   public int printlistconDyn() throws IOException
 {
        outalconn = qo.CoDn();
        int totalcountconDy;
        totalcountconDy= outalconn.size();
        return totalcountconDy;
 }
 
  public int printlistemoDyp() throws IOException
 {
        outalemop = qo.EspDp();
        int totalcountemoDy;
        totalcountemoDy= outalemop.size();
        return totalcountemoDy;
      
 }
 
   public int printlistemoDyn() throws IOException
 {
        outalemon = qo.ExpDn();
        int totalcountemoDy;
        totalcountemoDy= outalemon.size();
        return totalcountemoDy;
      
 }
  
  public int printlistagrDyp() throws IOException
 {
        outalagrp = qo.AgDp();
        int totalcountagrDy = 0;
        totalcountagrDy= outalagrp.size();
        return totalcountagrDy;
 }
  
  public int printlistagrDyn() throws IOException
 {
        outalagrn = qo.AgDn();
        int totalcountagrDy = 0;
        totalcountagrDy= outalagrn.size();
        return totalcountagrDy;
 }
}
