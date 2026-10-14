package Model;

public class csConversionTiempo {
    
    // Almaceno todo internamente en una unidad base (segundos) para evitar condicionales
    private double totalSegundos;

    // Recibo la cantidad ingresada y su respectivo factor de conversion a segundos
    public csConversionTiempo(int cantidad, int factorASegundos) {
        this.totalSegundos = cantidad * factorASegundos;
    }

    // Retorno las conversiones directamente desde mi unidad base
    public double getSegundos() {
        return this.totalSegundos;
    }

    public double getMinutos() {
        return this.totalSegundos / 60.0;
    }

    public double getHoras() {
        return this.totalSegundos / 3600.0;
    }
}