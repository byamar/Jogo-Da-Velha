/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import javax.swing.JOptionPane;

/**
 *
 * @author Beatriz
 */
public class JogoDaVelha extends javax.swing.JFrame {

    /**
     * Creates new form JogoDaVelha
     */
    boolean Jogador1Ativo = true;
    boolean Jogador2Ativo = false;
    
    int NumeroVitoriaJogador1 = 0;
    int NumeroVitoriaJogador2 = 0;
    int NumeroEmpates = 0;
    
    public void limparCampos(){
             b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        
        Jogador1Ativo = true;
        Jogador2Ativo = false;
    }
    
    public JogoDaVelha() {
        initComponents();
        
    }
    public void JogadorAtivo(){
        if(Jogador1Ativo == true){
            Jogador1Ativo = false;
            Jogador2Ativo = true;
        } else{
            Jogador1Ativo = true;
            Jogador2Ativo = false;
            
        }
        JogadorVencedor("X");
        JogadorVencedor("O");
    }
    
    public void JogadorVencedor(String Jogador){
       /*** Verificando linha *******/
        if(b1.getText().equals(Jogador) &&
                b2.getText().equals(Jogador) && b3.getText().equals(Jogador)){
            if(b1.getText().equals("X")) Vencedor("Jogador 1");
            else 
                Vencedor("Jogador 2");
            
        }
        
          if(b4.getText().equals(Jogador) &&
                b5.getText().equals(Jogador) && b6.getText().equals(Jogador)){
            if(b4.getText().equals("X")) Vencedor("Jogador 1");
            else 
                Vencedor("Jogador 2");
            
        }
            if(b7.getText().equals(Jogador) &&
                b8.getText().equals(Jogador) && b9.getText().equals(Jogador)){
            if(b7.getText().equals("X")) Vencedor("Jogador 1");
            else 
                Vencedor("Jogador 2");
            
        }
            /** verificando coluna****/
            
             if(b1.getText().equals(Jogador) &&
                b4.getText().equals(Jogador) && b7.getText().equals(Jogador)){
            if(b1.getText().equals("X")) Vencedor("Jogador 1");
            else 
                Vencedor("Jogador 2");
            
        }
               if(b2.getText().equals(Jogador) &&
                b5.getText().equals(Jogador) && b8.getText().equals(Jogador)){
            if(b2.getText().equals("X")) Vencedor("Jogador 1");
            else 
                Vencedor("Jogador 2");
            
        }
                 if(b3.getText().equals(Jogador) &&
                b6.getText().equals(Jogador) && b9.getText().equals(Jogador)){
            if(b3.getText().equals("X")) Vencedor("Jogador 1");
            else 
                Vencedor("Jogador 2");
            
        }
                 /***** verificando diagonal***/
                   if(b1.getText().equals(Jogador) &&
                b5.getText().equals(Jogador) && b9.getText().equals(Jogador)){
            if(b1.getText().equals("X")) Vencedor("Jogador 1");
            else 
                Vencedor("Jogador 2");
            
        }
                     if(b3.getText().equals(Jogador) &&
                b5.getText().equals(Jogador) && b7.getText().equals(Jogador)){
            if(b3.getText().equals("X")) Vencedor("Jogador 1");
            else 
                Vencedor("Jogador 2");
            
        }
                     /**** verificando empate***/
                     if(b1.getText().equals("") &&
                             !b2.getText().equals("")&&
                             !b3.getText().equals("")&&
                             !b4.getText().equals("")&&
                             !b5.getText().equals("")&&
                             !b6.getText().equals("")&&
                             !b7.getText().equals("")&&
                             !b8.getText().equals("")&&
                             !b9.getText().equals("")){
                         Vencedor("Empate");
                     }
        
    }
                     {
    }
    
