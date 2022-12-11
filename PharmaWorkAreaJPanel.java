/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.PharmacyRole;

import Schema.Enterprise.Enterprise;
import Schema.Network.Network;
import Schema.Organization.Organization;
import Schema.Organization.PharmacyOrganization;
import Schema.PharmaInventory.PharmaInventory;
import Schema.PharmaInventory.PharmaInventoryList;
import Schema.UserAccount.UserAccount;
import Schema.WorkQueue.PharmacyWorkRequest;
import Schema.WorkQueue.SupplierWorkRequest;
import Schema.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author amruthaedara
 */
public class PharmaWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel upContainer;
    private UserAccount ua;
    private Enterprise ent;
    private PharmaInventoryList pil;
    private Organization org;
    private PharmacyOrganization pharmorg;
    private Network network;

    /**
     * Creates new form PharmaWorkAreaJPanel
     */
    public PharmaWorkAreaJPanel(JPanel userProcessContainer, UserAccount ua, Enterprise enterprise, PharmacyOrganization org, Network network) {
        initComponents();
        this.upContainer=userProcessContainer;
        this.ua=ua;
        this.ent=enterprise;
        this.pil= pil;
       // this.org=(Phar)
        this.pharmorg=(PharmacyOrganization) ;
        this.network=network;
        refreshTable();
        populateDoctorTable();
    }

     public void refreshTable(){
      
       int rowCount = jTable1.getRowCount();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
      for(PharmaInventory pi : pharmorg.getMedList()){
            Object row[] = new Object[6];
            row[0] = pi;
            row[1] = pi.getSerialNumber();
            row[2]= pi.getAvailableQuantity();
            row[3]=pi.getRequiredQuantity();
            row[4]= pi.getReorderLevel();
            row[5]=pi.getReorderStatus();
            model.addRow(row);
        }
      
      }   
     
     public void populateDoctorTable(){
         System.out.println("ikkada");
          DefaultTableModel model = (DefaultTableModel)docReqTbl.getModel();
            model.setRowCount(0);
            for(WorkRequest request : pharmorg.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[4];
            String medication = ((PharmacyWorkRequest) request).getMedicationName();
            System.out.println("****"+medication);
            row[0] = medication;
            int quantity=((PharmacyWorkRequest) request).getQuantity();
            row[1] = quantity;
            row[2] = ((PharmacyWorkRequest) request).getStatus();
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        serialnumLbl = new javax.swing.JLabel();
        serialnumTxt = new javax.swing.JTextField();
        mednameLbl = new javax.swing.JLabel();
        mednameTxt = new javax.swing.JTextField();
        availQtyLbl = new javax.swing.JLabel();
        availQtyTxt = new javax.swing.JTextField();
        reqQtyLbl = new javax.swing.JLabel();
        reqQtyTxt = new javax.swing.JTextField();
        recorderLbl = new javax.swing.JLabel();
        recorderTxt = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        addmedBtn = new javax.swing.JButton();
        viewdetailsBtn = new javax.swing.JButton();
        viewreqBtn = new javax.swing.JButton();
        viewreqfromDocBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        docReqTbl = new javax.swing.JTable();
        invStatusCheckBtn = new javax.swing.JButton();

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Telugu MN", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/R.png"))); // NOI18N
        jLabel1.setText("PHARMACY MEDICINE INVENTORY LOG");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MEDICINE NAME", "SERIAL NUMBER", "AVAILABLE QUANTITY", "REQUIRED QUANTITY", "REORDER LEVEL", "REORDER STATUS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        serialnumLbl.setFont(new java.awt.Font("Telugu MN", 2, 20)); // NOI18N
        serialnumLbl.setText("SERIAL NUMBER:");

        mednameLbl.setFont(new java.awt.Font("Telugu MN", 2, 20)); // NOI18N
        mednameLbl.setText("MEDICNE NAME:");

        availQtyLbl.setFont(new java.awt.Font("Telugu MN", 2, 20)); // NOI18N
        availQtyLbl.setText("AVAILABLE QUANTITY:");

        reqQtyLbl.setFont(new java.awt.Font("Telugu MN", 2, 20)); // NOI18N
        reqQtyLbl.setText("REQUIRED QUANTITY:");

        recorderLbl.setFont(new java.awt.Font("Telugu MN", 2, 20)); // NOI18N
        recorderLbl.setText("REORDER LEVEL:");

        backBtn.setFont(new java.awt.Font("Telugu MN", 2, 18)); // NOI18N
        backBtn.setText("<<BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        addmedBtn.setFont(new java.awt.Font("Telugu MN", 2, 18)); // NOI18N
        addmedBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/R.png"))); // NOI18N
        addmedBtn.setText("ADD MEDICINE");
        addmedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addmedBtnActionPerformed(evt);
            }
        });

        viewdetailsBtn.setFont(new java.awt.Font("Telugu MN", 2, 18)); // NOI18N
        viewdetailsBtn.setText("VIEW DETAILS >>");
        viewdetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewdetailsBtnActionPerformed(evt);
            }
        });

        viewreqBtn.setFont(new java.awt.Font("Telugu MN", 2, 18)); // NOI18N
        viewreqBtn.setText("VIEW REQUESTS");
        viewreqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewreqBtnActionPerformed(evt);
            }
        });

        viewreqfromDocBtn.setFont(new java.awt.Font("Telugu MN", 2, 18)); // NOI18N
        viewreqfromDocBtn.setText("VIEW REQUESTS FROM DOCTORS");

        jLabel2.setFont(new java.awt.Font("Telugu MN", 3, 18)); // NOI18N
        jLabel2.setText("View Requests from Doctor:");

        docReqTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MEDICINE NAME", "QUANTITY", "STATUS"
            }
        ));
        jScrollPane3.setViewportView(docReqTbl);

        invStatusCheckBtn.setFont(new java.awt.Font("Telugu MN", 2, 18)); // NOI18N
        invStatusCheckBtn.setText("IINVENTORY STATUS CHECK!");
        invStatusCheckBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invStatusCheckBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(631, 631, 631)
                        .addComponent(jLabel1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(468, 468, 468)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1025, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(invStatusCheckBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(617, 617, 617)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(mednameLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(recorderLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(reqQtyLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(availQtyLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                                    .addComponent(serialnumLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(serialnumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(reqQtyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(availQtyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(recorderTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mednameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addmedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(286, 286, 286)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viewdetailsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewreqBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewreqfromDocBtn)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(527, 527, 527)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(640, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(invStatusCheckBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(serialnumLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(serialnumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mednameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mednameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11))
                    .addComponent(viewdetailsBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(availQtyLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(availQtyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(viewreqBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(reqQtyLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reqQtyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(viewreqfromDocBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(recorderTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(recorderLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addmedBtn)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1521, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void invStatusCheckBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invStatusCheckBtnActionPerformed
for(PharmaInventory mi : pharmorg.getMedList()){

            if(mi.getAvailableQuantity()<=mi.getReorderLevel()){
                if(!mi.getReorderStatus().equals("Y")){
                    SupplierWorkRequest request=new SupplierWorkRequest();

                    mi.setReorderStatus("Y");
                    request.setMedicationName(mi.getMedicineName());
                    request.setQuantity(mi.getRequiredQuantity());
                    request.setSender(ua);

                    ua.getWorkQueue().getWorkRequestList().add(request);
                    for(Enterprise enterprise :network.getEnterpriseDirectory().getEnterpriseList() ){
                        System.out.println("***** Organization Name:" +enterprise.getName());
                        for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationList()){
                            System.out.println("***** Organization Name:" +organization.getName());
                            if(organization.getName().equals("Supplier Organization")){
                                System.out.println("True");
                                
                                    System.out.println("***** organization Name"+organization.getName());
                                   
                                        organization.getWorkQueue().getWorkRequestList().add(request);
                                    }
                                }

                            }

                        }

                    }
                }
             JOptionPane.showMessageDialog(null, "Status of inventory checked and updated!", "Warning", JOptionPane.INFORMATION_MESSAGE);        // TODO add your handling code here:
    }//GEN-LAST:event_invStatusCheckBtnActionPerformed

    private void addmedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addmedBtnActionPerformed
PharmaInventory p=new PharmaInventory();
       String name=mednameTxt.getText();
       String error_message="";
       String avail=availQtyTxt.getText();
       try{
          Integer.parseInt(avail);
       }
       catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null,"Please provide valid data in Available Quantity");
          return;
       }
       p.setMedicineName(mednameTxt.getText());
       int availableQuantity= Integer.parseInt(availQtyTxt.getText());
       p.setAvailableQuantity(availableQuantity);
       String serialnumber=serialnumTxt.getText();
       try{
           Integer.parseInt(serialnumber);
       }
       catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null,"Serial Number must be integer!");
           return;
       }
       int serialNumber= Integer.parseInt(serialnumTxt.getText());
       p.setSerialNumber(serialNumber);
       String req=reqQtyTxt.getText();
       try
       {
        Integer.parseInt(req);
       }
       catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null,"Required quantity must be integer!");
           return;
       }
       int requiredQuantity= Integer.parseInt(reqQtyTxt.getText());
       p.setRequiredQuantity(requiredQuantity);
       
       String reorder=recorderTxt.getText();
       try
       {
        Integer.parseInt(reorder);
       }
       catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null,"Reorder level must be integer!");
           return;
       }
       int reorderLevel= Integer.parseInt(recorderTxt.getText());
       p.setReorderLevel(reorderLevel);
       pharmorg.addMedicine(p);
       p.setReorderStatus("N");

       
        DefaultTableModel dtm =(DefaultTableModel) jTable1.getModel();

        dtm.setRowCount(0);
        for(PharmaInventory pi : pharmorg.getMedList()){
            Object row[] = new Object[5];
            row[0] = pi;
            row[1] = pi.getSerialNumber();
            row[2]= pi.getAvailableQuantity();
            row[3]=pi.getRequiredQuantity();
            row[4]= pi.getReorderLevel();
            dtm.addRow(row);
        }

        JOptionPane.showMessageDialog(null, "Medicine Added Successfully", "Warning", JOptionPane.INFORMATION_MESSAGE);        // TODO add your handling code here:
    }//GEN-LAST:event_addmedBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
upContainer.remove(this);
        CardLayout layout = (CardLayout) upContainer.getLayout();
        layout.previous(upContainer);        // TODO add your handling code here:
    }//GEN-LAST:event_backBtnActionPerformed

    private void viewdetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewdetailsBtnActionPerformed
int row = jTable1.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Pls select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        PharmaInventory pi = (PharmaInventory)jTable1.getValueAt(row, 0);

        CardLayout layout = (CardLayout) upContainer.getLayout();
        upContainer.add("UpdateEntryJPanel", new UpdateEntryJPanel(upContainer, ua, ent,pi));
        layout.next(upContainer);        // TODO add your handling code here:
    }//GEN-LAST:event_viewdetailsBtnActionPerformed

    private void viewreqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewreqBtnActionPerformed
CardLayout layout = (CardLayout) upContainer.getLayout();
        upContainer.add("ViewrequestJPanel", new ViewrequestJPanel( upContainer, ua, ent, org));
        layout.next(upContainer);        // TODO add your handling code here:
    }//GEN-LAST:event_viewreqBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addmedBtn;
    private javax.swing.JLabel availQtyLbl;
    private javax.swing.JTextField availQtyTxt;
    private javax.swing.JButton backBtn;
    private javax.swing.JTable docReqTbl;
    private javax.swing.JButton invStatusCheckBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel mednameLbl;
    private javax.swing.JTextField mednameTxt;
    private javax.swing.JLabel recorderLbl;
    private javax.swing.JTextField recorderTxt;
    private javax.swing.JLabel reqQtyLbl;
    private javax.swing.JTextField reqQtyTxt;
    private javax.swing.JLabel serialnumLbl;
    private javax.swing.JTextField serialnumTxt;
    private javax.swing.JButton viewdetailsBtn;
    private javax.swing.JButton viewreqBtn;
    private javax.swing.JButton viewreqfromDocBtn;
    // End of variables declaration//GEN-END:variables
}
