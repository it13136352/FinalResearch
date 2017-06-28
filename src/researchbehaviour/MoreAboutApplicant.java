/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package researchbehaviour;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Sithum Sandaruwan
 */
public class MoreAboutApplicant extends javax.swing.JFrame {

  

    public MoreAboutApplicant() throws IOException {
        initComponents();
   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("APPLICANT STATUES");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 40, 590, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cvelite.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(950, 30, 380, 160);

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(910, 670, 210, 50);

        jButton4.setBackground(new java.awt.Color(0, 255, 255));
        jButton4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton4.setText("Back To Home");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(1140, 670, 210, 50);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 2));
        jPanel2.setLayout(null);

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 0, 51));
        jButton1.setText("VIEW MORE ABOUT APPLICANT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(510, 80, 270, 40);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setText("Applicant Name : ");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 20, 130, 20);

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jPanel2.add(jLabel7);
        jLabel7.setBounds(180, 24, 290, 20);

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jPanel2.add(jLabel8);
        jLabel8.setBounds(180, 90, 290, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/thumb.jpeg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(2, 2, 816, 136);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(30, 100, 820, 140);

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(30, 280, 820, 440);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/testnew.gif"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(890, 280, 450, 280);

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

        
        try {
            FileReader reader = new  FileReader("xml.txt");
            BufferedReader br = new  BufferedReader(reader);
            String line;
            line = br.readLine();
            String[] strArray = line.split(" ");
            String[] FName =strArray[0].split(">");
            String applicantName = FName[1]+" "+strArray[1];
            jLabel7.setText(applicantName);
            

            DefaultCategoryDataset dataset = new DefaultCategoryDataset( );
            String Default = "Default";
            String Applicant_Rate = "Applicant Rate";
            
            String openness = "Openness";
            String extraversion = "Extraversion";
            String emotional_stability = "Emotional stability";
            String conscientious = "Conscientious";
            String agreeableness = "Agreeableness";
            String Education = "Education";
            
            // BehaviourA be = new BehaviourA();
             PersonalityValues pv = new PersonalityValues();
            double agr = 0;
            double con = 0;
            double ext = 0;
            double emo = 0;
            double ope = 0;
            double edu = 0;
            
          
//                agr = be.agreeablenessPersentage();
//                con = be.conscientiousPersentage();
//                ext = be.extraversionPersentage();
//                emo = be.emotional_stabilityPersentage();
//                ope = be.opennessPersentage();
//                edu = be.educationPersentage();
//               
                agr = pv.agrvalue();
                con = pv.convalue();
                ext = pv.extvalue();
                emo = pv.emovalue();
                ope = pv.opevalue();
                edu = pv.eduvalue();
           
            
            dataset.addValue( ope , Applicant_Rate , openness );
            dataset.addValue( ext , Applicant_Rate , extraversion );
            dataset.addValue( emo , Applicant_Rate , emotional_stability );
            dataset.addValue( con , Applicant_Rate , conscientious );
            dataset.addValue( agr , Applicant_Rate , agreeableness );
            dataset.addValue( edu , Applicant_Rate , Education  );
            
         ChangeValues cvv =new ChangeValues();
   
         ArrayList<Double> updateVal1 =new  ArrayList<Double>();
         updateVal1= cvv.changedCutOff();
         
         
            
            dataset.addValue( updateVal1.get(2), Default , openness );
            dataset.addValue( updateVal1.get(1), Default , extraversion );
            dataset.addValue( updateVal1.get(3), Default , emotional_stability );
            dataset.addValue( updateVal1.get(4), Default , conscientious );
            dataset.addValue( updateVal1.get(0) , Default , agreeableness );
            dataset.addValue( 70 , Default ,Education );

            
            
            JFreeChart barChart = ChartFactory.createBarChart("APPLICANT STATUES",
                    "Personality factor",
                    "Persentage",
                    dataset,
                    PlotOrientation.VERTICAL,
                    true,true , true);
            CategoryPlot plot = (CategoryPlot) barChart.getPlot();
            plot.setDomainGridlinesVisible(true);
            
            ChartPanel chartPanel = new ChartPanel( barChart );
            chartPanel.setBounds(4,9,810,422);
            jPanel3.add(chartPanel);
            jPanel3.repaint();
        } catch (IOException ex) {
            Logger.getLogger(MoreAboutApplicant.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         this.setVisible(false);
         new MainOutput().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         this.setVisible(false);
         new Behavour().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed
  
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
            java.util.logging.Logger.getLogger(MoreAboutApplicant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MoreAboutApplicant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MoreAboutApplicant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MoreAboutApplicant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                try {
                    new MoreAboutApplicant().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(MoreAboutApplicant.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
