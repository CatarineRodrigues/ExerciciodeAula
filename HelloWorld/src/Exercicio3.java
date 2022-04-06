import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){
        System.out.println("Insira o seu saldo atual:");
        
        Scanner leitor = new Scanner(System.in);
        int saldo = leitor.nextInt();

        System.out.println("O saldo atual da sua conta é de: "+saldo+" reais.");
    }
}
