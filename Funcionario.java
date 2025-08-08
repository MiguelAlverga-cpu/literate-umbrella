public class Funcionario {
    // Atributos
    private int codigo;
    private String nome;
    private String Cpf;
    private String endereço;
    private int telefone;
    private int idade ;    

// Construtor
    public Funcionario( int codigo,String nome,String CPF,String endereço,int telefone,int idade) {
        this.codigo = codigo;
        this.nome = nome;
        this.Cpf =Cpf;
        this.endereço = endereço;
        this.telefone = telefone;
        this.idade = idade;
    }

//Métodos
public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public int getCodigo(){
        return codigo;
    }

     public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf(String Cpf) {
        return Cpf;
    }

    public String getEndereço(String endereço) {
        return endereço;
    }

    public void setTelefone( int telefone) { 
        this.telefone = telefone;
    }

    public int getTelefone() { 
        return telefone;
    }

     public void setIdade(String nome) {
        this.nome = nome;
    }

    public int getIdade(int idade ) {
        return idade;
    }

    public String toString() {
        return "codigo: " + codigo + ", nome: R$" + String.format("%.2f",nome);
    }
}
