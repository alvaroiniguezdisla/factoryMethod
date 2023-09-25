package factorymethod;

public class Escaleno extends Triangulo {

    public Escaleno(int ladoA, int ladoB, int ladoC) {
        super(ladoA, ladoB, ladoC);
    }

    @Override
    public String getDescription() {
        return "Soy un triángulo ESCALENO";
    }

    @Override
    public double getSuperficie() {
        //Aquí iría el algoritmo para calcular la superficie de un triángulo escaleno
        return 0;
    }

    @Override
    public void dibujate() {
        //Aquí iría el algoritmo para dibujar un triángulo escaleno.
        System.out.println("Dibujando un triángulo ESCALENO");
    }
}
