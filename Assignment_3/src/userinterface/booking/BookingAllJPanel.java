/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.booking;

import business.Airlines;
import business.Flight;
import business.FlightCatalog;
import java.awt.CardLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author runyangzhou
 */
public class BookingAllJPanel extends javax.swing.JPanel {
    private JPanel displayJPanel;
    private FlightCatalog flightCatalog;
    private Airlines airlines;
    /**
     * Creates new form BookingAllJPanel
     */
    public BookingAllJPanel(JPanel displayJPanel, FlightCatalog flightCatalog, Airlines airlines) {
        initComponents();
        this.displayJPanel = displayJPanel;
        this.flightCatalog = flightCatalog;
        this.airlines = airlines;
        populate();
    }
    
    public void populate(){
        DefaultTableModel dtm = (DefaultTableModel) tblBooking.getModel();
        dtm.setRowCount(0);
        
        for(Flight flight : flightCatalog.getFlightList()){
            Object[] row = new Object[dtm.getColumnCount()];
            row[0] = flight;
            row[1] = flight.getDepartureAirport();
            row[2] = flight.getArrivalAirport();
            DateFormat df = new SimpleDateFormat("MM/dd/yy HH:mm");
            row[3] = df.format(flight.getDepartureDate());
            row[4] = flight.getAvilSeats();
            dtm.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblBooking = new javax.swing.JTable();
        btnBook = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        tblBooking.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial Number", "Departure", "Arrival", "Date", "Seats"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblBooking);

        btnBook.setText("Book");
        btnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookActionPerformed(evt);
            }
        });

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(btnBook))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnBack)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btnBook)
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addContainerGap(12, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblBooking.getSelectedRow();
        if(selectedRow >= 0){
            Flight flight = (Flight)tblBooking.getValueAt(selectedRow, 0);
            SeatsPickJPanel panel = new SeatsPickJPanel(displayJPanel, flight, flightCatalog);
            displayJPanel.add("SeatsPickJPanel", panel);
            CardLayout layout = (CardLayout)displayJPanel.getLayout();
            layout.next(displayJPanel);
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_btnBookActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        displayJPanel.remove(this);
        CardLayout layout = (CardLayout) displayJPanel.getLayout();
        layout.previous(displayJPanel);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBook;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBooking;
    // End of variables declaration//GEN-END:variables
}
