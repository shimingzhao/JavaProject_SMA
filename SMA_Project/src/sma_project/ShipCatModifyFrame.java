package sma_project;

import java.text.DecimalFormat;
import java.util.List;
import javax.swing.JOptionPane;
public class ShipCatModifyFrame extends javax.swing.JFrame {
    DecimalFormat df = new DecimalFormat("#.00");
    ShipCatModifyFrame(ShipCategory ShipCat) {
        initComponents();
        ShipCatModifyFrame_idTF.setText(String.format("%03d", ShipCat.getShipCatId()));
        ShipCatModifyFrame_PriceTF.setText(df.format(ShipCat.getShipCatPrice()));
        ShipCatModifyFrame_DescTA.setText(ShipCat.getShipCatDesc());
    }
    public ShipCatModifyFrame() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        ShipCatModifyFrame_CancelB = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        ShipCatModifyFrame_idTF = new javax.swing.JTextField();
        ShipCatModifyFrame_PriceTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ShipCatModifyFrame_SaveB = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ShipCatModifyFrame_DescTA = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Create New Category");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Category Price:     $");

        ShipCatModifyFrame_CancelB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ShipCatModifyFrame_CancelB.setText("Cancel");
        ShipCatModifyFrame_CancelB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShipCatModifyFrame_CancelBActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel6.setText("Modify Shipping Category Information");

        ShipCatModifyFrame_idTF.setName(""); // NOI18N
        ShipCatModifyFrame_idTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShipCatModifyFrame_idTFActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Category ID:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Category Description:");

        ShipCatModifyFrame_SaveB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ShipCatModifyFrame_SaveB.setText("Save");
        ShipCatModifyFrame_SaveB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShipCatModifyFrame_SaveBActionPerformed(evt);
            }
        });

        ShipCatModifyFrame_DescTA.setColumns(20);
        ShipCatModifyFrame_DescTA.setRows(5);
        jScrollPane1.setViewportView(ShipCatModifyFrame_DescTA);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ShipCatModifyFrame_SaveB, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ShipCatModifyFrame_CancelB, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(126, 126, 126))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ShipCatModifyFrame_idTF, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                        .addComponent(ShipCatModifyFrame_PriceTF)))
                                .addGap(37, 37, 37))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel6)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ShipCatModifyFrame_idTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ShipCatModifyFrame_PriceTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ShipCatModifyFrame_CancelB)
                    .addComponent(ShipCatModifyFrame_SaveB))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ShipCatModifyFrame_CancelBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShipCatModifyFrame_CancelBActionPerformed
        dispose();
    }//GEN-LAST:event_ShipCatModifyFrame_CancelBActionPerformed

    private void ShipCatModifyFrame_SaveBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShipCatModifyFrame_SaveBActionPerformed
        ShipCategory ShipCat = new ShipCategory();
        ShipCat.setShipCatId(Integer.parseInt(ShipCatModifyFrame_idTF.getText()));
        ShipCat.setShipCatPrice(Double.parseDouble(ShipCatModifyFrame_PriceTF.getText()));
        ShipCat.setShipCatDesc(ShipCatModifyFrame_DescTA.getText());

        ProjectOracleConnection.ShipCatUpdateOracle(ShipCat);
        JOptionPane.showMessageDialog(null, "Successfully modified", "Record Modify", JOptionPane.INFORMATION_MESSAGE);
        dispose();         
        ShipCatListFrame.shipCatInfo.dispose();
        List<ShipCategory> ShipCatArrayList = ProjectOracleConnection.ShipCatSearchListOracle();
        MainJFrame.shipCatList.updataShipCatListFrame(ShipCatArrayList);
        MainJFrame.mainFrame.updataShipCatListCCB(ShipCatArrayList);
    }//GEN-LAST:event_ShipCatModifyFrame_SaveBActionPerformed

    private void ShipCatModifyFrame_idTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShipCatModifyFrame_idTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ShipCatModifyFrame_idTFActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ShipCatModifyFrame_CancelB;
    private javax.swing.JTextArea ShipCatModifyFrame_DescTA;
    private javax.swing.JTextField ShipCatModifyFrame_PriceTF;
    private javax.swing.JButton ShipCatModifyFrame_SaveB;
    private javax.swing.JTextField ShipCatModifyFrame_idTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
