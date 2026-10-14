package Model;

public class csInteres {
    private double c0; // Capital inicial
    private double i;  // Tasa de interés
    private int n;     // Periodo de tiempo

    // Método para recibir los datos desde el controlador
    public void setValores(double c0, double i, int n) {
        this.c0 = c0;
        this.i = i;
        this.n = n;
    }

    // Método que hace el cálculo matemático (Regla del MVC: el modelo calcula)
    public double calcularCn() {
        return c0 * Math.pow((1 + i), n);
    }
}