 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instaaid;

/**
 *
 * @author user
 */
public class showReminderform extends javax.swing.JFrame {

    /**
     * Creates new form showReminderform
     */
    int hour;
    String minutes, time, medicinename;

    public showReminderform(int hour, int minutes, String time, String medicinename) {
        initComponents();

        if (time == "pm" && hour != 12) {
            this.hour = hour - 12;
        } else if (time == "am" && hour == 0) {
            this.hour = 12;
        } else {
            this.hour = hour;
        }

        if (minutes == 0) {
            this.minutes = "00";
        } else if (minutes < 10) {
            this.minutes = "0" + minutes + "";
        } else {
            this.minutes = minutes + "";
        }
        
        this.time = time;
        this.medicinename = medicinename;

        showTime.setText(this.hour + " : " + this.minutes + "  " + this.time);
        medicineName.setText(medicinename);

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
        showTime = new javax.swing.JLabel();
        medicineName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("InstaAid");
        setLocation(new java.awt.Point(530, 130));
        setMinimumSize(new java.awt.Dimension(610, 450));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(135, 206, 250));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Medicine Reminder");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(180, 30, 320, 60);

        showTime.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        showTime.setForeground(new java.awt.Color(102, 153, 255));
        jPanel1.add(showTime);
        showTime.setBounds(190, 220, 300, 60);

        medicineName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel1.add(medicineName);
        medicineName.setBounds(240, 310, 270, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/instaaid/timer-1200x1200.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(240, 80, 180, 110);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 610, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(showReminderform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(showReminderform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(showReminderform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(showReminderform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new showReminderform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel medicineName;
    private javax.swing.JLabel showTime;
    // End of variables declaration//GEN-END:variables
}