package Ventanas;


public class VentanaOP extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaOP.class.getName());

    public VentanaOP() {
        initComponents();
        ocultarComponentes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        EspCel = new javax.swing.JTextField();
        BtnF = new javax.swing.JButton();
        BtnK = new javax.swing.JButton();
        BtnOpciones = new javax.swing.JButton();
        Resultado = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        LabelMostrarOp = new javax.swing.JLabel();
        BtnBorrar = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Convertidor de temperaturas");

        jLabel2.setText("Ingrese la temperatura(celsius):");

        EspCel.addActionListener(this::EspCelActionPerformed);

        BtnF.setBackground(new java.awt.Color(0, 153, 153));
        BtnF.setText("fahrenheit");
        BtnF.addActionListener(this::BtnFActionPerformed);

        BtnK.setBackground(new java.awt.Color(255, 255, 51));
        BtnK.setText("Kelvin");
        BtnK.addActionListener(this::BtnKActionPerformed);

        BtnOpciones.setBackground(new java.awt.Color(102, 255, 255));
        BtnOpciones.setText("Mostrar opciones de conversion");
        BtnOpciones.addActionListener(this::BtnOpcionesActionPerformed);

        LabelMostrarOp.setText("Las opciones de conversion son:");

        BtnBorrar.setBackground(new java.awt.Color(255, 0, 51));
        BtnBorrar.setText("Borrar");
        BtnBorrar.addActionListener(this::BtnBorrarActionPerformed);

        BtnSalir.setText("Salir");
        BtnSalir.addActionListener(this::BtnSalirActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(LabelMostrarOp)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnSalir)
                                .addGap(12, 12, 12))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BtnF)
                                        .addGap(73, 73, 73)
                                        .addComponent(BtnK))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BtnOpciones)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(EspCel, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 30, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(BtnBorrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(BtnSalir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(EspCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnOpciones)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelMostrarOp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnF)
                    .addComponent(BtnK))
                .addGap(32, 32, 32)
                .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(BtnBorrar)
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EspCelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EspCelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EspCelActionPerformed

    private void BtnFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFActionPerformed
       String Cantidad=EspCel.getText();
       
       double cantidad=Double.parseDouble(Cantidad);
       
       double resultado=(1.8*cantidad)+32;
       
       Resultado.setText("El resultado es "+resultado+"°F");
    }//GEN-LAST:event_BtnFActionPerformed

    private void BtnOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnOpcionesActionPerformed
      
        String Cantidad= EspCel.getText();
      
        if(Cantidad.isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(this,"Debe de ingresar un valor");
            return;
        } 
        
        
        try{
            
            double cantidad = Double.parseDouble(Cantidad);
            mostrarComponentes();
            
        } catch(NumberFormatException e){
            System.out.println("Errior al ingresar los datos");
            javax.swing.JOptionPane.showMessageDialog(this,"El valor debe de ser un numero");
        }
    }//GEN-LAST:event_BtnOpcionesActionPerformed

    private void BtnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBorrarActionPerformed
        ocultarComponentes();
    }//GEN-LAST:event_BtnBorrarActionPerformed

    private void BtnKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnKActionPerformed
        String Cantidad = EspCel.getText();
        
        double cantidad = Double.parseDouble(Cantidad);
        
        double resultado = cantidad+273.15;
        
        Resultado.setText("El resultado es "+resultado+"K");
    }//GEN-LAST:event_BtnKActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnSalirActionPerformed

  
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(() -> new VentanaOP().setVisible(true));
    }
    
    
    public void ocultarComponentes(){
    LabelMostrarOp.setVisible(false);
    BtnF.setVisible(false);
    BtnK.setVisible(false);
    BtnBorrar.setVisible(false);
    Resultado.setVisible(false);
    
    EspCel.setEditable(true);
    Resultado.setText("");
    }
    
    public void mostrarComponentes(){
    LabelMostrarOp.setVisible(true);
    BtnF.setVisible(true);
    BtnK.setVisible(true);
    BtnBorrar.setVisible(true);
    Resultado.setVisible(true);
    
    EspCel.setEditable(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBorrar;
    private javax.swing.JButton BtnF;
    private javax.swing.JButton BtnK;
    private javax.swing.JButton BtnOpciones;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JTextField EspCel;
    private javax.swing.JLabel LabelMostrarOp;
    private javax.swing.JLabel Resultado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
