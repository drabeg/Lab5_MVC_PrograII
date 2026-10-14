package Model;

public class csModa {
    private int[] numeros = new int[5];

    public void setNumeros(int n1, int n2, int n3, int n4, int n5) {
        numeros[0] = n1;
        numeros[1] = n2;
        numeros[2] = n3;
        numeros[3] = n4;
        numeros[4] = n5;
    }

    public int calcularModa() {
        int maxVeces = 0;
        int moda = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            int veces = 0;
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[j] == numeros[i]) {
                    veces++;
                }
            }
            if (veces > maxVeces) {
                maxVeces = veces;
                moda = numeros[i];
            }
        }
        return moda;
    }
}