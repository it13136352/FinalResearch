/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package researchbehaviour;

import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
//import static query.query.displayRecords;
//import static query.Query.findDifference;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author Sithum Sandaruwan
 */
public class AdminPanel extends javax.swing.JFrame {

    private final JFileChooser openFileChooser;

    public AdminPanel() {
        initComponents();
        openFileChooser = new JFileChooser();
        openFileChooser.setSelectedFile(new File("C:\\HTML"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        logo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        buttonpanal = new javax.swing.JPanel();
        button_Staff = new javax.swing.JButton();
        button_Suppler = new javax.swing.JButton();
        button_Stock = new javax.swing.JButton();
        button_repair = new javax.swing.JButton();
        button_Suppler1 = new javax.swing.JButton();
        button_repair1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(null);

        jTextArea1.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1060, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(280, 10, 1080, 720);

        logo.setBackground(new java.awt.Color(153, 255, 102));
        logo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        logo.setLayout(null);
        logo.add(jLabel1);
        jLabel1.setBounds(6, 14, 250, 170);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/small.png"))); // NOI18N
        logo.add(jLabel5);
        jLabel5.setBounds(20, 0, 310, 200);

        jPanel1.add(logo);
        logo.setBounds(0, 10, 270, 190);

        buttonpanal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        button_Staff.setBackground(new java.awt.Color(102, 255, 153));
        button_Staff.setFont(new java.awt.Font("Shonar Bangla", 1, 24)); // NOI18N
        button_Staff.setText("Remove Tags");
        button_Staff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_StaffActionPerformed(evt);
            }
        });

