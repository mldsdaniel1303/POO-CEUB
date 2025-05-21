public class Aluno {
    private String nome;
    private String turma;
    private List<Atividade> atividades;

    public Aluno(String nome, String turma) {
        this.nome = nome;
        this.turma = turma;
        this.atividades = new ArrayList<>();
    }

    public void adicionarAtividade(Atividade atividade) {
        atividades.add(atividade);
    }

    public String getNome() { return nome; }
    public String getTurma() { return turma; }
    public List<Atividade> getAtividades() { return atividades; }
}
