package guilhermecarneiro_av;

public class Empregado extends Pessoa implements Imposto {
    //letra a)
    private int codigoSetor;
    private double salarioBase;
    private double imposto; // em porcentagem. EX: 15%

    public Empregado(int codigoSetor, double salarioBase, double imposto,
                    String nome, String endereco, String telefone) {
        
        super(nome, endereco, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
    
    public double calcularImposto() {
        return salarioBase * (imposto / 100);
    }
    
    //letra b)
    public double calcularSalario() {
        return salarioBase - calcularImposto();
    }
    
    
}
