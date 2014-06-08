package home;

import Ventanas.BuscarCliente;
import Ventanas.EditarCliente;
import Ventanas.EditarProducto;
import Ventanas.EditarProveedor;
import Ventanas.EliminarCliente;
import Ventanas.EliminarProducto;
import Ventanas.EliminarProveedor;
import Ventanas.NuevoCliente;
import Ventanas.NuevoProveedor;
import javax.swing.*;
import Ventanas.Productos;
import Ventanas.Usuarios;
import Ventanas.VerProducto;
import Ventanas.VerProveedor;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class Principal extends javax.swing.JFrame {

    Acceso a = new Acceso();
    public javax.swing.Timer timer1;
    
    public Principal() {
        
        initComponents();
        setLocationRelativeTo(null);
        hora();
        usuario.setText(a.user.getText());
    }
           
    public void hora(){
    java.awt.event.ActionListener al =
    new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        onTimer();
      }
    };
    // Crear un temporizador e iniciarlo
    timer1 = new javax.swing.Timer(1000, al);
    timer1.start();
  }

    public void onTimer(){
    java.util.Date hora = new java.util.Date();
    String patron = "hh:mm:ss";
    java.text.SimpleDateFormat formato = new java.text.SimpleDateFormat(patron);
    horas.setText(formato.format(hora));
    Date now = new Date();
    DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
    String s = df.format(now);
    fecha.setText(s);
  }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        fecha = new javax.swing.JLabel();
        horas = new javax.swing.JLabel();
        CerrarSesion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        Menu = new javax.swing.JMenuBar();
        tools = new javax.swing.JMenu();
        Permisos = new javax.swing.JMenuItem();
        Imprimir = new javax.swing.JMenuItem();
        ayuda = new javax.swing.JMenu();
        Ayuda = new javax.swing.JMenuItem();
        Acerca = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        Salir = new javax.swing.JMenuItem();
        Clientes = new javax.swing.JMenu();
        NuevoCliente = new javax.swing.JMenuItem();
        EditarCliente = new javax.swing.JMenuItem();
        EliminarCliente = new javax.swing.JMenuItem();
        BuscarCliente = new javax.swing.JMenuItem();
        Nomina = new javax.swing.JMenu();
        Proveedores = new javax.swing.JMenu();
        AgregarProveedor = new javax.swing.JMenuItem();
        EditarProveedor = new javax.swing.JMenuItem();
        EliminarProveedor = new javax.swing.JMenuItem();
        VerProveedor = new javax.swing.JMenuItem();
        Reportes = new javax.swing.JMenu();
        Productos = new javax.swing.JMenu();
        Nuevo = new javax.swing.JMenuItem();
        Editar = new javax.swing.JMenuItem();
        Eliminar = new javax.swing.JMenuItem();
        Ver = new javax.swing.JMenuItem();
        Administrador = new javax.swing.JMenu();
        Usuarios = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pillos Systems; v1.0");

        fecha.setForeground(new java.awt.Color(255, 255, 255));
        fecha.setText("dd/mm/yy");
        fecha.setBounds(10, 10, 180, 14);
        jDesktopPane1.add(fecha, javax.swing.JLayeredPane.DEFAULT_LAYER);

        horas.setForeground(new java.awt.Color(255, 255, 255));
        horas.setText("00:00:00");
        horas.setBounds(200, 10, 50, 14);
        jDesktopPane1.add(horas, javax.swing.JLayeredPane.DEFAULT_LAYER);

        CerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuarios.png"))); // NOI18N
        CerrarSesion.setText("Cerrar Sesión");
        CerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CerrarSesion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        CerrarSesion.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        CerrarSesion.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesionActionPerformed(evt);
            }
        });

        jLabel1.setText("Usuario Conectado:");

        usuario.setText("Usuario:");

        tools.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tools.png"))); // NOI18N
        tools.setText("Herramientas");

        Permisos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/prohibe.png"))); // NOI18N
        Permisos.setText("Permisos");
        tools.add(Permisos);

        Imprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/impresora.png"))); // NOI18N
        Imprimir.setText("Imprimir");
        tools.add(Imprimir);

        ayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ayuda.png"))); // NOI18N
        ayuda.setText("Ayuda");

        Ayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ayuda.png"))); // NOI18N
        Ayuda.setText("Ayuda");
        ayuda.add(Ayuda);

        Acerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/info.png"))); // NOI18N
        Acerca.setText("Acerca");
        Acerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcercaActionPerformed(evt);
            }
        });
        ayuda.add(Acerca);

        tools.add(ayuda);
        tools.add(jSeparator1);

        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        Salir.setText("Salir");
        tools.add(Salir);

        Menu.add(tools);

        Clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/clientes.png"))); // NOI18N
        Clientes.setText("Clientes");

        NuevoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar.png"))); // NOI18N
        NuevoCliente.setText("Nuevo");
        NuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoClienteActionPerformed(evt);
            }
        });
        Clientes.add(NuevoCliente);

        EditarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
        EditarCliente.setText("Editar");
        EditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarClienteActionPerformed(evt);
            }
        });
        Clientes.add(EditarCliente);

        EliminarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        EliminarCliente.setText("Eliminar");
        EliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarClienteActionPerformed(evt);
            }
        });
        Clientes.add(EliminarCliente);

        BuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/busca16.png"))); // NOI18N
        BuscarCliente.setText("Buscar");
        BuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarClienteActionPerformed(evt);
            }
        });
        Clientes.add(BuscarCliente);

        Menu.add(Clientes);

        Nomina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nomina.png"))); // NOI18N
        Nomina.setText("Nominá");
        Menu.add(Nomina);

        Proveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/proveedores.png"))); // NOI18N
        Proveedores.setText("Proveedores");

        AgregarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar.png"))); // NOI18N
        AgregarProveedor.setText("Agregar");
        AgregarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarProveedorActionPerformed(evt);
            }
        });
        Proveedores.add(AgregarProveedor);

        EditarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
        EditarProveedor.setText("Editar");
        EditarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarProveedorActionPerformed(evt);
            }
        });
        Proveedores.add(EditarProveedor);

        EliminarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        EliminarProveedor.setText("Eliminar");
        EliminarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarProveedorActionPerformed(evt);
            }
        });
        Proveedores.add(EliminarProveedor);

        VerProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        VerProveedor.setText("Buscar");
        VerProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerProveedorActionPerformed(evt);
            }
        });
        Proveedores.add(VerProveedor);

        Menu.add(Proveedores);

        Reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/diagrama-icono-4092-64.png"))); // NOI18N
        Reportes.setText("Reportes");
        Menu.add(Reportes);

        Productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carrito.png"))); // NOI18N
        Productos.setText("Productos");

        Nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar.png"))); // NOI18N
        Nuevo.setText("Agregar");
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoActionPerformed(evt);
            }
        });
        Productos.add(Nuevo);

        Editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
        Editar.setText("Editar");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });
        Productos.add(Editar);

        Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        Productos.add(Eliminar);

        Ver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        Ver.setText("Buscar");
        Ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerActionPerformed(evt);
            }
        });
        Productos.add(Ver);

        Menu.add(Productos);

        Administrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/adm.png"))); // NOI18N
        Administrador.setText("Administrador");

        Usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ejecuta.png"))); // NOI18N
        Usuarios.setText("Usuarios");
        Usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuariosActionPerformed(evt);
            }
        });
        Administrador.add(Usuarios);

        Menu.add(Administrador);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 656, Short.MAX_VALUE)
                .addComponent(CerrarSesion)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CerrarSesion)
                    .addComponent(jLabel1)
                    .addComponent(usuario))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesionActionPerformed
       int i = JOptionPane.showConfirmDialog(this, "¿Desea cerrar sesión?", "QUESTION", JOptionPane.YES_NO_OPTION);
       if(i==0){
           Acceso a = new Acceso();
           a.setVisible(true);
           setVisible(false);
       }
    }//GEN-LAST:event_CerrarSesionActionPerformed

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
        Productos p = new Productos(this,true);
        p.setVisible(true);
    }//GEN-LAST:event_NuevoActionPerformed

    private void VerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerActionPerformed
        EditarProducto ep = new EditarProducto(this,true);
        ep.setVisible(true);
        
    }//GEN-LAST:event_VerActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        VerProducto vp = new VerProducto(this,true);
        vp.setVisible(true);
    }//GEN-LAST:event_EditarActionPerformed

    private void AcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcercaActionPerformed
       JOptionPane.showMessageDialog(this, " * autor: José G. Gónzalez B.\n * software: Pillos Systems;\n * Fecha: Domingo 13 Abril 2014\n * Hora: 00:00 am\n * Version: 1.0.0", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_AcercaActionPerformed

    private void UsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuariosActionPerformed
        Usuarios u = new Usuarios(this,true);
        u.setVisible(true);
    }//GEN-LAST:event_UsuariosActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
         EliminarProducto ep = new  EliminarProducto(this,true);
         ep.setVisible(true);
    }//GEN-LAST:event_EliminarActionPerformed

    private void AgregarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarProveedorActionPerformed
        NuevoProveedor np = new NuevoProveedor(this,true);
        np.setVisible(true);
    }//GEN-LAST:event_AgregarProveedorActionPerformed

    private void VerProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerProveedorActionPerformed
        VerProveedor vp = new VerProveedor(this,true);
        vp.setVisible(true);
    }//GEN-LAST:event_VerProveedorActionPerformed

    private void EditarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarProveedorActionPerformed
        EditarProveedor ep = new EditarProveedor(this,true);
        ep.setVisible(true);
    }//GEN-LAST:event_EditarProveedorActionPerformed

    private void EliminarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarProveedorActionPerformed
        EliminarProveedor ep = new EliminarProveedor(this,true);
        ep.setVisible(true);
    }//GEN-LAST:event_EliminarProveedorActionPerformed

    private void NuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoClienteActionPerformed
        NuevoCliente nc = new NuevoCliente(this,true); 
        nc.setVisible(true);
    }//GEN-LAST:event_NuevoClienteActionPerformed

    private void BuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarClienteActionPerformed
        BuscarCliente bc = new BuscarCliente(this,true); 
        bc.setVisible(true);
    }//GEN-LAST:event_BuscarClienteActionPerformed

    private void EditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarClienteActionPerformed
        EditarCliente ec = new EditarCliente(this,true);
        ec.setVisible(true);
    }//GEN-LAST:event_EditarClienteActionPerformed

    private void EliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarClienteActionPerformed
        EliminarCliente elc = new EliminarCliente(this,true);
        elc.setVisible(true);
    }//GEN-LAST:event_EliminarClienteActionPerformed

    public static void main(String args[]) {
        
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
                
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Acerca;
    private javax.swing.JMenu Administrador;
    private javax.swing.JMenuItem AgregarProveedor;
    private javax.swing.JMenuItem Ayuda;
    private javax.swing.JMenuItem BuscarCliente;
    private javax.swing.JButton CerrarSesion;
    private javax.swing.JMenu Clientes;
    private javax.swing.JMenuItem Editar;
    private javax.swing.JMenuItem EditarCliente;
    private javax.swing.JMenuItem EditarProveedor;
    private javax.swing.JMenuItem Eliminar;
    private javax.swing.JMenuItem EliminarCliente;
    private javax.swing.JMenuItem EliminarProveedor;
    private javax.swing.JMenuItem Imprimir;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenu Nomina;
    private javax.swing.JMenuItem Nuevo;
    private javax.swing.JMenuItem NuevoCliente;
    private javax.swing.JMenuItem Permisos;
    private javax.swing.JMenu Productos;
    private javax.swing.JMenu Proveedores;
    private javax.swing.JMenu Reportes;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JMenuItem Usuarios;
    private javax.swing.JMenuItem Ver;
    private javax.swing.JMenuItem VerProveedor;
    private javax.swing.JMenu ayuda;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel horas;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu tools;
    public javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
