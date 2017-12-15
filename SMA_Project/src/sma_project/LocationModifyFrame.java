package sma_project;

import java.text.DecimalFormat;
import java.util.List;
import javax.swing.JOptionPane;

public class LocationModifyFrame extends javax.swing.JFrame {
    DecimalFormat df = new DecimalFormat("#.00");
    LocationModifyFrame(Location location) {
        initComponents();
        LocationModifyFrame_idTF.setText(String.format("%03d", location.getLocationId()));
        LocationModifyFrame_PriceTF.setText(df.format(location.getLocationPrice()));
        LocationModifyFrame_DescTA.setText(location.getLocationDesc());
    }

    public void run() {
         new LocationModifyFrame().setVisible(true);
    }
    public LocationModifyFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        LocationModifyFrame_CancelB = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        LocationModifyFrame_idTF = new javax.swing.JTextField();
        LocationModifyFrame_PriceTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LocationModifyFrame_SaveB = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        LocationModifyFrame_DescTA = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Create New Category");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Location Price:      $");

        LocationModifyFrame_CancelB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LocationModifyFrame_CancelB.setText("Cancel");
        LocationModifyFrame_CancelB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocationModifyFrame_CancelBActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel6.setText("Modify Location Information");

        LocationModifyFrame_idTF.setName(""); // NOI18N
        LocationModifyFrame_idTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocationModifyFrame_idTFActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Location ID:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Location Description:");

        LocationModifyFrame_SaveB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LocationModifyFrame_SaveB.setText("Save");
        LocationModifyFrame_SaveB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocationModifyFrame_SaveBActionPerformed(evt);
            }
        });

        LocationModifyFrame_DescTA.setColumns(20);
        LocationModifyFrame_DescTA.setRows(5);
        jScrollPane1.setViewportView(LocationModifyFrame_DescTA);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LocationModifyFrame_SaveB, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LocationModifyFrame_CancelB, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(126, 126, 126))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(LocationModifyFrame_idTF, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                        .addComponent(LocationModifyFrame_PriceTF)))
                                .addGap(37, 37, 37))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel6)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(LocationModifyFrame_idTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LocationModifyFrame_PriceTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LocationModifyFrame_CancelB)
                    .addComponent(LocationModifyFrame_SaveB))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LocationModifyFrame_CancelBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocationModifyFrame_CancelBActionPerformed
        dispose();
    }//GEN-LAST:event_LocationModifyFrame_CancelBActionPerformed

    private void LocationModifyFrame_SaveBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocationModifyFrame_SaveBActionPerformed
        Location location = new Location();
        location.setLocationId(Integer.parseInt(LocationModifyFrame_idTF.getText()));
        location.setLocationPrice(Double.parseDouble(LocationModifyFrame_PriceTF.getText()));
        location.setLocationDesc(LocationModifyFrame_DescTA.getText());

        ProjectOracleConnection.LocationUpdateOracle(location);
        JOptionPane.showMessageDialog(null, "Successfully modified", "Record Modify", JOptionPane.INFORMATION_MESSAGE);
        dispose();   
        LocationListFrame.locationInfo.dispose();
        List<Location> LocationArrayList = ProjectOracleConnection.LocationSearchListOracle();
        MainJFrame.locationList.updataLocationListFrame(LocationArrayList);
        MainJFrame.mainFrame.updataLocationListCCB(LocationArrayList);
    }//GEN-LAST:event_LocationModifyFrame_SaveBActionPerformed

    private void LocationModifyFrame_idTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocationModifyFrame_idTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LocationModifyFrame_idTFActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LocationModifyFrame_CancelB;
    private javax.swing.JTextArea LocationModifyFrame_DescTA;
    private javax.swing.JTextField LocationModifyFrame_PriceTF;
    private javax.swing.JButton LocationModifyFrame_SaveB;
    private javax.swing.JTextField LocationModifyFrame_idTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
