/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;
import information.*;
import javax.swing.JOptionPane;
/**
 *
 * @author runyangzhou
 */
public class MedicalRecordJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MedicalRecordJPanel
     */
    private Person person;
    public MedicalRecordJPanel(Person person) {
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

        medicalRecordSplitPane = new javax.swing.JSplitPane();
        medicalRecordDisplayJPanel = new javax.swing.JPanel();
        medicalRecordControlJPanel = new javax.swing.JPanel();
        medicalRecordCreateBtn = new javax.swing.JButton();
        medicalRecordViewBtn = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout medicalRecordDisplayJPanelLayout = new javax.swing.GroupLayout(medicalRecordDisplayJPanel);
        medicalRecordDisplayJPanel.setLayout(medicalRecordDisplayJPanelLayout);
        medicalRecordDisplayJPanelLayout.setHorizontalGroup(
            medicalRecordDisplayJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 291, Short.MAX_VALUE)
        );
        medicalRecordDisplayJPanelLayout.setVerticalGroup(
            medicalRecordDisplayJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 296, Short.MAX_VALUE)
        );

        medicalRecordSplitPane.setRightComponent(medicalRecordDisplayJPanel);

        medicalRecordCreateBtn.setText("Create");
        medicalRecordCreateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicalRecordCreateBtnActionPerformed(evt);
            }
        });

        medicalRecordViewBtn.setText("View");
        medicalRecordViewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicalRecordViewBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout medicalRecordControlJPanelLayout = new javax.swing.GroupLayout(medicalRecordControlJPanel);
        medicalRecordControlJPanel.setLayout(medicalRecordControlJPanelLayout);
        medicalRecordControlJPanelLayout.setHorizontalGroup(
            medicalRecordControlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(medicalRecordControlJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(medicalRecordControlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(medicalRecordCreateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(medicalRecordViewBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        medicalRecordControlJPanelLayout.setVerticalGroup(
            medicalRecordControlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(medicalRecordControlJPanelLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(medicalRecordCreateBtn)
                .addGap(55, 55, 55)
                .addComponent(medicalRecordViewBtn)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        medicalRecordSplitPane.setLeftComponent(medicalRecordControlJPanel);

        add(medicalRecordSplitPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void medicalRecordCreateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicalRecordCreateBtnActionPerformed
        // TODO add your handling code here:
        MedicalRecordCreateJPanel medicalRecordCreateJPanel = new MedicalRecordCreateJPanel(person);
        medicalRecordSplitPane.setRightComponent(medicalRecordCreateJPanel);
    }//GEN-LAST:event_medicalRecordCreateBtnActionPerformed

    private void medicalRecordViewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicalRecordViewBtnActionPerformed
        // TODO add your handling code here:
        if(person.getMedicalRecord() == null){
            JOptionPane.showMessageDialog(null, "No Medical Record Information Created Yet!");
        }
        else{
            MedicalRecordViewJPanel medicalRecordViewJPanel = new MedicalRecordViewJPanel(person);
            medicalRecordSplitPane.setRightComponent(medicalRecordViewJPanel);
        }
        
    }//GEN-LAST:event_medicalRecordViewBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel medicalRecordControlJPanel;
    private javax.swing.JButton medicalRecordCreateBtn;
    private javax.swing.JPanel medicalRecordDisplayJPanel;
    private javax.swing.JSplitPane medicalRecordSplitPane;
    private javax.swing.JButton medicalRecordViewBtn;
    // End of variables declaration//GEN-END:variables
}
