import javax.swing.*;
import java.awt.*;


public class caixaText extends JFrame {


    public caixaText() {
        setTitle("Cadastro de Tarefas");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        configurarLayout();
        setVisible(true);
    }

    private void configurarLayout() {
        JPanel painel = new JPanel();
        GroupLayout JanelaLayout = new GroupLayout(painel);
        painel.setLayout(JanelaLayout);
        JanelaLayout.setAutoCreateGaps(true);
        JanelaLayout.setAutoCreateContainerGaps(true);
        JTextArea tarefaField = new JTextArea(5,5);
        tarefaField.setLayout(new BorderLayout(10,10));
        tarefaField.setBorder(BorderFactory.createLineBorder(Color.black));
        tarefaField.setLineWrap(true);
        JLabel caixatarefa = new JLabel("Tarefa");

        JLabel Prioridade = new JLabel("Prioridade");
        String[] nivelPrioridade = {"Alta","Baixa"};
        Prioridade.setBounds(50,130,80,50);
        JComboBox ComBoxPrioridade = new JComboBox(nivelPrioridade);

        JCheckBox finalizado = new JCheckBox("Finalizado");
        JButton Cancelar = new JButton("Cancelar");
        JButton Salvar = new JButton("Salvar");

        JanelaLayout.setVerticalGroup(
                JanelaLayout.createSequentialGroup()
                        .addComponent(caixatarefa)
                        .addComponent(tarefaField)
                        .addComponent(Prioridade)
                        .addComponent(ComBoxPrioridade)
                        .addComponent(finalizado)
                        .addGroup(JanelaLayout.createParallelGroup()
                                .addComponent(Cancelar)
                                .addComponent(Salvar))
        );
        JanelaLayout.setHorizontalGroup(
                JanelaLayout.createParallelGroup()
                        .addComponent(caixatarefa)
                        .addComponent(tarefaField)
                        .addComponent(Prioridade)
                        .addComponent(ComBoxPrioridade)
                        .addComponent(finalizado)
                        .addGroup(JanelaLayout.createSequentialGroup().addContainerGap(300,300)
                                .addComponent(Cancelar)
                                .addComponent(Salvar))
        );
        add(painel);
    }
}




