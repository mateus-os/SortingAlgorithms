package view;

import sortingalgorithms.Bubble;
import sortingalgorithms.DigitLimit;
import sortingalgorithms.Quick;
import sortingalgorithms.Selection;
import sortingalgorithms.Vetor;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;


public class MainView extends javax.swing.JFrame {
    
    Vetor v = new Vetor(); //Instância a classe Vetor
    Bubble b = new Bubble(); //Instância a classe Bubble
    Selection s = new Selection(); //Instância a classe Selection
    Quick q = new Quick(); //Instância a classe Quick
    int[] vetor; //Cria um um vetor
    int[] vetaux; //Cria um um vetor auxiliar

    /**
     * Creates new form Tela
     */
    
    public MainView() 
    {
        initComponents();
        txt_tamVetor.setDocument(new DigitLimit(6));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        txt_tamVetor = new javax.swing.JTextField();
        btn_GeraVetor = new javax.swing.JButton();
        btn_limpar = new javax.swing.JButton();
        btn_sair = new javax.swing.JButton();
        btn_Quick = new javax.swing.JButton();
        btn_Bubble = new javax.swing.JButton();
        btn_Selection = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaNumeros1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        areaNumeros3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        areaNumeros4 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        areaNumeros2 = new javax.swing.JTextArea();
        lbl_quick = new javax.swing.JLabel();
        lbl_vetorGerado = new javax.swing.JLabel();
        lbl_selection = new javax.swing.JLabel();
        lbl_bubble = new javax.swing.JLabel();
        tempoB = new javax.swing.JLabel();
        tempoQ = new javax.swing.JLabel();
        tempoS = new javax.swing.JLabel();
        tempoV = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusCycleRoot(false);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/icon/icon.png")).getImage());
        setName("frm_tela"); // NOI18N
        setResizable(false);

        txt_tamVetor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_tamVetor.setName("txt_tamVetor"); // NOI18N
        txt_tamVetor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_tamVetorKeyReleased(evt);
            }
        });

        btn_GeraVetor.setText("Generate Vector");
        btn_GeraVetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GeraVetorActionPerformed(evt);
            }
        });

        btn_limpar.setText("Clear");
        btn_limpar.setName("btn_limpar"); // NOI18N
        btn_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparActionPerformed(evt);
            }
        });

        btn_sair.setText("Exit");
        btn_sair.setName("btn_sair"); // NOI18N
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });

        btn_Quick.setText("<html><u>Q</u>uickSort");
        btn_Quick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_QuickActionPerformed(evt);
            }
        });

        btn_Bubble.setText("<html><u>B</u>ubbleSort");
        btn_Bubble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BubbleActionPerformed(evt);
            }
        });

        btn_Selection.setText("<html><u>S</u>electionSort");
        btn_Selection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SelectionActionPerformed(evt);
            }
        });

        jScrollPane2.setFocusCycleRoot(true);

        areaNumeros1.setColumns(20);
        areaNumeros1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        areaNumeros1.setRows(8);
        areaNumeros1.setFocusCycleRoot(true);
        areaNumeros1.setName(""); // NOI18N

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, areaNumeros1, org.jdesktop.beansbinding.ELProperty.create("setEditable(false)"), areaNumeros1, org.jdesktop.beansbinding.BeanProperty.create("editable"));
        bindingGroup.addBinding(binding);

        jScrollPane2.setViewportView(areaNumeros1);

        jScrollPane3.setFocusCycleRoot(true);

        areaNumeros3.setColumns(20);
        areaNumeros3.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        areaNumeros3.setRows(5);
        areaNumeros3.setFocusCycleRoot(true);
        areaNumeros3.setName(""); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, areaNumeros1, org.jdesktop.beansbinding.ELProperty.create("setEditable(false)"), areaNumeros3, org.jdesktop.beansbinding.BeanProperty.create("editable"));
        bindingGroup.addBinding(binding);

        jScrollPane3.setViewportView(areaNumeros3);

        jScrollPane4.setFocusCycleRoot(true);

        areaNumeros4.setColumns(20);
        areaNumeros4.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        areaNumeros4.setRows(5);
        areaNumeros4.setToolTipText("");
        areaNumeros4.setFocusCycleRoot(true);
        areaNumeros4.setName("txt_areaVetor4"); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, areaNumeros1, org.jdesktop.beansbinding.ELProperty.create("setEditable(false)"), areaNumeros4, org.jdesktop.beansbinding.BeanProperty.create("editable"));
        bindingGroup.addBinding(binding);

        jScrollPane4.setViewportView(areaNumeros4);

        jScrollPane5.setFocusCycleRoot(true);

        areaNumeros2.setColumns(20);
        areaNumeros2.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        areaNumeros2.setRows(5);
        areaNumeros2.setFocusCycleRoot(true);
        areaNumeros2.setName(""); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, areaNumeros1, org.jdesktop.beansbinding.ELProperty.create("setEditable(false)"), areaNumeros2, org.jdesktop.beansbinding.BeanProperty.create("editable"));
        bindingGroup.addBinding(binding);

        jScrollPane5.setViewportView(areaNumeros2);

        lbl_quick.setText("QuickSort");
        lbl_quick.setFocusCycleRoot(true);

        lbl_vetorGerado.setText("Generated Vector");
        lbl_vetorGerado.setFocusCycleRoot(true);

        lbl_selection.setText("SelectionSort");
        lbl_selection.setToolTipText("");
        lbl_selection.setFocusCycleRoot(true);

        lbl_bubble.setText("BubbleSort");
        lbl_bubble.setFocusCycleRoot(true);

        tempoB.setFocusCycleRoot(true);

        tempoQ.setFocusCycleRoot(true);

        tempoS.setFocusCycleRoot(true);

        tempoV.setFocusCycleRoot(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Bubble, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Selection, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Quick, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_vetorGerado)
                                .addGap(18, 18, 18)
                                .addComponent(tempoV))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_tamVetor, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_GeraVetor)
                        .addGap(32, 32, 32)
                        .addComponent(btn_limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_quick)
                                .addGap(18, 18, 18)
                                .addComponent(tempoQ)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_bubble)
                                .addGap(18, 18, 18)
                                .addComponent(tempoB)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_selection)
                                .addGap(18, 18, 18)
                                .addComponent(tempoS)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_limpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_GeraVetor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_tamVetor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_sair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_vetorGerado)
                    .addComponent(lbl_quick)
                    .addComponent(lbl_bubble)
                    .addComponent(lbl_selection, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tempoB)
                    .addComponent(tempoQ)
                    .addComponent(tempoS)
                    .addComponent(tempoV))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Quick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Bubble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Selection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btn_BubbleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BubbleActionPerformed
        try{
        long start = System.currentTimeMillis();
        b.bubbleSort(vetor, vetor.length);
        long finish = System.currentTimeMillis();  
	long total = finish - start;
        tempoB.setText(total+"ms");
        areaNumeros3.setText(exibeArray());
        v.setNumeros(vetaux);
        }
        catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Você deve gerar o vetor antes de continuar", "Gerar o Vetor", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_BubbleActionPerformed

    private void btn_GeraVetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GeraVetorActionPerformed
        try{
        long start = System.currentTimeMillis();
        vetor = v.geraVetor(Integer.parseInt(txt_tamVetor.getText()));
        long finish = System.currentTimeMillis();  
	long total = finish - start;
        tempoV.setText(total+"ms");
        areaNumeros1.setText(exibeArray());
        vetaux = vetor.clone();
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite o tamanho do vetor", "Tamanho do Vetor", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_GeraVetorActionPerformed

    private void btn_QuickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_QuickActionPerformed
        try{
        long start = System.currentTimeMillis();
        q.quickSort(vetor, 0, vetor.length-1);
        long finish = System.currentTimeMillis();  
	long total = finish - start;
        tempoQ.setText(total+"ms");
        areaNumeros2.setText(exibeArray());
        v.setNumeros(vetaux);
        }
        catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Você deve gerar o vetor antes de continuar", "Gerar o Vetor", JOptionPane.ERROR_MESSAGE);
        }        
    }//GEN-LAST:event_btn_QuickActionPerformed

    private void btn_SelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SelectionActionPerformed
        try{
        long start = System.currentTimeMillis();
        s.selectionSort(vetor);
        long finish = System.currentTimeMillis();  
	long total = finish - start;
        tempoS.setText(total+"ms");
        areaNumeros4.setText(exibeArray());
        v.setNumeros(vetaux);
        }
        catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Você deve gerar o vetor antes de continuar", "Gerar o Vetor", JOptionPane.ERROR_MESSAGE);
        }        
    }//GEN-LAST:event_btn_SelectionActionPerformed

    private void Limpar()
    {
        areaNumeros1.setText("");
        areaNumeros2.setText("");
        areaNumeros3.setText("");
        areaNumeros4.setText("");
        tempoQ.setText("");
        tempoS.setText("");
        tempoB.setText("");
        tempoV.setText("");
        txt_tamVetor.setText("");
        vetor = null;
        txt_tamVetor.requestFocus();
    }
    
    private void btn_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparActionPerformed
        Limpar();
    }//GEN-LAST:event_btn_limparActionPerformed

    private void Fechar()
    {  
        if(javax.swing.JOptionPane.showConfirmDialog(null,"Are you sure?","",javax.swing.JOptionPane.YES_NO_OPTION )==0)
        {  
            this.dispose();  
        }  
    }
    
    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
        Fechar();
    }//GEN-LAST:event_btn_sairActionPerformed

    private void txt_tamVetorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_tamVetorKeyReleased
        if( evt.getKeyCode() == KeyEvent.VK_ENTER ) {
            btn_GeraVetorActionPerformed(null);    
        }
        //Atalho para os algoritmos de ordenação.
        if( evt.getKeyCode() == KeyEvent.VK_Q ) {
            btn_QuickActionPerformed(null);
        }
        if( evt.getKeyCode() == KeyEvent.VK_S ) {
            btn_SelectionActionPerformed(null);
        }
        if( evt.getKeyCode() == KeyEvent.VK_B ) {
            btn_BubbleActionPerformed(null);
        }
    }//GEN-LAST:event_txt_tamVetorKeyReleased
   
    public String exibeArray()
    {
        String vetor_organizado = ""; //Cria uma String
        
        for (int i=0;i<vetor.length;i++)
        {
            vetor_organizado+=vetor[i]+"\n"; //Atribui a String o vetor para que a exiba na vertical
        }        
        return vetor_organizado; //Retorna a String      
    }
    
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new MainView().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaNumeros1;
    private javax.swing.JTextArea areaNumeros2;
    private javax.swing.JTextArea areaNumeros3;
    private javax.swing.JTextArea areaNumeros4;
    private javax.swing.JButton btn_Bubble;
    private javax.swing.JButton btn_GeraVetor;
    private javax.swing.JButton btn_Quick;
    private javax.swing.JButton btn_Selection;
    private javax.swing.JButton btn_limpar;
    private javax.swing.JButton btn_sair;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lbl_bubble;
    private javax.swing.JLabel lbl_quick;
    private javax.swing.JLabel lbl_selection;
    private javax.swing.JLabel lbl_vetorGerado;
    private javax.swing.JLabel tempoB;
    private javax.swing.JLabel tempoQ;
    private javax.swing.JLabel tempoS;
    private javax.swing.JLabel tempoV;
    private javax.swing.JTextField txt_tamVetor;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
