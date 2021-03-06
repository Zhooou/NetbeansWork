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
public class DriverLisenceJPanel extends javax.swing.JPanel {

    private Person person;
    
    
    /**
     * Creates new form DriverLisenceJPanel
     */
    public DriverLisenceJPanel(Person person) {
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

        driverLisenceSplitPane = new javax.swing.JSplitPane();
        driverLisenceDisplayJPanel = new javax.swing.JPanel();
        driverLisenceControlJPanel = new javax.swing.JPanel();
        driverLisenceCreateBtn = new javax.swing.JButton();
        driverLisenceViewBtn = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout driverLisenceDisplayJPanelLayout = new javax.swing.GroupLayout(driverLisenceDisplayJPanel);
        driverLisenceDisplayJPanel.setLayout(driverLisenceDisplayJPanelLayout);
        driverLisenceDisplayJPanelLayout.setHorizontalGroup(
            driverLisenceDisplayJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 291, Short.MAX_VALUE)
        );
        driverLisenceDisplayJPanelLayout.setVerticalGroup(
            driverLisenceDisplayJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 296, Short.MAX_VALUE)
        );

        driverLisenceSplitPane.setRightComponent(driverLisenceDisplayJPanel);

        driverLisenceCreateBtn.setText("Create");
        driverLisenceCreateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                driverLisenceCreateBtnActionPerformed(evt);
            }
        });

        driverLisenceViewBtn.setText("View");
        driverLisenceViewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                driverLisenceViewBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout driverLisenceControlJPanelLayout = new javax.swing.GroupLayout(driverLisenceControlJPanel);
        driverLisenceControlJPanel.setLayout(driverLisenceControlJPanelLayout);
        driverLisenceControlJPanelLayout.setHorizontalGroup(
            driverLisenceControlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(driverLisenceControlJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(driverLisenceControlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(driverLisenceCreateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(driverLisenceViewBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        driverLisenceControlJPanelLayout.setVerticalGroup(
            driverLisenceControlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(driverLisenceControlJPanelLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(driverLisenceCreateBtn)
                .addGap(55, 55, 55)
                .addComponent(driverLisenceViewBtn)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        driverLisenceSplitPane.setLeftComponent(driverLisenceControlJPanel);

        add(driverLisenceSplitPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void driverLisenceCreateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_driverLisenceCreateBtnActionPerformed
        // TODO add your handling code here:
        DriverLisenceCreateJPanel driverLisenceCreateJPanel = new DriverLisenceCreateJPanel(person);
        driverLisenceSplitPane.setRightComponent(driverLisenceCreateJPanel);
    }//GEN-LAST:event_driverLisenceCreateBtnActionPerformed

    private void driverLisenceViewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_driverLisenceViewBtnActionPerformed

        // TODO add your handling code here:
        if(person.getDriverLisence() == null){
            JOptionPane.showMessageDialog(null, "No Driver's Lisence Information Created Yet!");
        }
        else{
            DriverLisenceViewJPanel driverLisenceViewJPanel = new DriverLisenceViewJPanel(person);
            driverLisenceSplitPane.setRightComponent(driverLisenceViewJPanel);
        }
    }//GEN-LAST:event_driverLisenceViewBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel driverLisenceControlJPanel;
    private javax.swing.JButton driverLisenceCreateBtn;
    private javax.swing.JPanel driverLisenceDisplayJPanel;
    private javax.swing.JSplitPane driverLisenceSplitPane;
    private javax.swing.JButton driverLisenceViewBtn;
    // End of variables declaration//GEN-END:variables
}
