package guilherme_av;

public class Ponto3D {
    
    public double x;
    public double y;
    public double z;

    public Ponto3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "Ponto3D{" + "x=" + x + ", y=" + y + ", z=" + z + '}';
    }
    
}
