package Vista;

import Modelo.Lienzo;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JColorChooser;

/**
 *
 * @author Alfredo Giron
 */
public class Vista extends javax.swing.JFrame {

    private int mouseXinicio;
    private int mouseYinicio;
    private int mouseXfin;
    private int mouseYfin;
    private String figura;
    private Color color;
    private int grosor;
    private int decoracionExtremo;
    private int decoracionDoblado;
    private float[] dash;

    public Vista() {
        initComponents();
        this.setLocationRelativeTo(null);

        colorSeleccionado.setOpaque(true);
        grosor = 1;
        decoracionExtremo = BasicStroke.CAP_BUTT;
        decoracionDoblado = BasicStroke.JOIN_MITER;
        cambiarColor(Color.black);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHerramientas = new javax.swing.JPanel();
        panelMenu1 = new javax.swing.JPanel();
        txtMenu1 = new javax.swing.JLabel();
        panelMenu2 = new javax.swing.JPanel();
        txtMenu2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        panelMenu3 = new javax.swing.JPanel();
        txtMenu3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        panelMenu4 = new javax.swing.JPanel();
        txtMenu4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pruebaDecoradorLineas = new javax.swing.JPanel();
        cambioTrazo = new javax.swing.JComboBox<>();
        txtExtremos = new javax.swing.JComboBox<>();
        panelMenu5 = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        herramientaLinea = new javax.swing.JLabel();
        herramientaCuadrado = new javax.swing.JLabel();
        herramientaTriangulo = new javax.swing.JLabel();
        herramientaTriangulo2 = new javax.swing.JLabel();
        herramientaRombo = new javax.swing.JLabel();
        herramientaElipse = new javax.swing.JLabel();
        herramientaRectangulo = new javax.swing.JLabel();
        herramientaLinea7 = new javax.swing.JLabel();
        herramientaLinea8 = new javax.swing.JLabel();
        herramientaLinea9 = new javax.swing.JLabel();
        herramientaLinea10 = new javax.swing.JLabel();
        herramientaLinea11 = new javax.swing.JLabel();
        herramientaLinea12 = new javax.swing.JLabel();
        herramientaLinea13 = new javax.swing.JLabel();
        herramientaLinea14 = new javax.swing.JLabel();
        herramientaLinea15 = new javax.swing.JLabel();
        herramientaLinea16 = new javax.swing.JLabel();
        herramientaLinea17 = new javax.swing.JLabel();
        herramientaLinea18 = new javax.swing.JLabel();
        herramientaLinea19 = new javax.swing.JLabel();
        herramientaLinea20 = new javax.swing.JLabel();
        txtMenu5 = new javax.swing.JLabel();
        panelMenu6 = new javax.swing.JPanel();
        txtMenu6 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        pruebaGrosorLineas = new javax.swing.JPanel();
        grosorSeleccionado = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        panelMenu7 = new javax.swing.JPanel();
        txtMenu7 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        botonCambiarColor = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        colorSeleccionado = new javax.swing.JLabel();
        seleccionColorNegro = new javax.swing.JLabel();
        seleccionColorBlanco = new javax.swing.JLabel();
        seleccionColorRojo = new javax.swing.JLabel();
        seleccionColorAmarillo = new javax.swing.JLabel();
        seleccionColorRosa = new javax.swing.JLabel();
        seleccionColorVerde = new javax.swing.JLabel();
        seleccionColorMagenta = new javax.swing.JLabel();
        seleccionColorAzul = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();
        panelLienzo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        consola = new javax.swing.JTextArea();
        menuPrincipal = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        menuVer = new javax.swing.JMenu();
        menuCuadricula = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelHerramientas.setBackground(new java.awt.Color(255, 255, 0));
        panelHerramientas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelMenu1.setBackground(new java.awt.Color(255, 255, 255));
        panelMenu1.setForeground(new java.awt.Color(51, 51, 51));

        txtMenu1.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        txtMenu1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMenu1.setText("Portapapeles");
        txtMenu1.setToolTipText("");

        javax.swing.GroupLayout panelMenu1Layout = new javax.swing.GroupLayout(panelMenu1);
        panelMenu1.setLayout(panelMenu1Layout);
        panelMenu1Layout.setHorizontalGroup(
            panelMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenu1Layout.createSequentialGroup()
                .addComponent(txtMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelMenu1Layout.setVerticalGroup(
            panelMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenu1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(txtMenu1))
        );

        panelHerramientas.add(panelMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 130));

        panelMenu2.setBackground(new java.awt.Color(255, 255, 255));
        panelMenu2.setForeground(new java.awt.Color(51, 51, 51));

        txtMenu2.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        txtMenu2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMenu2.setText("Imagen");
        txtMenu2.setToolTipText("");

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout panelMenu2Layout = new javax.swing.GroupLayout(panelMenu2);
        panelMenu2.setLayout(panelMenu2Layout);
        panelMenu2Layout.setHorizontalGroup(
            panelMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenu2Layout.createSequentialGroup()
                .addGroup(panelMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMenu2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );
        panelMenu2Layout.setVerticalGroup(
            panelMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenu2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMenu2))
        );

