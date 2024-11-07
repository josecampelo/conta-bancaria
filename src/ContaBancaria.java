public class ContaBancaria {
    private int numeroConta;
    private int digitoVerificador;
    private String nomeTitular;
    private String cpfTitular;
    private double saldo;

    public ContaBancaria(int numeroConta, int digitoVerificador, String nomeTitular, String cpfTitular) {
        this.numeroConta = numeroConta;
        this.digitoVerificador = digitoVerificador;
        this.nomeTitular = nomeTitular;
        this.cpfTitular = cpfTitular;
        this.saldo = 0.0;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getDigitoVerificador() {
        return digitoVerificador;
    }

    public void setDigitoVerificador(int digitoVerificador) {
        this.digitoVerificador = digitoVerificador;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getCpfTitular() {
        return cpfTitular;
    }

    public void setCpfTitular(String cpfTitular) {
        this.cpfTitular = cpfTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public boolean sacar(double valor){
        if(saldo >= valor){
            this.saldo -= valor;

            return true;
        }

        return false;
    }

    public String exibirDadosConta(){
        return "Número da conta: " + numeroConta + "\nDigito verificador da conta: " + digitoVerificador + " \nNome do títular da conta: " + nomeTitular + "\nNúmero do CPF do títular: " + cpfTitular + "\nSaldo da conta: " + String.format("%.2f", saldo);
    }
}