
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author gabriel.machado4
 */
public class ConversorTemperaturaCorreto extends javax.swing.JFrame {

    /**
     * Creates new form ConversorTemperaturaCorreto
     */
    public ConversorTemperaturaCorreto() {
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

        txtTemperatura = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cmbEscalasTemperatura = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cmbEscalasTemperaturaConverter = new javax.swing.JComboBox<>();
        btnCalcular = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtTemperatura.setToolTipText("Digite a temperatura");

        jLabel1.setText("Temperatura:");

        cmbEscalasTemperatura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kelvin", "Celsius", "Fahrenheit" }));
        cmbEscalasTemperatura.setSelectedIndex(-1);

        jLabel2.setText("Converter Temperatura para:");

        cmbEscalasTemperaturaConverter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kelvin", "Celsius", "Fahrenheit" }));
        cmbEscalasTemperaturaConverter.setSelectedIndex(-1);

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jLabel3.setText("Resultado:");

        txtResultado.setText("Temperatura");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))
                    .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbEscalasTemperaturaConverter, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(cmbEscalasTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbEscalasTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbEscalasTemperaturaConverter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(btnCalcular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtResultado))
                .addGap(63, 63, 63))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:

        if(txtTemperatura.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this, "Temperatura em branco");
        } else{
            double temperatura = Double.parseDouble(txtTemperatura.getText());
            double resultado;
            if(cmbEscalasTemperatura.getSelectedIndex()==-1 || cmbEscalasTemperaturaConverter.getSelectedIndex()==-1){
                JOptionPane.showMessageDialog(this, "Seleciono ambas as escalas de temperatura");
            }if(cmbEscalasTemperatura.getSelectedIndex() == cmbEscalasTemperaturaConverter.getSelectedIndex()){
                JOptionPane.showMessageDialog(this, "As escalas não podem ser iguais");
            }else{
                if(cmbEscalasTemperatura.getSelectedIndex()== 0 && cmbEscalasTemperaturaConverter.getSelectedIndex() == 1){
                    resultado = temperatura -273;
                    txtResultado.setText(resultado + " Celsius");
                }
                if(cmbEscalasTemperatura.getSelectedIndex()== 0 && cmbEscalasTemperaturaConverter.getSelectedIndex() == 2){
                    resultado = (temperatura -273)*1.8+32;
                    txtResultado.setText(resultado + " Fahrenheit");
                }

                if(cmbEscalasTemperatura.getSelectedIndex()== 1 && cmbEscalasTemperaturaConverter.getSelectedIndex() == 0){
                    resultado = temperatura +273;
                    txtResultado.setText(resultado + " Kelvin");
                }
                if(cmbEscalasTemperatura.getSelectedIndex()== 1 && cmbEscalasTemperaturaConverter.getSelectedIndex() == 2){
                    resultado = temperatura*1.8+32;
                    txtResultado.setText(resultado + " Fahrenheit");
                }

                if(cmbEscalasTemperatura.getSelectedIndex()== 2 && cmbEscalasTemperaturaConverter.getSelectedIndex() == 0){
                    resultado = (temperatura -32)*(5/9)+273;
                    txtResultado.setText(resultado + " Kelvin");
                }
                if(cmbEscalasTemperatura.getSelectedIndex()== 2 && cmbEscalasTemperaturaConverter.getSelectedIndex() == 1){
                    resultado = (temperatura -32)/1.8;
                    txtResultado.setText(resultado + " Celsius");
                }
            }
        }

    }//GEN-LAST:event_btnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(ConversorTemperaturaCorreto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConversorTemperaturaCorreto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConversorTemperaturaCorreto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConversorTemperaturaCorreto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConversorTemperaturaCorreto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JComboBox<String> cmbEscalasTemperatura;
    private javax.swing.JComboBox<String> cmbEscalasTemperaturaConverter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel txtResultado;
    private javax.swing.JTextField txtTemperatura;
    // End of variables declaration//GEN-END:variables
}