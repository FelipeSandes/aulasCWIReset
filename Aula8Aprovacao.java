import java.util.Scanner;

public class Aula8Aprovacao {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota");
        int primeiraNota = scan.nextInt();
        System.out.println("Digite a segunda nota");
        int segundaNota = scan.nextInt();
        System.out.println("Digite a terceira nota");
        int terceiraNota = scan.nextInt();
        System.out.println("Digite a quarta nota");
        int quartaNota = scan.nextInt();

        double media = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;

        if (media == 10){
            System.out.println("Aluno aprovado com louvores");
        }
        else if (media >= 7){
            System.out.println("Aluno aprovado");
        }
        else{
            System.out.println("Aluno reprovado");
        }
    }

}