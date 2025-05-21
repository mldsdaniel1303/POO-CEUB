public class Main {
    public static void main(String[] args) {
        Professor prof = new Professor("João", 1234);

        prof.cadastrarAluno("Ana", "3ºA");
        Aluno ana = prof.getAlunos().get(0);

        prof.cadastrarAtividade("Matemática", "Resolver equações", "3ºA", ana);
        Atividade ativ = prof.getAtividades().get(0);

        prof.lancarNota(ativ, 9.5);

        System.out.println("Aluno: " + ana.getNome());
        System.out.println("Atividade: " + ativ.getTitulo());
        System.out.println("Nota: " + ativ.getNota());
    }
}
