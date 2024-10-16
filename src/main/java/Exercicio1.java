
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
public class Exercicio1 {
    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[10];
        
        System.out.println("Digite 10 nomes:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        Arrays.sort(nomes);
        
        System.out.println("10 nomes em ordem crescente:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        scanner.close();
    }
    
}