        panelHerramientas.add(panelMenu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 160, 130));

        panelMenu3.setBackground(new java.awt.Color(255, 255, 255));
        panelMenu3.setForeground(new java.awt.Color(51, 51, 51));

        txtMenu3.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        txtMenu3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMenu3.setText("Herramientas");
        txtMenu3.setToolTipText("");

        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout panelMenu3Layout = new javax.swing.GroupLayout(panelMenu3);
        panelMenu3.setLayout(panelMenu3Layout);
        panelMenu3Layout.setHorizontalGroup(
            panelMenu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenu3Layout.createSequentialGroup()
                .addGroup(panelMenu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMenu3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMenu3Layout.setVerticalGroup(
            panelMenu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenu3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMenu3))
        );

        panelHerramientas.add(panelMenu3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 140, 130));

        panelMenu4.setBackground(new java.awt.Color(255, 255, 255));
        panelMenu4.setForeground(new java.awt.Color(51, 51, 51));
        panelMenu4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtMenu4.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        txtMenu4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMenu4.setText("Decoradores");
        txtMenu4.setToolTipText("");
        panelMenu4.add(txtMenu4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 230, 20));

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        panelMenu4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 41, 22, 70));

        jLabel4.setText("Extremos:");
        panelMenu4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel5.setText("Tipo de linea:");
        panelMenu4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        pruebaDecoradorLineas.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pruebaDecoradorLineasLayout = new javax.swing.GroupLayout(pruebaDecoradorLineas);
        pruebaDecoradorLineas.setLayout(pruebaDecoradorLineasLayout);
        pruebaDecoradorLineasLayout.setHorizontalGroup(
            pruebaDecoradorLineasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 101, Short.MAX_VALUE)
        );
        pruebaDecoradorLineasLayout.setVerticalGroup(
            pruebaDecoradorLineasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );

        panelMenu4.add(pruebaDecoradorLineas, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 6, -1, -1));

        cambioTrazo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "--- - --- - --- -", "- - - - - - - - - -", "-- - --- - -- - ---", "-   -   -   -   -   -", "--  -  --  -  --  -", "---   -   ---   -   ---", " " }));
        cambioTrazo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cambioTrazoItemStateChanged(evt);
            }
        });
        panelMenu4.add(cambioTrazo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 105, -1));

        txtExtremos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguna", "Redonda", "Cuadrada" }));
        txtExtremos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                txtExtremosItemStateChanged(evt);
            }
        });
        panelMenu4.add(txtExtremos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        panelHerramientas.add(panelMenu4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 230, 130));

        panelMenu5.setBackground(new java.awt.Color(255, 255, 255));
        panelMenu5.setForeground(new java.awt.Color(51, 51, 51));
        panelMenu5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator4.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        panelMenu5.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 21, 22, 70));

        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        herramientaLinea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Formas/linea.png"))); // NOI18N
        herramientaLinea.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        herramientaLinea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                herramientaLineaMouseClicked(evt);
            }
        });

        herramientaCuadrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Formas/cuadrado.png"))); // NOI18N
        herramientaCuadrado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        herramientaCuadrado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                herramientaCuadradoMouseClicked(evt);
            }
        });

        herramientaTriangulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Formas/triangulo.png"))); // NOI18N
        herramientaTriangulo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        herramientaTriangulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                herramientaTrianguloMouseClicked(evt);
            }
        });

        herramientaTriangulo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Formas/triangulo2.png"))); // NOI18N
        herramientaTriangulo2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        herramientaTriangulo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                herramientaTriangulo2MouseClicked(evt);
            }
        });

        herramientaRombo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Formas/rombo.png"))); // NOI18N
        herramientaRombo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        herramientaRombo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                herramientaRomboMouseClicked(evt);
            }
        });

        herramientaElipse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Formas/elipse.png"))); // NOI18N
        herramientaElipse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        herramientaElipse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                herramientaElipseMouseClicked(evt);
            }
        });

        herramientaRectangulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Formas/rectangulo.png"))); // NOI18N
        herramientaRectangulo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        herramientaRectangulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                herramientaRectanguloMouseClicked(evt);
            }
        });

        herramientaLinea7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Formas/linea.png"))); // NOI18N
        herramientaLinea7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        herramientaLinea8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Formas/linea.png"))); // NOI18N
        herramientaLinea8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        herramientaLinea9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Formas/linea.png"))); // NOI18N
        herramientaLinea9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        herramientaLinea10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Formas/linea.png"))); // NOI18N
        herramientaLinea10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        herramientaLinea11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Formas/linea.png"))); // NOI18N
        herramientaLinea11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        herramientaLinea12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Formas/linea.png"))); // NOI18N
        herramientaLinea12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        herramientaLinea13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Formas/linea.png"))); // NOI18N
        herramientaLinea13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        herramientaLinea14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Formas/linea.png"))); // NOI18N
        herramientaLinea14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        herramientaLinea15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Formas/5_lados.png"))); // NOI18N
        herramientaLinea15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        herramientaLinea15.setPreferredSize(new java.awt.Dimension(18, 20));

        herramientaLinea16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Formas/linea.png"))); // NOI18N
        herramientaLinea16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        herramientaLinea17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Formas/linea.png"))); // NOI18N
        herramientaLinea17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        herramientaLinea18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Formas/linea.png"))); // NOI18N
        herramientaLinea18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        herramientaLinea19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Formas/linea.png"))); // NOI18N
        herramientaLinea19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        herramientaLinea20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Formas/linea.png"))); // NOI18N
        herramientaLinea20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(herramientaLinea)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(herramientaCuadrado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(herramientaTriangulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(herramientaTriangulo2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(herramientaRombo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(herramientaElipse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(herramientaRectangulo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(herramientaLinea17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(herramientaLinea18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(herramientaLinea20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(herramientaLinea19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(herramientaLinea7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(herramientaLinea8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(herramientaLinea9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(herramientaLinea15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(herramientaLinea14)
                        .addGap(12, 12, 12)
                        .addComponent(herramientaLinea16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(herramientaLinea10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(herramientaLinea11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(herramientaLinea12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(herramientaLinea13)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(herramientaRectangulo)
                    .addComponent(herramientaElipse)
                    .addComponent(herramientaRombo)
                    .addComponent(herramientaTriangulo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(herramientaCuadrado)
                    .addComponent(herramientaLinea)
                    .addComponent(herramientaTriangulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(herramientaLinea13)
                    .addComponent(herramientaLinea12)
                    .addComponent(herramientaLinea11)
                    .addComponent(herramientaLinea10)
                    .addComponent(herramientaLinea16)
                    .addComponent(herramientaLinea14)
                    .addComponent(herramientaLinea15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(herramientaLinea9)
                    .addComponent(herramientaLinea8)
                    .addComponent(herramientaLinea7)
                    .addComponent(herramientaLinea17)
                    .addComponent(herramientaLinea18)
                    .addComponent(herramientaLinea19)
                    .addComponent(herramientaLinea20))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMenu5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 6, -1, -1));

        txtMenu5.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        txtMenu5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMenu5.setText("Formas");
        txtMenu5.setToolTipText("");
        panelMenu5.add(txtMenu5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 239, 20));

        panelHerramientas.add(panelMenu5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 240, 130));

        panelMenu6.setBackground(new java.awt.Color(255, 255, 255));
        panelMenu6.setForeground(new java.awt.Color(51, 51, 51));

        txtMenu6.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        txtMenu6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMenu6.setText("Grosor");
        txtMenu6.setToolTipText("");

        jSeparator5.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel2.setText("Seleccionado:");

        pruebaGrosorLineas.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pruebaGrosorLineasLayout = new javax.swing.GroupLayout(pruebaGrosorLineas);
        pruebaGrosorLineas.setLayout(pruebaGrosorLineasLayout);
        pruebaGrosorLineasLayout.setHorizontalGroup(
            pruebaGrosorLineasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 111, Short.MAX_VALUE)
        );
        pruebaGrosorLineasLayout.setVerticalGroup(
            pruebaGrosorLineasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );

        grosorSeleccionado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "15", "20", "30", "50" }));
        grosorSeleccionado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                grosorSeleccionadoItemStateChanged(evt);
            }
        });
        grosorSeleccionado.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                grosorSeleccionadoPropertyChange(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("px");

        javax.swing.GroupLayout panelMenu6Layout = new javax.swing.GroupLayout(panelMenu6);
        panelMenu6.setLayout(panelMenu6Layout);
        panelMenu6Layout.setHorizontalGroup(
            panelMenu6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtMenu6, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
            .addGroup(panelMenu6Layout.createSequentialGroup()
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMenu6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(pruebaGrosorLineas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelMenu6Layout.createSequentialGroup()
                        .addComponent(grosorSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMenu6Layout.setVerticalGroup(
            panelMenu6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenu6Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMenu6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelMenu6Layout.createSequentialGroup()
                        .addComponent(pruebaGrosorLineas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelMenu6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(grosorSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMenu6))
        );

        panelHerramientas.add(panelMenu6, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 0, 150, 130));

        panelMenu7.setBackground(new java.awt.Color(255, 255, 255));
        panelMenu7.setForeground(new java.awt.Color(51, 51, 51));

        txtMenu7.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        txtMenu7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMenu7.setText("Colores");
        txtMenu7.setToolTipText("");

        jSeparator6.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);

        botonCambiarColor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Colores/colores.png"))); // NOI18N
        botonCambiarColor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCambiarColor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCambiarColorMouseClicked(evt);
            }
        });

        jLabel1.setText("Seleccionado");

        seleccionColorNegro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Colores/negro.png"))); // NOI18N
        seleccionColorNegro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        seleccionColorNegro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seleccionColorNegroMouseClicked(evt);
            }
        });

        seleccionColorBlanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Colores/white.png"))); // NOI18N
        seleccionColorBlanco.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        seleccionColorBlanco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seleccionColorBlancoMouseClicked(evt);
            }
        });

        seleccionColorRojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Colores/rojo.png"))); // NOI18N
        seleccionColorRojo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        seleccionColorRojo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seleccionColorRojoMouseClicked(evt);
            }
        });

        seleccionColorAmarillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Colores/amarillo.png"))); // NOI18N
        seleccionColorAmarillo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        seleccionColorAmarillo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seleccionColorAmarilloMouseClicked(evt);
            }
        });

        seleccionColorRosa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Colores/rosa.png"))); // NOI18N
        seleccionColorRosa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        seleccionColorRosa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seleccionColorRosaMouseClicked(evt);
            }
        });

        seleccionColorVerde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Colores/verde.png"))); // NOI18N
        seleccionColorVerde.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        seleccionColorVerde.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seleccionColorVerdeMouseClicked(evt);
            }
        });

        seleccionColorMagenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Colores/magenta.png"))); // NOI18N
        seleccionColorMagenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        seleccionColorMagenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seleccionColorMagentaMouseClicked(evt);
            }
        });

        seleccionColorAzul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Colores/azul.png"))); // NOI18N
        seleccionColorAzul.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        seleccionColorAzul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seleccionColorAzulMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(colorSeleccionado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(seleccionColorNegro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(seleccionColorBlanco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(seleccionColorRojo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(seleccionColorAzul))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(seleccionColorVerde)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(seleccionColorMagenta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(seleccionColorRosa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(seleccionColorAmarillo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(botonCambiarColor)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(colorSeleccionado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(botonCambiarColor))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(seleccionColorRojo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(seleccionColorRosa))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(seleccionColorAzul)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(seleccionColorAmarillo))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(seleccionColorNegro, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(seleccionColorBlanco))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(seleccionColorMagenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(seleccionColorVerde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelMenu7Layout = new javax.swing.GroupLayout(panelMenu7);
        panelMenu7.setLayout(panelMenu7Layout);
        panelMenu7Layout.setHorizontalGroup(
            panelMenu7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenu7Layout.createSequentialGroup()
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMenu7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMenu7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelMenu7Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 35, Short.MAX_VALUE))))
        );
        panelMenu7Layout.setVerticalGroup(
            panelMenu7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenu7Layout.createSequentialGroup()
                .addGroup(panelMenu7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenu7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelMenu7Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(txtMenu7)
                .addContainerGap())
        );

        panelHerramientas.add(panelMenu7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 0, 360, 130));

        getContentPane().add(panelHerramientas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        separador.setForeground(new java.awt.Color(204, 204, 204));
        getContentPane().add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 136, 1500, 11));

        panelLienzo.setBackground(new java.awt.Color(255, 255, 255));
        panelLienzo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelLienzoMouseDragged(evt);
            }
        });
        panelLienzo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelLienzoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panelLienzoMouseReleased(evt);
            }
        });

        jScrollPane1.setForeground(new java.awt.Color(0, 0, 0));

        consola.setColumns(20);
        consola.setRows(5);
        jScrollPane1.setViewportView(consola);

        javax.swing.GroupLayout panelLienzoLayout = new javax.swing.GroupLayout(panelLienzo);
        panelLienzo.setLayout(panelLienzoLayout);
        panelLienzoLayout.setHorizontalGroup(
            panelLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLienzoLayout.createSequentialGroup()
                .addGap(395, 395, 395)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(795, Short.MAX_VALUE))
        );
        panelLienzoLayout.setVerticalGroup(
            panelLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLienzoLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(446, Short.MAX_VALUE))
        );

        getContentPane().add(panelLienzo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1500, 760));

        menuArchivo.setText("Archivo");
        menuArchivo.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        menuPrincipal.add(menuArchivo);

        menuVer.setText("Ver");
        menuVer.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        menuCuadricula.setSelected(true);
        menuCuadricula.setText("Cuadricula");
        menuVer.add(menuCuadricula);

        menuPrincipal.add(menuVer);

        setJMenuBar(menuPrincipal);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dibujarFiguras(Graphics g2) {

        Graphics2D g = (Graphics2D) g2;

        int tamañoX = mouseXfin - mouseXinicio;
        int tamañoY = mouseYfin - mouseYinicio;

        colorSeleccionado.setBackground(color);
        g.setColor(color);
        g.setStroke(new BasicStroke(grosor, decoracionExtremo, decoracionDoblado, 5, dash, 0));

        if (figura != null) {
            if (figura.equals("linea")) {
                g.drawLine(mouseXinicio, mouseYinicio, mouseXfin, mouseYfin);
            } else if (figura.equals("cuadrado")) {
                g.drawRect(mouseXinicio, mouseYinicio, tamañoX, tamañoX);
            } else if (figura.equals("rectangulo")) {
                g.drawRect(mouseXinicio, mouseYinicio, tamañoX, tamañoY);
            } else if (figura.equals("elipse")) {
                g.drawOval(mouseXinicio, mouseYinicio, tamañoX, tamañoY);
            } else if (figura.equals("triangulo")) {
                int[] x = {mouseXinicio + (tamañoX / 2), mouseXfin, mouseXinicio};
                int[] y = {mouseYinicio, mouseYfin, mouseYfin};
                g.drawPolygon(x, y, 3);
            } else if (figura.equals("triangulo2")) {
                int[] x = {mouseXinicio, mouseXfin, mouseXinicio};
                int[] y = {mouseYinicio, mouseYfin, mouseYfin};
                g.drawPolygon(x, y, 3);
            } else if (figura.equals("rombo")) {
                int[] x = {mouseXinicio + (tamañoX / 2), mouseXfin, mouseXfin - (tamañoX / 2), mouseXinicio};
                int[] y = {mouseYinicio, mouseYinicio + (tamañoY / 2), mouseYfin, mouseYfin - (tamañoY / 2)};
                g.drawPolygon(x, y, 4);
            }
        }

        //getContentPane().getComponent(2).repaint();
    }

    private void imprimir() {
        String impresion;
        impresion = "INICIO \nX = " + mouseXinicio + "\nY = " + mouseYinicio + "\n\nFIN \nX = " + mouseXfin + "\nY = " + mouseYfin;
        impresion += "\n\nx= " + jLabel1.getX() + " Y= " + jLabel1.getY();
        consola.setText(impresion);
    }

    private void cambiarColor(Color c) {
        Color aux = color;
        color = c;
        if (color == null) {
            color = aux;
        }
        colorSeleccionado.setBackground(color);
        cambiarLinea();
    }

    public void cambiarLinea() {

        Graphics g = pruebaGrosorLineas.getGraphics();
        Graphics2D g2d = (Graphics2D) g;
        if (g2d != null) {
            g2d.setColor(Color.white);
            g2d.fillRect(0, 0, 200, 30);
            g2d.setColor(color);
            g2d.setStroke(new BasicStroke(grosor, decoracionExtremo, decoracionExtremo, 5, dash, 0));
            g2d.drawLine(2, 15, 100, 15);
        }
    }

    private void panelLienzoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelLienzoMousePressed
        mouseXinicio = evt.getX();
        mouseYinicio = evt.getY();

        imprimir();
    }//GEN-LAST:event_panelLienzoMousePressed

    private void herramientaLineaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_herramientaLineaMouseClicked
        figura = "linea";
    }//GEN-LAST:event_herramientaLineaMouseClicked

    private void herramientaCuadradoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_herramientaCuadradoMouseClicked
        figura = "cuadrado";
    }//GEN-LAST:event_herramientaCuadradoMouseClicked

    private void herramientaTrianguloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_herramientaTrianguloMouseClicked
        figura = "triangulo";
    }//GEN-LAST:event_herramientaTrianguloMouseClicked

    private void herramientaTriangulo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_herramientaTriangulo2MouseClicked
        figura = "triangulo2";
    }//GEN-LAST:event_herramientaTriangulo2MouseClicked

    private void herramientaRomboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_herramientaRomboMouseClicked
        figura = "rombo";
    }//GEN-LAST:event_herramientaRomboMouseClicked

    private void herramientaElipseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_herramientaElipseMouseClicked
        figura = "elipse";
    }//GEN-LAST:event_herramientaElipseMouseClicked

    private void herramientaRectanguloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_herramientaRectanguloMouseClicked
        figura = "rectangulo";
    }//GEN-LAST:event_herramientaRectanguloMouseClicked

    private void panelLienzoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelLienzoMouseDragged
        mouseXfin = evt.getX();
        mouseYfin = evt.getY();

        imprimir();
        dibujarFiguras(getContentPane().getComponent(2).getGraphics());
    }//GEN-LAST:event_panelLienzoMouseDragged

    private void panelLienzoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelLienzoMouseReleased

    }//GEN-LAST:event_panelLienzoMouseReleased

    private void botonCambiarColorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCambiarColorMouseClicked
        cambiarColor(JColorChooser.showDialog(rootPane, "Seleccione un color", Color.BLACK, rootPaneCheckingEnabled));
    }//GEN-LAST:event_botonCambiarColorMouseClicked

    private void seleccionColorNegroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seleccionColorNegroMouseClicked
        cambiarColor(Color.black);
    }//GEN-LAST:event_seleccionColorNegroMouseClicked

    private void seleccionColorRojoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seleccionColorRojoMouseClicked
        cambiarColor(Color.red);
    }//GEN-LAST:event_seleccionColorRojoMouseClicked

    private void seleccionColorBlancoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seleccionColorBlancoMouseClicked
        cambiarColor(Color.white);
    }//GEN-LAST:event_seleccionColorBlancoMouseClicked

    private void seleccionColorAzulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seleccionColorAzulMouseClicked
        cambiarColor(Color.blue);
    }//GEN-LAST:event_seleccionColorAzulMouseClicked

    private void seleccionColorVerdeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seleccionColorVerdeMouseClicked
        cambiarColor(Color.green);
    }//GEN-LAST:event_seleccionColorVerdeMouseClicked

    private void seleccionColorMagentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seleccionColorMagentaMouseClicked
        cambiarColor(Color.magenta);
    }//GEN-LAST:event_seleccionColorMagentaMouseClicked

    private void seleccionColorRosaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seleccionColorRosaMouseClicked
        cambiarColor(Color.pink);
    }//GEN-LAST:event_seleccionColorRosaMouseClicked

    private void seleccionColorAmarilloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seleccionColorAmarilloMouseClicked
        cambiarColor(Color.yellow);
    }//GEN-LAST:event_seleccionColorAmarilloMouseClicked

    private void grosorSeleccionadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_grosorSeleccionadoItemStateChanged
        grosor = Integer.parseInt(grosorSeleccionado.getSelectedItem().toString());
        cambiarLinea();
    }//GEN-LAST:event_grosorSeleccionadoItemStateChanged

    private void grosorSeleccionadoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_grosorSeleccionadoPropertyChange
        cambiarLinea();
    }//GEN-LAST:event_grosorSeleccionadoPropertyChange

    private void txtExtremosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_txtExtremosItemStateChanged
        decoracionExtremo = txtExtremos.getSelectedIndex();
        cambiarLinea();
    }//GEN-LAST:event_txtExtremosItemStateChanged

    private void cambioTrazoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cambioTrazoItemStateChanged
        
        switch (cambioTrazo.getSelectedIndex()) {
            case 0:
                {
                    float[] dash1 = null;
                    dash = dash1;
                    break;
                }
            case 1:
                {
                    float[] dash1 = {30f, 10f, 10f, 10f};
                    dash = dash1;
                    break;
                }
            case 2:
                {
                    float[] dash1 = {10f, 10f};
                    dash = dash1;
                    break;
                }
            case 3:
                {
                    float[] dash1 = {20f, 10f, 10f, 10f, 30f, 10f, 10f, 10f};
                    dash = dash1;
                    break;
                }
            case 4:
                {
                    float[] dash1 = {10f, 30f};
                    dash = dash1;
                    break;
                }
            case 5:
                {
                    float[] dash1 = {20f, 20f, 10f, 20f};
                    dash = dash1;
                    break;
                }
            case 6:
                {
                    float[] dash1 = {30f, 30f, 10f, 30f};
                    dash = dash1;
                    break;
                }
            default:
                break;
        }
        
        
        
        cambiarLinea();
    }//GEN-LAST:event_cambioTrazoItemStateChanged

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Vista vista = new Vista();
                vista.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botonCambiarColor;
    private javax.swing.JComboBox<String> cambioTrazo;
    private javax.swing.JLabel colorSeleccionado;
    private javax.swing.JTextArea consola;
    private javax.swing.JComboBox<String> grosorSeleccionado;
    private javax.swing.JLabel herramientaCuadrado;
    private javax.swing.JLabel herramientaElipse;
    private javax.swing.JLabel herramientaLinea;
    private javax.swing.JLabel herramientaLinea10;
    private javax.swing.JLabel herramientaLinea11;
    private javax.swing.JLabel herramientaLinea12;
    private javax.swing.JLabel herramientaLinea13;
    private javax.swing.JLabel herramientaLinea14;
    private javax.swing.JLabel herramientaLinea15;
    private javax.swing.JLabel herramientaLinea16;
    private javax.swing.JLabel herramientaLinea17;
    private javax.swing.JLabel herramientaLinea18;
    private javax.swing.JLabel herramientaLinea19;
    private javax.swing.JLabel herramientaLinea20;
    private javax.swing.JLabel herramientaLinea7;
    private javax.swing.JLabel herramientaLinea8;
    private javax.swing.JLabel herramientaLinea9;
    private javax.swing.JLabel herramientaRectangulo;
    private javax.swing.JLabel herramientaRombo;
    private javax.swing.JLabel herramientaTriangulo;
    private javax.swing.JLabel herramientaTriangulo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JCheckBoxMenuItem menuCuadricula;
    private javax.swing.JMenuBar menuPrincipal;
    private javax.swing.JMenu menuVer;
    private javax.swing.JPanel panelHerramientas;
    private javax.swing.JPanel panelLienzo;
    private javax.swing.JPanel panelMenu1;
    private javax.swing.JPanel panelMenu2;
    private javax.swing.JPanel panelMenu3;
    private javax.swing.JPanel panelMenu4;
    private javax.swing.JPanel panelMenu5;
    private javax.swing.JPanel panelMenu6;
    private javax.swing.JPanel panelMenu7;
    private javax.swing.JPanel pruebaDecoradorLineas;
    private javax.swing.JPanel pruebaGrosorLineas;
    private javax.swing.JLabel seleccionColorAmarillo;
    private javax.swing.JLabel seleccionColorAzul;
    private javax.swing.JLabel seleccionColorBlanco;
    private javax.swing.JLabel seleccionColorMagenta;
    private javax.swing.JLabel seleccionColorNegro;
    private javax.swing.JLabel seleccionColorRojo;
    private javax.swing.JLabel seleccionColorRosa;
    private javax.swing.JLabel seleccionColorVerde;
    private javax.swing.JSeparator separador;
    private javax.swing.JComboBox<String> txtExtremos;
    private javax.swing.JLabel txtMenu1;
    private javax.swing.JLabel txtMenu2;
    private javax.swing.JLabel txtMenu3;
    private javax.swing.JLabel txtMenu4;
    private javax.swing.JLabel txtMenu5;
    private javax.swing.JLabel txtMenu6;
    private javax.swing.JLabel txtMenu7;
    // End of variables declaration//GEN-END:variables
    private Lienzo lienzo;
}
