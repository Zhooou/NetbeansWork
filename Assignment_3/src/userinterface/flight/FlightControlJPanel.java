/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.flight;

import business.Airlines;
import business.FlightCatalog;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author runyangzhou
 */
public class FlightControlJPanel extends javax.swing.JPanel {
    private JPanel displayJPanel;
    private FlightCatalog flightCatalog;
    private Airlines airlines;
    /**
     * Creates new form FlightControlJPanel
     */
    public FlightControlJPanel(JPanel displayJPanel, FlightCatalog flightCatalog, Airlines airlines) {
        initComponents();
        this.displayJPanel = displayJPanel;
        this.flightCatalog = flightCatalog;
        this.airlines = airlines;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        btnView = new javax.swing.JButton();

        btnBack.setText("<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnCreate.setText("Create New Flight");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnView.setText("View Flight List");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(btnCreate)
                        .addGap(99, 99, 99)
                        .addComponent(btnView))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btnBack)))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnView))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(41, 41, 41))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        displayJPanel.remove(this);
        CardLayout layout = (CardLayout) displayJPanel.getLayout();
        layout.previous(displayJPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        FlightCreateJPanel panel = new FlightCreateJPanel(displayJPanel, flightCatalog, airlines);
        displayJPanel.add("FlightCreateJPanel", panel);
        CardLayout layout = (CardLayout)displayJPanel.getLayout();
        layout.next(displayJPanel);

    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        FlightMngJPanel panel = new FlightMngJPanel(displayJPanel, flightCatalog, airlines);
        displayJPanel.add("FlightMngJPanel", panel);
        CardLayout layout = (CardLayout)displayJPanel.getLayout();
        layout.next(displayJPanel);
    }//GEN-LAST:event_btnViewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnView;
    // End of variables declaration//GEN-END:variables
}
