package sma_project;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
public class ClientInfoFrame extends javax.swing.JFrame {       
    public ClientInfoFrame(Client clientInfo) {
        initComponents();
        ClientInfoFrame_idTF.setText(""+clientInfo.getClientId());
        ClientInfoFrame_lnameTF.setText(clientInfo.getClientLName());
        ClientInfoFrame_fnameTF.setText(clientInfo.getClientFName());
        ClientInfoFrame_phoneTF.setText(clientInfo.getClientPhone());
        ClientInfoFrame_emailTF.setText(clientInfo.getClientEmail());
        ClientInfoFrame_addressTF.setText(clientInfo.getClientAddress());
        ClientInfoFrame_pIdTF.setText(""+clientInfo.getPackageId());
        ClientInfoFrame_empIdTF.setText(""+clientInfo.getEmployeeId());        
        
    }
    ClientInfoFrame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.            
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
        ClientInfoFrame_idTF = new javax.swing.JTextField();
        ClientInfoFrame_lnameTF = new javax.swing.JTextField();
        ClientInfoFrame_fnameTF = new javax.swing.JTextField();
        ClientInfoFrame_phoneTF = new javax.swing.JTextField();
        ClientInfoFrame_emailTF = new javax.swing.JTextField();
        ClientInfoFrame_addressTF = new javax.swing.JTextField();
        ClientInfoFrame_EditB = new javax.swing.JButton();
        ClientInfoFrame_DelB = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ClientInfoFrame_pIdTF = new javax.swing.JTextField();
        ClientInfoFrame_empIdTF = new javax.swing.JTextField();
        ClientInfoFrame_CancelB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Client Information");

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

        ClientInfoFrame_idTF.setEditable(false);
        ClientInfoFrame_idTF.setName(""); // NOI18N
        ClientInfoFrame_idTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientInfoFrame_idTFActionPerformed(evt);
            }
        });

        ClientInfoFrame_lnameTF.setEditable(false);

        ClientInfoFrame_fnameTF.setEditable(false);

        ClientInfoFrame_phoneTF.setEditable(false);
        ClientInfoFrame_phoneTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientInfoFrame_phoneTFActionPerformed(evt);
            }
        });

        ClientInfoFrame_emailTF.setEditable(false);

        ClientInfoFrame_addressTF.setEditable(false);

        ClientInfoFrame_EditB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ClientInfoFrame_EditB.setText("Edit");
        ClientInfoFrame_EditB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientInfoFrame_EditBActionPerformed(evt);
            }
        });

        ClientInfoFrame_DelB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ClientInfoFrame_DelB.setText("Delete");
        ClientInfoFrame_DelB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientInfoFrame_DelBActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel6.setText("Client Information");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Package ID: ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Employee ID: ");

        ClientInfoFrame_pIdTF.setEditable(false);
        ClientInfoFrame_pIdTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientInfoFrame_pIdTFActionPerformed(evt);
            }
        });

        ClientInfoFrame_empIdTF.setEditable(false);

        ClientInfoFrame_CancelB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ClientInfoFrame_CancelB.setText("Cancel");
        ClientInfoFrame_CancelB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientInfoFrame_CancelBActionPerformed(evt);
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
                                    .addComponent(ClientInfoFrame_fnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                                                .addGap(19, 19, 19)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(ClientInfoFrame_emailTF)
                                                    .addComponent(ClientInfoFrame_addressTF)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(ClientInfoFrame_phoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(ClientInfoFrame_lnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(ClientInfoFrame_pIdTF, javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(ClientInfoFrame_empIdTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(21, 21, 21)
                                                        .addComponent(ClientInfoFrame_idTF, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, Short.MAX_VALUE))))))
                                    .addGap(1, 1, 1)))
                            .addComponent(jLabel8))
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ClientInfoFrame_EditB, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ClientInfoFrame_DelB, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ClientInfoFrame_CancelB, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ClientInfoFrame_idTF)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ClientInfoFrame_lnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ClientInfoFrame_fnameTF)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ClientInfoFrame_phoneTF)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ClientInfoFrame_emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ClientInfoFrame_addressTF)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ClientInfoFrame_pIdTF)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ClientInfoFrame_empIdTF)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClientInfoFrame_EditB)
                    .addComponent(ClientInfoFrame_DelB)
                    .addComponent(ClientInfoFrame_CancelB))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClientInfoFrame_EditBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientInfoFrame_EditBActionPerformed
        int id;
        String lname;
        String fname;
        String phone;
        String email;
        String address;
        int pakid;
        int empid; 
        id = Integer.parseInt(ClientInfoFrame_idTF.getText());
        lname = ClientInfoFrame_lnameTF.getText();
        fname = ClientInfoFrame_fnameTF.getText();
        phone = ClientInfoFrame_phoneTF.getText();
        email = ClientInfoFrame_emailTF.getText();
        address = ClientInfoFrame_addressTF.getText();
        pakid = Integer.parseInt(ClientInfoFrame_pIdTF.getText());
        empid = Integer.parseInt(ClientInfoFrame_empIdTF.getText());
        Client client = new Client(id,lname,fname,phone,email,address,pakid,empid);
        ProjectOracleConnection.ClientUpdateOracle(id, lname, 
                fname, phone, email, address, pakid, empid);
        
        ClientModifyFrame clientModify = new ClientModifyFrame();
        clientModify.setVisible(true);
    }//GEN-LAST:event_ClientInfoFrame_EditBActionPerformed

    private void ClientInfoFrame_DelBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientInfoFrame_DelBActionPerformed
        JOptionPane.showConfirmDialog(null, "This record will be deleted\nDo you want continue? ", "Record delete confirm", JOptionPane.YES_NO_OPTION);
        int selectedOption = 0;
        if (selectedOption == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "The record has been deleted.", "Record delete", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_ClientInfoFrame_DelBActionPerformed

    private void ClientInfoFrame_CancelBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientInfoFrame_CancelBActionPerformed
        dispose();
    }//GEN-LAST:event_ClientInfoFrame_CancelBActionPerformed

    private void ClientInfoFrame_idTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientInfoFrame_idTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClientInfoFrame_idTFActionPerformed

    private void ClientInfoFrame_phoneTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientInfoFrame_phoneTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClientInfoFrame_phoneTFActionPerformed

    private void ClientInfoFrame_pIdTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientInfoFrame_pIdTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClientInfoFrame_pIdTFActionPerformed
    public void run() {
        new ClientInfoFrame().setVisible(true);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClientInfoFrame_CancelB;
    private javax.swing.JButton ClientInfoFrame_DelB;
    private javax.swing.JButton ClientInfoFrame_EditB;
    private javax.swing.JTextField ClientInfoFrame_addressTF;
    private javax.swing.JTextField ClientInfoFrame_emailTF;
    private javax.swing.JTextField ClientInfoFrame_empIdTF;
    private javax.swing.JTextField ClientInfoFrame_fnameTF;
    private javax.swing.JTextField ClientInfoFrame_idTF;
    private javax.swing.JTextField ClientInfoFrame_lnameTF;
    private javax.swing.JTextField ClientInfoFrame_pIdTF;
    private javax.swing.JTextField ClientInfoFrame_phoneTF;
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