        button_Suppler.setBackground(new java.awt.Color(0, 255, 153));
        button_Suppler.setFont(new java.awt.Font("Shonar Bangla", 1, 24)); // NOI18N
        button_Suppler.setText("Static Output");
        button_Suppler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_SupplerActionPerformed(evt);
            }
        });

        button_Stock.setBackground(new java.awt.Color(51, 255, 153));
        button_Stock.setFont(new java.awt.Font("Shonar Bangla", 1, 24)); // NOI18N
        button_Stock.setText("Devide Sentences");
        button_Stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_StockActionPerformed(evt);
            }
        });

        button_repair.setBackground(new java.awt.Color(0, 204, 204));
        button_repair.setFont(new java.awt.Font("Shonar Bangla", 1, 24)); // NOI18N
        button_repair.setText("Factor Static");
        button_repair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_repairActionPerformed(evt);
            }
        });

        button_Suppler1.setBackground(new java.awt.Color(0, 204, 153));
        button_Suppler1.setFont(new java.awt.Font("Shonar Bangla", 1, 24)); // NOI18N
        button_Suppler1.setText("Dynnamic Output");
        button_Suppler1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_Suppler1ActionPerformed(evt);
            }
        });

        button_repair1.setBackground(new java.awt.Color(0, 204, 153));
        button_repair1.setFont(new java.awt.Font("Shonar Bangla", 1, 24)); // NOI18N
        button_repair1.setText("Factor Dynnamic");
        button_repair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_repair1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonpanalLayout = new javax.swing.GroupLayout(buttonpanal);
        buttonpanal.setLayout(buttonpanalLayout);
        buttonpanalLayout.setHorizontalGroup(
            buttonpanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonpanalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonpanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button_Staff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button_Suppler, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button_repair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonpanalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(button_Stock, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(button_Suppler1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button_repair1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        buttonpanalLayout.setVerticalGroup(
            buttonpanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonpanalLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(button_Staff, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button_Stock, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button_Suppler, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button_Suppler1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(button_repair1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button_repair, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jPanel1.add(buttonpanal);
        buttonpanal.setBounds(0, 210, 270, 520);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1366x768-data-out-67-68763016-faded-wallpapers.jpg"))); // NOI18N
        jLabel3.setText("PREDICT PERSONALITY OF THE APPLICANT");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 1370, 760);

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

    private void button_StaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_StaffActionPerformed
          BufferedReader buffer =null; 
        try {
            buffer = new BufferedReader(new FileReader("data1.txt"));
            String line;
            StringBuffer sb = new StringBuffer();
            while((line = buffer.readLine()) != null)
            {sb.append(line+'\n');
            jTextArea1.setText(sb.toString() );
            }
            buffer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                buffer.close();
            } catch (IOException ex) {
                Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_button_StaffActionPerformed

    private void button_SupplerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_SupplerActionPerformed
        try {
            StaticQueryOut qo = new StaticQueryOut();
            
            ArrayList<String> bl1 = new ArrayList<String>();
            ArrayList<String> bl2 = new ArrayList<String>();
            ArrayList<String> bl3 = new ArrayList<String>();
            ArrayList<String> bl4 = new ArrayList<String>();
            ArrayList<String> bl5 = new ArrayList<String>();
            ArrayList<String> bl6 = new ArrayList<String>();
           
            bl1=qo.Esp();
            bl2=qo.Ag();
            bl3 =qo.Co();
            bl4 =qo.Exp();
            bl5=qo.Op();
            bl6=qo.Ed();
             jTextArea1.setText("\n"+"Staic Ontology Querying Output"+"\n"+
                     "\n"+"*************************************************************************************************************************"
                     +"\n"+"ESP  "+bl1.toString()+"\n"+"AGR  "+bl2.toString()+"\n"+"CON  "+bl3.toString()+"\n"+"EXP  "+bl5.toString()+"\n"+"EDU  "+bl6.toString()+
                     "\n"+"*************************************************************************************************************************" );
             
            
        } catch (IOException ex) {
            Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_button_SupplerActionPerformed

    private void button_StockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_StockActionPerformed
      BufferedReader buffer =null; 
        try {
            buffer = new BufferedReader(new FileReader("xml.txt"));
            String line;
            StringBuffer sb = new StringBuffer();
            while((line = buffer.readLine()) != null)
            {sb.append(line+'\n');
            jTextArea1.setText(sb.toString() );
            }
            buffer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                buffer.close();
            } catch (IOException ex) {
                Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_button_StockActionPerformed

    private void button_repairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_repairActionPerformed
      BufferedReader buffer =null; 
        try {
            buffer = new BufferedReader(new FileReader("staticcomparisoncount.txt"));
            String line;
            StringBuffer sb = new StringBuffer();
            while((line = buffer.readLine()) != null)
            {sb.append(line+'\n');
            jTextArea1.setText(sb.toString() );
            }
            buffer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                buffer.close();
            } catch (IOException ex) {
                Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_button_repairActionPerformed

    private void button_Suppler1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_Suppler1ActionPerformed
            DynnamicQueryOut qo1 = new DynnamicQueryOut();
            ArrayList<String> al1 = new ArrayList<String>();
            ArrayList<String> al2 = new ArrayList<String>();
            ArrayList<String> al3 = new ArrayList<String>();
            ArrayList<String> al4 = new ArrayList<String>();
            ArrayList<String> al6 = new ArrayList<String>();
            ArrayList<String> al12 = new ArrayList<String>();
            ArrayList<String> a111 = new ArrayList<String>();
            ArrayList<String> al13 = new ArrayList<String>();
            ArrayList<String> al14 = new ArrayList<String>();
            ArrayList<String> al7 = new ArrayList<String>();
            ArrayList<String> al17 = new ArrayList<String>();
            
       
        try {
            al6 =qo1.EdD();
            al2 =qo1.AgDp();
            al12 =qo1.AgDn();
            a111 =qo1.EspDn();
            al1 = qo1.EspDp();
            al13 =qo1.CoDn();
            al3=qo1.CoDp();
            al4=qo1.OpDp();
            al14=qo1.OpDn();
            al7=qo1.ExpDp();
            al17=qo1.ExpDn();
        } catch (IOException ex) {
            Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
       
             jTextArea1.setText("\n"+"Dynnamic Ontology Querying Output"+"\n"+
                     "\n"+"*************************************************************************************************************************"
                     +"\n"+"ESP Positive  "+al1.toString()+"\n"+"ESP Negative  "+a111.toString()+"\n"+"AGR Positive  "+al2.toString()+"\n"+"AGR Negative "+al12.toString()+"\n"+"CON Positive "+al3.toString()+"\n"+"CON Negative  "+al13.toString()+"\n"+"OP Positive  "+al4.toString()+"\n"+"OP Negative  "+al14.toString()+"\n"+"EXP Positive  "+al7.toString()+"\n"+"EXP Negative  "+al17.toString()+"\n"+"EDU Positive "+al6.toString()+
                     "\n"+"*************************************************************************************************************************" );
             
    }//GEN-LAST:event_button_Suppler1ActionPerformed

    private void button_repair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_repair1ActionPerformed
       BufferedReader buffer =null; 
        try {
            buffer = new BufferedReader(new FileReader("dynnamiccomparisoncount.txt"));
            String line;
            StringBuffer sb = new StringBuffer();
            while((line = buffer.readLine()) != null)
            {sb.append(line+'\n');
            jTextArea1.setText(sb.toString() );
            }
            buffer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                buffer.close();
            } catch (IOException ex) {
                Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_button_repair1ActionPerformed
    JFrame BehaviourF = new JFrame(); 
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
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new AdminPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_Staff;
    private javax.swing.JButton button_Stock;
    private javax.swing.JButton button_Suppler;
    private javax.swing.JButton button_Suppler1;
    private javax.swing.JButton button_repair;
    private javax.swing.JButton button_repair1;
    private javax.swing.JPanel buttonpanal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel logo;
    // End of variables declaration//GEN-END:variables
}
