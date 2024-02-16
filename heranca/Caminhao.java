/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto2;

/**
 *
 * @author cefet
 */
public class Caminhao extends Veiculo{
    private int numEixos;

    public Caminhao(int numEixos, String modelo, String marca, int km) {
        super(modelo, marca, "Diesel", km, 20.0);
        this.numEixos = numEixos;
    }
    
    @Override
    public void setTipoCombustivel(String tipoCombustivel) {
        if(tipoCombustivel.equals("Diesel")){
            super.setTipoCombustivel(tipoCombustivel);
        }
    }

    public int getNumEixos() {
        return numEixos;
    }

    public void setNumEixos(int numEixos) {
        this.numEixos = numEixos;
    }

    @Override
    public String toString() {
        return "Caminhao{" + super.toString() + "numEixos=" + numEixos + '}';
    }
    
    
}
