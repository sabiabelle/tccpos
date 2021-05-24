package Views.fisicaI;

import Class.CalculoVelocidadeClass;
import Views.*;
import java.net.URL;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Sábia
 */
public class TelaCalculoFHDeslocamento extends javax.swing.JFrame {

    CalculoVelocidadeClass calculoVelocidadeClass = new CalculoVelocidadeClass();
    DecimalFormat decimal = new DecimalFormat("0.00");

    public TelaCalculoFHDeslocamento() {
        initComponents();

        //Tela inicia Maximizada...
        setExtendedState(MAXIMIZED_BOTH);
        //ícone do Aplicativo...
        URL url = this.getClass().getResource("../imagens/iconeefisico.png");
        rd_velocidade.setSelected(false);
        rd_posinicial.setSelected(false);
        rd_tempo.setSelected(false);
        tf_velofinal.setEnabled(false);
        tf_veloinicial.setEnabled(false);
        tf_espacofinal.setEnabled(false);
        tf_espacoinicial.setEnabled(false);
        tf_tempofinal.setEnabled(false);
        tf_tempoinicial.setEnabled(false);
        rd_cm.setEnabled(false);
        rd_m.setEnabled(false);
        rd_km.setEnabled(false);
        rd_s.setEnabled(false);
        rd_min.setEnabled(false);
        rd_h.setEnabled(false);
        lb_res.setVisible(false);
        lb_res2.setVisible(false);
        lb_res3.setVisible(false);
        lb_res4.setVisible(false);
        lb_res5.setVisible(false);
        lb_res6.setVisible(false);
        lb_res7.setVisible(false);
        lb_res8.setVisible(false);
        lb_res9.setVisible(false);
        lb_res10.setVisible(false);
        lb_resus6.setVisible(false);
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
        jLabel14 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tf_tempoinicial = new javax.swing.JTextField();
        tf_espacoinicial = new javax.swing.JTextField();
        tf_espacofinal = new javax.swing.JTextField();
        tf_tempofinal = new javax.swing.JTextField();
        tf_velofinal = new javax.swing.JTextField();
        tf_veloinicial = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        rd_velocidade = new javax.swing.JRadioButton();
        rd_posinicial = new javax.swing.JRadioButton();
        rd_tempo = new javax.swing.JRadioButton();
        rd_posfinal = new javax.swing.JRadioButton();
        pn_resultado = new javax.swing.JPanel();
        lb_resultado5 = new javax.swing.JLabel();
        lb_resultado4 = new javax.swing.JLabel();
        lb_resultado3 = new javax.swing.JLabel();
        lb_resultado2 = new javax.swing.JLabel();
        lb_resultado = new javax.swing.JLabel();
        lb_res10 = new javax.swing.JLabel();
        lb_res9 = new javax.swing.JLabel();
        lb_res8 = new javax.swing.JLabel();
        lb_res = new javax.swing.JLabel();
        lb_res6 = new javax.swing.JLabel();
        lb_res2 = new javax.swing.JLabel();
        lb_res3 = new javax.swing.JLabel();
        lb_res7 = new javax.swing.JLabel();
        lb_res4 = new javax.swing.JLabel();
        lb_resus6 = new javax.swing.JLabel();
        lb_res5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_menu = new javax.swing.JMenu();
        menu_iniciarr = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menu_sair = new javax.swing.JMenuItem();

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
                .addGap(51, 51, 51))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_voltar, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
            .addComponent(lb_limpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lb_paginainicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lb_calcular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(202, 233, 255));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Deslocamento.png"))); // NOI18N

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logoÊ.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(354, 354, 354)
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
        rd_min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rd_minMouseClicked(evt);
            }
        });
        rd_min.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd_minActionPerformed(evt);
            }
        });

        rd_h.setBackground(new java.awt.Color(202, 233, 255));
        rd_h.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        rd_h.setText("h");
        rd_h.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rd_hMouseClicked(evt);
            }
        });
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
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rd_s, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rd_min)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rd_h, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rd_cm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rd_m, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rd_km)
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
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
                .addContainerGap())
        );

        jPanel9.setBackground(new java.awt.Color(202, 233, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel8.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel8.setText("V:");
        jLabel8.setToolTipText("Velocidade Final");

        jLabel14.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel14.setText("S0:");
        jLabel14.setToolTipText("Posição Inicial");

        jLabel10.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel10.setText("S:");
        jLabel10.setToolTipText("Posição Final");

        jLabel11.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel11.setText("T:");
        jLabel11.setToolTipText("Tempo Final");

        jLabel12.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel12.setText("T0:");
        jLabel12.setToolTipText("Tempo Inicial");

        tf_tempoinicial.setBackground(new java.awt.Color(202, 233, 255));
        tf_tempoinicial.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        tf_tempoinicial.setToolTipText("Tempo Inicial");

        tf_espacoinicial.setBackground(new java.awt.Color(202, 233, 255));
        tf_espacoinicial.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        tf_espacoinicial.setToolTipText("Espaço Inicial");
        tf_espacoinicial.setName("Espaço Inicial"); // NOI18N

        tf_espacofinal.setBackground(new java.awt.Color(202, 233, 255));
        tf_espacofinal.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        tf_espacofinal.setToolTipText("Espaço Final");
        tf_espacofinal.setName("Espaço Final"); // NOI18N

        tf_tempofinal.setBackground(new java.awt.Color(202, 233, 255));
        tf_tempofinal.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        tf_tempofinal.setToolTipText("Tempo Final");

        tf_velofinal.setBackground(new java.awt.Color(202, 233, 255));
        tf_velofinal.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        tf_velofinal.setToolTipText("Velocidade Final");

        tf_veloinicial.setBackground(new java.awt.Color(202, 233, 255));
        tf_veloinicial.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        tf_veloinicial.setToolTipText("Velocidade Inicial");

        jLabel17.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel17.setText("V0:");
        jLabel17.setToolTipText("Velocidade Inicial");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_velofinal, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                            .addComponent(tf_espacoinicial)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_veloinicial, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_tempoinicial)
                    .addComponent(tf_tempofinal, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_espacofinal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_veloinicial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_espacofinal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_velofinal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_tempoinicial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf_espacoinicial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tf_tempofinal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(202, 233, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Marque a opção que deseja calcular", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 0, 18))); // NOI18N

        rd_velocidade.setBackground(new java.awt.Color(202, 233, 255));
        rd_velocidade.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        rd_velocidade.setText("Velocidade");
        rd_velocidade.setBorder(null);
        rd_velocidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rd_velocidadeMouseClicked(evt);
            }
        });
        rd_velocidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd_velocidadeActionPerformed(evt);
            }
        });

        rd_posinicial.setBackground(new java.awt.Color(202, 233, 255));
        rd_posinicial.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        rd_posinicial.setText("Posição Inicial");
        rd_posinicial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rd_posinicialMouseClicked(evt);
            }
        });
        rd_posinicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd_posinicialActionPerformed(evt);
            }
        });

        rd_tempo.setBackground(new java.awt.Color(202, 233, 255));
        rd_tempo.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        rd_tempo.setText("Tempo");
        rd_tempo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rd_tempoMouseClicked(evt);
            }
        });
        rd_tempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd_tempoActionPerformed(evt);
            }
        });

        rd_posfinal.setBackground(new java.awt.Color(202, 233, 255));
        rd_posfinal.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        rd_posfinal.setText("Posição Final");
        rd_posfinal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rd_posfinalMouseClicked(evt);
            }
        });
        rd_posfinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd_posfinalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rd_velocidade)
                    .addComponent(rd_tempo))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rd_posfinal)
                    .addComponent(rd_posinicial))
                .addGap(0, 93, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rd_velocidade)
                    .addComponent(rd_posinicial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rd_posfinal)
                    .addComponent(rd_tempo)))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pn_resultado.setBackground(new java.awt.Color(202, 233, 255));
        pn_resultado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 0, 24))); // NOI18N
        pn_resultado.setAlignmentX(0.6F);
        pn_resultado.setDoubleBuffered(false);

        lb_resultado5.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lb_resultado5.setText("S = ");

        lb_resultado4.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lb_resultado4.setText("S = ");

        lb_resultado3.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lb_resultado3.setText("S = ");

        lb_resultado2.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lb_resultado2.setText("S = ");

        lb_resultado.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lb_resultado.setText("S = S0 + V . T");

        lb_res10.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lb_res10.setText("S - S0");

        lb_res9.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lb_res9.setText("V  =  -------");

        lb_res8.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lb_res8.setText("T - T0");

        lb_res.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lb_res.setText("S - S0");

        lb_res6.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lb_res6.setText("V  =  -------------");

        lb_res2.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lb_res2.setText("T - T0");

        lb_res3.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lb_res3.setText("S - S0");

        lb_res7.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lb_res7.setText("V =  -------------");

        lb_res4.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lb_res4.setText("T - T0");

        lb_resus6.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lb_resus6.setText("V = ");

        lb_res5.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N

        javax.swing.GroupLayout pn_resultadoLayout = new javax.swing.GroupLayout(pn_resultado);
        pn_resultado.setLayout(pn_resultadoLayout);
        pn_resultadoLayout.setHorizontalGroup(
            pn_resultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_resultadoLayout.createSequentialGroup()
                .addGroup(pn_resultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_res4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_res7, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_res3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_resus6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_res5, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pn_resultadoLayout.createSequentialGroup()
                .addGroup(pn_resultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_resultadoLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(lb_res8, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_resultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lb_res9, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lb_res10, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pn_resultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_res, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_res2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_res6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(pn_resultadoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pn_resultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_resultadoLayout.createSequentialGroup()
                        .addComponent(lb_resultado5, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(lb_resultado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_resultado3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_resultado4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_resultado2, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        pn_resultadoLayout.setVerticalGroup(
            pn_resultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_resultadoLayout.createSequentialGroup()
                .addComponent(lb_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_resultado2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_resultado3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_resultado4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_resultado5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_resultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_resultadoLayout.createSequentialGroup()
                        .addComponent(lb_res10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_res9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_res8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lb_res, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pn_resultadoLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(lb_res6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_res2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_res3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_resultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pn_resultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lb_res7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lb_resus6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lb_res5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_res4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pn_resultadoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lb_res3, lb_res4, lb_res5, lb_res7, lb_resus6});

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/F2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(1223, 1223, 1223)
                .addComponent(pn_cinematica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_dinamica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(490, 490, 490)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(415, 415, 415))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pn_resultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pn_dinamica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pn_cinematica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pn_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
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

        menu_menu.setText("Menu");

        menu_iniciarr.setText("Iniciar");
        menu_iniciarr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_iniciarrActionPerformed(evt);
            }
        });
        menu_menu.add(menu_iniciarr);
        menu_menu.add(jSeparator1);

        menu_sair.setText("Sair");
        menu_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_sairActionPerformed(evt);
            }
        });
        menu_menu.add(menu_sair);

        jMenuBar1.add(menu_menu);

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

    private void menu_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_sairActionPerformed
        dispose();
    }//GEN-LAST:event_menu_sairActionPerformed

    private void menu_iniciarrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_iniciarrActionPerformed
        this.dispose();
        new TelaPrincipal().setVisible(true);
    }//GEN-LAST:event_menu_iniciarrActionPerformed

    private void pn_dinamicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_dinamicaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pn_dinamicaMouseClicked

    private void rd_cmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rd_cmMouseClicked
        rd_m.setSelected(false);
        rd_km.setSelected(false);
    }//GEN-LAST:event_rd_cmMouseClicked

    private void rd_cmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_cmActionPerformed
        if (rd_min.isSelected()) {
            if (!tf_tempoinicial.getText().isEmpty()) {
                tf_tempoinicial.setText((Double.parseDouble(tf_tempoinicial.getText()) / 60) + "");
            }
            if (!tf_tempofinal.getText().isEmpty()) {
                tf_tempofinal.setText((Double.parseDouble(tf_tempofinal.getText()) / 60) + "");
            }
        } else if (rd_s.isSelected()) {
            if (!tf_tempoinicial.getText().isEmpty()) {
                tf_tempoinicial.setText((Double.parseDouble(tf_tempoinicial.getText()) / 3600) + "");
            }
            if (!tf_tempofinal.getText().isEmpty()) {
                tf_tempofinal.setText((Double.parseDouble(tf_tempofinal.getText()) / 3600) + "");
            }
        }
        rd_s.setSelected(false);
        rd_min.setSelected(false);
        if (rd_tempo.isSelected()) {
            rd_velocidade.setSelected(false);
            rd_posinicial.setSelected(false);
            tf_velofinal.setEnabled(true);
            tf_veloinicial.setEnabled(true);
            tf_espacofinal.setEnabled(true);
            tf_espacoinicial.setEnabled(true);
            tf_tempofinal.setEnabled(false);
            tf_tempoinicial.setEnabled(false);
        }
        if (rd_posinicial.isSelected()) {
            rd_tempo.setSelected(false);
            rd_velocidade.setSelected(false);
            tf_velofinal.setEnabled(true);
            tf_veloinicial.setEnabled(true);
            tf_espacofinal.setEnabled(true);
            tf_espacoinicial.setEnabled(false);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }
        if (rd_posfinal.isSelected()) {
            rd_tempo.setSelected(false);
            rd_velocidade.setSelected(false);
            tf_velofinal.setEnabled(true);
            tf_veloinicial.setEnabled(true);
            tf_espacofinal.setEnabled(false);
            tf_espacoinicial.setEnabled(true);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }
        if (rd_velocidade.isSelected()) {
            rd_tempo.setSelected(false);
            rd_posinicial.setSelected(false);
            tf_velofinal.setEnabled(false);
            tf_veloinicial.setEnabled(false);
            tf_espacofinal.setEnabled(true);
            tf_espacoinicial.setEnabled(true);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }
    }//GEN-LAST:event_rd_cmActionPerformed

    private void rd_mMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rd_mMouseClicked
        rd_cm.setSelected(false);
        rd_km.setSelected(false);
    }//GEN-LAST:event_rd_mMouseClicked

    private void rd_mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_mActionPerformed
        if (rd_h.isSelected()) {
            if (!tf_tempoinicial.getText().isEmpty()) {
                tf_tempoinicial.setText((Double.parseDouble(tf_tempoinicial.getText()) * 60) + "");
            }
            if (!tf_tempofinal.getText().isEmpty()) {
                tf_tempofinal.setText((Double.parseDouble(tf_tempofinal.getText()) * 60) + "");
            }
        }
        if (rd_s.isSelected()) {
            if (!tf_tempoinicial.getText().isEmpty()) {
                tf_tempoinicial.setText((Double.parseDouble(tf_tempoinicial.getText()) / 60) + "");
            }
            if (!tf_tempofinal.getText().isEmpty()) {
                tf_tempofinal.setText((Double.parseDouble(tf_tempofinal.getText()) / 60) + "");
            }
        }
        rd_h.setSelected(false);
        rd_s.setSelected(false);
        if (rd_tempo.isSelected()) {
            rd_velocidade.setSelected(false);
            rd_posinicial.setSelected(false);
            tf_velofinal.setEnabled(true);
            tf_veloinicial.setEnabled(true);
            tf_espacofinal.setEnabled(true);
            tf_espacoinicial.setEnabled(true);
            tf_tempofinal.setEnabled(false);
            tf_tempoinicial.setEnabled(false);
        }
        if (rd_posinicial.isSelected()) {
            rd_tempo.setSelected(false);
            rd_velocidade.setSelected(false);
            tf_velofinal.setEnabled(true);
            tf_veloinicial.setEnabled(true);
            tf_espacofinal.setEnabled(true);
            tf_espacoinicial.setEnabled(false);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }
        if (rd_posfinal.isSelected()) {
            rd_tempo.setSelected(false);
            rd_velocidade.setSelected(false);
            tf_velofinal.setEnabled(true);
            tf_veloinicial.setEnabled(true);
            tf_espacofinal.setEnabled(false);
            tf_espacoinicial.setEnabled(true);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }
        if (rd_velocidade.isSelected()) {
            rd_tempo.setSelected(false);
            rd_posinicial.setSelected(false);
            tf_velofinal.setEnabled(false);
            tf_veloinicial.setEnabled(false);
            tf_espacofinal.setEnabled(true);
            tf_espacoinicial.setEnabled(true);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }
    }//GEN-LAST:event_rd_mActionPerformed

    private void rd_kmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rd_kmMouseClicked
        rd_m.setSelected(false);
        rd_cm.setSelected(false);
    }//GEN-LAST:event_rd_kmMouseClicked

    private void rd_kmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_kmActionPerformed
        if (rd_cm.isSelected()) {
            if (!tf_espacoinicial.getText().isEmpty()) {
                tf_espacoinicial.setText((Double.parseDouble(tf_espacoinicial.getText()) / 100000) + "");
            }
            if (!tf_espacofinal.getText().isEmpty()) {
                tf_espacofinal.setText((Double.parseDouble(tf_espacofinal.getText()) / 100000) + "");
            }
        }
        if (rd_m.isSelected()) {
            if (!tf_espacoinicial.getText().isEmpty()) {
                tf_espacoinicial.setText((Double.parseDouble(tf_espacoinicial.getText()) / 1000) + "");
            }
            if (!tf_espacofinal.getText().isEmpty()) {
                tf_espacofinal.setText((Double.parseDouble(tf_espacofinal.getText()) / 1000) + "");
            }
        }
        rd_m.setSelected(false);
        rd_cm.setSelected(false);
        if (rd_tempo.isSelected()) {
            rd_velocidade.setSelected(false);
            rd_posinicial.setSelected(false);
            tf_velofinal.setEnabled(true);
            tf_veloinicial.setEnabled(true);
            tf_espacofinal.setEnabled(true);
            tf_espacoinicial.setEnabled(true);
            tf_tempofinal.setEnabled(false);
            tf_tempoinicial.setEnabled(false);
        }
        if (rd_posinicial.isSelected()) {
            rd_tempo.setSelected(false);
            rd_velocidade.setSelected(false);
            tf_velofinal.setEnabled(true);
            tf_veloinicial.setEnabled(true);
            tf_espacofinal.setEnabled(true);
            tf_espacoinicial.setEnabled(false);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }
        if (rd_posfinal.isSelected()) {
            rd_tempo.setSelected(false);
            rd_velocidade.setSelected(false);
            tf_velofinal.setEnabled(true);
            tf_veloinicial.setEnabled(true);
            tf_espacofinal.setEnabled(false);
            tf_espacoinicial.setEnabled(true);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }
        if (rd_velocidade.isSelected()) {
            rd_tempo.setSelected(false);
            rd_posinicial.setSelected(false);
            tf_velofinal.setEnabled(false);
            tf_veloinicial.setEnabled(false);
            tf_espacofinal.setEnabled(true);
            tf_espacoinicial.setEnabled(true);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }
    }//GEN-LAST:event_rd_kmActionPerformed

    private void rd_sMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rd_sMouseClicked
        rd_h.setSelected(false);
        rd_min.setSelected(false);
    }//GEN-LAST:event_rd_sMouseClicked

    private void rd_sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_sActionPerformed
        if (rd_h.isSelected()) {
            if (!tf_tempoinicial.getText().isEmpty()) {
                tf_tempoinicial.setText((Double.parseDouble(tf_tempoinicial.getText()) * 3600) + "");
            }
            if (!tf_tempofinal.getText().isEmpty()) {
                tf_tempofinal.setText((Double.parseDouble(tf_tempofinal.getText()) * 3600) + "");
            }
        }
        if (rd_min.isSelected()) {
            if (!tf_tempoinicial.getText().isEmpty()) {
                tf_tempoinicial.setText((Double.parseDouble(tf_tempoinicial.getText()) * 60) + "");
            }
            if (!tf_tempofinal.getText().isEmpty()) {
                tf_tempofinal.setText((Double.parseDouble(tf_tempofinal.getText()) * 60) + "");
            }
        }
        rd_min.setSelected(false);
        rd_h.setSelected(false);
        if (rd_tempo.isSelected()) {
            rd_velocidade.setSelected(false);
            rd_posinicial.setSelected(false);
            tf_velofinal.setEnabled(true);
            tf_veloinicial.setEnabled(true);
            tf_espacofinal.setEnabled(true);
            tf_espacoinicial.setEnabled(true);
            tf_tempofinal.setEnabled(false);
            tf_tempoinicial.setEnabled(false);
        }
        if (rd_posinicial.isSelected()) {
            rd_tempo.setSelected(false);
            rd_velocidade.setSelected(false);
            tf_velofinal.setEnabled(true);
            tf_veloinicial.setEnabled(true);
            tf_espacofinal.setEnabled(true);
            tf_espacoinicial.setEnabled(false);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }
        if (rd_posfinal.isSelected()) {
            rd_tempo.setSelected(false);
            rd_velocidade.setSelected(false);
            tf_velofinal.setEnabled(true);
            tf_veloinicial.setEnabled(true);
            tf_espacofinal.setEnabled(false);
            tf_espacoinicial.setEnabled(true);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }
        if (rd_velocidade.isSelected()) {
            rd_tempo.setSelected(false);
            rd_posinicial.setSelected(false);
            tf_velofinal.setEnabled(false);
            tf_veloinicial.setEnabled(false);
            tf_espacofinal.setEnabled(true);
            tf_espacoinicial.setEnabled(true);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }
    }//GEN-LAST:event_rd_sActionPerformed

    private void rd_minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rd_minMouseClicked
        rd_h.setSelected(false);
        rd_s.setSelected(false);
    }//GEN-LAST:event_rd_minMouseClicked

    private void rd_minActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_minActionPerformed
        if (rd_h.isSelected()) {
            if (!tf_tempoinicial.getText().isEmpty()) {
                tf_tempoinicial.setText((Double.parseDouble(tf_tempoinicial.getText()) * 60) + "");
            }
            if (!tf_tempofinal.getText().isEmpty()) {
                tf_tempofinal.setText((Double.parseDouble(tf_tempofinal.getText()) * 60) + "");
            }
        }
        if (rd_s.isSelected()) {
            if (!tf_tempoinicial.getText().isEmpty()) {
                tf_tempoinicial.setText((Double.parseDouble(tf_tempoinicial.getText()) / 60) + "");
            }
            if (!tf_tempofinal.getText().isEmpty()) {
                tf_tempofinal.setText((Double.parseDouble(tf_tempofinal.getText()) / 60) + "");
            }
        }
        rd_h.setSelected(false);
        rd_s.setSelected(false);
        if (rd_tempo.isSelected()) {
            rd_velocidade.setSelected(false);
            rd_posinicial.setSelected(false);
            tf_velofinal.setEnabled(true);
            tf_veloinicial.setEnabled(true);
            tf_espacofinal.setEnabled(true);
            tf_espacoinicial.setEnabled(true);
            tf_tempofinal.setEnabled(false);
            tf_tempoinicial.setEnabled(false);
        }
        if (rd_posinicial.isSelected()) {
            rd_tempo.setSelected(false);
            rd_velocidade.setSelected(false);
            tf_velofinal.setEnabled(true);
            tf_veloinicial.setEnabled(true);
            tf_espacofinal.setEnabled(true);
            tf_espacoinicial.setEnabled(false);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }
        if (rd_posfinal.isSelected()) {
            rd_tempo.setSelected(false);
            rd_velocidade.setSelected(false);
            tf_velofinal.setEnabled(true);
            tf_veloinicial.setEnabled(true);
            tf_espacofinal.setEnabled(false);
            tf_espacoinicial.setEnabled(true);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }
        if (rd_velocidade.isSelected()) {
            rd_tempo.setSelected(false);
            rd_posinicial.setSelected(false);
            tf_velofinal.setEnabled(false);
            tf_veloinicial.setEnabled(false);
            tf_espacofinal.setEnabled(true);
            tf_espacoinicial.setEnabled(true);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }
    }//GEN-LAST:event_rd_minActionPerformed

    private void rd_hMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rd_hMouseClicked
        rd_s.setSelected(false);
        rd_min.setSelected(false);
    }//GEN-LAST:event_rd_hMouseClicked

    private void rd_hActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_hActionPerformed
        if (rd_min.isSelected()) {
            if (!tf_tempoinicial.getText().isEmpty()) {
                tf_tempoinicial.setText((Double.parseDouble(tf_tempoinicial.getText()) / 60) + "");
            }
            if (!tf_tempofinal.getText().isEmpty()) {
                tf_tempofinal.setText((Double.parseDouble(tf_tempofinal.getText()) / 60) + "");
            }
        } else if (rd_s.isSelected()) {
            if (!tf_tempoinicial.getText().isEmpty()) {
                tf_tempoinicial.setText((Double.parseDouble(tf_tempoinicial.getText()) / 3600) + "");
            }
            if (!tf_tempofinal.getText().isEmpty()) {
                tf_tempofinal.setText((Double.parseDouble(tf_tempofinal.getText()) / 3600) + "");
            }
        }
        rd_s.setSelected(false);
        rd_min.setSelected(false);
        if (rd_tempo.isSelected()) {
            rd_velocidade.setSelected(false);
            rd_posinicial.setSelected(false);
            tf_velofinal.setEnabled(true);
            tf_veloinicial.setEnabled(true);
            tf_espacofinal.setEnabled(true);
            tf_espacoinicial.setEnabled(true);
            tf_tempofinal.setEnabled(false);
            tf_tempoinicial.setEnabled(false);
        }
        if (rd_posinicial.isSelected()) {
            rd_tempo.setSelected(false);
            rd_velocidade.setSelected(false);
            tf_velofinal.setEnabled(true);
            tf_veloinicial.setEnabled(true);
            tf_espacofinal.setEnabled(true);
            tf_espacoinicial.setEnabled(false);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }
        if (rd_posfinal.isSelected()) {
            rd_tempo.setSelected(false);
            rd_velocidade.setSelected(false);
            tf_velofinal.setEnabled(true);
            tf_veloinicial.setEnabled(true);
            tf_espacofinal.setEnabled(false);
            tf_espacoinicial.setEnabled(true);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }
        if (rd_velocidade.isSelected()) {
            rd_tempo.setSelected(false);
            rd_posinicial.setSelected(false);
            tf_velofinal.setEnabled(false);
            tf_veloinicial.setEnabled(false);
            tf_espacofinal.setEnabled(true);
            tf_espacoinicial.setEnabled(true);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }
    }//GEN-LAST:event_rd_hActionPerformed

    private void lb_calcularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_calcularMouseClicked
        calculo();        // TODO add your handling code here:
    }//GEN-LAST:event_lb_calcularMouseClicked

    private void lb_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_voltarMouseClicked
        this.dispose();
        new TelaCalculosEscolhaCinematica().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_lb_voltarMouseClicked

    private void lb_paginainicialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_paginainicialMouseClicked
        this.dispose();
        new TelaPrincipal().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_lb_paginainicialMouseClicked

    private void rd_velocidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rd_velocidadeMouseClicked
        limpar();
    }//GEN-LAST:event_rd_velocidadeMouseClicked

    private void rd_velocidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_velocidadeActionPerformed
        rd_tempo.setSelected(false);
        rd_posinicial.setSelected(false);
        rd_posfinal.setSelected(false);
        rd_cm.setEnabled(true);
        rd_m.setEnabled(true);
        rd_km.setEnabled(true);
        rd_s.setEnabled(true);
        rd_min.setEnabled(true);
        rd_h.setEnabled(true);
        tf_espacofinal.setEnabled(false);
        tf_espacoinicial.setEnabled(false);
        tf_tempofinal.setEnabled(false);
        tf_tempoinicial.setEnabled(false);
        tf_velofinal.setEnabled(false);
        tf_veloinicial.setEnabled(false);
        lb_res.setVisible(true);
        lb_res2.setVisible(true);
        lb_res3.setVisible(true);
        lb_res4.setVisible(true);
        lb_res5.setVisible(true);
        lb_res6.setVisible(true);
        lb_res7.setVisible(true);
        lb_res8.setVisible(true);
        lb_res9.setVisible(true);
        lb_res10.setVisible(true);
        lb_resus6.setVisible(true);
        lb_resultado.setVisible(false);
        lb_resultado2.setVisible(false);
        lb_resultado3.setVisible(false);
        lb_resultado4.setVisible(false);
        lb_resultado5.setVisible(false);
    }//GEN-LAST:event_rd_velocidadeActionPerformed

    private void rd_posinicialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rd_posinicialMouseClicked
        limpar();
        lb_resultado.setText("S = S0 + V . T");
    }//GEN-LAST:event_rd_posinicialMouseClicked

    private void rd_posinicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_posinicialActionPerformed
        limpar();
        lb_resultado.setText("S0 = S / V . T");
        lb_resultado2.setText("S0 = ");
        lb_resultado3.setText("S0 =");
        lb_resultado4.setText("S0 =");
        lb_resultado5.setText("S0 =");
        rd_tempo.setSelected(false);
        rd_velocidade.setSelected(false);
        rd_posfinal.setSelected(false);
        rd_cm.setEnabled(true);
        rd_m.setEnabled(true);
        rd_km.setEnabled(true);
        rd_s.setEnabled(true);
        rd_min.setEnabled(true);
        rd_h.setEnabled(true);
        tf_espacofinal.setEnabled(false);
        tf_espacoinicial.setEnabled(false);
        tf_tempofinal.setEnabled(false);
        tf_tempoinicial.setEnabled(false);
        tf_velofinal.setEnabled(false);
        tf_veloinicial.setEnabled(false);
        lb_res.setVisible(false);
        lb_res2.setVisible(false);
        lb_res3.setVisible(false);
        lb_res4.setVisible(false);
        lb_res5.setVisible(false);
        lb_res6.setVisible(false);
        lb_res7.setVisible(false);
        lb_res8.setVisible(false);
        lb_res9.setVisible(false);
        lb_res10.setVisible(false);
        lb_resus6.setVisible(false);
        lb_resultado.setVisible(true);
        lb_resultado2.setVisible(true);
        lb_resultado3.setVisible(true);
        lb_resultado4.setVisible(true);
    }//GEN-LAST:event_rd_posinicialActionPerformed

    private void rd_tempoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rd_tempoMouseClicked
        limpar();
        lb_resultado.setText("T = S / V");
        lb_resultado2.setText("T = ");
        lb_resultado3.setText("T = ");
        lb_resultado4.setText("T = ");
        lb_resultado5.setText("T = ");
    }//GEN-LAST:event_rd_tempoMouseClicked

    private void rd_tempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_tempoActionPerformed
        rd_velocidade.setSelected(false);
        rd_posinicial.setSelected(false);
        rd_posfinal.setSelected(false);
        rd_cm.setEnabled(true);
        rd_m.setEnabled(true);
        rd_km.setEnabled(true);
        rd_s.setEnabled(true);
        rd_min.setEnabled(true);
        rd_h.setEnabled(true);
        tf_espacofinal.setEnabled(false);
        tf_espacoinicial.setEnabled(false);
        tf_tempofinal.setEnabled(false);
        tf_tempoinicial.setEnabled(false);
        tf_velofinal.setEnabled(false);
        tf_veloinicial.setEnabled(false);
        lb_res.setVisible(false);
        lb_res2.setVisible(false);
        lb_res3.setVisible(false);
        lb_res4.setVisible(false);
        lb_res5.setVisible(false);
        lb_res6.setVisible(false);
        lb_res7.setVisible(false);
        lb_res8.setVisible(false);
        lb_res9.setVisible(false);
        lb_res10.setVisible(false);
        lb_resus6.setVisible(false);
        lb_resultado.setVisible(true);
        lb_resultado2.setVisible(true);
        lb_resultado3.setVisible(true);
        lb_resultado4.setVisible(true);
    }//GEN-LAST:event_rd_tempoActionPerformed

    private void rd_posfinalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rd_posfinalMouseClicked
        limpar();
        lb_resultado.setText("S0 = S / V . T");
        lb_resultado2.setText("S0 =");
        lb_resultado3.setText("S0 =");
        lb_resultado4.setText("S0 =");
        lb_resultado5.setText("S0 =");
    }//GEN-LAST:event_rd_posfinalMouseClicked

    private void rd_posfinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_posfinalActionPerformed
        rd_tempo.setSelected(false);
        rd_velocidade.setSelected(false);
        rd_posinicial.setSelected(false);
        rd_cm.setEnabled(true);
        rd_m.setEnabled(true);
        rd_km.setEnabled(true);
        rd_s.setEnabled(true);
        rd_min.setEnabled(true);
        rd_h.setEnabled(true);
        tf_espacofinal.setEnabled(false);
        tf_espacoinicial.setEnabled(false);
        tf_tempofinal.setEnabled(false);
        tf_tempoinicial.setEnabled(false);
        tf_velofinal.setEnabled(false);
        tf_veloinicial.setEnabled(false);
        lb_res.setVisible(false);
        lb_res2.setVisible(false);
        lb_res3.setVisible(false);
        lb_res4.setVisible(false);
        lb_res5.setVisible(false);
        lb_res6.setVisible(false);
        lb_res7.setVisible(false);
        lb_res8.setVisible(false);
        lb_res9.setVisible(false);
        lb_res10.setVisible(false);
        lb_resus6.setVisible(false);
        lb_resultado.setVisible(true);
        lb_resultado2.setVisible(true);
        lb_resultado3.setVisible(true);
        lb_resultado4.setVisible(true);
    }//GEN-LAST:event_rd_posfinalActionPerformed

    private void lb_limparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_limparMouseClicked
        limpar();        // TODO add your handling code here:
    }//GEN-LAST:event_lb_limparMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCalculoFHDeslocamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel estudar_estatica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lb_calcular;
    private javax.swing.JLabel lb_limpar;
    private javax.swing.JLabel lb_paginainicial;
    private javax.swing.JLabel lb_res;
    private javax.swing.JLabel lb_res10;
    private javax.swing.JLabel lb_res2;
    private javax.swing.JLabel lb_res3;
    private javax.swing.JLabel lb_res4;
    private javax.swing.JLabel lb_res5;
    private javax.swing.JLabel lb_res6;
    private javax.swing.JLabel lb_res7;
    private javax.swing.JLabel lb_res8;
    private javax.swing.JLabel lb_res9;
    private javax.swing.JLabel lb_resultado;
    private javax.swing.JLabel lb_resultado2;
    private javax.swing.JLabel lb_resultado3;
    private javax.swing.JLabel lb_resultado4;
    private javax.swing.JLabel lb_resultado5;
    private javax.swing.JLabel lb_resus6;
    private javax.swing.JLabel lb_voltar;
    private javax.swing.JMenuItem menu_iniciarr;
    private javax.swing.JMenu menu_menu;
    private javax.swing.JMenuItem menu_sair;
    private javax.swing.JPanel pn_cinematica;
    private javax.swing.JPanel pn_dinamica;
    private javax.swing.JPanel pn_resultado;
    private javax.swing.JRadioButton rd_cm;
    private javax.swing.JRadioButton rd_h;
    private javax.swing.JRadioButton rd_km;
    private javax.swing.JRadioButton rd_m;
    private javax.swing.JRadioButton rd_min;
    private javax.swing.JRadioButton rd_posfinal;
    private javax.swing.JRadioButton rd_posinicial;
    private javax.swing.JRadioButton rd_s;
    private javax.swing.JRadioButton rd_tempo;
    private javax.swing.JRadioButton rd_velocidade;
    private javax.swing.JTextField tf_espacofinal;
    private javax.swing.JTextField tf_espacoinicial;
    private javax.swing.JTextField tf_tempofinal;
    private javax.swing.JTextField tf_tempoinicial;
    private javax.swing.JTextField tf_velofinal;
    private javax.swing.JTextField tf_veloinicial;
    // End of variables declaration//GEN-END:variables

    public void calculo() {
        CalculoVelocidadeClass calculoVelocidadeClass = new CalculoVelocidadeClass();

        if (rd_velocidade.isSelected()) {
            if (!tf_espacoinicial.getText().isEmpty() && !tf_tempoinicial.getText().isEmpty()
                    && !tf_espacofinal.getText().isEmpty() && !tf_tempofinal.getText().isEmpty()) {
                calculoVelocidadeClass.setEspacoInicial(Double.parseDouble(tf_espacoinicial.getText()));
                calculoVelocidadeClass.setEspacoFinal(Double.parseDouble(tf_espacofinal.getText()));
                calculoVelocidadeClass.setTempoInicial(Double.parseDouble(tf_tempoinicial.getText()));
                calculoVelocidadeClass.setTempoFinal(Double.parseDouble(tf_tempofinal.getText()));
                Double f = Double.parseDouble(tf_espacofinal.getText());
                Double g = Double.parseDouble(tf_espacoinicial.getText());
                Double h = Double.parseDouble(tf_tempofinal.getText());
                Double i = Double.parseDouble(tf_tempoinicial.getText());
                String a = decimal.format(f);
                String b = decimal.format(g);
                String c = decimal.format(h);
                String d = decimal.format(i);
                lb_res.setText("" + a + "  -  " + b);
                lb_res2.setText("" + c + "  -  " + d);
                String k = decimal.format(calculoVelocidadeClass.aux(calculoVelocidadeClass.getEspacoFinal(),
                        calculoVelocidadeClass.getEspacoInicial()));
                lb_res3.setText("" + k);
                String l = decimal.format(calculoVelocidadeClass.aux(calculoVelocidadeClass.getTempoFinal(),
                        calculoVelocidadeClass.getTempoInicial()));
                lb_res4.setText("" + l);

                if (rd_km.isSelected()) {
                    if (rd_s.isSelected()) {
                        String valorFormatado = decimal.format(calculoVelocidadeClass.media(
                                calculoVelocidadeClass.getEspacoFinal(), calculoVelocidadeClass.getEspacoInicial(),
                                calculoVelocidadeClass.getTempoFinal(), calculoVelocidadeClass.getTempoInicial()));
                        lb_resus6.setText("VM: ");
                        lb_res5.setText("" + valorFormatado + " Km/s");
                    }
                    if (rd_min.isSelected()) {
                        String valorFormatado = decimal.format(calculoVelocidadeClass.media(
                                calculoVelocidadeClass.getEspacoFinal(), calculoVelocidadeClass.getEspacoInicial(),
                                calculoVelocidadeClass.getTempoFinal(), calculoVelocidadeClass.getTempoInicial()));
                        lb_resus6.setText("VM: ");
                        lb_res5.setText("" + valorFormatado + " Km/min");
                    }
                    if (rd_h.isSelected()) {
                        String valorFormatado = decimal.format(calculoVelocidadeClass.media(
                                calculoVelocidadeClass.getEspacoFinal(), calculoVelocidadeClass.getEspacoInicial(),
                                calculoVelocidadeClass.getTempoFinal(), calculoVelocidadeClass.getTempoInicial()));
                        lb_resus6.setText("VM: ");
                        lb_res5.setText("" + valorFormatado + " Km/h");
                    }
                }
                if (rd_m.isSelected()) {
                    if (rd_s.isSelected()) {
                        String valorFormatado = decimal.format(calculoVelocidadeClass.media(
                                calculoVelocidadeClass.getEspacoFinal(), calculoVelocidadeClass.getEspacoInicial(),
                                calculoVelocidadeClass.getTempoFinal(), calculoVelocidadeClass.getTempoInicial()));
                        lb_resus6.setText("VM: ");
                        lb_res5.setText("" + valorFormatado + " m/s");
                    }
                    if (rd_min.isSelected()) {
                        String valorFormatado = decimal.format(calculoVelocidadeClass.media(
                                calculoVelocidadeClass.getEspacoFinal(), calculoVelocidadeClass.getEspacoInicial(),
                                calculoVelocidadeClass.getTempoFinal(), calculoVelocidadeClass.getTempoInicial()));
                        lb_resus6.setText("VM: ");
                        lb_res5.setText("" + valorFormatado + " m/min");
                    }
                    if (rd_h.isSelected()) {
                        String valorFormatado = decimal.format(calculoVelocidadeClass.media(
                                calculoVelocidadeClass.getEspacoFinal(), calculoVelocidadeClass.getEspacoInicial(),
                                calculoVelocidadeClass.getTempoFinal(), calculoVelocidadeClass.getTempoInicial()));
                        lb_resus6.setText("VM: ");
                        lb_res5.setText("" + valorFormatado + " m/h");
                    }
                }
                if (rd_cm.isSelected()) {
                    if (rd_s.isSelected()) {
                        String valorFormatado = decimal.format(calculoVelocidadeClass.media(
                                calculoVelocidadeClass.getEspacoFinal(), calculoVelocidadeClass.getEspacoInicial(),
                                calculoVelocidadeClass.getTempoFinal(), calculoVelocidadeClass.getTempoInicial()));
                        lb_resus6.setText("VM: ");
                        lb_res5.setText("" + valorFormatado + " cm/s");
                    }
                    if (rd_min.isSelected()) {
                        String valorFormatado = decimal.format(calculoVelocidadeClass.media(
                                calculoVelocidadeClass.getEspacoFinal(), calculoVelocidadeClass.getEspacoInicial(),
                                calculoVelocidadeClass.getTempoFinal(), calculoVelocidadeClass.getTempoInicial()));
                        lb_resus6.setText("VM: ");
                        lb_res5.setText("" + valorFormatado + " cm/min");
                    }
                    if (rd_h.isSelected()) {
                        String valorFormatado = decimal.format(calculoVelocidadeClass.media(
                                calculoVelocidadeClass.getEspacoFinal(), calculoVelocidadeClass.getEspacoInicial(),
                                calculoVelocidadeClass.getTempoFinal(), calculoVelocidadeClass.getTempoInicial()));
                        lb_resus6.setText("VM: ");
                        lb_res5.setText("" + valorFormatado + " cm/h");
                    }
                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "Preencha os campos: espaço inicial e final, tempo inicial e final");
            }
        } else if (rd_tempo.isSelected()) {
            lb_resultado5.setVisible(false);
            if (!tf_espacoinicial.getText().isEmpty() && !tf_veloinicial.getText().isEmpty()
                    && !tf_velofinal.getText().isEmpty() && !tf_espacofinal.getText().isEmpty()) {
                calculoVelocidadeClass.setEspacoInicial(Double.parseDouble(tf_espacoinicial.getText()));
                calculoVelocidadeClass.setEspacoFinal(Double.parseDouble(tf_espacofinal.getText()));
                calculoVelocidadeClass.setVelocidadeInicial(Double.parseDouble(tf_veloinicial.getText()));
                calculoVelocidadeClass.setVelocidadeFinal(Double.parseDouble(tf_velofinal.getText()));
                lb_resultado.setText("T = (S - S0) / (V - V0)");
                Double a = Double.parseDouble(tf_espacoinicial.getText());
                Double b = Double.parseDouble(tf_espacofinal.getText());
                Double c = Double.parseDouble(tf_velofinal.getText());
                Double d = Double.parseDouble(tf_veloinicial.getText());
                String e = decimal.format(a);
                String f = decimal.format(b);
                String g = decimal.format(c);
                String h = decimal.format(d);
                lb_resultado2.setText("T = (" + f + " - " + e + ") / (" + g + " - " + h + ")");
                String k = decimal.format(calculoVelocidadeClass.aux(calculoVelocidadeClass.getVelocidadeFinal(),
                        calculoVelocidadeClass.getVelocidadeInicial()));
                String l = decimal.format(calculoVelocidadeClass.aux(calculoVelocidadeClass.getEspacoFinal(),
                        calculoVelocidadeClass.getEspacoInicial()));
                lb_resultado3.setText("T = " + l + " / " + k);

                if (rd_km.isSelected()) {
                    if (rd_s.isSelected()) {
                        Double x = calculoVelocidadeClass.media(calculoVelocidadeClass.getEspacoFinal(),
                                calculoVelocidadeClass.getEspacoInicial(),
                                calculoVelocidadeClass.getVelocidadeFinal(),
                                calculoVelocidadeClass.getVelocidadeInicial());
                        String valorFormatado = decimal.format(x);
                        lb_resultado4.setText("T =  " + valorFormatado + " Km/s");
                    }
                    if (rd_min.isSelected()) {
                        Double x = calculoVelocidadeClass.media(calculoVelocidadeClass.getEspacoFinal(),
                                calculoVelocidadeClass.getEspacoInicial(),
                                calculoVelocidadeClass.getVelocidadeFinal(),
                                calculoVelocidadeClass.getVelocidadeInicial());
                        String valorFormatado = decimal.format(x);
                        lb_resultado4.setText("T =  " + valorFormatado + " Km/min");
                    }
                    if (rd_h.isSelected()) {
                        Double x = calculoVelocidadeClass.media(calculoVelocidadeClass.getEspacoFinal(),
                                calculoVelocidadeClass.getEspacoInicial(),
                                calculoVelocidadeClass.getVelocidadeFinal(),
                                calculoVelocidadeClass.getVelocidadeInicial());
                        String valorFormatado = decimal.format(x);
                        lb_resultado4.setText("T =  " + valorFormatado + " Km/h");
                    }
                }
                if (rd_m.isSelected()) {
                    if (rd_s.isSelected()) {
                        Double x = calculoVelocidadeClass.media(calculoVelocidadeClass.getEspacoFinal(),
                                calculoVelocidadeClass.getEspacoInicial(),
                                calculoVelocidadeClass.getVelocidadeFinal(),
                                calculoVelocidadeClass.getVelocidadeInicial());
                        String valorFormatado = decimal.format(x);
                        lb_resultado4.setText("T =  " + valorFormatado + " m/s");
                    }
                    if (rd_min.isSelected()) {
                        Double x = calculoVelocidadeClass.media(calculoVelocidadeClass.getEspacoFinal(),
                                calculoVelocidadeClass.getEspacoInicial(),
                                calculoVelocidadeClass.getVelocidadeFinal(),
                                calculoVelocidadeClass.getVelocidadeInicial());
                        String valorFormatado = decimal.format(x);
                        lb_resultado4.setText("T =  " + valorFormatado + " m/min");
                    }
                    if (rd_h.isSelected()) {
                        Double x = calculoVelocidadeClass.media(calculoVelocidadeClass.getEspacoFinal(),
                                calculoVelocidadeClass.getEspacoInicial(),
                                calculoVelocidadeClass.getVelocidadeFinal(),
                                calculoVelocidadeClass.getVelocidadeInicial());
                        String valorFormatado = decimal.format(x);
                        lb_resultado4.setText("T =  " + valorFormatado + " m/h");
                    }
                }
                if (rd_cm.isSelected()) {
                    if (rd_s.isSelected()) {
                        Double x = calculoVelocidadeClass.media(calculoVelocidadeClass.getEspacoFinal(),
                                calculoVelocidadeClass.getEspacoInicial(),
                                calculoVelocidadeClass.getVelocidadeFinal(),
                                calculoVelocidadeClass.getVelocidadeInicial());
                        String valorFormatado = decimal.format(x);
                        lb_resultado4.setText("T =  " + valorFormatado + " cm/s");
                    }
                    if (rd_min.isSelected()) {
                        Double x = calculoVelocidadeClass.media(calculoVelocidadeClass.getEspacoFinal(),
                                calculoVelocidadeClass.getEspacoInicial(),
                                calculoVelocidadeClass.getVelocidadeFinal(),
                                calculoVelocidadeClass.getVelocidadeInicial());
                        String valorFormatado = decimal.format(x);
                        lb_resultado4.setText("T =  " + valorFormatado + " cm/min");
                    }
                    if (rd_h.isSelected()) {
                        Double x = calculoVelocidadeClass.media(calculoVelocidadeClass.getEspacoFinal(),
                                calculoVelocidadeClass.getEspacoInicial(),
                                calculoVelocidadeClass.getVelocidadeFinal(),
                                calculoVelocidadeClass.getVelocidadeInicial());
                        String valorFormatado = decimal.format(x);
                        lb_resultado4.setText("T =  " + valorFormatado + " cm/h");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Preencha os campos:  espaço inicial e final, velocidade inicial e final.");
            }
        } else if (rd_posinicial.isSelected()) {
            if (!tf_tempoinicial.getText().isEmpty() && !tf_veloinicial.getText().isEmpty()
                    && !tf_tempofinal.getText().isEmpty() && !tf_velofinal.getText().isEmpty()
                    && !tf_espacofinal.getText().isEmpty()) {
                calculoVelocidadeClass.setTempoInicial(Double.parseDouble(tf_tempoinicial.getText()));
                calculoVelocidadeClass.setVelocidadeInicial(Double.parseDouble(tf_veloinicial.getText()));
                calculoVelocidadeClass.setTempoFinal(Double.parseDouble(tf_tempofinal.getText()));
                calculoVelocidadeClass.setVelocidadeFinal(Double.parseDouble(tf_velofinal.getText()));
                calculoVelocidadeClass.setEspacoFinal(Double.parseDouble(tf_espacofinal.getText()));
                Double f = Double.parseDouble(tf_espacofinal.getText());
                Double g = Double.parseDouble(tf_velofinal.getText());
                Double h = Double.parseDouble(tf_veloinicial.getText());
                Double i = Double.parseDouble(tf_tempofinal.getText());
                Double j = Double.parseDouble(tf_tempoinicial.getText());
                String a = decimal.format(f);
                String b = decimal.format(g);
                String c = decimal.format(h);
                String d = decimal.format(i);
                String e = decimal.format(j);
                lb_resultado2.setText("S0 = (" + a + "  /  ((" + b
                        + " - " + c + " ) *  (" + d + " - " + e + "))");
                String k = decimal.format(calculoVelocidadeClass.aux(calculoVelocidadeClass.getVelocidadeFinal(),
                        calculoVelocidadeClass.getVelocidadeInicial()));
                String l = decimal.format(calculoVelocidadeClass.aux(calculoVelocidadeClass.getTempoFinal(),
                        calculoVelocidadeClass.getTempoInicial()));

                lb_resultado3.setText("S0 = " + a + " / (" + k + " * "
                        + l + ")");
                String m = decimal.format(calculoVelocidadeClass.media2(calculoVelocidadeClass.getVelocidadeFinal(),
                        calculoVelocidadeClass.getVelocidadeInicial(), calculoVelocidadeClass.getTempoFinal(),
                        calculoVelocidadeClass.getTempoInicial()));

                lb_resultado4.setText("S0 = " + a + " / " + m);

                if (rd_km.isSelected()) {
                    if (rd_s.isSelected()) {
                        Double x = calculoVelocidadeClass.media2(calculoVelocidadeClass.getVelocidadeFinal(),
                                calculoVelocidadeClass.getVelocidadeInicial(),
                                calculoVelocidadeClass.getTempoFinal(),
                                calculoVelocidadeClass.getTempoInicial());
                        Double y = calculoVelocidadeClass.aux3(calculoVelocidadeClass.getEspacoFinal(), x);
                        String valorFormatado = decimal.format(y);
                        System.out.print(valorFormatado);
                        lb_resultado5.setText("S0 =  " + valorFormatado + " Km");

                    }
                    if (rd_min.isSelected()) {
                        Double x = calculoVelocidadeClass.media2(calculoVelocidadeClass.getVelocidadeFinal(),
                                calculoVelocidadeClass.getVelocidadeInicial(),
                                calculoVelocidadeClass.getTempoFinal(),
                                calculoVelocidadeClass.getTempoInicial());
                        Double y = calculoVelocidadeClass.aux3(calculoVelocidadeClass.getEspacoFinal(), x);
                        String valorFormatado = decimal.format(y);
                        lb_resultado5.setText("S0 =  " + valorFormatado + " Km");
                    }
                    if (rd_h.isSelected()) {
                        Double x = calculoVelocidadeClass.media2(calculoVelocidadeClass.getVelocidadeFinal(),
                                calculoVelocidadeClass.getVelocidadeInicial(),
                                calculoVelocidadeClass.getTempoFinal(),
                                calculoVelocidadeClass.getTempoInicial());
                        Double y = calculoVelocidadeClass.aux3(calculoVelocidadeClass.getEspacoFinal(), x);
                        String valorFormatado = decimal.format(y);
                        lb_resultado5.setText("S0 =  " + valorFormatado + " Km");
                    }
                }
                if (rd_m.isSelected()) {
                    if (rd_s.isSelected()) {
                        Double x = calculoVelocidadeClass.media2(calculoVelocidadeClass.getVelocidadeFinal(),
                                calculoVelocidadeClass.getVelocidadeInicial(),
                                calculoVelocidadeClass.getTempoFinal(),
                                calculoVelocidadeClass.getTempoInicial());
                        Double y = calculoVelocidadeClass.aux3(calculoVelocidadeClass.getEspacoFinal(), x);
                        String valorFormatado = decimal.format(y);
                        lb_resultado5.setText("S0 =  " + valorFormatado + " m/s");
                    }
                    if (rd_min.isSelected()) {
                        Double x = calculoVelocidadeClass.media2(calculoVelocidadeClass.getVelocidadeFinal(),
                                calculoVelocidadeClass.getVelocidadeInicial(),
                                calculoVelocidadeClass.getTempoFinal(),
                                calculoVelocidadeClass.getTempoInicial());
                        Double y = calculoVelocidadeClass.aux3(calculoVelocidadeClass.getEspacoFinal(), x);
                        String valorFormatado = decimal.format(y);
                        lb_resultado5.setText("S0 =  " + valorFormatado + " m/min");
                    }
                    if (rd_h.isSelected()) {
                        Double x = calculoVelocidadeClass.media2(calculoVelocidadeClass.getVelocidadeFinal(),
                                calculoVelocidadeClass.getVelocidadeInicial(),
                                calculoVelocidadeClass.getTempoFinal(),
                                calculoVelocidadeClass.getTempoInicial());
                        Double y = calculoVelocidadeClass.aux3(calculoVelocidadeClass.getEspacoFinal(), x);
                        String valorFormatado = decimal.format(y);
                        lb_resultado5.setText("S0 =  " + valorFormatado + " m/h");
                    }
                }
                if (rd_cm.isSelected()) {
                    if (rd_s.isSelected()) {
                        Double x = calculoVelocidadeClass.media2(calculoVelocidadeClass.getVelocidadeFinal(),
                                calculoVelocidadeClass.getVelocidadeInicial(),
                                calculoVelocidadeClass.getTempoFinal(),
                                calculoVelocidadeClass.getTempoInicial());
                        Double y = calculoVelocidadeClass.aux3(calculoVelocidadeClass.getEspacoFinal(), x);
                        String valorFormatado = decimal.format(y);
                        lb_resultado5.setText("S0 =  " + valorFormatado + " cm/s");
                    }
                    if (rd_min.isSelected()) {
                        Double x = calculoVelocidadeClass.media2(calculoVelocidadeClass.getVelocidadeFinal(),
                                calculoVelocidadeClass.getVelocidadeInicial(),
                                calculoVelocidadeClass.getTempoFinal(),
                                calculoVelocidadeClass.getTempoInicial());
                        Double y = calculoVelocidadeClass.aux3(calculoVelocidadeClass.getEspacoFinal(), x);
                        String valorFormatado = decimal.format(y);
                        lb_resultado5.setText("S0 =  " + valorFormatado + " cm/min");
                    }
                    if (rd_h.isSelected()) {
                        Double x = calculoVelocidadeClass.media2(calculoVelocidadeClass.getVelocidadeFinal(),
                                calculoVelocidadeClass.getVelocidadeInicial(),
                                calculoVelocidadeClass.getTempoFinal(),
                                calculoVelocidadeClass.getTempoInicial());
                        Double y = calculoVelocidadeClass.aux3(calculoVelocidadeClass.getEspacoFinal(), x);
                        String valorFormatado = decimal.format(y);
                        lb_resultado5.setText("S0 =  " + valorFormatado + " cm/h");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Preencha os campos: tempo inicial e final, velocidade inicial e final.");
            }
        } else if (rd_posfinal.isSelected()) {
            if (!tf_tempoinicial.getText().isEmpty() && !tf_veloinicial.getText().isEmpty()
                    && !tf_tempofinal.getText().isEmpty() && !tf_velofinal.getText().isEmpty()
                    && !tf_espacoinicial.getText().isEmpty()) {
                calculoVelocidadeClass.setTempoInicial(Double.parseDouble(tf_tempoinicial.getText()));
                calculoVelocidadeClass.setVelocidadeInicial(Double.parseDouble(tf_veloinicial.getText()));
                calculoVelocidadeClass.setTempoFinal(Double.parseDouble(tf_tempofinal.getText()));
                calculoVelocidadeClass.setVelocidadeFinal(Double.parseDouble(tf_velofinal.getText()));
                calculoVelocidadeClass.setEspacoInicial(Double.parseDouble(tf_espacoinicial.getText()));
                Double f = Double.parseDouble(tf_espacoinicial.getText());
                Double g = Double.parseDouble(tf_velofinal.getText());
                Double h = Double.parseDouble(tf_veloinicial.getText());
                Double i = Double.parseDouble(tf_tempofinal.getText());
                Double j = Double.parseDouble(tf_tempoinicial.getText());
                String a = decimal.format(f);
                String b = decimal.format(g);
                String c = decimal.format(h);
                String d = decimal.format(i);
                String e = decimal.format(j);
                lb_resultado2.setText("S = (" + a + "  +  ((" + b
                        + " - " + c + " ) *  (" + d + " - " + e + "))");
                String k = decimal.format(calculoVelocidadeClass.aux(calculoVelocidadeClass.getVelocidadeFinal(),
                        calculoVelocidadeClass.getVelocidadeInicial()));
                String l = decimal.format(calculoVelocidadeClass.aux(calculoVelocidadeClass.getTempoFinal(),
                        calculoVelocidadeClass.getTempoInicial()));

                lb_resultado3.setText("S = " + a + " + (" + k + " * "
                        + l + ")");
                String m = decimal.format(calculoVelocidadeClass.media2(calculoVelocidadeClass.getVelocidadeFinal(),
                        calculoVelocidadeClass.getVelocidadeInicial(), calculoVelocidadeClass.getTempoFinal(),
                        calculoVelocidadeClass.getTempoInicial()));

                lb_resultado4.setText("S = " + a + " + " + m);

                if (rd_km.isSelected()) {
                    if (rd_s.isSelected()) {
                        Double x = calculoVelocidadeClass.media2(calculoVelocidadeClass.getVelocidadeFinal(),
                                calculoVelocidadeClass.getVelocidadeInicial(),
                                calculoVelocidadeClass.getTempoFinal(),
                                calculoVelocidadeClass.getTempoInicial());
                        Double y = calculoVelocidadeClass.aux4(calculoVelocidadeClass.getEspacoInicial(), x);
                        String valorFormatado = decimal.format(y);
                        System.out.print(valorFormatado);
                        lb_resultado5.setText("S =  " + valorFormatado + " Km/s");
                        System.out.print(valorFormatado);
                    }
                    if (rd_min.isSelected()) {
                        Double x = calculoVelocidadeClass.media2(calculoVelocidadeClass.getVelocidadeFinal(),
                                calculoVelocidadeClass.getVelocidadeInicial(),
                                calculoVelocidadeClass.getTempoFinal(),
                                calculoVelocidadeClass.getTempoInicial());
                        Double y = calculoVelocidadeClass.aux4(calculoVelocidadeClass.getEspacoInicial(), x);
                        String valorFormatado = decimal.format(y);
                        lb_resultado5.setText("S =  " + valorFormatado + " Km/min");
                    }
                    if (rd_h.isSelected()) {
                        Double x = calculoVelocidadeClass.media2(calculoVelocidadeClass.getVelocidadeFinal(),
                                calculoVelocidadeClass.getVelocidadeInicial(),
                                calculoVelocidadeClass.getTempoFinal(),
                                calculoVelocidadeClass.getTempoInicial());
                        Double y = calculoVelocidadeClass.aux4(calculoVelocidadeClass.getEspacoInicial(), x);
                        String valorFormatado = decimal.format(y);
                        lb_resultado5.setText("S =  " + valorFormatado + " Km/hr");
                    }
                }
                if (rd_m.isSelected()) {
                    if (rd_s.isSelected()) {
                        Double x = calculoVelocidadeClass.media2(calculoVelocidadeClass.getVelocidadeFinal(),
                                calculoVelocidadeClass.getVelocidadeInicial(),
                                calculoVelocidadeClass.getTempoFinal(),
                                calculoVelocidadeClass.getTempoInicial());
                        Double y = calculoVelocidadeClass.aux4(calculoVelocidadeClass.getEspacoInicial(), x);
                        String valorFormatado = decimal.format(y);
                        lb_resultado5.setText("S =  " + valorFormatado + " m/s");
                    }
                    if (rd_min.isSelected()) {
                        Double x = calculoVelocidadeClass.media2(calculoVelocidadeClass.getVelocidadeFinal(),
                                calculoVelocidadeClass.getVelocidadeInicial(),
                                calculoVelocidadeClass.getTempoFinal(),
                                calculoVelocidadeClass.getTempoInicial());
                        Double y = calculoVelocidadeClass.aux4(calculoVelocidadeClass.getEspacoInicial(), x);
                        String valorFormatado = decimal.format(y);
                        lb_resultado5.setText("S =  " + valorFormatado + " m/min");
                    }
                    if (rd_h.isSelected()) {
                        Double x = calculoVelocidadeClass.media2(calculoVelocidadeClass.getVelocidadeFinal(),
                                calculoVelocidadeClass.getVelocidadeInicial(),
                                calculoVelocidadeClass.getTempoFinal(),
                                calculoVelocidadeClass.getTempoInicial());
                        Double y = calculoVelocidadeClass.aux4(calculoVelocidadeClass.getEspacoInicial(), x);
                        String valorFormatado = decimal.format(y);
                        lb_resultado5.setText("S =  " + valorFormatado + " m/h");
                    }
                }
                if (rd_cm.isSelected()) {
                    if (rd_s.isSelected()) {
                        Double x = calculoVelocidadeClass.media2(calculoVelocidadeClass.getVelocidadeFinal(),
                                calculoVelocidadeClass.getVelocidadeInicial(),
                                calculoVelocidadeClass.getTempoFinal(),
                                calculoVelocidadeClass.getTempoInicial());
                        Double y = calculoVelocidadeClass.aux4(calculoVelocidadeClass.getEspacoInicial(), x);
                        String valorFormatado = decimal.format(y);
                        lb_resultado5.setText("S =  " + valorFormatado + " cm/s");
                    }
                    if (rd_min.isSelected()) {
                        Double x = calculoVelocidadeClass.media2(calculoVelocidadeClass.getVelocidadeFinal(),
                                calculoVelocidadeClass.getVelocidadeInicial(),
                                calculoVelocidadeClass.getTempoFinal(),
                                calculoVelocidadeClass.getTempoInicial());
                        Double y = calculoVelocidadeClass.aux4(calculoVelocidadeClass.getEspacoInicial(), x);
                        String valorFormatado = decimal.format(y);
                        lb_resultado5.setText("S =  " + valorFormatado + " cm/min");
                    }
                    if (rd_h.isSelected()) {
                        Double x = calculoVelocidadeClass.media2(calculoVelocidadeClass.getVelocidadeFinal(),
                                calculoVelocidadeClass.getVelocidadeInicial(),
                                calculoVelocidadeClass.getTempoFinal(),
                                calculoVelocidadeClass.getTempoInicial());
                        Double y = calculoVelocidadeClass.aux4(calculoVelocidadeClass.getEspacoInicial(), x);
                        String valorFormatado = decimal.format(y);
                        lb_resultado5.setText("S =  " + valorFormatado + " cm/h");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Preencha os campos: tempo inicial e final, velocidade inicial e final.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "É necessário selecionar o tipo que deseja calcular: velocidade, espaço ou tempo.\n"
                    + "É necessário selecionar a unidade de medida: s, min ou h e cm, m ou km. ");
        }
    }

    public void limpar() {
        tf_espacofinal.setText("");
        tf_espacoinicial.setText("");
        tf_tempofinal.setText("");
        tf_tempoinicial.setText("");
        tf_velofinal.setText("");
        tf_veloinicial.setText("");
        lb_res5.setText("");
        lb_res.setText("S - S0");
        lb_res2.setText("T - T0 ");
        lb_res3.setText(" S - S0");
        lb_res4.setText(" T - T0");
        lb_res6.setText("V =  -------------");
        lb_res7.setText("V =  -------------");
        lb_res8.setText("T - T0");
        lb_res9.setText("V =  -------------");
        lb_res10.setText("S - S0");
        lb_resus6.setText("V = ");
        lb_resultado.setText("S = S0 + V . T");
        lb_resultado2.setText("S =");
        lb_resultado3.setText("S =");
        lb_resultado4.setText("S =");
        lb_resultado5.setText("S =");

    }
}
