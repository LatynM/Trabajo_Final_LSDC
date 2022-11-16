
package ldsc.tf_lol;

import java.util.LinkedList;
import javax.swing.ImageIcon;

public class Ventana extends javax.swing.JFrame {
    
    public Ventana() {
        initComponents();
    }
    
    public LinkedList<Personaje> funcionCamp() {
        LinkedList<Personaje> campeonesLista = new LinkedList<>();
        
        Personaje defaultPersonaje = new Personaje("(Elegir campeón)", " ", " ", 0, " ", " ");
        defaultPersonaje.agregarHabilidad(0, new Habilidad(" ","P", 0));
        defaultPersonaje.agregarHabilidad(1, new Habilidad(" ","P", 0));
        defaultPersonaje.agregarHabilidad(2, new Habilidad(" ","P", 0));
        defaultPersonaje.agregarHabilidad( 3, new Habilidad(" ","P", 0));
        defaultPersonaje.agregarHabilidad(4, new Habilidad(" ","P", 0));
     
        campeonesLista.add(defaultPersonaje);
        
        
        Personaje c1 = new Personaje("Ashe", "Como Hija del Hielo y madre de guerra de la tribu Avarosa, Ashe comanda la más grande horda en el norte. Estoica, inteligente e idealista, pero incómoda con su rol de líder, ella aprovecha las magias ancestrales de su linaje para portar un arco de Hielo Puro. Apoyada por la creencia de su gente que ella es el héroe mitológico reencarnado de Avarosa, Ashe espera unificar el Fréljord una vez más al retomar sus tierras antiguas y tribales.", "La Arquera de Hielo", 450, "Tirador", "Freljord");
        Personaje c2 = new Personaje("Gwen", "Gwen, una antigua muñeca que se transformó y cobró vida a través de la magia, usa las mismas herramientas que en su momento la crearon. Lleva el peso del amor de su creadora a cada paso, sin dar nada por sentado. Bajo su mando está la Niebla Sagrada, una magia antigua y protectora que bendijo las tijeras, las agujas y el hilo de coser de Gwen. Muchas cosas son nuevas para Gwen, pero sigue decidida a luchar con gozo por el bien que prevalece en un mundo roto.", "La Costurera Sagrada", 6300, "Luchador", "Islas de las Sombras");
        Personaje c3 = new Personaje("Hecarim", "Hecarim es una fusión espectral de un hombre y una bestia condenada a llevar las almas de los vivos por toda la eternidad. Cuando las Islas Bendecidas cayeron en oscuridad, este orgulloso caballero fue arrasado por la destructiva energía de la Ruina junto a su caballería y sus monturas. Ahora, cuando la Niebla Negra se esparce por Runaterra, él encabeza la devastadora carga, se deleita en la matanza que causa y aplasta al enemigo bajo sus pezuñas acorazadas.", "La Sombra de la Guerra", 3150, "Luchador", "Islas de las Sombras");
       
       
        c3.agregarItem(new Item("Cercenador Divino",3300));
        
        
       c1.agregarItem(new Item("Arcoescudo Inmortal", 3400));
       c1.agregarItem(new Item("Grebas del Berserker", 1100)); 
       c1.agregarHabilidad(0, new Habilidad("Tiro Escarchado","P", 0));
       c1.agregarHabilidad(1, new Habilidad("Concentración de la Guardabosques","Q", 50));
       c1.agregarHabilidad(2, new Habilidad("Descarga","W", 75));
       c1.agregarHabilidad(3, new Habilidad("Tiro de Halcón","E", 0));
       c1.agregarHabilidad(4, new Habilidad("Flecha de Cristal Encantada","R", 100));
       
        c2.agregarItem(new Item("Agrietador",3200));
        c2.agregarItem(new Item("Punteras de Acero Revestidas", 1100));
        
       c2.agregarHabilidad(0, new Habilidad("Mil Cortes","P", 0));
       c2.agregarHabilidad(1, new Habilidad("¡A Cortar!","Q", 50));
       c2.agregarHabilidad(2, new Habilidad("Niebla Sagrada","W", 75));
       c2.agregarHabilidad(3, new Habilidad("Costura Letal","E", 0));
       c2.agregarHabilidad(4, new Habilidad("Ráfaga de Agujas","R", 100));
       
       c3.agregarHabilidad(0, new Habilidad("Sendero de Guerra","P", 0));
       c3.agregarHabilidad(1, new Habilidad("Ataque de Furia","Q", 50));
       c3.agregarHabilidad(2, new Habilidad("Espíritu del Terror","W", 75));
       c3.agregarHabilidad(3, new Habilidad("Carga Devastadora","E", 0));
       c3.agregarHabilidad(4, new Habilidad("Avalancha de Sombras","R", 100));
       
       
        
        campeonesLista.add(c1);
        campeonesLista.add(c2);
        campeonesLista.add(c3);
        return campeonesLista;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lista = new javax.swing.JComboBox<>();
        tituloPrograma = new javax.swing.JLabel();
        campeonNombre = new javax.swing.JTextField();
        campeonSubtitulo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        campeonDesc = new javax.swing.JTextArea();
        campeonRC = new javax.swing.JTextField();
        campeonIcon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pText = new javax.swing.JTextField();
        qText = new javax.swing.JTextField();
        wText = new javax.swing.JTextField();
        eText = new javax.swing.JTextField();
        rText = new javax.swing.JTextField();
        claseIcon = new javax.swing.JLabel();
        itemsTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemsRecomendados = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jTextField6 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Visualizador LoL");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("ventanaPrincipal"); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 600));

        jPanel2.setBackground(new java.awt.Color(109, 91, 68));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(147, 100, 49));
        jPanel2.setOpaque(false);

