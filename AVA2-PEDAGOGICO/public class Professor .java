public class Professor {
    private String nome;
    private int matricula;
    private List<Aluno> alunos;
    private List<Atividade> atividades;

    public Professor(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.alunos = new ArrayList<>();
        this.atividades = new ArrayList<>();
    }

    public void cadastrarAluno(String nome, String turma) {
        Aluno aluno = new Aluno(nome, turma);
        alunos.add(aluno);
        System.out.println("Aluno cadastrado: " + nome);
    }

    public void cadastrarAtividade(String titulo, String descricao, String turma, Aluno alunoEspecifico) {
        Atividade atividade = new Atividade(titulo, descricao, turma, alunoEspecifico);
        atividades.add(atividade);
        System.out.println("Atividade cadastrada: " + titulo);
    }

    public void lancarNota(Atividade atividade, double nota) {
        atividade.atribuirNota(nota);
        System.out.println("Nota lançada: " + nota + " para atividade " + atividade.getTitulo());
    }

    // Getters
    public String getNome() { return nome; }
    public int getMatricula() { return matricula; }
    public List<Aluno> getAlunos() { return alunos; }
    public List<Atividade> getAtividades() { return atividades; }
}
