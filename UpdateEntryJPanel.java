/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.PharmacyRole;

import Schema.Enterprise.Enterprise;
import Schema.Organization.Organization;
import Schema.Organization.PharmacyOrganization;
import Schema.PharmaInventory.PharmaInventory;
import Schema.PharmaInventory.PharmaInventoryList;
import Schema.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author amruthaedara
 */
public class UpdateEntryJPanel extends javax.swing.JPanel {
        JPanel userProcessContainer;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private PharmaInventoryList pil;
    private Organization org;
    private PharmacyOrganization pharmorg;
    private PharmaInventory pi;

    /**
     * Creates new form UpdateEntryJPanel
     */
    public UpdateEntryJPanel(JPanel upContainer, UserAccount ua, Enterprise ent, PharmaInventory pi) {
        initComponents();
        this.userProcessContainer=upContainer;
        this.userAccount=ua;
        this.enterprise=ent;
        this.pil= pil;
        this.pharmorg= pharmorg;
        this.pi=pi;
        serialnumTxt.setText(String.valueOf(pi.getSerialNumber()));
        availabilityTxt.setText(String.valueOf(pi.getAvailableQuantity()));
        mednameTxt.setText(pi.getMedicineName());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerLbl = new javax.swing.JLabel();
        serialnumLbl = new javax.swing.JLabel();
        serialnumTxt = new javax.swing.JTextField();
        mednameLbl = new javax.swing.JLabel();
        mednameTxt = new javax.swing.JTextField();
        availabilityLbl = new javax.swing.JLabel();
        availabilityTxt = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        headerLbl.setFont(new java.awt.Font("Telugu MN", 3, 36)); // NOI18N
        headerLbl.setForeground(new java.awt.Color(0, 102, 102));
        headerLbl.setText("Update Details");

        serialnumLbl.setFont(new java.awt.Font("Telugu MN", 2, 18)); // NOI18N
        serialnumLbl.setText("Serial Number:");

        mednameLbl.setFont(new java.awt.Font("Telugu MN", 2, 18)); // NOI18N
        mednameLbl.setText("Medicine Name:");

        availabilityLbl.setFont(new java.awt.Font("Telugu MN", 2, 18)); // NOI18N
        availabilityLbl.setText("Availability:");

        backBtn.setFont(new java.awt.Font("Telugu MN", 2, 18)); // NOI18N
        backBtn.setText("<<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        saveBtn.setFont(new java.awt.Font("Telugu MN", 2, 18)); // NOI18N
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        updateBtn.setFont(new java.awt.Font("Telugu MN", 2, 18)); // NOI18N
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(459, 459, 459)
                        .addComponent(backBtn)
                        .addGap(77, 77, 77)
                        .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(537, 537, 537)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(availabilityLbl)
                                    .addComponent(mednameLbl)
                                    .addComponent(serialnumLbl))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(serialnumTxt)
                                    .addComponent(mednameTxt)
                                    .addComponent(availabilityTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)))
                            .addComponent(headerLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(696, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(headerLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(serialnumLbl)
                    .addComponent(serialnumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mednameLbl)
                    .addComponent(mednameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(availabilityLbl)
                    .addComponent(availabilityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(470, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        PharmaWorkAreaJPanel pwjp = (PharmaWorkAreaJPanel) component;
        pwjp.refreshTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);        // TODO add your handling code here:
    }//GEN-LAST:event_backBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
pi.setMedicineName(mednameTxt.getText());
       int availableQuantity= Integer.parseInt(availabilityTxt.getText());
        pi.setAvailableQuantity(availableQuantity);
        int serialNumber= Integer.parseInt(serialnumTxt.getText());
        pi.setSerialNumber(serialNumber);
        
        
        JOptionPane.showMessageDialog(null, "Medicine updated Successfully", "Warning", JOptionPane.INFORMATION_MESSAGE);
        
         if(pi.getAvailableQuantity()<=pi.getReorderLevel()){
            
            
            
        }        // TODO add your handling code here:
    }//GEN-LAST:event_saveBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed

        mednameTxt.setEditable(false);
        serialnumTxt.setEditable(false);
        availabilityTxt.setEditable(true);
        saveBtn.setEnabled(true);        // TODO add your handling code here:
    }//GEN-LAST:event_updateBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel availabilityLbl;
    private javax.swing.JTextField availabilityTxt;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel headerLbl;
    private javax.swing.JLabel mednameLbl;
    private javax.swing.JTextField mednameTxt;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel serialnumLbl;
    private javax.swing.JTextField serialnumTxt;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
