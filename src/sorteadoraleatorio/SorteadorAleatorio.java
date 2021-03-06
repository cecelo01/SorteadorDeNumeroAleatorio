package sorteadoraleatorio;
public class SorteadorAleatorio extends javax.swing.JFrame {
    public SorteadorAleatorio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSValorInicial = new javax.swing.JSpinner();
        jSValorFinal = new javax.swing.JSpinner();
        jlbVariavel = new javax.swing.JLabel();
        jbtSortear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sorteador De Números");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Sorteador Aleatório");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel2.setText("Valor Inicial: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel3.setText("Valor Final: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel4.setText("Digite na caixa os valores respectivos para o sorteio.");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

        jSValorInicial.setModel(new javax.swing.SpinnerNumberModel(1, null, null, 1));
        getContentPane().add(jSValorInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 105, -1));

        jSValorFinal.setModel(new javax.swing.SpinnerNumberModel(10, null, null, 1));
        getContentPane().add(jSValorFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 105, -1));

        jlbVariavel.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jlbVariavel.setForeground(new java.awt.Color(255, 0, 51));
        jlbVariavel.setText("     ");
        getContentPane().add(jlbVariavel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jbtSortear.setText("Sortear");
        jbtSortear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSortearActionPerformed(evt);
            }
        });
        getContentPane().add(jbtSortear, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtSortearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSortearActionPerformed
        
        double aleatorio = Math.random();
        
        int sorteioAleatorio = (int) ((int) jSValorFinal.getValue() + aleatorio * ((int) jSValorInicial.getValue() - (int) jSValorFinal.getValue()));
        
        jlbVariavel.setText("O número sorteado é: "+sorteioAleatorio);

    }//GEN-LAST:event_jbtSortearActionPerformed

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
            java.util.logging.Logger.getLogger(SorteadorAleatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SorteadorAleatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SorteadorAleatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SorteadorAleatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SorteadorAleatorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSpinner jSValorFinal;
    private javax.swing.JSpinner jSValorInicial;
    private javax.swing.JButton jbtSortear;
    private javax.swing.JLabel jlbVariavel;
    // End of variables declaration//GEN-END:variables
}
