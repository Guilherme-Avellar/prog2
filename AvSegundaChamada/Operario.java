package guilhermecarneiro_av;


public class Operario extends Empregado{
    private double valorProducao;
    private double comissao;

    public Operario(double valorProducao, double comissao, int codigoSetor,
                    double salarioBase, double imposto, String nome,
                    String endereco, String telefone) {
        
        super(codigoSetor, salarioBase, imposto, nome, endereco, telefone);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }
    
    public double calcularImposto() {
        return (valorProducao + comissao) * super.getImposto();
    }
    
    public double calcularSalario() {
        return super.calcularSalario() - calcularImposto(); // tinha que ter somado valorProducao e comissao
    }
    
}
