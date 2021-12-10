package TreinosCursoDIO;

import Java.Modular.Utils.Calculadora;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        Calculadora calculadora = new Calculadora();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira 1:Soma\n Insira 2:Divisao\n Insira3:Multiplicacao\n Insira 4:Subtracao\n");

        Scanner entradaoperacao = new Scanner(System.in);

        int operacao = entradaoperacao.nextInt();

        if (operacao >= 5 ) {
            System.out.println("Operacao invalida, encerrando o programa\n");
            System.exit(0);
        }
        if (operacao == 0 ) {
            System.out.println("Operacao invalida, encerrando o programa\n");
            System.exit(0);
        }

        System.out.println("Insira o primeiro valor inteiro:\n");

        int a = entrada.nextInt();

        System.out.println("Insira o segundo valor inteiro:\n");

        int b = entrada.nextInt();

        int soma = calculadora.sum(a, b);

        int sub = calculadora.sub(a, b);

        int multi = calculadora.multi(a, b);

        int divi = calculadora.div(a, b);

        if (operacao == 1) {
            System.out.println("O resultado da soma de " + a + " por " + b + " e igual a: "  + soma);
        }
        if (operacao == 2) {
            System.out.println("O resultado da divisao de " + a + " por " + b + " e igual a: "  + divi);
        }
        if (operacao == 3) {
            System.out.println("O resultado da multiplicacao de " + a + " por " + b + " e igual a: "  + multi);
        }
        if (operacao == 4) {
            System.out.println("O resultado da subtracao de " + a + " por " + b + " e igual a: "  + sub);
        }



    }
}




