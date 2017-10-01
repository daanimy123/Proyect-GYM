/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.*;
import java.awt.Component;
import java.util.Vector;
import javax.media.CaptureDeviceInfo;
import javax.media.CaptureDeviceManager;
import javax.media.Manager;
import javax.media.MediaLocator;
import javax.media.Player;
import javax.swing.JOptionPane;

/**
 *
 * @author crack
 */
public class Socios extends javax.swing.JInternalFrame {

    /**
     * Creates new form Socios1
     */
    public Socios() {
        initComponents();
        iniciarcamara();
    }
    Socio s = new Socio();

    Player player;
    Component c;

    public void iniciarcamara() {
        try {
            Vector listadispo = CaptureDeviceManager.getDeviceList(null);

            CaptureDeviceInfo dispositivo = CaptureDeviceManager.getDevice(listadispo.get(0).toString());
            MediaLocator localizar = dispositivo.getLocator();
            player = Manager.createRealizedPlayer(localizar);
            player.start();
            if ((c = player.getVisualComponent()) != null) {
                lblfoto.add(c);
            }
        } catch (Exception e) {
            System.err.println(e);
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
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroupsexo = new javax.swing.ButtonGroup();
        buttonGroupestado = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        pnlsocios = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtclave = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtapellidos = new javax.swing.JTextField();
        txtedad = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        btnsiguiente = new javax.swing.JButton();
        rdoactivo = new javax.swing.JRadioButton();
        rdoinactivo = new javax.swing.JRadioButton();
        rdohombre = new javax.swing.JRadioButton();
        rdomujer = new javax.swing.JRadioButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        lblfoto = new javax.swing.JPanel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        pnlsocios1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        cbolista = new javax.swing.JComboBox<>();
        btnbuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbllista = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jDesktopPane3 = new javax.swing.JDesktopPane();
        membresia = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txttoal = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtpago = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtdescuento = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(928, 530));

        pnlsocios.setLayout(new java.awt.GridBagLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Clave: ");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(40, 10, 120, 36);

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nombre: ");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(40, 60, 120, 36);

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Apellidos: ");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(40, 110, 120, 36);

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Edad: ");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(40, 160, 120, 35);

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Sexo: ");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(40, 210, 120, 36);

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Dirección: ");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(40, 250, 120, 36);

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Telefono: ");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(40, 300, 120, 36);

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Fecha: Ingreso: ");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(40, 350, 120, 36);

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Estado: ");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(40, 400, 120, 36);

        txtclave.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jPanel3.add(txtclave);
        txtclave.setBounds(180, 10, 160, 36);

        txtnombre.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jPanel3.add(txtnombre);
        txtnombre.setBounds(180, 60, 160, 36);

        txtapellidos.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jPanel3.add(txtapellidos);
        txtapellidos.setBounds(180, 110, 160, 36);

        txtedad.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jPanel3.add(txtedad);
        txtedad.setBounds(180, 160, 160, 35);

        txtdireccion.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jPanel3.add(txtdireccion);
        txtdireccion.setBounds(180, 250, 160, 36);

        txttelefono.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jPanel3.add(txttelefono);
        txttelefono.setBounds(180, 300, 160, 36);

        btnsiguiente.setBackground(new java.awt.Color(0, 153, 255));
        btnsiguiente.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnsiguiente.setText("Siguiente");
        btnsiguiente.setToolTipText("Siguiente");
        btnsiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsiguienteActionPerformed(evt);
            }
        });
        jPanel3.add(btnsiguiente);
        btnsiguiente.setBounds(520, 350, 130, 50);

        rdoactivo.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupestado.add(rdoactivo);
        rdoactivo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        rdoactivo.setText("Activo");
        jPanel3.add(rdoactivo);
        rdoactivo.setBounds(190, 400, 75, 36);

        rdoinactivo.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupestado.add(rdoinactivo);
        rdoinactivo.setText("Innactivo");
        jPanel3.add(rdoinactivo);
        rdoinactivo.setBounds(270, 400, 75, 36);

        rdohombre.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupsexo.add(rdohombre);
        rdohombre.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        rdohombre.setText("Hombre");
        jPanel3.add(rdohombre);
        rdohombre.setBounds(190, 210, 75, 36);

        rdomujer.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupsexo.add(rdomujer);
        rdomujer.setText("Mujer");
        jPanel3.add(rdomujer);
        rdomujer.setBounds(270, 210, 75, 36);

        jDateChooser1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jDateChooser1);
        jDateChooser1.setBounds(180, 350, 160, 36);

        jButton1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButton1.setText("Tomar Foto");
        jPanel3.add(jButton1);
        jButton1.setBounds(390, 280, 110, 40);

        jButton3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButton3.setText("Capturar");
        jPanel3.add(jButton3);
        jButton3.setBounds(540, 280, 110, 40);

        lblfoto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout lblfotoLayout = new javax.swing.GroupLayout(lblfoto);
        lblfoto.setLayout(lblfotoLayout);
        lblfotoLayout.setHorizontalGroup(
            lblfotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 256, Short.MAX_VALUE)
        );
        lblfotoLayout.setVerticalGroup(
            lblfotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
        );

        jPanel3.add(lblfoto);
        lblfoto.setBounds(390, 30, 260, 220);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 690;
        gridBagConstraints.ipady = 442;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(57, 107, 65, 109);
        pnlsocios.add(jPanel3, gridBagConstraints);

        jDesktopPane1.setLayer(pnlsocios, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 907, Short.MAX_VALUE)
            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlsocios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlsocios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Datos", jDesktopPane1);

        pnlsocios1.setLayout(new java.awt.GridBagLayout());

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Actividad: ");

        cbolista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un Entrenador" }));

        btnbuscar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnbuscar.setText("Buscar");

        tbllista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Actividades"
            }
        ));
        tbllista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tbllista.setFillsViewportHeight(true);
        tbllista.setGridColor(new java.awt.Color(0, 0, 0));
        tbllista.setRowSelectionAllowed(false);
        tbllista.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tbllista);

        jButton2.setBackground(new java.awt.Color(0, 153, 255));
        jButton2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButton2.setText("Siguiente");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbolista, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(cbolista, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 65;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(78, 116, 81, 111);
        pnlsocios1.add(jPanel5, gridBagConstraints);

        jDesktopPane2.setLayer(pnlsocios1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlsocios1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addComponent(pnlsocios1, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Actividades", jDesktopPane2);

        membresia.setLayout(new java.awt.GridBagLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("MEMBRESIAS");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(100, 10, 507, 40);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Membresias"
            }
        ));
        jTable1.setFillsViewportHeight(true);
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(jTable1);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(100, 60, 507, 200);

        jLabel12.setBackground(new java.awt.Color(51, 204, 0));
        jLabel12.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("<html>\nLOCKER<br> MESUAL<br>\n$50");
        jLabel12.setOpaque(true);
        jPanel2.add(jLabel12);
        jLabel12.setBounds(230, 280, 100, 90);

        jLabel19.setBackground(new java.awt.Color(0, 204, 0));
        jLabel19.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("<html>\nVISITA AL DIA<br><br>\n        $50\n");
        jLabel19.setOpaque(true);
        jPanel2.add(jLabel19);
        jLabel19.setBounds(110, 280, 100, 90);

        jLabel22.setBackground(new java.awt.Color(204, 204, 204));
        jLabel22.setOpaque(true);
        jPanel2.add(jLabel22);
        jLabel22.setBounds(120, 290, 100, 90);

        jLabel24.setBackground(new java.awt.Color(0, 204, 0));
        jLabel24.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("<html>\nDANCE<br>\n$50");
        jLabel24.setOpaque(true);
        jPanel2.add(jLabel24);
        jLabel24.setBounds(350, 280, 100, 90);

        jLabel23.setBackground(new java.awt.Color(204, 204, 204));
        jLabel23.setOpaque(true);
        jPanel2.add(jLabel23);
        jLabel23.setBounds(240, 290, 100, 90);

        jLabel20.setBackground(new java.awt.Color(204, 204, 204));
        jLabel20.setOpaque(true);
        jPanel2.add(jLabel20);
        jLabel20.setBounds(360, 290, 100, 90);

        jLabel25.setBackground(new java.awt.Color(0, 204, 0));
        jLabel25.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("<html>\nINSCRIPCION\n<br>\n$100");
        jLabel25.setOpaque(true);
        jPanel2.add(jLabel25);
        jLabel25.setBounds(480, 280, 100, 90);

        jLabel21.setBackground(new java.awt.Color(204, 204, 204));
        jLabel21.setOpaque(true);
        jPanel2.add(jLabel21);
        jLabel21.setBounds(490, 290, 100, 90);

        jLabel26.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("Descuento $ ");
        jPanel2.add(jLabel26);
        jLabel26.setBounds(240, 380, 100, 40);

        txttoal.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jPanel2.add(txttoal);
        txttoal.setBounds(560, 380, 110, 40);

        jLabel27.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("Total $ ");
        jPanel2.add(jLabel27);
        jLabel27.setBounds(470, 380, 80, 40);

        txtpago.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jPanel2.add(txtpago);
        txtpago.setBounds(120, 380, 110, 40);

        jLabel28.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("Pago $ ");
        jPanel2.add(jLabel28);
        jLabel28.setBounds(30, 380, 80, 40);

        txtdescuento.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jPanel2.add(txtdescuento);
        txtdescuento.setBounds(350, 380, 110, 40);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 692;
        gridBagConstraints.ipady = 435;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(66, 105, 63, 109);
        membresia.add(jPanel2, gridBagConstraints);

        jDesktopPane3.setLayer(membresia, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane3Layout = new javax.swing.GroupLayout(jDesktopPane3);
        jDesktopPane3.setLayout(jDesktopPane3Layout);
        jDesktopPane3Layout.setHorizontalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(membresia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane3Layout.setVerticalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(membresia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Membresia", jDesktopPane3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsiguienteActionPerformed
        if (txtapellidos.getText().equals("") || txtclave.getText().equals("") || txtdireccion.getText().equals("")
                || txtedad.getText().equals("") || txtnombre.getText().equals("") || txttelefono.getText().equals("") ) {
            JOptionPane.showMessageDialog(null, "Rellene todos los campos", "Faltan datos", JOptionPane.ERROR_MESSAGE);
        } else {
            if (rdohombre.isSelected() || rdomujer.isSelected()) {
                if (rdoactivo.isSelected() || rdoinactivo.isSelected()) {
                    boolean b;
                    if (rdomujer.isSelected()) {
                        b = false;
                    }else{
                        b= true;
                    }
                    boolean a;
                    if (rdoactivo.isSelected()) {
                        a = true;
                    }else{
                        a = false;
                    }
                    s.registrarsocio(Integer.parseInt(txtclave.getText()), txtnombre.getText(), txtapellidos.getText(), Integer.parseInt(txtedad.getText()), b, "Titulo Foto", txtdireccion.getText(), a);
                } else {
                    JOptionPane.showMessageDialog(null, "Seleccione un Estado", "Faltan Seleccionar Estado", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione su Genero", "Faltan Seleccionar Genero", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnsiguienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnsiguiente;
    private javax.swing.ButtonGroup buttonGroupestado;
    private javax.swing.ButtonGroup buttonGroupsexo;
    private javax.swing.JComboBox<String> cbolista;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JDesktopPane jDesktopPane3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel lblfoto;
    private javax.swing.JPanel membresia;
    private javax.swing.JPanel pnlsocios;
    private javax.swing.JPanel pnlsocios1;
    private javax.swing.JRadioButton rdoactivo;
    private javax.swing.JRadioButton rdohombre;
    private javax.swing.JRadioButton rdoinactivo;
    private javax.swing.JRadioButton rdomujer;
    private javax.swing.JTable tbllista;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtclave;
    private javax.swing.JTextField txtdescuento;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtpago;
    private javax.swing.JTextField txttelefono;
    private javax.swing.JTextField txttoal;
    // End of variables declaration//GEN-END:variables
}
