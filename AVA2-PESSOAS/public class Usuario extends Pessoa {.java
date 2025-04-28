public class Usuario extends Pessoa {
    private String nivelAcesso;

    public Usuario(String nome, String cpf, String nivelAcesso) {
        super(nome, cpf);
        this.nivelAcesso = nivelAcesso;
    }

    @Override
    public String getDados() {
        return super.getDados() + " | Nível de Acesso: " + nivelAcesso;
    }
}
