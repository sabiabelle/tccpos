package Views;
import Views.fisicaI.*;
import java.net.URL;
import java.text.DecimalFormat;

/**
 *
 * @author Sábia
 */
public class TelaCalculosEscolhaCinematica extends javax.swing.JFrame {

    DecimalFormat decimal = new DecimalFormat("0.00");

    public TelaCalculosEscolhaCinematica() {
        initComponents();
        //Tela inicia Maximizada...
        setExtendedState(MAXIMIZED_BOTH);
        //ícone do Aplicativo...
        URL url = this.getClass().getResource("../imagens/iconeefisico.png");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        estudar_estatica = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lb_voltar = new javax.swing.JLabel();
        lb_paginainicial = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pn_cinematica = new javax.swing.JPanel();
        pn_dinamica = new javax.swing.JPanel();
        lb_fhvelocidade = new javax.swing.JLabel();
        lb_fhdeslocamento = new javax.swing.JLabel();
        lb_aceleracaomedia = new javax.swing.JLabel();
        lb_velocidademedia = new javax.swing.JLabel();
        lb_FHVMovimentoVertical = new javax.swing.JLabel();
        lb_FHPFTempoMovimentoVertical = new javax.swing.JLabel();
        lb_fhpftempo = new javax.swing.JLabel();
        lb_ETorricelliMovimentoVertical = new javax.swing.JLabel();
        lb_equacaotorricelli = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();

        estudar_estatica.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        estudar_estatica.setForeground(new java.awt.Color(255, 204, 0));
        estudar_estatica.setText("Estudar +");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/funcaododeslocamento.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("êfisíco - Cinemática");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(0, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 300));

