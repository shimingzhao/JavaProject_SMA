package sma_project;

import static java.awt.SystemColor.window;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import static sma_project.MainJFrame.clientList;
import static sma_project.MainJFrame.empList;

public class EmpInfoFrame extends javax.swing.JFrame {

    public EmpInfoFrame() {
        initComponents();
    }

    EmpInfoFrame(Employee empInfo) {
        initComponents();
        EmpInfoFrame_idTF.setText(""+empInfo.getEmployeeId());
        EmpInfoFrame_lnameTF.setText(empInfo.getEmployeeLName());
        EmpInfoFrame_fnameTF.setText(empInfo.getEmployeeFName());
        EmpInfoFrame_phoneTF.setText(empInfo.getEmployeePhone());
        EmpInfoFrame_emailTF.setText(empInfo.getEmployeeEmail());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        EmpInfoFrame_idTF = new javax.swing.JTextField();
        EmpInfoFrame_lnameTF = new javax.swing.JTextField();
        EmpInfoFrame_fnameTF = new javax.swing.JTextField();
        EmpInfoFrame_phoneTF = new javax.swing.JTextField();
        EmpInfoFrame_emailTF = new javax.swing.JTextField();
        EmpInfoFrame_EditB = new javax.swing.JButton();
        EmpInfoFrame_DelB = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        EmpInfoFrame_CancelB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Employee Information");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Employee ID:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Last Name: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("First Name:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("E-mail:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Phone Number:");

        EmpInfoFrame_idTF.setEditable(false);

        EmpInfoFrame_lnameTF.setEditable(false);

        EmpInfoFrame_fnameTF.setEditable(false);

        EmpInfoFrame_phoneTF.setEditable(false);

        EmpInfoFrame_emailTF.setEditable(false);

        EmpInfoFrame_EditB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        EmpInfoFrame_EditB.setText("Edit");
        EmpInfoFrame_EditB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpInfoFrame_EditBActionPerformed(evt);
            }
        });

        EmpInfoFrame_DelB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        EmpInfoFrame_DelB.setText("Delete");
        EmpInfoFrame_DelB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpInfoFrame_DelBActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel6.setText("Employee Information");

        EmpInfoFrame_CancelB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        EmpInfoFrame_CancelB.setText("Cancel");
        EmpInfoFrame_CancelB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpInfoFrame_CancelBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(EmpInfoFrame_emailTF))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(EmpInfoFrame_phoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(EmpInfoFrame_lnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(EmpInfoFrame_idTF, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(55, 55, 55))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(EmpInfoFrame_EditB, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(EmpInfoFrame_DelB, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(EmpInfoFrame_CancelB, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(EmpInfoFrame_fnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(EmpInfoFrame_idTF)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(EmpInfoFrame_lnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(EmpInfoFrame_fnameTF)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(EmpInfoFrame_phoneTF)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(EmpInfoFrame_emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmpInfoFrame_EditB)
                    .addComponent(EmpInfoFrame_DelB)
                    .addComponent(EmpInfoFrame_CancelB))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EmpInfoFrame_EditBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpInfoFrame_EditBActionPerformed
        int id;
        String lname;
        String fname;
        String phone;
        String email;
        id = Integer.parseInt(EmpInfoFrame_idTF.getText());
        lname = EmpInfoFrame_lnameTF.getText();
        fname = EmpInfoFrame_fnameTF.getText();
        phone = EmpInfoFrame_phoneTF.getText();
        email = EmpInfoFrame_emailTF.getText();

        Employee employee = new Employee(id,lname,fname,phone,email);
        EmpModifyFrame employeeModify = new EmpModifyFrame(employee);
        employeeModify.setVisible(true);
    }//GEN-LAST:event_EmpInfoFrame_EditBActionPerformed

    private void EmpInfoFrame_DelBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpInfoFrame_DelBActionPerformed
        JOptionPane.showConfirmDialog(null, "This record will be deleted\nDo you want continue? ", "Record delete confirm", JOptionPane.YES_NO_OPTION);
        int selectedOption = 0;
        if (selectedOption == JOptionPane.YES_OPTION) {
            ProjectOracleConnection.EmployeeDeleteOracle(Integer.parseInt(EmpInfoFrame_idTF.getText()));
            JOptionPane.showMessageDialog(null, "The record has been deleted.", "Record delete", JOptionPane.INFORMATION_MESSAGE);
            dispose();
            List<Employee> EmployeeArrayList = ProjectOracleConnection.EmployeeSearchListOracle();
            MainJFrame.empList.updataEmpListFrame(EmployeeArrayList);
        }
    }//GEN-LAST:event_EmpInfoFrame_DelBActionPerformed
    public void updataFrame(Employee emp){
        EmpInfoFrame_idTF.setText("" + emp.getEmployeeId());
        EmpInfoFrame_lnameTF.setText(emp.getEmployeeLName());
        EmpInfoFrame_fnameTF.setText(emp.getEmployeeFName());
        EmpInfoFrame_phoneTF.setText(emp.getEmployeePhone());
        EmpInfoFrame_emailTF.setText(emp.getEmployeeEmail());
    }
    private void EmpInfoFrame_CancelBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpInfoFrame_CancelBActionPerformed
        dispose();
    }//GEN-LAST:event_EmpInfoFrame_CancelBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EmpInfoFrame_CancelB;
    private javax.swing.JButton EmpInfoFrame_DelB;
    private javax.swing.JButton EmpInfoFrame_EditB;
    private javax.swing.JTextField EmpInfoFrame_emailTF;
    private javax.swing.JTextField EmpInfoFrame_fnameTF;
    private javax.swing.JTextField EmpInfoFrame_idTF;
    private javax.swing.JTextField EmpInfoFrame_lnameTF;
    private javax.swing.JTextField EmpInfoFrame_phoneTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
