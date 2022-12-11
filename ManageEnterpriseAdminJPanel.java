/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.SystemAdminWorkArea;

import Schema.DB4OUtil.DB4OUtil;
import Schema.EcoSystem;
import Schema.Employee.Employee;
import Schema.Enterprise.Enterprise;
import Schema.Network.Network;
import Schema.Role.AdminRole;
import Schema.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author amruthaedara
 */
public class ManageEnterpriseAdminJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private EcoSystem system;
    

    /**
     * Creates new form ManageEnterpriseAdminJPanel
     */
    public ManageEnterpriseAdminJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.system=system;
        populateTable();
        populateNetworkCOmboBox();
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
        tblEnterprise = new javax.swing.JTable();
        networkLbl = new javax.swing.JLabel();
        networkCmbBox = new javax.swing.JComboBox();
        enterpriseLbl = new javax.swing.JLabel();
        enterpriseCmbBox = new javax.swing.JComboBox();
        usernameLbl = new javax.swing.JLabel();
        usernameTxtField = new javax.swing.JTextField();
        passwordLbl = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        nameTxtField = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        submitBtn = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        jScrollPane1.setOpaque(false);

        tblEnterprise.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enterprise Name", "Network", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEnterprise);

        networkLbl.setFont(new java.awt.Font("Telugu MN", 2, 14)); // NOI18N
        networkLbl.setText("Network:");

        networkCmbBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkCmbBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkCmbBoxActionPerformed(evt);
            }
        });

        enterpriseLbl.setFont(new java.awt.Font("Telugu MN", 2, 14)); // NOI18N
        enterpriseLbl.setText("Enterprise:");

        enterpriseCmbBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        enterpriseCmbBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseCmbBoxActionPerformed(evt);
            }
        });

        usernameLbl.setFont(new java.awt.Font("Telugu MN", 2, 14)); // NOI18N
        usernameLbl.setText("Username:");

        usernameTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTxtFieldActionPerformed(evt);
            }
        });

        passwordLbl.setFont(new java.awt.Font("Telugu MN", 2, 14)); // NOI18N
        passwordLbl.setText("Password:");

        nameLbl.setFont(new java.awt.Font("Telugu MN", 2, 14)); // NOI18N
        nameLbl.setText("Name:");

        backBtn.setFont(new java.awt.Font("Telugu MN", 2, 14)); // NOI18N
        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        submitBtn.setFont(new java.awt.Font("Telugu MN", 2, 14)); // NOI18N
        submitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/R.png"))); // NOI18N
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Telugu MN", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Manage Enterprise Admin");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(443, 443, 443)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(nameTxtField))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(enterpriseLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(enterpriseCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(networkLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(networkCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(usernameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(usernameTxtField))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(passwordLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPasswordField1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(419, 419, 419)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(submitBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(322, 322, 322)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addComponent(jLabel1)))
                .addContainerGap(339, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(networkLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(networkCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterpriseCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitBtn))
                .addContainerGap(157, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void enterpriseCmbBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseCmbBoxActionPerformed
     Enterprise ent =(Enterprise) enterpriseCmbBox.getSelectedItem();
     if(ent != null){
   // TODO add your handling code here:
    }//GEN-LAST:event_enterpriseCmbBoxActionPerformed
    }
    private void networkCmbBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkCmbBoxActionPerformed
     Network network =(Network) networkCmbBox.getSelectedItem();
     if(network != null){
populateEnterpriseComboBox (network);
     }// TODO add your handling code here:
    }//GEN-LAST:event_networkCmbBoxActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
Enterprise ent = (Enterprise) enterpriseCmbBox.getSelectedItem();
String username = usernameTxtField.getText();
String password = String.valueOf(jPasswordField1.getPassword());
String name = nameTxtField.getText();
for (UserAccount ua: ent.getUserAccountDirectory().getUserAccountList()) {
    if (ua.getUsername().equals(name)) {
        JOptionPane.showMessageDialog(this, "Username is already taken, please select a different username");
        return;
    }
}   
Employee employee = ent.getEmployeeDirectory().createEmployee(name);
UserAccount ua = ent.getUserAccountDirectory().createUserAccount(username, password, employee, new AdminRole());
populateTable();// TODO add your handling code here:
    }//GEN-LAST:event_submitBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
userProcessContainer.remove(this);
Component[] cmpArray = userProcessContainer.getComponents();
Component component = cmpArray[cmpArray.length-1];
SystemAdminWorkAreaJPanel sysWAJP = (SystemAdminWorkAreaJPanel) component;
sysWAJP.populateTree();
CardLayout card = (CardLayout) userProcessContainer.getLayout();
card.previous(userProcessContainer);
// TODO add your handling code here:
    }//GEN-LAST:event_backBtnActionPerformed

    private void usernameTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTxtFieldActionPerformed

    
    
    
private void populateTable() {
DefaultTableModel model = (DefaultTableModel) tblEnterprise.getModel();
model.setRowCount(0);
for(Network ntw : system.getNetworkList()){
    
    for(Enterprise ent : ntw.getEnterpriseDirectory().getEnterpriseList()){
        
        for(UserAccount ua : ent.getUserAccountDirectory().getUserAccountList()){
            
            
            Object[] row = new Object[3];
            
            row[0] = ent.getName();
            row[1]= ntw.getName();
            row[2] = ua.getUsername();
            model.addRow(row);
            
        }
    }
}
    }

    private void populateNetworkCOmboBox() {
        networkCmbBox.removeAllItems();
        for (Network network : system.getNetworkList()){
            networkCmbBox.addItem(network);
        }

    }
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox enterpriseCmbBox;
    private javax.swing.JLabel enterpriseLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JComboBox networkCmbBox;
    private javax.swing.JLabel networkLbl;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JButton submitBtn;
    private javax.swing.JTable tblEnterprise;
    private javax.swing.JLabel usernameLbl;
    private javax.swing.JTextField usernameTxtField;
    // End of variables declaration//GEN-END:variables

private void populateEnterpriseComboBox(Network ntw) {
enterpriseCmbBox.removeAllItems();
    for(Enterprise enterprise : ntw.getEnterpriseDirectory().getEnterpriseList()){
     enterpriseCmbBox.addItem(enterprise);
}
    }
}
