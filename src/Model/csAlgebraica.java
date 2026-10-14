package Model;

public class csAlgebraica {
    
    private double a;
    private double x;
    private double b;
    private double c;

    // Recibo todas las constantes directamente en mi constructor
    public csAlgebraica(double a, double x, double b, double c) {
        this.a = a;
        this.x = x;
        this.b = b;
        this.c = c;
    }

    // Retorno el cálculo de la expresión ax^2 + bx + c usando Math.pow para el cuadrado
    public double calcular() {
        return (this.a * Math.pow(this.x, 2)) + (this.b * this.x) + this.c;
    }
}