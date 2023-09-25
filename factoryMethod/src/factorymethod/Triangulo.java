package factorymethod;

public abstract class Triangulo {
    private int ladoA;
    private int ladoB;
    private int ladoC;

    //Constructor
    public Triangulo(int ladoA, int ladoB, int ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }
    
    public int getLadoA() { return ladoA; }
    public int getLadoB() { return ladoB; }
    public int getLadoC() { return ladoC; }

    public void setLadoA(int ladoA) { this.ladoA = ladoA; }
    public void setLadoB(int ladoB) { this.ladoB = ladoB; }
    public void setLadoC(int ladoC) { this.ladoC = ladoC; }
    
    //Métodos a redefinir por las subclases
    public abstract String getDescription();
    
    public abstract double getSuperficie();
    
    public abstract void dibujate();   
}
