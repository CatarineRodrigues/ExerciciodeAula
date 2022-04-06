// Exercícios estruturas de repetição

import java.util.Scanner;

public class Repeticao1 {
    public static void main(String[] args) {
        
// 1. Faça um programa que mostra os números pares até 100

        Scanner leitor = new Scanner(System.in);  // Scaner p armazenar dados

        System.out.println("Números pares de 0 até 100: ");
        for(int i=0; i<=100; i++){              // estrura de repetição
            if(i % 2 == 0){                    // condicional mostrar para par
                System.out.println(i);        // para mostrar números
            }
        }
    }
}
