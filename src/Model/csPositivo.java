package Model;

public class csPositivo {
    private int numero;

    public csPositivo() {
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String resultado() {
        if (this.numero >= 0) {
            return "Positivo";
        } else {
            return "Negativo";
        }
    }
}