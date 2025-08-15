public class ControleRemoto {
     private Televisor televisor;
   
    public void ligar(){   
        televisor.ligar();  
    }
    public void desligar() {
        televisor.desligar();
    }
    public void aumentarVolume() {
        televisor.aumentarVolume();
    }
    public void diminuirVolume() {
        televisor.diminuirVolume();
    }
    public void TrocarCanal(int canal) {
        televisor.Trocarcanal(canal);
    }
    public void mostrarStatus() {
        System.out.println( "Status do Televisor:");
    }

}