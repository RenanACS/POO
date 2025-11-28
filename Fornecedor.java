package Pessoa;

public class Fornecedor extends Pessoa {
   private double valorCredito;
    private double valorDivida;

    public Fornecedor(){
        super();
    }

    public Fornecedor(String nome,String endereco, String telefone, double valorCredito, double valorDivida){
        super(nome,endereco,telefone);
        this.valorCredito= valorCredito;
        this.valorDivida = valorDivida;
    }
    public double obterSaldo() {
        return this.valorCredito - this.valorDivida;
    }

    public double getvalorCredito(){
        return valorCredito;
    }

    public void setvalorCredito(double valorCredito){
        this.valorCredito = valorCredito;
    }

    public double getvalorDivida(){
       return this.valorDivida;
    }
    public void setvalorDivida(double valorDivida){
        this.valorDivida= valorDivida;

    }

}
    
