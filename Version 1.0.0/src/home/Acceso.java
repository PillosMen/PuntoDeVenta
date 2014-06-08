package home;

import Invitado.Invitado;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Acceso extends javax.swing.JFrame {

    public Acceso() {
        initComponents();
        setLocationRelativeTo(null);
        user.requestFocus();
    }
    
    public void acceder(String usuario, String pass){
        String sql="SELECT * FROM usuarios WHERE usuario='"+usuario+"' && contraseña='"+pass+"' ";
        String cap="";
        
        conectar cc = new conectar();
        Connection cn = cc.conexion();
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
               cap = rs.getString("tipo");
            }
            if(cap.equals("Administrador")){
                  Principal p = new Principal();
                  p.setVisible(true);
                  setVisible(false);
            }
            if(cap.equals("Invitado")){
                  Invitado i = new Invitado();
                  i.setVisible(true);
                  setVisible(false);
            }
            if(!cap.equals("Administrador") && (!cap.equals("Invitado"))){
                JOptionPane.showMessageDialog(this, "ERROR!!!\nUsuario y/o Contraseña \nson incorrectos", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            
           
               
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        cc.cerrar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        Aceptar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Acceso");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Iniciar Sesión");
        jLabel1.setBounds(150, 10, 220, 50);
        jDesktopPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        user.setBounds(280, 110, 160, 30);
        jDesktopPane1.add(user, javax.swing.JLayeredPane.DEFAULT_LAYER);
        password.setBounds(280, 210, 160, 30);
        jDesktopPane1.add(password, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Aceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir.png"))); // NOI18N
        Aceptar.setText("ENTRAR");
        Aceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Aceptar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Aceptar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Aceptar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });
        Aceptar.setBounds(320, 300, 120, 110);
        jDesktopPane1.add(Aceptar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/apagar.png"))); // NOI18N
        Salir.setText("SALIR");
        Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Salir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Salir.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Salir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        Salir.setBounds(110, 300, 120, 110);
        jDesktopPane1.add(Salir, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario:");
        jLabel2.setBounds(160, 110, 100, 30);
        jDesktopPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña:");
        jLabel3.setBounds(150, 220, 90, 20);
        jDesktopPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user-28623.png"))); // NOI18N
        jLabel4.setBounds(40, 90, 90, 60);
        jDesktopPane1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/padlocks-35705.png"))); // NOI18N
        jLabel5.setBounds(40, 190, 70, 60);
        jDesktopPane1.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        String usu = user.getText();
        String pass = new String (password.getPassword());
        
        acceder(usu, pass);
    }//GEN-LAST:event_AceptarActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Acceso().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Aceptar;
    private javax.swing.JButton Salir;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField password;
    public javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
