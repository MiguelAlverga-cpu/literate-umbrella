public class PrincipalConta {
    public static void main(String[] args) {
        // Criando três objetos da classe Conta
        Conta conta1 = new Conta(1001, "João");
        Conta conta2 = new Conta(1002, "Maria");
        Conta conta3 = new Conta(1003, "Carlos");

        // Exibir estado inicial das contas
       System.out.println("=== Estado Inicial das Contas ===");
        conta1.exibir();
        conta2.exibir();
        conta3.exibir();

        // Realizar depósito em cada conta
        conta1.depositar(500.0);
        conta2.depositar(1000.0);
        conta3.depositar(750.0);

        // Exibir estado após depósito
        System.out.println("=== Após Depósitos ===");
        conta1.exibir();
        conta2.exibir();
        conta3.exibir();

        // Alterar nome do cliente
        conta1.setNomeCliente("João Paulo");
        conta2.setNomeCliente("Maria Heloysa");
        conta3.setNomeCliente("MIguel Alverga"); 

        // Realizar saque em cada conta
        conta1.sacar(200.0);
        conta2.sacar(300.0);
        conta3.sacar(100.0);

        // Exibir estado após saques e mudanças
        System.out.println("=== Após Saques e Alteração de Nome ===");
        conta1.exibir();
        conta2.exibir();
        conta3.exibir();

        // Desativar duas contas
        conta1.desativar();
        conta2.desativar();

        // Exibir estado final das contas
        System.out.println("=== Após Desativação ===");
        conta1.exibir();
        conta2.exibir();
        conta3.exibir();
    }
}
