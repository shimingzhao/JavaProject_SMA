package sma_project;

import java.text.DecimalFormat;
import java.util.List;
import javax.swing.JOptionPane;
import static sma_project.MainJFrame.shipCatList;

public class ShipCatInfoFrame extends javax.swing.JFrame {
    DecimalFormat df = new DecimalFormat("#.00");
    public ShipCatInfoFrame() {
        initComponents();
    }
    
    ShipCatInfoFrame(ShipCategory ShipCatInfo) {
        initComponents();
        ShipCatInfoFrame_idTF.setText(String.format("%03d", ShipCatInfo.getShipCatId()));
        ShipCatInfoFrame_PriceTF.setText(df.format(ShipCatInfo.getShipCatPrice()));
        ShipCatInfoFrame_DescTA.setText(ShipCatInfo.getShipCatDesc());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        ShipCatInfoFrame_CancelB = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        ShipCatInfoFrame_idTF = new javax.swing.JTextField();
        ShipCatInfoFrame_PriceTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ShipCatInfoFrame_DelB = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ShipCatInfoFrame_DescTA = new javax.swing.JTextArea();
        ShipCatInfoFrame_EditB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Create New Category");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Category Price:     $");

        ShipCatInfoFrame_CancelB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ShipCatInfoFrame_CancelB.setText("Cancel");
        ShipCatInfoFrame_CancelB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShipCatInfoFrame_CancelBActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel6.setText("Shipping Category Information");

        ShipCatInfoFrame_idTF.setEditable(false);
        ShipCatInfoFrame_idTF.setName(""); // NOI18N
        ShipCatInfoFrame_idTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShipCatInfoFrame_idTFActionPerformed(evt);
            }
        });

        ShipCatInfoFrame_PriceTF.setEditable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Category ID:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Category Description:");

        ShipCatInfoFrame_DelB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ShipCatInfoFrame_DelB.setText("Delete");
        ShipCatInfoFrame_DelB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShipCatInfoFrame_DelBActionPerformed(evt);
            }
        });

        ShipCatInfoFrame_DescTA.setEditable(false);
        ShipCatInfoFrame_DescTA.setColumns(20);
        ShipCatInfoFrame_DescTA.setRows(5);
        jScrollPane1.setViewportView(ShipCatInfoFrame_DescTA);

        ShipCatInfoFrame_EditB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ShipCatInfoFrame_EditB.setText("Edit");
        ShipCatInfoFrame_EditB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShipCatInfoFrame_EditBActionPerformed(evt);
            }
        });

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
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ShipCatInfoFrame_idTF, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                .addComponent(ShipCatInfoFrame_PriceTF)))
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ShipCatInfoFrame_EditB, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ShipCatInfoFrame_DelB, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(ShipCatInfoFrame_CancelB, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel6)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ShipCatInfoFrame_idTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ShipCatInfoFrame_PriceTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ShipCatInfoFrame_CancelB)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ShipCatInfoFrame_DelB)
                        .addComponent(ShipCatInfoFrame_EditB)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ShipCatInfoFrame_CancelBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShipCatInfoFrame_CancelBActionPerformed
        dispose();
    }//GEN-LAST:event_ShipCatInfoFrame_CancelBActionPerformed
    public void updataFrame(ShipCategory s){
        ShipCatInfoFrame_idTF.setText(String.format("%03d", s.getShipCatId()));
        ShipCatInfoFrame_PriceTF.setText(df.format(s.getShipCatPrice()));
        ShipCatInfoFrame_DescTA.setText(s.getShipCatDesc());
    }
    private void ShipCatInfoFrame_DelBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShipCatInfoFrame_DelBActionPerformed
        JOptionPane.showConfirmDialog(null, "This record will be deleted\nDo you want continue? ", "Record delete confirm", JOptionPane.YES_NO_OPTION);
        int selectedOption = 0;
        if (selectedOption == JOptionPane.YES_OPTION) {
            ProjectOracleConnection.ShipCatDeleteOracle(Integer.parseInt(ShipCatInfoFrame_idTF.getText()));
            JOptionPane.showMessageDialog(null, "The record has been deleted.", "Record delete", JOptionPane.INFORMATION_MESSAGE);
            dispose();
            List<ShipCategory> ShipCatArrayList = ProjectOracleConnection.ShipCatSearchListOracle();
            MainJFrame.shipCatList.updataShipCatListFrame(ShipCatArrayList);
            MainJFrame.mainFrame.updataShipCatListCCB(ShipCatArrayList);            
        }        
    }//GEN-LAST:event_ShipCatInfoFrame_DelBActionPerformed

    private void ShipCatInfoFrame_idTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShipCatInfoFrame_idTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ShipCatInfoFrame_idTFActionPerformed

    private void ShipCatInfoFrame_EditBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShipCatInfoFrame_EditBActionPerformed
        int id;
        double price;
        String desc;

        id = Integer.parseInt(ShipCatInfoFrame_idTF.getText());
        price = Double.parseDouble(ShipCatInfoFrame_PriceTF.getText());
        desc = ShipCatInfoFrame_DescTA.getText();
        
        ShipCategory ShipCat = new ShipCategory(id,price,desc);
        ShipCatModifyFrame ShipCatModify = new ShipCatModifyFrame(ShipCat);
        ShipCatModify.setVisible(true);
    }//GEN-LAST:event_ShipCatInfoFrame_EditBActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ShipCatInfoFrame_CancelB;
    private javax.swing.JButton ShipCatInfoFrame_DelB;
    private javax.swing.JTextArea ShipCatInfoFrame_DescTA;
    private javax.swing.JButton ShipCatInfoFrame_EditB;
    private javax.swing.JTextField ShipCatInfoFrame_PriceTF;
    private javax.swing.JTextField ShipCatInfoFrame_idTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
