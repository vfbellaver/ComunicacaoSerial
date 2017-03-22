package br.ifms.cx.iot.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Gustavo
 */
public class JanelaPrincipal extends JFrame {

    private JPanel painelPrincipal;
    private JPanel painelSecundario;
    private JPanel painelA;
    private JPanel painelB;

    private JLabel rotuloStatus;
    private JComboBox comboBoxPortasSeriais;
    private JButton botaoConectar;

    private JButton botaoComandoA;
    private JButton botaoComandoB;
    private JButton botaoComandoC;

    /**
     * Método construtor da Janela
     */
    public JanelaPrincipal() {
        setTitle("Controle de Portas Seriais - Disciplina IoT");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        
        // Centralizar JFrame
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) (tela.width - getWidth())/2;
        int y = (int) (tela.height - getHeight())/2;
        setLocation(x, y);
       
        // Inicializa Painel A
        painelA = new JPanel(new FlowLayout(FlowLayout.LEFT));
        painelA.setBorder(BorderFactory.createTitledBorder("Portas Seriais"));

        // Inicializa Painel B
        painelB = new JPanel(new FlowLayout(FlowLayout.LEFT));
        painelB.setBorder(BorderFactory.createTitledBorder("Comandos"));

        // Inicializa componentes graficos (botoes, combo box, etc.)
        rotuloStatus = new JLabel("Status: Desconectado");
        comboBoxPortasSeriais = new JComboBox();
        botaoConectar = new JButton("Conectar");
        botaoComandoA = new JButton("1");
        botaoComandoB = new JButton("2");
        botaoComandoC = new JButton("3");

        // Adiciona componentes no painel A
        painelA.add(comboBoxPortasSeriais);
        painelA.add(botaoConectar);

        // Adiciona componentes no painel B
        painelB.add(botaoComandoA);
        painelB.add(botaoComandoB);
        painelB.add(botaoComandoC);
        
        // Adiciona Painel A e B no painel Principal
        painelPrincipal = new JPanel(new GridLayout(2, 1));
        painelPrincipal.setBorder(BorderFactory.createEmptyBorder(5, 5, 0, 5));
        painelPrincipal.add(painelA);
        painelPrincipal.add(painelB);

        // Adiciona rotulo de status da conexao no painel secundario
        painelSecundario = new JPanel(new FlowLayout(FlowLayout.LEFT));
        painelSecundario.add(rotuloStatus);
        
        //Adiciona o painel principal no centro e o secundario no sul
        add(painelPrincipal, BorderLayout.CENTER);
        add(painelSecundario, BorderLayout.SOUTH);
    }

}
