package Views.fisicaI;

import Class.CalculoVelocidadeClass;
import Views.*;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Sábia
 */
public class TelaCalculoEquacaoTorricelliMovimentoVertical extends javax.swing.JFrame {

    DecimalFormat decimal = new DecimalFormat("0.00");
    CalculoVelocidadeClass calculoVelocidadeClass = new CalculoVelocidadeClass();

    public TelaCalculoEquacaoTorricelliMovimentoVertical() {
        initComponents();
        //Tela inicia Maximizada...
        setExtendedState(MAXIMIZED_BOTH);
        //ícone do Aplicativo...
        URL url = this.getClass().getResource("");
        Image icone = Toolkit.getDefaultToolkit().getImage(url);
        // this.setIconImage(icone);

        tf_velocidadeinicial.setEnabled(false);
        tf_aceleracao.setEnabled(false);
        tf_espaco.setEnabled(false);
        tf_velocidadefinal.setEnabled(false);

        rd_cm.setEnabled(false);
        rd_m.setEnabled(false);
        rd_km.setEnabled(false);
        rd_s.setEnabled(false);
        rd_min.setEnabled(false);
        rd_h.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        rd_aceleracao = new javax.swing.JRadioButton();
        rd_velocidadefinal = new javax.swing.JRadioButton();
        rd_velocidadeinicial = new javax.swing.JRadioButton();
        rd_espaco = new javax.swing.JRadioButton();
        jPanel8 = new javax.swing.JPanel();
        rd_cm = new javax.swing.JRadioButton();
        rd_m = new javax.swing.JRadioButton();
        rd_km = new javax.swing.JRadioButton();
        rd_s = new javax.swing.JRadioButton();
        rd_min = new javax.swing.JRadioButton();
        rd_h = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tf_aceleracao = new javax.swing.JTextField();
        tf_velocidadefinal = new javax.swing.JTextField();
        tf_velocidadeinicial = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tf_espaco = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        lb_resultado2 = new javax.swing.JLabel();
        lb_resultado = new javax.swing.JLabel();
        lb_resultado3 = new javax.swing.JLabel();
        lb_resultado4 = new javax.swing.JLabel();
        lb_resultado5 = new javax.swing.JLabel();
        lb_resultado6 = new javax.swing.JLabel();
        lb_resultado7 = new javax.swing.JLabel();
        lb_resultado8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lb_calcular = new javax.swing.JLabel();
        lb_limpar = new javax.swing.JLabel();
        lb_voltar = new javax.swing.JLabel();
        lb_paginainicial = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("êfisíco - Cinemática");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(0, 0));

        jPanel1.setBackground(new java.awt.Color(202, 233, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 300));

