package sma_project;

import java.util.List;
import static sma_project.MainJFrame.mainFrame;

public class PackCatAddFrame extends javax.swing.JFrame {
    int Maxid;
    public PackCatAddFrame() {
        initComponents();
        Maxid = ProjectOracleConnection.MaxPackCatIDSearchOracle() + 100;
        String Id_str = String.format("%03d",Maxid + 1);
        PackCatAddFrame_idTF.setText(Id_str);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        PackCatAddFrame_cancelB = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        PackCatAddFrame_idTF = new javax.swing.JTextField();
        PackCatAddFrame_PriceTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PackCatAddFrame_submitB = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        PackCatAddFrame_DescTA = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Create New Category");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Category Price:     $");

        PackCatAddFrame_cancelB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PackCatAddFrame_cancelB.setText("Cancel");
        PackCatAddFrame_cancelB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PackCatAddFrame_cancelBActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel6.setText("Create New Category");

        PackCatAddFrame_idTF.setEditable(false);
        PackCatAddFrame_idTF.setName(""); // NOI18N
        PackCatAddFrame_idTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PackCatAddFrame_idTFActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Category ID:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Category Description:");

        PackCatAddFrame_submitB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PackCatAddFrame_submitB.setText("Submit");
        PackCatAddFrame_submitB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PackCatAddFrame_submitBActionPerformed(evt);
            }
        });

        PackCatAddFrame_DescTA.setColumns(20);
        PackCatAddFrame_DescTA.setRows(5);
        jScrollPane1.setViewportView(PackCatAddFrame_DescTA);

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
                            .addComponent(PackCatAddFrame_submitB, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PackCatAddFrame_cancelB, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(126, 126, 126))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(PackCatAddFrame_idTF, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                        .addComponent(PackCatAddFrame_PriceTF)))
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
                    .addComponent(PackCatAddFrame_idTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PackCatAddFrame_PriceTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PackCatAddFrame_cancelB)
                    .addComponent(PackCatAddFrame_submitB))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PackCatAddFrame_cancelBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PackCatAddFrame_cancelBActionPerformed
        dispose();
    }//GEN-LAST:event_PackCatAddFrame_cancelBActionPerformed

    private void PackCatAddFrame_submitBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PackCatAddFrame_submitBActionPerformed
        int id;
        String desc;
        double price;
 
        id = Maxid + 1;
        price = Double.parseDouble(PackCatAddFrame_PriceTF.getText());
        desc = PackCatAddFrame_DescTA.getText();
        PackCategory PackCat = new PackCategory(id,price,desc);
        ProjectOracleConnection.PackCatAddOracle(PackCat);
        dispose();
        List<PackCategory> PackCatArrayList = ProjectOracleConnection.PackCatSearchListOracle();
        MainJFrame.mainFrame.updataPackCatListCCB(PackCatArrayList);
    }//GEN-LAST:event_PackCatAddFrame_submitBActionPerformed

    private void PackCatAddFrame_idTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PackCatAddFrame_idTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PackCatAddFrame_idTFActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea PackCatAddFrame_DescTA;
    private javax.swing.JTextField PackCatAddFrame_PriceTF;
    private javax.swing.JButton PackCatAddFrame_cancelB;
    private javax.swing.JTextField PackCatAddFrame_idTF;
    private javax.swing.JButton PackCatAddFrame_submitB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
