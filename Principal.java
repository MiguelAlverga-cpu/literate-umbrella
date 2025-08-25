public class Principal{

public static void main(String args[]){
   Pessoa p = new Pessoa("João", 18);
   System.out.println(p.getNome());
   System.out.println(p.getIdade());
   p.setNome("João da Silva");
   p.setIdade(18)
   System.out.println(p.getNome());
   System.out.println(p.getIdade());
   }

} 