
import javax.swing.JOptionPane;
import java.sql.*;
import Project.ConnectionProvider;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.*;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Shiva rao
 */
public class StudentPortal extends javax.swing.JFrame {

    public String gmail;

    /**
     * Creates new form StudentPortal
     */
    public StudentPortal(String mail) {
        
        initComponents();
        jButton1.setUI(new RoundedButtonUI(30));
        jButton2.setUI(new RoundedButtonUI(30));
        jButton4.setUI(new RoundedButtonUI(30));
        jButton5.setUI(new RoundedButtonUI(30));
        jButton6.setUI(new RoundedButtonUI(30));

        setLayout(null);
        JTextArea textArea = new JTextArea();
        textArea.setBorder(null);
        textArea.setLineWrap(true); // Enable line wrapping
        textArea.setWrapStyleWord(true);
        Font font = new Font("VERDANA", Font.BOLD, 12); // Font name, style, size
        textArea.setFont(font);
        textArea.setText("Welcome to the Student Portal of  Campus Hostel Facility.The student portal is an intuitive online platform designed to streamline the management of hostel facilities for students.\n\nIt offers a user-friendly interface where students can easily view and update their profiles, check accommodation details, and manage fee payments. With secure login features and real-time notifications,the portal enhances communication and transparency, ensuring students have all the necessary information at their fingertips.\n\nYou can also get information from the chatbot about the hostel and make use of chatbot ai to ask anything.\n\nThis centralized hub simplifies administrative tasks, allowing students to focus more on their academic pursuits while enjoying a seamless hostel experience.");
        textArea.setOpaque(false); // Make JTextArea transparent
        textArea.setEditable(false);
        textArea.setBounds(20, 370, 1340, 300); // Set position and size
        textArea.setForeground(Color.BLACK); // Set text color to be visible
        textArea.setBackground(new Color(0, 0, 0, 0)); // Fully transparent background

        jLabel7.add(textArea);

        gmail=mail;
        
        try
        {
        Connection con=ConnectionProvider.getCon();
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("SELECT *FROM regstudents WHERE email = '"+mail+"'");
        while(rs.next())
        {
            jLabel2.setText(rs.getString(2));
        }
                
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagees/logout1.png"))); // NOI18N
        jButton12.setBorderPainted(false);
        jButton12.setContentAreaFilled(false);
        jButton12.setOpaque(false);
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton12MouseExited(evt);
            }
        });
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1255, 8, -1, 44));

        jButton13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagees/close1 (1).png"))); // NOI18N
        jButton13.setBorderPainted(false);
        jButton13.setContentAreaFilled(false);
        jButton13.setOpaque(false);
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton13MouseExited(evt);
            }
        });
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jButton13.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jButton13PropertyChange(evt);
            }
        });
        getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 10, -1, 40));

        jLabel1.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        jLabel1.setText("Welcome,");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setAlignmentY(0.0F);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 180, -1));

        jButton1.setBackground(new java.awt.Color(0, 255, 255));
        jButton1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton1.setText("Profile");
        jButton1.setDoubleBuffered(true);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
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
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 217, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 255, 255));
        jButton2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton2.setText("Update Profile");
        jButton2.setDoubleBuffered(true);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 217, -1, -1));

        jButton4.setBackground(new java.awt.Color(0, 255, 255));
        jButton4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton4.setText("Check accomodation status");
        jButton4.setDoubleBuffered(true);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 217, -1, -1));

        jButton5.setBackground(new java.awt.Color(0, 255, 255));
        jButton5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton5.setText("Fee Payment");
        jButton5.setDoubleBuffered(true);
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton5MouseExited(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(883, 217, -1, -1));

        jButton6.setBackground(new java.awt.Color(0, 255, 255));
        jButton6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton6.setText("Chatbot 24/7");
        jButton6.setDoubleBuffered(true);
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton6MouseExited(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1119, 217, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagees/logo1 (2).png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 577, -1, 100));

        jLabel5.setFont(new java.awt.Font("Californian FB", 1, 12)); // NOI18N
        jLabel5.setText("Campus Hostel Facility");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 677, -1, -1));

        jLabel4.setFont(new java.awt.Font("Californian FB", 1, 12)); // NOI18N
        jLabel4.setText("Home Away from Home: Where Learning Meets Life!");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 697, -1, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(224, 125, 84));
        jLabel6.setText("About");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 334, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagees/bg3.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12MouseClicked

    private void jButton12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseEntered
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagees/logout_1.png")));
    }//GEN-LAST:event_jButton12MouseEntered

    private void jButton12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseExited
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagees/logout1.png")));
    }//GEN-LAST:event_jButton12MouseExited

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

        int a=JOptionPane.showConfirmDialog(null,"Do you want to Logout","select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            setVisible(false);
        }

    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseEntered
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagees/close_1.png")));
    }//GEN-LAST:event_jButton13MouseEntered

    private void jButton13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseExited
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagees/close1 (1).png")));
    }//GEN-LAST:event_jButton13MouseExited

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        int a=JOptionPane.showConfirmDialog(null,"Do you want to Exit","select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton13PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jButton13PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13PropertyChange

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new UpdateProfile(gmail).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        boolean i=false;
        String room="NO";
        try
        {
        Connection con=ConnectionProvider.getCon();
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select roomno from student where email = '"+gmail+"'");
        while(rs.next())
        {
          room=rs.getString(1);
           i=true;
        }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        if(i)
        {
            String msg="Room "+room+" is Assigned.";
            JOptionPane.showMessageDialog(null,msg,"Accomodation Status", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"NO Room is allocated till now.","Accomodation Status", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new FeePay(gmail).setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new StuProfile(gmail).setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        new chatbot().setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setBackground(new java.awt.Color(92, 225,230));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setBackground(new java.awt.Color(92, 225,230));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        jButton4.setBackground(new java.awt.Color(92, 225,230));
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
        jButton5.setBackground(new java.awt.Color(92, 225,230));
    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseEntered
        jButton6.setBackground(new java.awt.Color(92, 225,230));
    }//GEN-LAST:event_jButton6MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setBackground(new java.awt.Color(0, 255,255));
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        jButton2.setBackground(new java.awt.Color(0, 255,255));
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        jButton4.setBackground(new java.awt.Color(0, 255,255));
    }//GEN-LAST:event_jButton4MouseExited

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
        jButton5.setBackground(new java.awt.Color(0, 255,255));
    }//GEN-LAST:event_jButton5MouseExited

    private void jButton6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseExited
        jButton6.setBackground(new java.awt.Color(0, 255,255));
    }//GEN-LAST:event_jButton6MouseExited

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        jButton1.setBackground(new java.awt.Color(255, 255,255));
    }//GEN-LAST:event_jButton1MouseClicked

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        jButton1.setBackground(new java.awt.Color(255, 225, 173));
        jButton2.setBackground(new java.awt.Color(255, 225, 173));
        jButton4.setBackground(new java.awt.Color(255, 225, 173));
        jButton5.setBackground(new java.awt.Color(255, 225, 173));
        jButton6.setBackground(new java.awt.Color(255, 225, 173));
    }//GEN-LAST:event_formFocusGained

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
            java.util.logging.Logger.getLogger(StudentPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new StudentPortal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables

public class RoundedButtonUI extends BasicButtonUI {

    private int cornerRadius;

    public RoundedButtonUI(int radius) {
        this.cornerRadius = radius;
    }

    @Override
    public void installUI(JComponent c) {
        super.installUI(c);
        AbstractButton button = (AbstractButton) c;
        button.setOpaque(false);  // Make sure the button is not opaque
        button.setContentAreaFilled(false);  // Remove background filling
        button.setFocusPainted(false);  // Remove focus painting
        button.setBorderPainted(false);  // Remove the default border
    }

    @Override
    public void paint(Graphics g, JComponent c) {
        AbstractButton button = (AbstractButton) c;
        paintBackground(g, button);
        super.paint(g, c);  // Let the default behavior handle the text and other parts
    }

    private void paintBackground(Graphics g, AbstractButton button) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Draw rounded rectangle with the button's background color
        g2d.setColor(button.getBackground());
        g2d.fillRoundRect(0, 0, button.getWidth(), button.getHeight(), cornerRadius, cornerRadius);

        g2d.dispose();
    }
}

}
