package Views.fisicaI;
import Class.CalculoVelocidadeClass;
import Views.*;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.JOptionPane;
/**
 *
 * @author Sábia
 */
public class TelaCalculoFHPFTempoMovimentoVertical extends javax.swing.JFrame {
    CalculoVelocidadeClass calculoVelocidadeClass = new CalculoVelocidadeClass();
    public TelaCalculoFHPFTempoMovimentoVertical() {
        initComponents();
        //Tela inicia Maximizada...
        setExtendedState(MAXIMIZED_BOTH);
        //ícone do Aplicativo...
        URL url = this.getClass().getResource("");
        Image icone = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(icone);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lb_calcular = new javax.swing.JLabel();
        lb_limpar = new javax.swing.JLabel();
        lb_voltar = new javax.swing.JLabel();
        lb_paginainicial = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        rd_vinicial = new javax.swing.JRadioButton();
        rd_altFinal = new javax.swing.JRadioButton();
        rd_altInicial = new javax.swing.JRadioButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tf_tempo = new javax.swing.JTextField();
        tf_velocidadeInicial = new javax.swing.JTextField();
        tf_altInicial = new javax.swing.JTextField();
        tf_altFinal = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        tf_gravidade = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        lb_resultado1 = new javax.swing.JLabel();
        lb_resultado = new javax.swing.JLabel();
        lb_resultado2 = new javax.swing.JLabel();
        lb_resultadofinal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("êfisíco - Cinemática");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(202, 233, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 300));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/F9.png"))); // NOI18N

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logoÊ.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(415, 415, 415)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
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

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/FHPemfuncaodotempo_2.png"))); // NOI18N

