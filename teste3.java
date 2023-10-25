import javax.swing.JComboBox;
import javax.swing.JFrame;

public class teste3 {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Exemplo com ComboBox");
        janela.setSize(300, 150);
        janela.setLayout(null);

        String[] opcoes = { "Opção 1", "Opção 2", "Opção 3", "Opção 4" };
        JComboBox<String> comboBox = new JComboBox<>(opcoes);
        comboBox.setBounds(50, 30, 200, 30);

        janela.add(comboBox);

        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}