package Model;

import java.util.Arrays;

public class csIntermedio {
    private int[] nums = new int[3];

    // El ingeniero pide una clase que reciba los 3 valores
    public void setNumeros(int n1, int n2, int n3) {
        nums[0] = n1;
        nums[1] = n2;
        nums[2] = n3;
        // Ordena automáticamente de menor a mayor
        Arrays.sort(nums); 
    }

    // Y a través de métodos retorne el cálculo requerido
    public int getMenor() { 
        return nums[0]; 
    }
    
    public int getIntermedio() { 
        return nums[1]; 
    }
    
    public int getMayor() { 
        return nums[2]; 
    }
}