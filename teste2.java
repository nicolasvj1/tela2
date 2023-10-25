import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class teste2 {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Exemplo com Campos de Texto");
        janela.setSize(600, 400);
        janela.setLayout(null);

        JLabel nome = new JLabel("Nome:");
        nome.setBounds(80, 30, 60, 30);

        JTextField escrevenome = new JTextField();
        escrevenome.setBounds(120, 30, 200, 30);

        JLabel cpf = new JLabel("Cpf:");
        cpf.setBounds(94, 60, 60, 30);

        JTextField escrevecpf = new JTextField();
        escrevecpf.setBounds(120, 60, 140, 30);        

        JLabel telefone = new JLabel("telefone:");
        telefone.setBounds(67, 90, 60, 30);

        JTextField escrevetelefone = new JTextField();
        escrevetelefone.setBounds(120, 90, 200, 30);        

        JLabel email = new JLabel("email:");
        email.setBounds(82, 120, 60, 30);

        JTextField escreveemail = new JTextField();
        escreveemail.setBounds(120, 120, 200, 30);
        
        JLabel endereco = new JLabel("endereço:");
        endereco.setBounds(59, 150, 60, 30);

        JTextField escreveendereco = new JTextField();
        escreveendereco.setBounds(120, 150, 200, 30);

        JButton botao = new JButton("Salvar");
        
        botao.setBounds(325, 250, 100, 40);

        JButton botao1 = new JButton("Salvar");
        
        botao1.setBounds(450, 250, 100, 40);

        janela.add(botao);
        janela.add(botao1);
        janela.add(nome);
        janela.add(cpf);
        janela.add(telefone);
        janela.add(email);
        janela.add(endereco);        
        janela.add(escrevenome);
        janela.add(escrevecpf);
        janela.add(escrevetelefone);
        janela.add(escreveemail);
        janela.add(escreveendereco);
       
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
