package guilhermecarneiro_av;

public class Fornecedor extends Pessoa{
    //letra a)
    private double valorCredito;
    private double valorDivida;

    public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }
    
    //get e set, para manter o encapsulamento
    
    public double getValorCredito() {
        return valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }
    
    
    //letra b)
    public double obterSaldo() {
        return getValorCredito() - getValorDivida();
    }
    
            
}
