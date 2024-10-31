public class Triangulo extends Formas {
    private double angulo;

    // Constructor
    public Triangulo(String color, double angulo) {
        super(color);
        this.angulo = angulo;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un triangulo.");
    }

    public double calcularArea(double base, double altura) {
        return (base * altura) / 2;
    }
}
