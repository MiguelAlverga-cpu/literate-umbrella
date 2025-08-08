public class Helicoptero {
    // Atributos
    private boolean ligado;
    private boolean emVoo;
    private int capacidade;
    private int quantasPessoas;
    private int altitude; 

    // Construtor
    public Helicoptero(int capacidade) {
        this.ligado = false;
        this.emVoo = false;
        this.capacidade = capacidade;
        this.quantasPessoas = 0;
        this.altitude = 0;
    }

    // Métodos
    public void ligar() {
        ligado = true;
        System.out.println("Helicóptero ligado.");
    }

    public void desligar() {
        if (!emVoo) {
            ligado = false;
            System.out.println("Helicóptero desligado.");
        } else {
            System.out.println("Não é possível desligar o helicóptero em voo.");
        }
    }

    public void decolar() {
        if (ligado && quantasPessoas > 0) {
            emVoo = true;
            altitude = 100; // Altitude inicial de decolagem
            System.out.println("Helicóptero decolou. Altitude: " + altitude + " metros");
        } else {
            System.out.println("É necessário estar ligado e com pessoas a bordo para decolar.");
        }
    }

    public void aterrissar() {
        if (emVoo) {
            emVoo = false;
            altitude = 0;
            System.out.println("Helicóptero aterrissou. Altitude: " + altitude + " metros");
        }
    }

    public void embarcar(int pessoas) {
        if (!emVoo && quantasPessoas + pessoas <= capacidade) {
            quantasPessoas += pessoas;
            System.out.println(pessoas + " pessoas embarcaram. Total: " + quantasPessoas);
        } else if (emVoo) {
            System.out.println("Não é possível embarcar durante o voo.");
        } else {
            System.out.println("Capacidade excedida!");
        }
    }

    public void desembarcar(int pessoas) {
        if (!emVoo && pessoas <= quantasPessoas) {
            quantasPessoas -= pessoas;
            System.out.println(pessoas + " pessoas desembarcaram. Restam: " + quantasPessoas);
        } else if (emVoo) {
            System.out.println("Não é possível desembarcar durante o voo.");
        } else {
            System.out.println("Não há tantas pessoas para desembarcar.");
        }
    }

    public String toString() {
        return "Ligado: " + ligado +
               ", Em voo: " + emVoo +
               ", Altitude: " + altitude + " metros" +
               ", Pessoas a bordo: " + quantasPessoas +
               ", Capacidade: " + capacidade;
    }
}
