package pantallas;
import Entidades.Incidente;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import reporte.incidentes.ReporteIncidentes;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Proyector
 */
public class ZonadeRiesgo extends javax.swing.JFrame {
private FrameVisualizar padre;
    /**
     * Creates new form ZonadeRiesgo
     */
    public ZonadeRiesgo() {
        initComponents();
    }
 public ZonadeRiesgo(FrameVisualizar padre){
      initComponents();
      this.padre = padre;
      
       cmbRiesgo.removeAllItems();
       btnRiesgo.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnRiesgoActionPerformed(evt);
    }
});

        for(String hora : ReporteIncidentes.escoger){
        cmbRiesgo.addItem(hora);
        
        }
        
         
        
        List<Incidente> incidentes = padre.getIncidentes();

     DefaultListModel<String> modeloListIncidentes2 = new DefaultListModel<>();

    // Add each incident to lstIncidente2
    for (Incidente incidente : incidentes) {
        modeloListIncidentes2.addElement(incidente.getDatosMostrar()+ " - Riesgo: " + incidente.getRiesgo());
    }

   lstIncidente2.setModel(modeloListIncidentes2);

    cmbRiesgo.removeAllItems();
    cmbRiesgo.addItem("Bajo");
    cmbRiesgo.addItem("Medio");
    cmbRiesgo.addItem("Alto");
        
      }
 // Add this method to FrameVisualizar


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();
        cmbRiesgo = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstIncidente2 = new javax.swing.JList<>();
        btnRiesgo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 150, 40));

        lblSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Salir.png"))); // NOI18N
        lblSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSalirMouseClicked(evt);
            }
        });
        jPanel1.add(lblSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, 50));

        cmbRiesgo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbRiesgo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRiesgoActionPerformed(evt);
            }
        });
        jPanel1.add(cmbRiesgo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, 170, 30));

        lstIncidente2.setBackground(new java.awt.Color(53, 170, 255));
        lstIncidente2.setBorder(null);
        lstIncidente2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lstIncidente2.setForeground(new java.awt.Color(255, 255, 255));
        lstIncidente2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(lstIncidente2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 520, 240));

        btnRiesgo.setText("Determinar");
        jPanel1.add(btnRiesgo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, 170, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/EVA.png"))); // NOI18N
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        // TODO add your handling code here:
        salir();
    }//GEN-LAST:event_lblSalirMouseClicked
/**/
    private void cmbRiesgoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRiesgoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbRiesgoActionPerformed

    private void btnRiesgoActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
  String selectedIncidentString = lstIncidente2.getSelectedValue();

    if (selectedIncidentString != null) {
        // Extract the incident and risk level from the selected string}
        
        String[] parts = selectedIncidentString.split(" - Riesgo: ");
        String selectedIncident = parts[0];
        String selectedRiskLevel = cmbRiesgo.getSelectedItem().toString();

        // Find the corresponding Incident object
        for (Incidente incidente : padre.getIncidentes()) {
            if (incidente.getDatosMostrar().equals(selectedIncident)) {
                // Set the risk level for the incident
                incidente.setRiesgo(selectedRiskLevel);
                break;
            }
        }

        // Update the list with the modified incidents
        updateIncidentList();
    }
    
    }

    private void updateIncidentList() {
    DefaultListModel<String> modeloListIncidentes2 = new DefaultListModel<>();

    // Add each incident and its risk level to lstIncidente2
    for (Incidente incidente : padre.getIncidentes()) {
        modeloListIncidentes2.addElement(incidente.getDatosMostrar() + " - Riesgo: " + incidente.getRiesgo());
    }

    lstIncidente2.setModel(modeloListIncidentes2);
    }
    
    
    
    
    
    
    
    private void salir(){
      padre.setVisible(true);
      this.dispose();
    }
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
            java.util.logging.Logger.getLogger(ZonadeRiesgo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ZonadeRiesgo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ZonadeRiesgo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ZonadeRiesgo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ZonadeRiesgo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRiesgo;
    private javax.swing.JComboBox<String> cmbRiesgo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JList<String> lstIncidente2;
    // End of variables declaration//GEN-END:variables
}
