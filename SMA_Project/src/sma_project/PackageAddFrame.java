
package sma_project;

import java.text.DecimalFormat;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class PackageAddFrame extends javax.swing.JFrame {
    int Maxid;
    String Id_str;
    List<Package> PackageList;   
    List<PackCategory> PackageCategoryList;
    List<ShipCategory> ShippingCategoryList;
    List<Location> LocationList; 
    List<Client> ClientList;
    List<Employee> EmployeeList;
    DecimalFormat df = new DecimalFormat("#.00");
    public PackageAddFrame() {
        initComponents(); 
        Maxid = ProjectOracleConnection.MaxPackageIDSearchOracle();
        Id_str = String.format("%03d",Maxid + 1);
        PackageAddFrame_PidTF.setText(Id_str);
        
        PackageList = ProjectOracleConnection.PackageSearchListOracle();   
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
        PackageAddFrame_PakCatCoB.setModel(PackCatModel);
        
        for (int i = 0 ; i < ShippingCategoryList.size(); i++)
        { 
            TempShipCat = ShippingCategoryList.get(i); 
            ShipCat[i] = TempShipCat.getShipCatDesc()+ " $" + df.format(TempShipCat.getShipCatPrice());
        } 
        DefaultComboBoxModel ShipCatmodel = new DefaultComboBoxModel(ShipCat);  
        PackageAddFrame_ShipCatCoB.setModel(ShipCatmodel);
        
        for (int i = 0 ; i < LocationList.size(); i++)
        { 
            TempLocation = LocationList.get(i); 
            Location[i] = TempLocation.getLocationDesc()+ " $" + df.format(TempLocation.getLocationPrice());
        } 
        DefaultComboBoxModel LocationModel = new DefaultComboBoxModel(Location);  
        PackageAddFrame_LocaCoB.setModel(LocationModel);       

        for (int i = 0 ; i < ClientList.size(); i++)
        { 
            TempClient = ClientList.get(i); 
            Client[i] = String.format("%03d", TempClient.getClientId()) + " " + TempClient.getClientLName() + ", " + TempClient.getClientFName();
        } 
        DefaultComboBoxModel ClientModel = new DefaultComboBoxModel(Client);  
        PackageAddFrame_ClientIdCoB.setModel(ClientModel);     
        
        for (int i = 0 ; i < EmployeeList.size(); i++)
        { 
            TempEmployee = EmployeeList.get(i); 
            Employee[i] = String.format("%03d", TempEmployee.getEmployeeId())+ " " + TempEmployee.getEmployeeLName()+ ", " + TempEmployee.getEmployeeFName();
        } 
        DefaultComboBoxModel EmployeeModel = new DefaultComboBoxModel(Employee);  
        PackageAddFrame_EmpIdCoB.setModel(EmployeeModel);  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        PackageAddFrame_CancelB = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        PackageAddFrame_SenderNTF = new javax.swing.JTextField();
        PackageAddFrame_ReceiverNTF = new javax.swing.JTextField();
        PackageAddFrame_TelNumTF = new javax.swing.JTextField();
        PackageAddFrame_DestinationTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PackageAddFrame_SubmitB = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        PackageAddFrame_PidTF = new javax.swing.JTextField();
        PackageAddFrame_WeightTF = new javax.swing.JTextField();
        PackageAddFrame_TotalChargeTF = new javax.swing.JTextField();
        PackageAddFrame_PakCatCoB = new javax.swing.JComboBox<>();
        PackageAddFrame_LocaCoB = new javax.swing.JComboBox<>();
        PackageAddFrame_ShipCatCoB = new javax.swing.JComboBox<>();
        PackageAddFrame_ClacluateB = new javax.swing.JButton();
        PackageAddFrame_ClientIdCoB = new javax.swing.JComboBox<>();
        PackageAddFrame_EmpIdCoB = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Create New Package");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Receiver Name:");

        PackageAddFrame_CancelB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PackageAddFrame_CancelB.setText("Cancel");
        PackageAddFrame_CancelB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PackageAddFrame_CancelBActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Destination:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel6.setText("Create New Package");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Employee ID:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Phone Number:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Client ID:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Sender Name: ");

        PackageAddFrame_SubmitB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PackageAddFrame_SubmitB.setText("Submit");
        PackageAddFrame_SubmitB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PackageAddFrame_SubmitBActionPerformed(evt);
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

        PackageAddFrame_PidTF.setEditable(false);

        PackageAddFrame_TotalChargeTF.setEditable(false);

        PackageAddFrame_ClacluateB.setText("Calculate");
        PackageAddFrame_ClacluateB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PackageAddFrame_ClacluateBActionPerformed(evt);
            }
        });

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
                                .addComponent(PackageAddFrame_PidTF, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(PackageAddFrame_WeightTF, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                    .addComponent(PackageAddFrame_TotalChargeTF))))
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PackageAddFrame_ShipCatCoB, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(PackageAddFrame_PakCatCoB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PackageAddFrame_LocaCoB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PackageAddFrame_SenderNTF, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                    .addComponent(PackageAddFrame_ReceiverNTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PackageAddFrame_TelNumTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(PackageAddFrame_DestinationTF, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                    .addComponent(PackageAddFrame_ClientIdCoB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(PackageAddFrame_EmpIdCoB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PackageAddFrame_ClacluateB)
                .addGap(18, 18, 18)
                .addComponent(PackageAddFrame_SubmitB, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PackageAddFrame_CancelB, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172))
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
                            .addComponent(PackageAddFrame_ClientIdCoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(PackageAddFrame_SenderNTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(PackageAddFrame_ReceiverNTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(PackageAddFrame_TelNumTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PackageAddFrame_ShipCatCoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(PackageAddFrame_DestinationTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(PackageAddFrame_EmpIdCoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(PackageAddFrame_PidTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(PackageAddFrame_PakCatCoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(PackageAddFrame_LocaCoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(PackageAddFrame_WeightTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(PackageAddFrame_TotalChargeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PackageAddFrame_SubmitB)
                        .addComponent(PackageAddFrame_CancelB))
                    .addComponent(PackageAddFrame_ClacluateB))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PackageAddFrame_CancelBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PackageAddFrame_CancelBActionPerformed
        dispose();
    }//GEN-LAST:event_PackageAddFrame_CancelBActionPerformed

    private void PackageAddFrame_SubmitBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PackageAddFrame_SubmitBActionPerformed
        long id;
        String Name;
        int PackageCategoryId;
        double Weight;
        String ReceiverName;
        String Destination;
        int LocationId;
        int ShippingCategoryId;
        String Telephone;
        double TotalCharge;
        int ClientId;
        int EmployeeId;
        int ListSize;
        String IdFormat;
        double shipCatPrice = 0, packCatPrice = 0, locationPrice = 0;       
        PackageCategoryId = PackageCategoryList.get(PackageAddFrame_PakCatCoB.getSelectedIndex()).getPackCatId();
        String PackageCategoryIdFormat = String.format("%03d",PackageCategoryId);
        ShippingCategoryId = ShippingCategoryList.get(PackageAddFrame_ShipCatCoB.getSelectedIndex()).getShipCatId();
        String ShippingCategoryIdFormat = String.format("%03d",ShippingCategoryId);
        LocationId = LocationList.get(PackageAddFrame_LocaCoB.getSelectedIndex()).getLocationId();
        String LocationIdFormat = String.format("%03d",LocationId);
//        String ListSizeFormat = String.format("%03d",PackageList.size()+1);
        
        Weight = Double.parseDouble(PackageAddFrame_WeightTF.getText());
        ClientId = ClientList.get(PackageAddFrame_ClientIdCoB.getSelectedIndex()).getClientId();
        Name = PackageAddFrame_SenderNTF.getText();
        ReceiverName = PackageAddFrame_ReceiverNTF.getText();
        Telephone = PackageAddFrame_TelNumTF.getText();
        Destination = PackageAddFrame_DestinationTF.getText();
        EmployeeId = EmployeeList.get(PackageAddFrame_EmpIdCoB.getSelectedIndex()).getEmployeeId();
        shipCatPrice = ShippingCategoryList.get(PackageAddFrame_ShipCatCoB.getSelectedIndex()).getShipCatPrice();
        packCatPrice = PackageCategoryList.get(PackageAddFrame_PakCatCoB.getSelectedIndex()).getPackCatPrice();
        locationPrice = LocationList.get(PackageAddFrame_LocaCoB.getSelectedIndex()).getLocationPrice();
        Calculate cal = new Calculate(Weight,shipCatPrice,packCatPrice,locationPrice);
        PackageAddFrame_TotalChargeTF.setText(df.format(cal.totalCharge));
        TotalCharge = cal.totalCharge;

        IdFormat = PackageCategoryIdFormat + ShippingCategoryIdFormat + LocationIdFormat + Id_str;
//        IdFormat = Integer.toString(PackageCategoryId) + Integer.toString(ShippingCategoryId) + Integer.toString(LocationId) + ListSizeFormat;
        PackageAddFrame_PidTF.setText(IdFormat);
        
        id = Long.parseLong(IdFormat);
        int increaseID = Maxid + 1;
        Package pack = new Package(id, PackageCategoryId, LocationId, ShippingCategoryId, 
                                    Weight, TotalCharge, ClientId, Name, ReceiverName, Telephone, Destination, EmployeeId, increaseID);
        
        ProjectOracleConnection.PackageAddOracle(pack);
        dispose();
    }//GEN-LAST:event_PackageAddFrame_SubmitBActionPerformed

    private void PackageAddFrame_ClacluateBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PackageAddFrame_ClacluateBActionPerformed
        double shipCatPrice = 0, packCatPrice = 0, locationPrice = 0; 
        
        double Weight = Double.parseDouble(PackageAddFrame_WeightTF.getText()); 
        int LocationIndex = PackageAddFrame_LocaCoB.getSelectedIndex();
        int PackageCategoryIndex = PackageAddFrame_PakCatCoB.getSelectedIndex();
        int ShippingCategoryIndex = PackageAddFrame_ShipCatCoB.getSelectedIndex();
        shipCatPrice = ShippingCategoryList.get(ShippingCategoryIndex).getShipCatPrice();
        packCatPrice = PackageCategoryList.get(PackageCategoryIndex).getPackCatPrice();
        locationPrice = LocationList.get(LocationIndex).getLocationPrice();
        Calculate cal = new Calculate(Weight,shipCatPrice,packCatPrice,locationPrice);
        PackageAddFrame_TotalChargeTF.setText(df.format(cal.totalCharge));
    }//GEN-LAST:event_PackageAddFrame_ClacluateBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PackageAddFrame_CancelB;
    private javax.swing.JButton PackageAddFrame_ClacluateB;
    private javax.swing.JComboBox<String> PackageAddFrame_ClientIdCoB;
    private javax.swing.JTextField PackageAddFrame_DestinationTF;
    private javax.swing.JComboBox<String> PackageAddFrame_EmpIdCoB;
    private javax.swing.JComboBox<String> PackageAddFrame_LocaCoB;
    private javax.swing.JComboBox<String> PackageAddFrame_PakCatCoB;
    private javax.swing.JTextField PackageAddFrame_PidTF;
    private javax.swing.JTextField PackageAddFrame_ReceiverNTF;
    private javax.swing.JTextField PackageAddFrame_SenderNTF;
    private javax.swing.JComboBox<String> PackageAddFrame_ShipCatCoB;
    private javax.swing.JButton PackageAddFrame_SubmitB;
    private javax.swing.JTextField PackageAddFrame_TelNumTF;
    private javax.swing.JTextField PackageAddFrame_TotalChargeTF;
    private javax.swing.JTextField PackageAddFrame_WeightTF;
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
