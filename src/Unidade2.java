import java.util.Scanner;

public class Unidade2 {

    public static void main(String[] args)
    {    
        Exercise3(args);
    }

    public static void Exercise1(String[] args)
    // Leia 2 valores inteiros e imprima sua soma.
    {
        Scanner readLine = new Scanner(System.in);

        System.out.println("Insira um número inteiro:");
        int number1 = readLine.nextInt();
        System.out.println("Insira um número inteiro:");
        int number2 = readLine.nextInt();
           
        readLine.close();
        int sum = number1 + number2;

        System.out.println("A soma de "+number1+" e "+number2+" é: "+sum);
    }

    public static void Exercise2(String[] args)
    // Leia 2 valores inteiros e imprima sua multiplicação.
    {
        Scanner readLine = new Scanner(System.in);

        System.out.println("Insira um número inteiro:");
        int number1 = readLine.nextInt();
        System.out.println("Insira um número inteiro:");
        int number2 = readLine.nextInt();
           
        readLine.close();
        int sum = number1 * number2;

        System.out.println("A multiplicação de "+number1+" e "+number2+" é: "+sum);
    }

    public static void Exercise3(String[] args)
    // Calcule a área da circunferência elevando o valor de raio ao quadrado e multiplicando por π (π = 3.14159).
    {
        Scanner readLine = new Scanner(System.in);

        System.out.println("Insira valor do raio:");
        
        double number1 = readLine.nextDouble();
        readLine.close();
           
        double area = (number1 * number1) * 3.14;

        System.out.println("O valor da área da circunferência é de: "+area+"m²");
    }
}