        lista.setBackground(new java.awt.Color(204, 204, 204));
        lista.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(Elegir campeón)", "Ashe", "Gwen", "Hecarim", "Jhin", "Leona", "Lux", "Nocturne", "Pantheon", "Ryze", "Twisted Fate", "Zac" }));
        lista.setPreferredSize(new java.awt.Dimension(200, 30));
        lista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaActionPerformed(evt);
            }
        });

        tituloPrograma.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        tituloPrograma.setText("Visualizador");

        campeonNombre.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        campeonNombre.setText("Campeón");
        campeonNombre.setBorder(null);
        campeonNombre.setCaretColor(new java.awt.Color(0, 0, 0));

        campeonSubtitulo.setFont(new java.awt.Font("Dialog", 3, 17)); // NOI18N
        campeonSubtitulo.setText("Subtitulo");
        campeonSubtitulo.setBorder(null);

        campeonDesc.setEditable(false);
        campeonDesc.setColumns(20);
        campeonDesc.setFont(new java.awt.Font("Dialog", 2, 16)); // NOI18N
        campeonDesc.setLineWrap(true);
        campeonDesc.setRows(5);
        campeonDesc.setText("(Descripción)\n");
        campeonDesc.setWrapStyleWord(true);
        campeonDesc.setBorder(null);
        campeonDesc.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jScrollPane2.setViewportView(campeonDesc);

        campeonRC.setFont(new java.awt.Font("Dialog", 3, 17)); // NOI18N
        campeonRC.setText("Clase - Región");
        campeonRC.setBorder(null);
        campeonRC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campeonRCActionPerformed(evt);
            }
        });

        campeonIcon.setPreferredSize(new java.awt.Dimension(120, 120));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel1.setText("Habilidades");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("P:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Q:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("W:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("E:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("R:");

        pText.setToolTipText("");
        pText.setBorder(null);

        qText.setBorder(null);
        qText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qTextActionPerformed(evt);
            }
        });

        wText.setBorder(null);

        eText.setBorder(null);

        rText.setBorder(null);

        claseIcon.setPreferredSize(new java.awt.Dimension(96, 96));

        itemsTitulo.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        itemsTitulo.setText("Items recomendados");

        itemsRecomendados.setColumns(20);
        itemsRecomendados.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        itemsRecomendados.setLineWrap(true);
        itemsRecomendados.setRows(5);
        itemsRecomendados.setWrapStyleWord(true);
        jScrollPane1.setViewportView(itemsRecomendados);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(campeonIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(claseIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(113, 113, 113))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel5))
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(jLabel6)
                                                        .addGap(4, 4, 4)))
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(wText)
                                                    .addComponent(eText)
                                                    .addComponent(rText)))
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(jLabel3)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(qText, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(jLabel2)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(pText))
                                                .addComponent(jLabel1)))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(34, 34, 34)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(8, 8, 8))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(itemsTitulo)
                                                .addGap(50, 50, 50))))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campeonSubtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campeonRC, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campeonNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(tituloPrograma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(68, 68, 68))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloPrograma)
                    .addComponent(lista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(campeonIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(claseIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(campeonNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campeonSubtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campeonRC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(itemsTitulo))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(pText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(qText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(wText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(eText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(rText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(141, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextField6.setText("jTextField6");
        jTextField6.setPreferredSize(new java.awt.Dimension(100, 30));
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(Elegir campeón)", "Ashe", "Gwen", "Hecarim", "Jhin", "Leona", "Lux", "Nocturne", "Pantheon", "Ryze", "Twisted Fate", "Zac" }));
        jComboBox1.setPreferredSize(new java.awt.Dimension(120, 30));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(Elegir campeón)", "Ashe", "Gwen", "Hecarim", "Jhin", "Leona", "Lux", "Nocturne", "Pantheon", "Ryze", "Twisted Fate", "Zac" }));
        jComboBox2.setPreferredSize(new java.awt.Dimension(120, 30));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(124, 124, 124))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, 1001, 1001, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, 646, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaActionPerformed
        String campeonElegido = lista.getSelectedItem().toString();
        
        for(Personaje champ : funcionCamp()) {
            if(campeonElegido.equals(champ.getNombre())) {
                campeonNombre.setText(champ.getNombre());
                campeonDesc.setText(champ.getDescripcion());
                campeonSubtitulo.setText(champ.getSubtitulo());
                campeonRC.setText(champ.getTipo().getNombre()+" - "+champ.getTipo().getRegion());
                String nombreImg=champ.getNombre()+"Square.png";
                campeonIcon.setIcon(new ImageIcon("C:\\Users\\Marcelo\\Desktop\\tarea\\TUP 2022 2 CUATRIMESTRE\\LAB 2\\images\\squares\\"+nombreImg));
                itemsRecomendados.setText(champ.mostrarItems());
                
                pText.setText(champ.mostrarHabilidad(0));
                qText.setText(champ.mostrarHabilidad(1));
                wText.setText(champ.mostrarHabilidad(2));
                eText.setText(champ.mostrarHabilidad(3));
                rText.setText(champ.mostrarHabilidad(4));
                
                
                //cambia el icono de clase según la clase
                if(champ.getTipo().getNombre().equals("Tirador")){
                    claseIcon.setIcon(new ImageIcon("C:\\Users\\Marcelo\\Desktop\\tarea\\TUP 2022 2 CUATRIMESTRE\\LAB 2\\images\\classes\\Tirador.png"));
                }
                if(champ.getTipo().getNombre().equals("Tanque")){
                    claseIcon.setIcon(new ImageIcon("C:\\Users\\Marcelo\\Desktop\\tarea\\TUP 2022 2 CUATRIMESTRE\\LAB 2\\images\\classes\\Tanque.png"));
                }
                if(champ.getTipo().getNombre().equals("Mago")){
                    claseIcon.setIcon(new ImageIcon("C:\\Users\\Marcelo\\Desktop\\tarea\\TUP 2022 2 CUATRIMESTRE\\LAB 2\\images\\classes\\Mago.png"));
                }
                if(champ.getTipo().getNombre().equals("Luchador")){
                    claseIcon.setIcon(new ImageIcon("C:\\Users\\Marcelo\\Desktop\\tarea\\TUP 2022 2 CUATRIMESTRE\\LAB 2\\images\\classes\\Luchador.png"));
                }
                 if(champ.getTipo().getNombre().equals("Soporte")){
                    claseIcon.setIcon(new ImageIcon("C:\\Users\\Marcelo\\Desktop\\tarea\\TUP 2022 2 CUATRIMESTRE\\LAB 2\\images\\classes\\Soporte.png"));
                }
                  if(champ.getTipo().getNombre().equals("Asesino")){
                    claseIcon.setIcon(new ImageIcon("C:\\Users\\Marcelo\\Desktop\\tarea\\TUP 2022 2 CUATRIMESTRE\\LAB 2\\images\\classes\\Asesino.png"));
                }
                  else{
                      if(campeonElegido.equals("(Elegir campeón)")){
                          campeonNombre.setText("Campeón");
                          campeonSubtitulo.setText("Subtítulo");
                          campeonDesc.setText("(Descripción)");
                          campeonRC.setText("Clase - Región");
                          campeonIcon.setIcon(new ImageIcon("C:\\Users\\Marcelo\\Desktop\\tarea\\TUP 2022 2 CUATRIMESTRE\\LAB 2\\images\\squares\\champ.png"));
                          claseIcon.setIcon(new ImageIcon("C:\\Users\\Marcelo\\Desktop\\tarea\\TUP 2022 2 CUATRIMESTRE\\LAB 2\\images\\classes\\def.png"));
                      }
                  }
            }
        }
    }//GEN-LAST:event_listaActionPerformed

    private void campeonRCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campeonRCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campeonRCActionPerformed

    private void qTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qTextActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea campeonDesc;
    private javax.swing.JLabel campeonIcon;
    private javax.swing.JTextField campeonNombre;
    private javax.swing.JTextField campeonRC;
    private javax.swing.JTextField campeonSubtitulo;
    private javax.swing.JLabel claseIcon;
    private javax.swing.JTextField eText;
    private javax.swing.JTextArea itemsRecomendados;
    private javax.swing.JLabel itemsTitulo;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JComboBox<String> lista;
    private javax.swing.JTextField pText;
    private javax.swing.JTextField qText;
    private javax.swing.JTextField rText;
    private javax.swing.JLabel tituloPrograma;
    private javax.swing.JTextField wText;
    // End of variables declaration//GEN-END:variables
}
