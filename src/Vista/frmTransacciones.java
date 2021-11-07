package Vista;
import Reglas.CuentaAhorros;
import Reglas.CuentaCorriente;
import java.util.Calendar;

public class frmTransacciones extends javax.swing.JFrame {
    CuentaCorriente ctaCrr = new CuentaCorriente();
    CuentaAhorros ctaAhr = new CuentaAhorros();
    Calendar fecha = Calendar.getInstance();
    public frmTransacciones() {
        initComponents();
        this.setLocationRelativeTo(null);
        setSize(600, 400);
        setResizable(false); 
        txtValor.setText("0");
        txtHst2.setText("0");
        txtHst2.setEditable(false);
           txtHst2.setEnabled(false);
            txtValor.setEnabled(false);
            TipoTrans.setEnabled(false);
            btnReTrans.setEnabled(false);
            btnConsultar.setEnabled(false);
            btnLmp.setEnabled(false);
            txtHst2.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        txtValor = new javax.swing.JTextField();
        btnReTrans = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtHst2 = new javax.swing.JTextArea();
        btnConsultar = new javax.swing.JButton();
        btnLmp = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        TipoTrans = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        TipoCuenta = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        txtValor.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });
        txtValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorKeyTyped(evt);
            }
        });
        getContentPane().add(txtValor);
        txtValor.setBounds(310, 110, 120, 25);

        btnReTrans.setBackground(new java.awt.Color(0, 51, 153));
        btnReTrans.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnReTrans.setForeground(new java.awt.Color(255, 255, 255));
        btnReTrans.setText("Continuar");
        btnReTrans.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReTransMouseClicked(evt);
            }
        });
        btnReTrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReTransActionPerformed(evt);
            }
        });
        getContentPane().add(btnReTrans);
        btnReTrans.setBounds(440, 110, 100, 30);

        txtHst2.setColumns(20);
        txtHst2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtHst2.setRows(5);
        txtHst2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtHst2PropertyChange(evt);
            }
        });
        jScrollPane3.setViewportView(txtHst2);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(40, 160, 470, 90);

        btnConsultar.setBackground(new java.awt.Color(0, 51, 255));
        btnConsultar.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultar.setText("Consultar");
        btnConsultar.setToolTipText("");
        btnConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConsultarMouseClicked(evt);
            }
        });
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultar);
        btnConsultar.setBounds(110, 270, 110, 30);

        btnLmp.setBackground(new java.awt.Color(0, 0, 204));
        btnLmp.setForeground(new java.awt.Color(255, 255, 255));
        btnLmp.setText("Limpiar");
        btnLmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLmpMouseClicked(evt);
            }
        });
        btnLmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLmpActionPerformed(evt);
            }
        });
        getContentPane().add(btnLmp);
        btnLmp.setBounds(350, 270, 79, 30);

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Book", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("Tipo de Cuenta");
        jLabel7.setMaximumSize(new java.awt.Dimension(224, 100));
        getContentPane().add(jLabel7);
        jLabel7.setBounds(90, 50, 120, 40);

        TipoTrans.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Consignar", "Retirar" }));
        TipoTrans.setName(""); // NOI18N
        TipoTrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoTransActionPerformed(evt);
            }
        });
        getContentPane().add(TipoTrans);
        TipoTrans.setBounds(120, 110, 120, 20);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Valor : ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(250, 110, 60, 20);
        getContentPane().add(jPanel2);
        jPanel2.setBounds(340, 190, 40, 40);

        TipoCuenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Corriente", "Ahorro" }));
        TipoCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TipoCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoCuentaActionPerformed(evt);
            }
        });
        getContentPane().add(TipoCuenta);
        TipoCuenta.setBounds(250, 60, 120, 20);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Tipo de transacción : ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-10, 110, 130, 20);

        jLabel8.setFont(new java.awt.Font("Franklin Gothic Book", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(50, 100, 10));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("CAJERO VIRTUAL");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 10, 510, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReTransMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReTransMouseClicked
        //------Se crea La fecha del movimiento-------
        String fechaA=fecha.get(Calendar.YEAR)+"/"+fecha.get(Calendar.MONTH)+"/"+fecha.get(Calendar.DAY_OF_MONTH)+" "
                        + fecha.get(Calendar.HOUR_OF_DAY)+":"+fecha.get(Calendar.MINUTE)+":"+fecha.get(Calendar.SECOND);
        
        //PROCESAMIENTO PARA CUENTA DE AHORRO
        if(TipoCuenta.getSelectedItem().equals("Ahorro")){
            if(TipoTrans.getSelectedItem().equals("Consignar")) //CONSIGNACIÓN
            {
                txtHst2.setText("Tipo de Cuenta: "+TipoCuenta.getSelectedItem()+"\n"
                            + "Tipo de Transacción: "+TipoTrans.getSelectedItem());
                
                if(Double.parseDouble(txtValor.getText())>0){//Verifica el valor a Consignar   
                    ctaAhr.depositar(Double.parseDouble(txtValor.getText()));
                    txtHst2.setText(txtHst2.getText()+ "\n"
                            +"Deposito: " + txtValor.getText() 
                            +"\n"+ "Balance:\n$ "+ctaAhr.getBalance()+"\n"
                            +"Fecha: "+fechaA);
                }else{
                    txtHst2.setText(txtHst2.getText()+ "\n"
                            +"El valor a consignar debe \nser mayor a cero.");
                }
            }else if(TipoTrans.getSelectedItem().toString().equals("Retirar")){ //RETIRAR
                txtHst2.setText("Tipo de Cuenta: "+TipoCuenta.getSelectedItem()+"\n"
                        + "Tipo de Transacción: "+TipoTrans.getSelectedItem());
                
                if (Double.parseDouble(txtValor.getText())<=ctaAhr.getBalance()) {//Verifica el valñor a Retirar
                    ctaAhr.retirar(Double.parseDouble(txtValor.getText()));
                    txtHst2.setText(txtHst2.getText()+ "\n"
                            +"Retiro: " + txtValor.getText()  
                            +"\n"+ "Balance: \n$ "+ctaAhr.getBalance()+"\n"
                            +"Fecha: "+fechaA);
                }else{
                    txtHst2.setText(txtHst2.getText()+ "\n"
                            + "No tienes los fondos suficientes\n"
                            + "para hacer el retiro de:\n$ "+txtValor.getText());
                }
            }
         
            
        // PROCESAMIENTO PARA CUENTA CORRIENTE
        }else if(TipoCuenta.getSelectedItem().equals("Corriente")){
        if(TipoTrans.getSelectedItem().equals("Consignar")){ //CONSIGNAR
                txtHst2.setText("Tipo de Cuenta: "+TipoCuenta.getSelectedItem()+"\n"
                            + "Tipo de Transacción: "+TipoTrans.getSelectedItem());
                
                if(Double.parseDouble(txtValor.getText())>0){//Verifica el valor a Consignar   
                    ctaCrr.depositar(Double.parseDouble(txtValor.getText()));
                    txtHst2.setText(txtHst2.getText()+ "\n"
                            +"Deposito: " + txtValor.getText() 
                            +"\n"+ "Balance:\n$ "+ctaCrr.getBalance()+"\n"
                            +"Fecha: "+fechaA);
                }else{
                    
                    txtHst2.setText(txtHst2.getText()+ "\n"
                            +"El valor a consignar debe \nser mayor a cero.");
                }
            }else if(TipoTrans.getSelectedItem().toString().equals("Retirar")){ //RETIRAR
                txtHst2.setText("Tipo de Cuenta: "+TipoCuenta.getSelectedItem()+"\n"
                        + "Tipo de Transacción: "+TipoTrans.getSelectedItem());
                
                double tope = -100000;
                double resto;
                resto = ctaCrr.getBalance() - Double.parseDouble(txtValor.getText());
               
                if (resto>=tope) {//Verifica el valñor a Retirar
                    
                     ctaCrr.retirar(-1*resto);
                    
                    txtHst2.setText(txtHst2.getText()+ "\n"
                            +"Retiro: " + txtValor.getText()  
                            +"\n"+ "Balance: \n$ "+ctaCrr.getBalance()+"\n"
                            +"Fecha: "+fechaA);
                    
                  
                }else{
                    txtHst2.setText(txtHst2.getText()+ "\n"
                            + "Excedes el cupo de $100.000\n"
                            + "para hacer el retiro de:\n$ "+txtValor.getText());
                }
            }
            
        }
        txtValor.setText("0");
        
    }//GEN-LAST:event_btnReTransMouseClicked

    private void btnConsultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarMouseClicked
        if (!txtHst2.getText().isEmpty()) {
            if(TipoCuenta.getSelectedItem().equals("Ahorro")){//Según el tipo de cuenta se entregará el balance.
                txtHst2.setText("Balance de cuenta: \n $"+String.valueOf(ctaAhr.getBalance()));
                
            }else if(TipoCuenta.getSelectedItem().equals("Corriente")){
                txtHst2.setText("Balance de cuenta: \n $"+String.valueOf(ctaCrr.getBalance()));
            }else{
                txtHst2.setText("Debe Seleccionar el tipo de cuenta \n"
                        + "del que se desea ver el balance.");
            }
        }
    }//GEN-LAST:event_btnConsultarMouseClicked

    private void btnLmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLmpMouseClicked
        txtValor.setText("0");
        txtHst2.setText("0");
        TipoTrans.setSelectedItem("Seleccionar");
        TipoCuenta.setSelectedItem("Seleccionar");
    }//GEN-LAST:event_btnLmpMouseClicked

    private void btnLmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLmpActionPerformed

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtValorActionPerformed

    private void TipoTransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoTransActionPerformed
        txtValor.setText("0");
        
    }//GEN-LAST:event_TipoTransActionPerformed

    private void btnReTransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReTransActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReTransActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void TipoCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoCuentaActionPerformed
        // TODO add your handling code here:
        txtValor.setText("0");
        
         
            
        
        if(TipoCuenta.getSelectedItem().equals("Seleccionar")){
            txtHst2.setEnabled(false);
            txtValor.setEnabled(false);
            TipoTrans.setEnabled(false);
            btnReTrans.setEnabled(false);
            btnConsultar.setEnabled(false);
             btnLmp.setEnabled(false);
            txtHst2.setText("");
        }
        else{
        
        if(TipoCuenta.getSelectedItem().equals("Corriente")){
            txtHst2.setEnabled(true);
            txtValor.setEnabled(true);
            btnReTrans.setEnabled(true);
            btnConsultar.setEnabled(true);
            TipoTrans.setEnabled(true);
             btnLmp.setEnabled(true);
            txtHst2.setText("Bienvenido a cuenta corriente");
        }else{
            txtHst2.setEnabled(true);
            txtHst2.setText("Bienvenido a cuenta ahorro");
            txtValor.setEnabled(true);
            TipoTrans.setEnabled(true);
            btnReTrans.setEnabled(true);
            btnLmp.setEnabled(true);
            btnConsultar.setEnabled(true);
        }
        }
        
        
    }//GEN-LAST:event_TipoCuentaActionPerformed

    private void txtValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        if((car<'0' || car>'9') && (car<',' || car>'.')) evt.consume();
    }//GEN-LAST:event_txtValorKeyTyped

    private void txtHst2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtHst2PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHst2PropertyChange
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
            java.util.logging.Logger.getLogger(frmTransacciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTransacciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTransacciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTransacciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTransacciones().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> TipoCuenta;
    private javax.swing.JComboBox<String> TipoTrans;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnLmp;
    private javax.swing.JButton btnReTrans;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea txtHst2;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
