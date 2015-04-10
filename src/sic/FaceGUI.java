/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sic;

import java.awt.AWTException;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import misc.TrayIconDemo;


/**
 *
 * @author Benjámin
 */
public class FaceGUI extends javax.swing.JFrame {

    /**
     * Creates new form FaceGUI
     */
    public FaceGUI() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sic/images/zombie.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
      
       
        String str = jTextField1.getText().toString();
         if(evt.getKeyChar() == KeyEvent.VK_ENTER){
             
             if(str.contains("game") || str.contains("játék")){
                  GameChooseGUI g = new GameChooseGUI();
                 g.setVisible(true);
                   jTextField1.setText(" ");
                   
             } else if(str.contains("note") || str.contains("jegyzet")){
                 NotesGUI notes = new NotesGUI();
                 notes.setVisible(true);
                   jTextField1.setText(" ");
                   
             } else if(str.contains("extend")){
                 GUI full = new GUI();
                 full.setVisible(true);
                 super.dispose();
                   jTextField1.setText(" ");
                   
             }else if(str.contains("time") || str.contains("idő") || str.contains("óra")){
                 timeGUI time = new timeGUI();
                 time.setVisible(true);
                   jTextField1.setText(" ");
                   
             }else if(str.contains("system") || str.contains("rendszer")){
                    SystemInformationGUI sys = new SystemInformationGUI();
                    sys.setVisible(true);
                      jTextField1.setText(" ");
                      
             }else if(str.contains("exit") || str.contains("kilépés")){
                  System.exit(0);
                  
             }else if(str.contains("help") || str.contains("segítség")){
                 System.out.println(
            "Game = game(snake,tetris)"+"\n"+"System stat = system"+"\n"+"Time = time"+"\n"
            +"Extended mod = extends"+"\n"+"Notes = note"+"\n"+"Exit = exit"+"\n"+"Time = time"+"Alone=alone");
                    jTextField1.setText(" ");
                    
             }else if(str.contains("alone")){
                new ChatBot().setVisible(true);
                jTextField1.setText(" ");
                
              }else if(str.contains("google")){
                    try 
                   {
                       Desktop.getDesktop().browse(new URL("http://www.google.com").toURI());
                   }           
                   catch (Exception e) {}
              }else if(str.contains(".com") || str.contains(".hu")){
                 
                //  String url = jTextField1.getText().toString();
                  
               try 
                {
                    Desktop.getDesktop().browse(new URL("http://"+str).toURI());
                }           
                catch (Exception e) {}
               jTextField1.setText(" ");
               
               
              }else if(str.contains("weather")){
                 
                //  String url = jTextField1.getText().toString();
                  
               try 
                {
                    Desktop.getDesktop().browse(new URL("http://www.idokep.hu").toURI());
                }           
                catch (Exception e) {}
               
               jTextField1.setText(" ");
         
              }else if(str.contains("sleep") || str.contains("aludj") || str.contains("hagyj")){
                 TrayIconDemo.createAndShowGUI();
                 super.hide();
                  
                          
              }else if(str.contains("alarm") || str.contains("jelzés")){
                    AlarmGUI a = new AlarmGUI();
                    a.setVisible(true);
              }if(str.contains("hate")){
                 try {
                     Robot r = new Robot();
                     for(int i= 0;i>-1;i++){
                         r.mouseMove(0, 0);
                     }
                     
                 } catch (AWTException ex) {
                     Logger.getLogger(FaceGUI.class.getName()).log(Level.SEVERE, null, ex);
                 }
                    jTextField1.setText(" ");
              }else if(str == " "){
                  JOptionPane.showMessageDialog(this, "Üres mező , adja meg a parancsot!");
              }else 
                  jTextField1.setText("I don't understand");
             
                 }     
        
        
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseDragged

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
        // TODO add your handling code here:
        
        
        if(evt.getNewState() == Frame.ICONIFIED){
            TrayIconDemo.createAndShowGUI();
            super.setVisible(false);
        }
    }//GEN-LAST:event_formWindowStateChanged

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
            java.util.logging.Logger.getLogger(FaceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FaceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FaceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FaceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FaceGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
