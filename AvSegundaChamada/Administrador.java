package guilhermecarneiro_av;

public class Administrador extends Empregado{
    //letra a)
    private double ajudaDeCustos; // gastos com estadias etc

    public Administrador(double ajudaDeCustos, int codigoSetor, double salarioBase,
                        double imposto, String nome, String endereco, String telefone) {
        
        super(codigoSetor, salarioBase, imposto, nome, endereco, telefone);
        this.ajudaDeCustos = ajudaDeCustos;
    }
    
    //letra b)
    public double calcularImposto() {
        return ajudaDeCustos * super.getImposto()/100;
    }
    
    public double calcularSlario() {
        return super.calcularSalario() - calcularImposto();
    }
    
    
    
}
