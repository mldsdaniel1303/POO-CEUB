import java.util.ArrayList;

public class SistemaERP {
    private ArrayList<Pessoa> cadastros = new ArrayList<>();

    public void adicionarPessoa(Pessoa p) {
        cadastros.add(p);
        System.out.println("Pessoa cadastrada: " + p.getDados());
    }

    public void listarCadastros() {
        System.out.println("=== Cadastros no Sistema ===");
        for (Pessoa p : cadastros) {
            System.out.println(p.getDados());
        }
    }
}
