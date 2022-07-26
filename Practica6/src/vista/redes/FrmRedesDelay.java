package vista.redes;

import controlador.dispositivos.DispositivosGrafoControlador;
import controlador.metodos.floyd;
import controlador.tda.grafos.GrafoEND;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.dispositivo.dispositivo;
import modelo.dispositivo.tabla.ModeloTablaDispositivo;

/**
 *
 * @author patob
 */
public class FrmRedesDelay extends javax.swing.JFrame {
    private DispositivosGrafoControlador dgc;
    private ModeloTablaDispositivo mtd = new ModeloTablaDispositivo();
    private boolean PVez = false;
    /**
     * Creates new form FrmRedesDelay
     */
    public FrmRedesDelay() {
        initComponents();
    }
    
    public void limpiar(){
        txtfIp.setText("");
        txtfNombre.setText("");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtfNombre = new javax.swing.JTextField();
        txtfIp = new javax.swing.JTextField();
        btnAniadir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cbxMetodo = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        textA = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbxDispositivo2 = new javax.swing.JComboBox<>();
        cbxDispositivo1 = new javax.swing.JComboBox<>();
        btnConectar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaConexiones = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        spinnerPing = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Grafo Redes");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(250, 10, 110, 30);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Añadir dispositivo");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 40, 130, 20);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setLayout(null);

        jLabel3.setText("Nombre dispositivo:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 20, 110, 30);

        jLabel4.setText("IP:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(120, 60, 20, 30);
        jPanel1.add(txtfNombre);
        txtfNombre.setBounds(150, 20, 230, 30);
        jPanel1.add(txtfIp);
        txtfIp.setBounds(150, 60, 230, 30);

        btnAniadir.setText("Añadir");
        btnAniadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAniadirActionPerformed(evt);
            }
        });
        jPanel1.add(btnAniadir);
        btnAniadir.setBounds(460, 50, 130, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 50, 620, 110);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Buscar camino");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 400, 120, 20);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel6.setText("Método");

        cbxMetodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Floyd", "Primero en anchura", "Primero en profundidad" }));

        btnBuscar.setText("Buscar camino");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        textA.setEditable(false);
        textA.setColumns(20);
        textA.setRows(5);
        textA.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane3.setViewportView(textA);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 410, 620, 170);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Crear conexión");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 170, 120, 20);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setLayout(null);

        jLabel8.setText("Dispositivo 2:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(240, 30, 80, 20);

        jLabel9.setText("Dispositivo 1:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(10, 30, 80, 20);

        jPanel2.add(cbxDispositivo2);
        cbxDispositivo2.setBounds(330, 30, 120, 30);

        jPanel2.add(cbxDispositivo1);
        cbxDispositivo1.setBounds(100, 30, 120, 30);

        btnConectar.setText("Conectar");
        btnConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectarActionPerformed(evt);
            }
        });
        jPanel2.add(btnConectar);
        btnConectar.setBounds(470, 110, 120, 40);

        tablaConexiones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaConexiones);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 80, 440, 130);

        jLabel10.setText("Ping:");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(470, 30, 40, 20);

        spinnerPing.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jPanel2.add(spinnerPing);
        spinnerPing.setBounds(510, 30, 64, 22);

        jLabel11.setText("ms");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(580, 36, 30, 20);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 180, 620, 220);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(510, 590, 120, 40);

        setBounds(0, 0, 651, 691);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAniadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAniadirActionPerformed
        aniadir();
    }//GEN-LAST:event_btnAniadirActionPerformed

    private void btnConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectarActionPerformed
        adyacencia();
    }//GEN-LAST:event_btnConectarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        switch (cbxMetodo.getSelectedIndex()) {
            case 1:
                floyd f = new floyd(dgc);
        try {
            textA.setText(f.implementar());
        } catch (Exception ex) {
            Logger.getLogger(FrmRedesDelay.class.getName()).log(Level.SEVERE, null, ex);
        }
                break;
            case 2:
                
                break;
            default:
                
        }
    }//GEN-LAST:event_btnBuscarActionPerformed
    private void aniadir(){
        if(txtfNombre.getText().trim().isEmpty()||txtfIp.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Complete los cuadros");
        }else{
            if (PVez) {
                dgc = new DispositivosGrafoControlador(dgc.getGendispo(), txtfNombre.getText(), txtfIp.getText());
            } else {
                dgc = new DispositivosGrafoControlador(txtfNombre.getText(), txtfIp.getText());
            }
            PVez = true;
            cargarTabla();
            cargarCombox();
            limpiar();
        }
    }
    public void cargarCombox(){
        cbxDispositivo1.removeAllItems();
        cbxDispositivo2.removeAllItems();
//        cbxFinal.removeAllItems();
//        cbxInicio.removeAllItems();
        try {
            for (int i = 1; i <= dgc.getGendispo().numVertices(); i++) {
                cbxDispositivo1.addItem(dgc.getGendispo().obtenerEtiqueta(i).getNombre());
                cbxDispositivo2.addItem(dgc.getGendispo().obtenerEtiqueta(i).getNombre());
//                cbxInicio.addItem(dgc.getGendispo().obtenerEtiqueta(i).getNombre());
//                cbxFinal.addItem(dgc.getGendispo().obtenerEtiqueta(i).getNombre());
            }
        } catch (Exception e) {
            System.out.println("ERROR EN CARGAR COMBO");
        }
    }
    public void cargarTabla(){
        mtd.setGrafo(dgc.getGendispo());
        mtd.fireTableStructureChanged();
        mtd.fireTableDataChanged();
        tablaConexiones.setModel(mtd);
        tablaConexiones.updateUI();
        System.out.println(dgc.getGendispo().toString());
    }
    
    private void adyacencia() {
        Integer origen = (cbxDispositivo1.getSelectedIndex() + 1);
        Integer destino = (cbxDispositivo2.getSelectedIndex() + 1);
        
        if(origen == destino) {
            JOptionPane.showMessageDialog(null, "Seleccione dispositivos distintos", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                Double ping = (double)(int)spinnerPing.getValue();
                dgc.getGendispo().insertarAristaE(dgc.getGendispo().obtenerEtiqueta(origen), dgc.getGendispo().obtenerEtiqueta(destino), ping);
                System.out.println("----------------");
                System.out.println(dgc.getGendispo().toString());
                System.out.println("----------------");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }        
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
            java.util.logging.Logger.getLogger(FrmRedesDelay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRedesDelay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRedesDelay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRedesDelay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRedesDelay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAniadir;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnConectar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbxDispositivo1;
    private javax.swing.JComboBox<String> cbxDispositivo2;
    private javax.swing.JComboBox<String> cbxMetodo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner spinnerPing;
    private javax.swing.JTable tablaConexiones;
    private javax.swing.JTextArea textA;
    private javax.swing.JTextField txtfIp;
    private javax.swing.JTextField txtfNombre;
    // End of variables declaration//GEN-END:variables
}
