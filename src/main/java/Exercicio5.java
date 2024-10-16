
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Exercicio5 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
    
        int[] numeros = new int[100];

        
        System.out.println("Digite 100 números:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

    
        System.out.println("Números pares:");
        for (int numero : numeros) {

            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        }
    }
}

