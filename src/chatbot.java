import Project.ConnectionProvider;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.TargetDataLine;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.ScrollPaneConstants;


public class chatbot extends javax.swing.JFrame {
    private TargetDataLine microphone;
    private AudioFormat format;
    private boolean isRecording;
    
    public void startRecording() {
        String filename = "C:\\Project\\NetBeansProjects\\Hostel management system\\test.txt";
        // Step 1: Record audio
        File txtFile = new File(filename);
        if (txtFile.exists()) {
            txtFile.delete();}
        System.out.println("Recording started");
        AudioFormat format = new AudioFormat(44100, 16, 1, true, true);
        try {
            DataLine.Info info = new DataLine.Info(TargetDataLine.class, format);
            microphone = (TargetDataLine) AudioSystem.getLine(info);
            microphone.open(format);
            microphone.start();

            isRecording = true;

            // Create a thread to capture audio data
            Thread captureThread = new Thread(() -> {
                //give path for the wav(audio) file
                File wavFile = new File("test.wav");
                try (AudioInputStream audioStream = new AudioInputStream(microphone)) {
                    AudioSystem.write(audioStream, AudioFileFormat.Type.WAVE, wavFile);
                    System.out.println("Recording saved to: " + wavFile.getAbsolutePath());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            captureThread.start();

        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
    }
    public void stopRecording() {
        if (isRecording) {
            microphone.stop();
            microphone.close();
            isRecording = false;
            System.out.println("Recording stopped.");
        }
    }

    public static String readFile(String filePath) {
        StringBuilder content = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n"); // Append each line with a newline character
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

        return content.toString(); // Convert StringBuilder to String
    }
    public chatbot() {
        initComponents();
        jTextArea1.setLineWrap(true); // Wraps text to the next line
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jTextArea1.setEditable(false);
        jTextArea1.setText("Chatbot: How can i assist you?\n\n");
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(1050, 280));
        setUndecorated(true);

        jButton1.setBackground(new java.awt.Color(0, 204, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagees/mic-on (1).png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setForeground(new java.awt.Color(204, 204, 204));
        jTextField1.setText("Type exit to end chat");
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
        });
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextField1MouseExited(evt);
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

        jTextArea1.setColumns(10);
        jTextArea1.setRows(5);
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextArea1.setMaximumSize(new java.awt.Dimension(232, 84));
        jScrollPane1.setViewportView(jTextArea1);

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagees/mute.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        String input=jTextField1.getText();
        jTextArea1.append("You: "+input+"\n");

        // Specify the file name and path fot txt file
        String filePath = "test.txt"; // You can specify the full path if needed

        // Create a BufferedWriter to write to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            // Write the content of the variable to the file
            writer.write(input);
            // Optionally, you can write a newline character
            writer.newLine();  // Uncomment if you want to add a new line after the text
            System.out.println("Text successfully written to " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        jTextField1.setText("");
        String response =getResponse(input);
        jTextArea1.append("Chatbot: "+response+"\n\n");
        jTextField1.setForeground(Color.BLACK);
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

         startRecording();
        
        
        
        
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
       
        
            
        
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
       
    }//GEN-LAST:event_jButton1MouseReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        stopRecording();
        // Give path for the python file
        String pythonScriptPath = "test.py";
        
        try {
            // Create a ProcessBuilder to run the python command
            ProcessBuilder builder = new ProcessBuilder("python", pythonScriptPath);
            
            // Redirect output and error streams to null to suppress output
            builder.redirectOutput(ProcessBuilder.Redirect.DISCARD);
            builder.redirectError(ProcessBuilder.Redirect.DISCARD);
            
            // Start the process
            Process process = builder.start();
            
            // Wait for the process to finish
            int exitCode = process.waitFor();
            System.out.println("Python script executed with exit code: " + exitCode);
            
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        // Give path for txt file
        String filePath = "test.txt";
        
        // Variable to hold the contents of the file
        String fileContents = readFile(filePath);
        
        // Print the contents
        if (fileContents != null) {
            System.out.println("File Contents:");
            System.out.println(fileContents);
            jTextArea1.append("You: "+fileContents);
            String response=getResponse(fileContents);
            jTextArea1.append("Chatbot: "+response+"\n\n");
            jTextField1.setForeground(Color.GRAY);
            jTextField1.setText("Type exit to end chat");
        } else {
            System.out.println("Error reading file.");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        jTextField1.setForeground(Color.black);
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jTextField1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseEntered
        jTextField1.setForeground(Color.black);
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1MouseEntered

    private void jTextField1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseExited
        jTextField1.setForeground(Color.GRAY);
            jTextField1.setText("Type exit to end chat");
    }//GEN-LAST:event_jTextField1MouseExited

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed

    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained

    }//GEN-LAST:event_jTextField1FocusGained

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
            java.util.logging.Logger.getLogger(chatbot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(chatbot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(chatbot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(chatbot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new chatbot().setVisible(true);
            }
        }
        );
        
    }

    public String getResponse(String input) {
        if(input.equalsIgnoreCase("exit"))
        {setVisible(false);
        return null;
        }
        else
        {
        String sql = "SELECT response FROM responses WHERE ? LIKE CONCAT('%', keyword, '%')";

        // Try to get a response from the database
        try (Connection con = ConnectionProvider.getCon();
             PreparedStatement statement = con.prepareStatement(sql)) {
            
            statement.setString(1, input);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                String response = resultSet.getString("response");
                // Create reply.txt with the response found
                return response; // Return the name of the file
            }
        } catch (SQLException e) {
            System.err.println("Error querying database: " + e.getMessage());
        }

        // If no response found in the database, execute the Python script
        return executePythonScriptAndReadResponse();
        
    }
    }


    public String executePythonScriptAndReadResponse() {
        // Give path for the python file
        String pythonScriptPath = "gpt3.py";
        
        try {
            // Create a ProcessBuilder to run the python command
            ProcessBuilder builder = new ProcessBuilder("python", pythonScriptPath);
            
            // Redirect output and error streams to null to suppress output
            builder.redirectOutput(ProcessBuilder.Redirect.DISCARD);
            builder.redirectError(ProcessBuilder.Redirect.DISCARD);
            
            // Start the process
            Process process = builder.start();
            
            // Wait for the process to finish
            int exitCode = process.waitFor();
            System.out.println("Python script executed with exit code: " + exitCode);
            
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        
       try {
            // Read all bytes from the file and convert them to a String
            // Give txt file path
            return new String(Files.readAllBytes(Paths.get("reply.txt")));
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
            return null; // Return null or handle it as needed
        }
    }


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
