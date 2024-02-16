/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto2;

public class Veiculo {
    private String modelo;
    private String marca;
    private String tipoCombustivel;
    private int km;
    private double taxaAluguel;
    private boolean disponivel = true;
    private Cliente c = null;

    public Cliente getCliente() {
        return c;
    }

    public void setCliente(Cliente c) {
        this.c = c;
    }
    
    

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
    
    
    public Veiculo(String modelo, String marca, String tipoCombustivel, int km, double taxaAluguel) {
        this.modelo = modelo;
        this.marca = marca;
        this.tipoCombustivel = tipoCombustivel;
        this.km = km;
        this.taxaAluguel = taxaAluguel;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public double getTaxaAluguel() {
        return taxaAluguel;
    }

    public void setTaxaAluguel(double taxaAluguel) {
        this.taxaAluguel = taxaAluguel;
    }

    @Override
    public String toString() {
        return "Veiculo{" + "modelo=" + modelo + ", marca=" + marca + ", tipoCombustivel=" + tipoCombustivel + ", km=" + km + ", taxaAluguel=" + taxaAluguel + '}';
    }
    
    
}
