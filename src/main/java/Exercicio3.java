
import java.util.Arrays;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Exercicio3 {
     public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[50];
        
        System.out.println("Digite 50 números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        Arrays.sort(numeros);
        
        System.out.println("50 nomes em ordem decrescente:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        scanner.close();
    }
    
}