        jPanel5.setBackground(new java.awt.Color(202, 233, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Calcular", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 0, 24))); // NOI18N

        jPanel10.setBackground(new java.awt.Color(202, 233, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Marque a opção que deseja calcular", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 0, 18))); // NOI18N

        rd_vinicial.setBackground(new java.awt.Color(202, 233, 255));
        rd_vinicial.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        rd_vinicial.setText("Velocidade Inicial");
        rd_vinicial.setBorder(null);
        rd_vinicial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rd_vinicialMouseClicked(evt);
            }
        });
        rd_vinicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd_vinicialActionPerformed(evt);
            }
        });

        rd_altFinal.setBackground(new java.awt.Color(202, 233, 255));
        rd_altFinal.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        rd_altFinal.setText("Altura Final");
        rd_altFinal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rd_altFinalMouseClicked(evt);
            }
        });
        rd_altFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd_altFinalActionPerformed(evt);
            }
        });

        rd_altInicial.setBackground(new java.awt.Color(202, 233, 255));
        rd_altInicial.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        rd_altInicial.setText("Altura Inicial");
        rd_altInicial.setBorder(null);
        rd_altInicial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rd_altInicialMouseClicked(evt);
            }
        });
        rd_altInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd_altInicialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(rd_vinicial)
                .addGap(18, 18, 18)
                .addComponent(rd_altFinal)
                .addGap(18, 18, 18)
                .addComponent(rd_altInicial)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(0, 15, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rd_altFinal)
                    .addComponent(rd_vinicial)
                    .addComponent(rd_altInicial))
                .addContainerGap())
        );

        jPanel9.setBackground(new java.awt.Color(202, 233, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 0, 18))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel8.setText("Ho:");
        jLabel8.setToolTipText("Velocidade Final");

        jLabel9.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel9.setText("Vo:");
        jLabel9.setToolTipText("Posição Inicial");

        jLabel12.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel12.setText("T:");
        jLabel12.setToolTipText("Tempo Inicial");

        tf_tempo.setBackground(new java.awt.Color(202, 233, 255));
        tf_tempo.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        tf_tempo.setToolTipText("Tempo Inicial");

        tf_velocidadeInicial.setBackground(new java.awt.Color(202, 233, 255));
        tf_velocidadeInicial.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        tf_velocidadeInicial.setToolTipText("Aceleração Média");
        tf_velocidadeInicial.setName("Espaço Inicial"); // NOI18N
        tf_velocidadeInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_velocidadeInicialActionPerformed(evt);
            }
        });

        tf_altInicial.setBackground(new java.awt.Color(202, 233, 255));
        tf_altInicial.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        tf_altInicial.setToolTipText("Velocidade Final");

        tf_altFinal.setBackground(new java.awt.Color(202, 233, 255));
        tf_altFinal.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        tf_altFinal.setToolTipText("Velocidade Inicial");

        jLabel17.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel17.setText("H:");
        jLabel17.setToolTipText("Velocidade Inicial");

        tf_gravidade.setBackground(new java.awt.Color(202, 233, 255));
        tf_gravidade.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        tf_gravidade.setToolTipText("Tempo Inicial");

        jLabel13.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel13.setText("G:");
        jLabel13.setToolTipText("Tempo Inicial");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(567, 567, 567))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(tf_velocidadeInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(tf_altInicial, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_altFinal)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_tempo, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_gravidade, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(38, Short.MAX_VALUE))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_altFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_altInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_gravidade, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tf_tempo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_velocidadeInicial, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(202, 233, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 0, 24))); // NOI18N

        lb_resultado1.setBackground(new java.awt.Color(202, 233, 255));
        lb_resultado1.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lb_resultado1.setText("H = ");

        lb_resultado.setBackground(new java.awt.Color(202, 233, 255));
        lb_resultado.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lb_resultado.setText("H = Ho + Vo * t + 1/2 * g * t²");

        lb_resultado2.setBackground(new java.awt.Color(202, 233, 255));
        lb_resultado2.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lb_resultado2.setText("H = ");

        lb_resultadofinal.setBackground(new java.awt.Color(202, 233, 255));
        lb_resultadofinal.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lb_resultadofinal.setText("H =");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_resultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_resultado1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_resultado2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_resultadofinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_resultado1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_resultado2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_resultadofinal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(418, 418, 418)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(363, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 62, Short.MAX_VALUE)
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
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        this.dispose();
        new TelaPrincipal().setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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

    private void rd_vinicialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rd_vinicialMouseClicked
        limpar();
    }//GEN-LAST:event_rd_vinicialMouseClicked

    private void rd_vinicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_vinicialActionPerformed
        rd_altFinal.setSelected(false);
        rd_altInicial.setSelected(false);
        limpar();
        tf_velocidadeInicial.setEnabled(false);
        tf_tempo.setEnabled(true);
        tf_altInicial.setEnabled(true);
        tf_altFinal.setEnabled(true);
        
        
        
    }//GEN-LAST:event_rd_vinicialActionPerformed

    private void rd_altFinalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rd_altFinalMouseClicked
        limpar();
    }//GEN-LAST:event_rd_altFinalMouseClicked

    private void rd_altFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_altFinalActionPerformed
        rd_vinicial.setSelected(false);
        rd_altInicial.setSelected(false);
        limpar();
        tf_velocidadeInicial.setEnabled(true);
        tf_tempo.setEnabled(true);
        tf_altInicial.setEnabled(true);
        tf_altFinal.setEnabled(false);

    }//GEN-LAST:event_rd_altFinalActionPerformed

    private void rd_altInicialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rd_altInicialMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rd_altInicialMouseClicked

    private void rd_altInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_altInicialActionPerformed
        rd_altFinal.setSelected(false);
        rd_vinicial.setSelected(false);
        limpar();
        tf_velocidadeInicial.setEnabled(true);
        tf_tempo.setEnabled(true);
        tf_altInicial.setEnabled(false);
        tf_altFinal.setEnabled(true);

    }//GEN-LAST:event_rd_altInicialActionPerformed

    private void tf_velocidadeInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_velocidadeInicialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_velocidadeInicialActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCalculoFHPFTempoMovimentoVertical().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lb_calcular;
    private javax.swing.JLabel lb_limpar;
    private javax.swing.JLabel lb_paginainicial;
    private javax.swing.JLabel lb_resultado;
    private javax.swing.JLabel lb_resultado1;
    private javax.swing.JLabel lb_resultado2;
    private javax.swing.JLabel lb_resultadofinal;
    private javax.swing.JLabel lb_voltar;
    private javax.swing.JRadioButton rd_altFinal;
    private javax.swing.JRadioButton rd_altInicial;
    private javax.swing.JRadioButton rd_vinicial;
    private javax.swing.JTextField tf_altFinal;
    private javax.swing.JTextField tf_altInicial;
    private javax.swing.JTextField tf_gravidade;
    private javax.swing.JTextField tf_tempo;
    private javax.swing.JTextField tf_velocidadeInicial;
    // End of variables declaration//GEN-END:variables
    public void calculo() {
        double resposta;
        
        if(rd_altFinal.isSelected()){
            if(!tf_altInicial.getText().isEmpty() && !tf_velocidadeInicial.getText().isEmpty() && !tf_tempo.getText().isEmpty() && !tf_gravidade.getText().isEmpty()){
                /* Pegando os campos e guardando em variáveis */
                double vel_inicial = Double.parseDouble(tf_velocidadeInicial.getText());
                double alt_inicial = Double.parseDouble(tf_altInicial.getText());
                double tempo = Double.parseDouble(tf_tempo.getText());
                double gravidade = Double.parseDouble(tf_gravidade.getText());
                
                resposta = calculoVelocidadeClass.FHPFTMVCalcularAlturaFinal(alt_inicial, vel_inicial, tempo, gravidade);
                
                lb_resultado.setText("H = Ho + Vo * t + 1/2 * g * t²");
                lb_resultado1.setText("H = " + alt_inicial + " + " + vel_inicial + " * " + tempo + "1/2" + " * " + gravidade + " * " + tempo);
                lb_resultado2.setText("H = " + alt_inicial + " + " + vel_inicial*tempo + " + 1/2 " + gravidade*(tempo*tempo));
                lb_resultadofinal.setText("H = " + resposta);
                
            }else{
                JOptionPane.showMessageDialog(null, "Preencha corretamente todos os campos");
            }
        }            
        if(rd_altInicial.isSelected()){
            if(!tf_altFinal.getText().isEmpty() && !tf_velocidadeInicial.getText().isEmpty() && !tf_tempo.getText().isEmpty() && !tf_gravidade.getText().isEmpty()){
                /* Pegando os campos e guardando em variáveis */
                double vel_inicial = Double.parseDouble(tf_velocidadeInicial.getText());
                double alt_final = Double.parseDouble(tf_altFinal.getText());
                double tempo = Double.parseDouble(tf_tempo.getText());
                double gravidade = Double.parseDouble(tf_gravidade.getText());
                
                resposta = calculoVelocidadeClass.FHPFTMVCalcularAlturaInicial(alt_final, vel_inicial, tempo, gravidade);
                
                lb_resultado.setText("-Ho = -H + Vo * t + 1/2 * g *t²");
                lb_resultado1.setText("-Ho = -" + alt_final + " + " + vel_inicial + " * " + tempo + " + 1/2 *" + gravidade + " * " + tempo + "²");
                lb_resultado2.setText("-Ho = -"+ alt_final + " + " + vel_inicial*tempo + " + 1/2 * " + gravidade*(tempo*tempo) + " * (-1)");
                lb_resultadofinal.setText("Ho = " + resposta);
                
            }else{
                JOptionPane.showMessageDialog(null, "Preencha corretamente todos os campos");
            }
        }
        if(rd_vinicial.isSelected()){
            if(!tf_altFinal.getText().isEmpty() && !tf_altInicial.getText().isEmpty() && !tf_tempo.getText().isEmpty() && !tf_gravidade.getText().isEmpty()){
                /* Pegando os campos e guardando em variáveis */
                double alt_inicial = Double.parseDouble(tf_altInicial.getText());
                double alt_final = Double.parseDouble(tf_altFinal.getText());
                double tempo = Double.parseDouble(tf_tempo.getText());
                double gravidade = Double.parseDouble(tf_gravidade.getText());
                
                resposta = calculoVelocidadeClass.FHPFTMVCalcularVelocidadeIncial(alt_inicial, alt_final, gravidade, tempo);
                
                lb_resultado.setText("Vo = (Ho - H + 1/2 * g * t²)/t");
                lb_resultado1.setText("Vo = (" + alt_inicial + " - " + alt_final + " 1/2 * " + gravidade + " * " + tempo + "²)/" + tempo);
                lb_resultado2.setText("Vo = " + (alt_inicial - alt_final) + " + 1/2 *" + (gravidade * (tempo*tempo)) + " / " + tempo);
                lb_resultadofinal.setText("Vo = " + resposta);
                
            }else{
                JOptionPane.showMessageDialog(null, "Preencha corretamente todos os campos");
            }
        }
    }

    public void limpar() {
        tf_altFinal.setText("");
        tf_altInicial.setText("");
        tf_gravidade.setText("");
        tf_tempo.setText("");
        tf_velocidadeInicial.setText("");
        lb_resultado.setText("");
        lb_resultado1.setText("");
        lb_resultado2.setText("");
        lb_resultadofinal.setText("");
        
    }

}
