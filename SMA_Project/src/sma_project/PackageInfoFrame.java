package sma_project;
import java.util.List;
import javax.swing.JOptionPane;

public class PackageInfoFrame extends javax.swing.JFrame {


    public PackageInfoFrame() {
        initComponents();
        
    }
    PackageInfoFrame(Package pack){
        initComponents();
        PackageInfoFrame_PidTF.setText(""+pack.getPackId());
        PackageAddFrame_PakCatTF.setText(""+pack.getPackCatId());
        PackageAddFrame_LocaTF.setText(""+pack.getLocationId());
        PackageAddFrame_ShipCatTF.setText(""+pack.getShipCatId());
        PackageInfoFrame_WeightTF.setText(""+pack.getPackWeight());
        PackageInfoFrame_TotalChargeTF.setText(""+pack.getTotalCharge());
        PackageAddFrame_ClientIdTF.setText(""+pack.getClientId());
        PackageInfoFrame_SenderNTF.setText(pack.getCenderName());
        PackageInfoFrame_ReceiverNTF.setText(pack.getReceiverName());
        PackageInfoFrame_TelNumTF.setText(pack.getPhoneNumber());
        PackageInfoFrame_DestinationTF.setText(pack.getDestination());
        PackageAddFrame_EmpIdTF.setText(""+pack.getEmployeeId());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        PackageInfoFrame_CancelB = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        PackageInfoFrame_SenderNTF = new javax.swing.JTextField();
        PackageInfoFrame_ReceiverNTF = new javax.swing.JTextField();
        PackageInfoFrame_TelNumTF = new javax.swing.JTextField();
        PackageInfoFrame_DestinationTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PackageInfoFrame_DelB = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        PackageInfoFrame_PidTF = new javax.swing.JTextField();
        PackageInfoFrame_WeightTF = new javax.swing.JTextField();
        PackageInfoFrame_TotalChargeTF = new javax.swing.JTextField();
        PackageInfoFrame_EditB = new javax.swing.JButton();
        PackageAddFrame_PakCatTF = new javax.swing.JTextField();
        PackageAddFrame_LocaTF = new javax.swing.JTextField();
        PackageAddFrame_ShipCatTF = new javax.swing.JTextField();
        PackageAddFrame_ClientIdTF = new javax.swing.JTextField();
        PackageAddFrame_EmpIdTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Create New Package");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Receiver Name:");

        PackageInfoFrame_CancelB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PackageInfoFrame_CancelB.setText("Cancel");
        PackageInfoFrame_CancelB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PackageInfoFrame_CancelBActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Destination:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel6.setText("Package Infomation");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Employee ID:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Phone Number:");

        PackageInfoFrame_SenderNTF.setEditable(false);

        PackageInfoFrame_ReceiverNTF.setEditable(false);

        PackageInfoFrame_TelNumTF.setEditable(false);

        PackageInfoFrame_DestinationTF.setEditable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Client ID:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Sender Name: ");

