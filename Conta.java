public class Conta {
    // Atributos encapsulados
    private int numeroConta;
    private String nomeCliente;
    private double saldo;
    private boolean ativa;

    // Construtor
    public Conta(int numeroConta, String nomeCliente) {
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
        this.saldo = 0.0;
        this.ativa = true;
    }

    // Métodos get e set
    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isAtiva() {
        return ativa;
    }

    // Método para depositar
    public void depositar(double valor) {
        if (valor > 0 && ativa) {
            saldo += valor;
        } else {
            System.out.println("Depósito inválido para a conta " + numeroConta);
        }
    }

    // Método para sacar
    public void sacar(double valor) {
        if (valor <= saldo && ativa) {
            saldo -= valor;
        } else {
            System.out.println("Saque inválido para a conta " + numeroConta);
        }
    }

    // Método para desativar conta
    public void desativar() {
        if (ativa) {
            ativa = false;
        } else {
            System.out.println("A conta " + numeroConta + " já está desativada.");
        }
    }

    // Método para ativar conta
    public void ativar() {
        if (!ativa) {
            ativa = true;
        } else {
            System.out.println("A conta " + numeroConta + " já está ativa.");
        }
    }

    // Método exibir informações da conta
    public void exibir() {
        System.out.println(this.toString());
    }

    // Método toString
    public String toString() {
        return "Conta Numero: " + numeroConta +
               "\nCliente: " + nomeCliente +
               "\nSaldo: R$ " + String.format("%.2f", saldo) +
               "\nStatus: " + (ativa ? "Ativa" : "Desativada") + "\n";
    }
}