    public void Vencedor (String JogadorVencedor){
        if(JogadorVencedor.equals("Jogador 1")){
            JOptionPane.showMessageDialog(null, "Parabéns boy!! Vencedor: Jogador 1");
            NumeroVitoriaJogador1++;
            numeroVitoriaJ1.setText("Número de Vitórias:" + NumeroVitoriaJogador1);
       limparCampos();
        } 
        if(JogadorVencedor.equals("Jogador 2")){
            JOptionPane.showMessageDialog(null, "Parabéns boy!! Vencedor: Jogador 2");
            NumeroVitoriaJogador2++;
            numeroVitoriaJ2.setText("Número de Vitórias: " + NumeroVitoriaJogador2 );
        limparCampos();
        }
        if(JogadorVencedor.equals("Empate")){
            JOptionPane.showMessageDialog(null, "Empatou galado");
             NumeroEmpates++;
             numeroEmpates.setText("Número de empates:" + NumeroEmpates);
        }
           
        }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        numeroVitoriaJ1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        numeroVitoriaJ2 = new javax.swing.JLabel();
        numeroEmpates = new javax.swing.JLabel();
        NovoJogo = new javax.swing.JButton();
        Sair = new javax.swing.JButton();
        labelInfo = new javax.swing.JLabel();
        labelfundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b1.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        b1.setForeground(new java.awt.Color(0, 0, 153));
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 60, 50));

        b2.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        b2.setForeground(new java.awt.Color(0, 0, 153));
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 60, 50));

        b3.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        b3.setForeground(new java.awt.Color(0, 0, 153));
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 60, 50));

        b4.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        b4.setForeground(new java.awt.Color(0, 0, 153));
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        getContentPane().add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 60, 50));

        b5.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        b5.setForeground(new java.awt.Color(0, 0, 153));
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        getContentPane().add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 60, 50));

        b6.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        b6.setForeground(new java.awt.Color(0, 0, 153));
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        getContentPane().add(b6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 60, 50));

        b7.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        b7.setForeground(new java.awt.Color(0, 0, 153));
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        getContentPane().add(b7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 60, 50));

        b8.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        b8.setForeground(new java.awt.Color(0, 0, 153));
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        getContentPane().add(b8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 60, 50));

        b9.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        b9.setForeground(new java.awt.Color(0, 0, 153));
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        getContentPane().add(b9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 60, 50));

        jLabel1.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jLabel1.setText("JOGO DA VELHA ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 240, 40));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Jogador 1 ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 64, 69, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Simbolo: x");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 72, 40));

        numeroVitoriaJ1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        numeroVitoriaJ1.setText("Número de Vitórias: ");
        getContentPane().add(numeroVitoriaJ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 160, 24));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Jogador 2 ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 128, 70, 40));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Símbolo: O");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 90, 20));

        numeroVitoriaJ2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        numeroVitoriaJ2.setText("Número de Vitórias: ");
        getContentPane().add(numeroVitoriaJ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 190, -1));

        numeroEmpates.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        numeroEmpates.setText("Número de empates: ");
        getContentPane().add(numeroEmpates, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 217, 180, 30));

        NovoJogo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NovoJogo.setText("Novo Jogo");
        NovoJogo.setMinimumSize(new java.awt.Dimension(694, 440));
        NovoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoJogoActionPerformed(evt);
            }
        });
        getContentPane().add(NovoJogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 100, -1));

        Sair.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        getContentPane().add(Sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, 100, -1));

        labelInfo.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        labelInfo.setText("INFORMAÇÕES DO JOGO");
        getContentPane().add(labelInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 14, 130, 20));

        labelfundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/Ohe9qqO.png"))); // NOI18N
        getContentPane().add(labelfundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 470, 344));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
        if(Jogador1Ativo == true){
            if(b2.getText().equals("")){
                b2.setText("X");
                JogadorAtivo();
            }
        }else{
            if(b2.getText().equals("")){
                b2.setText("0");
                JogadorAtivo();
            }}
        
    }//GEN-LAST:event_b2ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
     
        if (Jogador1Ativo){
            if(b1.getText().equals("")){
                b1.setText("X");
                JogadorAtivo();
                
            }
            
           }else{
            if(b1.getText().equals("")){
                b1.setText("O");
                JogadorAtivo();
            }
        }
        
    }//GEN-LAST:event_b1ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        if(Jogador1Ativo){
            if(b3.getText().equals("")){
                b3.setText("X");
                JogadorAtivo();
            }
        }else{
            if(b3.getText().equals("")){
                b3.setText("O");
                JogadorAtivo();
            }
        }
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
     if(Jogador1Ativo){
         if(b4.getText().equals("")){
             b4.setText("X");
             JogadorAtivo();
         }
     }else{
         if(b4.getText().equals("")){
             b4.setText("O");
             JogadorAtivo();
         }
     }
        
        
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        if(Jogador1Ativo){
            if(b5.getText().equals("")){
                b5.setText("X");
                JogadorAtivo();
            }
        }else{
            if(b5.getText().equals("")){
                b5.setText("O");
                JogadorAtivo();
            }
        }
       
          
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        if(Jogador1Ativo){
            if(b6.getText().equals("")){
             b6.setText("X");
                     JogadorAtivo();
                     
         }
        }else{
            if(b6.getText().equals("")){
                b6.setText("O");
                JogadorAtivo();
            }
        }
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
            if(Jogador1Ativo){
                if(b7.getText().equals("")){
                    b7.setText("X");
                    JogadorAtivo();
                }
            }else{
                if(b7.getText().equals("")){
                    b7.setText("O");
                    JogadorAtivo();
                }
            }
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
   if(Jogador1Ativo){
       if(b8.getText().equals("")){
           b8.setText("X");
           JogadorAtivo();
       }
   }else{
       if(b8.getText().equals("")){
           b8.setText("O");
           JogadorAtivo();
       }
   }
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
          if(Jogador1Ativo){
              if(b9.getText().equals("")){
                  b9.setText("X");
                  JogadorAtivo();
              }
          }else{
              if(b9.getText().equals("")){
                  b9.setText("O");
                  JogadorAtivo();
              }
          }
    }//GEN-LAST:event_b9ActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
       dispose();
    }//GEN-LAST:event_SairActionPerformed

    private void NovoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoJogoActionPerformed
        // TODO add your handling code here:
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        numeroVitoriaJ1.setText("Número de Vitórias: ");
        numeroVitoriaJ2.setText("Número de Vitórias: ");
        numeroEmpates.setText("Número de empates:" );
        JogadorAtivo();
    }//GEN-LAST:event_NovoJogoActionPerformed

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
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoDaVelha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NovoJogo;
    private javax.swing.JButton Sair;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel labelInfo;
    private javax.swing.JLabel labelfundo;
    private javax.swing.JLabel numeroEmpates;
    private javax.swing.JLabel numeroVitoriaJ1;
    private javax.swing.JLabel numeroVitoriaJ2;
    // End of variables declaration//GEN-END:variables
}
