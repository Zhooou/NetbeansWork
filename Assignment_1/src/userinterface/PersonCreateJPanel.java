/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;
import information.*;
import java.sql.Date;
import javax.swing.JOptionPane;
/**
 *
 * @author runyangzhou
 */


public class PersonCreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form personCreateJPanel
     */
    final String[] sex = {"Male", "Female"};
    private Person person;
    public PersonCreateJPanel(Person person) {
        initComponents();
        this.person = person;
//        personSexComboBox.setModel(new javax.swing.DefaultComboBoxModel(sex));
//        personSexComboBox.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                personSexComboBoxActionPerformed(evt);
//            }
//        });
        
        
      
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
        jLabel2 = new javax.swing.JLabel();
        personFirstNameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        personLastNameTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        personSexComboBox = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        personPhoneNumberTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        personWeightTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        personHeightTextField = new javax.swing.JTextField();
        personCreateBtn = new javax.swing.JButton();
        personBirthdayYearTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        personBirthdayMonthTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        personBirthdayDayTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        jLabel1.setText("Create Person Information");

        jLabel2.setText("First Name");

        jLabel3.setText("Last Name");

        jLabel4.setText("Sex");

        personSexComboBox.setModel(new javax.swing.DefaultComboBoxModel((sex)));
        personSexComboBox.setModel(new javax.swing.DefaultComboBoxModel(sex));
        personSexComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personSexComboBoxActionPerformed(evt);
            }
        });

        jLabel5.setText("Phone-number");

        jLabel6.setText("Weight");

        jLabel7.setText("Height");

        personCreateBtn.setText("Create");
        personCreateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personCreateBtnActionPerformed(evt);
            }
        });

        jLabel8.setText("/");

        jLabel9.setText("/");

        jLabel10.setText("Birthday(YYYY/MM/DD)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel10))
                                .addGap(51, 51, 51))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(personCreateBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(personSexComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(personBirthdayYearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(personBirthdayMonthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(personBirthdayDayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(personFirstNameTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                .addComponent(personLastNameTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(personPhoneNumberTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(personWeightTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(personHeightTextField, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(personFirstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(personLastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(personSexComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(personPhoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(personWeightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(personHeightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(personBirthdayYearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(personBirthdayMonthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(personBirthdayDayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(personCreateBtn)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void personSexComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personSexComboBoxActionPerformed
        // TODO add your handling code here:
//        
    }//GEN-LAST:event_personSexComboBoxActionPerformed

    private void personCreateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personCreateBtnActionPerformed
        // TODO add your handling code here:
        
        String personFirstName = personFirstNameTextField.getText();
        String personLastName = personLastNameTextField.getText();
        String personPhoneNumber = personPhoneNumberTextField.getText();
        String personWeight = personWeightTextField.getText();
        String personHeight = personHeightTextField.getText();
        
        int year = Integer.valueOf(personBirthdayYearTextField.getText());
        int month = Integer.valueOf(personBirthdayMonthTextField.getText());
        int day = Integer.valueOf(personBirthdayDayTextField.getText());
        
        if(personFirstName.equals("")){
            JOptionPane.showMessageDialog(null, "First name cannot be empty!");
        }
        
        else if(personLastName.equals("")){
            JOptionPane.showMessageDialog(null, "Last name cannot be empty!");
        }
//        else if(){
//            
//        }
        else{
            person.setFirstName(personFirstNameTextField.getText());
            person.setLastName(personLastNameTextField.getText());
            person.setSex(personSexComboBox.getSelectedItem().toString());
            person.setPhoneNumber(personPhoneNumberTextField.getText());
            person.setWeight(Double.valueOf(personWeightTextField.getText()));
            person.setHeight(Double.valueOf(personHeightTextField.getText()));
        
            String d = String.valueOf(year)+"-"+String.valueOf(month)+"-"+String.valueOf(day);
            Date date = Date.valueOf(d);
            person.setBirthday(date);
       
        }
    }//GEN-LAST:event_personCreateBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField personBirthdayDayTextField;
    private javax.swing.JTextField personBirthdayMonthTextField;
    private javax.swing.JTextField personBirthdayYearTextField;
    private javax.swing.JButton personCreateBtn;
    private javax.swing.JTextField personFirstNameTextField;
    private javax.swing.JTextField personHeightTextField;
    private javax.swing.JTextField personLastNameTextField;
    private javax.swing.JTextField personPhoneNumberTextField;
    private javax.swing.JComboBox personSexComboBox;
    private javax.swing.JTextField personWeightTextField;
    // End of variables declaration//GEN-END:variables
}
