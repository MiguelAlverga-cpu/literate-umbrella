public class Turma {
    private String alunos;
    private int quantidade;

    public Turma(String alunos, int quantidade) {
        this.alunos = alunos;
        this.quantidade = quantidade;
    }
        public  String getAluno(){
            return alunos;
        }
        public int getQuantidade(){
            return quantidade;
        }

        public void setAlunos(String alunos) {
            this.alunos = alunos;
        }
        public void  setQuantidade(int quantidade) {
            this.quantidade = quantidade;
        }
        public String toString() {
            return "Turma{" +
                    "alunos='" + alunos + '\'' +
                    ", quantidade=" + quantidade +
                    '}';
        }
        }