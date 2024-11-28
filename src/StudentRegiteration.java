
import javax.swing.JOptionPane;
import java.sql.*;
import Project.ConnectionProvider;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Shiva rao
 */
public class StudentRegiteration extends javax.swing.JFrame {

    /**
     * Creates new form StudentRegiteration
     */
    public StudentRegiteration() {
        initComponents();
    }
    
    public void clear()
    {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField9.setText("");
        jPasswordField1.setText("");
        jPasswordField2.setText("");
   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagees/bg3.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(332, 134));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 225, 173));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setText("Roll Number");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 300, 22));

        jTextField1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 300, -1));

        jLabel2.setBackground(new java.awt.Color(255, 225, 173));
        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 300, 22));

        jLabel3.setBackground(new java.awt.Color(255, 225, 173));
        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setText("Father's name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 300, 22));

        jLabel4.setBackground(new java.awt.Color(255, 225, 173));
        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setText("Mother's name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 300, 22));

        jLabel5.setBackground(new java.awt.Color(255, 225, 173));
        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setText("Mobile number");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 300, 22));

        jLabel6.setBackground(new java.awt.Color(255, 225, 173));
        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel6.setText("Permanent address");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 300, 22));

        jLabel7.setBackground(new java.awt.Color(255, 225, 173));
        jLabel7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel7.setText("College name");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 300, 22));

        jLabel8.setBackground(new java.awt.Color(255, 225, 173));
        jLabel8.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel8.setText("Aadhar number(unique id)");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 300, 22));

        jLabel11.setBackground(new java.awt.Color(255, 225, 173));
        jLabel11.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel11.setText("Email Address");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 300, 22));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagees/hidden.png"))); // NOI18N
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setOpaque(false);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton4MouseReleased(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 383, 30, 24));

        jTextField2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 300, -1));

        jTextField3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 300, -1));

        jTextField4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 300, -1));

        jTextField5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 300, -1));

        jTextField6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 300, -1));

        jTextField7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 300, -1));

        jTextField8.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 300, -1));

        jTextField9.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 300, -1));

        jButton2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagees/new student.png"))); // NOI18N
        jButton2.setText("Register");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, 150, 27));

        jButton3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagees/clear.png"))); // NOI18N
        jButton3.setText("Clear");
        jButton3.setPreferredSize(new java.awt.Dimension(158, 37));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, 130, 27));

        jLabel9.setBackground(new java.awt.Color(255, 225, 173));
        jLabel9.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel9.setText("Confirm Password");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 300, 22));

        jPasswordField1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, 300, -1));

        jPasswordField2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 300, -1));

        jLabel10.setBackground(new java.awt.Color(255, 225, 173));
        jLabel10.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel10.setText("Create Password");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 300, 22));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagees/close1 (1).png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setOpaque(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 50, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagees/pbg (3).png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(jTextField1.getText().length()!=0 && jTextField2.getText().length()!=0 && jTextField3.getText().length()!=0 && jTextField4.getText().length()!=0 &&jTextField5.getText().length()!=0 && jTextField6.getText().length()!=0 && jTextField7.getText().length()!=0 && jTextField8.getText().length()!=0 && jTextField9.getText().length()!=0 && jPasswordField1.getText().length()!=0 && jPasswordField2.getText().length()!=0) 
        {
        String rollno=jTextField1.getText();
        String name=jTextField2.getText();
        String mobileno=jTextField3.getText();
        String email=jTextField4.getText();
        String fathername=jTextField5.getText();
        String mothername=jTextField6.getText();
        String address=jTextField7.getText();
        String college=jTextField8.getText();
        String aadhar=jTextField9.getText();
        if(jPasswordField1.getText().equals(jPasswordField2.getText()))
        {
        String pass=jPasswordField1.getText();
        
        try
        {
            Connection con=ConnectionProvider.getCon();
            PreparedStatement ps=con.prepareStatement("insert into regstudents values (?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1,rollno);
            ps.setString(2,name);
            ps.setString(3,mobileno);
            ps.setString(4,email);
            ps.setString(5,fathername);
            ps.setString(6,mothername);
            ps.setString(7,address);
            ps.setString(8,college);
            ps.setString(9,aadhar);
            ps.setString(10, pass);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Succesfully Updated");
            clear();
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Passwords do not Match");
        }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Fields cannot be Empty");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        clear();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagees/close_1.png")));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagees/close1 (1).png")));
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MousePressed
       jPasswordField2.setEchoChar((char)0);
       jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagees/visibility-button.png")));

    }//GEN-LAST:event_jButton4MousePressed

    private void jButton4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseReleased
        jPasswordField2.setEchoChar('*');
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagees/hidden.png")));

    }//GEN-LAST:event_jButton4MouseReleased

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
            java.util.logging.Logger.getLogger(StudentRegiteration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentRegiteration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentRegiteration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentRegiteration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentRegiteration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
