/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica24;

/**
 *
 * @author 18PUERIB0424
 */
public class FormularioInicio extends javax.swing.JFrame {

    /**
     * Creates new form FormularioInicio
     */
    public FormularioInicio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblMetros = new javax.swing.JLabel();
        txtMetros = new javax.swing.JTextField();
        lblResultadoCyM = new javax.swing.JLabel();
        txtResultado = new javax.swing.JTextField();
        panMedidasLargo = new javax.swing.JPanel();
        jrbCentimetros = new javax.swing.JRadioButton();
        jrbMilimetros = new javax.swing.JRadioButton();
        lblHoras = new javax.swing.JLabel();
        txtHoras = new javax.swing.JTextField();
        panMedidasTiempo = new javax.swing.JPanel();
        jrbMinutos = new javax.swing.JRadioButton();
        jrbSegundos = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Sylfaen", 3, 24)); // NOI18N
        lblTitulo.setText("CONVERSIONES P24");

        jLabel2.setText("A convertir");

        lblMetros.setText("Metros");

        lblResultadoCyM.setText("Resultado");

        panMedidasLargo.setBorder(javax.swing.BorderFactory.createTitledBorder("Medidas"));

        jrbCentimetros.setText("Centimetros");

        jrbMilimetros.setText("Milimetros");
        jrbMilimetros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbMilimetrosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panMedidasLargoLayout = new javax.swing.GroupLayout(panMedidasLargo);
        panMedidasLargo.setLayout(panMedidasLargoLayout);
        panMedidasLargoLayout.setHorizontalGroup(
            panMedidasLargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panMedidasLargoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panMedidasLargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbCentimetros)
                    .addComponent(jrbMilimetros))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        panMedidasLargoLayout.setVerticalGroup(
            panMedidasLargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panMedidasLargoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jrbCentimetros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jrbMilimetros)
                .addGap(15, 15, 15))
        );

        lblHoras.setText("Horas");

        panMedidasTiempo.setBorder(javax.swing.BorderFactory.createTitledBorder("Medidas"));

        jrbMinutos.setText("Minutos");

        jrbSegundos.setText("Segundos");
        jrbSegundos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbSegundosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panMedidasTiempoLayout = new javax.swing.GroupLayout(panMedidasTiempo);
        panMedidasTiempo.setLayout(panMedidasTiempoLayout);
        panMedidasTiempoLayout.setHorizontalGroup(
            panMedidasTiempoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panMedidasTiempoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panMedidasTiempoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbMinutos)
                    .addComponent(jrbSegundos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panMedidasTiempoLayout.setVerticalGroup(
            panMedidasTiempoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panMedidasTiempoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jrbMinutos)
                .addGap(18, 18, 18)
                .addComponent(jrbSegundos)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblHoras)
                                    .addComponent(txtHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(panMedidasTiempo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMetros)
                                    .addComponent(jLabel2)
                                    .addComponent(txtMetros, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(panMedidasLargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(lblResultadoCyM))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(190, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMetros)
                            .addComponent(lblResultadoCyM))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMetros, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(panMedidasLargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(lblHoras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panMedidasTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(240, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbMilimetrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbMilimetrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbMilimetrosActionPerformed

    private void jrbSegundosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbSegundosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbSegundosActionPerformed

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
            java.util.logging.Logger.getLogger(FormularioInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jrbCentimetros;
    private javax.swing.JRadioButton jrbMilimetros;
    private javax.swing.JRadioButton jrbMinutos;
    private javax.swing.JRadioButton jrbSegundos;
    private javax.swing.JLabel lblHoras;
    private javax.swing.JLabel lblMetros;
    private javax.swing.JLabel lblResultadoCyM;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panMedidasLargo;
    private javax.swing.JPanel panMedidasTiempo;
    private javax.swing.JTextField txtHoras;
    private javax.swing.JTextField txtMetros;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
