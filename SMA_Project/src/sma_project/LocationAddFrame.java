package sma_project;

import java.util.List;

public class LocationAddFrame extends javax.swing.JFrame {
    int Maxid;
    public void run() {
         new LocationAddFrame().setVisible(true);
    }
    public LocationAddFrame() {
        initComponents();
        Maxid = ProjectOracleConnection.MaxLocationIDSearchOracle()+100;
        String Id_str = String.format("%03d",Maxid + 1);
        LocationAddFrame_idTF.setText(Id_str);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        LocationAddFrame_CancelB = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        LocationAddFrame_idTF = new javax.swing.JTextField();
        LocationAddFrame_PriceTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LocationAddFrame_SubmitB = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        LocationAddFrame_DescTA = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Create New Category");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Location Price:      $");

        LocationAddFrame_CancelB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LocationAddFrame_CancelB.setText("Cancel");
        LocationAddFrame_CancelB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocationAddFrame_CancelBActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel6.setText("Create New Location");

        LocationAddFrame_idTF.setEditable(false);
        LocationAddFrame_idTF.setName(""); // NOI18N
        LocationAddFrame_idTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocationAddFrame_idTFActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Location ID:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Location Description:");

        LocationAddFrame_SubmitB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LocationAddFrame_SubmitB.setText("Submit");
        LocationAddFrame_SubmitB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocationAddFrame_SubmitBActionPerformed(evt);
            }
        });

        LocationAddFrame_DescTA.setColumns(20);
        LocationAddFrame_DescTA.setRows(5);
        jScrollPane1.setViewportView(LocationAddFrame_DescTA);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LocationAddFrame_SubmitB, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LocationAddFrame_CancelB, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(126, 126, 126))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(LocationAddFrame_idTF, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                        .addComponent(LocationAddFrame_PriceTF)))
                                .addGap(37, 37, 37))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel6)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(LocationAddFrame_idTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LocationAddFrame_PriceTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LocationAddFrame_CancelB)
                    .addComponent(LocationAddFrame_SubmitB))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LocationAddFrame_CancelBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocationAddFrame_CancelBActionPerformed
        dispose();
    }//GEN-LAST:event_LocationAddFrame_CancelBActionPerformed

    private void LocationAddFrame_SubmitBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocationAddFrame_SubmitBActionPerformed
        int id;
        double price;
        String desc;

        id = Maxid + 1;
        price = Double.parseDouble(LocationAddFrame_PriceTF.getText());
        desc = LocationAddFrame_DescTA.getText();
        Location location = new Location(id,price,desc);
        ProjectOracleConnection.LocationAddOracle(location);
        dispose(); 
        List<Location> LocationArrayList = ProjectOracleConnection.LocationSearchListOracle();
        MainJFrame.mainFrame.updataLocationListCCB(LocationArrayList);
    }//GEN-LAST:event_LocationAddFrame_SubmitBActionPerformed

    private void LocationAddFrame_idTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocationAddFrame_idTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LocationAddFrame_idTFActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LocationAddFrame_CancelB;
    private javax.swing.JTextArea LocationAddFrame_DescTA;
    private javax.swing.JTextField LocationAddFrame_PriceTF;
    private javax.swing.JButton LocationAddFrame_SubmitB;
    private javax.swing.JTextField LocationAddFrame_idTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
