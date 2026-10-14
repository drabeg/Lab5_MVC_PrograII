package Model;

public class csConversion {
    private double valor;
    private boolean aFahrenheit;

    public void setValor(double valor) { 
        this.valor = valor; 
    }
    
    public void setAFahrenheit(boolean aFahrenheit) { 
        this.aFahrenheit = aFahrenheit; 
    }

    public double calcular() {
        if (aFahrenheit) {
            // Fórmula: de Celsius a Fahrenheit
            return (valor * 9 / 5) + 32;
        } else {
            // Fórmula: de Fahrenheit a Celsius
            return (valor - 32) * 5 / 9;
        }
    }
}