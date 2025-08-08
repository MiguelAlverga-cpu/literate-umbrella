// Classe
public class Retangulo{
    //Atributos
    private int comprimento;
    private int largura;
  
    //Construtor
    public Retangulo(int comprimento , int largura){
        this.comprimento = comprimento;
        this.largura = largura;
    }
    //Métodos
    public void setcomprimento(int comprimento){
        this.comprimento =comprimento;
    }

    public int getComprimento(){
        return comprimento;
    }

    public void setLargura(int largura){
        this.largura = largura;
    }

    public int getLargura(){
        return largura;
    }

    public int calcularArea(){
        return comprimento * largura;
    }

    public int calcularPerimetro(){
        return 2 * comprimento + 2 * largura;
    }

    public void imprimir(){
        System.out.printf("Comprimento: %d, Largura: %d, Área: %d, Perímetro: %d", comprimento, largura, calcularArea(), calcularPerimetro());
    }         
        }