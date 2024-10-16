
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] times = new String[20];
        
        System.out.println("Digite os nomes dos 20 times na ordem de classificação:");
        for (int i = 0; i < times.length; i++) {

            System.out.print("Posição " + (i + 1) + ": ");
            times[i] = scanner.nextLine();
        }

        System.out.println("Classificação do Campeonato Brasileiro:");
        for (int i = 0; i < times.length; i++) {

            System.out.println((i + 1) + "º - " + times[i]);
        }
    }
}

