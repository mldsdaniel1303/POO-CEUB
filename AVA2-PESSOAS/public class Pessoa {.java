public class Pessoa {
    protected String nome;
    protected String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getDados() {
        return "Nome: " + nome + " | CPF: " + cpf;
    }
}
