package entities;

public class Conta {
    private int NumeroConta;
    private String NomeTitularConta;
    private double SaldoInicial;
    private double Saldo;
    private boolean IsInitialDeposit;

    public boolean isInitialDeposit() {
        return IsInitialDeposit;
    }

    public void setInitialDeposit(boolean initialDeposit) {
        IsInitialDeposit = initialDeposit;
    }

    public Conta(){

    }

    public int getNumeroConta() {
        return NumeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        NumeroConta = numeroConta;
    }

    public String getNomeTitularConta() {
        return NomeTitularConta;
    }

    public void setNomeTitularConta(String nomeTitularConta) {
        NomeTitularConta = nomeTitularConta;
    }

    public double getSaldoInicial() {
        return SaldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        SaldoInicial = saldoInicial;
        if (SaldoInicial > 0)
            setSaldo(saldoInicial);
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        Saldo = getSaldo() + saldo;
    }

    public void deposito(double valor) {
        if (valor > 0)
            setSaldo(valor - 5);
    }

    public void saque(double valor) {

        double saldotemp = getSaldo();

        if (saldotemp > valor) {
            Saldo = ((getSaldo() - valor) - 5);
        } else if (saldotemp < valor) {
        	Saldo = ((valor - getSaldo()) - 5);
        } else if (saldotemp == valor) {
        	Saldo = ((getSaldo() - valor) - 5);
        }
    }

    @Override
    public String toString() {
        return "Conta {" +
                "NumeroConta=" + NumeroConta +
                ", NomeTitularConta='" + NomeTitularConta + '\'' +
                ", SaldoInicial=" + SaldoInicial +
                ", Saldo=" + Saldo +
                ", IsInitialDeposit=" + IsInitialDeposit + " " +
                '}';
    }
}
