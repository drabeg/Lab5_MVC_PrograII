package Model;

public class csBisiesto {
    
    private int anio;

    // Recibo el año a evaluar directamente en mi constructor
    public csBisiesto(int anio) {
        this.anio = anio;
    }

    // Retorno la evaluación matemática: divisible entre 4 y no entre 100, o divisible entre 400
    public boolean evaluarBisiesto() {
        return (this.anio % 4 == 0 && this.anio % 100 != 0) || (this.anio % 400 == 0);
    }
}