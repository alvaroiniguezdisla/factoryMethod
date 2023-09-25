package factorymethod;

public class TestFactoryMethod {
    public static void main(String[] args) {
        TrianguloFactoryMethod factoria = new TrianguloFactory();
        Triangulo triangulo = factoria.createTriangulo(10, 20, 10);
        Triangulo triangulo2 = factoria.createTriangulo(10, 20, 30);
        Triangulo triangulo3 = factoria.createTriangulo(10, 10, 10);

        System.out.println("********** TRIÁNGULOS GENERADOS **********");
        System.out.println("Triángulo 1: " + triangulo.getDescription());
        System.out.println("Triángulo 2: " + triangulo2.getDescription());
        System.out.println("Triángulo 3: " + triangulo3.getDescription());
    }
}
