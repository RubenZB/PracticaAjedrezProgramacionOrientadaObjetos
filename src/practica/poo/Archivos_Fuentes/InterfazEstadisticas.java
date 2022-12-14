/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.poo.pkgfinal;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;

public class InterfazEstadisticas extends javax.swing.JFrame {

    private AlmacenLogin aUsuario = new AlmacenLogin();
    private AlmacenProblemas aProblemas = new AlmacenProblemas();
    private int indice;

    /**
     * Creates new form InterfazEstadisticas
     */
    public InterfazEstadisticas(AlmacenLogin a, AlmacenProblemas p, int i) {
        initComponents();
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        aUsuario = a;
        aProblemas = p;
        indice = i;
        problema.setModel(new DefaultComboBoxModel(aProblemas.problemasGuardados()));
        user.setModel(new DefaultComboBoxModel(aUsuario.solucionadoPro(aUsuario.solucionado(Integer.parseInt(this.problema.getSelectedItem().toString())))));
        int elegido = Integer.parseInt(this.problema.getSelectedItem().toString()) - 1;
        vecesResuelto.setText(Integer.toString(aProblemas.getProblemas().get(elegido).getVecesResuelto()));
        porcentaje.setText(Double.toString(aProblemas.getProblemas().get(elegido).getPorcentajeExito()));
        this.setLocationRelativeTo(null);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("iconocaballo.jpg"));
        this.getContentPane().setBackground(new Color(144, 164, 174));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        problema = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        EstadisticasUsuario = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        vecesResuelto = new javax.swing.JLabel();
        porcentaje = new javax.swing.JLabel();
        user = new javax.swing.JComboBox<>();
        Jugar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        problema.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        problema.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                problemaItemStateChanged(evt);
            }
        });
        problema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                problemaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Estadisticas de Problemas");

        jLabel2.setText("Selecciona un problema:");

        EstadisticasUsuario.setText("Ver Estad??sticas Usuario actual");
        EstadisticasUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EstadisticasUsuarioMouseClicked(evt);
            }
        });
        EstadisticasUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstadisticasUsuarioActionPerformed(evt);
            }
        });

        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Veces Resuelto:");

        jLabel4.setText("Porcentaje de Exito:");

        jLabel5.setText("Usuarios que lo han resuelto:");

        user.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });

        Jugar.setText("Jugar Problema actual");
        Jugar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JugarMouseClicked(evt);
            }
        });
        Jugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JugarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(135, 135, 135)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(problema, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(vecesResuelto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(porcentaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addComponent(jButton2)
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Jugar, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EstadisticasUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(problema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                    .addComponent(vecesResuelto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(porcentaje, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jugar)
                    .addComponent(EstadisticasUsuario))
                .addGap(58, 58, 58)
                .addComponent(jButton2)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new InterfazOpciones(aUsuario, aProblemas, indice).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void problemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_problemaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_problemaActionPerformed

    private void problemaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_problemaItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            user.setModel(new DefaultComboBoxModel(aUsuario.solucionadoPro(aUsuario.solucionado(Integer.parseInt(this.problema.getSelectedItem().toString())))));
            int elegido = Integer.parseInt(this.problema.getSelectedItem().toString()) - 1;
            vecesResuelto.setText(Integer.toString(aProblemas.getProblemas().get(elegido).getVecesResuelto()));
            porcentaje.setText(Double.toString(aProblemas.getProblemas().get(elegido).getPorcentajeExito()));
        }

    }//GEN-LAST:event_problemaItemStateChanged

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void JugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JugarActionPerformed

    }//GEN-LAST:event_JugarActionPerformed

    private void EstadisticasUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstadisticasUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EstadisticasUsuarioActionPerformed

    private void JugarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JugarMouseClicked
        int nivel = (Integer.parseInt(this.problema.getSelectedItem().toString())) - 1;
        try {
            new InterfazTablero(aUsuario, aProblemas, indice, nivel).setVisible(true);
        } catch (MiExcepcion ex) {
            Logger.getLogger(InterfazEstadisticas.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
    }//GEN-LAST:event_JugarMouseClicked

    private void EstadisticasUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EstadisticasUsuarioMouseClicked
        String nombre = this.user.getSelectedItem().toString();
        int ind = this.aUsuario.buscarUsuarioXnombre(nombre);
        new InterfazPersonales(aUsuario, aProblemas, indice, ind).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_EstadisticasUsuarioMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        aProblemas.hacerBackUp();
        aUsuario.hacerBackUp();
        System.exit(0);
    }//GEN-LAST:event_formWindowClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EstadisticasUsuario;
    private javax.swing.JButton Jugar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel porcentaje;
    private javax.swing.JComboBox<String> problema;
    private javax.swing.JComboBox<String> user;
    private javax.swing.JLabel vecesResuelto;
    // End of variables declaration//GEN-END:variables
}
