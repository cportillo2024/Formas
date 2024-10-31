public class Main {
    public static void main(String[] args) {
        // Crear instancias de las figuras
        Circulo circulo = new Circulo("Rojo", 5.0);
        Linea linea = new Linea("Azul", 10.0);
        Triangulo triangulo = new Triangulo("Verde", 60.0);
        Cuadrado cuadrado = new Cuadrado("Amarillo", 4.0);

        // Llamar a los metodos dibujar y mostrar propiedades
        circulo.dibujar();
        System.out.println("Radio del circulo: " + circulo.calcularRadio());

        linea.dibujar();  // Verificar si este metodo imprime correctamente

        triangulo.dibujar();
        System.out.println("Area del triangulo: " + triangulo.calcularArea(5.0, 10.0));

        cuadrado.dibujar();
        System.out.println("Area del cuadrado: " + cuadrado.calcularArea());
    }
}
