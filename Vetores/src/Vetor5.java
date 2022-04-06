/* Exercícios vetores

5. Faça um programa que permita que o usuário digite o nome de uma banda musical e insira o 
nome de 3 músicas dessa banda, as músicas deverão ser armazenadas e no final o programa 
deverá mostrar a seguinte mensagem:

NomeDaBanda

Musica1
Musica2
Musica3  */

import java.util.Scanner;

public class Vetor5 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);  // Scaner p armazenar dados
        // criar um vetor para armazenar as músicas
        // criar uma  variável para o nome da banda
        // fazer um loop para inserir as músicas
        // apresentar o nome da banda
        // loop para exibir as músicas

        System.out.println("Qual a sua banda favorita?");
        String banda = leitor.nextLine();

        String[] musicas = new String[3];
        System.out.println("Escolha 3 músicas dessa banda");
        int n = 1;
        for(int i=0; i<musicas.length; i++){
            System.out.print("Música "+n+": ");
            musicas[i] = leitor.nextLine();
            n++;
        }

        System.out.println("----------");
        System.out.println("O nome da Banda é: "+banda);
        
        int l = 1;
        for(int i=0; i<musicas.length; i++){
            System.out.println("Música "+l+" escolhida: "+musicas[i]);
            l++;
        }
    }
}