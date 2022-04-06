import java.util.Scanner;

public class Exercicio3novo {
    public static void main(String[] args){
        System.out.println("Insira o seu saldo atual:");
        
        Scanner leitor = new Scanner(System.in);
        double saldo = leitor.nextDouble();

        System.out.println("O saldo atual da sua conta é de: "+saldo+" reais.");
    }
}
