import java.util.Scanner;

public class Aula7Operadores {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /* Exercicio 1 */

       /* System.out.println("Digite o primeiro número:");
        int primeiroNumero = scan.nextInt();
        System.out.println("Digite o segundo número:");
        int segundoNumero = scan.nextInt();
        int resultado = primeiroNumero + segundoNumero;
        System.out.println("A soma dos dois números é: " + resultado); */

        /* Exercicio 2 */


        /* System.out.println("Digite a primeira nota");
        int primeiraNota = scan.nextInt();
        System.out.println("Digite a segunda nota");
        int segundaNota = scan.nextInt();
        System.out.println("Digite a terceira nota");
        int terceiraNota = scan.nextInt();
        System.out.println("Digite a quarta nota");
        int quartaNota = scan.nextInt();

        double media = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;

        System.out.println("A média é:" + media); */

        /* Exercicio 3 */

        System.out.println("Digite o valor/hora");
        double valorHora = scan.nextDouble();
        System.out.println("Informe a quantidade de horas trabalhadas");
        double horasTrabalhadas = scan.nextDouble();

        double salario = valorHora * horasTrabalhadas;
        System.out.println("O salário é " + salario);


    }

}