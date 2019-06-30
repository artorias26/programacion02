package app;

import com.mysql.jdbc.Connection;
import java.net.URL;
import java.sql.Date;
import java.sql.DriverManager;
import static java.sql.JDBCType.DATE;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class persona extends javax.swing.JFrame {

    public static final String URL = "jdbc:mysql://localhost:3306/Escuela";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";

    PreparedStatement ps;
    ResultSet rs;

//--------------------------------------------------------------------------------
    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
            JOptionPane.showMessageDialog(null, "conexion exitosa");
        } catch (Exception e) {
            System.out.println(e);

        }
        return con;

    }
//--------------------------------------------------------------------------------    
    private void Limpiar(){
        txtCLAVE.setText(null);
        txtNOMBRE.setText(null);
        txtDOMICILIO.setText(null);
        txtTELEFONO.setText(null);
        txtEMAIL.setText(null);
        txtFECHA.setText(null);
        cbxGENERO.setSelectedIndex(0);          
    }
//------------------------------------------------------------------------------   
    public persona() {
        initComponents();
        txtID.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtCLAVE = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNOMBRE = new javax.swing.JTextField();
        txtDOMICILIO = new javax.swing.JTextField();
        txtTELEFONO = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtEMAIL = new javax.swing.JTextField();
        txtFECHA = new javax.swing.JTextField();
        cbxGENERO = new javax.swing.JComboBox<>();
        btnGUARDAR = new javax.swing.JButton();
        btnMODIFICAR = new javax.swing.JButton();
        btnREFRESCAR = new javax.swing.JButton();
        btnELIMINAR = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        btnBUSCAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CLAVE: ");

        jLabel2.setText("NOMBRE: ");

        jLabel3.setText("DOMICILIO: ");

        jLabel4.setText("TELEFONO: ");

        txtNOMBRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNOMBREActionPerformed(evt);
            }
        });

        txtTELEFONO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTELEFONOActionPerformed(evt);
            }
        });

        jLabel5.setText("EMAIL: ");

        jLabel6.setText("FECHA DE NACIMIENTO: ");

        jLabel7.setText("GENERO: ");

        cbxGENERO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONA", "MASCULINO", "FEMENINO" }));

        btnGUARDAR.setText("GUARDAR");
        btnGUARDAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGUARDARActionPerformed(evt);
            }
        });

        btnMODIFICAR.setText("MODIFICAR");
        btnMODIFICAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMODIFICARActionPerformed(evt);
            }
        });

        btnREFRESCAR.setText("REFRESCAR");
        btnREFRESCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnREFRESCARActionPerformed(evt);
            }
        });

        btnELIMINAR.setText("ELIMINAR");
        btnELIMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnELIMINARActionPerformed(evt);
            }
        });

        txtID.setEnabled(false);
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        btnBUSCAR.setText("BUSCAR");
        btnBUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBUSCARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGUARDAR)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNOMBRE)
                            .addComponent(txtDOMICILIO)
                            .addComponent(txtTELEFONO)
                            .addComponent(txtEMAIL)
                            .addComponent(txtFECHA)
                            .addComponent(cbxGENERO, 0, 220, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCLAVE, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(5, 5, 5)
                        .addComponent(btnBUSCAR))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnMODIFICAR)
                        .addGap(31, 31, 31)
                        .addComponent(btnREFRESCAR)
                        .addGap(31, 31, 31)
                        .addComponent(btnELIMINAR)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtCLAVE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBUSCAR))
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2))
                    .addComponent(txtNOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDOMICILIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTELEFONO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtFECHA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbxGENERO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGUARDAR)
                    .addComponent(btnMODIFICAR)
                    .addComponent(btnREFRESCAR)
                    .addComponent(btnELIMINAR))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNOMBREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNOMBREActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNOMBREActionPerformed

    private void txtTELEFONOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTELEFONOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTELEFONOActionPerformed

    private void btnREFRESCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnREFRESCARActionPerformed
        Limpiar();
        
        
        
        
        
    }//GEN-LAST:event_btnREFRESCARActionPerformed

    private void btnBUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBUSCARActionPerformed
         Connection con = null;
        try {
            con=getConnection();
            ps=con.prepareStatement("SELECT * FROM persona WHERE clave=?");
            ps.setString(1, txtCLAVE.getText());
            
            rs=ps.executeQuery();
            
            if(rs.next()){
                txtID.setText(rs.getString("id"));
                txtNOMBRE.setText(rs.getString("nombre"));
                txtDOMICILIO.setText(rs.getString("domicilio"));
                txtTELEFONO.setText(rs.getString("telefono"));
                txtEMAIL.setText(rs.getString("correo_electronico"));
                txtFECHA.setText(rs.getString("fecha_nacimiento"));
                cbxGENERO.setSelectedItem(rs.getString("genero"));      
            }else{
                JOptionPane.showMessageDialog(null, "NO EXISTE ESTA PERSONA REGISTRADA :( ");
            }
        }catch (Exception e) {
            System.err.println(e);
        }
        
        
    }//GEN-LAST:event_btnBUSCARActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void btnGUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGUARDARActionPerformed
        Connection con = null;
        try {
            con = getConnection();
            ps = con.prepareStatement("INSERT INTO persona(clave,nombre,domicilio,telefono,correo_electronico,fecha_nacimiento,genero)VALUES(?,?,?,?,?,?,?)");
            ps.setString(1, txtCLAVE.getText());
            ps.setString(2, txtNOMBRE.getText());
            ps.setString(3, txtDOMICILIO.getText());
            ps.setString(4, txtTELEFONO.getText());
            ps.setString(5, txtEMAIL.getText());
            ps.setDate(6, Date.valueOf(txtFECHA.getText()));
            ps.setString(7, cbxGENERO.getSelectedItem().toString());
            
           Integer res= ps.executeUpdate();
           
           if (res >0){
               JOptionPane.showMessageDialog(null, "Persona Registrada");
               Limpiar();
           }else{
               JOptionPane.showMessageDialog(null, "ERROR :(");
               Limpiar();
           }
            con.close();
            
        } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_btnGUARDARActionPerformed

    private void btnMODIFICARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMODIFICARActionPerformed
        
          Connection con = null;
        try {
            con = getConnection();
            ps = con.prepareStatement("UPDATE persona SET clave=?,nombre=?,domicilio=?,telefono=?,correo_electronico=?,fecha_nacimiento=?,genero=? WHERE id=?");
            ps.setString(1, txtCLAVE.getText());
            ps.setString(2, txtNOMBRE.getText());
            ps.setString(3, txtDOMICILIO.getText());
            ps.setString(4, txtTELEFONO.getText());
            ps.setString(5, txtEMAIL.getText());
            ps.setDate(6, Date.valueOf(txtFECHA.getText()));
            ps.setString(7, cbxGENERO.getSelectedItem().toString());
            ps.setString(8, txtID.getText());
            
           Integer res= ps.executeUpdate();
           
           if (res >0){
               JOptionPane.showMessageDialog(null, "Persona Modificada");
               Limpiar();
           }else{
               JOptionPane.showMessageDialog(null, "ERROR AL MODIFICAR :(");
               Limpiar();
           }
            con.close();
            
        } catch (Exception e) {
            System.err.println(e);
        }
        
        
        
        
        
        
    }//GEN-LAST:event_btnMODIFICARActionPerformed

    private void btnELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnELIMINARActionPerformed
        Connection con = null;
        try {
            con = getConnection();
            ps = con.prepareStatement("DELETE FROM persona WHERE id=?");
         
            ps.setInt(1, Integer.parseInt(txtID.getText()));
            
           Integer res= ps.executeUpdate();
           
           if (res >0){
               JOptionPane.showMessageDialog(null, "Persona eliminada");
               Limpiar();
           }else{
               JOptionPane.showMessageDialog(null, "ERROR AL ELIMINAR :(");
               Limpiar();
           }
            con.close();
            
        } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_btnELIMINARActionPerformed

    public static void main(String args[]) {
        
          /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Conexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new persona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBUSCAR;
    private javax.swing.JButton btnELIMINAR;
    private javax.swing.JButton btnGUARDAR;
    private javax.swing.JButton btnMODIFICAR;
    private javax.swing.JButton btnREFRESCAR;
    private javax.swing.JComboBox<String> cbxGENERO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtCLAVE;
    private javax.swing.JTextField txtDOMICILIO;
    private javax.swing.JTextField txtEMAIL;
    private javax.swing.JTextField txtFECHA;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNOMBRE;
    private javax.swing.JTextField txtTELEFONO;
    // End of variables declaration//GEN-END:variables
}
