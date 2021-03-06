/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendaropa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author DRDRA
 */
public class ActEmpleados2 extends javax.swing.JFrame {

    /**
     * Creates new form ActEmpleados
     */
    public ActEmpleados2() {
        initComponents();
        rellenarCombo();
    }

    //Conexion a la base de datos ACCESS tienda de ropa
    private Connection Conexion(){
        //se crea una con objeto conexion
        Connection conex=null;
        
        try {
            //se indica el directorio de la base de datos
            String connectionUrl = "C:\\tareas\\tarea03\\tiendaropa.mdb";
            //Se obtine la conexión
            Connection con=DriverManager.getConnection("jdbc:ucanaccess://"+connectionUrl);
            conex = con;
        } catch (SQLException ex) {
            Logger.getLogger(AppTienda.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //se comparte la conexion con el resto de la clase.
        return conex;
    }
    
    //rellenar el combobox con el numero de los empleados.
    private void rellenarCombo(){
        try {
            jCEmpleados.removeAllItems();
            jCEmpleados.addItem("Seleccione un empleado");
            //se obtine la conexion 
            Connection con = this.Conexion();
           
            Statement stmt = con.createStatement();

            //se obtiene el resultado de la consulta
            ResultSet rs = stmt.executeQuery("SELECT * from empleados");
 
            // Mientras queden datos
            while (rs.next()) {
                //rellenar el combobox
                String nombre = rs.getString("nombre");
                jCEmpleados.addItem(nombre);
            }
            
                               
       } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jCEmpleados = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTcod = new javax.swing.JTextField();
        jTNombre = new javax.swing.JTextField();
        jTtel = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel1.setText("ACTUALIZAR EMPLEADOS");

        jCEmpleados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un empleado" }));
        jCEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCEmpleadosActionPerformed(evt);
            }
        });

        jLabel2.setText("Código empleado:");

        jLabel3.setText("Nombre");

        jLabel4.setText("Teléfono");

        jTcod.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTcod.setEnabled(false);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/application-exit.png"))); // NOI18N
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Actualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addComponent(jCEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTNombre)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTcod, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTtel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 0, Short.MAX_VALUE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTcod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTtel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //se cierra la ventana cuando se pulsa el boton de salir
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    //se rellenan los campos al seleccionar del desplegable una venta
    private void jCEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCEmpleadosActionPerformed
        try {

            //se obtine la conexion 
            Connection con = this.Conexion();
           
            Statement stmt = con.createStatement();

            //se obtiene el resultado de la consulta
            ResultSet rs = stmt.executeQuery("SELECT * from empleados WHERE nombre=\'"+jCEmpleados.getSelectedItem()+"\'");
 
            // Mientras queden datos
            while (rs.next()) {
                //rellenar el combobox
                int cod = rs.getInt("Codigo_empleado");
                String nombre = rs.getString("nombre");
                int telefono = rs.getInt("telefono");
                
                jTcod.setText(Integer.toString(cod));
                jTNombre.setText(nombre);
                jTtel.setText(Integer.toString(telefono));
                
            }
      
       } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
       }
    }//GEN-LAST:event_jCEmpleadosActionPerformed

    //se actualiza los datos de la venta, mediante una sentencia preparada.
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {

            //se obtinen los valores de los campos
            String nombre  = jTNombre.getText();
            String telefono = jTtel.getText();
            String cod = jTcod.getText();
        
            //variable auxiliar para controlar los errores
            int aux =0;
        
            //se comprueba que el valor de telefono contenga valores numericos
            Pattern pat = Pattern.compile("\\D");
            Matcher tel = pat.matcher(telefono);
            

            if(nombre.equals("") || nombre==null){
                JOptionPane.showMessageDialog(null, "El campo nombre del empleado no puede estar vacio");
                aux=1;
            }else if(telefono.equals("") || telefono==null){
                JOptionPane.showMessageDialog(null, "El campo del telefono no puede estar vacio");
                aux=1;
            }else if(tel.matches()){
                JOptionPane.showMessageDialog(null, "El campo etelefono deben ser números");
                aux=1;
            }
        
            //si hay errores se muestra un mensaje, si no se procede a actualizar los datos del empleado
            if(aux!=0){
                JOptionPane.showMessageDialog(null, "Debe rellenar correctamente los campos");
            }else{
                
                Connection con = this.Conexion();
                String SQL = "UPDATE empleados SET nombre=?, telefono=? WHERE Codigo_empleado=?"; 
                PreparedStatement sentencia = con.prepareStatement(SQL);
            
                int tele = Integer.parseInt(telefono);
                int codigo = Integer.parseInt(cod);
            
                sentencia.setString(1, nombre);
                sentencia.setInt(2, tele);
                sentencia.setInt(3, codigo);
                sentencia.executeUpdate();
            
                JOptionPane.showMessageDialog(null, "Se ha actualizado el empleado");
                rellenarCombo();
                jCEmpleados.setSelectedItem(jTNombre.getText());
            }
            
       } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
       }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jCEmpleados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTcod;
    private javax.swing.JTextField jTtel;
    // End of variables declaration//GEN-END:variables
}
