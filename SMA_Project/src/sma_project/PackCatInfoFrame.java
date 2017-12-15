
package sma_project;

import static java.awt.SystemColor.window;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import static sma_project.MainJFrame.packCatList;

public class PackCatInfoFrame extends javax.swing.JFrame {
    DecimalFormat df = new DecimalFormat("#.00");
    public PackCatInfoFrame() {
        initComponents();
    }

    PackCatInfoFrame(PackCategory PackCatInfo) {
        initComponents();
        PackCatInfoFrame_idTF.setText(String.format("%03d", PackCatInfo.getPackCatId()));
        PackCatInfoFrame_PriceTF.setText(df.format(PackCatInfo.getPackCatPrice()));
        PackCatInfoFrame_DescTA.setText(PackCatInfo.getPackCatDesc());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        PackCatInfoFrame_idTF = new javax.swing.JTextField();
        PackCatInfoFrame_PriceTF = new javax.swing.JTextField();
        PackCatInfoFrame_EditB = new javax.swing.JButton();
        PackCatInfoFrame_DelB = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        PackCatInfoFrame_CancelB = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        PackCatInfoFrame_DescTA = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Category Information");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Category ID:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Category Description:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Category Price:     $");

        PackCatInfoFrame_idTF.setEditable(false);

        PackCatInfoFrame_PriceTF.setEditable(false);

        PackCatInfoFrame_EditB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PackCatInfoFrame_EditB.setText("Edit");
        PackCatInfoFrame_EditB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PackCatInfoFrame_EditBActionPerformed(evt);
            }
        });

        PackCatInfoFrame_DelB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PackCatInfoFrame_DelB.setText("Delete");
        PackCatInfoFrame_DelB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PackCatInfoFrame_DelBActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel6.setText("Category Information");

        PackCatInfoFrame_CancelB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PackCatInfoFrame_CancelB.setText("Cancel");
        PackCatInfoFrame_CancelB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PackCatInfoFrame_CancelBActionPerformed(evt);
            }
        });

        PackCatInfoFrame_DescTA.setEditable(false);
        PackCatInfoFrame_DescTA.setColumns(20);
        PackCatInfoFrame_DescTA.setRows(5);
        jScrollPane1.setViewportView(PackCatInfoFrame_DescTA);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PackCatInfoFrame_PriceTF, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PackCatInfoFrame_idTF, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addGap(34, 34, 34))
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(PackCatInfoFrame_EditB, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PackCatInfoFrame_DelB, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PackCatInfoFrame_CancelB, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PackCatInfoFrame_idTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PackCatInfoFrame_PriceTF, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(116, 116, 116))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PackCatInfoFrame_EditB)
                    .addComponent(PackCatInfoFrame_DelB)
                    .addComponent(PackCatInfoFrame_CancelB))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PackCatInfoFrame_EditBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PackCatInfoFrame_EditBActionPerformed
        int id;
        double price;
        String desc;

        id = Integer.parseInt(PackCatInfoFrame_idTF.getText());
        price = Double.parseDouble(PackCatInfoFrame_PriceTF.getText());
        desc = PackCatInfoFrame_DescTA.getText();
        
        PackCategory PackCat = new PackCategory(id,price,desc);
        PackCatModifyFrame PackCatModify = new PackCatModifyFrame(PackCat);
        PackCatModify.setVisible(true);
    }//GEN-LAST:event_PackCatInfoFrame_EditBActionPerformed

    private void PackCatInfoFrame_DelBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PackCatInfoFrame_DelBActionPerformed
        JOptionPane.showConfirmDialog(null, "This record will be deleted\nDo you want continue? ", "Record delete confirm", JOptionPane.YES_NO_OPTION);
        int selectedOption = 0;
        if (selectedOption == JOptionPane.YES_OPTION) {
            ProjectOracleConnection.PackCatDeleteOracle(Integer.parseInt(PackCatInfoFrame_idTF.getText()));
            JOptionPane.showMessageDialog(null, "The record has been deleted.", "Record delete", JOptionPane.INFORMATION_MESSAGE);
            dispose();
            List<PackCategory> PackCatArrayList = ProjectOracleConnection.PackCatSearchListOracle();
            MainJFrame.packCatList.updataPackCatListFrame(PackCatArrayList);
            MainJFrame.mainFrame.updataPackCatListCCB(PackCatArrayList);
        }
    }//GEN-LAST:event_PackCatInfoFrame_DelBActionPerformed

    public void updataFrame(PackCategory p){
        PackCatInfoFrame_idTF.setText(String.format("%03d", p.getPackCatId()) );
        PackCatInfoFrame_PriceTF.setText(df.format(p.getPackCatPrice()));
        PackCatInfoFrame_DescTA.setText(p.getPackCatDesc());
    }
    private void PackCatInfoFrame_CancelBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PackCatInfoFrame_CancelBActionPerformed
        dispose();
    }//GEN-LAST:event_PackCatInfoFrame_CancelBActionPerformed

    public void run() {
        new PackCatInfoFrame().setVisible(true);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PackCatInfoFrame_CancelB;
    private javax.swing.JButton PackCatInfoFrame_DelB;
    private javax.swing.JTextArea PackCatInfoFrame_DescTA;
    private javax.swing.JButton PackCatInfoFrame_EditB;
    private javax.swing.JTextField PackCatInfoFrame_PriceTF;
    private javax.swing.JTextField PackCatInfoFrame_idTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
