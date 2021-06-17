/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppPackage;
import AppPackage.AnimationClass.*;
import java.awt.Color;
/**
 *
 * @author PC
 */
public class ActivationGUI extends javax.swing.JFrame 
{
    AnimationClass AC = new AnimationClass();
    /**
     * Creates new form ActivationGUI
     */
    public ActivationGUI() {
        initComponents();
        Slideshow();
    }
    public void Slideshow()
    {
        new Thread()
        {
            int count;
            
            @Override
            public void run()
            {
                try
                {
                      while(true)
                      {
                            switch(count)
                            {
                                case 0:
                                    Thread.sleep(3000);
                                    AC.jLabelXLeft(0,-850, 10, 7, Background1);
                                    AC.jLabelXLeft(850,0, 10, 7, Background2);
                                    
                                    count = 1;
                                   // break;
                                
                                case 1:
                                    Thread.sleep(3000);
                                    AC.jLabelXRight(-850, 0, 10, 7, Background1);
                                    AC.jLabelXRight(0, 850, 10, 7, Background2);
                                    
                                    count = 2;
                                   // break;
                                    
                                case 2:
                                    Thread.sleep(3000);
                                    AC.jLabelXLeft(0,-850, 20, 7, Background1);
                                    AC.jLabelXLeft(850,0, 20, 7, Background2);
                                    
                                    count = 3;
                                    break;
                                    
                                case 3:
                                    Thread.sleep(3000);
                                    AC.jLabelXRight(-850, 0, 20, 7, Background1);
                                    AC.jLabelXRight(0, 850, 20, 7, Background2);
                                    
                                    count = 0;
                                    break;
                                    
                            }
                      }
                }
                catch(Exception e)
                {
            
                }
            }
        }.start();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        close = new javax.swing.JLabel();
        Background2 = new javax.swing.JLabel();
        Background1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(850, 478));
        setMinimumSize(new java.awt.Dimension(850, 478));
        setUndecorated(true);
        getContentPane().setLayout(null);

        close.setBackground(new java.awt.Color(0, 153, 0));
        close.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        close.setForeground(new java.awt.Color(255, 255, 255));
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setText("X");
        close.setOpaque(true);
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });
        getContentPane().add(close);
        close.setBounds(810, 0, 40, 25);

        Background2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IMG2.jpg"))); // NOI18N
        getContentPane().add(Background2);
        Background2.setBounds(850, 0, 850, 478);

        Background1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IMG1.jpg"))); // NOI18N
        getContentPane().add(Background1);
        Background1.setBounds(0, 0, 850, 478);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        close.setBackground(new Color(0,135,0));
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        close.setBackground(new Color(0,153,0));
    }//GEN-LAST:event_closeMouseExited

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
            java.util.logging.Logger.getLogger(ActivationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActivationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActivationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActivationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ActivationGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background1;
    private javax.swing.JLabel Background2;
    private javax.swing.JLabel close;
    // End of variables declaration//GEN-END:variables
}
