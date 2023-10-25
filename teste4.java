import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class teste4 {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Exemplo com Tabela");
        janela.setSize(400, 300);

        DefaultTableModel model = new DefaultTableModel();
        JTable tabela = new JTable(model);

        model.addColumn("Nome");
        model.addColumn("Idade");

        model.addRow(new Object[] { "Alice", 25 });
        model.addRow(new Object[] { "Bob", 30 });
        model.addRow(new Object[] { "Charlie", 22 });

        JScrollPane scrollPane = new JScrollPane(tabela);
        janela.add(scrollPane);

        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
