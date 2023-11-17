/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pantallas;
import Entidades.Incidente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import reporte.incidentes.ReporteIncidentes;
/**
 *
 * @author Proyector
 */
public class FrameVisualizar extends javax.swing.JFrame {

  private FrameLogin padre; 
private List<Incidente> incidentes; 
//public static List<Incidente> listaDeIncidente;
private DefaultListModel<String> modeloListIncidentes;
    /**
     * Creates new form JframeIncidentes
     */
    public FrameVisualizar() {
        initComponents();
    }
public FrameVisualizar(FrameLogin padre){
      initComponents();
      this.padre = padre;
      modeloListIncidentes = new DefaultListModel<>();
        lstIncidente.setModel(modeloListIncidentes);
        // Inicializar la lista de incidentes
        incidentes = new ArrayList<>();
      //this.txtTipo.setText(incidente.getIncidente().getDatosMostrar());
//  
  cbmEstado.setModel(new javax.swing.DefaultComboBoxModel<>
        (new String[]{"Por atender", "En proceso", "Atendido"}));

    // Add action listener to btnEstado
    btnEstado.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnEstadoActionPerformed(evt);
        }
    });



      }
                  

                                     

                                      
private void cargarIncidentes() {
    // ... (existing code)

    // Add each incident with risk level to lstIncidente
    DefaultListModel<String> modeloListIncidentes = new DefaultListModel<>();
    for (Incidente incidente : incidentes) {
        modeloListIncidentes.addElement(incidente.getDatosMostrar()
        + " - Riesgo: " + incidente.getRiesgo() +
                " - Estado: " + incidente.getEstado());
    }

    // Update the JList model
    lstIncidente.setModel(modeloListIncidentes);
}

    
    private void llamarPantallaEdicion(Incidente incidente){
    
    FrameRegistrar PantallaEstudiante = new FrameRegistrar(this,incidente );
    PantallaEstudiante.setLocationRelativeTo(null);
    PantallaEstudiante.setVisible(true);
    this.setVisible(false);
    
    }
    

    private void lstIncidenteMouseClicked(java.awt.event.MouseEvent evt) {                                          
        // TODO add your handling code here:
        if(evt.getClickCount()>1){
        //Incidente paciente = incidentes.get(lstIncidente.getSelectedIndex());
        //this.padre.setIncidente(paciente);
        //salir();
        
      FrameRegistrar Incidente = new FrameRegistrar(this,
              incidentes.get(lstIncidente.getSelectedIndex()));
        Incidente.setLocationRelativeTo(null);
        Incidente.setVisible(true);
        this.setVisible(false);
        
        
        
        
        
        
    }                                         

    }
//public void setIncidente(Incidente incidente){
//    
//    this.pacienteSelecionado = incidente; 
//    txtPaciente.setText(incidente.getDatosMostrar());
//    
//    }
private void salir(){
      padre.setVisible(true);
      this.dispose();
    }

 public void agregarI(Incidente incidente){//va a recibir un estudiante
         /*A mi lista de estudiante (le agrego el estudiante)
         una vez que lo agregue a mi modelo , falta agregarlo al list view*/
        incidentes.add(incidente);
        modeloListIncidentes.addElement(incidente.getDatosMostrar());
        lstIncidente.setModel(modeloListIncidentes);
     } 
 
public void agregarNuevoPaciente(Incidente incidente){
       incidentes.add(incidente);
        buscar("");
    }

private void buscar(String criterio){
        this.modeloListIncidentes.removeAllElements();
        
        for(Incidente incidente : incidentes){ 
            if(incidente.getTipo() != null && incidente.getTipo()
                    .contains(criterio)){
                this.modeloListIncidentes.addElement
        (incidente.getDatosMostrar());
            }
        }    
    }


  
 public void actualizarI(Incidente incidente) {
    // Encuentra el índice del estudiante en la lista y actualiza su información.
    int index = incidentes.indexOf(incidente);
    if (index != -1) {
        incidentes.set(index, incidente);
        modeloListIncidentes.set(index, incidente.getDatosMostrar());
        
        
    }
}

