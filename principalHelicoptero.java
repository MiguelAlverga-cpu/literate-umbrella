public class principalHelicoptero {
    public static void main(String[] args) {
        // Criando dois helicópteros com capacidades diferentes
        Helicoptero heli1 = new Helicoptero(4);
        Helicoptero heli2 = new Helicoptero(6);

        System.out.println(heli1); // ''
        System.out.println(heli2); //correção <Gabriel>

        System.out.println("\n== Embarcando passageiros ==");
        heli1.embarcar(3);
        heli2.embarcar(5);

        System.out.println("\n== Ligando os helicópteros ==");
        heli1.ligar();
        heli2.ligar();

        System.out.println("\n== Decolando ==");
        heli1.decolar();
        heli2.decolar();

        System.out.println(heli1); // ''
        System.out.println(heli2); //correção <Gabriel>

        System.out.println("\n== Tentando desembarcar em voo ==");
        heli1.desembarcar(1); // deve falhar

        System.out.println("\n== Aterrissando ==");
        heli1.aterrissar();
        heli2.aterrissar();

        System.out.println("\n== Desligando os helicópteros ==");
        heli1.desligar();
        heli2.desligar();
        
        System.out.println("\n== Desembarcando passageiros ==");
        heli1.desembarcar(2);
        heli2.desembarcar(5);
        
        System.out.println("\n== Estado final dos helicópteros ==");
        System.out.println("\nHelicóptero 1:\n" + heli1);
        System.out.println("\nHelicóptero 2:\n" + heli2);
    }
}
//também tirei o estranho que não pedia na atividade