        jPanel6.setBackground(new java.awt.Color(202, 233, 255));
        jPanel6.setForeground(new java.awt.Color(51, 51, 51));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        lb_voltar.setBackground(new java.awt.Color(255, 255, 255));
        lb_voltar.setForeground(new java.awt.Color(255, 255, 255));
        lb_voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Setinha_1.png"))); // NOI18N
        lb_voltar.setToolTipText("Voltar");
        lb_voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_voltarMouseClicked(evt);
            }
        });

        lb_paginainicial.setBackground(new java.awt.Color(255, 255, 255));
        lb_paginainicial.setForeground(new java.awt.Color(255, 255, 255));
        lb_paginainicial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Casinha.png"))); // NOI18N
        lb_paginainicial.setToolTipText("Tela Inicial");
        lb_paginainicial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_paginainicialMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_paginainicial)
                .addGap(18, 18, 18)
                .addComponent(lb_voltar)
                .addGap(80, 80, 80))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_paginainicial, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
            .addComponent(lb_voltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(202, 233, 255));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/calculoescolhacinematica.png"))); // NOI18N

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logoÊ.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(412, 412, 412)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pn_cinematica.setBackground(new java.awt.Color(202, 233, 255));

        javax.swing.GroupLayout pn_cinematicaLayout = new javax.swing.GroupLayout(pn_cinematica);
        pn_cinematica.setLayout(pn_cinematicaLayout);
        pn_cinematicaLayout.setHorizontalGroup(
            pn_cinematicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pn_cinematicaLayout.setVerticalGroup(
            pn_cinematicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pn_dinamica.setBackground(new java.awt.Color(202, 233, 255));
        pn_dinamica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_dinamicaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pn_dinamicaLayout = new javax.swing.GroupLayout(pn_dinamica);
        pn_dinamica.setLayout(pn_dinamicaLayout);
        pn_dinamicaLayout.setHorizontalGroup(
            pn_dinamicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pn_dinamicaLayout.setVerticalGroup(
            pn_dinamicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lb_fhvelocidade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_fhvelocidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/funçãohorariadavelocidade_1.png"))); // NOI18N
        lb_fhvelocidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_fhvelocidadeMouseClicked(evt);
            }
        });

        lb_fhdeslocamento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_fhdeslocamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/funcaododeslocamento.png"))); // NOI18N
        lb_fhdeslocamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_fhdeslocamentoMouseClicked(evt);
            }
        });

        lb_aceleracaomedia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_aceleracaomedia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/aceleracaomedia.png"))); // NOI18N
        lb_aceleracaomedia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_aceleracaomediaMouseClicked(evt);
            }
        });

        lb_velocidademedia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_velocidademedia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/VelocidadeMedia_1.png"))); // NOI18N
        lb_velocidademedia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_velocidademediaMouseClicked(evt);
            }
        });

        lb_FHVMovimentoVertical.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_FHVMovimentoVertical.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/FHVnomovimentovertical.png"))); // NOI18N
        lb_FHVMovimentoVertical.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_FHVMovimentoVerticalMouseClicked(evt);
            }
        });

        lb_FHPFTempoMovimentoVertical.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_FHPFTempoMovimentoVertical.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/FHPFTnomovimentovertical.png"))); // NOI18N
        lb_FHPFTempoMovimentoVertical.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_FHPFTempoMovimentoVerticalMouseClicked(evt);
            }
        });

        lb_fhpftempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_fhpftempo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/FHPemfuncaodotempo.png"))); // NOI18N
        lb_fhpftempo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_fhpftempoMouseClicked(evt);
            }
        });

        lb_ETorricelliMovimentoVertical.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_ETorricelliMovimentoVertical.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ETnomovimentovertical.png"))); // NOI18N
        lb_ETorricelliMovimentoVertical.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_ETorricelliMovimentoVerticalMouseClicked(evt);
            }
        });

        lb_equacaotorricelli.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_equacaotorricelli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/equaçãodetorricelli.png"))); // NOI18N
        lb_equacaotorricelli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_equacaotorricelliMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lb_velocidademedia)
                        .addGap(18, 18, 18)
                        .addComponent(lb_fhvelocidade)
                        .addGap(18, 18, 18)
                        .addComponent(lb_FHVMovimentoVertical))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lb_aceleracaomedia)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_equacaotorricelli)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(338, 338, 338)
                                .addComponent(lb_ETorricelliMovimentoVertical))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lb_fhdeslocamento)
                        .addGap(18, 18, 18)
                        .addComponent(lb_fhpftempo)
                        .addGap(18, 18, 18)
                        .addComponent(lb_FHPFTempoMovimentoVertical)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_cinematica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pn_dinamica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(162, 162, 162))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_velocidademedia, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_fhvelocidade, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_FHVMovimentoVertical, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_fhdeslocamento, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_fhpftempo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_FHPFTempoMovimentoVertical, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pn_dinamica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pn_cinematica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(114, 114, 114))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_aceleracaomedia, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lb_equacaotorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lb_ETorricelliMovimentoVertical, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setBorderPainted(true);
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jMenu1.setText("Menu");

        jMenuItem3.setText("Iniciar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);
        jMenu1.add(jSeparator1);

        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        this.dispose();
        new TelaPrincipal().setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void pn_dinamicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_dinamicaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pn_dinamicaMouseClicked

    private void lb_velocidademediaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_velocidademediaMouseClicked
        this.dispose();
        new TelaCalculoVelocidadeMedia().setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_lb_velocidademediaMouseClicked

    private void lb_fhdeslocamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_fhdeslocamentoMouseClicked
        this.dispose();
        new TelaCalculoFHDeslocamento().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_lb_fhdeslocamentoMouseClicked

    private void lb_aceleracaomediaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_aceleracaomediaMouseClicked
        this.dispose();
        new TelaCalculoAceleracaoMedia().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_lb_aceleracaomediaMouseClicked

    private void lb_fhvelocidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_fhvelocidadeMouseClicked
        this.dispose();
        new TelaCalculoFuncaoHorariaVelocidade().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_lb_fhvelocidadeMouseClicked

    private void lb_fhpftempoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_fhpftempoMouseClicked
        this.dispose();
        new TelaCalculoFuncaoHPFTempo().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_lb_fhpftempoMouseClicked

    private void lb_equacaotorricelliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_equacaotorricelliMouseClicked
        this.dispose();
        new TelaCalculoEquacaoTorricelli().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_lb_equacaotorricelliMouseClicked

    private void lb_FHVMovimentoVerticalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_FHVMovimentoVerticalMouseClicked
        this.dispose();
        new TelaCalculoFHVMovimentoVertical().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_lb_FHVMovimentoVerticalMouseClicked

    private void lb_FHPFTempoMovimentoVerticalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_FHPFTempoMovimentoVerticalMouseClicked
        this.dispose();
        new TelaCalculoFHPFTempoMovimentoVertical().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_lb_FHPFTempoMovimentoVerticalMouseClicked

    private void lb_ETorricelliMovimentoVerticalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_ETorricelliMovimentoVerticalMouseClicked
        this.dispose();
        new TelaCalculoEquacaoTorricelliMovimentoVertical().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_lb_ETorricelliMovimentoVerticalMouseClicked

    private void lb_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_voltarMouseClicked
        this.dispose();
        new TelaCalculosEscolha().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_lb_voltarMouseClicked

    private void lb_paginainicialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_paginainicialMouseClicked
        this.dispose();
        new TelaPrincipal().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_lb_paginainicialMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCalculosEscolhaCinematica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel estudar_estatica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lb_ETorricelliMovimentoVertical;
    private javax.swing.JLabel lb_FHPFTempoMovimentoVertical;
    private javax.swing.JLabel lb_FHVMovimentoVertical;
    private javax.swing.JLabel lb_aceleracaomedia;
    private javax.swing.JLabel lb_equacaotorricelli;
    private javax.swing.JLabel lb_fhdeslocamento;
    private javax.swing.JLabel lb_fhpftempo;
    private javax.swing.JLabel lb_fhvelocidade;
    private javax.swing.JLabel lb_paginainicial;
    private javax.swing.JLabel lb_velocidademedia;
    private javax.swing.JLabel lb_voltar;
    private javax.swing.JPanel pn_cinematica;
    private javax.swing.JPanel pn_dinamica;
    // End of variables declaration//GEN-END:variables

}
