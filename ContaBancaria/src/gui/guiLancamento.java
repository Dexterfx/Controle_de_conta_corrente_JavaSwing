/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ContaCorrente;
import model.Movimento;

/**
 *
 * @author acg
 */
public class guiLancamento extends javax.swing.JFrame {

    ContaCorrente contaCorrente = new ContaCorrente();

    /**
     * Creates new form guiLancamento
     */
    public guiLancamento() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        optDeposito = new javax.swing.JRadioButton();
        optRetirada = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        btnRealizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMovimento = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtSaldoFinal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle de conta");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Operação");

        buttonGroup1.add(optDeposito);
        optDeposito.setSelected(true);
        optDeposito.setText("Depósito");

        buttonGroup1.add(optRetirada);
        optRetirada.setText("Retirada");
        optRetirada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optRetiradaActionPerformed(evt);
            }
        });

        jLabel2.setText("Valor");

        btnRealizar.setText("Realizar");
        btnRealizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarActionPerformed(evt);
            }
        });

        tblMovimento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Descrição", "valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMovimento.setFocusable(false);
        tblMovimento.setRequestFocusEnabled(false);
        tblMovimento.setRowSelectionAllowed(false);
        jScrollPane1.setViewportView(tblMovimento);

        jLabel3.setText("Saldo Final");

        txtSaldoFinal.setEditable(false);
        txtSaldoFinal.setFocusable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(optDeposito)
                                .addGap(18, 18, 18)
                                .addComponent(optRetirada))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRealizar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSaldoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(optDeposito)
                    .addComponent(optRetirada))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRealizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSaldoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRealizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarActionPerformed
        // TODO add your handling code here:
        Double v = new Double(txtValor.getText());

        if (optDeposito.isSelected()) {
            contaCorrente.depositar(v);
        } else {
            try {
                contaCorrente.retirar(v);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
                return;
            }
        }

        atualizarTela();
        txtValor.setText("");
    }//GEN-LAST:event_btnRealizarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        atualizarTela();
    }//GEN-LAST:event_formWindowOpened

    private void optRetiradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optRetiradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optRetiradaActionPerformed

    private void atualizarTela() {

        //apagando tudo na tabela
        DefaultTableModel dm = (DefaultTableModel) tblMovimento.getModel();

        while (dm.getRowCount() > 0) {
            dm.removeRow(0);
        }

        //Preenchendo a tabela
        for (int i = 0; i < contaCorrente.movimentos.size(); i++) {
            Movimento m = contaCorrente.movimentos.get(i);
            Object linha[] = {m.descricao, m.valor};
            DefaultTableModel modelo = (DefaultTableModel) tblMovimento.getModel();
            modelo.addRow(linha);
        }
        txtSaldoFinal.setText(String.valueOf(contaCorrente.saldo));
    }

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
            java.util.logging.Logger.getLogger(guiLancamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guiLancamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guiLancamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guiLancamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guiLancamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRealizar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton optDeposito;
    private javax.swing.JRadioButton optRetirada;
    private javax.swing.JTable tblMovimento;
    private javax.swing.JTextField txtSaldoFinal;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}