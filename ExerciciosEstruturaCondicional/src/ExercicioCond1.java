import java.util.Scanner;

public class ExercicioCond1 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Vamos fazer uma média das suas notas");
        System.out.println("Insira a primeira nota");
        float nota1 = leitor.nextFloat();
        
        System.out.println("Insira a segunda nota");
        float nota2 = leitor.nextFloat();

        System.out.println("Insira a terceira nota");
        float nota3 = leitor.nextFloat();

        System.out.println("Insira a quarta nota");
        float nota4 = leitor.nextFloat();

        float media = (nota1+nota2+nota3+nota4)/4;
        
        if(media >= 7){
            System.out.println("Aluno teve a média "+media+" e foi aprovado.");
        } else{
            System.out.println("Aluno teve a média "+media+" e foi reprovado.");
        }
    }
}