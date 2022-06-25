package Vista;
//@authors: samaelhg (Adrián Hernández) karenCat (Karen Gonzaga)

import Controlador.ControladorAuto;
import controlador.tda.lista.exception.PosicionException;
import java.util.Random;
import javax.swing.JOptionPane;

public class FrmBusqueda extends javax.swing.JFrame {
    private ControladorAuto CA = new ControladorAuto();
    private int aleatorios = 10000;
    private int x;
    
    public FrmBusqueda() {
        initComponents();
        setLocationRelativeTo(this);
        buscarObjectTxT.setEnabled(false);
        x = 0;
        
    }
    private String[] generarMarcasAleatorios(int cantidad) {

        String[] marcasAleatorios = new String[cantidad];
        String[] marcas = {"Renault", "Ferrari", "Bentley", "Chevrolet", "Ford", "Honda", "Hyundai", "Suzuki",
            "Toyota", "Volvo", "Mazda", "Karen", "Jaguar"};


        for (int i = 0; i < cantidad; i++) {
            marcasAleatorios[i] = marcas[(int) (Math.floor(Math.random() * ((marcas.length - 1) - 0 + 1) + 0))];
        }

        return marcasAleatorios;
    }
    private String[] generarModelosAleatorios(int cantidad) {

        String[] modelosAleatorios = new String[cantidad];
        String[] modelos = {"Camioneta", "Carro Pequeño", "Volqueta", "Deportivo", "Excavadora", "Bus", "BMW", "Audi",
            "Camaro", "Ford Fiesta ", "Land Rober"};


        for (int i = 0; i < cantidad; i++) {
            modelosAleatorios[i] = modelos[(int) (Math.floor(Math.random() * ((modelos.length - 1) - 0 + 1) + 0))];
        }

        return modelosAleatorios;
    }
    private String[] generarColoresAleatorios(int cantidad) {

        String[] Aleatorios = new String[cantidad];
        String[] objetos = {"Azul", "Amarillo", "Verde", "Rojo", "Morado", "Blanco", "Negro", "Piel",
            "Rosado", "Laminado", "Gris", "Plomo", "Plateado", "Dorado", "Anaranjado"};


        for (int i = 0; i < cantidad; i++) {
            Aleatorios[i] = objetos[(int) (Math.floor(Math.random() * ((objetos.length - 1) - 0 + 1) + 0))];
        }

        return Aleatorios;
    }
    private String[] generarMatriculasAleatorios(int cantidad) {

        String[] Aleatorios = new String[cantidad];
        String[] objetos = {"A", "G", "L", "P", "Y", "W", "H"};
        String[] objetos1 = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P"
                            ,"Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String[] objetos2 = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};



        for (int i = 0; i < cantidad; i++) {
            Aleatorios[i] = objetos[(int) (Math.floor(Math.random() * ((objetos.length - 1) - 0 + 1) + 0))] 
                          + objetos1[(int) (Math.floor(Math.random() * ((objetos.length - 1) - 0 + 1) + 0))]
                          + objetos1[(int) (Math.floor(Math.random() * ((objetos.length - 1) - 0 + 1) + 0))]
                          +"-"
                          +objetos2[(int) (Math.floor(Math.random() * ((objetos.length - 1) - 0 + 1) + 0))]
                          +objetos2[(int) (Math.floor(Math.random() * ((objetos.length - 1) - 0 + 1) + 0))]
                          +objetos2[(int) (Math.floor(Math.random() * ((objetos.length - 1) - 0 + 1) + 0))]
                          +objetos2[(int) (Math.floor(Math.random() * ((objetos.length - 1) - 0 + 1) + 0))];
        }

        return Aleatorios;
    }
    private Double[] generarPreciosAleatorias(int cantidad) {
        double max = 10000000;
        double min = 100000;
        double range = max - min + 1;
        Double[] preciosAleatorios = new Double[cantidad];
        for (int i = 0; i < cantidad; i++) {
            double gananciaTemp = (Double) (Math.random() * range) + min;
            preciosAleatorios[i] = Math.round(gananciaTemp * 100.0) / 100.0;
        }
        return preciosAleatorios;
    }
    private Integer[] generarAñosAleatorios(int cantidad) {
        int max = 2022;
        int min = 2000;
        int range = max - min + 1;
        Integer[] yearAleatorios = new Integer[cantidad];

        for (int i = 0; i < cantidad; i++) {
            yearAleatorios[i] = (int) (Math.random() * range) + min;
        }

        return yearAleatorios;

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mdTxT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        mcTxT = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        pTxT = new javax.swing.JTextField();
        cTxT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        yTxT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        mtTxT = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        seguroBox = new javax.swing.JCheckBox();
        crearBttn = new javax.swing.JButton();
        aleatoriosBttn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaListaAutos = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        atributoBox = new javax.swing.JComboBox<>();
        metodoBox = new javax.swing.JComboBox<>();
        tipoOrdenacionBox = new javax.swing.JComboBox<>();
        ordenarBttn = new javax.swing.JButton();
        busquedaBox = new javax.swing.JCheckBox();
        buscarObjectTxT = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel1.setText("SISTEMA DE AUTOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 280, 40));

        jLabel2.setText("Modelo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 170, 20));
        jPanel1.add(mdTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 230, 30));

        jLabel4.setText("Marca");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 170, -1));
        jPanel1.add(mcTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 230, 30));

        jLabel6.setText("Precio");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 100, -1));
        jPanel1.add(pTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 180, 30));
        jPanel1.add(cTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 180, 30));

        jLabel5.setText("Color");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 110, 10));
        jPanel1.add(yTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 100, 30));

        jLabel3.setText("Año");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 100, -1));
        jPanel1.add(mtTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 190, 30));

        jLabel7.setText("Matricula");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 100, -1));

        seguroBox.setText("Seguro");
        jPanel1.add(seguroBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 80, -1));

        crearBttn.setText("CREAR");
        crearBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearBttnActionPerformed(evt);
            }
        });
        jPanel1.add(crearBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 225, 160, 30));

        aleatoriosBttn.setText("GENERAR ALEATORIOS");
        aleatoriosBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aleatoriosBttnActionPerformed(evt);
            }
        });
        jPanel1.add(aleatoriosBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 225, 180, 30));

        tablaListaAutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Marca", "Modelo", "Color", "Precio", "Matricula", "Año", "Seguro"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaListaAutos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 660, 340));

        jLabel8.setText("KAREN GONZAGA");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 120, 20));

        jLabel9.setText("ADRIÁN HERNÁNDEZ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, -1, 20));

        atributoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ORDENAR POR", "marca", "modelo", "color", "precio", "matricula", "año" }));
        jPanel1.add(atributoBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 630, 180, -1));

        metodoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ORDENAR POR", "METODO SHELL", "QUICK SORT" }));
        jPanel1.add(metodoBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 630, 180, -1));

        tipoOrdenacionBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TIPO DE ORDENACION", "ASCENDENTE", "DESCENDENTE" }));
        jPanel1.add(tipoOrdenacionBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 630, 210, -1));

        ordenarBttn.setText("ORDENAR");
        ordenarBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarBttnActionPerformed(evt);
            }
        });
        jPanel1.add(ordenarBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 680, 150, -1));

        busquedaBox.setText("Buscar");
        busquedaBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busquedaBoxActionPerformed(evt);
            }
        });
        jPanel1.add(busquedaBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 710, 90, -1));

        buscarObjectTxT.setText("Inserte el valor");
        jPanel1.add(buscarObjectTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 680, 180, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearBttnActionPerformed
        try {
            if (x >= 3) {
                crearBttn.setEnabled(false);
                
            }else{
                guardar();
                limpiar();
                aleatorios = aleatorios - x;   
            }
            
        } catch (PosicionException ex) {}
    }//GEN-LAST:event_crearBttnActionPerformed

    private void aleatoriosBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aleatoriosBttnActionPerformed
        try {
            x = 2;
            if (x > 4) {
                crearBttn.setEnabled(false);
            }
            guardarAleatorios(aleatorios);
            aleatoriosBttn.setEnabled(false);
            
        } catch (PosicionException ex) {}
    }//GEN-LAST:event_aleatoriosBttnActionPerformed

    private void ordenarBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarBttnActionPerformed
        if (ordenarBttn.getText().equals("ORDENAR")) {
            try {
                ordenarPor();
            } catch (Exception ex) {}
        }else if (ordenarBttn.getText().equals("BUSCAR")) {
            try {
                buscarPor();
            } catch (PosicionException ex) {} catch (Exception ex) {
            }
        }
    }//GEN-LAST:event_ordenarBttnActionPerformed

    private void busquedaBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busquedaBoxActionPerformed
        try {
            if (busquedaBox.isSelected()) {
                ordenarBttn.setText("BUSCAR");
                atributoBox.insertItemAt("BUSCAR POR",0);
                atributoBox.removeItemAt(1);
                atributoBox.setSelectedIndex(0);
                buscarObjectTxT.setEnabled(true);
                buscarObjectTxT.setText("");
                metodoBox.setEnabled(false);
                tipoOrdenacionBox.setEnabled(false);
                
            }else{
                ordenarBttn.setText("ORDENAR");
                atributoBox.insertItemAt("ORDENAR POR",0);
                atributoBox.removeItemAt(1);
                atributoBox.setSelectedIndex(0);
                buscarObjectTxT.setEnabled(false);
                buscarObjectTxT.setText("Inserte el valor");
                metodoBox.setEnabled(true);
                tipoOrdenacionBox.setEnabled(true);
                mostrarTabla();
            }
            

        } catch (PosicionException ex) {
        }
    }//GEN-LAST:event_busquedaBoxActionPerformed
    private void guardar() throws PosicionException{
        if (mcTxT.getText().isEmpty() || mcTxT.getText().equals("") || mdTxT.getText().isEmpty() || mdTxT.getText().equals("")
          ||cTxT.getText().isEmpty()  || cTxT.getText().equals("")  || pTxT.getText().isEmpty()  || pTxT.getText().equals("")
          ||mtTxT.getText().isEmpty() || mtTxT.getText().equals("") || yTxT.getText().isEmpty()  || yTxT.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Faltan Datos");
        }else{
            String marca = mcTxT.getText();
            String modelo = mdTxT.getText();
            String color= cTxT.getText();
            Double precio = Double.valueOf(pTxT.getText());
            String matricula = mtTxT.getText();
            Integer year = Integer.valueOf(yTxT.getText());
            Boolean seguro = seguroBox.isSelected();
            CA.crearAuto(marca, modelo, color, precio, matricula, year, seguro);
            mostrarTabla();
            x++;
            JOptionPane.showMessageDialog(this, "Creado Correctamente");
        }
    }
    private void guardarAleatorios(int cantidad) throws PosicionException{
        Random randomGenerator = new Random();
        String[] marcas = generarMarcasAleatorios(cantidad);
        String[] modelos = generarModelosAleatorios(cantidad);
        String[] colores = generarColoresAleatorios(cantidad);
        String[] matriculas = generarMatriculasAleatorios(cantidad);
        Double[] precios = generarPreciosAleatorias(cantidad);
        Integer[] years = generarAñosAleatorios(cantidad);

        for (int i = 0; i < cantidad; i++) {
            Boolean seguro = randomGenerator.nextBoolean();
            CA.crearAuto(marcas[i], modelos[i], colores[i], precios[i], matriculas[i], years[i], seguro);
        }
        mostrarTabla();
        JOptionPane.showMessageDialog(this, "Aleatorios generados correctamente");
    }
    private void mostrarTabla() throws PosicionException {
        String lista[][] = CA.mostrarLista();
        tablaListaAutos.setModel(new javax.swing.table.DefaultTableModel(
                lista,
                new String[]{
                    "Marca", "Modelo", "Color", "Precio", "Matricula", "Año", "Seguro"
                }
        ));
    }
    private void mostrarBusqueda() throws PosicionException {
        String lista[][] = CA.mostrarBusqueda();
        tablaListaAutos.setModel(new javax.swing.table.DefaultTableModel(
                lista,
                new String[]{
                    "Marca", "Modelo", "Color", "Precio", "Matricula", "Año", "Seguro"
                }
        ));
    }
    private void ordenarPor() throws PosicionException, Exception {
        String ordenarPorAtributo = atributoBox.getSelectedItem().toString();
        String ordenarPorMetodo = metodoBox.getSelectedItem().toString();
        String tipoOrdenacion = tipoOrdenacionBox.getSelectedItem().toString();
        if (ordenarPorAtributo.equals("año")) {
            ordenarPorAtributo = "year";
        }
        if (ordenarPorAtributo.equals("ORDENAR POR") || ordenarPorMetodo.equals("ORDENAR POR") || tipoOrdenacion.equals("TIPO DE ORDENACION")) {
            JOptionPane.showMessageDialog(this, "DEBE ELEGIR EL ATRIBUTO, EL METODO Y EL TIPO DE ORDENACIÓN");

        } else {
            CA.ordenar(ordenarPorAtributo, ordenarPorMetodo, tipoOrdenacion);
            mostrarTabla();
            reiniciarBox();
        }

    }
    private void buscarPor() throws PosicionException, Exception{
        String ordenarPorAtributo = atributoBox.getSelectedItem().toString();
        Object dato = buscarObjectTxT.getText();
        if (ordenarPorAtributo.equals("año")) {
            ordenarPorAtributo = "year";
        }
        if (ordenarPorAtributo.equals("BUSCAR POR") || buscarObjectTxT.getText().equals("Insertar el valor")) {
            JOptionPane.showMessageDialog(this, "DEBE ELEGIR EL ATRIBUTO o DEBE INSERTAR UN VALOR PARA BUSCAR");

        } else {
            CA.buscar(ordenarPorAtributo, dato);
            mostrarBusqueda();
            reiniciarBox();
        }
    }
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
            java.util.logging.Logger.getLogger(FrmBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmBusqueda().setVisible(true);
            }
        });
    }
    private void limpiar(){
        mcTxT.setText("");
        mdTxT.setText("");
        cTxT.setText("");
        pTxT.setText("");
        mtTxT.setText("");
        yTxT.setText("");
        seguroBox.setSelected(false);
    }
    private void reiniciarBox() {
        atributoBox.setSelectedIndex(0);
        metodoBox.setSelectedIndex(0);
        tipoOrdenacionBox.setSelectedIndex(0);

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aleatoriosBttn;
    private javax.swing.JComboBox<String> atributoBox;
    private javax.swing.JTextField buscarObjectTxT;
    private javax.swing.JCheckBox busquedaBox;
    private javax.swing.JTextField cTxT;
    private javax.swing.JButton crearBttn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mcTxT;
    private javax.swing.JTextField mdTxT;
    private javax.swing.JComboBox<String> metodoBox;
    private javax.swing.JTextField mtTxT;
    private javax.swing.JButton ordenarBttn;
    private javax.swing.JTextField pTxT;
    private javax.swing.JCheckBox seguroBox;
    private javax.swing.JTable tablaListaAutos;
    private javax.swing.JComboBox<String> tipoOrdenacionBox;
    private javax.swing.JTextField yTxT;
    // End of variables declaration//GEN-END:variables
}
