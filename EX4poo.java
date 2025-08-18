public class EX4poo {

    public class ContaBancaria {
    
    private String numeroConta;
    private String titular;
    private double saldo;


    public ContaBancaria(String numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.0;
    }

    
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

 
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saque não realizado. Saldo insuficiente ou valor inválido.");
        }
    }

    
    public void consultarSaldo() {
        System.out.println("Conta: " + numeroConta + " | Titular: " + titular);
        System.out.printf("Saldo atual: R$%.2f\n", saldo);
    }
}

    
}
