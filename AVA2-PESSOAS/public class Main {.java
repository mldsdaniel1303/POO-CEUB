public class Main {
    public static void main(String[] args) {
        SistemaERP sistema = new SistemaERP();

        sistema.adicionarPessoa(new Cliente("Maria", "12345678900"));
        sistema.adicionarPessoa(new Fornecedor("Fornecedor X", "98765432100"));
        sistema.adicionarPessoa(new Empregado("João", "11122233344"));
        sistema.adicionarPessoa(new Vendedor("Ana", "22233344455"));
        sistema.adicionarPessoa(new Usuario("Carlos", "33344455566", "Admin"));

        sistema.listarCadastros();
    }
}
