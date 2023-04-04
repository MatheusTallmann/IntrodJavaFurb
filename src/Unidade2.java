import java.util.Scanner;
import java.text.DecimalFormat; 

public class Unidade2 {

    public static void Uni2Exercise1(String[] args)
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

    public static void Uni2Exercise2(String[] args)
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

    public static void Uni2Exercise3(String[] args)
    // Calcule a área da circunferência elevando o valor de raio ao quadrado e multiplicando por π (π = 3.14159).
    {
        Scanner readLine = new Scanner(System.in);

        System.out.println("Insira valor do raio:");
        
        double number1 = readLine.nextDouble();
        readLine.close();
           
        double area = (number1 * number1) * 3.14;

        System.out.println("O valor da área da circunferência é de: "+area+"m²");
    }
    
    public static void Uni2Exercise4(String[] args)
    // Leia dois valores de ponto flutuante e calcule a média ponderada sabendo que a nota A tem peso 3.5 e nota B 7.5 
    // (a soma dos pesos é 11), sendo que a nota vai de 0.0 a 10.0.
    {
        Scanner readLine = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.00");

        System.out.print("Insira um número:");
        double number1 = readLine.nextDouble();

        System.out.print("Insira um número:");
        double number2 = readLine.nextDouble();

        readLine.close();
           
        double media = ((number1 * 3.5) + (number2 * 7.5)) / 11;

        System.out.println("A média ponderada é: "+df.format(media));
    }

    public static void Uni2Exercise5(String[] args)
    // Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D 
    // segundo a fórmula: DIFERENCA = (A * B - C * D).
    {
        Scanner readLine = new Scanner(System.in);

        System.out.print("Insira um número:");
        int number1 = readLine.nextInt();

        System.out.print("Insira um número:");
        int number2 = readLine.nextInt();

        System.out.print("Insira um número:");
        int number3 = readLine.nextInt();

        System.out.print("Insira um número:");
        int number4 = readLine.nextInt();

        readLine.close();
           
        int diferenca = ((number1 * number2) - (number3 * number4));

        System.out.println("A média ponderada é: "+(diferenca));
    }

    public static void Uni2Exercise6(String[] args)
    // Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, 
    // o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
    {
        Scanner readLine = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.00");

        System.out.print("Insira a quantidade de horas que você trabalha no mês:");
        int qtdHoras = readLine.nextInt();

        System.out.print("Insira o valor da sua hora trabalhada:");
        double valorHora = readLine.nextDouble();

        double salario = qtdHoras * valorHora;

        readLine.close();

        System.out.println("Seu salário mensal é de: R$"+df.format(salario));
    }

    public static void Uni2Exercise7(String[] args)
    // Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). 
    // Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o total a receber no final do mês, com duas casas decimais.
    {
        Scanner readLine = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.00");

        System.out.print("Informe o seu nome:");
        String nome = readLine.next();

        System.out.print("Insira o valor do seu salário fixo:");
        double salarioFixo = readLine.nextDouble();

        System.out.print("Insira o valor total das suas vendas neste mês:");
        double totalVendas = readLine.nextDouble();

        double salarioTotal = (salarioFixo + (totalVendas * 0.15));

        readLine.close();

        System.out.println("O salário de "+nome+" neste mês é de: R$"+df.format(salarioTotal));
    }

    public static void Uni2Exercise8(String[] args)
    // Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, 
    // o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.
    {
        Scanner readLine = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.00");

        System.out.print("Insira o código da peça 1:");
        int codPeca1 = readLine.nextInt();

        System.out.print("Informe a quantidade de peças 1:");
        int qtdPecas1 = readLine.nextInt();

        System.out.print("Insira o valor da peça 1:");
        double vlrPeca1 = readLine.nextDouble();
        
        System.out.print("Insira o código da peça 2:");
        int codPeca2 = readLine.nextInt();

        System.out.print("Informe a quantidade de peças 2:");
        int qtdPecas2 = readLine.nextInt();

        System.out.print("Insira o valor da peça 2:");
        double vlrPeca2 = readLine.nextDouble();

        double totalAPagar = ((qtdPecas1 * vlrPeca1) + (qtdPecas2 * vlrPeca2));

        readLine.close();

        System.out.println("O total a pagar é de: R$"+df.format(totalAPagar));
    }

    public static void Uni2Exercise9(String[] args)
    // Uma pessoa foi até uma casa de câmbio trocar dólares por reais. Para isto ela entregou um valor em dólares para o atendente. 
    // Considerando que o atendente tem a cotação do dólar, calcule quantos reais o atendente deve devolver para a pessoa.
    {
        Scanner readLine = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.00");

        System.out.print("Informe a quantidade de dólares a serem trocados:");
        double vlrDolar = readLine.nextDouble();

        readLine.close();

        double vlrReais = vlrDolar * 5.25;

        System.out.println("O total a ser recebido é de: R$"+df.format(vlrReais));
    }

    public static void Uni2Exercise10(String[] args)
    // Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.
    {
        Scanner readLine = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00");

        System.out.print("Informe a quantidade de segundos a serem convertidos:");
        int qtdSegundos = readLine.nextInt();

        readLine.close();
        
        int qtdHoras = qtdSegundos / 3600;
        qtdSegundos %= 3600;
        int qtdMinutos = qtdSegundos / 60;
        qtdSegundos %= 60;

        System.out.println("O tempo total é de: "+df.format(qtdHoras)+":"+df.format(qtdMinutos)+":"+df.format(qtdSegundos));
    }
    public static void main(String[] args)
    {    
        Uni2Exercise10(args);
    }
}
