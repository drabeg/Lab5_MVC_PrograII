package Model;

public class csTrabajador {
    
    private int dias;
    private double pagoHora;
    private int horasDiarias;

    // Recibo los datos limpios en mi constructor, incluyendo las horas exactas de la jornada
    public csTrabajador(int dias, double pagoHora, int horasDiarias) {
        this.dias = dias;
        this.pagoHora = pagoHora;
        this.horasDiarias = horasDiarias;
    }

    // Calculo el pago total con una simple fórmula matemática (sin usar ifs)
    public double calcularPago() {
        return this.dias * this.horasDiarias * this.pagoHora;
    }
}