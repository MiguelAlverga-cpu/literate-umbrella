// Classe  
public class FitasDeVideo {
    // Atributos
    private String tituloDaFita;
    private int numeroDeDiasAlugada;
    private double precoDoAluguel;  

    // Construtor
    public FitasDeVideo(String tituloDaFita, int numeroDeDiasAlugada,double precoDoAluguel) {
        this.tituloDaFita = tituloDaFita;
        this.numeroDeDiasAlugada = numeroDeDiasAlugada;
        this.precoDoAluguel = precoDoAluguel;
    }

    // Métodos


    public void setTituloDaFita(String tituloDaFita) {
        this.tituloDaFita = tituloDaFita;
    }

    public String getTituloDaFita() {
        return tituloDaFita;
    }

    public double getValorAluguel() {
        return numeroDeDiasAlugada * precoDoAluguel;
    }

    public void setPrecoDoAluguel( double precoDoAluguel) { 
        this.precoDoAluguel = precoDoAluguel;
    }

    public double getPrecoDoAluguel() { 
        return precoDoAluguel;
    }

    public String toString() {
        return "Título: " + tituloDaFita + ", Preço por dia: R$" + String.format("%.2f",precoDoAluguel);
    }
}