package Model;

public class csCollatz {
    private int numero;

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String calcularSerie() {
        if (numero <= 0) {
            return "Ingrese un número mayor a 0";
        }
        
        String serie = String.valueOf(numero);
        int temp = numero;
        
        while (temp > 1) {
            if (temp % 2 == 0) {
                temp = temp / 2;
            } else {
                temp = (temp * 3) + 1;
            }
            serie += " " + temp;
        }
        
        return serie;
    }
}