/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Supplier;

import Schema.WorkQueue.SupplierWorkRequest;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author amruthaedara
 */
public class ProcessSupplierWorkRequestJPanel extends javax.swing.JPanel {
    JPanel upContainer;
    SupplierWorkRequest suppWorkReq;
    

    /**
     * Creates new form ProcessSupplierWorkRequestJPanel
     */
    public ProcessSupplierWorkRequestJPanel(JPanel upContainer,SupplierWorkRequest suppWorkReq) {
        initComponents();
        this.upContainer=upContainer;
        this.suppWorkReq=suppWorkReq;
        
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
        deliveryLbl = new javax.swing.JLabel();
        deliveryTxt = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        headerLbl.setFont(new java.awt.Font("Telugu MN", 3, 36)); // NOI18N
        headerLbl.setForeground(new java.awt.Color(0, 102, 102));
        headerLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/supplier.jpg"))); // NOI18N
        headerLbl.setText("PROCESSING SUPPLIER REQUEST");

        deliveryLbl.setFont(new java.awt.Font("Telugu MN", 2, 18)); // NOI18N
        deliveryLbl.setText("Select Date of Delivery:");

        backBtn.setFont(new java.awt.Font("Telugu MN", 2, 18)); // NOI18N
        backBtn.setText("<<Back");

        updateBtn.setFont(new java.awt.Font("Telugu MN", 2, 18)); // NOI18N
        updateBtn.setText("Update Status");
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
                        .addGap(351, 351, 351)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backBtn)
                            .addComponent(deliveryLbl))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(deliveryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateBtn)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(headerLbl)))
                .addContainerGap(407, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(headerLbl)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deliveryLbl)
                    .addComponent(deliveryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn)
                    .addComponent(updateBtn))
                .addContainerGap(957, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
suppWorkReq.setStatus("Completed");
JOptionPane.showMessageDialog(null, "Request updated successfully!");        // TODO add your handling code here:
    }//GEN-LAST:event_updateBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel deliveryLbl;
    private javax.swing.JTextField deliveryTxt;
    private javax.swing.JLabel headerLbl;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
