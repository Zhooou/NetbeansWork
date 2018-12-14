/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Business.*;
//import java.awt.Color;
//import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JTable;
//import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author runyangzhou
 */
public class ViewVitalJPanel extends javax.swing.JPanel {
    private VitalSignsHistory vsh;
    /**
     * Creates new form ViewVitalJPanel
     */
    public ViewVitalJPanel(VitalSignsHistory vsh) {
        initComponents();
        this.vsh = vsh;
        populateTable();
    }

    public void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel) tblVitalSigns.getModel();
        dtm.setRowCount(0);
        
        for(VitalSigns vs : vsh.getVitalSignsHistory()){
            Object row[] = new Object[2];
            row[0] = vs;
            double row1 = vs.getBloodPressure();
            if(row1 > 140)
                row[1] = vs.getBloodPressure() + "(High)";
            else if(row1 < 70)
                row[1] = vs.getBloodPressure() + "(Low)";
            else
                row[1] = vs.getBloodPressure();
            dtm.addRow(row);
        }
        
//        for(int i = 0; i < )
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        txtBloodPressure = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtPulse = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTemperature = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVitalSigns = new javax.swing.JTable();
        btnViewDetail = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblBloodPressure = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setPreferredSize(new java.awt.Dimension(549, 381));

        txtBloodPressure.setForeground(new java.awt.Color(255, 0, 51));
        txtBloodPressure.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("View Vital Sign");

        txtPulse.setEnabled(false);

        jLabel2.setText("Temperature");

        txtTemperature.setEnabled(false);

        jLabel3.setText("Blood Pressure");

        txtDate.setEnabled(false);

        jLabel4.setText("Pulse");

        jLabel5.setText("Date");

        tblVitalSigns.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Blood Pressure"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblVitalSigns.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblVitalSignsPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(tblVitalSigns);

        btnViewDetail.setText("View Detail");
        btnViewDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(108, 108, 108)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPulse, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblBloodPressure))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(btnViewDetail)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewDetail)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBloodPressure))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPulse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblVitalSigns.getSelectedRow();
        
        if(selectedRow >= 0 ){
            VitalSigns vs = (VitalSigns)tblVitalSigns.getValueAt(selectedRow, 0);
            txtBloodPressure.setText(String.valueOf(vs.getBloodPressure()));
            if(vs.getBloodPressure()> 140)
                lblBloodPressure.setText("Too high");
            else if(vs.getBloodPressure() < 70)
                lblBloodPressure.setText("Too low");
            else
                lblBloodPressure.setText("Normal");
            txtDate.setText(vs.getDate());
            
            txtTemperature.setText(String.valueOf(vs.getTemperature()));
            txtPulse.setText(String.valueOf(vs.getPulse()));
        }else{
            JOptionPane.showMessageDialog(null, "Please select one row");
        }
    }//GEN-LAST:event_btnViewDetailActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblVitalSigns.getSelectedRow();
        
        if(selectedRow >= 0){
            VitalSigns vs = (VitalSigns)tblVitalSigns.getValueAt(selectedRow, 0);
            vsh.deleteVitalSigns(vs);
            JOptionPane.showMessageDialog(null, "Selected row is deleted");
            populateTable();
        }else{
            JOptionPane.showMessageDialog(null, "Please select one row");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblVitalSignsPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblVitalSignsPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblVitalSignsPropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnViewDetail;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBloodPressure;
    private javax.swing.JTable tblVitalSigns;
    private javax.swing.JTextField txtBloodPressure;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtPulse;
    private javax.swing.JTextField txtTemperature;
    // End of variables declaration//GEN-END:variables
}