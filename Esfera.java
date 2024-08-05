public class Esfera {
    private double peso;

    public Esfera(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public static Esfera encontrarEsferaMasPesada(Esfera a, Esfera b, Esfera c) {
        if (a.getPeso() > b.getPeso() && a.getPeso() > c.getPeso()) {
            return a;
        } else if (b.getPeso() > a.getPeso() && b.getPeso() > c.getPeso()) {
            return b;
        } else {
            return c;
        }
    }
}