        jPanel5.setBackground(new java.awt.Color(202, 233, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Calcular", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 0, 24))); // NOI18N

        jPanel10.setBackground(new java.awt.Color(202, 233, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Marque a opção que deseja calcular", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 0, 18))); // NOI18N

        rd_aceleracao.setBackground(new java.awt.Color(202, 233, 255));
        rd_aceleracao.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        rd_aceleracao.setText("Gravidade");
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

        rd_velocidadefinal.setBackground(new java.awt.Color(202, 233, 255));
        rd_velocidadefinal.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        rd_velocidadefinal.setText("Velocidade Final");
        rd_velocidadefinal.setBorder(null);
        rd_velocidadefinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd_velocidadefinalActionPerformed(evt);
            }
        });

        rd_velocidadeinicial.setBackground(new java.awt.Color(202, 233, 255));
        rd_velocidadeinicial.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        rd_velocidadeinicial.setText("Velocidade Inicial");
        rd_velocidadeinicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd_velocidadeinicialActionPerformed(evt);
            }
        });

        rd_espaco.setBackground(new java.awt.Color(202, 233, 255));
        rd_espaco.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        rd_espaco.setText("Altura");
        rd_espaco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd_espacoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rd_espaco, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_velocidadeinicial))
                .addGap(28, 28, 28)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rd_aceleracao)
                    .addComponent(rd_velocidadefinal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rd_espaco)
                    .addComponent(rd_aceleracao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rd_velocidadeinicial)
                    .addComponent(rd_velocidadefinal))
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(202, 233, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Unidade de Medida", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 0, 18))); // NOI18N

        rd_cm.setBackground(new java.awt.Color(202, 233, 255));
        rd_cm.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        rd_cm.setText("cm");
        rd_cm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rd_cmMouseClicked(evt);
            }
        });
        rd_cm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd_cmActionPerformed(evt);
            }
        });

        rd_m.setBackground(new java.awt.Color(202, 233, 255));
        rd_m.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        rd_m.setText("m");
        rd_m.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rd_mMouseClicked(evt);
            }
        });
        rd_m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd_mActionPerformed(evt);
            }
        });

        rd_km.setBackground(new java.awt.Color(202, 233, 255));
        rd_km.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        rd_km.setText("km");
        rd_km.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rd_kmMouseClicked(evt);
            }
        });
        rd_km.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd_kmActionPerformed(evt);
            }
        });

        rd_s.setBackground(new java.awt.Color(202, 233, 255));
        rd_s.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        rd_s.setText("s");
        rd_s.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rd_sMouseClicked(evt);
            }
        });
        rd_s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd_sActionPerformed(evt);
            }
        });

        rd_min.setBackground(new java.awt.Color(202, 233, 255));
        rd_min.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        rd_min.setText("min");
        rd_min.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd_minActionPerformed(evt);
            }
        });

        rd_h.setBackground(new java.awt.Color(202, 233, 255));
        rd_h.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        rd_h.setText("h");
        rd_h.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd_hActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel4.setText("T:");

        jLabel5.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel5.setText("S:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rd_s, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(rd_cm)))
                .addGap(6, 6, 6)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(rd_min))
                    .addComponent(rd_m, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(rd_h, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(rd_km))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rd_cm)
                    .addComponent(rd_m)
                    .addComponent(rd_km)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rd_s)
                    .addComponent(rd_min)
                    .addComponent(rd_h)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(202, 233, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 0, 18))); // NOI18N

        jLabel8.setBackground(new java.awt.Color(202, 233, 255));
        jLabel8.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel8.setText("V:");
        jLabel8.setToolTipText("velocidade final");

        jLabel9.setBackground(new java.awt.Color(202, 233, 255));
        jLabel9.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel9.setText("g:");
        jLabel9.setToolTipText("Posição Inicial");

        tf_aceleracao.setBackground(new java.awt.Color(202, 233, 255));
        tf_aceleracao.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        tf_aceleracao.setToolTipText("Aceleração Média");
        tf_aceleracao.setName("Espaço Inicial"); // NOI18N

        tf_velocidadefinal.setBackground(new java.awt.Color(202, 233, 255));
        tf_velocidadefinal.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        tf_velocidadefinal.setToolTipText("velocidade final");

        tf_velocidadeinicial.setBackground(new java.awt.Color(202, 233, 255));
        tf_velocidadeinicial.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        tf_velocidadeinicial.setToolTipText("Velocidade Inicial");

        jLabel17.setBackground(new java.awt.Color(202, 233, 255));
        jLabel17.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel17.setText("Vo:");
        jLabel17.setToolTipText("Velocidade Inicial");

        jLabel10.setBackground(new java.awt.Color(202, 233, 255));
        jLabel10.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel10.setText("h:");
        jLabel10.setToolTipText("posição");

        tf_espaco.setBackground(new java.awt.Color(202, 233, 255));
        tf_espaco.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        tf_espaco.setToolTipText("posição");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_velocidadeinicial))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_velocidadefinal, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_aceleracao, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_espaco)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_espaco, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_velocidadeinicial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf_aceleracao, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf_velocidadefinal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jPanel9Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel17, jLabel8, jLabel9, tf_aceleracao, tf_velocidadefinal, tf_velocidadeinicial});

        tf_velocidadefinal.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jPanel6.setBackground(new java.awt.Color(202, 233, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 0, 24))); // NOI18N

        lb_resultado2.setBackground(new java.awt.Color(202, 233, 255));
        lb_resultado2.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lb_resultado2.setText("V² =");

        lb_resultado.setBackground(new java.awt.Color(202, 233, 255));
        lb_resultado.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lb_resultado.setText("V² =  V0²  +  2  .  g .  ∆h");

        lb_resultado3.setBackground(new java.awt.Color(202, 233, 255));
        lb_resultado3.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lb_resultado3.setText("V² =");

        lb_resultado4.setBackground(new java.awt.Color(202, 233, 255));
        lb_resultado4.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lb_resultado4.setText("V² =");

        lb_resultado5.setBackground(new java.awt.Color(202, 233, 255));
        lb_resultado5.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lb_resultado5.setText("V² =");

        lb_resultado6.setBackground(new java.awt.Color(202, 233, 255));
        lb_resultado6.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lb_resultado6.setText("V² =");

        lb_resultado7.setBackground(new java.awt.Color(202, 233, 255));
        lb_resultado7.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lb_resultado7.setText("V² =");

        lb_resultado8.setBackground(new java.awt.Color(202, 233, 255));
        lb_resultado8.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lb_resultado8.setText("V² =");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_resultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_resultado2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_resultado3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_resultado4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_resultado5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_resultado6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_resultado7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_resultado8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_resultado2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_resultado3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_resultado4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(lb_resultado5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_resultado6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_resultado7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_resultado8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lb_resultado2, lb_resultado3, lb_resultado4});

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/F10.png"))); // NOI18N

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logoÊ.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(387, 387, 387)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(354, 354, 354))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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
                .addGap(28, 28, 28))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_voltar, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
            .addComponent(lb_limpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lb_paginainicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lb_calcular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/TorriceliVertical.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(411, 411, 411)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(393, 393, 393))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(90, 90, 90))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 104, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setBorderPainted(true);
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
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

    private void rd_hActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_hActionPerformed
        rd_s.setSelected(false);
        rd_min.setSelected(false);
        if (rd_velocidadeinicial.isSelected()) {
            tf_espaco.setEnabled(true);
            tf_velocidadeinicial.setEnabled(false);
            tf_aceleracao.setEnabled(true);
            tf_velocidadefinal.setEnabled(true);
        }
        if (rd_velocidadefinal.isSelected()) {
            tf_espaco.setEnabled(true);
            tf_velocidadeinicial.setEnabled(true);
            tf_aceleracao.setEnabled(true);
            tf_velocidadefinal.setEnabled(false);
        }
        if (rd_aceleracao.isSelected()) {
            tf_espaco.setEnabled(true);
            tf_velocidadeinicial.setEnabled(true);
            tf_aceleracao.setEnabled(false);
            tf_velocidadefinal.setEnabled(true);
        }
        if (rd_espaco.isSelected()) {
            tf_espaco.setEnabled(false);
            tf_velocidadeinicial.setEnabled(true);
            tf_aceleracao.setEnabled(true);
            tf_velocidadefinal.setEnabled(true);
        }
    }//GEN-LAST:event_rd_hActionPerformed

    private void rd_minActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_minActionPerformed
        rd_h.setSelected(false);
        rd_s.setSelected(false);
        if (rd_velocidadeinicial.isSelected()) {
            tf_espaco.setEnabled(true);
            tf_velocidadeinicial.setEnabled(false);
            tf_aceleracao.setEnabled(true);
            tf_velocidadefinal.setEnabled(true);
        }
        if (rd_velocidadefinal.isSelected()) {
            tf_espaco.setEnabled(true);
            tf_velocidadeinicial.setEnabled(true);
            tf_aceleracao.setEnabled(true);
            tf_velocidadefinal.setEnabled(false);
        }
        if (rd_aceleracao.isSelected()) {
            tf_espaco.setEnabled(true);
            tf_velocidadeinicial.setEnabled(true);
            tf_aceleracao.setEnabled(false);
            tf_velocidadefinal.setEnabled(true);
        }
        if (rd_espaco.isSelected()) {
            tf_espaco.setEnabled(false);
            tf_velocidadeinicial.setEnabled(true);
            tf_aceleracao.setEnabled(true);
            tf_velocidadefinal.setEnabled(true);
        }
    }//GEN-LAST:event_rd_minActionPerformed

    private void rd_sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_sActionPerformed
        rd_min.setSelected(false);
        rd_h.setSelected(false);
        if (rd_velocidadeinicial.isSelected()) {
            tf_espaco.setEnabled(true);
            tf_velocidadeinicial.setEnabled(false);
            tf_aceleracao.setEnabled(true);
            tf_velocidadefinal.setEnabled(true);
        }
        if (rd_velocidadefinal.isSelected()) {
            tf_espaco.setEnabled(true);
            tf_velocidadeinicial.setEnabled(true);
            tf_aceleracao.setEnabled(true);
            tf_velocidadefinal.setEnabled(false);
        }
        if (rd_aceleracao.isSelected()) {
            tf_espaco.setEnabled(true);
            tf_velocidadeinicial.setEnabled(true);
            tf_aceleracao.setEnabled(false);
            tf_velocidadefinal.setEnabled(true);
        }
        if (rd_espaco.isSelected()) {
            tf_espaco.setEnabled(false);
            tf_velocidadeinicial.setEnabled(true);
            tf_aceleracao.setEnabled(true);
            tf_velocidadefinal.setEnabled(true);
        }
    }//GEN-LAST:event_rd_sActionPerformed

    private void rd_sMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rd_sMouseClicked
        rd_h.setSelected(false);
        rd_min.setSelected(false);
    }//GEN-LAST:event_rd_sMouseClicked

    private void rd_kmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_kmActionPerformed
        if (rd_cm.isSelected()) {
            if (!tf_espaco.getText().isEmpty()) {
                tf_espaco.setText((Double.parseDouble(tf_espaco.getText()) / 100000) + "");
            }
        }
        if (rd_m.isSelected()) {
            if (!tf_espaco.getText().isEmpty()) {
                tf_espaco.setText((Double.parseDouble(tf_espaco.getText()) / 1000) + "");
            }
        }
        rd_m.setSelected(false);
        rd_cm.setSelected(false);
        if (rd_velocidadeinicial.isSelected()) {
            tf_espaco.setEnabled(true);
            tf_velocidadeinicial.setEnabled(false);
            tf_aceleracao.setEnabled(true);
            tf_velocidadefinal.setEnabled(true);
        }
        if (rd_velocidadefinal.isSelected()) {
            tf_espaco.setEnabled(true);
            tf_velocidadeinicial.setEnabled(true);
            tf_aceleracao.setEnabled(true);
            tf_velocidadefinal.setEnabled(false);
        }
        if (rd_aceleracao.isSelected()) {
            tf_espaco.setEnabled(true);
            tf_velocidadeinicial.setEnabled(true);
            tf_aceleracao.setEnabled(false);
            tf_velocidadefinal.setEnabled(true);
        }
        if (rd_espaco.isSelected()) {
            tf_espaco.setEnabled(false);
            tf_velocidadeinicial.setEnabled(true);
            tf_aceleracao.setEnabled(true);
            tf_velocidadefinal.setEnabled(true);
        }
    }//GEN-LAST:event_rd_kmActionPerformed

    private void rd_kmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rd_kmMouseClicked

        rd_m.setSelected(false);
        rd_cm.setSelected(false);
    }//GEN-LAST:event_rd_kmMouseClicked

    private void rd_mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_mActionPerformed
        if (rd_cm.isSelected()) {
            if (!tf_espaco.getText().isEmpty()) {
                tf_espaco.setText((Double.parseDouble(tf_espaco.getText()) / 100) + "");
            }
        }
        if (rd_km.isSelected()) {
            if (!tf_espaco.getText().isEmpty()) {
                tf_espaco.setText((Double.parseDouble(tf_espaco.getText()) * 1000) + "");
            }
        }
        rd_cm.setSelected(false);
        rd_km.setSelected(false);
        if (rd_velocidadeinicial.isSelected()) {
            tf_espaco.setEnabled(true);
            tf_velocidadeinicial.setEnabled(false);
            tf_aceleracao.setEnabled(true);
            tf_velocidadefinal.setEnabled(true);
        }
        if (rd_velocidadefinal.isSelected()) {
            tf_espaco.setEnabled(true);
            tf_velocidadeinicial.setEnabled(true);
            tf_aceleracao.setEnabled(true);
            tf_velocidadefinal.setEnabled(false);
        }
        if (rd_aceleracao.isSelected()) {
            tf_espaco.setEnabled(true);
            tf_velocidadeinicial.setEnabled(true);
            tf_aceleracao.setEnabled(false);
            tf_velocidadefinal.setEnabled(true);
        }
        if (rd_espaco.isSelected()) {
            tf_espaco.setEnabled(false);
            tf_velocidadeinicial.setEnabled(true);
            tf_aceleracao.setEnabled(true);
            tf_velocidadefinal.setEnabled(true);
        }
    }//GEN-LAST:event_rd_mActionPerformed

    private void rd_mMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rd_mMouseClicked
        rd_cm.setSelected(false);
        rd_km.setSelected(false);
    }//GEN-LAST:event_rd_mMouseClicked

    private void rd_cmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_cmActionPerformed
        if (rd_km.isSelected()) {
            if (!tf_espaco.getText().isEmpty()) {
                tf_espaco.setText((Double.parseDouble(tf_espaco.getText()) * 100000) + "");
            }
        }
        if (rd_m.isSelected()) {
            if (!tf_espaco.getText().isEmpty()) {
                tf_espaco.setText((Double.parseDouble(tf_espaco.getText()) * 100) + "");
            }
        }
        rd_km.setSelected(false);
        rd_m.setSelected(false);
        if (rd_velocidadeinicial.isSelected()) {
            tf_espaco.setEnabled(true);
            tf_velocidadeinicial.setEnabled(false);
            tf_aceleracao.setEnabled(true);
            tf_velocidadefinal.setEnabled(true);
        }
        if (rd_velocidadefinal.isSelected()) {
            tf_espaco.setEnabled(true);
            tf_velocidadeinicial.setEnabled(true);
            tf_aceleracao.setEnabled(true);
            tf_velocidadefinal.setEnabled(false);
        }
        if (rd_aceleracao.isSelected()) {
            tf_espaco.setEnabled(true);
            tf_velocidadeinicial.setEnabled(true);
            tf_aceleracao.setEnabled(false);
            tf_velocidadefinal.setEnabled(true);
        }
        if (rd_espaco.isSelected()) {
            tf_espaco.setEnabled(false);
            tf_velocidadeinicial.setEnabled(true);
            tf_aceleracao.setEnabled(true);
            tf_velocidadefinal.setEnabled(true);
        }
    }//GEN-LAST:event_rd_cmActionPerformed

    private void rd_cmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rd_cmMouseClicked
        rd_m.setSelected(false);
        rd_km.setSelected(false);
    }//GEN-LAST:event_rd_cmMouseClicked

    private void rd_aceleracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_aceleracaoActionPerformed
        rd_velocidadeinicial.setSelected(false);
        rd_velocidadefinal.setSelected(false);
        rd_espaco.setSelected(false);
        rd_cm.setEnabled(true);
        rd_m.setEnabled(true);
        rd_km.setEnabled(true);
        rd_s.setEnabled(true);
        rd_min.setEnabled(true);
        rd_h.setEnabled(true);
        tf_aceleracao.setEnabled(false);
        tf_espaco.setEnabled(false);
        tf_velocidadefinal.setEnabled(false);
        tf_velocidadeinicial.setEnabled(false);
    }//GEN-LAST:event_rd_aceleracaoActionPerformed

    private void rd_aceleracaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rd_aceleracaoMouseClicked
        limpar();
    }//GEN-LAST:event_rd_aceleracaoMouseClicked

    private void rd_velocidadeinicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_velocidadeinicialActionPerformed
        rd_espaco.setSelected(false);
        rd_aceleracao.setSelected(false);
        rd_velocidadefinal.setSelected(false);
        rd_cm.setEnabled(true);
        rd_m.setEnabled(true);
        rd_km.setEnabled(true);
        rd_s.setEnabled(true);
        rd_min.setEnabled(true);
        rd_h.setEnabled(true);
        tf_aceleracao.setEnabled(false);
        tf_espaco.setEnabled(false);
        tf_velocidadefinal.setEnabled(false);
        tf_velocidadeinicial.setEnabled(false);
        limpar();
    }//GEN-LAST:event_rd_velocidadeinicialActionPerformed

    private void rd_espacoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_espacoActionPerformed
        rd_velocidadeinicial.setSelected(false);
        rd_velocidadefinal.setSelected(false);
        rd_aceleracao.setSelected(false);
        rd_cm.setEnabled(true);
        rd_m.setEnabled(true);
        rd_km.setEnabled(true);
        rd_s.setEnabled(true);
        rd_min.setEnabled(true);
        rd_h.setEnabled(true);
        tf_aceleracao.setEnabled(false);
        tf_espaco.setEnabled(false);
        tf_velocidadefinal.setEnabled(false);
        tf_velocidadeinicial.setEnabled(false);
        limpar();
    }//GEN-LAST:event_rd_espacoActionPerformed

    private void rd_velocidadefinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_velocidadefinalActionPerformed
        rd_espaco.setSelected(false);
        rd_velocidadeinicial.setSelected(false);
        rd_aceleracao.setSelected(false);
        rd_cm.setEnabled(true);
        rd_m.setEnabled(true);
        rd_km.setEnabled(true);
        rd_s.setEnabled(true);
        rd_min.setEnabled(true);
        rd_h.setEnabled(true);
        tf_aceleracao.setEnabled(false);
        tf_espaco.setEnabled(false);
        tf_velocidadefinal.setEnabled(false);
        tf_velocidadeinicial.setEnabled(false);
        limpar();
    }//GEN-LAST:event_rd_velocidadefinalActionPerformed

    private void lb_calcularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_calcularMouseClicked
        calculo();        // TODO add your handling code here:
    }//GEN-LAST:event_lb_calcularMouseClicked

    private void lb_limparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_limparMouseClicked
        limpar();        // TODO add your handling code here:
    }//GEN-LAST:event_lb_limparMouseClicked

    private void lb_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_voltarMouseClicked
        this.dispose();
        new TelaCalculosEscolhaCinematica().setVisible(true);// TODO add your handling code here:
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
                new TelaCalculoEquacaoTorricelliMovimentoVertical().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lb_calcular;
    private javax.swing.JLabel lb_limpar;
    private javax.swing.JLabel lb_paginainicial;
    private javax.swing.JLabel lb_resultado;
    private javax.swing.JLabel lb_resultado2;
    private javax.swing.JLabel lb_resultado3;
    private javax.swing.JLabel lb_resultado4;
    private javax.swing.JLabel lb_resultado5;
    private javax.swing.JLabel lb_resultado6;
    private javax.swing.JLabel lb_resultado7;
    private javax.swing.JLabel lb_resultado8;
    private javax.swing.JLabel lb_voltar;
    private javax.swing.JRadioButton rd_aceleracao;
    private javax.swing.JRadioButton rd_cm;
    private javax.swing.JRadioButton rd_espaco;
    private javax.swing.JRadioButton rd_h;
    private javax.swing.JRadioButton rd_km;
    private javax.swing.JRadioButton rd_m;
    private javax.swing.JRadioButton rd_min;
    private javax.swing.JRadioButton rd_s;
    private javax.swing.JRadioButton rd_velocidadefinal;
    private javax.swing.JRadioButton rd_velocidadeinicial;
    private javax.swing.JTextField tf_aceleracao;
    private javax.swing.JTextField tf_espaco;
    private javax.swing.JTextField tf_velocidadefinal;
    private javax.swing.JTextField tf_velocidadeinicial;
    // End of variables declaration//GEN-END:variables
    public void calculo() {
        if (rd_aceleracao.isSelected()) {
            if (!tf_velocidadefinal.getText().isEmpty() && !tf_velocidadeinicial.getText().isEmpty()
                    && !tf_espaco.getText().isEmpty()) {
                calculoVelocidadeClass.setVelocidadeFinal(Double.parseDouble(tf_velocidadefinal.getText()));
                calculoVelocidadeClass.setVelocidadeInicial(Double.parseDouble(tf_velocidadeinicial.getText()));
                calculoVelocidadeClass.setEspacoInicial(Double.parseDouble(tf_espaco.getText()));
                Double a = Double.parseDouble(tf_espaco.getText());
                Double b = Double.parseDouble(tf_velocidadefinal.getText());
                Double c = Double.parseDouble(tf_velocidadeinicial.getText());
                String d = decimal.format(a);
                String e = decimal.format(b);
                String f = decimal.format(c);
                //Math.sqrt(c); //calculando a raiz                
                Double g = calculoVelocidadeClass.aux2(b, b); //quadrado da velocidade inicial
                String h = decimal.format(g);
                Double i = calculoVelocidadeClass.aux2(c, c); //quadrado da velocidade final
                String j = decimal.format(i);
                Double k = calculoVelocidadeClass.aux(i, g); // velocidade final ao quadrado - velocidade inicial ao quadrado
                String l = decimal.format(k);
                Double m = calculoVelocidadeClass.aux2(calculoVelocidadeClass.getEspacoInicial(), 2); //multiplicando o espaço * 2
                String n = decimal.format(m);
                Double o = calculoVelocidadeClass.aux3(k, m); //divisão
                String p = decimal.format(o);
                lb_resultado.setText("g = (V² - V0²) / (h . 2)");
                lb_resultado2.setText("g = (" + e + "² - " + f + "²) / (" + d + " . 2 )");
                lb_resultado3.setText("g = (" + h + " - " + j + ") / " + n);
                lb_resultado4.setText("g = " + l + " / " + n);
                lb_resultado6.setVisible(false);
                lb_resultado7.setVisible(false);
                lb_resultado8.setVisible(false);
                if (rd_km.isSelected()) {
                    if (rd_s.isSelected()) {
                        lb_resultado5.setText("g =  " + p + " Km/s");
                    }
                    if (rd_min.isSelected()) {
                        lb_resultado5.setText("g =  " + p + " Km/min");
                    }
                    if (rd_h.isSelected()) {
                        lb_resultado5.setText("g =  " + p + " Km/h");
                    }
                }
                if (rd_m.isSelected()) {
                    if (rd_s.isSelected()) {
                        lb_resultado5.setText("g =  " + p + " m/s");;
                    }
                    if (rd_min.isSelected()) {
                        lb_resultado5.setText("g =  " + p + " m/min");
                    }
                    if (rd_h.isSelected()) {
                        lb_resultado5.setText("g =  " + p + " m/h");
                    }
                }
                if (rd_cm.isSelected()) {
                    if (rd_s.isSelected()) {
                        lb_resultado5.setText("g =  " + p + " cm/s");
                    }
                    if (rd_min.isSelected()) {
                        lb_resultado5.setText("g =  " + p + " cm/min");
                    }
                    if (rd_h.isSelected()) {
                        lb_resultado5.setText("g =  " + p + " cm/h");
                    }
                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "Preencha os campos: aceleração, tempo inicial e final");
            }
        } else if (rd_espaco.isSelected()) {
            if (!tf_aceleracao.getText().isEmpty() && !tf_velocidadeinicial.getText().isEmpty()
                    && !tf_velocidadefinal.getText().isEmpty()) {
                calculoVelocidadeClass.setVelocidadeFinal(Double.parseDouble(tf_velocidadefinal.getText()));
                calculoVelocidadeClass.setVelocidadeInicial(Double.parseDouble(tf_velocidadeinicial.getText()));
                calculoVelocidadeClass.setAceleracao(Double.parseDouble(tf_aceleracao.getText()));
                Double a = Double.parseDouble(tf_aceleracao.getText());
                Double b = Double.parseDouble(tf_velocidadefinal.getText());
                Double c = Double.parseDouble(tf_velocidadeinicial.getText());
                String d = decimal.format(a);
                String e = decimal.format(b);
                String f = decimal.format(c);
                //Math.sqrt(c); //calculando a raiz                
                Double g = calculoVelocidadeClass.aux2(b, b); //quadrado da velocidade inicial
                String h = decimal.format(g);
                Double i = calculoVelocidadeClass.aux2(c, c); //quadrado da velocidade final
                String j = decimal.format(i);
                Double k = calculoVelocidadeClass.aux(i, g); // velocidade final ao quadrado - velocidade inicial ao quadrado
                String l = decimal.format(k);
                Double m = calculoVelocidadeClass.aux2(2, calculoVelocidadeClass.getAceleracao()); //multiplicando o espaço * 2
                String n = decimal.format(m);
                Double o = calculoVelocidadeClass.aux3(k, m); //divisão
                String p = decimal.format(o);
                lb_resultado.setText("h = (V² - V0²) / (2 . g)");
                lb_resultado2.setText("h = (" + e + "² - " + f + "²) / ( 2 . " + d + ")");
                lb_resultado3.setText("g = (" + h + " - " + j + ") / " + n);
                lb_resultado4.setText("g = " + l + " / " + n);
                lb_resultado6.setVisible(false);
                lb_resultado7.setVisible(false);
                lb_resultado8.setVisible(false);
                if (rd_km.isSelected()) {
                    if (rd_s.isSelected()) {
                        lb_resultado5.setText("g =  " + p + " Km/s");
                    }
                    if (rd_min.isSelected()) {
                        lb_resultado5.setText("g =  " + p + " Km/min");
                    }
                    if (rd_h.isSelected()) {
                        lb_resultado5.setText("g =  " + p + " Km/h");
                    }
                }
                if (rd_m.isSelected()) {
                    if (rd_s.isSelected()) {
                        lb_resultado5.setText("g =  " + p + " m/s");;
                    }
                    if (rd_min.isSelected()) {
                        lb_resultado5.setText("g =  " + p + " m/min");
                    }
                    if (rd_h.isSelected()) {
                        lb_resultado5.setText("g =  " + p + " m/h");
                    }
                }
                if (rd_cm.isSelected()) {
                    if (rd_s.isSelected()) {
                        lb_resultado5.setText("g =  " + p + " cm/s");
                    }
                    if (rd_min.isSelected()) {
                        lb_resultado5.setText("g =  " + p + " cm/min");
                    }
                    if (rd_h.isSelected()) {
                        lb_resultado5.setText("g =  " + p + " cm/h");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Preencha os campos: aceleração, tempo inicial e final");
            }
        } else if (rd_velocidadeinicial.isSelected()) {
            if (!tf_aceleracao.getText().isEmpty() && !tf_espaco.getText().isEmpty()
                    && !tf_velocidadefinal.getText().isEmpty()) {
                calculoVelocidadeClass.setVelocidadeFinal(Double.parseDouble(tf_velocidadefinal.getText()));
                calculoVelocidadeClass.setEspacoInicial(Double.parseDouble(tf_espaco.getText()));
                calculoVelocidadeClass.setAceleracao(Double.parseDouble(tf_aceleracao.getText()));
                Double a = Double.parseDouble(tf_aceleracao.getText());
                Double b = Double.parseDouble(tf_velocidadefinal.getText());
                Double c = Double.parseDouble(tf_espaco.getText());
                String d = decimal.format(a);
                String e = decimal.format(b);
                String f = decimal.format(c);
                Double g = calculoVelocidadeClass.aux2(b, b); //quadrado da velocidade inicial
                String h = decimal.format(g);
                Double i = calculoVelocidadeClass.aux2(a, c); //multiplicação da aceleração * espaco
                String j = decimal.format(i);
                Double k = calculoVelocidadeClass.aux2(2, i); // resultado de aceleração * espaço * 2
                String l = decimal.format(k);
                Double m = calculoVelocidadeClass.aux(g, k); //velocidade - multiplicacao
                String n = decimal.format(m);
                Double o = calculoVelocidadeClass.aux3(k, m); //divisão
                String p = decimal.format(o);
                Double q = Math.sqrt(m); //calculando a raiz 
                String r = decimal.format(q);
                lb_resultado.setText("V0 = √ (V² - 2 . g . h)");
                lb_resultado2.setText("V0 = √(" + e + "² - 2 . " + d + ". " + f + ")");
                lb_resultado3.setText("V0 = √(" + h + " - 2 . " + d + " . " + f + ")");
                lb_resultado4.setText("V0 = √(" + h + " - 2 . " + j + ")");
                lb_resultado5.setText("V0 = √(" + h + " - " + l + ")");
                lb_resultado6.setText("V0 = √(" + n + ")");
                lb_resultado8.setVisible(false);
                if (rd_km.isSelected()) {
                    if (rd_s.isSelected()) {
                        lb_resultado7.setText("V0 =  " + r + " Km/s");
                    }
                    if (rd_min.isSelected()) {
                        lb_resultado7.setText("V0 =  " + r + " Km/min");
                    }
                    if (rd_h.isSelected()) {
                        lb_resultado7.setText("V0 =  " + r + " Km/h");
                    }
                }
                if (rd_m.isSelected()) {
                    if (rd_s.isSelected()) {
                        lb_resultado7.setText("V0 =  " + r + " m/s");;
                    }
                    if (rd_min.isSelected()) {
                        lb_resultado7.setText("V0 =  " + r + " m/min");
                    }
                    if (rd_h.isSelected()) {
                        lb_resultado7.setText("V0 =  " + r + " m/h");
                    }
                }
                if (rd_cm.isSelected()) {
                    if (rd_s.isSelected()) {
                        lb_resultado7.setText("V0 =  " + r + " cm/s");
                    }
                    if (rd_min.isSelected()) {
                        lb_resultado7.setText("V0 =  " + r + " cm/min");
                    }
                    if (rd_h.isSelected()) {
                        lb_resultado7.setText("V0 =  " + r + " cm/h");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Preencha os campos: aceleração, tempo inicial e final");
            }
        } else if (rd_velocidadefinal.isSelected()) {
            if (!tf_aceleracao.getText().isEmpty() && !tf_velocidadeinicial.getText().isEmpty()
                    && !tf_espaco.getText().isEmpty()) {
                calculoVelocidadeClass.setVelocidadeInicial (Double.parseDouble(tf_velocidadeinicial.getText()));
                calculoVelocidadeClass.setEspacoInicial(Double.parseDouble(tf_espaco.getText()));
                calculoVelocidadeClass.setAceleracao(Double.parseDouble(tf_aceleracao.getText()));
                Double a = Double.parseDouble(tf_aceleracao.getText());
                Double b = Double.parseDouble(tf_velocidadeinicial.getText());
                Double c = Double.parseDouble(tf_espaco.getText());
                String d = decimal.format(a);
                String e = decimal.format(b);
                String f = decimal.format(c);
                Double g = calculoVelocidadeClass.aux2(b, b); //quadrado da velocidade inicial
                String h = decimal.format(g);
                Double i = calculoVelocidadeClass.aux2(a, c); //multiplicação da aceleração * espaco
                String j = decimal.format(i);
                Double k = calculoVelocidadeClass.aux2(2, i); // resultado de aceleração * espaço * 2
                String l = decimal.format(k);
                Double m = calculoVelocidadeClass.aux4(g, k); //velocidade + multiplicacao
                String n = decimal.format(m);
                
                Double q = Math.sqrt(m); //calculando a raiz 
                String r = decimal.format(q);
                lb_resultado.setText("V = √ ( V0² + 2 . g . Δh )");
                lb_resultado2.setText("V = √(" + e + "² + 2 . " + d + ". " + f + ")");
                lb_resultado3.setText("V = √(" + h + " + 2 . " + d + " . " + f + ")");
                lb_resultado4.setText("V = √(" + h + " + 2 . " + j + ")");
                lb_resultado5.setText("V = √(" + h + " + " + l + ")");
                lb_resultado6.setText("V = √(" + n + ")");
                lb_resultado8.setVisible(false);
                if (rd_km.isSelected()) {
                    if (rd_s.isSelected()) {
                        lb_resultado7.setText("V =  " + r + " Km/s");
                    }
                    if (rd_min.isSelected()) {
                        lb_resultado7.setText("V =  " + r + " Km/min");
                    }
                    if (rd_h.isSelected()) {
                        lb_resultado7.setText("V =  " + r + " Km/h");
                    }
                }
                if (rd_m.isSelected()) {
                    if (rd_s.isSelected()) {
                        lb_resultado7.setText("V =  " + r + " m/s");;
                    }
                    if (rd_min.isSelected()) {
                        lb_resultado7.setText("V =  " + r + " m/min");
                    }
                    if (rd_h.isSelected()) {
                        lb_resultado7.setText("V =  " + r + " m/h");
                    }
                }
                if (rd_cm.isSelected()) {
                    if (rd_s.isSelected()) {
                        lb_resultado7.setText("V =  " + r + " cm/s");
                    }
                    if (rd_min.isSelected()) {
                        lb_resultado7.setText("V =  " + r + " cm/min");
                    }
                    if (rd_h.isSelected()) {
                        lb_resultado7.setText("V =  " + r + " cm/h");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Preencha os campos: aceleração, tempo inicial e final");
            }
        } else {
            JOptionPane.showMessageDialog(this, "É necessário selecionar o tipo que deseja calcular: velocidade, espaço ou tempo.\n"
                    + "É necessário selecionar a unidade de medida: s, min ou h e cm, m ou km. ");
        }
    }

    public void limpar() {
        tf_aceleracao.setText("");
        tf_espaco.setText("");
        tf_velocidadefinal.setText("");
        tf_velocidadeinicial.setText("");

        if (rd_aceleracao.isSelected()) {
            lb_resultado.setText("g = (V² - V0²) / (h . 2)");
            lb_resultado2.setText("g =  ");
            lb_resultado3.setText("g =  ");
            lb_resultado4.setText("g =  ");
            lb_resultado5.setText("g =  ");
            lb_resultado6.setVisible(false);
            lb_resultado7.setVisible(false);
            lb_resultado8.setVisible(false);
        } else if (rd_espaco.isSelected()) {
            lb_resultado.setText("  h = (V² - V0²) / (2 . g)");
            lb_resultado2.setText("h =  ");
            lb_resultado3.setText("h =  ");
            lb_resultado4.setText("h =  ");
            lb_resultado5.setText("h =  ");
            lb_resultado6.setText("h =  ");
            lb_resultado7.setText("h =  ");
            lb_resultado8.setText("h =  ");
        } else if (rd_velocidadeinicial.isSelected()) {
            lb_resultado.setText("V0 = √ (V² - 2 . g . h)");
            lb_resultado2.setText("V0 =  ");
            lb_resultado3.setText("V0=  ");
            lb_resultado4.setText("V0 =  ");
            lb_resultado5.setText("V0 =  ");
            lb_resultado6.setText("V0 =  ");
            lb_resultado7.setText("V0 =  ");
            lb_resultado8.setText("V0 =  ");
        } else if (rd_velocidadefinal.isSelected()) {
            lb_resultado.setText("V = √ ( V0² + 2 . g . Δh )");
            lb_resultado2.setText("V =  ");
            lb_resultado3.setText("V=  ");
            lb_resultado4.setText("V =  ");
            lb_resultado5.setText("V =  ");
            lb_resultado6.setText("V =  ");
            lb_resultado7.setText("V =  ");
            lb_resultado8.setText("V =  ");
        } else {
            lb_resultado.setText("V² = Vo²   +  2   .  g .  Δh");
            lb_resultado2.setText("V² =  ");
            lb_resultado3.setText("V²=  ");
            lb_resultado4.setText("V² =  ");
            lb_resultado5.setText("V² =  ");
            lb_resultado6.setText("V² =  ");
            lb_resultado7.setText("V² =  ");
            lb_resultado8.setText("V² =  ");
        }
    }
}
