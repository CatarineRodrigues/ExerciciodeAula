import java.util.Scanner;

public class Metodo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = leitor.nextLine();

        System.out.println("Digite seu sobrenome");
        String Sobrenome = leitor.nextLine();
        
        exibeNomeSobrenome(nome, Sobrenome);
    }

    public static void exibeNomeSobrenome(String nome, String Sobrenome){
        System.out.println("Olá "+nome+" "+Sobrenome);
    }

}
