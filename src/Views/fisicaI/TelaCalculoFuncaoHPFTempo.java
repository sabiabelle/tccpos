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
public class TelaCalculoFuncaoHPFTempo extends javax.swing.JFrame {

    DecimalFormat decimal = new DecimalFormat("0.00");
    CalculoVelocidadeClass calculoVelocidadeClass = new CalculoVelocidadeClass();

    public TelaCalculoFuncaoHPFTempo() {
        initComponents();
        //Tela inicia Maximizada...
        setExtendedState(MAXIMIZED_BOTH);
        //ícone do Aplicativo...
        URL url = this.getClass().getResource("");
        Image icone = Toolkit.getDefaultToolkit().getImage(url);
        // this.setIconImage(icone);

        tf_espacoinicial.setEnabled(false);
        tf_espacofinal.setEnabled(false);
        tf_velocidade.setEnabled(false);
        tf_aceleracao.setEnabled(false);
        tf_tempofinal.setEnabled(false);
        tf_tempoinicial.setEnabled(false);

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

        estudar_estatica = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        rd_espacoinicial = new javax.swing.JRadioButton();
        rd_espacofinal = new javax.swing.JRadioButton();
        rd_velocidade = new javax.swing.JRadioButton();
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
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tf_tempoinicial = new javax.swing.JTextField();
        tf_aceleracao = new javax.swing.JTextField();
        tf_tempofinal = new javax.swing.JTextField();
        tf_espacoinicial = new javax.swing.JTextField();
        tf_velocidade = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tf_espacofinal = new javax.swing.JTextField();
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
        jLabel15 = new javax.swing.JLabel();
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

        rd_espacoinicial.setBackground(new java.awt.Color(202, 233, 255));
        rd_espacoinicial.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        rd_espacoinicial.setText("Posição Inicial");
        rd_espacoinicial.setBorder(null);
        rd_espacoinicial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rd_espacoinicialMouseClicked(evt);
            }
        });
        rd_espacoinicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd_espacoinicialActionPerformed(evt);
            }
        });

        rd_espacofinal.setBackground(new java.awt.Color(202, 233, 255));
        rd_espacofinal.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        rd_espacofinal.setText("Posição Final");
        rd_espacofinal.setBorder(null);
        rd_espacofinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd_espacofinalActionPerformed(evt);
            }
        });

        rd_velocidade.setBackground(new java.awt.Color(202, 233, 255));
        rd_velocidade.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        rd_velocidade.setText("Velocidade");
        rd_velocidade.setBorder(null);
        rd_velocidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd_velocidadeActionPerformed(evt);
            }
        });

        rd_espaco.setBackground(new java.awt.Color(202, 233, 255));
        rd_espaco.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        rd_espaco.setText("Posição");
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
                    .addComponent(rd_velocidade))
                .addGap(28, 28, 28)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rd_espacoinicial)
                    .addComponent(rd_espacofinal))
                .addGap(33, 53, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rd_espaco)
                    .addComponent(rd_espacoinicial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rd_velocidade)
                    .addComponent(rd_espacofinal))
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

        jLabel4.setBackground(new java.awt.Color(202, 233, 255));
        jLabel4.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel4.setText("T:");

        jLabel5.setBackground(new java.awt.Color(202, 233, 255));
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
                .addContainerGap(29, Short.MAX_VALUE))
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
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(202, 233, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 0, 18))); // NOI18N

        jLabel8.setBackground(new java.awt.Color(202, 233, 255));
        jLabel8.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel8.setText("S0:");
        jLabel8.setToolTipText("espaço inicial");

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
        jLabel12.setText("To:");
        jLabel12.setToolTipText("Tempo Inicial");

        tf_tempoinicial.setBackground(new java.awt.Color(202, 233, 255));
        tf_tempoinicial.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        tf_tempoinicial.setToolTipText("Tempo Inicial");

        tf_aceleracao.setBackground(new java.awt.Color(202, 233, 255));
        tf_aceleracao.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        tf_aceleracao.setToolTipText("Aceleração Média");
        tf_aceleracao.setName("Espaço Inicial"); // NOI18N

        tf_tempofinal.setBackground(new java.awt.Color(202, 233, 255));
        tf_tempofinal.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        tf_tempofinal.setToolTipText("Tempo Final");

        tf_espacoinicial.setBackground(new java.awt.Color(202, 233, 255));
        tf_espacoinicial.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        tf_espacoinicial.setToolTipText("espaço inicial");

        tf_velocidade.setBackground(new java.awt.Color(202, 233, 255));
        tf_velocidade.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        tf_velocidade.setToolTipText("Velocidade");

        jLabel17.setBackground(new java.awt.Color(202, 233, 255));
        jLabel17.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel17.setText("Vo:");
        jLabel17.setToolTipText("Velocidade Inicial");

        jLabel10.setBackground(new java.awt.Color(202, 233, 255));
        jLabel10.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel10.setText("S:");
        jLabel10.setToolTipText("espaço final");

        tf_espacofinal.setBackground(new java.awt.Color(202, 233, 255));
        tf_espacofinal.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        tf_espacofinal.setToolTipText("espaço final");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_espacofinal))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_velocidade))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_espacoinicial, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_tempofinal, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                            .addComponent(tf_aceleracao)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_tempoinicial, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_aceleracao, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_tempofinal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_tempoinicial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_velocidade, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_espacoinicial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_espacofinal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel9Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel11, jLabel12, jLabel17, jLabel8, jLabel9, tf_aceleracao, tf_espacoinicial, tf_tempofinal, tf_tempoinicial, tf_velocidade});

        tf_espacoinicial.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(202, 233, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 0, 24))); // NOI18N

        lb_resultado2.setBackground(new java.awt.Color(202, 233, 255));
        lb_resultado2.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lb_resultado2.setText("S = ");

        lb_resultado.setBackground(new java.awt.Color(202, 233, 255));
        lb_resultado.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lb_resultado.setText("S = S0 + V0 . T + 1/2  ãm . T²");

        lb_resultado3.setBackground(new java.awt.Color(202, 233, 255));
        lb_resultado3.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lb_resultado3.setText("S = ");

        lb_resultado4.setBackground(new java.awt.Color(202, 233, 255));
        lb_resultado4.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lb_resultado4.setText("S = ");

        lb_resultado5.setBackground(new java.awt.Color(202, 233, 255));
        lb_resultado5.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lb_resultado5.setText("S =");

        lb_resultado6.setBackground(new java.awt.Color(202, 233, 255));
        lb_resultado6.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lb_resultado6.setText("S =");

        lb_resultado7.setBackground(new java.awt.Color(202, 233, 255));
        lb_resultado7.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lb_resultado7.setText("S =");

        lb_resultado8.setBackground(new java.awt.Color(202, 233, 255));
        lb_resultado8.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lb_resultado8.setText("S =");

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/FHPFT.png"))); // NOI18N

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logoÊ.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(357, 357, 357)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(384, 384, 384))
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
                .addGap(34, 34, 34))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_voltar, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
            .addComponent(lb_limpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lb_paginainicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lb_calcular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/FHPFT Formula_1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(387, 387, 387)
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(335, 335, 335))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
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

    private void lb_paginainicialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_paginainicialMouseClicked
        this.dispose();
        new TelaPrincipal().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_lb_paginainicialMouseClicked

    private void lb_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_voltarMouseClicked
        this.dispose();
        new TelaCalculosEscolhaCinematica().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_lb_voltarMouseClicked

    private void lb_limparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_limparMouseClicked
        limpar();        // TODO add your handling code here:
    }//GEN-LAST:event_lb_limparMouseClicked

    private void lb_calcularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_calcularMouseClicked
        calculo();        // TODO add your handling code here:
    }//GEN-LAST:event_lb_calcularMouseClicked

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

        if (rd_velocidade.isSelected()) {
            rd_espacoinicial.setSelected(false);
            rd_espacofinal.setSelected(false);
            rd_espaco.setSelected(false);

            tf_espacoinicial.setEnabled(true);
            tf_espacofinal.setEnabled(true);
            tf_velocidade.setEnabled(false);
            tf_aceleracao.setEnabled(true);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }
        if (rd_espacoinicial.isSelected()) {
            rd_espacofinal.setSelected(false);
            rd_espaco.setSelected(false);
            rd_velocidade.setSelected(false);

            tf_espacoinicial.setEnabled(false);
            tf_espacofinal.setEnabled(true);
            tf_velocidade.setEnabled(true);
            tf_aceleracao.setEnabled(true);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }
        if (rd_espacofinal.isSelected()) {
            rd_espacoinicial.setSelected(false);
            rd_espaco.setSelected(false);
            rd_velocidade.setSelected(false);

            tf_espacoinicial.setEnabled(true);
            tf_espacofinal.setEnabled(false);
            tf_velocidade.setEnabled(true);
            tf_aceleracao.setEnabled(true);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }
        if (rd_espaco.isSelected()) {
            rd_espacofinal.setSelected(false);
            rd_espacoinicial.setSelected(false);
            rd_velocidade.setSelected(false);

            tf_espacoinicial.setEnabled(false);
            tf_espacofinal.setEnabled(false);
            tf_velocidade.setEnabled(true);
            tf_aceleracao.setEnabled(true);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }
    }//GEN-LAST:event_rd_hActionPerformed

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
        if (rd_velocidade.isSelected()) {
            rd_espacoinicial.setSelected(false);
            rd_espacofinal.setSelected(false);
            rd_espaco.setSelected(false);

            tf_espacoinicial.setEnabled(true);
            tf_espacofinal.setEnabled(true);
            tf_velocidade.setEnabled(false);
            tf_aceleracao.setEnabled(true);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }
        if (rd_espacoinicial.isSelected()) {
            rd_espacofinal.setSelected(false);
            rd_espaco.setSelected(false);
            rd_velocidade.setSelected(false);

            tf_espacoinicial.setEnabled(false);
            tf_espacofinal.setEnabled(true);
            tf_velocidade.setEnabled(true);
            tf_aceleracao.setEnabled(true);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }
        if (rd_espacofinal.isSelected()) {
            rd_espacoinicial.setSelected(false);
            rd_espaco.setSelected(false);
            rd_velocidade.setSelected(false);

            tf_espacoinicial.setEnabled(true);
            tf_espacofinal.setEnabled(false);
            tf_velocidade.setEnabled(true);
            tf_aceleracao.setEnabled(true);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }
        if (rd_espaco.isSelected()) {
            rd_espacofinal.setSelected(false);
            rd_espacoinicial.setSelected(false);
            rd_velocidade.setSelected(false);

            tf_espacoinicial.setEnabled(false);
            tf_espacofinal.setEnabled(false);
            tf_velocidade.setEnabled(true);
            tf_aceleracao.setEnabled(true);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }
    }//GEN-LAST:event_rd_minActionPerformed

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
        if (rd_velocidade.isSelected()) {
            rd_espacoinicial.setSelected(false);
            rd_espacofinal.setSelected(false);
            rd_espaco.setSelected(false);

            tf_espacoinicial.setEnabled(true);
            tf_espacofinal.setEnabled(true);
            tf_velocidade.setEnabled(false);
            tf_aceleracao.setEnabled(true);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }
        if (rd_espacoinicial.isSelected()) {
            rd_espacofinal.setSelected(false);
            rd_espaco.setSelected(false);
            rd_velocidade.setSelected(false);

            tf_espacoinicial.setEnabled(false);
            tf_espacofinal.setEnabled(true);
            tf_velocidade.setEnabled(true);
            tf_aceleracao.setEnabled(true);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }
        if (rd_espacofinal.isSelected()) {
            rd_espacoinicial.setSelected(false);
            rd_espaco.setSelected(false);
            rd_velocidade.setSelected(false);

            tf_espacoinicial.setEnabled(true);
            tf_espacofinal.setEnabled(false);
            tf_velocidade.setEnabled(true);
            tf_aceleracao.setEnabled(true);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }
        if (rd_espaco.isSelected()) {
            rd_espacofinal.setSelected(false);
            rd_espacoinicial.setSelected(false);
            rd_velocidade.setSelected(false);

            tf_espacoinicial.setEnabled(false);
            tf_espacofinal.setEnabled(false);
            tf_velocidade.setEnabled(true);
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
        if (rd_velocidade.isSelected()) {
            rd_espacoinicial.setSelected(false);
            rd_espacofinal.setSelected(false);
            rd_espaco.setSelected(false);

            tf_espacoinicial.setEnabled(true);
            tf_espacofinal.setEnabled(true);
            tf_velocidade.setEnabled(false);
            tf_aceleracao.setEnabled(true);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }
        if (rd_espacoinicial.isSelected()) {
            rd_espacofinal.setSelected(false);
            rd_espaco.setSelected(false);
            rd_velocidade.setSelected(false);

            tf_espacoinicial.setEnabled(false);
            tf_espacofinal.setEnabled(true);
            tf_velocidade.setEnabled(true);
            tf_aceleracao.setEnabled(true);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }
        if (rd_espacofinal.isSelected()) {
            rd_espacoinicial.setSelected(false);
            rd_espaco.setSelected(false);
            rd_velocidade.setSelected(false);

            tf_espacoinicial.setEnabled(true);
            tf_espacofinal.setEnabled(false);
            tf_velocidade.setEnabled(true);
            tf_aceleracao.setEnabled(true);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }
        if (rd_espaco.isSelected()) {
            rd_espacofinal.setSelected(false);
            rd_espacoinicial.setSelected(false);
            rd_velocidade.setSelected(false);

            tf_espacoinicial.setEnabled(false);
            tf_espacofinal.setEnabled(false);
            tf_velocidade.setEnabled(true);
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
        if (rd_velocidade.isSelected()) {
            rd_espacoinicial.setSelected(false);
            rd_espacofinal.setSelected(false);
            rd_espaco.setSelected(false);

            tf_espacoinicial.setEnabled(true);
            tf_espacofinal.setEnabled(true);
            tf_velocidade.setEnabled(false);
            tf_aceleracao.setEnabled(true);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }
        if (rd_espacoinicial.isSelected()) {
            rd_espacofinal.setSelected(false);
            rd_espaco.setSelected(false);
            rd_velocidade.setSelected(false);

            tf_espacoinicial.setEnabled(false);
            tf_espacofinal.setEnabled(true);
            tf_velocidade.setEnabled(true);
            tf_aceleracao.setEnabled(true);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }
        if (rd_espacofinal.isSelected()) {
            rd_espacoinicial.setSelected(false);
            rd_espaco.setSelected(false);
            rd_velocidade.setSelected(false);

            tf_espacoinicial.setEnabled(true);
            tf_espacofinal.setEnabled(false);
            tf_velocidade.setEnabled(true);
            tf_aceleracao.setEnabled(true);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }
        if (rd_espaco.isSelected()) {
            rd_espacofinal.setSelected(false);
            rd_espacoinicial.setSelected(false);
            rd_velocidade.setSelected(false);

            tf_espacoinicial.setEnabled(false);
            tf_espacofinal.setEnabled(false);
            tf_velocidade.setEnabled(true);
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
        if (rd_velocidade.isSelected()) {
            rd_espacoinicial.setSelected(false);
            rd_espacofinal.setSelected(false);
            rd_espaco.setSelected(false);

            tf_espacoinicial.setEnabled(true);
            tf_espacofinal.setEnabled(true);
            tf_velocidade.setEnabled(false);
            tf_aceleracao.setEnabled(true);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }
        if (rd_espacoinicial.isSelected()) {
            rd_espacofinal.setSelected(false);
            rd_espaco.setSelected(false);
            rd_velocidade.setSelected(false);

            tf_espacoinicial.setEnabled(false);
            tf_espacofinal.setEnabled(true);
            tf_velocidade.setEnabled(true);
            tf_aceleracao.setEnabled(true);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }
        if (rd_espacofinal.isSelected()) {
            rd_espacoinicial.setSelected(false);
            rd_espaco.setSelected(false);
            rd_velocidade.setSelected(false);

            tf_espacoinicial.setEnabled(true);
            tf_espacofinal.setEnabled(false);
            tf_velocidade.setEnabled(true);
            tf_aceleracao.setEnabled(true);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }
        if (rd_espaco.isSelected()) {
            rd_espacofinal.setSelected(false);
            rd_espacoinicial.setSelected(false);
            rd_velocidade.setSelected(false);

            tf_espacoinicial.setEnabled(false);
            tf_espacofinal.setEnabled(false);
            tf_velocidade.setEnabled(true);
            tf_aceleracao.setEnabled(true);
            tf_tempofinal.setEnabled(true);
            tf_tempoinicial.setEnabled(true);
        }
    }//GEN-LAST:event_rd_cmActionPerformed

    private void rd_cmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rd_cmMouseClicked
        rd_m.setSelected(false);
        rd_km.setSelected(false);
    }//GEN-LAST:event_rd_cmMouseClicked

    private void rd_espacoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_espacoActionPerformed
        rd_velocidade.setSelected(false);
        rd_espacofinal.setSelected(false);
        rd_espacoinicial.setSelected(false);
        rd_cm.setEnabled(true);
        rd_m.setEnabled(true);
        rd_km.setEnabled(true);
        rd_s.setEnabled(true);
        rd_min.setEnabled(true);
        rd_h.setEnabled(true);
        tf_aceleracao.setEnabled(false);
        tf_tempofinal.setEnabled(false);
        tf_tempoinicial.setEnabled(false);
        tf_espacoinicial.setEnabled(false);
        tf_espacofinal.setEnabled(false);
        tf_velocidade.setEnabled(false);
        limpar();
    }//GEN-LAST:event_rd_espacoActionPerformed

    private void rd_velocidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_velocidadeActionPerformed
        rd_espaco.setSelected(false);
        rd_espacofinal.setSelected(false);
        rd_espacoinicial.setSelected(false);
        rd_cm.setEnabled(true);
        rd_m.setEnabled(true);
        rd_km.setEnabled(true);
        rd_s.setEnabled(true);
        rd_min.setEnabled(true);
        rd_h.setEnabled(true);
        tf_aceleracao.setEnabled(false);
        tf_tempofinal.setEnabled(false);
        tf_tempoinicial.setEnabled(false);
        tf_espacoinicial.setEnabled(false);
        tf_espacofinal.setEnabled(false);
        tf_velocidade.setEnabled(false);
        limpar();
    }//GEN-LAST:event_rd_velocidadeActionPerformed

    private void rd_espacofinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_espacofinalActionPerformed
        rd_espaco.setSelected(false);
        rd_velocidade.setSelected(false);
        rd_espacoinicial.setSelected(false);
        rd_cm.setEnabled(true);
        rd_m.setEnabled(true);
        rd_km.setEnabled(true);
        rd_s.setEnabled(true);
        rd_min.setEnabled(true);
        rd_h.setEnabled(true);
        tf_aceleracao.setEnabled(false);
        tf_tempofinal.setEnabled(false);
        tf_tempoinicial.setEnabled(false);
        tf_espacoinicial.setEnabled(false);
        tf_espacofinal.setEnabled(false);
        tf_velocidade.setEnabled(false);
        limpar();
    }//GEN-LAST:event_rd_espacofinalActionPerformed

    private void rd_espacoinicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_espacoinicialActionPerformed
        rd_velocidade.setSelected(false);
        rd_espacofinal.setSelected(false);
        rd_espaco.setSelected(false);

        rd_cm.setEnabled(true);
        rd_m.setEnabled(true);
        rd_km.setEnabled(true);
        rd_s.setEnabled(true);
        rd_min.setEnabled(true);
        rd_h.setEnabled(true);
        tf_aceleracao.setEnabled(false);
        tf_tempofinal.setEnabled(false);
        tf_tempoinicial.setEnabled(false);
        tf_espacofinal.setEnabled(false);
        tf_espacoinicial.setEnabled(false);
        tf_velocidade.setEnabled(false);
        limpar();
    }//GEN-LAST:event_rd_espacoinicialActionPerformed

    private void rd_espacoinicialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rd_espacoinicialMouseClicked
        limpar();
    }//GEN-LAST:event_rd_espacoinicialMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCalculoFuncaoHPFTempo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel estudar_estatica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JRadioButton rd_cm;
    private javax.swing.JRadioButton rd_espaco;
    private javax.swing.JRadioButton rd_espacofinal;
    private javax.swing.JRadioButton rd_espacoinicial;
    private javax.swing.JRadioButton rd_h;
    private javax.swing.JRadioButton rd_km;
    private javax.swing.JRadioButton rd_m;
    private javax.swing.JRadioButton rd_min;
    private javax.swing.JRadioButton rd_s;
    private javax.swing.JRadioButton rd_velocidade;
    private javax.swing.JTextField tf_aceleracao;
    private javax.swing.JTextField tf_espacofinal;
    private javax.swing.JTextField tf_espacoinicial;
    private javax.swing.JTextField tf_tempofinal;
    private javax.swing.JTextField tf_tempoinicial;
    private javax.swing.JTextField tf_velocidade;
    // End of variables declaration//GEN-END:variables
    public void calculo() {
        if (rd_espacoinicial.isSelected()) {
            lb_resultado.setText("- S0 = - S + V0 . T + (ãm . T²) / 2");
            if (!tf_aceleracao.getText().isEmpty() && !tf_tempoinicial.getText().isEmpty()
                    && !tf_tempofinal.getText().isEmpty() && !tf_velocidade.getText().isEmpty()
                    && !tf_espacofinal.getText().isEmpty()) {
                calculoVelocidadeClass.setAceleracao(Double.parseDouble(tf_aceleracao.getText()));
                calculoVelocidadeClass.setTempoInicial(Double.parseDouble(tf_tempoinicial.getText()));
                calculoVelocidadeClass.setTempoFinal(Double.parseDouble(tf_tempofinal.getText()));
                calculoVelocidadeClass.setVelocidadeInicial(Double.parseDouble(tf_velocidade.getText()));
                calculoVelocidadeClass.setEspacoFinal(Double.parseDouble(tf_espacofinal.getText()));
                Double a = Double.parseDouble(tf_aceleracao.getText());
                Double b = Double.parseDouble(tf_tempofinal.getText());
                Double c = Double.parseDouble(tf_tempoinicial.getText());
                Double d = Double.parseDouble(tf_velocidade.getText());
                Double e = Double.parseDouble(tf_espacofinal.getText());
                String f = decimal.format(a);
                String g = decimal.format(b);
                String h = decimal.format(c);
                String i = decimal.format(d);
                String j = decimal.format(e);
                lb_resultado2.setText(" - S0 = - " + j + " + " + i + " . (" + g + " - " + h + ") + (" + f + " . (" + g + " - " + h + ") ²) / 2");
                Double l = calculoVelocidadeClass.aux(calculoVelocidadeClass.getTempoFinal(), calculoVelocidadeClass.getTempoInicial());
                // subtraindo tempo final - tempo inicial
                String k = decimal.format(l);
                Double q = calculoVelocidadeClass.aux2(l, l); //quadrado do tempo: tempo * tempo
                String r = decimal.format(q);
                Double m = calculoVelocidadeClass.aux2(calculoVelocidadeClass.getAceleracao(), q); //multiplicando a aceleração * tempo ao quadrado
                String n = decimal.format(m);
                Double o = calculoVelocidadeClass.aux2(calculoVelocidadeClass.getVelocidadeInicial(), l); //multiplicando a velocidade * tempo
                String p = decimal.format(o);
                Double s = calculoVelocidadeClass.aux3(m, 2); //dividindo por 2
                String t = decimal.format(s);
                lb_resultado3.setText(" - S0 = - " + j + " + " + i + " . " + k + " + (" + f + " . " + k + " ²) / 2");
                lb_resultado4.setText(" - S0 = - " + j + " + " + p + " + (" + f + " . " + r + ") / 2");
                lb_resultado5.setText(" - S0 = - " + j + " + " + p + " + " + n + " / 2");
                lb_resultado6.setText(" - S0 = - " + j + " + " + p + " + " + t);
                Double u = calculoVelocidadeClass.aux5(e, o, s); //somando
                String v = decimal.format(u);
                lb_resultado7.setText(" - S0 = - " + v);
                if (rd_km.isSelected()) {
                    if (rd_s.isSelected()) {
                        lb_resultado8.setText("S0 = " + v + " Km/s");
                    }
                    if (rd_min.isSelected()) {
                        lb_resultado8.setText("S0 = " + v + " Km/min");
                    }
                    if (rd_h.isSelected()) {
                        lb_resultado8.setText("S0 = " + v + " Km/h");
                    }
                }
                if (rd_m.isSelected()) {
                    if (rd_s.isSelected()) {
                        lb_resultado8.setText("S0 = " + v + " m/s");
                    }
                    if (rd_min.isSelected()) {
                        lb_resultado8.setText("S0 = " + v + " m/min");
                    }
                    if (rd_h.isSelected()) {
                        lb_resultado8.setText("S0 = " + v + " m/h");
                    }
                }
                if (rd_cm.isSelected()) {
                    if (rd_s.isSelected()) {
                        lb_resultado8.setText("S0 =  " + v + " cm/s");
                    }
                    if (rd_min.isSelected()) {
                        lb_resultado8.setText("S0 =  " + v + " cm/min");
                    }
                    if (rd_h.isSelected()) {
                        lb_resultado8.setText("S0 =  " + v + " cm/h");
                    }
                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "Preencha os campos: aceleração, tempo inicial e final");
            }
        } else if (rd_espacofinal.isSelected()) {
            lb_resultado.setText("S = S0 + Vo . T +(ãm . T²) / 2 ");
            if (!tf_aceleracao.getText().isEmpty() && !tf_tempoinicial.getText().isEmpty()
                    && !tf_tempofinal.getText().isEmpty() && !tf_velocidade.getText().isEmpty()
                    && !tf_espacoinicial.getText().isEmpty()) {
                calculoVelocidadeClass.setAceleracao(Double.parseDouble(tf_aceleracao.getText()));
                calculoVelocidadeClass.setTempoInicial(Double.parseDouble(tf_tempoinicial.getText()));
                calculoVelocidadeClass.setTempoFinal(Double.parseDouble(tf_tempofinal.getText()));
                calculoVelocidadeClass.setVelocidadeInicial(Double.parseDouble(tf_velocidade.getText()));
                calculoVelocidadeClass.setEspacoInicial(Double.parseDouble(tf_espacoinicial.getText()));
                Double a = Double.parseDouble(tf_aceleracao.getText());
                Double b = Double.parseDouble(tf_tempofinal.getText());
                Double c = Double.parseDouble(tf_tempoinicial.getText());
                Double d = Double.parseDouble(tf_velocidade.getText());
                Double e = Double.parseDouble(tf_espacoinicial.getText());
                String f = decimal.format(a);
                String g = decimal.format(b);
                String h = decimal.format(c);
                String i = decimal.format(d);
                String j = decimal.format(e);
                Double l = calculoVelocidadeClass.aux(calculoVelocidadeClass.getTempoFinal(), calculoVelocidadeClass.getTempoInicial());
                String k = decimal.format(l);
                Double q = calculoVelocidadeClass.aux2(l, l); //quadrado do tempo: tempo * tempo
                String r = decimal.format(q);
                Double m = calculoVelocidadeClass.aux2(calculoVelocidadeClass.getAceleracao(), q); //multiplicando a aceleração * tempo ao quadrado
                String n = decimal.format(m);
                Double o = calculoVelocidadeClass.aux2(calculoVelocidadeClass.getVelocidadeInicial(), l); //multiplicando a velocidade * tempo
                String p = decimal.format(o);
                Double s = calculoVelocidadeClass.aux3(m, 2); //dividindo por 2
                String t = decimal.format(s);
                lb_resultado2.setText("S = " + j + " + " + i + " . (" + g + " - " + h + ") + (" + f + " . (" + g + " - " + h + ")²) / 2 ");
                lb_resultado3.setText("S = " + j + " + " + i + " . (" + k + ") + (" + f + " . (" + k + ")²) / 2 ");
                lb_resultado4.setText("S = " + j + " + " + p + ") + (" + f + " .  " + r + " ) / 2 ");
                lb_resultado5.setText("S = " + j + " + " + p + " + (" + n + ") / 2 ");
                lb_resultado6.setText("S = " + j + " + " + p + " + " + t);

                Double u = calculoVelocidadeClass.aux5(e, o, s); //somando
                String v = decimal.format(u);
                lb_resultado8.setVisible(false);
                if (rd_km.isSelected()) {
                    if (rd_s.isSelected()) {
                        lb_resultado7.setText("S = " + v + " Km/s");
                    }
                    if (rd_min.isSelected()) {
                        lb_resultado7.setText("S = " + v + " Km/min");
                    }
                    if (rd_h.isSelected()) {
                        lb_resultado7.setText("S = " + v + " Km/h");
                    }
                }
                if (rd_m.isSelected()) {
                    if (rd_s.isSelected()) {
                        lb_resultado7.setText("Δ  = " + v + " m/s");
                    }
                    if (rd_min.isSelected()) {
                        lb_resultado7.setText("Δ  = " + v + " m/min");
                    }
                    if (rd_h.isSelected()) {
                        lb_resultado7.setText("Δ  = " + v + " m/h");
                    }
                }
                if (rd_cm.isSelected()) {
                    if (rd_s.isSelected()) {
                        lb_resultado7.setText("S = " + v + " cm/s");
                    }
                    if (rd_min.isSelected()) {
                        lb_resultado7.setText("S = " + v + " cm/min");
                    }
                    if (rd_h.isSelected()) {
                        lb_resultado7.setText("S = " + v + " cm/h");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Preencha os campos: aceleração, tempo inicial e final");
            }
        } else if (rd_espaco.isSelected()) {
            if (!tf_aceleracao.getText().isEmpty() && !tf_tempoinicial.getText().isEmpty()
                    && !tf_tempofinal.getText().isEmpty() && !tf_velocidade.getText().isEmpty()) {
                calculoVelocidadeClass.setAceleracao(Double.parseDouble(tf_aceleracao.getText()));
                calculoVelocidadeClass.setTempoInicial(Double.parseDouble(tf_tempoinicial.getText()));
                calculoVelocidadeClass.setTempoFinal(Double.parseDouble(tf_tempofinal.getText()));
                calculoVelocidadeClass.setVelocidadeInicial(Double.parseDouble(tf_velocidade.getText()));
                Double a = Double.parseDouble(tf_aceleracao.getText());
                Double b = Double.parseDouble(tf_tempofinal.getText());
                Double c = Double.parseDouble(tf_tempoinicial.getText());
                Double d = Double.parseDouble(tf_velocidade.getText());
                String e = decimal.format(a);
                String f = decimal.format(b);
                String g = decimal.format(c);
                String h = decimal.format(d);
                Double j = calculoVelocidadeClass.aux(calculoVelocidadeClass.getTempoFinal(), calculoVelocidadeClass.getTempoInicial());
                String k = decimal.format(j);//tempo final - tempo inicial
                Double l = calculoVelocidadeClass.aux2(j, j); //quadrado do tempo: tempo * tempo
                String m = decimal.format(l);
                Double n = calculoVelocidadeClass.aux2(calculoVelocidadeClass.getAceleracao(), l); //multiplicando a aceleração * tempo ao quadrado
                String o = decimal.format(n);
                Double p = calculoVelocidadeClass.aux2(calculoVelocidadeClass.getVelocidadeInicial(), j); //multiplicando a velocidade * tempo
                String q = decimal.format(p);
                Double r = calculoVelocidadeClass.aux3(n, 2); //dividindo por 2
                String s = decimal.format(r);
                lb_resultado2.setText("ΔS = "+h+" . ("+f+" - "+g+") + ("+e +" . ("+f+" - "+g+ ")²) / 2");
                lb_resultado3.setText("ΔS = "+h+" . "+k+" + ("+e +" . ("+k+ ")²) / 2");
                lb_resultado4.setText("ΔS = "+h+" . "+k+" + ("+e +" . "+m+ ") / 2");
                lb_resultado5.setText("ΔS = "+q+" + "+o+ " / 2");
                lb_resultado6.setText("ΔS = "+q+" + "+s+ "");
                lb_resultado8.setVisible(false);
                
                String valorFormatado = decimal.format(calculoVelocidadeClass.aux4(p, r));
                if (rd_km.isSelected()) {
                    if (rd_s.isSelected()) {
                        lb_resultado7.setText("ΔS = " + valorFormatado + " Km/s");
                    }
                    if (rd_min.isSelected()) {
                        lb_resultado7.setText("ΔS = " + valorFormatado + " Km/min");
                    }
                    if (rd_h.isSelected()) {
                        lb_resultado7.setText("ΔS = " + valorFormatado + " Km/h");
                    }
                }
                if (rd_m.isSelected()) {
                    if (rd_s.isSelected()) {
                        lb_resultado7.setText("ΔS = " + valorFormatado + " m/s");
                    }
                    if (rd_min.isSelected()) {
                        lb_resultado7.setText("ΔS = " + valorFormatado + " m/min");
                    }
                    if (rd_h.isSelected()) {
                        lb_resultado7.setText("ΔS = " + valorFormatado + " m/h");
                    }
                }
                if (rd_cm.isSelected()) {
                    if (rd_s.isSelected()) {
                        lb_resultado7.setText("ΔS = " + valorFormatado + " cm/s");
                    }
                    if (rd_min.isSelected()) {
                        lb_resultado7.setText("ΔS = " + valorFormatado + " cm/min");
                    }
                    if (rd_h.isSelected()) {
                        lb_resultado7.setText("ΔS = " + valorFormatado + " cm/h");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Preencha os campos: aceleração, tempo inicial e final");
            }
        } else if (rd_velocidade.isSelected()) {
            if (!tf_aceleracao.getText().isEmpty() && !tf_tempoinicial.getText().isEmpty()
                    && !tf_tempofinal.getText().isEmpty() && !tf_espacofinal.getText().isEmpty() 
                    && !tf_espacoinicial.getText().isEmpty()) {
                calculoVelocidadeClass.setAceleracao(Double.parseDouble(tf_aceleracao.getText()));
                calculoVelocidadeClass.setTempoInicial(Double.parseDouble(tf_tempoinicial.getText()));
                calculoVelocidadeClass.setTempoFinal(Double.parseDouble(tf_tempofinal.getText()));
                calculoVelocidadeClass.setEspacoFinal(Double.parseDouble(tf_espacofinal.getText()));
                calculoVelocidadeClass.setEspacoInicial(Double.parseDouble(tf_espacoinicial.getText()));
                Double a = Double.parseDouble(tf_aceleracao.getText());
                Double b = Double.parseDouble(tf_tempofinal.getText());
                Double c = Double.parseDouble(tf_tempoinicial.getText());
                Double d = Double.parseDouble(tf_espacofinal.getText());
                Double e = Double.parseDouble(tf_espacoinicial.getText());
                String f = decimal.format(a);
                String g = decimal.format(b);
                String h = decimal.format(c);
                String i = decimal.format(d);
                String n = decimal.format(e);
                Double j = calculoVelocidadeClass.aux(calculoVelocidadeClass.getTempoFinal(), calculoVelocidadeClass.getTempoInicial());
                String k = decimal.format(j);//tempo final - tempo inicial
                Double l = calculoVelocidadeClass.aux(calculoVelocidadeClass.getEspacoFinal(), calculoVelocidadeClass.getEspacoInicial());
                String m = decimal.format(l);//espaço final - espaço inicial
                Double o = calculoVelocidadeClass.aux2(a, j); //aceleração * tempo
                String p = decimal.format(o);
                Double q = calculoVelocidadeClass.aux2(o, o); //quadrado da aceleração * tempo
                String r = decimal.format(q);
                Double s = calculoVelocidadeClass.aux3(q, 2); //quadrado da aceleração / 2
                String t = decimal.format(s);
                Double u = calculoVelocidadeClass.aux(l, s); //subtração do espaço - quadradado da aceleração/2
                String v = decimal.format(u);
                Double x = calculoVelocidadeClass.aux2(u, j); //multiplicação do lb_resultado7
                String z = decimal.format(x);
                lb_resultado.setText("V0 = (S - S0 - ((ãm . T²) / 2)). T");
                lb_resultado2.setText("V0 = (("+i+ " - "+n+ ") - (("+f+" . ("+g+" - "+h+")²) / 2)). ("+g+" - "+h+")");
                lb_resultado3.setText("V0 = ("+m+ " - (("+f+" . "+k+")² / 2)) . "+k+"");
                lb_resultado4.setText("V0 = ("+m+ " - (("+p+")² / 2)) . "+k+"");
                lb_resultado5.setText("V0 = ("+m+ " - ("+r+" / 2)) . "+k+"");
                lb_resultado6.setText("V0 = ("+m+ " - "+t+") . "+k+"");
                lb_resultado7.setText("V0 = "+v+" . "+k+"");
                System.out.print(z);
                String valorFormatado = decimal.format(calculoVelocidadeClass.aux2(u, j));
                if (rd_km.isSelected()) {
                    if (rd_s.isSelected()) {
                        lb_resultado8.setText("V0 = " + valorFormatado + " Km/s");
                    }
                    if (rd_min.isSelected()) {
                        lb_resultado8.setText("V0 = " + valorFormatado+ " Km/min");
                    }
                    if (rd_h.isSelected()) {
                        lb_resultado8.setText("V0 = " + valorFormatado + " Km/h");
                    }
                }
                if (rd_m.isSelected()) {
                    if (rd_s.isSelected()) {
                        lb_resultado8.setText("V0 = " +valorFormatado + " m/s");
                    }
                    if (rd_min.isSelected()) {
                        lb_resultado8.setText("V0 = " + valorFormatado + " m/min");
                    }
                    if (rd_h.isSelected()) {
                        lb_resultado8.setText("V0 = " + valorFormatado+ " m/h");
                    }
                }
                if (rd_cm.isSelected()) {
                    if (rd_s.isSelected()) {
                        lb_resultado8.setText("V0 = " + valorFormatado + " cm/s");
                    }
                    if (rd_min.isSelected()) {
                        lb_resultado8.setText("V0 = " + valorFormatado + " cm/min");
                    }
                    if (rd_h.isSelected()) {
                        lb_resultado8.setText("V0 = " + valorFormatado + " cm/h");
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
        tf_tempofinal.setText("");
        tf_tempoinicial.setText("");
        tf_espacoinicial.setText("");
        tf_espacofinal.setText("");
        tf_velocidade.setText("");

        if (rd_espacofinal.isSelected()) {
            lb_resultado.setText("S = S0 + Vo . T +(ãm . T²) / 2 ");
            lb_resultado2.setText("S =  ");
            lb_resultado3.setText("S =  ");
            lb_resultado4.setText("S =  ");
            lb_resultado5.setText("S =  ");
            lb_resultado6.setText("S =  ");
            lb_resultado7.setText("S =  ");
            lb_resultado8.setText("S =  ");
        } else if (rd_espacoinicial.isSelected()) {
            lb_resultado.setText(" - S0 = - S + V0 . T + (ãm . T²) / 2");
            lb_resultado2.setText(" - S0 =  ");
            lb_resultado3.setText(" - S0 =  ");
            lb_resultado4.setText(" - S0 =  ");
            lb_resultado5.setText(" - S0 =  ");
            lb_resultado6.setText(" - S0 =  ");
            lb_resultado7.setText(" - S0 =  ");
            lb_resultado8.setText(" - S0 =  ");
        } else if (rd_espaco.isSelected()) {
            lb_resultado.setText("ΔS = V0 . T + (ãm . T²) / 2");
            lb_resultado2.setText("ΔS =  ");
            lb_resultado3.setText("ΔS =  ");
            lb_resultado4.setText("ΔS =  ");
            lb_resultado5.setText("ΔS =  ");
            lb_resultado6.setText("ΔS =  ");
            lb_resultado7.setText("ΔS =  ");
            lb_resultado8.setText("ΔS =  ");
        } else if (rd_velocidade.isSelected()) {
            lb_resultado.setText("V0 = (S - S0 - ((ãm . T²) / 2)). T");
            lb_resultado2.setText("V0 =  ");
            lb_resultado3.setText("V0 =  ");
            lb_resultado4.setText("V0 =  ");
            lb_resultado5.setText("V0 =  ");
            lb_resultado6.setText("V0 =  ");
            lb_resultado7.setText("V0 =  ");
            lb_resultado8.setText("V0 =  ");
        } else {
            lb_resultado.setText("S = S0 + Vo . T +(ãm . T²) / 2 ");
            lb_resultado2.setText("S =  ");
            lb_resultado3.setText("S =  ");
            lb_resultado4.setText("S =  ");
            lb_resultado5.setText("S =  ");
            lb_resultado6.setText("S =  ");
            lb_resultado7.setText("S =  ");
            lb_resultado8.setText("S =  ");
        }
    }
}
