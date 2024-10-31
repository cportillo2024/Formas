public class Circulo extends Formas {
    private double radio;

    // Constructor
    public Circulo(String color, double radio) {
        super(color);  // Llama al constructor de la superclase
        this.radio = radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un circulo.");
    }

    public double calcularRadio() {
        return radio;
    }
}
