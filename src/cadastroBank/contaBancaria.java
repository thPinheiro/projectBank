package cadastroBank;
/*
O objetivo do projeto é desenvolver uma aplicação relacionada a bancos, 
vamos aplicar os conceitos de POO e as regras de negócio para a estruturação do código. 
Cadastre os clientes em seu banco, faça depósitos, faça saques e transferências para outras contas de clientes. 
Logo abaixo, existe um diagrama de classe para que você possa dar o pontapé inicial. */


public class contaBancaria {
    
    private double Saldo;
    private String Titular;
    private String numConta;


    public contaBancaria(){}

    public contaBancaria(String Titular, int numConta, double Saldo){

    }

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String titular) {
        Titular = titular;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        if(numConta != null && numConta.length() == 10){
            this.numConta = numConta;
        }else{
            this.numConta = "Número de conta invalido !!!";
        }
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        this.Saldo = saldo;
    }

    public void depositar(){
        this.depositar();
    }

    public void sacar(double sacar){
        if(sacar < Saldo){
            sacar = Saldo - sacar;
        }else{
            System.out.println("Erro !!!");
        }

    }

    public void transferir(){

    }

    
}
