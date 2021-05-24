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
public class TelaCalculoAceleracaoMedia extends javax.swing.JFrame {
    CalculoVelocidadeClass calculoVelocidadeClass = new CalculoVelocidadeClass();

    DecimalFormat decimal = new DecimalFormat("0.00");

    public TelaCalculoAceleracaoMedia() {
        initComponents();
        //Tela inicia Maximizada...
        setExtendedState(MAXIMIZED_BOTH);
        //ícone do Aplicativo...
        URL url = this.getClass().getResource("../imagens/iconeefisico.png");
        rd_velocidade.setSelected(false);
        rd_aceleracao.setSelected(false);
        rd_tempo.setSelected(false);
        tf_velofinal.setEnabled(false);
        tf_veloinicial.setEnabled(false);
        tf_aceleracao.setEnabled(false);
        tf_tempofinal.setEnabled(false);
        tf_tempoinicial.setEnabled(false);
        rd_cm.setEnabled(false);
        rd_m.setEnabled(false);
        rd_km.setEnabled(false);
        rd_s.setEnabled(false);
        rd_min.setEnabled(false);
        rd_h.setEnabled(false);
        lb_resultado5.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        estudar_estatica = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        rd_velocidade = new javax.swing.JRadioButton();
        rd_aceleracao = new javax.swing.JRadioButton();
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
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tf_tempoinicial = new javax.swing.JTextField();
        tf_aceleracao = new javax.swing.JTextField();
        tf_tempofinal = new javax.swing.JTextField();
        tf_velofinal = new javax.swing.JTextField();
        tf_veloinicial = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        pn_resultado = new javax.swing.JPanel();
        lb_resultado5 = new javax.swing.JLabel();
        lb_resultado4 = new javax.swing.JLabel();
        lb_resultado3 = new javax.swing.JLabel();
        lb_resultado2 = new javax.swing.JLabel();
        lb_resultado = new javax.swing.JLabel();
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

        estudar_estatica.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        estudar_estatica.setForeground(new java.awt.Color(255, 204, 0));
        estudar_estatica.setText("Estudar +");

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

        rd_aceleracao.setBackground(new java.awt.Color(202, 233, 255));
        rd_aceleracao.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        rd_aceleracao.setText("Aceleração");
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(rd_aceleracao)
                .addGap(35, 35, 35)
                .addComponent(rd_tempo)
                .addGap(29, 29, 29))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rd_velocidade)
                    .addComponent(rd_aceleracao)
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
                    .addComponent(jLabel4)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rd_s, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(rd_cm)))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(rd_min))
                    .addComponent(rd_m, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(rd_h, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(rd_km))
                .addGap(14, 14, 14))
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
                .addGap(0, 7, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(202, 233, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 0, 18))); // NOI18N

        jLabel8.setBackground(new java.awt.Color(202, 233, 255));
        jLabel8.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel8.setText("V:");
        jLabel8.setToolTipText("Velocidade Final");

        jLabel9.setBackground(new java.awt.Color(202, 233, 255));
        jLabel9.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel9.setText("ãm:");
        jLabel9.setToolTipText("Posição Inicial");

        jLabel11.setBackground(new java.awt.Color(202, 233, 255));
        jLabel11.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel11.setText("T:");
        jLabel11.setToolTipText("Tempo Final");

        jLabel12.setBackground(new java.awt.Color(202, 233, 255));
        jLabel12.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel12.setText("T0:");
        jLabel12.setToolTipText("Tempo Inicial");

        tf_tempoinicial.setBackground(new java.awt.Color(202, 233, 255));
        tf_tempoinicial.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        tf_tempoinicial.setToolTipText("Tempo Inicial");

        tf_aceleracao.setBackground(new java.awt.Color(202, 233, 255));
        tf_aceleracao.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        tf_aceleracao.setToolTipText("Espaço Inicial");
        tf_aceleracao.setName("Espaço Inicial"); // NOI18N

        tf_tempofinal.setBackground(new java.awt.Color(202, 233, 255));
        tf_tempofinal.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        tf_tempofinal.setToolTipText("Tempo Final");

        tf_velofinal.setBackground(new java.awt.Color(202, 233, 255));
        tf_velofinal.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        tf_velofinal.setToolTipText("Velocidade Final");

        tf_veloinicial.setBackground(new java.awt.Color(202, 233, 255));
        tf_veloinicial.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        tf_veloinicial.setToolTipText("Velocidade Inicial");

        jLabel17.setBackground(new java.awt.Color(202, 233, 255));
        jLabel17.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel17.setText("V0:");
        jLabel17.setToolTipText("Velocidade Inicial");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_veloinicial))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_velofinal)
                            .addComponent(tf_aceleracao))))
                .addGap(44, 44, 44)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_tempofinal)
                    .addComponent(tf_tempoinicial))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_veloinicial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_velofinal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_tempoinicial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_tempofinal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_aceleracao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel9Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel11, jLabel12, jLabel17, jLabel8, jLabel9, tf_aceleracao, tf_tempofinal, tf_tempoinicial, tf_velofinal, tf_veloinicial});

        tf_velofinal.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pn_resultado.setBackground(new java.awt.Color(202, 233, 255));
        pn_resultado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 0, 24))); // NOI18N

        lb_resultado5.setBackground(new java.awt.Color(202, 233, 255));
        lb_resultado5.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lb_resultado5.setText("ãm =");

        lb_resultado4.setBackground(new java.awt.Color(202, 233, 255));
        lb_resultado4.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lb_resultado4.setText("ãm =");

        lb_resultado3.setBackground(new java.awt.Color(202, 233, 255));
        lb_resultado3.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lb_resultado3.setText("ãm =");

        lb_resultado2.setBackground(new java.awt.Color(202, 233, 255));
        lb_resultado2.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lb_resultado2.setText("ãm =");

        lb_resultado.setBackground(new java.awt.Color(202, 233, 255));
        lb_resultado.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lb_resultado.setText("ãm = V / T");

        javax.swing.GroupLayout pn_resultadoLayout = new javax.swing.GroupLayout(pn_resultado);
        pn_resultado.setLayout(pn_resultadoLayout);
        pn_resultadoLayout.setHorizontalGroup(
            pn_resultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_resultadoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pn_resultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_resultado5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_resultado4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_resultado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_resultado2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_resultado3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pn_resultadoLayout.setVerticalGroup(
            pn_resultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_resultadoLayout.createSequentialGroup()
                .addComponent(lb_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_resultado2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_resultado3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_resultado4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_resultado5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/AM.png"))); // NOI18N

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

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/F3.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pn_resultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(53, 53, 53))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(488, 488, 488)
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(324, 324, 324))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(8, 8, 8)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pn_resultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            rd_aceleracao.setSelected(false);
            tf_velofinal.setEnabled(true);
            tf_veloinicial.setEnabled(true);
            tf_aceleracao.setEnabled(true);
            tf_tempofinal.setEnabled(false);
            tf_tempoinicial.setEnabled(false);
        }
        if (rd_aceleracao.isSelected()) {
            rd_tempo.setSelected(false);
            rd_velocidade.setSelected(false);
            tf_velofinal.setEnabled(true);
            tf_veloinicial.setEnabled(true);
            tf_aceleracao.setEnabled(false);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }

        if (rd_velocidade.isSelected()) {
            rd_tempo.setSelected(false);
            rd_aceleracao.setSelected(false);
            tf_velofinal.setEnabled(false);
            tf_veloinicial.setEnabled(false);
            tf_aceleracao.setEnabled(true);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }
    }//GEN-LAST:event_rd_hActionPerformed

    private void rd_hMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rd_hMouseClicked
        rd_s.setSelected(false);
        rd_min.setSelected(false);
    }//GEN-LAST:event_rd_hMouseClicked

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
            rd_aceleracao.setSelected(false);
            tf_velofinal.setEnabled(true);
            tf_veloinicial.setEnabled(true);
            tf_aceleracao.setEnabled(true);
            tf_tempofinal.setEnabled(false);
            tf_tempoinicial.setEnabled(false);
        }
        if (rd_aceleracao.isSelected()) {
            rd_tempo.setSelected(false);
            rd_velocidade.setSelected(false);
            tf_velofinal.setEnabled(true);
            tf_veloinicial.setEnabled(true);
            tf_aceleracao.setEnabled(false);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }

        if (rd_velocidade.isSelected()) {
            rd_tempo.setSelected(false);
            rd_aceleracao.setSelected(false);
            tf_velofinal.setEnabled(false);
            tf_veloinicial.setEnabled(false);
            tf_aceleracao.setEnabled(true);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }
    }//GEN-LAST:event_rd_minActionPerformed

    private void rd_minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rd_minMouseClicked
        rd_h.setSelected(false);
        rd_s.setSelected(false);
    }//GEN-LAST:event_rd_minMouseClicked

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
            rd_aceleracao.setSelected(false);
            tf_velofinal.setEnabled(true);
            tf_veloinicial.setEnabled(true);
            tf_aceleracao.setEnabled(true);
            tf_tempofinal.setEnabled(false);
            tf_tempoinicial.setEnabled(false);
        }
        if (rd_aceleracao.isSelected()) {
            rd_tempo.setSelected(false);
            rd_velocidade.setSelected(false);
            tf_velofinal.setEnabled(true);
            tf_veloinicial.setEnabled(true);
            tf_aceleracao.setEnabled(false);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }
        if (rd_velocidade.isSelected()) {
            rd_tempo.setSelected(false);
            rd_aceleracao.setSelected(false);
            tf_velofinal.setEnabled(false);
            tf_veloinicial.setEnabled(false);
            tf_aceleracao.setEnabled(true);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }
    }//GEN-LAST:event_rd_sActionPerformed

    private void rd_sMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rd_sMouseClicked
        rd_h.setSelected(false);
        rd_min.setSelected(false);
    }//GEN-LAST:event_rd_sMouseClicked

    private void rd_kmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_kmActionPerformed

        rd_m.setSelected(false);
        rd_cm.setSelected(false);
        if (rd_tempo.isSelected()) {
            rd_velocidade.setSelected(false);
            rd_aceleracao.setSelected(false);
            tf_velofinal.setEnabled(true);
            tf_veloinicial.setEnabled(true);
            tf_aceleracao.setEnabled(true);
            tf_tempofinal.setEnabled(false);
            tf_tempoinicial.setEnabled(false);
        }
        if (rd_aceleracao.isSelected()) {
            rd_tempo.setSelected(false);
            rd_velocidade.setSelected(false);
            tf_velofinal.setEnabled(true);
            tf_veloinicial.setEnabled(true);
            tf_aceleracao.setEnabled(false);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }
        if (rd_velocidade.isSelected()) {
            rd_tempo.setSelected(false);
            rd_aceleracao.setSelected(false);
            tf_velofinal.setEnabled(false);
            tf_veloinicial.setEnabled(false);
            tf_aceleracao.setEnabled(true);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }
    }//GEN-LAST:event_rd_kmActionPerformed

    private void rd_kmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rd_kmMouseClicked
        rd_m.setSelected(false);
        rd_cm.setSelected(false);
    }//GEN-LAST:event_rd_kmMouseClicked

    private void rd_mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_mActionPerformed

        rd_cm.setSelected(false);
        rd_km.setSelected(false);
        if (rd_tempo.isSelected()) {
            rd_velocidade.setSelected(false);
            rd_aceleracao.setSelected(false);
            tf_velofinal.setEnabled(true);
            tf_veloinicial.setEnabled(true);
            tf_aceleracao.setEnabled(true);
            tf_tempofinal.setEnabled(false);
            tf_tempoinicial.setEnabled(false);
        }
        if (rd_aceleracao.isSelected()) {
            rd_tempo.setSelected(false);
            rd_velocidade.setSelected(false);
            tf_velofinal.setEnabled(true);
            tf_veloinicial.setEnabled(true);
            tf_aceleracao.setEnabled(false);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }

        if (rd_velocidade.isSelected()) {
            rd_tempo.setSelected(false);
            rd_aceleracao.setSelected(false);
            tf_velofinal.setEnabled(false);
            tf_veloinicial.setEnabled(false);
            tf_aceleracao.setEnabled(true);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }
    }//GEN-LAST:event_rd_mActionPerformed

    private void rd_mMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rd_mMouseClicked
        rd_cm.setSelected(false);
        rd_km.setSelected(false);
    }//GEN-LAST:event_rd_mMouseClicked

    private void rd_cmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_cmActionPerformed
        rd_km.setSelected(false);
        rd_m.setSelected(false);
        if (rd_tempo.isSelected()) {
            rd_velocidade.setSelected(false);
            rd_aceleracao.setSelected(false);
            tf_velofinal.setEnabled(true);
            tf_veloinicial.setEnabled(true);
            tf_aceleracao.setEnabled(true);
            tf_tempofinal.setEnabled(false);
            tf_tempoinicial.setEnabled(false);
        }
        if (rd_aceleracao.isSelected()) {
            rd_tempo.setSelected(false);
            rd_velocidade.setSelected(false);
            tf_velofinal.setEnabled(true);
            tf_veloinicial.setEnabled(true);
            tf_aceleracao.setEnabled(false);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }
        if (rd_velocidade.isSelected()) {
            rd_tempo.setSelected(false);
            rd_aceleracao.setSelected(false);
            rd_aceleracao.setSelected(false);
            tf_velofinal.setEnabled(false);
            tf_veloinicial.setEnabled(false);
            tf_aceleracao.setEnabled(true);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }
    }//GEN-LAST:event_rd_cmActionPerformed

    private void rd_cmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rd_cmMouseClicked
        rd_m.setSelected(false);
        rd_km.setSelected(false);
    }//GEN-LAST:event_rd_cmMouseClicked

    private void rd_tempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_tempoActionPerformed
        rd_velocidade.setSelected(false);
        rd_aceleracao.setSelected(false);
        rd_cm.setEnabled(true);
        rd_m.setEnabled(true);
        rd_km.setEnabled(true);
        rd_s.setEnabled(true);
        rd_min.setEnabled(true);
        rd_h.setEnabled(true);
        tf_aceleracao.setEnabled(false);
        tf_tempofinal.setEnabled(false);
        tf_tempoinicial.setEnabled(false);
        tf_velofinal.setEnabled(false);
        tf_veloinicial.setEnabled(false);
        lb_resultado.setVisible(true);
        lb_resultado2.setVisible(true);
        lb_resultado3.setVisible(true);
        lb_resultado4.setVisible(true);

        lb_resultado.setText("ΔT = ΔV / ãm");
        lb_resultado2.setText("ΔT = ");
        lb_resultado3.setText("ΔT = ");
        lb_resultado4.setText("ΔT = ");
    }//GEN-LAST:event_rd_tempoActionPerformed

    private void rd_tempoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rd_tempoMouseClicked
        limpar();
    }//GEN-LAST:event_rd_tempoMouseClicked

    private void rd_aceleracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_aceleracaoActionPerformed
        limpar();
        lb_resultado.setText("ãm = ΔV / ΔT ");
        lb_resultado2.setText("ãm = ");
        lb_resultado3.setText("ãm =");
        lb_resultado4.setText("ãm =");
        lb_resultado5.setText("ãm =");
        rd_tempo.setSelected(false);
        rd_velocidade.setSelected(false);
        rd_cm.setEnabled(true);
        rd_m.setEnabled(true);
        rd_km.setEnabled(true);
        rd_s.setEnabled(true);
        rd_min.setEnabled(true);
        rd_h.setEnabled(true);
        tf_aceleracao.setEnabled(false);
        tf_tempofinal.setEnabled(false);
        tf_tempoinicial.setEnabled(false);
        tf_velofinal.setEnabled(false);
        tf_veloinicial.setEnabled(false);
        lb_resultado.setVisible(true);
        lb_resultado2.setVisible(true);
        lb_resultado3.setVisible(true);
        lb_resultado4.setVisible(true);
    }//GEN-LAST:event_rd_aceleracaoActionPerformed

    private void rd_aceleracaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rd_aceleracaoMouseClicked
        limpar();

    }//GEN-LAST:event_rd_aceleracaoMouseClicked

    private void rd_velocidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_velocidadeActionPerformed
        rd_tempo.setSelected(false);
        rd_aceleracao.setSelected(false);
        rd_cm.setEnabled(true);
        rd_m.setEnabled(true);
        rd_km.setEnabled(true);
        rd_s.setEnabled(true);
        rd_min.setEnabled(true);
        rd_h.setEnabled(true);
        tf_aceleracao.setEnabled(false);
        tf_tempofinal.setEnabled(false);
        tf_tempoinicial.setEnabled(false);
        tf_velofinal.setEnabled(false);
        tf_veloinicial.setEnabled(false);
        lb_resultado5.setVisible(false);
        lb_resultado.setText("ΔV = ãm . ΔT");
        lb_resultado2.setText("ΔV =");
        lb_resultado3.setText("ΔV =");
        lb_resultado4.setText("ΔV =");
    }//GEN-LAST:event_rd_velocidadeActionPerformed

    private void rd_velocidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rd_velocidadeMouseClicked
        limpar();
    }//GEN-LAST:event_rd_velocidadeMouseClicked

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
                new TelaCalculoAceleracaoMedia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel estudar_estatica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JLabel lb_voltar;
    private javax.swing.JPanel pn_resultado;
    private javax.swing.JRadioButton rd_aceleracao;
    private javax.swing.JRadioButton rd_cm;
    private javax.swing.JRadioButton rd_h;
    private javax.swing.JRadioButton rd_km;
    private javax.swing.JRadioButton rd_m;
    private javax.swing.JRadioButton rd_min;
    private javax.swing.JRadioButton rd_s;
    private javax.swing.JRadioButton rd_tempo;
    private javax.swing.JRadioButton rd_velocidade;
    private javax.swing.JTextField tf_aceleracao;
    private javax.swing.JTextField tf_tempofinal;
    private javax.swing.JTextField tf_tempoinicial;
    private javax.swing.JTextField tf_velofinal;
    private javax.swing.JTextField tf_veloinicial;
    // End of variables declaration//GEN-END:variables
    public void calculo() {

        if (rd_velocidade.isSelected()) {
            lb_resultado.setText("ΔV = ãm . ΔT");
            lb_resultado5.setVisible(false);
            if (!tf_aceleracao.getText().isEmpty() && !tf_tempoinicial.getText().isEmpty()
                    && !tf_tempofinal.getText().isEmpty()) {
                calculoVelocidadeClass.setAceleracao(Double.parseDouble(tf_aceleracao.getText()));
                calculoVelocidadeClass.setTempoInicial(Double.parseDouble(tf_tempoinicial.getText()));
                calculoVelocidadeClass.setTempoFinal(Double.parseDouble(tf_tempofinal.getText()));
                Double a = Double.parseDouble(tf_aceleracao.getText());
                Double b = Double.parseDouble(tf_tempofinal.getText());
                Double c = Double.parseDouble(tf_tempoinicial.getText());
                String d = decimal.format(a);
                String e = decimal.format(b);
                String f = decimal.format(c);
                lb_resultado2.setText("ΔV = " + d + " . (" + e + " - " + f + ")");
                Double l = calculoVelocidadeClass.aux(calculoVelocidadeClass.getTempoFinal(),
                        calculoVelocidadeClass.getTempoInicial());
                String k = decimal.format(l);
                lb_resultado3.setText("ΔV = " + d + " . " + k);
                if (rd_km.isSelected()) {
                    if (rd_s.isSelected()) {
                        String valorFormatado = decimal.format(calculoVelocidadeClass.aux2(calculoVelocidadeClass.getAceleracao(), l));
                        lb_resultado4.setText("ΔV = " + valorFormatado + " Km/s");
                    }
                    if (rd_min.isSelected()) {
                        String valorFormatado = decimal.format(calculoVelocidadeClass.aux2(calculoVelocidadeClass.getAceleracao(), l));
                        lb_resultado4.setText("ΔV = " + valorFormatado + " Km/min");
                    }
                    if (rd_h.isSelected()) {
                        String valorFormatado = decimal.format(calculoVelocidadeClass.aux2(calculoVelocidadeClass.getAceleracao(), l));
                        lb_resultado4.setText("ΔV = " + valorFormatado + " Km/h");
                    }
                }
                if (rd_m.isSelected()) {
                    if (rd_s.isSelected()) {
                        String valorFormatado = decimal.format(calculoVelocidadeClass.aux2(calculoVelocidadeClass.getAceleracao(), l));
                        lb_resultado4.setText("ΔV = " + valorFormatado + " m/s");
                    }
                    if (rd_min.isSelected()) {
                        String valorFormatado = decimal.format(calculoVelocidadeClass.aux2(calculoVelocidadeClass.getAceleracao(), l));
                        lb_resultado4.setText("ΔV = " + valorFormatado + " m/min");
                    }
                    if (rd_h.isSelected()) {
                        String valorFormatado = decimal.format(calculoVelocidadeClass.aux2(calculoVelocidadeClass.getAceleracao(), l));
                        lb_resultado4.setText("ΔV = " + valorFormatado + " m/h");
                    }
                }
                if (rd_cm.isSelected()) {
                    if (rd_s.isSelected()) {
                        String valorFormatado = decimal.format(calculoVelocidadeClass.aux2(calculoVelocidadeClass.getAceleracao(), l));
                        lb_resultado4.setText("ΔV = " + valorFormatado + " cm/s");
                    }
                    if (rd_min.isSelected()) {
                        String valorFormatado = decimal.format(calculoVelocidadeClass.aux2(calculoVelocidadeClass.getAceleracao(), l));
                        lb_resultado4.setText("ΔV = " + valorFormatado + " cm/min");
                    }
                    if (rd_h.isSelected()) {
                        String valorFormatado = decimal.format(calculoVelocidadeClass.aux2(calculoVelocidadeClass.getAceleracao(), l));
                        lb_resultado4.setText("ΔV = " + valorFormatado + " cm/h");
                    }
                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "Preencha os campos: espaço inicial e final, tempo inicial e final");
            }
        } else if (rd_tempo.isSelected()) {
            if (!tf_aceleracao.getText().isEmpty() && !tf_veloinicial.getText().isEmpty()
                    && !tf_velofinal.getText().isEmpty()) {
                calculoVelocidadeClass.setAceleracao(Double.parseDouble(tf_aceleracao.getText()));
                calculoVelocidadeClass.setVelocidadeInicial(Double.parseDouble(tf_veloinicial.getText()));
                calculoVelocidadeClass.setVelocidadeFinal(Double.parseDouble(tf_velofinal.getText()));
                lb_resultado.setText("ΔT = ΔV / ãm");
                Double a = Double.parseDouble(tf_aceleracao.getText());
                Double c = Double.parseDouble(tf_velofinal.getText());
                Double d = Double.parseDouble(tf_veloinicial.getText());
                String e = decimal.format(a);
                String g = decimal.format(c);
                String h = decimal.format(d);
                lb_resultado2.setText("ΔT = ( " + g + " - " + h + " ) / " + e);
                Double x = calculoVelocidadeClass.aux(calculoVelocidadeClass.getVelocidadeFinal(),
                        calculoVelocidadeClass.getVelocidadeInicial());
                String k = decimal.format(x);
                lb_resultado3.setText("ΔT = " + k + " / " + e);
                String valorFormatado = decimal.format(calculoVelocidadeClass.aux3(x, calculoVelocidadeClass.getAceleracao()));
                if (rd_km.isSelected()) {
                    if (rd_s.isSelected()) {
                        lb_resultado4.setText("ΔT =  " + valorFormatado + " Km/s");
                    }
                    if (rd_min.isSelected()) {
                        lb_resultado4.setText("ΔT =  " + valorFormatado + " Km/min");
                    }
                    if (rd_h.isSelected()) {
                        lb_resultado4.setText("ΔT =  " + valorFormatado + " Km/h");
                    }
                }
                if (rd_m.isSelected()) {
                    if (rd_s.isSelected()) {
                        lb_resultado4.setText("ΔT =  " + valorFormatado + " m/s");
                    }
                    if (rd_min.isSelected()) {
                        lb_resultado4.setText("ΔT =  " + valorFormatado + " m/min");
                    }
                    if (rd_h.isSelected()) {
                        lb_resultado4.setText("ΔT =  " + valorFormatado + " m/h");
                    }
                }
                if (rd_cm.isSelected()) {
                    if (rd_s.isSelected()) {
                        lb_resultado4.setText("ΔT =  " + valorFormatado + " cm/s");
                    }
                    if (rd_min.isSelected()) {
                        lb_resultado4.setText("ΔT =  " + valorFormatado + " cm/min");
                    }
                    if (rd_h.isSelected()) {
                        lb_resultado4.setText("ΔT =  " + valorFormatado + " cm/h");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Preencha os campos:  espaço inicial e final, velocidade inicial e final.");
            }
        } else if (rd_aceleracao.isSelected()) {
            lb_resultado.setText("ãm = V / T");
            if (!tf_tempoinicial.getText().isEmpty() && !tf_veloinicial.getText().isEmpty()
                    && !tf_tempofinal.getText().isEmpty() && !tf_velofinal.getText().isEmpty()) {
                calculoVelocidadeClass.setTempoInicial(Double.parseDouble(tf_tempoinicial.getText()));
                calculoVelocidadeClass.setVelocidadeInicial(Double.parseDouble(tf_veloinicial.getText()));
                calculoVelocidadeClass.setTempoFinal(Double.parseDouble(tf_tempofinal.getText()));
                calculoVelocidadeClass.setVelocidadeFinal(Double.parseDouble(tf_velofinal.getText()));
                Double g = Double.parseDouble(tf_velofinal.getText());
                Double h = Double.parseDouble(tf_veloinicial.getText());
                Double i = Double.parseDouble(tf_tempofinal.getText());
                Double j = Double.parseDouble(tf_tempoinicial.getText());
                String b = decimal.format(g);
                String c = decimal.format(h);
                String d = decimal.format(i);
                String e = decimal.format(j);
                lb_resultado2.setText("ãm = (" + b + " - " + c + ") / (" + d + " - " + e + ")");
                String k = decimal.format(calculoVelocidadeClass.aux(calculoVelocidadeClass.getVelocidadeFinal(),
                        calculoVelocidadeClass.getVelocidadeInicial()));
                String l = decimal.format(calculoVelocidadeClass.aux(calculoVelocidadeClass.getTempoFinal(),
                        calculoVelocidadeClass.getTempoInicial()));

                lb_resultado3.setText("ãm = " + k + " / " + l);

                String m = decimal.format(calculoVelocidadeClass.media(calculoVelocidadeClass.getVelocidadeFinal(),
                        calculoVelocidadeClass.getVelocidadeInicial(), calculoVelocidadeClass.getTempoFinal(),
                        calculoVelocidadeClass.getTempoInicial()));

                if (rd_km.isSelected()) {
                    if (rd_s.isSelected()) {
                        lb_resultado4.setText("ãm = " + m + " Km/s");
                    }
                    if (rd_min.isSelected()) {
                        lb_resultado4.setText("ãm = " + m + " Km/min");
                    }
                    if (rd_h.isSelected()) {
                        lb_resultado4.setText("ãm = " + m + " Km/h");
                    }
                }
                if (rd_m.isSelected()) {
                    if (rd_s.isSelected()) {
                        lb_resultado4.setText("ãm = " + m + " m/s");
                    }
                    if (rd_min.isSelected()) {
                        lb_resultado4.setText("ãm = " + m + " m/min");
                    }
                    if (rd_h.isSelected()) {
                        lb_resultado4.setText("ãm = " + m + " m/h");
                    }
                }
                if (rd_cm.isSelected()) {
                    if (rd_s.isSelected()) {
                        lb_resultado4.setText("ãm = " + m + " cm/s");
                    }
                    if (rd_min.isSelected()) {
                        lb_resultado4.setText("ãm = " + m + " cm/min");
                    }
                    if (rd_h.isSelected()) {
                        lb_resultado4.setText("ãm = " + m + " cm/h");
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
        tf_aceleracao.setText("");
        tf_tempofinal.setText("");
        tf_tempoinicial.setText("");
        tf_velofinal.setText("");
        tf_veloinicial.setText("");
        if (rd_velocidade.isSelected()) {
            lb_resultado.setText("ΔV = ãm . ΔT ");
            lb_resultado2.setText("ΔV = ");
            lb_resultado3.setText("ΔV = ");
            lb_resultado4.setText("ΔV = ");
        } else if (rd_aceleracao.isSelected()) {
            lb_resultado.setText("ãm = ΔV / ΔT ");
            lb_resultado2.setText("ãm =");
            lb_resultado3.setText("ãm =");
            lb_resultado4.setText("ãm =");
        } else if (rd_tempo.isSelected()) {
            lb_resultado.setText("ΔT = ΔV / ãm  ");
            lb_resultado2.setText("ΔT =");
            lb_resultado3.setText("ΔT =");
            lb_resultado4.setText("ΔT =");
        } else {
            lb_resultado.setText("ãm = ΔV / ΔT  ");
            lb_resultado2.setText("ãm = ");
            lb_resultado3.setText("ãm =  ");
            lb_resultado4.setText("ãm = ");
        }
        // lb_resultado5.setText("ãm =");

    }
}
