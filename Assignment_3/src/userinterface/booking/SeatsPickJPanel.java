/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.booking;

import business.Flight;
import business.FlightCatalog;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author runyangzhou
 */
public class SeatsPickJPanel extends javax.swing.JPanel {
    private Flight flight;
    private int[] row;
    private int[] column;
    private JPanel displayJPanel;
    private FlightCatalog result;
    /**
     * Creates new form SeatsPickJPanel
     */
    public SeatsPickJPanel(JPanel displayJPanel, Flight flight, FlightCatalog result) {
        initComponents();
        row = new int[25];
        column = new int[6];
        for(int i = 0; i < row.length; i++){
            row[0] = i + 1;
            comboBoxRow.addItem(row[0]);
        }
        for(int i = 0; i < column.length; i++){
            row[0] = i + 1;
            comboBoxColumn.addItem(row[0]);
        }    
        this.flight = flight;
        this.displayJPanel = displayJPanel;
        this.result = result;
        lblSerialNumber.setText(flight.getPlane().getSerialNum());
        lblArrival.setText(flight.getArrivalAirport());
        lblDeparture.setText(flight.getDepartureAirport());
        DateFormat df = new SimpleDateFormat("MM/dd/yy HH:mm");
        lblDate.setText(df.format(flight.getDepartureDate()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSerialNumber = new javax.swing.JLabel();
        lblDeparture = new javax.swing.JLabel();
        lblArrival = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        comboBoxRow = new javax.swing.JComboBox();
        comboBoxColumn = new javax.swing.JComboBox();
        btnSubmit = new javax.swing.JButton();
        lblDate = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        lblSerialNumber.setText("jLabel1");

        lblDeparture.setText("lblDeparture");

        lblArrival.setText("lblArrival");

        jLabel1.setText(">>>>");

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        lblDate.setText("lblTime");

        btnBack.setText("<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(comboBoxRow, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(comboBoxColumn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(btnSubmit))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDate)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(270, 270, 270)
                                    .addComponent(lblSerialNumber))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(133, 133, 133)
                                    .addComponent(lblDeparture, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1))))
                        .addGap(42, 42, 42)
                        .addComponent(lblArrival, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnBack)))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblSerialNumber)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDeparture)
                    .addComponent(lblArrival)
                    .addComponent(jLabel1))
                .addGap(37, 37, 37)
                .addComponent(lblDate)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxRow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxColumn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addComponent(btnSubmit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(23, 23, 23))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        int i, j;
        i = (int) comboBoxRow.getSelectedItem() - 1;
        j = (int) comboBoxColumn.getSelectedItem() - 1;
        int[][] seats = flight.getSeats();
        if( seats[i][j] != 0){
            seats[i][j] = 0;
            flight.setSeats(seats);
            flight.setAvilSeats(flight.getAvilSeats() - 1);
            JOptionPane.showMessageDialog(null, "Order successful");
        }
        else{
            JOptionPane.showMessageDialog(null, "This seat has been taken");
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        displayJPanel.remove(this);
        CardLayout layout = (CardLayout) displayJPanel.getLayout();
        layout.previous(displayJPanel);
        Component[] components = displayJPanel.getComponents();
        for(Component c : components){
            if(c instanceof BookingAllJPanel){
                BookingAllJPanel panel = (BookingAllJPanel) c;
                panel.populate();
            }
            if(c instanceof BookingSearchJPanel){
                BookingSearchJPanel panel = (BookingSearchJPanel) c;
                panel.populate(result);
            }
        }
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox comboBoxColumn;
    private javax.swing.JComboBox comboBoxRow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblArrival;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDeparture;
    private javax.swing.JLabel lblSerialNumber;
    // End of variables declaration//GEN-END:variables
}
