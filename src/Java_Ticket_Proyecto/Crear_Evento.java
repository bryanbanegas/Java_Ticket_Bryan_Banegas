/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Java_Ticket_Proyecto;

import static Java_Ticket_Proyecto.Administracion_de_eventos.tipo;
import static Java_Ticket_Proyecto.Administracion_de_eventos.claseCrear;
import static Java_Ticket_Proyecto.Login.usuarioLogin;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author adalb
 */
public class Crear_Evento extends javax.swing.JFrame {

    /**
     * Creates new form Crear_Evento
     */
    public Crear_Evento() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }
    static Date fechaCrear=new Date();
    public static ArrayList<Evento> eventos=new ArrayList<>();
    public static ArrayList user=new ArrayList<>();
    public static String codigoCrear,tituloCrear,descripcionCrear,equipo1Crear,equipo2Crear,tipoCrear,montoprueba;
    public static int cantidadCrear,cantidadDeportivo=0,cantidadMusical=0,cantidadReligioso=0;
    public static int hayEventos=0;
    public static double montoCrear;
    public static boolean puedeAvanzar,puedeAvanzar1=true;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        MontoTextbox1 = new javax.swing.JTextField();
        TituloTextbox = new javax.swing.JTextField();
        CodigoTextbox = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        DescripcionTextbox = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CantidadTextbox = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        CrearEvento = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Equipo2Textbox = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Equipo1Textbox = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        MontoTextbox = new javax.swing.JTextField();
        FechaTextbox = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jLabel9.setText("Monto:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("Codigo de evento:");

        jLabel4.setText("Descripcion:");

        jLabel1.setText("Titulo de evento:");

        jLabel5.setText("Cantidad de personas:");

        jLabel6.setText("Fecha:");

        if(tipo==3){
            jComboBox1.setVisible(false);
        }else if(tipo==2){
            jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "","Pop","Rock","Rap","Clasica","Reggeaton","Otro" }));
        }else if(tipo==1){
            jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "","Futbol","Tenis","Rugby","Baseball" }));
        }
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        CrearEvento.setText("Crear");
        CrearEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearEventoActionPerformed(evt);
            }
        });

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        if(tipo==3){
            Equipo2Textbox.setVisible(false);
        }else if(tipo==2){
            Equipo2Textbox.setVisible(false);
        }

        jLabel7.setText("Equipo 1:");
        if(tipo==3){
            jLabel7.setVisible(false);
        }else if(tipo==2){
            jLabel7.setVisible(false);
        }

        jLabel8.setText("Equipo 2:");
        if(tipo==3){
            jLabel8.setVisible(false);
        }else if(tipo==2){
            jLabel8.setVisible(false);
        }

        if(tipo==3){
            Equipo1Textbox.setVisible(false);
        }else if(tipo==2){
            Equipo1Textbox.setVisible(false);
        }

        jLabel10.setText("Monto:");

        if(tipo==3){
            MontoTextbox.setVisible(false);
        }

        jLabel11.setText("Tipo:");
        if(tipo==3){
            jLabel11.setVisible(false);
        }else if(tipo==2){
            jLabel11.setText("Tipo de musica:");
        }else if(tipo==1){
            jLabel11.setText("Tipo de deporte:");
        }

        jLabel12.setText("L.2000");
        if(tipo==3){

        }else{
            jLabel12.setVisible(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CrearEvento)
                                .addGap(383, 383, 383)
                                .addComponent(jButton1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(Equipo1Textbox, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(Equipo2Textbox, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(CodigoTextbox, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TituloTextbox, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DescripcionTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CantidadTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel12)))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MontoTextbox)
                            .addComponent(FechaTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TituloTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CodigoTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CantidadTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DescripcionTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(MontoTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Equipo2Textbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Equipo1Textbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(FechaTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CrearEvento)
                    .addComponent(jButton1))
                .addGap(78, 78, 78))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CrearEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearEventoActionPerformed
        // TODO add your handling code here:
        if(tipo==3){
            tipoCrear="";
            montoprueba="2000";
        }else{
            montoprueba=MontoTextbox.getText();
        }
        codigoCrear=CodigoTextbox.getText();
        tituloCrear=TituloTextbox.getText();
        descripcionCrear=DescripcionTextbox.getText();
        fechaCrear=FechaTextbox.getDate();
        String cantidadprueba=CantidadTextbox.getText();
        if(codigoCrear.isEmpty()||tituloCrear.isEmpty()||descripcionCrear.isEmpty()||montoprueba.isEmpty()||cantidadprueba.isEmpty()||fechaCrear==null||tipoCrear==null){
            JOptionPane.showMessageDialog(null, "Por favor, llenar todos los campos.");
        }else{
        try{
            montoCrear=Integer.parseInt(montoprueba);
            cantidadCrear=Integer.parseInt(cantidadprueba);
            puedeAvanzar=true;
        }catch(NumberFormatException e){
            puedeAvanzar=false;
        }
        if(puedeAvanzar==true){
        if(tipo==1){
            equipo1Crear=Equipo1Textbox.getText();
            equipo2Crear=Equipo2Textbox.getText();
            if(equipo1Crear.isEmpty()||equipo2Crear.isEmpty()){
                JOptionPane.showMessageDialog(null, "Por favor, llenar todos los campos.");
            }else{
                if(tipoCrear.equals("")){
                    JOptionPane.showMessageDialog(null, "Tiene que escoger un tipo de deporte");
                }else{
                    for(int indice=0;indice<eventos.size();indice++){
                    if(eventos.get(indice)!=null){ 
                        if(eventos.get(indice).getCodigo().equals(codigoCrear)){
                            puedeAvanzar1=false;
                            JOptionPane.showMessageDialog(null, "Codigo Existente");
                            break;
                        }else{
                            puedeAvanzar1=true;
                        }
                    }
                    }
                    if(puedeAvanzar1==true){
                        if(cantidadCrear<=20000){
                            user.add(usuarioLogin);
                            eventos.add(new Evento_Deportivo(codigoCrear,claseCrear,tituloCrear,descripcionCrear,
                                    fechaCrear,montoCrear,cantidadCrear,equipo1Crear,equipo2Crear,tipoCrear));
                            JOptionPane.showMessageDialog(null, "Ha creado su evento con exito.");
                            cantidadDeportivo++;
                            puedeAvanzar=false;
                            puedeAvanzar1=false;
                            hayEventos++;
                            Administracion_de_eventos pasar=new Administracion_de_eventos();
                            pasar.setVisible(true);
                            this.setVisible(false);
                        }else{
                            JOptionPane.showMessageDialog(null, "La cantidad maxima de gente permitida es de 20 mil.");
                        }
                    }
                }
            } 
        }else if(tipo==2){
            if(tipoCrear.equals("")){
                    JOptionPane.showMessageDialog(null, "Tiene que escoger un tipo de Musica");
                }else{
                    for(int indice=0;indice<eventos.size();indice++){
                    if(eventos.get(indice)!=null){ 
                        if(eventos.get(indice).getCodigo().equals(codigoCrear)){
                            puedeAvanzar1=false;
                            JOptionPane.showMessageDialog(null, "Codigo Existente");
                            break;
                        }else{
                            puedeAvanzar1=true;
                        }
                    }
                    }
                    if(puedeAvanzar1==true){
                        if(cantidadCrear<=25000){
                            user.add(usuarioLogin);
                            eventos.add(new Evento_Musical(codigoCrear,claseCrear,tituloCrear,descripcionCrear,
                                    fechaCrear,montoCrear,cantidadCrear,tipoCrear));
                            JOptionPane.showMessageDialog(null, "Ha creado su evento con exito.");
                            cantidadMusical++;
                            puedeAvanzar=false;
                            puedeAvanzar1=false;
                            hayEventos++;
                            Administracion_de_eventos pasar=new Administracion_de_eventos();
                            pasar.setVisible(true);
                            this.setVisible(false);
                        }else{
                            JOptionPane.showMessageDialog(null, "La cantidad maxima de gente permitida es de 25 mil.");
                        }
                    }
                }
        }else if(tipo==3){
            for(int indice=0;indice<eventos.size();indice++){
            if(eventos.get(indice)!=null){ 
                if(eventos.get(indice).getCodigo().equals(codigoCrear)){
                    puedeAvanzar1=false;
                    JOptionPane.showMessageDialog(null, "Codigo Existente");
                    break;
                }else{
                    puedeAvanzar1=true;
                }
            }
            }
            if(puedeAvanzar1==true){
                if(cantidadCrear<=30000){
                    user.add(usuarioLogin);
                    eventos.add(new Evento_Religioso(codigoCrear,claseCrear,tituloCrear,descripcionCrear,
                                    fechaCrear,montoCrear,cantidadCrear));
                    JOptionPane.showMessageDialog(null, "Ha creado su evento con exito.");
                    cantidadReligioso++;
                    puedeAvanzar=false;
                    puedeAvanzar1=false;
                    hayEventos++;
                    Administracion_de_eventos pasar=new Administracion_de_eventos();
                    pasar.setVisible(true);
                    this.setVisible(false);
                }else{
                    JOptionPane.showMessageDialog(null, "La cantidad maxima de gente permitida es de 30 mil.");
                }
            }
        }
        }else{
            JOptionPane.showMessageDialog(null, "Asegurese de ingresar numero enteros para Monto y Cantidad.");
        }
        }
    }//GEN-LAST:event_CrearEventoActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
        tipoCrear=(String) jComboBox1.getSelectedItem();
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Administracion_de_eventos pasar=new Administracion_de_eventos();
        pasar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Crear_Evento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crear_Evento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crear_Evento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crear_Evento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crear_Evento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CantidadTextbox;
    private javax.swing.JTextField CodigoTextbox;
    private javax.swing.JButton CrearEvento;
    private javax.swing.JTextField DescripcionTextbox;
    public static javax.swing.JTextField Equipo1Textbox;
    public static javax.swing.JTextField Equipo2Textbox;
    private com.toedter.calendar.JDateChooser FechaTextbox;
    public static javax.swing.JTextField MontoTextbox;
    private javax.swing.JTextField MontoTextbox1;
    private javax.swing.JTextField TituloTextbox;
    private javax.swing.JButton jButton1;
    public static javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    public static javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
