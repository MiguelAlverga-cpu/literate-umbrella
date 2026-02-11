// Classe
public class Pessoa {
    // Atributos
    private int idade;

    // Construtor
    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.idade = telefone;
    }

    // Métodos
   
    // Getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
