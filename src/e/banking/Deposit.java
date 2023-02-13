/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package e.banking;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Alan
 */

public class Deposit extends javax.swing.JFrame {
private static Connection conn;
    private static Statement st;
    ResultSet rs;
    /**
     * Creates new form Deposit
     */
    public Deposit() {
        super("Deposit");
        initComponents();
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(d.width/2-getWidth()/2, d.height/2-getHeight()/2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtacc = new javax.swing.JTextField();
        txtacc_name = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtphone = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtdate = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtamont = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLayeredPane1.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane1.setOpaque(true);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e/banking/first-bank.jpg"))); // NOI18N
        jLabel3.setBounds(0, 0, 90, 90);
        jLayeredPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e/banking/First_Bank-logo-42C1138CB0-seeklogo.com.gif"))); // NOI18N
        jLabel2.setBounds(240, 0, 200, 90);
        jLayeredPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e/banking/first-bank.jpg"))); // NOI18N
        jLabel4.setBounds(580, 0, 90, 90);
        jLayeredPane1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setBackground(new java.awt.Color(0, 0, 102));
        jLabel1.setOpaque(true);
        jLabel1.setBounds(0, 0, 670, 90);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel6.setBackground(new java.awt.Color(0, 0, 102));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DEPOSITOR DETAIL");
        jLabel6.setOpaque(true);
        jLabel6.setBounds(0, 190, 670, 20);
        jLayeredPane1.add(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("ACCOUNT NO:");
        jLabel7.setBounds(10, 150, 140, 20);
        jLayeredPane1.add(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtacc.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtacc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtaccKeyPressed(evt);
            }
        });
        txtacc.setBounds(140, 150, 200, 30);
        jLayeredPane1.add(txtacc, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtacc_name.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtacc_name.setBounds(480, 150, 190, 30);
        jLayeredPane1.add(txtacc_name, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("ACCOUNT NAME:");
        jLabel8.setBounds(350, 150, 140, 20);
        jLayeredPane1.add(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtname.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtname.setBounds(90, 220, 200, 30);
        jLayeredPane1.add(txtname, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("NAME:");
        jLabel9.setBounds(40, 220, 60, 20);
        jLayeredPane1.add(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtphone.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtphone.setBounds(480, 220, 190, 30);
        jLayeredPane1.add(txtphone, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("PHONE:");
        jLabel10.setBounds(410, 220, 60, 20);
        jLayeredPane1.add(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel11.setBackground(new java.awt.Color(0, 0, 102));
        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("DEPOSIT SLIP");
        jLabel11.setOpaque(true);
        jLabel11.setBounds(0, 100, 670, 20);
        jLayeredPane1.add(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("DATE:");
        jLabel12.setBounds(40, 280, 60, 20);
        jLayeredPane1.add(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtdate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtdate.setText("DD/MM/YY");
        txtdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdateActionPerformed(evt);
            }
        });
        txtdate.setBounds(90, 280, 200, 30);
        jLayeredPane1.add(txtdate, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("AMOUNT:");
        jLabel13.setBounds(160, 330, 80, 20);
        jLayeredPane1.add(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtamont.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtamont.setBounds(250, 330, 200, 30);
        jLayeredPane1.add(txtamont, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jButton1.setText("UPDATE ACCOUNT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(100, 380, 200, 40);
        jLayeredPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton2.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jButton2.setText("CLOSE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.setBounds(380, 380, 200, 40);
        jLayeredPane1.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public static void connect() throws SQLException{
        try {
            String url = "jdbc:odbc:bank";
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            conn = DriverManager.getConnection(url, "", "");
            st = conn.createStatement();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(txtacc.getText().equals("")||txtacc_name.getText().equals("")||txtname.getText().equals("")||txtdate.getText().equals("")||txtamont.getText().equals(""))
        {        
            JOptionPane.showMessageDialog(this, "One or more field is empty","Empty Parameter",JOptionPane.ERROR_MESSAGE);
        }
        else{
             try {
            String s = "SELECT * FROM details WHERE account = "+txtacc.getText();
                         connect();
                         rs = st.executeQuery(s);  
                         if(rs.next()){
                 String q = "INSERT INTO deposit(account,dep_name,dep_date,dep_phone,amount) VALUES(";
                 q = q + txtacc.getText()+",'";
                 q = q + txtname.getText()+"','";
                 q = q + txtdate.getText()+"','";
                 q = q + txtphone.getText()+"','";
                 q = q + txtamont.getText()+"')";
                 connect();
                 st.executeUpdate(q);
                 JOptionPane.showMessageDialog(this, "Account has been Credited");
                 
                  String bal = null;
                 String z = "SELECT * FROM acc_bal WHERE account = "+txtacc.getText();
                 connect();
                 rs = st.executeQuery(z);
                 while(rs.next()){
                  bal = rs.getString("balance");
                 }
                 long balance = Long.parseLong(bal)+Long.parseLong(txtamont.getText());
                 String y = "UPDATE acc_bal SET balance = "+balance+" WHERE account = "+txtacc.getText();
                 connect();
                 st.executeUpdate(y);
                 txtacc.setText("");
                 txtacc_name.setText("");
                 txtname.setText("");
                 txtdate.setText("");
                 txtphone.setText("");
                 txtamont.setText("");
                         }
                         
                         else{
                             JOptionPane.showMessageDialog(this, "Invalid Account","Invalid",JOptionPane.ERROR_MESSAGE);
                         }
        } catch (SQLException ex) {
            Logger.getLogger(Deposit.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
                                
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdateActionPerformed

    private void txtaccKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtaccKeyPressed
if(evt.getKeyCode() == 10){
jButton1ActionPerformed(null);
}     // TODO add your handling code here:
    }//GEN-LAST:event_txtaccKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
show(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Deposit().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JTextField txtacc;
    private javax.swing.JTextField txtacc_name;
    private javax.swing.JTextField txtamont;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtphone;
    // End of variables declaration//GEN-END:variables
}
