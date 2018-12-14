/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;
import information.*;
import java.sql.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
/**
 *
 * @author runyangzhou
 */
public class DriverLisenceCreateJPanel extends javax.swing.JPanel {
    private Person person;
    private DriverLisence driverLisence;
    String path;
    final String[] bloodType = {"A","B","O","AB"};
    
    /**
     * Creates new form driverLisenceCreateJPanel
     */
    public DriverLisenceCreateJPanel(Person person) {
        this.person = person;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        driverLisenceExpiredDateYearTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        driverLisenceExpiredDateMonthTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        driverLisenceExpiredDateDayTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        driverLisenceIssuedDateYearTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        driverLisenceIssuedDateMonthTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        driverLisenceIssuedDateDayTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        driverLisenceLisenceNumberTextField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        driverLisenceBloodTypeComboBox = new javax.swing.JComboBox();
        driverLisenceCreateBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        driverLisenceUploadBtn = new javax.swing.JButton();
        DriverLisencePathLabel = new javax.swing.JLabel();

        jLabel1.setText("Create Driver's Lisence Information");

        jLabel10.setText("Expired Date");

        jLabel8.setText("/");

        jLabel9.setText("/");

        jLabel11.setText("Issued Date");

        driverLisenceIssuedDateMonthTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                driverLisenceIssuedDateMonthTextFieldActionPerformed(evt);
            }
        });

        jLabel12.setText("/");

        jLabel13.setText("/");

        jLabel2.setText("Lisence Number");

        jLabel14.setText("Blood Type");

        driverLisenceBloodTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel(bloodType));

        driverLisenceCreateBtn.setText("Create");
        driverLisenceCreateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                driverLisenceCreateBtnActionPerformed(evt);
            }
        });

        jLabel3.setText("Photo");

        driverLisenceUploadBtn.setText("Upload");
        driverLisenceUploadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                driverLisenceUploadBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel3))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(driverLisenceIssuedDateYearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(driverLisenceIssuedDateMonthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(driverLisenceIssuedDateDayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(driverLisenceLisenceNumberTextField)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(driverLisenceExpiredDateYearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(driverLisenceExpiredDateMonthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(driverLisenceExpiredDateDayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(driverLisenceBloodTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(driverLisenceUploadBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(DriverLisencePathLabel))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(driverLisenceCreateBtn)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(driverLisenceLisenceNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(driverLisenceIssuedDateYearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(driverLisenceIssuedDateMonthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(driverLisenceIssuedDateDayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(driverLisenceExpiredDateYearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(driverLisenceExpiredDateMonthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(driverLisenceExpiredDateDayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(driverLisenceBloodTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(driverLisenceUploadBtn)
                    .addComponent(DriverLisencePathLabel))
                .addGap(18, 18, 18)
                .addComponent(driverLisenceCreateBtn)
                .addContainerGap(11, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void driverLisenceIssuedDateMonthTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_driverLisenceIssuedDateMonthTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_driverLisenceIssuedDateMonthTextFieldActionPerformed

    private void driverLisenceCreateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_driverLisenceCreateBtnActionPerformed
        // TODO add your handling code here:
        driverLisence = new DriverLisence();
        driverLisence.setLisenceNumber(driverLisenceLisenceNumberTextField.getText());
        int year = Integer.valueOf(driverLisenceIssuedDateYearTextField.getText());
        int month = Integer.valueOf(driverLisenceIssuedDateMonthTextField.getText());
        int day = Integer.valueOf(driverLisenceIssuedDateDayTextField.getText());
        String d = String.valueOf(year)+"-"+String.valueOf(month)+"-"+String.valueOf(day);
        Date date = Date.valueOf(d);
        driverLisence.setIssuedDate(date);
        year = Integer.valueOf(driverLisenceExpiredDateYearTextField.getText());
        month = Integer.valueOf(driverLisenceExpiredDateMonthTextField.getText());
        day = Integer.valueOf(driverLisenceExpiredDateDayTextField.getText());
        d = String.valueOf(year)+"-"+String.valueOf(month)+"-"+String.valueOf(day);
        date = Date.valueOf(d);
        driverLisence.setExpiredDate(date);
        driverLisence.setBloodType(driverLisenceBloodTypeComboBox.getSelectedItem().toString());
        driverLisence.setPath(path);
        person.setDriverLisence(driverLisence);
//        System.out.print(driverLisence.getPath());
    }//GEN-LAST:event_driverLisenceCreateBtnActionPerformed

    private void driverLisenceUploadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_driverLisenceUploadBtnActionPerformed
        // TODO add your handling code here:
        JFileChooser img =new JFileChooser();
        img.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int i =img.showOpenDialog(null);
        if(i == img.APPROVE_OPTION){
            path = img.getSelectedFile().getAbsolutePath();
            // absolute path

//            String name = img.getSelectedFile().getName();
            // 路径
            DriverLisencePathLabel.setText(path);
            
        }
        else{
            // 不存在
        }
        
//        ImageIcon icon = new ImageIcon(path);
//        icon.setImage(icon.getImage().getScaledInstance(145, 155, SCALE_DEFAULT));
        
        
    }//GEN-LAST:event_driverLisenceUploadBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DriverLisencePathLabel;
    private javax.swing.JComboBox driverLisenceBloodTypeComboBox;
    private javax.swing.JButton driverLisenceCreateBtn;
    private javax.swing.JTextField driverLisenceExpiredDateDayTextField;
    private javax.swing.JTextField driverLisenceExpiredDateMonthTextField;
    private javax.swing.JTextField driverLisenceExpiredDateYearTextField;
    private javax.swing.JTextField driverLisenceIssuedDateDayTextField;
    private javax.swing.JTextField driverLisenceIssuedDateMonthTextField;
    private javax.swing.JTextField driverLisenceIssuedDateYearTextField;
    private javax.swing.JTextField driverLisenceLisenceNumberTextField;
    private javax.swing.JButton driverLisenceUploadBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
