package sma_project;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class PackCatModifyFrame extends javax.swing.JFrame {
    DecimalFormat df = new DecimalFormat("#.00");
    public PackCatModifyFrame() {
        initComponents();
    }

    PackCatModifyFrame(PackCategory PackCat) {
        initComponents();
        PackCatModifyFrame_idTF.setText(String.format("%03d", PackCat.getPackCatId()));
        PackCatModifyFrame_PriceTF.setText(df.format(PackCat.getPackCatPrice()));
        PackCatModifyFrame_DescTA.setText(PackCat.getPackCatDesc());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        PackCatModifyFrame_idTF = new javax.swing.JTextField();
        PackCatModifyFrame_PriceTF = new javax.swing.JTextField();
        PackCatModifyFrame_SaveB = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        PackCatModifyFrame_cancelTF = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        PackCatModifyFrame_DescTA = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Category Information");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Category ID:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Category Description:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Category Price:      $");

        PackCatModifyFrame_idTF.setEditable(false);

        PackCatModifyFrame_SaveB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PackCatModifyFrame_SaveB.setText("Save");
        PackCatModifyFrame_SaveB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PackCatModifyFrame_SaveBActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel6.setText("Modify Category Information");

        PackCatModifyFrame_cancelTF.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PackCatModifyFrame_cancelTF.setText("Cancel");
        PackCatModifyFrame_cancelTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PackCatModifyFrame_cancelTFActionPerformed(evt);
            }
        });

        PackCatModifyFrame_DescTA.setColumns(20);
        PackCatModifyFrame_DescTA.setRows(5);
        jScrollPane1.setViewportView(PackCatModifyFrame_DescTA);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PackCatModifyFrame_PriceTF, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PackCatModifyFrame_idTF, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addGap(34, 34, 34))
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(PackCatModifyFrame_SaveB, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(PackCatModifyFrame_cancelTF, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PackCatModifyFrame_idTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PackCatModifyFrame_PriceTF, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(116, 116, 116))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PackCatModifyFrame_SaveB)
                    .addComponent(PackCatModifyFrame_cancelTF))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PackCatModifyFrame_SaveBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PackCatModifyFrame_SaveBActionPerformed
        PackCategory PackCat = new PackCategory();
        PackCat.setPackCatId(Integer.parseInt(PackCatModifyFrame_idTF.getText()));
        PackCat.setPackCatPrice(Double.parseDouble(PackCatModifyFrame_PriceTF.getText()));
        PackCat.setPackCatDesc(PackCatModifyFrame_DescTA.getText());

        ProjectOracleConnection.PackCatUpdateOracle(PackCat);
        JOptionPane.showMessageDialog(null, "Successfully modified", "Record Modify", JOptionPane.INFORMATION_MESSAGE);
        dispose();        
        PackCatListFrame.packCatInfo.dispose();
        List<PackCategory> PackCatArrayList = ProjectOracleConnection.PackCatSearchListOracle();
        MainJFrame.packCatList.updataPackCatListFrame(PackCatArrayList);
        MainJFrame.mainFrame.updataPackCatListCCB(PackCatArrayList);
    }//GEN-LAST:event_PackCatModifyFrame_SaveBActionPerformed

    private void PackCatModifyFrame_cancelTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PackCatModifyFrame_cancelTFActionPerformed
        dispose();
    }//GEN-LAST:event_PackCatModifyFrame_cancelTFActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea PackCatModifyFrame_DescTA;
    private javax.swing.JTextField PackCatModifyFrame_PriceTF;
    private javax.swing.JButton PackCatModifyFrame_SaveB;
    private javax.swing.JButton PackCatModifyFrame_cancelTF;
    private javax.swing.JTextField PackCatModifyFrame_idTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
