/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retailpos;

import Clases.Conexion;
import clases.Usuario;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Peter
 * @see
 */
public class frmAcceso extends javax.swing.JFrame {
    private static int contador = 1;
    String fecha;
    String horas;

    public frmAcceso() throws SQLException {
        initComponents();
        this.cargaComboUserName();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BtnEntrar = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cbUsername = new javax.swing.JComboBox<>();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Usuario");

        jLabel3.setText("pasword");

        BtnEntrar.setText("Entrar");
        BtnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEntrarActionPerformed(evt);
            }
        });

        BtnSalir.setText("Salir");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/retailpos/descarga.jpg"))); // NOI18N

        cbUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbUsernameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                            .addComponent(cbUsername, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BtnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cbUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnEntrar)
                            .addComponent(BtnSalir))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnSalirActionPerformed

    //BOTON ENTRAR:
    private void BtnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEntrarActionPerformed
        
        String username = (String) this.cbUsername.getSelectedItem();
        String paswname = this.txtPassword.getText();

        if (this.cbUsername.getSelectedIndex() != -1) {
            if (this.txtPassword.getText().length() > 0) {

                boolean valida = false;
                try {
                    valida = Usuario.validaPassword(username, paswname);
                    if (valida) {
                        //en este punto ya validamos que el usuario y contraseña son los correctos, ahora necesitamos validar el estado de bloqueo. y el tiempo de desbloqueo.

                        Usuario usuario = new Usuario(username);
                        char tipoConexion = usuario.getUsu_conexion();
                        
                        System.out.println("validando usuario : "+username + "   y su estado es :"+tipoConexion);
                        if (tipoConexion != 'B') {
                            if (tipoConexion != 'I'){
                                frmSplash splash = new frmSplash();
                                splash.setLocationRelativeTo(null);
                                splash.setResizable(false);
                                splash.setVisible(true);
                                this.dispose();
                            }else{
                                JOptionPane.showMessageDialog(this, "Usuario Inactivo en el Sistema, contacte al Administrador del sistema", "Validar Credenciales", 2);
                            }
                        } else {
                              String fecBloqueo = usuario.getUsu_fec_bloq();
                              String horBloqueo = usuario.getUsu_hor_bloq();
                              this.cargaFechaHora();
                              System.out.println("FECHA BLOQUEO : "+fecBloqueo);
                              System.out.println("HORA  BLOQUEO : "+horBloqueo);
                           
                           // aca se debe validar la fecha hora de conexion para identificar si ha sido desbloqueado
                           frmAvisoSesion aviso = new frmAvisoSesion();
                           aviso.setLocationRelativeTo(null);
                           aviso.setResizable(false);
                           aviso.setVisible(true);
                        }
                    } else {
                        //aca hacer logica para controlar cuando se equivoca por tercera vez en el login, debe bloquear la cuenta.            
                        if (contador > 2){
                           this.bloquearUsuario(username, paswname);
                        }else{
                           JOptionPane.showMessageDialog(this, "La password ingresada es incorrecta, intento N° "+contador+"\n                    Reintente nuevamente", "Validar Credenciales", JOptionPane.ERROR_MESSAGE);
                           contador++;
                        }
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(frmAcceso.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Debe ingresar una contraseña para el Usuario " + username + " en el campo password", "Mensaje Alerta", 2);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una cuenta de Usuario en el campo Usuario", "Mensaje Alerta", 2);
        }

    }//GEN-LAST:event_BtnEntrarActionPerformed

    private void cbUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbUsernameActionPerformed

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
            java.util.logging.Logger.getLogger(frmAcceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAcceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAcceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAcceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new frmAcceso().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(frmAcceso.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEntrar;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JComboBox<String> cbUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables

    private void cargaComboUserName() throws SQLException {
        ResultSet listaU = Usuario.listarUsuarios();
        while (listaU.next()) {
            cbUsername.addItem(listaU.getString(1));
        }
        cbUsername.setSelectedIndex(-1);
    }

    private void cargaFechaHora() {
        String anio;
        String mess;
        String dias;
        int hora;
        int minu;
        int segu;

        Calendar calendario = new GregorianCalendar();
        hora = calendario.get(Calendar.HOUR_OF_DAY);
        minu = calendario.get(Calendar.MINUTE);
        segu = calendario.get(Calendar.SECOND);

        dias = Integer.toString(calendario.get(Calendar.DATE));
        mess = Integer.toString(calendario.get(Calendar.MONTH) +1);
        anio = Integer.toString(calendario.get(Calendar.YEAR));
        
        fecha = anio+"-"+mess+"-"+dias;
        horas = hora+":"+minu+":"+segu;
        System.out.println("FECHA HORA DEL SISTEMA : " + fecha + " " +horas);
    }

    private void bloquearUsuario(String username, String passwname) throws SQLException {
        this.cargaFechaHora();
        boolean valida = Usuario.bloqueaUsuario(username, "", fecha, horas);
                
        if (valida){
            JOptionPane.showMessageDialog(this, "El usuario "+username+" ha sido bloqueado en el sistema por "+contador+" intentos fallidos \n                    Espere 15 minutos para su liberación", "Validar Credenciales", JOptionPane.ERROR_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(this, ERROR);
        }
    }
    
}