public void agregarNuevoIncidente(Incidente incidente) {
        incidentes.add(incidente);
        // Actualizar el modelo de la lista
        modeloListIncidentes.addElement(incidente.getDatosMostrar());
    }

public void moveIncidentToFront(Incidente incidente) {
    incidentes.remove(incidente);
    incidentes.add(0, incidente);
    // Update the JList model
    updateIncidentList();
}



public void updateIncidentList() {
    DefaultListModel<String> modeloListIncidentes = new DefaultListModel<>();
    for (Incidente incidente : incidentes) {
       modeloListIncidentes.addElement(incidente.getDatosMostrar() );
// modeloListIncidentes.addElement(incidente.getDatosMostrar());
       
    }
    lstIncidente.setModel(modeloListIncidentes);
    lstIncidente.repaint();
}











    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        lblEliminar = new javax.swing.JLabel();
        cbmEstado = new javax.swing.JComboBox<>();
        btnCategorizar = new javax.swing.JButton();
        btnEstado = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstIncidente = new javax.swing.JList<>();
        lblEditar2 = new javax.swing.JLabel();
        lblAgregar = new javax.swing.JLabel();
        lblEditar1 = new javax.swing.JLabel();
        lblEditar = new javax.swing.JLabel();
        lblRiesgo = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBuscar.setBorder(null);
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        jPanel2.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 330, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 1300, 80));

        lblEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Elimina.png"))); // NOI18N
        lblEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEliminarMouseClicked(evt);
            }
        });
        jPanel1.add(lblEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 490, 150, 50));

        cbmEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cbmEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 240, 120, 30));

        btnCategorizar.setText("Categorizar");
        btnCategorizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategorizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCategorizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 100, 30));

        btnEstado.setText("Determinar");
        btnEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadoActionPerformed(evt);
            }
        });
        jPanel1.add(btnEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 240, 100, 30));

        lstIncidente.setBackground(new java.awt.Color(53, 170, 255));
        lstIncidente.setBorder(null);
        lstIncidente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lstIncidente.setForeground(new java.awt.Color(255, 255, 255));
        lstIncidente.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(lstIncidente);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 490, 190));

        lblEditar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/importar.png"))); // NOI18N
        lblEditar2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblEditar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEditar2MouseClicked(evt);
            }
        });
        jPanel1.add(lblEditar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 470, 150, 50));

        lblAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Agrega.png"))); // NOI18N
        lblAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAgregarMouseClicked(evt);
            }
        });
        jPanel1.add(lblAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 150, 50));

        lblEditar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exportar.png"))); // NOI18N
        lblEditar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblEditar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEditar1MouseClicked(evt);
            }
        });
        jPanel1.add(lblEditar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 470, 150, 50));

        lblEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Editar.png"))); // NOI18N
        lblEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEditarMouseClicked(evt);
            }
        });
        jPanel1.add(lblEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 480, 150, 50));

        lblRiesgo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Evaluacion.png"))); // NOI18N
        lblRiesgo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblRiesgo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRiesgoMouseClicked(evt);
            }
        });
        jPanel1.add(lblRiesgo, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 480, 160, 50));

        lblSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Salir.png"))); // NOI18N
        lblSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSalirMouseClicked(evt);
            }
        });
        jPanel1.add(lblSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 490, 140, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Frame 9 (3).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        // TODO add your handling code here:
        salir();
    }//GEN-LAST:event_lblSalirMouseClicked

    private void lblRiesgoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRiesgoMouseClicked
        // TODO add your handling code here:
         ZonadeRiesgo pantallaRegistro = new ZonadeRiesgo(this);   
        pantallaRegistro.setLocationRelativeTo(this);
        pantallaRegistro.setVisible(true);
        
        
        this.setVisible(false);
    }//GEN-LAST:event_lblRiesgoMouseClicked

    private void lblAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarMouseClicked
        // TODO add your handling code here:
        FrameRegistrar pantallaRegistro = new FrameRegistrar(this); 
        pantallaRegistro.setLocationRelativeTo(this);
        pantallaRegistro.setVisible(true);
        
        
        
        this.setVisible(false);
    }//GEN-LAST:event_lblAgregarMouseClicked

    private void lblEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditarMouseClicked
        // TODO add your handling code here:
         int index = lstIncidente.getSelectedIndex();
         if (index != -1) {
        Incidente estudiante = incidentes.get(index);
        llamarPantallaEdicion(estudiante);
       
        
        
        this.setVisible(false);
    }//GEN-LAST:event_lblEditarMouseClicked
    }
    private void lblEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminarMouseClicked
 
   
         if (JOptionPane.showConfirmDialog(this
                 , "¿Deseas eliminar este incidente?")
                == JOptionPane.OK_OPTION) {
           
                 FrameIncidenteEliminado pantallaRegistro = new
         FrameIncidenteEliminado(this); 
        pantallaRegistro.setLocationRelativeTo(this);
        pantallaRegistro.setVisible(true);

        int selectedIndex = lstIncidente.getSelectedIndex();
    if (selectedIndex != -1) {
       
        Incidente estudiante = incidentes.get(selectedIndex);

        
        modeloListIncidentes.remove(selectedIndex);
        incidentes.remove(selectedIndex);

      
        lstIncidente.setModel(modeloListIncidentes);
        
    }       

        this.setVisible(false);
     
         }
        
    }//GEN-LAST:event_lblEliminarMouseClicked
