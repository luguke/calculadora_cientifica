import java.util.Scanner;

public class main {
    public static void main(String[] args ) {
        System.out.println("Digite o primeiro valor!");
        Scanner entrevalor1 = new Scanner(System.in);
        double valor1 = entrevalor1.nextDouble();
        System.out.println("Digite o segundo valor!");
        Scanner entrevalor2 = new Scanner(System.in);
        double valor2 = entrevalor2.nextDouble();
        System.out.println("Qual operacao deseja realizar?");
        System.out.println("1 - Soma 2 - Divisão 3 - Multiplicação 4 - Exponenciação 5 - Número Inverso 6 - Fatoração 7 - Subtração 8 - Raiz Quadrada");
        Scanner operador = new Scanner(System.in);
        int comando = operador.nextInt();
        calculadora calculadora = new calculadora(valor1, valor2);
        switch (comando) {
            case 1:
                System.out.println(calculadora.somar());
                break;
            case 2:
                System.out.println(calculadora.dividir());
                break;
            case 3:
                System.out.println(calculadora.multiplicar());
                break;
            case 4:
                System.out.println(calculadora.elevar());
                break;
            case 5:
                System.out.println(calculadora.inverso());
                break;
            case 6:
                System.out.println(calculadora.fatoriar());
                break;
            case 7:
                System.out.println(calculadora.subtrair());
                break;
            case 8:
                System.out.println(calculadora.raiz());
                break;
        }
    }

}
