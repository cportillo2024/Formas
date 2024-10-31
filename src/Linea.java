public class Linea extends Formas {
    private double largo;

    // Constructor
    public Linea(String color, double largo) {
        super(color);
        this.largo = largo;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando una linea.");
    }
}
