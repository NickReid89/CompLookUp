
import java.awt.HeadlessException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nickolas Reid
 */
public class DepartmentsGUI extends javax.swing.JFrame {

    /**
     * Creates new form DepartmentsGUI
     */
    public DepartmentsGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtDisplayBox = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDeptID = new javax.swing.JTextField();
        txtDeptName = new javax.swing.JTextField();
        txtManagerID = new javax.swing.JTextField();
        txtLocationID = new javax.swing.JTextField();
        btnDisplayDept = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Departments Table Manipulation");

        txtDisplayBox.setEditable(false);
        txtDisplayBox.setColumns(20);
        txtDisplayBox.setRows(5);
        txtDisplayBox.setTabSize(15);
        jScrollPane1.setViewportView(txtDisplayBox);

        jLabel1.setText("Department ID:");

        jLabel2.setText("Department Name:");

        jLabel3.setText("Manager ID:");

        jLabel4.setText("Location ID:");

        txtDeptID.setToolTipText("");

        txtDeptName.setToolTipText("");

        txtLocationID.setToolTipText("");

        btnDisplayDept.setText("Display Departments");
        btnDisplayDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayDeptActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtManagerID, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                    .addComponent(txtDeptName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLocationID, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDeptID))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnDisplayDept)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                                .addComponent(btnDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUpdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAdd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExit)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDeptID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDeptName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtManagerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(txtLocationID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(btnAdd)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnDisplayDept))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:

        Connection AllTheConnections = getConnection();
        Statement statement = null;

        String DeptID = txtDeptID.getText();
        String DeptName = txtDeptName.getText();
        String ManName = txtManagerID.getText();
        String Location = txtLocationID.getText();



        try {
            //statement = AllTheConnections.createStatement();
            String insertDepartment = "INSERT INTO Departments "
                    + "(Department_ID, Department_Name, Manager_ID, Location_ID )"
                    + "VALUES (?, ?, ?, ?)";
            PreparedStatement ps = AllTheConnections.prepareStatement(insertDepartment);
            ps.setString(1, DeptID);
            ps.setString(2, DeptName);
            ps.setString(3, ManName);
            ps.setString(4, Location);
            int count = ps.executeUpdate();
         
            JOptionPane.showMessageDialog(rootPane, "Record has been added", "Approved", JOptionPane.PLAIN_MESSAGE);
            
            
        } catch (SQLException ex) {
            // Logger.getLogger(DepartmentsGUI.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, ex);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDisplayDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayDeptActionPerformed

        Connection AllTheConnections = getConnection();
        Statement statement = null;
        ResultSet rs = null;
        String CheckIfEmpty = txtDisplayBox.getText();

            try {
                txtDisplayBox.setText("");
                statement = AllTheConnections.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                String query = "SELECT * FROM Departments";
                rs = statement.executeQuery(query);

                while (rs.next()) {
                    // code that works with each row 
                    txtDisplayBox.append(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4) + "\n");
                }
                rs.close();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, ex);
                //Logger.getLogger(DepartmentsGUI.class.getName()).log(Level.SEVERE, null, ex);

            }


    }//GEN-LAST:event_btnDisplayDeptActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        Connection AllTheConnections = getConnection();
        Statement statement = null;
        String[] choices = {"Confirm Delete", "Cancel"};
        String DeptID = txtDeptID.getText();
        
        
        int response = JOptionPane.showOptionDialog(null, "Are you sure you want to delete?", "DELETE", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, choices, null);
        
        if (response == JOptionPane.YES_OPTION) {
            try {
                String deleteProduct = "DELETE FROM Departments " + "WHERE Department_ID = ?";
                PreparedStatement ps = AllTheConnections.prepareStatement(deleteProduct);
                ps.setString(1, DeptID);
                int count = ps.executeUpdate();
                JOptionPane.showConfirmDialog(rootPane, "Successful", "Deletion was successful", JOptionPane.PLAIN_MESSAGE);

            } catch (SQLException ex) {
                //Logger.getLogger(DepartmentsGUI.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, ex);
            }
        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        Connection AllTheConnections = getConnection();
        Statement statement = null;

        String DeptID = txtDeptID.getText();
        String DeptName = txtDeptName.getText();
        String ManName = txtManagerID.getText();
        String Location = txtLocationID.getText();
        try {
         
            String updateProduct =
                    "UPDATE Departments "
                    + "SET Department_Name = ? , Manager_ID = ? , Location_ID = ?"
                    + "WHERE Department_ID = ?";
            PreparedStatement ps = AllTheConnections.prepareStatement(updateProduct);

            ps.setString(1, DeptName);
            ps.setString(2, ManName);
            ps.setString(3, Location);
            ps.setString(4, DeptID);
            int count = ps.executeUpdate();
            JOptionPane.showConfirmDialog(rootPane, "Successful", "Update was successful", JOptionPane.PLAIN_MESSAGE);
        } catch (SQLException | HeadlessException ex) {
           // Logger.getLogger(DepartmentsGUI.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, ex);
         
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(DepartmentsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DepartmentsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DepartmentsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DepartmentsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DepartmentsGUI().setVisible(true);
            }
        });
    }

    private Connection getConnection() {
        Connection connection = null;
        try {
            // create and return the connection 
            String dbUrl = "jdbc:oracle:thin:@localhost:1521/XE";
            String username = "HR";
            String password = "seven";
            connection = DriverManager.getConnection(dbUrl, username, password);

            return connection;
        } catch (SQLException e) {
            for (Throwable t : e) {
                e.printStackTrace();
            }
            return null;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDisplayDept;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtDeptID;
    private javax.swing.JTextField txtDeptName;
    private javax.swing.JTextArea txtDisplayBox;
    private javax.swing.JTextField txtLocationID;
    private javax.swing.JTextField txtManagerID;
    // End of variables declaration//GEN-END:variables
}
