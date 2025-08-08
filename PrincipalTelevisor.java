public class PrincipalTelevisor {
    public static void main(String[] args) {
        // Criando um televisor 
        Televisor tel = new Televisor(4);
        System.out.println(tel); // ''

        System.out.println("\n== ligando televisor");
        tel.ligar();

        System.out.println("\n= desligando televisor");
        tel.desligar();

        System.out.println("\n= aumentando volume");
        tel.aumentar();

        System.out.println("\n= diminuindo volume");
        tel.diminuir();

        System.out.println("\n= trocando canal");
        tel.trocar();
    }
}
