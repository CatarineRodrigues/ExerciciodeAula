import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Por favor informe o seu endereço completo");
        String endereço = leitor.nextLine();

        System.out.println("O pacote para o seu produto será enviado para: "+endereço);
    }
}
