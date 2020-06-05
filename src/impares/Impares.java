
package impares;

import java.util.Scanner;

public class Impares {

    public static void main(String[] args) {
        
        int numero = 1;
        int resp = 0;
        
        Scanner leitor = new Scanner (System.in);
        
        while (numero < 50){
            if (numero %2 != 0){
                resp = resp + numero;
            }
            numero = numero + 1;
        }
        System.out.println("Resposta: " + resp);
    }
    
}
