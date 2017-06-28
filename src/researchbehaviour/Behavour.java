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
import javax.swing.JFileChooser;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import opennlp.tools.util.InvalidFormatException;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;
import static researchbehaviour.OpenNLPEntityExtractor.SentenceDetect;
import static researchbehaviour.OpenNLPEntityExtractor.SentenceDetect1;
import static researchbehaviour.OpenNLPEntityExtractor.SentenceDetect2;
import static researchbehaviour.OpenNLPEntityExtractor.SentenceDetect3;
import static researchbehaviour.OpenNLPEntityExtractor.extract;
import static researchbehaviour.OpenNLPEntityExtractor.extract1;
import static researchbehaviour.OpenNLPEntityExtractor.extract2;
import static researchbehaviour.OpenNLPEntityExtractor.extract3;

/**
 *
 * @author Sithum Sandaruwan
 */
public class Behavour extends javax.swing.JFrame {

    private final JFileChooser openFileChooser;

    public Behavour() {
        initComponents();
        openFileChooser = new JFileChooser();
        openFileChooser.setSelectedFile(new File("C:\\HTML"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("PREDICT THE BEHAVIOUR OF THE APPLICANT...");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(390, 60, 860, 40);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 51));
        jLabel4.setText("Browse LinkedIn / Twitter");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(30, 30, 260, 50);

        jButton2.setBackground(new java.awt.Color(153, 255, 153));
        jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButton2.setText("Browse");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(420, 130, 210, 50);

        jTextField1.setBackground(new java.awt.Color(204, 204, 255));
        jTextField1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jPanel2.add(jTextField1);
        jTextField1.setBounds(20, 130, 360, 40);

        jButton1.setBackground(new java.awt.Color(0, 204, 153));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButton1.setText("Analyze Person");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(420, 200, 210, 70);

        jButton3.setBackground(new java.awt.Color(204, 255, 255));
        jButton3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton3.setText("Change Default Values");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(920, 450, 210, 50);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ring-alt_1.gif"))); // NOI18N
        jPanel2.add(jLabel7);
        jLabel7.setBounds(930, 210, 230, 210);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/thumb.jpeg"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 10, 1140, 500);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(80, 200, 1160, 520);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cvelite.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(-30, 10, 370, 120);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/green-wallpaper-background-6.jpg"))); // NOI18N
        jLabel3.setText("PREDICT PERSONALITY OF THE APPLICANT");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 1370, 770);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1366, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String s = null;
        try {

            try {

                FileReader in = null;
                try {
                    String ww = jTextField1.getText();
                    in = new FileReader(ww);
                    Html2Text parser = new Html2Text();
                    parser.parse(in);
                    in.close();
                    FileWriter fw = new FileWriter(new File("data1.txt"));
                    s = parser.getText();
                    fw.write(parser.getText());
                    
                    ///////////  
                    
                    String haystack;
                    FileReader reader=new FileReader("data1.txt");
                    BufferedReader br=new BufferedReader(reader);
                    haystack=br.readLine();
        
        
                    String regex = "[0-9]";
                    String regex2 = "(([A-Z]*([a-z]*))[[-]||[:]||[.]||[#]||[{]||[}]||[!]||[>]||[,]||[;]||[(]||[)]||[=]||[///]||[_]||[~]||[\"]]([A-Z]*([a-z]*)))";
                    String regex3 = "(([A-Z]*([a-z]*))(Color)([A-Z]*([a-z]*)))";
                    String regex4 = "(([A-Z]*([a-z]*))(User)([A-Z]*([a-z]*)))";
                    String regex5 = "(px)";
                    String regex6 = "(li)";
                    //String regex4 = "((Color)||(li)||(px)||(User))";
                    String result = haystack.replaceAll(regex, "");
                    String result1 =result.replaceAll(regex2, "");
                    String result2 =result1.replaceAll(regex3, "");
                    String result3 =result2.replaceAll(regex4, "");
                    String result4 =result3.replaceAll(regex5, "");
                    String result5 =result4.replaceAll(regex6, "");
                    FileWriter fa = null;

                    fa=new FileWriter(new File("data2.txt"));
                    fa.write(result5);

                    //System.out.println("Result: " + result);
                    
                 
      
        
        
      
     
                    ////////////////////////     
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Behavour.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Behavour.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    try {
                        in.close();
                    } catch (IOException ex) {
                        Logger.getLogger(Behavour.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                TextToPDF tp = new TextToPDF();
                tp.convertToPdf();

                   /////train model
                  
                OpenNLPEntityExtractor openNLPEntityExtractor = new OpenNLPEntityExtractor();
                openNLPEntityExtractor.readFile();

                PDFManager pdfManager = new PDFManager();
                pdfManager.setFilePath("pdfFile1.pdf");

                extract = pdfManager.ToText();
                 extract1 = pdfManager.ToText();
                 extract2 = pdfManager.ToText();
                extract3 = pdfManager.ToText();

                // first create an train a model
                openNLPEntityExtractor.trainModel(openNLPEntityExtractor.readFile());

                // method to extract entity using trained model
                openNLPEntityExtractor
                        .getEntities(extract.toString());
                openNLPEntityExtractor
                        .getEntities1(extract1.toString());
                openNLPEntityExtractor
                       .getEntities2(extract2.toString());
                openNLPEntityExtractor
                       .getEntities3(extract3.toString());

                try {
                    SentenceDetect();
                    SentenceDetect1();
                    SentenceDetect2();
                    SentenceDetect3();
                } catch (InvalidFormatException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                ////////////////
            } catch (IOException ex) {
                Logger.getLogger(Behavour.class.getName()).log(Level.SEVERE, null, ex);
            }
          //////thamara  
            
            
            readtxt rt = new readtxt();
            rt.clearTheFile();
            
        readtxt myReader = new readtxt();
        String fileArray[] = {"outonto.txt", "outonto1.txt", "outonto2.txt", "outonto3.txt"};
        myReader.readFile(fileArray);
        ////////
            dividSentence di = new dividSentence();
            di.sentence("xml.txt", s);

            Research1 fr = new Research1();
            try {
                fr.dyanamicOnto();
            } catch (OWLOntologyStorageException ex) {
                Logger.getLogger(Behavour.class.getName()).log(Level.SEVERE, null, ex);
            } catch (OWLOntologyCreationException ex) {
                Logger.getLogger(Behavour.class.getName()).log(Level.SEVERE, null, ex);
            }
            ////
            StaticComparision cc = new StaticComparision();
            DynnamicComparision dd = new DynnamicComparision();
            createdynnamic cd = new createdynnamic();
            cd.createdynnamiconto();
            cc.printpersonst();
            dd.printpersonDy();
        } catch (IOException ex) {
            Logger.getLogger(Behavour.class.getName()).log(Level.SEVERE, null, ex);
        }
        ///last
        this.setVisible(false);
        new MainOutput().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        jTextField1.setText(filename);


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        try {
            this.setVisible(false);
            new ChangePanel().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Behavour.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Behavour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Behavour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Behavour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Behavour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Behavour().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
