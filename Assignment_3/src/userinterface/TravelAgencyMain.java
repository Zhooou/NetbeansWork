/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import userinterface.airlines.PlaneControlJPanel;
import business.*;
import java.awt.CardLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import userinterface.administration.AirlinesMngJPanel;
import userinterface.airlines.*;
import userinterface.booking.BookingControlJPanel;
import userinterface.flight.FlightControlJPanel;
import userinterface.order.OrderJPanel;

/**
 *
 * @author runyangzhou
 */
public class TravelAgencyMain extends javax.swing.JFrame {
    
    
    private OrderList orderList;
    private FlightCatalog flightCatalog;
    private Airlines airlines;
//    private Fleet allPlane;
    /**
     * Creates new form TravelAgencyJFrame
     */
    public TravelAgencyMain() {
        
        initComponents();
        
        WelcomeJPanel panel = new WelcomeJPanel(displayJPanel);
        displayJPanel.add("WelcomeJPanel", panel);
        CardLayout layout = (CardLayout)displayJPanel.getLayout();
        layout.next(displayJPanel);
        
//        allPlane = new Fleet("allPlane");
        orderList = new OrderList();
        airlines = new Airlines();
        flightCatalog = new FlightCatalog();
        Fleet dl = new Fleet("Delta");
        Fleet ua = new Fleet("United Airlines");
        Fleet aa = new Fleet("American Airlines");
        File f=new File("plane.csv");// read plane information
        try {
            InputStreamReader reader = new InputStreamReader(new FileInputStream(f));
            BufferedReader br = new BufferedReader(reader);
            String line = "";
            try {
                line = br.readLine(); //read header
                line = br.readLine();
                while (line != null) {
                    String[] planeData = line.split(",");
                    if(planeData[3].equals("Delta")){
                        dl.getPlaneList().add(addPlane(line));
//                        allPlane.getPlaneList().add(addPlane(line));
                        line = br.readLine();
                    }
                    if(planeData[3].equals("United Airlines")){
                        ua.getPlaneList().add(addPlane(line));
//                        allPlane.getPlaneList().add(addPlane(line));
                        line = br.readLine();
                    }
                    if(planeData[3].equals("American Airlines")){
                        aa.getPlaneList().add(addPlane(line));
//                        allPlane.getPlaneList().add(addPlane(line));
                        line = br.readLine();
                    }
                    
                }
            } catch (IOException ex) {
                Logger.getLogger(TravelAgencyMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TravelAgencyMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        airlines.getFleetList().add(dl);
        airlines.getFleetList().add(aa);
        airlines.getFleetList().add(ua);
        
        f= new File("flight.csv");
        InputStreamReader reader;
        try {
            reader = new InputStreamReader(new FileInputStream(f));
            BufferedReader br = new BufferedReader(reader);
            String line = "";
            try {
                line = br.readLine();
                line = br.readLine();
                 while (line != null) {
                    String[] flightData = line.split(",");
                    flightCatalog.getFlightList().add(addFlight(line));
                    line = br.readLine();
                }
            } catch (IOException ex) {
                Logger.getLogger(TravelAgencyMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TravelAgencyMain.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
    }
    
     public Plane addPlane(String line){
        String[] planeData = line.split(",");
        Plane p = new Plane();
        p.setSerialNum(planeData[0]);
        p.setModel(planeData[1]);
        p.setSeats(Integer.parseInt(planeData[2]));
        return p;
     }
     
     public Flight addFlight(String line){
        String[] data=line.split(",");
        Flight f=new Flight();
//        for(Plane p : allPlane.getPlaneList()){
        for(Fleet fleet : airlines.getFleetList()){
            for(Plane plane: fleet.getPlaneList())
                if(plane.getSerialNum().equals(data[0])){
                    f.setPlane(plane);
                    break;
            }
        }
        DateFormat df = new SimpleDateFormat("MM/dd/yy HH:mm");
        try
        {
           f.setDepartureDate(df.parse(data[1]));}
        catch(Exception d){}
        f.setDepartureAirport(data[2]);
        f.setArrivalAirport(data[3]);
        return f;
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        controlJPanel = new javax.swing.JPanel();
        btnAdministration = new javax.swing.JButton();
        btnFlight = new javax.swing.JButton();
        btnBooking = new javax.swing.JButton();
        btnOrder = new javax.swing.JButton();
        btnPlane = new javax.swing.JButton();
        displayJPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAdministration.setText("Administration");
        btnAdministration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdministrationActionPerformed(evt);
            }
        });

        btnFlight.setText("Flight Info");
        btnFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFlightActionPerformed(evt);
            }
        });

        btnBooking.setText("Booking");
        btnBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookingActionPerformed(evt);
            }
        });

        btnOrder.setText("Order");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });

        btnPlane.setText("Plane Info");
        btnPlane.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlJPanelLayout = new javax.swing.GroupLayout(controlJPanel);
        controlJPanel.setLayout(controlJPanelLayout);
        controlJPanelLayout.setHorizontalGroup(
            controlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFlight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBooking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdministration, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPlane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOrder, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        controlJPanelLayout.setVerticalGroup(
            controlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlJPanelLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(btnAdministration)
                .addGap(29, 29, 29)
                .addComponent(btnPlane)
                .addGap(36, 36, 36)
                .addComponent(btnFlight)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(btnBooking)
                .addGap(28, 28, 28)
                .addComponent(btnOrder)
                .addGap(46, 46, 46))
        );

        splitPane.setLeftComponent(controlJPanel);

        displayJPanel.setLayout(new java.awt.CardLayout());
        splitPane.setRightComponent(displayJPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(splitPane, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdministrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdministrationActionPerformed
        // TODO add your handling code here:
        AirlinesMngJPanel panel = new AirlinesMngJPanel(displayJPanel, airlines);
        displayJPanel.add("AirlinesMngJPanel", panel);
        CardLayout layout = (CardLayout)displayJPanel.getLayout();
        layout.next(displayJPanel);
        
    }//GEN-LAST:event_btnAdministrationActionPerformed

    private void btnPlaneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaneActionPerformed
        // TODO add your handling code here:
        AirlinesLoginJPanel panel = new AirlinesLoginJPanel(displayJPanel, airlines);
        displayJPanel.add("AirlinesLoginJPanel", panel);
        CardLayout layout = (CardLayout)displayJPanel.getLayout();
        layout.next(displayJPanel);
    }//GEN-LAST:event_btnPlaneActionPerformed

    private void btnFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFlightActionPerformed
        // TODO add your handling code here:
        FlightControlJPanel panel = new FlightControlJPanel(displayJPanel, flightCatalog, airlines);
        displayJPanel.add("FlightControlJPanel", panel);
        CardLayout layout = (CardLayout)displayJPanel.getLayout();
        layout.next(displayJPanel);
    }//GEN-LAST:event_btnFlightActionPerformed

    private void btnBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookingActionPerformed
        // TODO add your handling code here:
        BookingControlJPanel panel = new BookingControlJPanel(displayJPanel, flightCatalog, airlines);
        displayJPanel.add("BookingControlJPanel", panel);
        CardLayout layout = (CardLayout)displayJPanel.getLayout();
        layout.next(displayJPanel);
    }//GEN-LAST:event_btnBookingActionPerformed

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        // TODO add your handling code here:
        OrderJPanel panel = new OrderJPanel(displayJPanel, flightCatalog);
        displayJPanel.add("OrderJPanel", panel);
        CardLayout layout = (CardLayout)displayJPanel.getLayout();
        layout.next(displayJPanel);
    }//GEN-LAST:event_btnOrderActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TravelAgencyMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdministration;
    private javax.swing.JButton btnBooking;
    private javax.swing.JButton btnFlight;
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton btnPlane;
    private javax.swing.JPanel controlJPanel;
    private javax.swing.JPanel displayJPanel;
    private javax.swing.JSplitPane splitPane;
    // End of variables declaration//GEN-END:variables
}
