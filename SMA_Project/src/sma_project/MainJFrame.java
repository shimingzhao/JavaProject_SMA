package sma_project;
import java.awt.event.ItemListener;
import java.text.*;
import java.util.*;
import javax.swing.*;

public class MainJFrame extends javax.swing.JFrame {
    static MainJFrame mainFrame;
    List<PackCategory> PackageCategoryList = ProjectOracleConnection.PackCatSearchListOracle();
    List<ShipCategory> ShippingCategoryList = ProjectOracleConnection.ShipCatSearchListOracle();
    List<Location> LocationList = ProjectOracleConnection.LocationSearchListOracle();  
    static EmpListFrame empList;
    static ClientListFrame clientList;
    static PackageListFrame pack;
    static ShipCatListFrame shipCatList;
    static PackCatListFrame packCatList;
    static LocationListFrame locationList;
    DecimalFormat df = new DecimalFormat("#.00");

    PackCategory TempPackCat = new PackCategory();  
    ShipCategory TempShipCat = new ShipCategory(); 
    Location TempLocation = new Location(); 
    public MainJFrame() {
        initComponents();
        String[] PackCat = new String[PackageCategoryList.size()];
        String[] ShipCat = new String[ShippingCategoryList.size()];
        String[] Location = new String[LocationList.size()];
        for (int i = 0 ; i < PackageCategoryList.size(); i++)
        { 
            TempPackCat = PackageCategoryList.get(i); 
            PackCat[i] = TempPackCat.getPackCatDesc()+ " $" + df.format(TempPackCat.getPackCatPrice());
        } 
        DefaultComboBoxModel PackCatModel = new DefaultComboBoxModel(PackCat);  
        CalPackageCCB.setModel(PackCatModel);
        
        for (int i = 0 ; i < ShippingCategoryList.size(); i++)
        { 
            TempShipCat = ShippingCategoryList.get(i); 
            ShipCat[i] = TempShipCat.getShipCatDesc()+ " $" + df.format(TempShipCat.getShipCatPrice());
        } 
        DefaultComboBoxModel ShipCatmodel = new DefaultComboBoxModel(ShipCat);  
        CalShippingCCB.setModel(ShipCatmodel);
        
        for (int i = 0 ; i < LocationList.size(); i++)
        { 
            TempLocation = LocationList.get(i); 
            Location[i] = TempLocation.getLocationDesc()+ " $" + df.format(TempLocation.getLocationPrice());
        } 
        DefaultComboBoxModel LocationModel = new DefaultComboBoxModel(Location);  
        CalLocationCB.setModel(LocationModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CalShippingCCB = new javax.swing.JComboBox();
        CalPackageCCB = new javax.swing.JComboBox();
        CalLocationCB = new javax.swing.JComboBox();
        CalRestB = new javax.swing.JButton();
        CalCalculateB = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        CalOutputTP = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        CalWeightTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        EmpJMenu = new javax.swing.JMenu();
        EmpJMenu_AddItem = new javax.swing.JMenuItem();
        EmpJMenu_ListItem = new javax.swing.JMenuItem();
        EmpJMenu_SearchItem = new javax.swing.JMenuItem();
        ClientJMenu = new javax.swing.JMenu();
        ClientJMenu_AddItem = new javax.swing.JMenuItem();
        ClientJMenu_ListItem = new javax.swing.JMenuItem();
        ClientJMenu_SearchItem = new javax.swing.JMenuItem();
        PackageJMenu = new javax.swing.JMenu();
        PackageJMenu_AddItem = new javax.swing.JMenuItem();
        PackageJMenu_ListItem = new javax.swing.JMenuItem();
        PackageJMenu_SearchItem = new javax.swing.JMenuItem();
        ShippingCJMenu = new javax.swing.JMenu();
        ShippingCJMenu_AddItem = new javax.swing.JMenuItem();
        ShippingCJMenu_ListItem = new javax.swing.JMenuItem();
        ShippingCJMenu_SearchItem = new javax.swing.JMenuItem();
        PackageCJMenu = new javax.swing.JMenu();
        PackageCJMenu_AddItem = new javax.swing.JMenuItem();
        PackageCJMenu_ListItem = new javax.swing.JMenuItem();
        PackageCJMenu_SearchItem = new javax.swing.JMenuItem();
        LocationJMenu = new javax.swing.JMenu();
        LocationJMenu_AddItem = new javax.swing.JMenuItem();
        LocationJMenu_ListItem = new javax.swing.JMenuItem();
        LocationJMenu_SearchItem = new javax.swing.JMenuItem();

        jLabel6.setText("Enter the employee's ID:");

        jTextField2.setText("jTextField2");

        jButton3.setText("jButton3");

        jButton4.setText("jButton4");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(22, 22, 22))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Shipping Management Application");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Shipping Price Calculator"));
        jPanel1.setToolTipText("Shipping Price Calculator");

        jLabel2.setText("Chose Shipping Category: ");

        jLabel3.setText("Chose Location: ");

        jLabel4.setText("Chose Package Category: ");

        CalShippingCCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalShippingCCBActionPerformed(evt);
            }
        });

        CalPackageCCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalPackageCCBActionPerformed(evt);
            }
        });

        CalLocationCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalLocationCBActionPerformed(evt);
            }
        });

        CalRestB.setText("Reset");
        CalRestB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalRestBActionPerformed(evt);
            }
        });

        CalCalculateB.setText("Calculate");
        CalCalculateB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalCalculateBActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(CalOutputTP);

        jLabel5.setText("Enter the Package Weight (Lb): ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CalLocationCB, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CalPackageCCB, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CalShippingCCB, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CalWeightTF, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(CalRestB, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CalCalculateB, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CalWeightTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CalShippingCCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CalPackageCCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CalLocationCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CalRestB)
                            .addComponent(CalCalculateB)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Arial Black", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Shipping Management Application");

        EmpJMenu.setText("Employee Management");

        EmpJMenu_AddItem.setText("Add Employee");
        EmpJMenu_AddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpJMenu_AddItemActionPerformed(evt);
            }
        });
        EmpJMenu.add(EmpJMenu_AddItem);

        EmpJMenu_ListItem.setText("Employee List");
        EmpJMenu_ListItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpJMenu_ListItemActionPerformed(evt);
            }
        });
        EmpJMenu.add(EmpJMenu_ListItem);

        EmpJMenu_SearchItem.setText("Search Employee");
        EmpJMenu_SearchItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmpJMenu_SearchItemMouseClicked(evt);
            }
        });
        EmpJMenu_SearchItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpJMenu_SearchItemActionPerformed(evt);
            }
        });
        EmpJMenu.add(EmpJMenu_SearchItem);

        jMenuBar1.add(EmpJMenu);

        ClientJMenu.setText("| Client Management");

        ClientJMenu_AddItem.setText("Add Client");
        ClientJMenu_AddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientJMenu_AddItemActionPerformed(evt);
            }
        });
        ClientJMenu.add(ClientJMenu_AddItem);

        ClientJMenu_ListItem.setText("Client List");
        ClientJMenu_ListItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientJMenu_ListItemActionPerformed(evt);
            }
        });
        ClientJMenu.add(ClientJMenu_ListItem);

        ClientJMenu_SearchItem.setText("Search Client");
        ClientJMenu_SearchItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientJMenu_SearchItemActionPerformed(evt);
            }
        });
        ClientJMenu.add(ClientJMenu_SearchItem);

        jMenuBar1.add(ClientJMenu);

        PackageJMenu.setText("| Package Management");

        PackageJMenu_AddItem.setText("Add Package");
        PackageJMenu_AddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PackageJMenu_AddItemActionPerformed(evt);
            }
        });
        PackageJMenu.add(PackageJMenu_AddItem);

        PackageJMenu_ListItem.setText("Package List");
        PackageJMenu_ListItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PackageJMenu_ListItemActionPerformed(evt);
            }
        });
        PackageJMenu.add(PackageJMenu_ListItem);

        PackageJMenu_SearchItem.setText("Search Package");
        PackageJMenu_SearchItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PackageJMenu_SearchItemActionPerformed(evt);
            }
        });
        PackageJMenu.add(PackageJMenu_SearchItem);

        jMenuBar1.add(PackageJMenu);

        ShippingCJMenu.setText("| Shipping Category");

        ShippingCJMenu_AddItem.setText("Add Category");
        ShippingCJMenu_AddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShippingCJMenu_AddItemActionPerformed(evt);
            }
        });
        ShippingCJMenu.add(ShippingCJMenu_AddItem);

        ShippingCJMenu_ListItem.setText("Category List");
        ShippingCJMenu_ListItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShippingCJMenu_ListItemActionPerformed(evt);
            }
        });
        ShippingCJMenu.add(ShippingCJMenu_ListItem);

        ShippingCJMenu_SearchItem.setText("Search Category");
        ShippingCJMenu_SearchItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShippingCJMenu_SearchItemActionPerformed(evt);
            }
        });
        ShippingCJMenu.add(ShippingCJMenu_SearchItem);

        jMenuBar1.add(ShippingCJMenu);

        PackageCJMenu.setText("| Package Category");

        PackageCJMenu_AddItem.setText("Add Category");
        PackageCJMenu_AddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PackageCJMenu_AddItemActionPerformed(evt);
            }
        });
        PackageCJMenu.add(PackageCJMenu_AddItem);

        PackageCJMenu_ListItem.setText("Category List");
        PackageCJMenu_ListItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PackageCJMenu_ListItemActionPerformed(evt);
            }
        });
        PackageCJMenu.add(PackageCJMenu_ListItem);

        PackageCJMenu_SearchItem.setText("Search Category");
        PackageCJMenu_SearchItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PackageCJMenu_SearchItemActionPerformed(evt);
            }
        });
        PackageCJMenu.add(PackageCJMenu_SearchItem);

        jMenuBar1.add(PackageCJMenu);

        LocationJMenu.setText("| Location Management");

        LocationJMenu_AddItem.setText("Add Location");
        LocationJMenu_AddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocationJMenu_AddItemActionPerformed(evt);
            }
        });
        LocationJMenu.add(LocationJMenu_AddItem);

        LocationJMenu_ListItem.setText("Location List");
        LocationJMenu_ListItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocationJMenu_ListItemActionPerformed(evt);
            }
        });
        LocationJMenu.add(LocationJMenu_ListItem);

        LocationJMenu_SearchItem.setText("Search Location");
        LocationJMenu_SearchItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocationJMenu_SearchItemActionPerformed(evt);
            }
        });
        LocationJMenu.add(LocationJMenu_SearchItem);

        jMenuBar1.add(LocationJMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EmpJMenu_SearchItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpJMenu_SearchItemActionPerformed
        String id = JOptionPane.showInputDialog("Enter employee ID: ");
        Employee getObj = ProjectOracleConnection.EmployeeSearchOracle(Integer.parseInt(id));
        EmpInfoFrame info = new EmpInfoFrame(getObj);
        info.setVisible(true);
    }//GEN-LAST:event_EmpJMenu_SearchItemActionPerformed

    private void EmpJMenu_SearchItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmpJMenu_SearchItemMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_EmpJMenu_SearchItemMouseClicked

    private void CalRestBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalRestBActionPerformed
        CalWeightTF.setText("");
        CalShippingCCB.setSelectedIndex(0);
        CalPackageCCB.setSelectedIndex(0);
        CalLocationCB.setSelectedIndex(0);
        CalOutputTP.setText("");
    }//GEN-LAST:event_CalRestBActionPerformed

    private void CalShippingCCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalShippingCCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CalShippingCCBActionPerformed

    private void ClientJMenu_SearchItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientJMenu_SearchItemActionPerformed
        String id = JOptionPane.showInputDialog("Enter client ID: ");
        Client getClient = ProjectOracleConnection.ClientSearchOracle(Integer.parseInt(id));
        ClientInfoFrame clientInfo = new ClientInfoFrame(getClient);
        clientInfo.setVisible(true);
    }//GEN-LAST:event_ClientJMenu_SearchItemActionPerformed

    private void PackageJMenu_SearchItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PackageJMenu_SearchItemActionPerformed
        String id = JOptionPane.showInputDialog("Enter package ID: ");
        Package getPackage = ProjectOracleConnection.PackageSearchOracle(Long.parseLong(id));
        PackageInfoFrame packageInfo = new PackageInfoFrame(getPackage);
        packageInfo.setVisible(true);
    }//GEN-LAST:event_PackageJMenu_SearchItemActionPerformed

    private void ShippingCJMenu_SearchItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShippingCJMenu_SearchItemActionPerformed
        String id = JOptionPane.showInputDialog("Enter shipping category ID: ");
        ShipCategory getShipCat = ProjectOracleConnection.ShipCatSearchOracle(Integer.parseInt(id));
        ShipCatInfoFrame shipCatInfo = new ShipCatInfoFrame(getShipCat);
        shipCatInfo.setVisible(true);
    }//GEN-LAST:event_ShippingCJMenu_SearchItemActionPerformed

    private void PackageCJMenu_SearchItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PackageCJMenu_SearchItemActionPerformed
        String id = JOptionPane.showInputDialog("Enter package category ID: ");
        PackCategory getObj = ProjectOracleConnection.PackCatSearchOracle(Integer.parseInt(id));
        PackCatInfoFrame info = new PackCatInfoFrame(getObj);
        info.setVisible(true);
    }//GEN-LAST:event_PackageCJMenu_SearchItemActionPerformed

    private void LocationJMenu_SearchItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocationJMenu_SearchItemActionPerformed
        String id = JOptionPane.showInputDialog("Enter package category ID: ");
        Location getObj = ProjectOracleConnection.LocationSearchOracle(Integer.parseInt(id));
        LocationInfoFrame info = new LocationInfoFrame(getObj);
        info.setVisible(true);
    }//GEN-LAST:event_LocationJMenu_SearchItemActionPerformed

    private void ClientJMenu_AddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientJMenu_AddItemActionPerformed
        ClientAddFrame clientAdd = new ClientAddFrame();
        clientAdd.setVisible(true);
    }//GEN-LAST:event_ClientJMenu_AddItemActionPerformed

    private void ClientJMenu_ListItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientJMenu_ListItemActionPerformed
        List<Client> ClientArrayList = ProjectOracleConnection.ClientSearchListOracle();
        clientList = new ClientListFrame(ClientArrayList);
        clientList.setVisible(true);
    }//GEN-LAST:event_ClientJMenu_ListItemActionPerformed

    private void EmpJMenu_AddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpJMenu_AddItemActionPerformed
        EmpAddFrame empAdd = new EmpAddFrame();
        empAdd.setVisible(true);
    }//GEN-LAST:event_EmpJMenu_AddItemActionPerformed

    private void EmpJMenu_ListItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpJMenu_ListItemActionPerformed
        List<Employee> EmployeeArrayList = ProjectOracleConnection.EmployeeSearchListOracle();
        empList = new EmpListFrame(EmployeeArrayList);
        empList.setVisible(true);
    }//GEN-LAST:event_EmpJMenu_ListItemActionPerformed

    private void PackageJMenu_AddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PackageJMenu_AddItemActionPerformed
        PackageAddFrame packageAdd = new PackageAddFrame();
        packageAdd.setVisible(true);
    }//GEN-LAST:event_PackageJMenu_AddItemActionPerformed

    private void PackageJMenu_ListItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PackageJMenu_ListItemActionPerformed
        List<Package> PackageList = ProjectOracleConnection.PackageSearchListOracle();
        pack = new PackageListFrame(PackageList);
        pack.setVisible(true);
    }//GEN-LAST:event_PackageJMenu_ListItemActionPerformed

    private void ShippingCJMenu_AddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShippingCJMenu_AddItemActionPerformed
        ShipCatAddFrame shipCatAdd = new ShipCatAddFrame();
        shipCatAdd.setVisible(true);
    }//GEN-LAST:event_ShippingCJMenu_AddItemActionPerformed

    private void ShippingCJMenu_ListItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShippingCJMenu_ListItemActionPerformed
        List<ShipCategory> ShippingCategoryList = ProjectOracleConnection.ShipCatSearchListOracle();
        shipCatList = new ShipCatListFrame(ShippingCategoryList);
        shipCatList.setVisible(true); 
    }//GEN-LAST:event_ShippingCJMenu_ListItemActionPerformed

    private void PackageCJMenu_AddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PackageCJMenu_AddItemActionPerformed
        PackCatAddFrame packCatAdd = new PackCatAddFrame();
        packCatAdd.setVisible(true);
    }//GEN-LAST:event_PackageCJMenu_AddItemActionPerformed

    private void PackageCJMenu_ListItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PackageCJMenu_ListItemActionPerformed
        List<PackCategory> PackageCategoryList = ProjectOracleConnection.PackCatSearchListOracle();
        packCatList = new PackCatListFrame(PackageCategoryList);
        packCatList.setVisible(true);
    }//GEN-LAST:event_PackageCJMenu_ListItemActionPerformed

    private void LocationJMenu_AddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocationJMenu_AddItemActionPerformed
        LocationAddFrame locationAdd = new LocationAddFrame();
        locationAdd.setVisible(true);  
    }//GEN-LAST:event_LocationJMenu_AddItemActionPerformed

    private void LocationJMenu_ListItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocationJMenu_ListItemActionPerformed
        List<Location> LocationList = ProjectOracleConnection.LocationSearchListOracle();
        locationList = new LocationListFrame(LocationList);
        locationList.setVisible(true);
    }//GEN-LAST:event_LocationJMenu_ListItemActionPerformed

    private void CalCalculateBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalCalculateBActionPerformed
        double weight = Double.parseDouble(CalWeightTF.getText());
        double shipCatPrice = 0, packCatPrice = 0, locationPrice = 0;
        int shipCatPriceIndex = CalShippingCCB.getSelectedIndex();
        int packCatPriceIndex = CalPackageCCB.getSelectedIndex();
        int locationPriceIndex = CalLocationCB.getSelectedIndex();
        shipCatPrice = ShippingCategoryList.get(shipCatPriceIndex).getShipCatPrice();
        packCatPrice = PackageCategoryList.get(packCatPriceIndex).getPackCatPrice();
        locationPrice = LocationList.get(locationPriceIndex).getLocationPrice();
        Calculate cal = new Calculate(weight,shipCatPrice,packCatPrice,locationPrice);
        CalOutputTP.setText(cal.toString());
    }//GEN-LAST:event_CalCalculateBActionPerformed

    private void CalLocationCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalLocationCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CalLocationCBActionPerformed

    private void CalPackageCCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalPackageCCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CalPackageCCBActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               mainFrame = new MainJFrame();
               mainFrame.setVisible(true);
            }
        });
    }
    
    public void updataShipCatListCCB(List<ShipCategory> ShipCatArrayList){
        String[] ShipCat = new String[ShipCatArrayList.size()];
        for (int i = 0 ; i < ShipCatArrayList.size(); i++)
        { 
            TempShipCat = ShipCatArrayList.get(i); 
            ShipCat[i] = TempShipCat.getShipCatDesc()+ " $" + df.format(TempShipCat.getShipCatPrice());
        } 
        DefaultComboBoxModel ShipCatmodel = new DefaultComboBoxModel(ShipCat);  
        CalShippingCCB.setModel(ShipCatmodel);
    }
    public void updataLocationListCCB(List<Location> LocationArrayList){
        String[] Location = new String[LocationList.size()];
        for (int i = 0 ; i < LocationList.size(); i++)
        { 
            TempLocation = LocationList.get(i); 
            Location[i] = TempLocation.getLocationDesc()+ " $" + df.format(TempLocation.getLocationPrice());
        } 
        DefaultComboBoxModel LocationModel = new DefaultComboBoxModel(Location);  
        CalLocationCB.setModel(LocationModel);
    }
    public void updataPackCatListCCB(List<PackCategory> PackCatArrayList){
        String[] PackCat = new String[PackageCategoryList.size()];
        for (int i = 0 ; i < PackageCategoryList.size(); i++)
        { 
            TempPackCat = PackageCategoryList.get(i); 
            PackCat[i] = TempPackCat.getPackCatDesc()+ " $" + df.format(TempPackCat.getPackCatPrice());
        } 
        DefaultComboBoxModel PackCatModel = new DefaultComboBoxModel(PackCat);  
        CalPackageCCB.setModel(PackCatModel);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CalCalculateB;
    private javax.swing.JComboBox CalLocationCB;
    private javax.swing.JTextPane CalOutputTP;
    private javax.swing.JComboBox CalPackageCCB;
    private javax.swing.JButton CalRestB;
    private javax.swing.JComboBox CalShippingCCB;
    private javax.swing.JTextField CalWeightTF;
    private javax.swing.JMenu ClientJMenu;
    private javax.swing.JMenuItem ClientJMenu_AddItem;
    private javax.swing.JMenuItem ClientJMenu_ListItem;
    private javax.swing.JMenuItem ClientJMenu_SearchItem;
    private javax.swing.JMenu EmpJMenu;
    private javax.swing.JMenuItem EmpJMenu_AddItem;
    private javax.swing.JMenuItem EmpJMenu_ListItem;
    private javax.swing.JMenuItem EmpJMenu_SearchItem;
    private javax.swing.JMenu LocationJMenu;
    private javax.swing.JMenuItem LocationJMenu_AddItem;
    private javax.swing.JMenuItem LocationJMenu_ListItem;
    private javax.swing.JMenuItem LocationJMenu_SearchItem;
    private javax.swing.JMenu PackageCJMenu;
    private javax.swing.JMenuItem PackageCJMenu_AddItem;
    private javax.swing.JMenuItem PackageCJMenu_ListItem;
    private javax.swing.JMenuItem PackageCJMenu_SearchItem;
    private javax.swing.JMenu PackageJMenu;
    private javax.swing.JMenuItem PackageJMenu_AddItem;
    private javax.swing.JMenuItem PackageJMenu_ListItem;
    private javax.swing.JMenuItem PackageJMenu_SearchItem;
    private javax.swing.JMenu ShippingCJMenu;
    private javax.swing.JMenuItem ShippingCJMenu_AddItem;
    private javax.swing.JMenuItem ShippingCJMenu_ListItem;
    private javax.swing.JMenuItem ShippingCJMenu_SearchItem;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
