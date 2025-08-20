public class PrincipalTurma {
    public static void main(String[] args) {
        Turma turma = new Turma(5);

        // Adicionar pelo menos 3 alunos
        ((Object) turma).adicionarAluno(new Aluno("João", 101));
        turma.adicionarAluno(new Aluno("Maria", 102, 19));
        turma.adicionarAluno(new Aluno("Pedro", 103, 20));

        // Listar todos os alunos
        System.out.println("Lista de Alunos:");
        turma.listarAlunos();

        // Buscar aluno pela matrícula
        int matriculaBusca = 102;
        System.out.println("\nBuscando aluno com matrícula " + matriculaBusca + ":");
        Aluno encontrado = turma.buscarPorMatricula(matriculaBusca);
        if (encontrado != null) {
            encontrado.exibirInfo();
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }
}