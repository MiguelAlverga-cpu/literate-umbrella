// Classe
public class Quadrado{
    //Atributos
    private int lado;
  
    //Construtor
    public Quadrado(int lado){
        this.lado = lado;
    }
    
    //Métodos
    public void setLado(int lado){
        this.lado =lado;
    }

    public int getLado(){
        return lado;
    }

    public int calcularArea(){
        return lado * lado;
    }

    public int calcularPerimetro(){
        return 4 * lado;
    }

    public void imprimir(){
       System.out.printf("Lado: %d, Área: %d, Perímetro: %d", lado, calcularArea(), calcularPerimetro());
}         
    
    }
    