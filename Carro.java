// Classe
public class Carro{
    //Atributos
    private String fabricante;
    private String modelo;
    private int ano;
    private int velocidade;

    //Construtor
    public Carro(String fabricante, String modelo, int ano){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.ano = ano;
    }

    //Métodos
    public void setFabricante(String fabricante){
        this.fabricante =fabricante;
    }

    public String getFabricante(){
        return fabricante;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getModelo(){
        return modelo;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public int getAno(){
        return ano;
    }

    public void setVelocidade(int velocidade){
        this.velocidade = velocidade;
    }

    public int getVelocidade(){
        return velocidade;
    }

    public void acelerar(){
        if (velocidade < 110){
            velocidade = velocidade + 10;
        }
    }

    public void frear(){
        if (velocidade > 0){
            velocidade = velocidade - 10;
        }
    }

}