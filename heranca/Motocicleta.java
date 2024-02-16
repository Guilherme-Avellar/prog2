/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto2;

/**
 *
 * @author cefet
 */
public class Motocicleta extends Veiculo{
    private String cor;

    public Motocicleta(String cor, String modelo, String marca, String tipoCombustivel, int km, double taxaAluguel) {
        super(modelo, marca, tipoCombustivel, km, taxaAluguel);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Motocicleta{" + super.toString() + "cor=" + cor + '}';
    }
    
    
}
