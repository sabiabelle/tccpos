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
public class TelaCalculoVelocidadeMedia extends javax.swing.JFrame {

    CalculoVelocidadeClass calculoVelocidadeClass = new CalculoVelocidadeClass();
    DecimalFormat decimal = new DecimalFormat("0.00");

    public TelaCalculoVelocidadeMedia() {
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
        rd_velocidade = new javax.swing.JRadioButton();
        rd_espaco = new javax.swing.JRadioButton();
        rd_tempo = new javax.swing.JRadioButton();
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
        jLabel13 = new javax.swing.JLabel();
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
        jPanel7 = new javax.swing.JPanel();
        lb_result = new javax.swing.JLabel();
        lb_result3 = new javax.swing.JLabel();
        lb_res = new javax.swing.JLabel();
        lb_res2 = new javax.swing.JLabel();
        lb_resultado = new javax.swing.JLabel();
        lb_res3 = new javax.swing.JLabel();
        lb_result2 = new javax.swing.JLabel();
        lb_res4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
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
                .addGap(18, 18, 18))
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ccvelocidademedia.png"))); // NOI18N

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

        rd_espaco.setBackground(new java.awt.Color(202, 233, 255));
        rd_espaco.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        rd_espaco.setText("Posição");
        rd_espaco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rd_espacoMouseClicked(evt);
            }
        });
        rd_espaco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd_espacoActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(rd_velocidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rd_espaco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rd_tempo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rd_velocidade)
                    .addComponent(rd_espaco)
                    .addComponent(rd_tempo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addComponent(rd_h, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rd_cm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rd_m, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rd_km)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
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
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(202, 233, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 0, 18))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel8.setText("V:");
        jLabel8.setToolTipText("Velocidade Final");

        jLabel13.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel13.setText("So:");
        jLabel13.setToolTipText("Posição Inicial");

        jLabel10.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel10.setText("S:");
        jLabel10.setToolTipText("Posição Final");

        jLabel11.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel11.setText("T:");
        jLabel11.setToolTipText("Tempo Final");

        jLabel12.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel12.setText("To:");
        jLabel12.setToolTipText("Tempo Inicial");

        tf_tempoinicial.setBackground(new java.awt.Color(202, 233, 255));
        tf_tempoinicial.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        tf_tempoinicial.setToolTipText("Tempo Inicial");

        tf_espacoinicial.setBackground(new java.awt.Color(202, 233, 255));
        tf_espacoinicial.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        tf_espacoinicial.setToolTipText("Espaço Inicial");
        tf_espacoinicial.setName("Espaço Inicial"); // NOI18N
        tf_espacoinicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_espacoinicialActionPerformed(evt);
            }
        });

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
        tf_velofinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_velofinalActionPerformed(evt);
            }
        });

        tf_veloinicial.setBackground(new java.awt.Color(202, 233, 255));
        tf_veloinicial.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        tf_veloinicial.setToolTipText("Velocidade Inicial");
        tf_veloinicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_veloinicialActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel17.setText("Vo:");
        jLabel17.setToolTipText("Velocidade Inicial");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_espacofinal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                            .addComponent(tf_espacoinicial)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_veloinicial, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                            .addComponent(tf_velofinal))))
                .addGap(42, 42, 42)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_tempofinal, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                    .addComponent(tf_tempoinicial))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_tempoinicial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_tempofinal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(tf_veloinicial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_velofinal, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_espacoinicial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_espacofinal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel10, jLabel11, jLabel12, jLabel13, tf_espacofinal, tf_tempofinal, tf_tempoinicial});

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(202, 233, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 0, 24))); // NOI18N

        lb_result.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lb_result.setText("Vm=  -------------");

        lb_result3.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lb_result3.setText("Vm = ");

        lb_res.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lb_res.setText("∆s ");

        lb_res2.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lb_res2.setText("∆t");

        lb_resultado.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N

        lb_res3.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N

        lb_result2.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lb_result2.setText("Vm=  -------------");

        lb_res4.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(lb_res2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lb_res, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lb_result, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lb_result2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_res3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_res4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(lb_result3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_res, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_res3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_result, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_result2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_res2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_res4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lb_result3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/vm=s -- t.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pn_cinematica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pn_dinamica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(453, 453, 453)
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(420, 420, 420))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 355, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
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

    private void rd_velocidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rd_velocidadeMouseClicked
        limpar();
        rd_tempo.setSelected(false);
        rd_espaco.setSelected(false);
    }//GEN-LAST:event_rd_velocidadeMouseClicked

    private void rd_velocidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_velocidadeActionPerformed
        rd_tempo.setSelected(false);
        rd_espaco.setSelected(false);
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
    }//GEN-LAST:event_rd_velocidadeActionPerformed

    private void rd_espacoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rd_espacoMouseClicked
        limpar();
        rd_tempo.setSelected(false);
        rd_velocidade.setSelected(false);
    }//GEN-LAST:event_rd_espacoMouseClicked

    private void rd_espacoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_espacoActionPerformed
        rd_tempo.setSelected(false);
        rd_velocidade.setSelected(false);
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
    }//GEN-LAST:event_rd_espacoActionPerformed

    private void rd_tempoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rd_tempoMouseClicked
        limpar();
        rd_espaco.setSelected(false);
        rd_velocidade.setSelected(false);
    }//GEN-LAST:event_rd_tempoMouseClicked

    private void rd_tempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_tempoActionPerformed
        rd_velocidade.setSelected(false);
        rd_espaco.setSelected(false);
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
    }//GEN-LAST:event_rd_tempoActionPerformed

    private void rd_cmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rd_cmMouseClicked
        rd_m.setSelected(false);
        rd_km.setSelected(false);
    }//GEN-LAST:event_rd_cmMouseClicked

    private void rd_cmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_cmActionPerformed
        if (rd_km.isSelected()) {
            if (!tf_espacoinicial.getText().isEmpty()) {
                tf_espacoinicial.setText((Double.parseDouble(tf_espacoinicial.getText()) * 100000) + "");
            }
            if (!tf_espacofinal.getText().isEmpty()) {
                tf_espacofinal.setText((Double.parseDouble(tf_espacofinal.getText()) * 100000) + "");
            }
        }
        if (rd_m.isSelected()) {
            if (!tf_espacoinicial.getText().isEmpty()) {
                tf_espacoinicial.setText((Double.parseDouble(tf_espacoinicial.getText()) * 100) + "");
            }
            if (!tf_espacofinal.getText().isEmpty()) {
                tf_espacofinal.setText((Double.parseDouble(tf_espacofinal.getText()) * 100) + "");
            }
        }
        rd_km.setSelected(false);
        rd_m.setSelected(false);
        if (rd_tempo.isSelected()) {
            rd_velocidade.setSelected(false);
            rd_espaco.setSelected(false);
            tf_velofinal.setEnabled(true);
            tf_veloinicial.setEnabled(true);
            tf_espacofinal.setEnabled(true);
            tf_espacoinicial.setEnabled(true);
            tf_tempofinal.setEnabled(false);
            tf_tempoinicial.setEnabled(false);
        }
        if (rd_espaco.isSelected()) {
            rd_tempo.setSelected(false);
            rd_velocidade.setSelected(false);
            tf_velofinal.setEnabled(true);
            tf_veloinicial.setEnabled(true);
            tf_espacofinal.setEnabled(false);
            tf_espacoinicial.setEnabled(false);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }
        if (rd_velocidade.isSelected()) {
            rd_tempo.setSelected(false);
            rd_espaco.setSelected(false);
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
        if (rd_cm.isSelected()) {
            if (!tf_espacoinicial.getText().isEmpty()) {
                tf_espacoinicial.setText((Double.parseDouble(tf_espacoinicial.getText()) / 100) + "");
            }
            if (!tf_espacofinal.getText().isEmpty()) {
                tf_espacofinal.setText((Double.parseDouble(tf_espacofinal.getText()) / 100) + "");
            }
        }
        if (rd_km.isSelected()) {
            if (!tf_espacoinicial.getText().isEmpty()) {
                tf_espacoinicial.setText((Double.parseDouble(tf_espacoinicial.getText()) * 1000) + "");
            }
            if (!tf_espacofinal.getText().isEmpty()) {
                tf_espacofinal.setText((Double.parseDouble(tf_espacofinal.getText()) * 1000) + "");
            }
        }
        rd_cm.setSelected(false);
        rd_km.setSelected(false);
        if (rd_tempo.isSelected()) {
            rd_velocidade.setSelected(false);
            rd_espaco.setSelected(false);
            tf_velofinal.setEnabled(true);
            tf_veloinicial.setEnabled(true);
            tf_espacofinal.setEnabled(true);
            tf_espacoinicial.setEnabled(true);
            tf_tempofinal.setEnabled(false);
            tf_tempoinicial.setEnabled(false);
        }
        if (rd_espaco.isSelected()) {
            rd_tempo.setSelected(false);
            rd_velocidade.setSelected(false);
            tf_velofinal.setEnabled(true);
            tf_veloinicial.setEnabled(true);
            tf_espacofinal.setEnabled(false);
            tf_espacoinicial.setEnabled(false);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }
        if (rd_velocidade.isSelected()) {
            rd_tempo.setSelected(false);
            rd_espaco.setSelected(false);
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
            rd_espaco.setSelected(false);
            tf_velofinal.setEnabled(true);
            tf_veloinicial.setEnabled(true);
            tf_espacofinal.setEnabled(true);
            tf_espacoinicial.setEnabled(true);
            tf_tempofinal.setEnabled(false);
            tf_tempoinicial.setEnabled(false);
        }
        if (rd_espaco.isSelected()) {
            rd_tempo.setSelected(false);
            rd_velocidade.setSelected(false);
            tf_velofinal.setEnabled(true);
            tf_veloinicial.setEnabled(true);
            tf_espacofinal.setEnabled(false);
            tf_espacoinicial.setEnabled(false);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }
        if (rd_velocidade.isSelected()) {
            rd_tempo.setSelected(false);
            rd_espaco.setSelected(false);
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
        if (rd_tempo.isSelected()) {
            rd_velocidade.setSelected(false);
            rd_espaco.setSelected(false);
            tf_velofinal.setEnabled(true);
            tf_veloinicial.setEnabled(true);
            tf_espacofinal.setEnabled(true);
            tf_espacoinicial.setEnabled(true);
            tf_tempofinal.setEnabled(false);
            tf_tempoinicial.setEnabled(false);
        }
        if (rd_espaco.isSelected()) {
            rd_tempo.setSelected(false);
            rd_velocidade.setSelected(false);
            tf_velofinal.setEnabled(true);
            tf_veloinicial.setEnabled(true);
            tf_espacofinal.setEnabled(false);
            tf_espacoinicial.setEnabled(false);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }
        if (rd_velocidade.isSelected()) {
            rd_tempo.setSelected(false);
            rd_espaco.setSelected(false);
            tf_velofinal.setEnabled(false);
            tf_veloinicial.setEnabled(false);
            tf_espacofinal.setEnabled(true);
            tf_espacoinicial.setEnabled(true);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }
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
            rd_espaco.setSelected(false);
            tf_velofinal.setEnabled(true);
            tf_veloinicial.setEnabled(true);
            tf_espacofinal.setEnabled(true);
            tf_espacoinicial.setEnabled(true);
            tf_tempofinal.setEnabled(false);
            tf_tempoinicial.setEnabled(false);
        }
        if (rd_espaco.isSelected()) {
            rd_tempo.setSelected(false);
            rd_velocidade.setSelected(false);
            tf_velofinal.setEnabled(true);
            tf_veloinicial.setEnabled(true);
            tf_espacofinal.setEnabled(false);
            tf_espacoinicial.setEnabled(false);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }
        if (rd_velocidade.isSelected()) {
            rd_tempo.setSelected(false);
            rd_espaco.setSelected(false);
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
        if (rd_tempo.isSelected()) {
            rd_velocidade.setSelected(false);
            rd_espaco.setSelected(false);
            tf_velofinal.setEnabled(true);
            tf_veloinicial.setEnabled(true);
            tf_espacofinal.setEnabled(true);
            tf_espacoinicial.setEnabled(true);
            tf_tempofinal.setEnabled(false);
            tf_tempoinicial.setEnabled(false);
        }
        if (rd_espaco.isSelected()) {
            rd_tempo.setSelected(false);
            rd_velocidade.setSelected(false);
            tf_velofinal.setEnabled(true);
            tf_veloinicial.setEnabled(true);
            tf_espacofinal.setEnabled(false);
            tf_espacoinicial.setEnabled(false);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }
        if (rd_velocidade.isSelected()) {
            rd_tempo.setSelected(false);
            rd_espaco.setSelected(false);
            tf_velofinal.setEnabled(false);
            tf_veloinicial.setEnabled(false);
            tf_espacofinal.setEnabled(true);
            tf_espacoinicial.setEnabled(true);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }
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
            rd_espaco.setSelected(false);
            tf_velofinal.setEnabled(true);
            tf_veloinicial.setEnabled(true);
            tf_espacofinal.setEnabled(true);
            tf_espacoinicial.setEnabled(true);
            tf_tempofinal.setEnabled(false);
            tf_tempoinicial.setEnabled(false);
        }
        if (rd_espaco.isSelected()) {
            rd_tempo.setSelected(false);
            rd_velocidade.setSelected(false);
            tf_velofinal.setEnabled(true);
            tf_veloinicial.setEnabled(true);
            tf_espacofinal.setEnabled(false);
            tf_espacoinicial.setEnabled(false);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }
        if (rd_velocidade.isSelected()) {
            rd_tempo.setSelected(false);
            rd_espaco.setSelected(false);
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
        if (rd_tempo.isSelected()) {
            rd_velocidade.setSelected(false);
            rd_espaco.setSelected(false);
            tf_velofinal.setEnabled(true);
            tf_veloinicial.setEnabled(true);
            tf_espacofinal.setEnabled(true);
            tf_espacoinicial.setEnabled(true);
            tf_tempofinal.setEnabled(false);
            tf_tempoinicial.setEnabled(false);
        }
        if (rd_espaco.isSelected()) {
            rd_tempo.setSelected(false);
            rd_velocidade.setSelected(false);
            tf_velofinal.setEnabled(true);
            tf_veloinicial.setEnabled(true);
            tf_espacofinal.setEnabled(false);
            tf_espacoinicial.setEnabled(false);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }
        if (rd_velocidade.isSelected()) {
            rd_tempo.setSelected(false);
            rd_espaco.setSelected(false);
            tf_velofinal.setEnabled(false);
            tf_veloinicial.setEnabled(false);
            tf_espacofinal.setEnabled(true);
            tf_espacoinicial.setEnabled(true);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }
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
            rd_espaco.setSelected(false);
            tf_velofinal.setEnabled(true);
            tf_veloinicial.setEnabled(true);
            tf_espacofinal.setEnabled(true);
            tf_espacoinicial.setEnabled(true);
            tf_tempofinal.setEnabled(false);
            tf_tempoinicial.setEnabled(false);
        }
        if (rd_espaco.isSelected()) {
            rd_tempo.setSelected(false);
            rd_velocidade.setSelected(false);
            tf_velofinal.setEnabled(true);
            tf_veloinicial.setEnabled(true);
            tf_espacofinal.setEnabled(false);
            tf_espacoinicial.setEnabled(false);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }
        if (rd_velocidade.isSelected()) {
            rd_tempo.setSelected(false);
            rd_espaco.setSelected(false);
            tf_velofinal.setEnabled(false);
            tf_veloinicial.setEnabled(false);
            tf_espacofinal.setEnabled(true);
            tf_espacoinicial.setEnabled(true);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }
    }//GEN-LAST:event_rd_hActionPerformed

    private void tf_espacoinicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_espacoinicialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_espacoinicialActionPerformed

    private void tf_velofinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_velofinalActionPerformed

    }//GEN-LAST:event_tf_velofinalActionPerformed

    private void tf_veloinicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_veloinicialActionPerformed

    }//GEN-LAST:event_tf_veloinicialActionPerformed

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
                new TelaCalculoVelocidadeMedia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel estudar_estatica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lb_calcular;
    private javax.swing.JLabel lb_limpar;
    private javax.swing.JLabel lb_paginainicial;
    private javax.swing.JLabel lb_res;
    private javax.swing.JLabel lb_res2;
    private javax.swing.JLabel lb_res3;
    private javax.swing.JLabel lb_res4;
    private javax.swing.JLabel lb_result;
    private javax.swing.JLabel lb_result2;
    private javax.swing.JLabel lb_result3;
    private javax.swing.JLabel lb_resultado;
    private javax.swing.JLabel lb_voltar;
    private javax.swing.JPanel pn_cinematica;
    private javax.swing.JPanel pn_dinamica;
    private javax.swing.JRadioButton rd_cm;
    private javax.swing.JRadioButton rd_espaco;
    private javax.swing.JRadioButton rd_h;
    private javax.swing.JRadioButton rd_km;
    private javax.swing.JRadioButton rd_m;
    private javax.swing.JRadioButton rd_min;
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

        if (rd_velocidade.isSelected()) {
            if (!tf_espacoinicial.getText().isEmpty() && !tf_tempoinicial.getText().isEmpty()
                    && !tf_espacofinal.getText().isEmpty() && !tf_tempofinal.getText().isEmpty()) {

                calculoVelocidadeClass.setEspacoInicial(Double.parseDouble(tf_espacoinicial.getText()));
                calculoVelocidadeClass.setEspacoFinal(Double.parseDouble(tf_espacofinal.getText()));
                calculoVelocidadeClass.setTempoInicial(Double.parseDouble(tf_tempoinicial.getText()));
                calculoVelocidadeClass.setTempoFinal(Double.parseDouble(tf_tempofinal.getText()));
                lb_res.setText("" + tf_espacofinal.getText() + "  -  " + tf_espacoinicial.getText());
                lb_res2.setText("" + tf_tempofinal.getText() + "  -  " + tf_tempoinicial.getText());
                lb_res3.setText("" + calculoVelocidadeClass.aux(calculoVelocidadeClass.getEspacoFinal(),
                        calculoVelocidadeClass.getEspacoInicial()));
                lb_res4.setText("" + calculoVelocidadeClass.aux(calculoVelocidadeClass.getTempoFinal(),
                        calculoVelocidadeClass.getTempoInicial()));
                String valorFormatado = decimal.format(calculoVelocidadeClass.media(
                        calculoVelocidadeClass.getEspacoFinal(), calculoVelocidadeClass.getEspacoInicial(),
                        calculoVelocidadeClass.getTempoFinal(), calculoVelocidadeClass.getTempoInicial()));
                if (rd_km.isSelected()) {
                    if (rd_s.isSelected()) {
                        lb_result3.setText("VM: ");
                        lb_resultado.setText("" + valorFormatado + " Km/s");
                    }
                    if (rd_min.isSelected()) {
                        lb_result3.setText("VM: ");
                        lb_resultado.setText("" + valorFormatado + " Km/min");
                    }
                    if (rd_h.isSelected()) {
                        lb_result3.setText("VM: ");
                        lb_resultado.setText("" + valorFormatado + " Km/h");
                    }
                }
                if (rd_m.isSelected()) {
                    if (rd_s.isSelected()) {
                        lb_result3.setText("VM: ");
                        lb_resultado.setText("" + valorFormatado + " m/s");
                    }
                    if (rd_min.isSelected()) {
                        lb_result3.setText("VM: ");
                        lb_resultado.setText("" + valorFormatado + " m/min");
                    }
                    if (rd_h.isSelected()) {
                        lb_result3.setText("VM: ");
                        lb_resultado.setText("" + valorFormatado + " m/h");
                    }
                }
                if (rd_cm.isSelected()) {
                    if (rd_s.isSelected()) {
                        lb_result3.setText("VM: ");
                        lb_resultado.setText("" + valorFormatado + " cm/s");
                    }
                    if (rd_min.isSelected()) {
                        lb_result3.setText("VM: ");
                        lb_resultado.setText("" + valorFormatado + " cm/min");
                    }
                    if (rd_h.isSelected()) {
                        lb_result3.setText("VM: ");
                        lb_resultado.setText("" + valorFormatado + " cm/h");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Preencha os campos: espaço inicial e final, tempo inicial e final");
            }
        } else if (rd_tempo.isSelected()) {
            if (!tf_espacoinicial.getText().isEmpty() && !tf_veloinicial.getText().isEmpty()
                    && !tf_velofinal.getText().isEmpty() && !tf_espacofinal.getText().isEmpty()) {
                calculoVelocidadeClass.setEspacoInicial(Double.parseDouble(tf_espacoinicial.getText()));
                calculoVelocidadeClass.setEspacoFinal(Double.parseDouble(tf_espacofinal.getText()));
                calculoVelocidadeClass.setVelocidadeInicial(Double.parseDouble(tf_veloinicial.getText()));
                calculoVelocidadeClass.setVelocidadeFinal(Double.parseDouble(tf_velofinal.getText()));
                lb_result.setText("T = ----------");
                lb_result2.setText("T = ----------");
                lb_res.setText("" + tf_espacofinal.getText() + "  -  " + tf_espacoinicial.getText());
                lb_res2.setText("" + tf_velofinal.getText() + "  -  " + tf_veloinicial.getText());
                lb_res3.setText("" + calculoVelocidadeClass.aux(calculoVelocidadeClass.getEspacoFinal(),
                        calculoVelocidadeClass.getEspacoInicial()));
                lb_res4.setText("" + calculoVelocidadeClass.aux(calculoVelocidadeClass.getVelocidadeFinal(),
                        calculoVelocidadeClass.getVelocidadeInicial()));
                String valorFormatado = decimal.format(calculoVelocidadeClass.media(
                        calculoVelocidadeClass.getEspacoFinal(), calculoVelocidadeClass.getEspacoInicial(),
                        calculoVelocidadeClass.getVelocidadeFinal(), calculoVelocidadeClass.getVelocidadeInicial()));

                if (rd_km.isSelected()) {
                    if (rd_s.isSelected()) {
                        lb_result3.setText("T = ");
                        lb_resultado.setText("" + valorFormatado + " Km/s");
                    }
                    if (rd_min.isSelected()) {
                        lb_result3.setText("T = ");
                        lb_resultado.setText("" + valorFormatado + " Km/min");
                    }
                    if (rd_h.isSelected()) {
                        lb_result3.setText("T = ");
                        lb_resultado.setText("" + valorFormatado + " Km/h");
                    }
                }
                if (rd_m.isSelected()) {
                    if (rd_s.isSelected()) {
                        lb_result3.setText("T = ");
                        lb_resultado.setText("" + valorFormatado + " m/s");
                    }
                    if (rd_min.isSelected()) {
                        lb_result3.setText("T = ");
                        lb_resultado.setText("" + valorFormatado + " m/min");
                    }
                    if (rd_h.isSelected()) {
                        lb_result3.setText("T = ");
                        lb_resultado.setText("" + valorFormatado + " m/h");
                    }
                }
                if (rd_cm.isSelected()) {
                    if (rd_s.isSelected()) {
                        lb_result3.setText("T = ");
                        lb_resultado.setText("" + valorFormatado + " cm/s");
                    }
                    if (rd_min.isSelected()) {
                        lb_result3.setText("T = ");
                        lb_resultado.setText("" + valorFormatado + " cm/min");
                    }
                    if (rd_h.isSelected()) {
                        lb_result3.setText("T = ");
                        lb_resultado.setText("" + valorFormatado + " cm/h");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Preencha os campos:  espaço inicial e final, velocidade inicial e final.");
            }
        } else if (rd_espaco.isSelected()) {
            if (!tf_tempoinicial.getText().isEmpty() && !tf_veloinicial.getText().isEmpty()
                    && !tf_tempofinal.getText().isEmpty() && !tf_velofinal.getText().isEmpty()) {
                calculoVelocidadeClass.setTempoInicial(Double.parseDouble(tf_tempoinicial.getText()));
                calculoVelocidadeClass.setVelocidadeInicial(Double.parseDouble(tf_veloinicial.getText()));
                calculoVelocidadeClass.setTempoFinal(Double.parseDouble(tf_tempofinal.getText()));
                calculoVelocidadeClass.setVelocidadeFinal(Double.parseDouble(tf_velofinal.getText()));
                lb_res.setText("");
                lb_res2.setText("");
                lb_result.setText("S = (" + tf_velofinal.getText() + "  -  " + tf_veloinicial.getText()
                        + ")  *  (" + tf_tempofinal.getText() + "  -  " + tf_tempoinicial.getText() + ")");

                lb_result2.setText("S = " + calculoVelocidadeClass.aux(calculoVelocidadeClass.getVelocidadeFinal(),
                        calculoVelocidadeClass.getVelocidadeInicial()) + " * "
                        + calculoVelocidadeClass.aux(calculoVelocidadeClass.getTempoFinal(), calculoVelocidadeClass.getTempoInicial()));
                String valorFormatado = decimal.format(calculoVelocidadeClass.media2(
                        calculoVelocidadeClass.getVelocidadeFinal(), calculoVelocidadeClass.getVelocidadeInicial(),
                        calculoVelocidadeClass.getTempoFinal(), calculoVelocidadeClass.getTempoInicial()));

                if (rd_km.isSelected()) {
                    if (rd_s.isSelected()) {
                        lb_result3.setText("S = ");
                        lb_resultado.setText("" + valorFormatado + " Km/s");
                    }
                    if (rd_min.isSelected()) {
                        lb_result3.setText("S = ");
                        lb_resultado.setText("" + valorFormatado + " Km/min");
                    }
                    if (rd_h.isSelected()) {
                        lb_result3.setText("S = ");
                        lb_resultado.setText("" + valorFormatado + " Km/h");
                    }
                }
                if (rd_m.isSelected()) {
                    if (rd_s.isSelected()) {
                        lb_result3.setText("S = ");
                        lb_resultado.setText("" + valorFormatado + " m/s");
                    }
                    if (rd_min.isSelected()) {
                        lb_result3.setText("S = ");
                        lb_resultado.setText("" + valorFormatado + " m/min");
                    }
                    if (rd_h.isSelected()) {
                        lb_result3.setText("S = ");
                        lb_resultado.setText("" + valorFormatado + " m/h");
                    }
                }
                if (rd_cm.isSelected()) {
                    if (rd_s.isSelected()) {
                        lb_result3.setText("S = ");
                        lb_resultado.setText("" + valorFormatado + " cm/s");
                    }
                    if (rd_min.isSelected()) {
                        lb_result3.setText("S = ");
                        lb_resultado.setText("" + valorFormatado + " cm/min");
                    }
                    if (rd_h.isSelected()) {
                        lb_result3.setText("S = ");
                        lb_resultado.setText("" + valorFormatado + " cm/h");
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
        lb_resultado.setText("");
        lb_res.setText("∆s ");
        lb_res2.setText("∆t ");
        lb_res3.setText(" ");
        lb_res4.setText(" ");
        lb_result.setText("Vm =  -------------");
        lb_result2.setText("Vm =  -------------");
        lb_result3.setText("Vm = ");

    }
}
