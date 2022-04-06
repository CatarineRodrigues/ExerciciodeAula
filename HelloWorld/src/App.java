import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Por favor insira seu nome: ");
        String nome = leitor.nextLine();
        System.out.println("Olá "+nome+", muito prazer em conhecer você!");
    }
}