        PackageInfoFrame_DelB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PackageInfoFrame_DelB.setText("Delete");
        PackageInfoFrame_DelB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PackageInfoFrame_DelBActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Package ID:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Package Category: ");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Location:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Shipping Method:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Weight (Lb):");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Total Charge:      $");

        PackageInfoFrame_PidTF.setEditable(false);

        PackageInfoFrame_WeightTF.setEditable(false);

        PackageInfoFrame_TotalChargeTF.setEditable(false);

        PackageInfoFrame_EditB.setText("Edit");
        PackageInfoFrame_EditB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PackageInfoFrame_EditBActionPerformed(evt);
            }
        });

        PackageAddFrame_PakCatTF.setEditable(false);

        PackageAddFrame_LocaTF.setEditable(false);

        PackageAddFrame_ShipCatTF.setEditable(false);

        PackageAddFrame_ClientIdTF.setEditable(false);

        PackageAddFrame_EmpIdTF.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(PackageInfoFrame_PidTF, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(PackageInfoFrame_WeightTF, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                    .addComponent(PackageInfoFrame_TotalChargeTF))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PackageAddFrame_LocaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PackageAddFrame_PakCatTF, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PackageAddFrame_ShipCatTF, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PackageInfoFrame_SenderNTF, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PackageInfoFrame_ReceiverNTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PackageInfoFrame_TelNumTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PackageInfoFrame_DestinationTF, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PackageAddFrame_ClientIdTF, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PackageAddFrame_EmpIdTF, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PackageInfoFrame_EditB, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PackageInfoFrame_DelB, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PackageInfoFrame_CancelB, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172))
            .addGroup(layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel6)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(PackageAddFrame_ClientIdTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(PackageInfoFrame_SenderNTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(PackageInfoFrame_ReceiverNTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(PackageInfoFrame_TelNumTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(PackageInfoFrame_DestinationTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(PackageAddFrame_EmpIdTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(PackageInfoFrame_PidTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(PackageAddFrame_PakCatTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(PackageAddFrame_LocaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(PackageAddFrame_ShipCatTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(PackageInfoFrame_WeightTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(PackageInfoFrame_TotalChargeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PackageInfoFrame_DelB)
                        .addComponent(PackageInfoFrame_CancelB))
                    .addComponent(PackageInfoFrame_EditB))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PackageInfoFrame_CancelBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PackageInfoFrame_CancelBActionPerformed
        dispose();
    }//GEN-LAST:event_PackageInfoFrame_CancelBActionPerformed

    private void PackageInfoFrame_EditBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PackageInfoFrame_EditBActionPerformed
        long PackId = Long.parseLong(PackageInfoFrame_PidTF.getText());
        int PackCatId = Integer.parseInt(PackageAddFrame_PakCatTF.getText());
        int LocationId = Integer.parseInt(PackageAddFrame_LocaTF.getText());
        int ShipCatId = Integer.parseInt(PackageAddFrame_ShipCatTF.getText());
        double PackWeight = Double.parseDouble(PackageInfoFrame_WeightTF.getText());
        double TotalCharge = Double.parseDouble(PackageInfoFrame_TotalChargeTF.getText());
        int ClientId = Integer.parseInt(PackageAddFrame_ClientIdTF.getText());
        String CenderName = PackageInfoFrame_SenderNTF.getText();
        String ReceiverName = PackageInfoFrame_ReceiverNTF.getText();
        String PhoneNumber = PackageInfoFrame_TelNumTF.getText();
        String Destination = PackageInfoFrame_DestinationTF.getText();
        int EmployeeId = Integer.parseInt(PackageAddFrame_EmpIdTF.getText());
        int Maxid = ProjectOracleConnection.MaxPackageIDSearchOracle();

        Package pack = new Package(PackId, PackCatId, LocationId, ShipCatId, 
                                PackWeight, TotalCharge, ClientId, CenderName, 
                                ReceiverName, PhoneNumber, Destination, EmployeeId, Maxid);
        PackageModifyFrame packModify = new PackageModifyFrame(pack);
        packModify.setVisible(true);
    }//GEN-LAST:event_PackageInfoFrame_EditBActionPerformed

    private void PackageInfoFrame_DelBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PackageInfoFrame_DelBActionPerformed
        JOptionPane.showConfirmDialog(null, "This record will be deleted\nDo you want continue? ", "Record delete confirm", JOptionPane.YES_NO_OPTION);
        int selectedOption = 0;
        if (selectedOption == JOptionPane.YES_OPTION) {
            ProjectOracleConnection.PackageDeleteOracle(Long.parseLong(PackageInfoFrame_PidTF.getText()));
            JOptionPane.showMessageDialog(null, "The record has been deleted.", "Record delete", JOptionPane.INFORMATION_MESSAGE);
            dispose();
            List<Package> PackageArrayList = ProjectOracleConnection.PackageSearchListOracle();
            MainJFrame.pack.updataPackageListFrame(PackageArrayList);
        }
    }//GEN-LAST:event_PackageInfoFrame_DelBActionPerformed
    public void updataFrame(Package pack){
        PackageInfoFrame_PidTF.setText(""+pack.getPackId());
        PackageAddFrame_PakCatTF.setText(""+pack.getPackCatId());
        PackageAddFrame_LocaTF.setText(""+pack.getLocationId());
        PackageAddFrame_ShipCatTF.setText(""+pack.getShipCatId());
        PackageInfoFrame_WeightTF.setText(""+pack.getPackWeight());
        PackageInfoFrame_TotalChargeTF.setText(""+pack.getTotalCharge());
        PackageAddFrame_ClientIdTF.setText(String.format("%03d", pack.getClientId()));
        PackageInfoFrame_SenderNTF.setText(pack.getCenderName());
        PackageInfoFrame_ReceiverNTF.setText(pack.getReceiverName());
        PackageInfoFrame_TelNumTF.setText(pack.getPhoneNumber());
        PackageInfoFrame_DestinationTF.setText(pack.getDestination());
        PackageAddFrame_EmpIdTF.setText(String.format("%03d", pack.getEmployeeId()));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PackageAddFrame_ClientIdTF;
    private javax.swing.JTextField PackageAddFrame_EmpIdTF;
    private javax.swing.JTextField PackageAddFrame_LocaTF;
    private javax.swing.JTextField PackageAddFrame_PakCatTF;
    private javax.swing.JTextField PackageAddFrame_ShipCatTF;
    private javax.swing.JButton PackageInfoFrame_CancelB;
    private javax.swing.JButton PackageInfoFrame_DelB;
    private javax.swing.JTextField PackageInfoFrame_DestinationTF;
    private javax.swing.JButton PackageInfoFrame_EditB;
    private javax.swing.JTextField PackageInfoFrame_PidTF;
    private javax.swing.JTextField PackageInfoFrame_ReceiverNTF;
    private javax.swing.JTextField PackageInfoFrame_SenderNTF;
    private javax.swing.JTextField PackageInfoFrame_TelNumTF;
    private javax.swing.JTextField PackageInfoFrame_TotalChargeTF;
    private javax.swing.JTextField PackageInfoFrame_WeightTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

}
