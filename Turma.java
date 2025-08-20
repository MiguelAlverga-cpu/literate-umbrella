import java.util.Scanner;

public class Turma {
    private Aluno[] alunos;
    private int qtde;

    public Turma(int qtde) {
        this.qtde = 0;
        this.alunos = new Aluno[qtde];   // corrigido
    }

    public boolean add(Aluno a) {
        if (qtde == this.alunos.length) return false;
        this.alunos[this.qtde++] = a;
        return true;
    }

    public String getNomeMaisNovo() {
        if (this.qtde == 0) return null;

        Aluno menor = this.alunos[0];
        for (Aluno a : this.alunos) {
            if (a != null && a.getNota1() < menor.getNota2()) {
                menor = a;
            }
        }
        return menor.getNome();
    }
}