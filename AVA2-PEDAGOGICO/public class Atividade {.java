public class Atividade {
    private String titulo;
    private String descricao;
    private String turma;
    private Aluno alunoEspecifico; // Pode ser null
    private Double nota;

    public Atividade(String titulo, String descricao, String turma, Aluno alunoEspecifico) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.turma = turma;
        this.alunoEspecifico = alunoEspecifico;
        this.nota = null;
    }

    public void atribuirNota(double nota) {
        this.nota = nota;
    }

    public String getTitulo() { return titulo; }
    public String getDescricao() { return descricao; }
    public String getTurma() { return turma; }
    public Aluno getAlunoEspecifico() { return alunoEspecifico; }
    public Double getNota() { return nota; }
}
