package sma_project;

import java.text.DecimalFormat;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class PackageModifyFrame extends javax.swing.JFrame {
    List<PackCategory> PackageCategoryList;
    List<ShipCategory> ShippingCategoryList;
    List<Location> LocationList; 
    List<Client> ClientList;
    List<Employee> EmployeeList;
    DecimalFormat df = new DecimalFormat("#.00");
    public PackageModifyFrame() {
        initComponents();
    }

    PackageModifyFrame(Package pack) {
        initComponents();
        PackageModifyFrame_PidTF.setText(""+pack.getPackId());
        PackageModifyFrame_WeightTF.setText(""+pack.getPackWeight());
        PackageModifyFrame_TotalChargeTF.setText(""+pack.getTotalCharge());
        PackageModifyFrame_SenderNTF.setText(pack.getCenderName());
        PackageModifyFrame_ReceiverNTF.setText(pack.getReceiverName());
        PackageModifyFrame_TelNumTF.setText(pack.getPhoneNumber());
        PackageModifyFrame_DestinationTF.setText(pack.getDestination());
        PackageCategoryList = ProjectOracleConnection.PackCatSearchListOracle();
        ShippingCategoryList = ProjectOracleConnection.ShipCatSearchListOracle();
        LocationList = ProjectOracleConnection.LocationSearchListOracle(); 
        ClientList = ProjectOracleConnection.ClientSearchListOracle();
        EmployeeList = ProjectOracleConnection.EmployeeSearchListOracle();        
        String[] PackCat = new String[PackageCategoryList.size()];
        String[] ShipCat = new String[ShippingCategoryList.size()];
        String[] Location = new String[LocationList.size()];
        String[] Client = new String[ClientList.size()];
        String[] Employee = new String[EmployeeList.size()];
        PackCategory TempPackCat = new PackCategory();  
        ShipCategory TempShipCat = new ShipCategory(); 
        Location TempLocation = new Location(); 
        Client TempClient = new Client();
        Employee TempEmployee = new Employee();
        
        for (int i = 0 ; i < PackageCategoryList.size(); i++)
        { 
            TempPackCat = PackageCategoryList.get(i); 
            PackCat[i] = TempPackCat.getPackCatDesc()+ " $" + df.format(TempPackCat.getPackCatPrice());
        } 
        DefaultComboBoxModel PackCatModel = new DefaultComboBoxModel(PackCat);  
        PackageModifyFrame_PakCatCoB.setModel(PackCatModel);
        
        for (int i = 0 ; i < ShippingCategoryList.size(); i++)
        { 
            TempShipCat = ShippingCategoryList.get(i); 
            ShipCat[i] = TempShipCat.getShipCatDesc()+ " $" + df.format(TempShipCat.getShipCatPrice());
        } 
        DefaultComboBoxModel ShipCatmodel = new DefaultComboBoxModel(ShipCat);  
        PackageModifyFrame_ShipCatCoB.setModel(ShipCatmodel);
        
        for (int i = 0 ; i < LocationList.size(); i++)
        { 
            TempLocation = LocationList.get(i); 
            Location[i] = TempLocation.getLocationDesc()+ " $" + df.format(TempLocation.getLocationPrice());
        } 
        DefaultComboBoxModel LocationModel = new DefaultComboBoxModel(Location);  
        PackageModifyFrame_LocaCoB.setModel(LocationModel);       

        for (int i = 0 ; i < ClientList.size(); i++)
        { 
            TempClient = ClientList.get(i); 
            Client[i] = String.format("%03d", TempClient.getClientId()) + " " + TempClient.getClientLName() + ", " + TempClient.getClientFName();
        } 
        DefaultComboBoxModel ClientModel = new DefaultComboBoxModel(Client);  
        PackageModifyFrame_ClientIdCoB.setModel(ClientModel);     
        
        for (int i = 0 ; i < EmployeeList.size(); i++)
        { 
            TempEmployee = EmployeeList.get(i); 
            Employee[i] = String.format("%03d", TempEmployee.getEmployeeId())+ " " + TempEmployee.getEmployeeLName()+ ", " + TempEmployee.getEmployeeFName();
        } 
        DefaultComboBoxModel EmployeeModel = new DefaultComboBoxModel(Employee);  
        PackageModifyFrame_EmpIdCoB.setModel(EmployeeModel);        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        PackageModifyFrame_CancelB = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        PackageModifyFrame_SenderNTF = new javax.swing.JTextField();
        PackageModifyFrame_ReceiverNTF = new javax.swing.JTextField();
        PackageModifyFrame_TelNumTF = new javax.swing.JTextField();
        PackageModifyFrame_DestinationTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PackageModifyFrame_SaveB = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        PackageModifyFrame_PidTF = new javax.swing.JTextField();
        PackageModifyFrame_WeightTF = new javax.swing.JTextField();
        PackageModifyFrame_TotalChargeTF = new javax.swing.JTextField();
        PackageModifyFrame_PakCatCoB = new javax.swing.JComboBox<>();
        PackageModifyFrame_LocaCoB = new javax.swing.JComboBox<>();
        PackageModifyFrame_ShipCatCoB = new javax.swing.JComboBox<>();
        PackageModifyFrame_ClientIdCoB = new javax.swing.JComboBox<>();
        PackageModifyFrame_EmpIdCoB = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Create New Package");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Receiver Name:");

        PackageModifyFrame_CancelB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PackageModifyFrame_CancelB.setText("Cancel");
        PackageModifyFrame_CancelB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PackageModifyFrame_CancelBActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Destination:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel6.setText("Modify Package Information");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Employee ID:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Phone Number:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Client ID:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Sender Name: ");

        PackageModifyFrame_SaveB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PackageModifyFrame_SaveB.setText("Save");
        PackageModifyFrame_SaveB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PackageModifyFrame_SaveBActionPerformed(evt);
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
        jLabel13.setText("Total Charge:");

        PackageModifyFrame_PidTF.setEditable(false);

        PackageModifyFrame_TotalChargeTF.setEditable(false);

        PackageModifyFrame_PakCatCoB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        PackageModifyFrame_LocaCoB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        PackageModifyFrame_ShipCatCoB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        PackageModifyFrame_ClientIdCoB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        PackageModifyFrame_EmpIdCoB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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
                                .addComponent(PackageModifyFrame_PidTF, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(PackageModifyFrame_WeightTF, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                    .addComponent(PackageModifyFrame_TotalChargeTF))))
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PackageModifyFrame_ShipCatCoB, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(PackageModifyFrame_PakCatCoB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PackageModifyFrame_LocaCoB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PackageModifyFrame_SenderNTF, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                    .addComponent(PackageModifyFrame_ReceiverNTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PackageModifyFrame_TelNumTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(PackageModifyFrame_DestinationTF, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                    .addComponent(PackageModifyFrame_ClientIdCoB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(PackageModifyFrame_EmpIdCoB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PackageModifyFrame_SaveB, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PackageModifyFrame_CancelB, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(220, 220, 220))
            .addGroup(layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel6)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(PackageModifyFrame_ClientIdCoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(PackageModifyFrame_SenderNTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(PackageModifyFrame_ReceiverNTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(PackageModifyFrame_TelNumTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PackageModifyFrame_ShipCatCoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(PackageModifyFrame_DestinationTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(PackageModifyFrame_EmpIdCoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(PackageModifyFrame_PidTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(PackageModifyFrame_PakCatCoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(PackageModifyFrame_LocaCoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(PackageModifyFrame_WeightTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(PackageModifyFrame_TotalChargeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PackageModifyFrame_SaveB)
                    .addComponent(PackageModifyFrame_CancelB))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PackageModifyFrame_CancelBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PackageModifyFrame_CancelBActionPerformed
        dispose();
    }//GEN-LAST:event_PackageModifyFrame_CancelBActionPerformed

    private void PackageModifyFrame_SaveBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PackageModifyFrame_SaveBActionPerformed
        double shipCatPrice = 0, packCatPrice = 0, locationPrice = 0; 
        double weight;
        weight = Double.parseDouble(PackageModifyFrame_WeightTF.getText());
        Package pack = new Package();
        pack.setPackId(Long.parseLong(PackageModifyFrame_PidTF.getText()));
        pack.setPackWeight(weight);
        pack.setCenderName(PackageModifyFrame_SenderNTF.getText());
        pack.setReceiverName(PackageModifyFrame_ReceiverNTF.getText());
        pack.setPhoneNumber(PackageModifyFrame_TelNumTF.getText());
        pack.setDestination(PackageModifyFrame_DestinationTF.getText());
        pack.setPackCatId(PackageCategoryList.get(PackageModifyFrame_PakCatCoB.getSelectedIndex()).getPackCatId());
        pack.setLocationId(LocationList.get(PackageModifyFrame_LocaCoB.getSelectedIndex()).getLocationId());
        pack.setShipCatId(ShippingCategoryList.get(PackageModifyFrame_ShipCatCoB.getSelectedIndex()).getShipCatId());
        pack.setClientId(ClientList.get(PackageModifyFrame_ClientIdCoB.getSelectedIndex()).getClientId());
        pack.setEmployeeId(EmployeeList.get(PackageModifyFrame_EmpIdCoB.getSelectedIndex()).getEmployeeId());
        shipCatPrice = ShippingCategoryList.get(PackageModifyFrame_ShipCatCoB.getSelectedIndex()).getShipCatPrice();
        packCatPrice = PackageCategoryList.get(PackageModifyFrame_PakCatCoB.getSelectedIndex()).getPackCatPrice();
        locationPrice = LocationList.get(PackageModifyFrame_LocaCoB.getSelectedIndex()).getLocationPrice();
        Calculate cal = new Calculate(weight,shipCatPrice,packCatPrice,locationPrice);
        PackageModifyFrame_TotalChargeTF.setText(df.format(cal.totalCharge));
        pack.setTotalCharge(cal.totalCharge);
        
        ProjectOracleConnection.PackageUpdateOracle(pack);
        JOptionPane.showMessageDialog(null, "Successfully modified", "Record Modify", JOptionPane.INFORMATION_MESSAGE);
        dispose();           
        PackageListFrame.packageInfo.dispose();
        List<Package> PackageArrayList = ProjectOracleConnection.PackageSearchListOracle();
        MainJFrame.pack.updataPackageListFrame(PackageArrayList);

    }//GEN-LAST:event_PackageModifyFrame_SaveBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PackageModifyFrame_CancelB;
    private javax.swing.JComboBox<String> PackageModifyFrame_ClientIdCoB;
    private javax.swing.JTextField PackageModifyFrame_DestinationTF;
    private javax.swing.JComboBox<String> PackageModifyFrame_EmpIdCoB;
    private javax.swing.JComboBox<String> PackageModifyFrame_LocaCoB;
    private javax.swing.JComboBox<String> PackageModifyFrame_PakCatCoB;
    private javax.swing.JTextField PackageModifyFrame_PidTF;
    private javax.swing.JTextField PackageModifyFrame_ReceiverNTF;
    private javax.swing.JButton PackageModifyFrame_SaveB;
    private javax.swing.JTextField PackageModifyFrame_SenderNTF;
    private javax.swing.JComboBox<String> PackageModifyFrame_ShipCatCoB;
    private javax.swing.JTextField PackageModifyFrame_TelNumTF;
    private javax.swing.JTextField PackageModifyFrame_TotalChargeTF;
    private javax.swing.JTextField PackageModifyFrame_WeightTF;
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
