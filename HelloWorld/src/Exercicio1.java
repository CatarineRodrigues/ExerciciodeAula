import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Olá! Qual é o seu nome?");
        String nome = leitor.nextLine();
        
        System.out.println("Por favor, insira a sua idade: ");
        int idade = leitor.nextInt();
        System.out.println("Olá "+nome+" sua idade é: "+idade);
    }
}
