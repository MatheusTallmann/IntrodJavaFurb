import java.util.Scanner;
import java.text.DecimalFormat;

public class Unidade5 
{
    public static void Uni5Exercise1(String[] args)
    /*Descreva um algoritmo que leia 20 números inteiros e escreva, para cada número lido, se o mesmo é par ou ímpar.*/
    {
        Scanner readline = new Scanner(System.in);

        for (int i = 0; i < 20; i++) 
        {
            System.out.print("Insira um número: ");
            int numero = readline.nextInt();

            if(numero % 2 == 0) 
            {
                System.out.println("O número é par!");
            }
            else
            {
                System.out.println("O número é impar!");
            }
        }

        readline.close();
    }

    public static void Uni5Exercise2(String[] args)
    /*Descreva um algoritmo que calcule e escreva a soma dos números pares e a soma dos números ímpares entre 1 e 100.*/
    {
        Scanner readline = new Scanner(System.in);

        int somaPares = 0;
        int somaImpares = 0;

        for (int i = 1; i < 101; i++) 
        {            
            if(i % 2 == 0) 
            {
                somaPares = somaPares + i;
            }
            else
            {
                somaImpares = somaImpares + i;
            }
        }

        System.out.println("Resultado soma dos números pares de 1 a 100: "+somaPares);
        System.out.println("Resultado soma dos números ímpares de 1 a 100: "+somaImpares);

        readline.close();
    }

    public static void Uni5Exercise3(String[] args)
    /*Descreva um algoritmo que calcule e escreva a soma da seguinte série de 100 termos:
        1/1 + 1/2 + 1/3 ... 1/100
    */
    {
        Scanner readline = new Scanner(System.in);

        double somaNumeros = 0;

        for (double i = 1; i < 101; i++) 
        {            
            somaNumeros = somaNumeros + (1 / i);
        }

        System.out.println("Resultado da soma dos 100 termos: "+somaNumeros);

        readline.close();
    }

    public static void Uni5Exercise4(String[] args)
    /*Descreva um algoritmo para calcular o valor de S dado por:
        S = 3/2 + 5/6 + 7/12 + 9/20 + 11/30 ...
    */
    {
        Scanner readline = new Scanner(System.in);

        double numerador = 3; /*os primeiros 20 números ímpares depois de 1 */
        double denominador = 2; /*a soma do numerador atual com o denominador anterior - 1*/
        double soma = 0;

        for (double i = 0; i < 20; i++) 
        {            
            if(i != 0)
            {
                numerador = numerador + 2;
                denominador = numerador + (denominador - 1);                
            }

            soma = soma + (numerador / denominador);
        }

        System.out.println("Resultado da soma dos 100 termos: "+numerador);

        readline.close();
    }

    public static void Uni5Exercise5(String[] args)
    /*Descreva um algoritmo para calcular o valor de S dado por:
        S = 3/2 + 5/6 + 7/12 + 9/20 + 11/30 ...
    */
    {
        Scanner readline = new Scanner(System.in);

        double numerador = 3; /*os primeiros 20 números ímpares depois de 1 */
        double denominador = 2; /*a soma do numerador atual com o denominador anterior - 1*/
        double soma = 0;

        for (double i = 0; i < 20; i++) 
        {            
            if(i != 0)
            {
                numerador = numerador + 2;
                denominador = numerador + (denominador - 1);                
            }

            soma = soma + (numerador / denominador);
        }

        System.out.println("Resultado da soma dos 100 termos: "+numerador);

        readline.close();
    }

    public static void main(String[] args)
    {    
        Uni5Exercise5(args);
    }
}
