public class Formas {
    protected String color;

    // Constructor
    public Formas(String color) {
        this.color = color;
    }

    // Metodo para establecer color
    public void establecerColor(String color) {
        this.color = color;
    }

    // Metodo dibujar generico
    public void dibujar() {
        System.out.println("Dibujando una forma.");
    }
}