/**/
    /**/
    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        // TODO add your handling code here:
        buscar();
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btnCategorizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategorizarActionPerformed
        // TODO add your handling code here:
        categorizeIncidentsByType();
    }//GEN-LAST:event_btnCategorizarActionPerformed

    private void btnEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadoActionPerformed
        // TODO add your handling code here:
          String selectedEstado = cbmEstado.getSelectedItem().toString();

    // Update the state for the selected incident
    int selectedIndex = lstIncidente.getSelectedIndex();
    if (selectedIndex != -1) {
        Incidente selectedIncidente = incidentes.get(selectedIndex);
        selectedIncidente.setEstado(selectedEstado);

        // Update the list with the modified incident information
        updateIncidentList();
    }
    }//GEN-LAST:event_btnEstadoActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
     // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void lblEditar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditar1MouseClicked
        // TODO add your handling code here:
        
         saveIncidentDataToFile();
    }//GEN-LAST:event_lblEditar1MouseClicked

    private void lblEditar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditar2MouseClicked
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
    int returnValue = fileChooser.showOpenDialog(null);

    if (returnValue == JFileChooser.APPROVE_OPTION) {
        // Get the selected file
        File selectedFile = fileChooser.getSelectedFile();

        try {
            // Read the content of the file
            BufferedReader reader = new BufferedReader(new FileReader(selectedFile));
            String line;

            // Clear existing data
            incidentes.clear();
            modeloListIncidentes.clear();

            // Read each line and populate the incident data
            while ((line = reader.readLine()) != null) {
                // Assuming the file format is: "Tipo: ... - Hora: ... - Fecha: ... - Descripcion: ..."
                String[] parts = line.split(" - ");

                if (parts.length == 5) {
                    String tipo = parts[0].substring(parts[0].indexOf(":") + 2);
                    String hora = parts[1].substring(parts[1].indexOf(":") + 2);
                    String fecha = parts[2].substring(parts[2].indexOf(":") + 2);
                    String descripcion = parts[3].substring(parts[3].indexOf(":") + 2);
                     String testigo = parts[4].substring(parts[4].indexOf(":") + 2);

                    Incidente incidente = new Incidente(fecha, tipo, descripcion, hora,testigo);
                    incidentes.add(incidente);
                    modeloListIncidentes.addElement(incidente.getDatosMostrar());
                }
            }

            // Update the JList model
            lstIncidente.setModel(modeloListIncidentes);

            // Close the reader
            reader.close();

            // Inform the user that the data has been loaded successfully
            JOptionPane.showMessageDialog(this, "Incident data loaded successfully.");
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error loading incident data from file.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
        
        
        
    }//GEN-LAST:event_lblEditar2MouseClicked

    public void saveIncidentDataToFile() {
    // Create a JFileChooser to let the user choose the file location
    JFileChooser fileChooser = new JFileChooser();
    int returnValue = fileChooser.showSaveDialog(null);

    if (returnValue == JFileChooser.APPROVE_OPTION) {
        try {
            // Get the selected file
            java.io.File file = fileChooser.getSelectedFile();

            // Write incident data to the file
            try ( // Create a BufferedWriter to write data to the file
                    BufferedWriter writer = new BufferedWriter
        (new FileWriter(file + ".txt"))) {
                // Write incident data to the file
                for (Incidente incidente : incidentes) {
                    writer.write("Tipo: " + incidente.getTipo() 
                            + " - Hora: " + incidente.getHora() 
                            + " - Fecha: " + incidente.getFecha()
                            + " - Testigo: " + incidente.getTestigo());
                    
                    
                    writer.write(" - Descripción: " + incidente.getDescripcion() + "\n\n");
                }
                // Close the writer
            }

            // Inform the user that the data has been saved
            javax.swing.JOptionPane.showMessageDialog
        (this, "los datos se han guardado correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
    
    
    // Add this method to FrameVisualizar
public List<Incidente> getIncidentes() {
    return incidentes;
}

    
    
    
    
     private void buscar() {
        modeloListIncidentes.removeAllElements();
        for (Incidente ves : incidentes) {
            if (ves.getDatosMostrar().toLowerCase()
                    .contains(txtBuscar.getText().toLowerCase())) {
                modeloListIncidentes.addElement(ves.getDatosMostrar());
            }
        }
    }
    
     
     
     
     
     
     public void categorizeIncidentsByType() {
    // Create a map to store incidents based on their type and current state
    Map<String, String> currentStates = new HashMap<>();

    // Group incidents by type and current state
    for (Incidente incidente : incidentes) {
        String tipo = incidente.getTipo();
        String estado = incidente.getEstado();

        if (!currentStates.containsKey(tipo)) {
            // If the type is not in the map, add it with the current state
            currentStates.put(tipo, estado);
        }
    }

    // Clear the existing list model
    DefaultListModel<String> modeloListIncidentes = new DefaultListModel<>();

    // Add categorized incidents to the list model
    for (Map.Entry<String, String> entry : currentStates.entrySet()) {
        String tipo = entry.getKey();
        String estado = entry.getValue();

        for (Incidente incidente : incidentes) {
            if (incidente.getTipo().equals(tipo)) {
                // Set the current state only if it's not null
                if (estado != null) {
                    incidente.setEstado(estado);
                }
                modeloListIncidentes.addElement(incidente.getDatosMostrar());
            }
        }
    }

    // Update the JList model
    lstIncidente.setModel(modeloListIncidentes);
    lstIncidente.repaint();
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
            for (javax.swing.UIManager.LookAndFeelInfo info
                    : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel
        (info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger
        (FrameVisualizar.class.getName()).log
        (java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger
        (FrameVisualizar.class.getName()).log
        (java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger
        (FrameVisualizar.class.getName()).log
        (java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger
        (FrameVisualizar.class.getName()).log
        (java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameVisualizar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCategorizar;
    private javax.swing.JButton btnEstado;
    private javax.swing.JComboBox<String> cbmEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAgregar;
    private javax.swing.JLabel lblEditar;
    private javax.swing.JLabel lblEditar1;
    private javax.swing.JLabel lblEditar2;
    private javax.swing.JLabel lblEliminar;
    private javax.swing.JLabel lblRiesgo;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JList<String> lstIncidente;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
