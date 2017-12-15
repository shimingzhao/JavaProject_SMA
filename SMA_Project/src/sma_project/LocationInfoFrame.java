
package sma_project;

import static java.awt.SystemColor.window;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import static sma_project.MainJFrame.locationList;

public class LocationInfoFrame extends javax.swing.JFrame {
    DecimalFormat df = new DecimalFormat("#.00");
    public LocationInfoFrame() {
        initComponents();
    }
    LocationInfoFrame(Location LocationInfo) {
        initComponents();
        LocationInfoFrame_idTF.setText(String.format("%03d", LocationInfo.getLocationId()));
        LocationInfoFrame_PriceTF.setText(df.format(LocationInfo.getLocationPrice()));
        LocationInfoFrame_DescTA.setText(LocationInfo.getLocationDesc());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LocationInfoFrame_idTF = new javax.swing.JTextField();
        LocationInfoFrame_PriceTF = new javax.swing.JTextField();
        LocationInfoFrame_EditB = new javax.swing.JButton();
        LocationInfoFrame_DelB = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        LocationInfoFrame_CancelB = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        LocationInfoFrame_DescTA = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Category Information");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Location ID:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Location Description:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Location Price:     $");

        LocationInfoFrame_idTF.setEditable(false);

        LocationInfoFrame_PriceTF.setEditable(false);

        LocationInfoFrame_EditB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LocationInfoFrame_EditB.setText("Edit");
        LocationInfoFrame_EditB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocationInfoFrame_EditBActionPerformed(evt);
            }
        });

        LocationInfoFrame_DelB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LocationInfoFrame_DelB.setText("Delete");
        LocationInfoFrame_DelB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocationInfoFrame_DelBActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel6.setText("Location Information");

        LocationInfoFrame_CancelB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LocationInfoFrame_CancelB.setText("Cancel");
        LocationInfoFrame_CancelB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocationInfoFrame_CancelBActionPerformed(evt);
            }
        });

        LocationInfoFrame_DescTA.setEditable(false);
        LocationInfoFrame_DescTA.setColumns(20);
        LocationInfoFrame_DescTA.setRows(5);
        jScrollPane1.setViewportView(LocationInfoFrame_DescTA);

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
                .addGap(18, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(LocationInfoFrame_PriceTF, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(LocationInfoFrame_idTF, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(34, 34, 34))
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(LocationInfoFrame_EditB, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LocationInfoFrame_DelB, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LocationInfoFrame_CancelB, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(LocationInfoFrame_idTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LocationInfoFrame_PriceTF, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(116, 116, 116))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LocationInfoFrame_EditB)
                    .addComponent(LocationInfoFrame_DelB)
                    .addComponent(LocationInfoFrame_CancelB))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LocationInfoFrame_EditBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocationInfoFrame_EditBActionPerformed
        int id;
        double price;
        String desc;

        id = Integer.parseInt(LocationInfoFrame_idTF.getText());
        price = Double.parseDouble(LocationInfoFrame_PriceTF.getText());
        desc = LocationInfoFrame_DescTA.getText();
        
        Location location = new Location(id,price,desc);
        LocationModifyFrame LocationModify = new LocationModifyFrame(location);
        LocationModify.setVisible(true);
    }//GEN-LAST:event_LocationInfoFrame_EditBActionPerformed

    private void LocationInfoFrame_DelBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocationInfoFrame_DelBActionPerformed
        JOptionPane.showConfirmDialog(null, "This record will be deleted\nDo you want continue? ", "Record delete confirm", JOptionPane.YES_NO_OPTION);
        int selectedOption = 0;
        if (selectedOption == JOptionPane.YES_OPTION) {
            ProjectOracleConnection.LocationDeleteOracle(Integer.parseInt(LocationInfoFrame_idTF.getText()));
            JOptionPane.showMessageDialog(null, "The record has been deleted.", "Record delete", JOptionPane.INFORMATION_MESSAGE);
            dispose();
            
            List<Location> LocationArrayList = ProjectOracleConnection.LocationSearchListOracle();
            MainJFrame.locationList.updataLocationListFrame(LocationArrayList);
            MainJFrame.mainFrame.updataLocationListCCB(LocationArrayList);
        }
    }//GEN-LAST:event_LocationInfoFrame_DelBActionPerformed

    public void updataFrame(Location l){
        LocationInfoFrame_idTF.setText(String.format("%03d", l.getLocationId()));
        LocationInfoFrame_PriceTF.setText(df.format(l.getLocationPrice()));
        LocationInfoFrame_DescTA.setText(l.getLocationDesc());
    }
    private void LocationInfoFrame_CancelBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocationInfoFrame_CancelBActionPerformed
        dispose();
    }//GEN-LAST:event_LocationInfoFrame_CancelBActionPerformed

    public void run() {
        new LocationInfoFrame().setVisible(true);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LocationInfoFrame_CancelB;
    private javax.swing.JButton LocationInfoFrame_DelB;
    private javax.swing.JTextArea LocationInfoFrame_DescTA;
    private javax.swing.JButton LocationInfoFrame_EditB;
    private javax.swing.JTextField LocationInfoFrame_PriceTF;
    private javax.swing.JTextField LocationInfoFrame_idTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
