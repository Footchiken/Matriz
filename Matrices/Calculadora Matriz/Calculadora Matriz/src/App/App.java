
package App;

import Package.Escalar;


public class App extends javax.swing.JFrame {


    public App() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDeterminante = new javax.swing.JButton();
        btnSumaRestaMultiplicación = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnDeterminante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDeterminante.setText("Determinante");
        btnDeterminante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeterminanteActionPerformed(evt);
            }
        });

        btnSumaRestaMultiplicación.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSumaRestaMultiplicación.setText("Suma,resta,multiplicacion");
        btnSumaRestaMultiplicación.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaRestaMultiplicaciónActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Seleccione una opción:");
        jLabel1.addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
                jLabel1AncestorMoved(evt);
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDeterminante, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnSumaRestaMultiplicación, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(btnDeterminante, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSumaRestaMultiplicación, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeterminanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeterminanteActionPerformed
        Determinante i = new Determinante();
i.setLocationRelativeTo(null);
i.setVisible(true);
    }//GEN-LAST:event_btnDeterminanteActionPerformed

    private void btnSumaRestaMultiplicaciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaRestaMultiplicaciónActionPerformed
        Multiplicacion i = new Multiplicacion();
i.setLocationRelativeTo(null);
i.setVisible(true);
    }//GEN-LAST:event_btnSumaRestaMultiplicaciónActionPerformed

    private void jLabel1AncestorMoved(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_jLabel1AncestorMoved
        
    }//GEN-LAST:event_jLabel1AncestorMoved


    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeterminante;
    private javax.swing.JButton btnSumaRestaMultiplicación;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
