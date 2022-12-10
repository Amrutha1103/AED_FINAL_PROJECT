/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.AdministrativeRole;

import Schema.Organization.Organization;
import Schema.Organization.Organization.OrganizationType;
import Schema.Organization.OrganizationDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author asr
 */
public class ManageOrganizationJPanel extends javax.swing.JPanel {
    private OrganizationDirectory orgDir;
    private JPanel upContainer;
    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ManageOrganizationJPanel(JPanel upContainer,OrganizationDirectory orgDir) {
        initComponents();
                this.upContainer = upContainer;
        this.orgDir = orgDir;
        
        populateTable();
        populateCombo(); }

            private void populateCombo(){
        orgtypeCmbBox.removeAllItems();
        for (OrganizationType type : Organization.OrganizationType.values()){
            if (!type.getValue().equals(OrganizationType.Admin.getValue()))
                orgtypeCmbBox.addItem(type);
        }
    }
            
                private void populateTable(){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        model.setRowCount(0);
        
        for (Organization organization : orgDir.getOrganizationList()){
            Object[] row = new Object[2];
            row[0] = organization.getOrganizationID();
            row[1] = organization.getName();
            
            model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        headerLbl = new javax.swing.JLabel();
        orgtypeLbl = new javax.swing.JLabel();
        orgtypeCmbBox = new javax.swing.JComboBox();
        backBtn = new javax.swing.JButton();
        addOrgBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
        }

        headerLbl.setBackground(new java.awt.Color(204, 204, 255));
        headerLbl.setFont(new java.awt.Font("Telugu MN", 3, 36)); // NOI18N
        headerLbl.setForeground(new java.awt.Color(0, 102, 102));
        headerLbl.setText("Manage Organization");

        orgtypeLbl.setFont(new java.awt.Font("Telugu MN", 2, 18)); // NOI18N
        orgtypeLbl.setText("Organization Type:");

        orgtypeCmbBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        backBtn.setFont(new java.awt.Font("Telugu MN", 2, 18)); // NOI18N
        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        addOrgBtn.setFont(new java.awt.Font("Telugu MN", 2, 18)); // NOI18N
        addOrgBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/R.png"))); // NOI18N
        addOrgBtn.setText("Add Organization");
        addOrgBtn.setMaximumSize(new java.awt.Dimension(1182, 1086));
        addOrgBtn.setMinimumSize(new java.awt.Dimension(1182, 1086));
        addOrgBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrgBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(headerLbl)
                .addGap(430, 430, 430))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(532, 532, 532)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(backBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(addOrgBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(orgtypeLbl)
                                .addGap(34, 34, 34)
                                .addComponent(orgtypeCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(382, 382, 382)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(headerLbl)
                .addGap(62, 62, 62)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orgtypeLbl)
                    .addComponent(orgtypeCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addOrgBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(490, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addOrgBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrgBtnActionPerformed
        OrganizationType type = (OrganizationType) orgtypeCmbBox.getSelectedItem();
        orgDir.createOrganization(type);
        populateTable();        // TODO add your handling code here:
    }//GEN-LAST:event_addOrgBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        upContainer.remove(this);
        CardLayout crd = (CardLayout) upContainer.getLayout();
        crd.previous(upContainer);        // TODO add your handling code here:
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addOrgBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel headerLbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox orgtypeCmbBox;
    private javax.swing.JLabel orgtypeLbl;
    // End of variables declaration//GEN-END:variables
}
