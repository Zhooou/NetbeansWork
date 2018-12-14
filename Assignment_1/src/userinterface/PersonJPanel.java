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
public class PersonJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PersonJPanel
     */
    private Person person;
    public PersonJPanel(Person person) {
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

        personSplitPane = new javax.swing.JSplitPane();
        personControlPanel = new javax.swing.JPanel();
        personCreateBtn = new javax.swing.JButton();
        personViewBtn = new javax.swing.JButton();
        personDisplayPanel = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(605, 369));
        setLayout(new java.awt.BorderLayout());

        personCreateBtn.setText("Create");
        personCreateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personCreateBtnActionPerformed(evt);
            }
        });

        personViewBtn.setText("View");
        personViewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personViewBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout personControlPanelLayout = new javax.swing.GroupLayout(personControlPanel);
        personControlPanel.setLayout(personControlPanelLayout);
        personControlPanelLayout.setHorizontalGroup(
            personControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personControlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(personControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(personCreateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(personViewBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        personControlPanelLayout.setVerticalGroup(
            personControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personControlPanelLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(personCreateBtn)
                .addGap(55, 55, 55)
                .addComponent(personViewBtn)
                .addContainerGap(151, Short.MAX_VALUE))
        );

        personSplitPane.setLeftComponent(personControlPanel);

        javax.swing.GroupLayout personDisplayPanelLayout = new javax.swing.GroupLayout(personDisplayPanel);
        personDisplayPanel.setLayout(personDisplayPanelLayout);
        personDisplayPanelLayout.setHorizontalGroup(
            personDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 492, Short.MAX_VALUE)
        );
        personDisplayPanelLayout.setVerticalGroup(
            personDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 365, Short.MAX_VALUE)
        );

        personSplitPane.setRightComponent(personDisplayPanel);

        add(personSplitPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void personCreateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personCreateBtnActionPerformed
        // TODO add your handling code here:
        PersonCreateJPanel personCreateJPanel = new PersonCreateJPanel(person);
        personSplitPane.setRightComponent(personCreateJPanel);
    }//GEN-LAST:event_personCreateBtnActionPerformed

    private void personViewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personViewBtnActionPerformed
        // TODO add your handling code here:
        
        if(person.getFirstName() == null){
            JOptionPane.showMessageDialog(null, "No Person Information Created Yet!");
        }
        else{
            PersonViewJPanel personViewJPanel = new PersonViewJPanel(person);
            personSplitPane.setRightComponent(personViewJPanel);
        }
    }//GEN-LAST:event_personViewBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel personControlPanel;
    private javax.swing.JButton personCreateBtn;
    private javax.swing.JPanel personDisplayPanel;
    private javax.swing.JSplitPane personSplitPane;
    private javax.swing.JButton personViewBtn;
    // End of variables declaration//GEN-END:variables
}
