package sma_project;

import java.util.List;
import javax.swing.JOptionPane;

public class ClientModifyFrame extends javax.swing.JFrame {

    public ClientModifyFrame() {
        initComponents();
    }
    public ClientModifyFrame(Client client) {
        initComponents();
        ClientModFrame_idTF.setText(String.format("%03d", client.getClientId()));
        ClientModFrame_lnameTF.setText(client.getClientLName());
        ClientModFrame_fnameTF.setText(client.getClientFName());
        ClientModFrame_phoneTF.setText(client.getClientPhone());
        ClientModFrame_emailTF.setText(client.getClientEmail());
        ClientModFrame_addressTF.setText(client.getClientAddress());
        ClientModFrame_pIdTF.setText(""+client.getPackageId());
        ClientModFrame_empIdTF.setText(""+client.getEmployeeId());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ClientModFrame_idTF = new javax.swing.JTextField();
        ClientModFrame_lnameTF = new javax.swing.JTextField();
        ClientModFrame_fnameTF = new javax.swing.JTextField();
        ClientModFrame_phoneTF = new javax.swing.JTextField();
        ClientModFrame_emailTF = new javax.swing.JTextField();
        ClientModFrame_addressTF = new javax.swing.JTextField();
        ClientModFrame_saveB = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ClientModFrame_pIdTF = new javax.swing.JTextField();
        ClientModFrame_empIdTF = new javax.swing.JTextField();
        ClientModFrame_cancelB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modify Client Information");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Client ID:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Last Name: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("First Name:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("E-mail:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Address:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Phone Number:");

        ClientModFrame_idTF.setEditable(false);
        ClientModFrame_idTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientModFrame_idTFActionPerformed(evt);
            }
        });

        ClientModFrame_saveB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ClientModFrame_saveB.setText("Save");
        ClientModFrame_saveB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientModFrame_saveBActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel6.setText("Modify Client Information");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Package ID: ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Employee ID: ");

        ClientModFrame_pIdTF.setEditable(false);

        ClientModFrame_empIdTF.setEditable(false);

        ClientModFrame_cancelB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ClientModFrame_cancelB.setText("Cancel");
        ClientModFrame_cancelB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientModFrame_cancelBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(ClientModFrame_fnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                                            .addGap(19, 19, 19)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(ClientModFrame_emailTF)
                                                .addComponent(ClientModFrame_addressTF)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(ClientModFrame_pIdTF, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(ClientModFrame_empIdTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(21, 21, 21)
                                                    .addComponent(ClientModFrame_idTF, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(0, 0, Short.MAX_VALUE))))
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(0, 0, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(ClientModFrame_phoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(ClientModFrame_lnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGap(1, 1, 1)))
                            .addComponent(jLabel8))
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(ClientModFrame_saveB, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ClientModFrame_cancelB, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ClientModFrame_idTF)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ClientModFrame_lnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ClientModFrame_fnameTF)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ClientModFrame_phoneTF)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ClientModFrame_emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ClientModFrame_addressTF)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ClientModFrame_pIdTF)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ClientModFrame_empIdTF)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClientModFrame_saveB)
                    .addComponent(ClientModFrame_cancelB))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClientModFrame_saveBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientModFrame_saveBActionPerformed
        Client client = new Client();
        client.setClientId(Integer.parseInt(ClientModFrame_idTF.getText()));
        client.setClientLName(ClientModFrame_lnameTF.getText());
        client.setClientFName(ClientModFrame_fnameTF.getText());
        client.setClientPhone(ClientModFrame_phoneTF.getText());
        client.setClientEmail(ClientModFrame_emailTF.getText());
        client.setClientAddress(ClientModFrame_addressTF.getText());
        client.setPackageId(Integer.parseInt(ClientModFrame_pIdTF.getText()));
        client.setEmployeeId(Integer.parseInt(ClientModFrame_empIdTF.getText()));
        ProjectOracleConnection.ClientUpdateOracle(client);
        JOptionPane.showMessageDialog(null, "Successfully modified", "Record Modify", JOptionPane.INFORMATION_MESSAGE);
        dispose();
        ClientListFrame.clientInfo.dispose();
        List<Client> ClientArrayList = ProjectOracleConnection.ClientSearchListOracle();
        MainJFrame.clientList.updataClientListFrame(ClientArrayList);
    }//GEN-LAST:event_ClientModFrame_saveBActionPerformed

    private void ClientModFrame_cancelBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientModFrame_cancelBActionPerformed
        dispose();
    }//GEN-LAST:event_ClientModFrame_cancelBActionPerformed

    private void ClientModFrame_idTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientModFrame_idTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClientModFrame_idTFActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ClientModFrame_addressTF;
    private javax.swing.JButton ClientModFrame_cancelB;
    private javax.swing.JTextField ClientModFrame_emailTF;
    private javax.swing.JTextField ClientModFrame_empIdTF;
    private javax.swing.JTextField ClientModFrame_fnameTF;
    private javax.swing.JTextField ClientModFrame_idTF;
    private javax.swing.JTextField ClientModFrame_lnameTF;
    private javax.swing.JTextField ClientModFrame_pIdTF;
    private javax.swing.JTextField ClientModFrame_phoneTF;
    private javax.swing.JButton ClientModFrame_saveB;
    private javax.swing.JLabel jLabel1;
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
