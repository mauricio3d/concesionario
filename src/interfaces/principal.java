/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mauricio 
 * @version 2.0
 */
public class principal extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
    public principal() {
        initComponents();//genera instancias
        this.setResizable(false);//limita el tamaño del frame
        this.setLocationRelativeTo(null);//centraliza el frame
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        menuprincipal = new javax.swing.JMenuBar();
        menarchivo = new javax.swing.JMenu();
        itemconfigurar = new javax.swing.JMenuItem();
        itemimprimir = new javax.swing.JMenuItem();
        itemedicion = new javax.swing.JMenuItem();
        itemsalir = new javax.swing.JMenuItem();
        mencliente = new javax.swing.JMenu();
        itemingresar = new javax.swing.JMenuItem();
        itemeditar = new javax.swing.JMenuItem();
        itemeliminar = new javax.swing.JMenuItem();
        itemconsultar = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        menordent = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menarchivo.setText("Archivos");

        itemconfigurar.setText("Configurar");
        menarchivo.add(itemconfigurar);

        itemimprimir.setText("Imprimir");
        itemimprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemimprimirActionPerformed(evt);
            }
        });
        menarchivo.add(itemimprimir);

        itemedicion.setText("Edicion");
        menarchivo.add(itemedicion);

        itemsalir.setText("Salir");
        itemsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemsalirActionPerformed(evt);
            }
        });
        menarchivo.add(itemsalir);

        menuprincipal.add(menarchivo);

        mencliente.setText("Cliente");

        itemingresar.setText("Ingresar");
        itemingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemingresarActionPerformed(evt);
            }
        });
        mencliente.add(itemingresar);

        itemeditar.setText("Editar");
        itemeditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemeditarActionPerformed(evt);
            }
        });
        mencliente.add(itemeditar);

        itemeliminar.setText("Eliminar");
        itemeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemeliminarActionPerformed(evt);
            }
        });
        mencliente.add(itemeliminar);

        itemconsultar.setText("Consultar");
        itemconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemconsultarActionPerformed(evt);
            }
        });
        mencliente.add(itemconsultar);

        jMenuItem8.setText("Consultar Todos");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        mencliente.add(jMenuItem8);

        menuprincipal.add(mencliente);

        menordent.setText("Ordenes Trabajo");

        jMenuItem3.setText("jMenuItem3");
        menordent.add(jMenuItem3);

        jMenuItem9.setText("jMenuItem9");
        menordent.add(jMenuItem9);

        jMenuItem10.setText("jMenuItem10");
        menordent.add(jMenuItem10);

        jMenuItem2.setText("jMenuItem2");
        menordent.add(jMenuItem2);

        menuprincipal.add(menordent);

        jMenu2.setText("Vehiculos");

        jMenuItem4.setText("jMenuItem4");
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("jMenuItem5");
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("jMenuItem6");
        jMenu2.add(jMenuItem6);

        jMenuItem7.setText("jMenuItem7");
        jMenu2.add(jMenuItem7);

        menuprincipal.add(jMenu2);

        setJMenuBar(menuprincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 479, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemimprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemimprimirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemimprimirActionPerformed

    private void itemeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemeliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemeliminarActionPerformed

    private void itemsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemsalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_itemsalirActionPerformed

    private void itemingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemingresarActionPerformed
        // TODO add your handling code here:
        // instancia de la clase ingresar cliente para mostrar la ventana con los componentes creados
        ingresarcliente instIngresarCliente = new ingresarcliente();
        this.add(instIngresarCliente);
        instIngresarCliente.show();
        try {
            //maxiza la ventana
            //instIngresarCliente.setMaximizable(true);
            instIngresarCliente.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_itemingresarActionPerformed

    private void itemeditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemeditarActionPerformed
        // TODO add your handling code here:
        actualizarcliente instAcutalizarCliente = new actualizarcliente();
        this.add(instAcutalizarCliente);
        instAcutalizarCliente.show();
        try {
            instAcutalizarCliente.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_itemeditarActionPerformed

    private void itemconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemconsultarActionPerformed
        // TODO add your handling code here:
        consultarcliente instConsularCliente = new consultarcliente();
        this.add(instConsularCliente);
        instConsularCliente.show();
        try {
            instConsularCliente.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_itemconsultarActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        consultartodoscliente instConsularTodosCliente = new consultartodoscliente();
        this.add(instConsularTodosCliente);
        instConsularTodosCliente.show();
        try {
            instConsularTodosCliente.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemconfigurar;
    private javax.swing.JMenuItem itemconsultar;
    private javax.swing.JMenuItem itemedicion;
    private javax.swing.JMenuItem itemeditar;
    private javax.swing.JMenuItem itemeliminar;
    private javax.swing.JMenuItem itemimprimir;
    private javax.swing.JMenuItem itemingresar;
    private javax.swing.JMenuItem itemsalir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenu menarchivo;
    private javax.swing.JMenu mencliente;
    private javax.swing.JMenu menordent;
    private javax.swing.JMenuBar menuprincipal;
    // End of variables declaration//GEN-END:variables
}