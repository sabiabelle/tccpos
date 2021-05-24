package Views.fisicaII;

import Class.*;
import Views.*;
import java.net.URL;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Sábia
 */
public class TelaCalculoAtrito extends javax.swing.JFrame {

    CalculoDinamicaClass calculoDinamicaClass = new CalculoDinamicaClass();
    DecimalFormat decimal = new DecimalFormat("0.00");

    public TelaCalculoAtrito() {
        initComponents();

        //Tela inicia Maximizada...
        setExtendedState(MAXIMIZED_BOTH);
        //ícone do Aplicativo...
        URL url = this.getClass().getResource("../imagens/iconeefisico.png");
        limpar();
        tf_aceleracao.setEnabled(false);
        tf_massa.setEnabled(false);
        tf_forca.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        estudar_estatica = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lb_calcular = new javax.swing.JLabel();
        lb_limpar = new javax.swing.JLabel();
        lb_voltar = new javax.swing.JLabel();
        lb_paginainicial = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pn_cinematica = new javax.swing.JPanel();
        pn_dinamica = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        rd_forca = new javax.swing.JRadioButton();
        rd_massa = new javax.swing.JRadioButton();
        rd_aceleracao = new javax.swing.JRadioButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tf_aceleracao = new javax.swing.JTextField();
        tf_massa = new javax.swing.JTextField();
        tf_forca = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lb_resultFinal = new javax.swing.JLabel();
        lb_result1 = new javax.swing.JLabel();
        lb_result = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
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

        lb_calcular.setBackground(new java.awt.Color(255, 255, 255));
        lb_calcular.setForeground(new java.awt.Color(255, 255, 255));
        lb_calcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/btncalculo_1.png"))); // NOI18N
        lb_calcular.setToolTipText("Calcular");
        lb_calcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_calcularMouseClicked(evt);
            }
        });

        lb_limpar.setBackground(new java.awt.Color(255, 255, 255));
        lb_limpar.setForeground(new java.awt.Color(255, 255, 255));
        lb_limpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/varredra.png"))); // NOI18N
        lb_limpar.setToolTipText("limpar");
        lb_limpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_limparMouseClicked(evt);
            }
        });

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
                .addComponent(lb_calcular)
                .addGap(22, 22, 22)
                .addComponent(lb_limpar)
                .addGap(18, 18, 18)
                .addComponent(lb_voltar)
                .addGap(92, 92, 92))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_voltar, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
            .addComponent(lb_limpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lb_paginainicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lb_calcular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(202, 233, 255));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/11.png"))); // NOI18N

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logoÊ.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(381, 381, 381)
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

        jPanel5.setBackground(new java.awt.Color(202, 233, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Calcular", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 0, 24))); // NOI18N

        jPanel10.setBackground(new java.awt.Color(202, 233, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Marque a opção que deseja calcular", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 0, 18))); // NOI18N

        rd_forca.setBackground(new java.awt.Color(202, 233, 255));
        rd_forca.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        rd_forca.setText("Força");
        rd_forca.setBorder(null);
        rd_forca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rd_forcaMouseClicked(evt);
            }
        });
        rd_forca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd_forcaActionPerformed(evt);
            }
        });

        rd_massa.setBackground(new java.awt.Color(202, 233, 255));
        rd_massa.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        rd_massa.setText("Coeficiente de Atrito");
        rd_massa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rd_massaMouseClicked(evt);
            }
        });
        rd_massa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd_massaActionPerformed(evt);
            }
        });

        rd_aceleracao.setBackground(new java.awt.Color(202, 233, 255));
        rd_aceleracao.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        rd_aceleracao.setText("Força Normal");
        rd_aceleracao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rd_aceleracaoMouseClicked(evt);
            }
        });
        rd_aceleracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd_aceleracaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(rd_forca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rd_massa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rd_aceleracao)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rd_forca)
                    .addComponent(rd_massa)
                    .addComponent(rd_aceleracao))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(202, 233, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 0, 18))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel8.setText("u:");
        jLabel8.setToolTipText("Velocidade Final");

        jLabel13.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel13.setText("N:");
        jLabel13.setToolTipText("Posição Inicial");

        tf_aceleracao.setBackground(new java.awt.Color(202, 233, 255));
        tf_aceleracao.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        tf_aceleracao.setToolTipText("Espaço Inicial");
        tf_aceleracao.setName("Espaço Inicial"); // NOI18N
        tf_aceleracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_aceleracaoActionPerformed(evt);
            }
        });

        tf_massa.setBackground(new java.awt.Color(202, 233, 255));
        tf_massa.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        tf_massa.setToolTipText("Velocidade Final");
        tf_massa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_massaActionPerformed(evt);
            }
        });

        tf_forca.setBackground(new java.awt.Color(202, 233, 255));
        tf_forca.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        tf_forca.setToolTipText("Velocidade Inicial");
        tf_forca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_forcaActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel17.setText("F:");
        jLabel17.setToolTipText("Velocidade Inicial");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(tf_aceleracao, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_forca)
                            .addComponent(tf_massa))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(tf_forca, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_massa, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_aceleracao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(202, 233, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 0, 24))); // NOI18N

        lb_resultFinal.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lb_resultFinal.setText("F=");

        lb_result1.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lb_result1.setText("F= ");

        lb_result.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lb_result.setText("Fat = u * N");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lb_resultFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_result1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_result, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(210, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lb_result, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(lb_result1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lb_resultFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/5 formula.png"))); // NOI18N

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/6 formula.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(183, 183, 183)
                .addComponent(pn_cinematica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_dinamica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(383, 383, 383)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pn_dinamica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pn_cinematica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
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

    private void rd_forcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rd_forcaMouseClicked
        limpar();
        rd_aceleracao.setSelected(false);
        rd_massa.setSelected(false);
        
    }//GEN-LAST:event_rd_forcaMouseClicked

    private void rd_forcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_forcaActionPerformed
        rd_aceleracao.setSelected(false);
        rd_massa.setSelected(false);
        tf_aceleracao.setEnabled(true);
        tf_massa.setEnabled(true);
        tf_forca.setEnabled(false);
        tf_massa.setText("");
        tf_aceleracao.setText("");
        tf_forca.setText("");
    }//GEN-LAST:event_rd_forcaActionPerformed

    private void rd_massaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rd_massaMouseClicked
        limpar();
        lb_result.setText("u = F/N");
        lb_result1.setText("u = ");
        lb_resultFinal.setText("u = ");
        rd_aceleracao.setSelected(false);
        rd_forca.setSelected(false);
    }//GEN-LAST:event_rd_massaMouseClicked

    private void rd_massaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_massaActionPerformed
        rd_aceleracao.setSelected(false);
        rd_forca.setSelected(false);
        tf_aceleracao.setEnabled(true);
        tf_massa.setEnabled(false);
        tf_forca.setEnabled(true);
        tf_massa.setText("");
        tf_aceleracao.setText("");
        tf_forca.setText("");
    }//GEN-LAST:event_rd_massaActionPerformed

    private void rd_aceleracaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rd_aceleracaoMouseClicked
        limpar();
        lb_result.setText("N = F / u");
        lb_result1.setText("N = ");
        lb_resultFinal.setText("N = ");
        rd_massa.setSelected(false);
        rd_forca.setSelected(false);
    }//GEN-LAST:event_rd_aceleracaoMouseClicked

    private void rd_aceleracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_aceleracaoActionPerformed
        rd_forca.setSelected(false);
        rd_massa.setSelected(false);
        tf_aceleracao.setEnabled(false);
        tf_massa.setEnabled(true);
        tf_forca.setEnabled(true);
        tf_massa.setText("");
        tf_aceleracao.setText("");
        tf_forca.setText("");
    }//GEN-LAST:event_rd_aceleracaoActionPerformed

    private void tf_aceleracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_aceleracaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_aceleracaoActionPerformed

    private void tf_massaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_massaActionPerformed

    }//GEN-LAST:event_tf_massaActionPerformed

    private void tf_forcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_forcaActionPerformed

    }//GEN-LAST:event_tf_forcaActionPerformed

    private void lb_calcularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_calcularMouseClicked
        calculo();        // TODO add your handling code here:
    }//GEN-LAST:event_lb_calcularMouseClicked

    private void lb_limparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_limparMouseClicked
        limpar();        // TODO add your handling code here:
    }//GEN-LAST:event_lb_limparMouseClicked

    private void lb_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_voltarMouseClicked
        this.dispose();
        new TelaCalculosEscolhaDinamica().setVisible(true);// TODO add your handling code here:
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
                new TelaCalculoAtrito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel estudar_estatica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lb_calcular;
    private javax.swing.JLabel lb_limpar;
    private javax.swing.JLabel lb_paginainicial;
    private javax.swing.JLabel lb_result;
    private javax.swing.JLabel lb_result1;
    private javax.swing.JLabel lb_resultFinal;
    private javax.swing.JLabel lb_voltar;
    private javax.swing.JPanel pn_cinematica;
    private javax.swing.JPanel pn_dinamica;
    private javax.swing.JRadioButton rd_aceleracao;
    private javax.swing.JRadioButton rd_forca;
    private javax.swing.JRadioButton rd_massa;
    private javax.swing.JTextField tf_aceleracao;
    private javax.swing.JTextField tf_forca;
    private javax.swing.JTextField tf_massa;
    // End of variables declaration//GEN-END:variables
    public void calculo() {
        Double resposta;
        if (rd_forca.isSelected()) {
            if (!tf_aceleracao.getText().isEmpty() &&  !tf_massa.getText().isEmpty()) {
                /* Pegandos os TextArear, jogando em variaveis e já convetendo os dados */
                Double a = Double.parseDouble(tf_aceleracao.getText());
                Double m = Double.parseDouble(tf_massa.getText());
                resposta = calculoDinamicaClass.CalcularForcaDinamica(a, m);
                lb_result1.setText("F = " + m + " * " + a);
                lb_resultFinal.setText("F: " + resposta + " N");
            }else{
                JOptionPane.showMessageDialog(rootPane, "Preencha os campos: Aceleraçao e Massa");
            }
        }
        if(rd_massa.isSelected()){
            /* Verificando se os campos  */
            if(!tf_aceleracao.getText().isEmpty() && !tf_forca.getText().isEmpty()){
                /*Pegados os valores inseridos no textarea e convertentdo para double */
                Double a = Double.parseDouble(tf_aceleracao.getText());
                Double f = Double.parseDouble(tf_forca.getText());
                resposta = calculoDinamicaClass.CalcularMassaDinamica(a, f);
                
                lb_result1.setText("u = " + f + " / " + a );
                lb_resultFinal.setText("u = " + resposta);
                
            }else{
                JOptionPane.showMessageDialog(rootPane, "Preencha os campos: Aceleração e Força");
            }
        }
        if(rd_aceleracao.isSelected()){
            if(!tf_forca.getText().isEmpty() && !tf_massa.getText().isEmpty()){
                /* PEgando os dados dos campos de texto e convertendo para double */
                Double f = Double.parseDouble(tf_forca.getText());
                Double m = Double.parseDouble(tf_massa.getText());
                resposta = calculoDinamicaClass.CalcularAceleracaoDinamica(f, m);
                
                lb_result1.setText("N = " + f + " / " + m);
                lb_resultFinal.setText("N = " + resposta);
            }else{
                JOptionPane.showMessageDialog(rootPane, "Preencha os campos: Força e Massa");
            }
        }
        }

    public void limpar() {
        tf_aceleracao.setText("");
        tf_massa.setText("");
        tf_forca.setText("");
        lb_resultFinal.setText("F = ");
        lb_result.setText("F = u . N");
        lb_result1.setText("F = ");
    }
}
