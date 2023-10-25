import javax.swing.JButton;
import javax.swing.JFrame;

public class teste1 {

    public static void main(String[] args) {
        // Cria uma nova janela
        JFrame janela = new JFrame("Tela Java");
        
        // Define o tamanho da janela
        janela.setSize(400, 300);
        
        // Define o layout da janela (layout padrão)
        janela.setLayout(null);
        
        // Cria um botão
        JButton botao = new JButton("Botão");
        
        // Define a posição e o tamanho do botão
        botao.setBounds(150, 100, 100, 40);
        
        // Adiciona o botão à janela
        janela.add(botao);
        
        // Encerra o programa quando a janela é fechada
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Torna a janela visível
        janela.setVisible(true);
    }
}