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
    /*Descreva um algoritmo que escreva os n primeiros termos da seguinte sequência de números:
        8, 10, 16, 18, 32, 34, 64, ...

        O valor n deve ser lido e deve ser maior do que 2.
    */
    {
        Scanner readline = new Scanner(System.in);
        
        int numero = 8;
        String sequencia = numero+", ";

        System.out.print("Insira um valor para n, que seja maior que 2: ");
        int n = readline.nextInt(); 

        while(n < 3)
        {
            System.out.print("\nDeve ser atribuído a n um valor maior que 2: ");   
            n = readline.nextInt();          
        }


        for (int i = 0; i < n; i++) 
        {
            if(i % 2 == 0)
            {
                numero = numero + 2;
                sequencia = sequencia+(numero)+", ";
            }
            else
            {
                numero = (numero - 2) * 2;
                sequencia = sequencia+(numero)+", ";
            }
        }

        System.out.println("\nOs "+n+" primeiros termos da sequência são: "+sequencia);

        readline.close();
    }

    public static void Uni5Exercise6(String[] args)
    /*Descreva um algoritmo que leia a altura de 20 pessoas e calcule a média de altura das mesmas.*/
    {
        Scanner readline = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double soma = 0;

        for (int i = 0; i < 20; i++) 
        {
            System.out.print("informe a altura de uma pessoa (em centímetros): ");    
            double altura = readline.nextDouble();

            soma = soma + altura;
        }

        double media = (soma / 20) / 100;

        System.out.println("A média de altura das pessoas informadas é de: "+df.format(media));    

        readline.close();
    }

    public static void Uni5Exercise7(String[] args)
    /*Descreva um algoritmo que leia um número inteiro n e, dados n números reais informe o maior e o menor número.*/
    {
        Scanner readline = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.#########");

        System.out.print("Informe um valor para n: ");
        int n = readline.nextInt();

        double maiorValor = 0;
        double menorValor = 0;

        for (int i = 0; i < n; i++) 
        {
            System.out.print("Informe um número real: ");    
            double numero = readline.nextDouble();

            if(numero > maiorValor)
            {
                maiorValor = numero;
                
                if(i == 0)
                {
                    menorValor = numero;
                }
            }
            else if(numero < menorValor)
            {
                menorValor = numero;
            }
        }

        System.out.println("O maior número é: "+df.format(maiorValor));    
        System.out.println("O menor número é: "+df.format(menorValor));    

        readline.close();
    }

    public static void Uni5Exercise8(String[] args)
    /*Descreva um algoritmo que leia um número inteiro n e, dados n números inteiros, descreva um algoritmo que:
        Escreva o menor valor negativo;
        Escreva a média dos números positivos.*/
    {
        Scanner readline = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.#########");

        System.out.print("Informe um valor para n: ");
        int n = readline.nextInt();

        double menorNegativo = Integer.MIN_VALUE;
        double soma = 0;
        int qtdPositivos = 0;

        for (int i = 0; i < n; i++) 
        {
            System.out.print("Informe um número real: ");    
            double numero = readline.nextDouble();

            if(numero > 0)
            {
                soma = soma + numero;
                qtdPositivos++;
            }
            else if(numero < menorNegativo)
            {
                menorNegativo = numero;
            }
        }

        double mediaPositivos = soma / qtdPositivos;

        System.out.println("O menor número negativo é: "+df.format(menorNegativo));    
        System.out.println("A média dos números positivos é: "+df.format(mediaPositivos));    

        readline.close();
    }

    public static void Uni5Exercise9(String[] args)
    /*Uma turma tem n alunos. Dado n, o nome e idade de cada aluno descreva um algoritmo que:
        Escreva os nomes dos alunos que tem 18 anos;
        Escreva a quantidade de alunos que tem idade acima de 20 anos.*/
    {
        Scanner readline = new Scanner(System.in);

        System.out.print("Informe um valor para n: ");
        int n = readline.nextInt();

        String alunoCom18 = "";
        int qtdAlunos20 = 0;

        for (int i = 0; i < n; i++) 
        {
            System.out.print("Informe o nome do aluno: ");    
            String nome = readline.next();

            System.out.print("Informe a idade do aluno: ");    
            int idade = readline.nextInt();

            if(idade > 17)
            {
                if(idade == 18)
                {
                    alunoCom18 = alunoCom18+nome+"\n";
                }
                else if(idade > 20)
                {
                    qtdAlunos20++;
                }
            }
        }

        System.out.println("\nAlunos que possuem 18 anos de idade:\n"+alunoCom18);    
        System.out.println("Quantidade de alunos que possuem mais de 20 anos de idade: "+qtdAlunos20);    

        readline.close();
    }

    public static void Uni5Exercise10(String[] args)
    /*O número 3025 possui a seguinte característica:
        30 + 25 = 55 => 55² = 3025
        Escreva um programa que pesquise e imprima os 10 primeiros números naturais que apresentam tal propriedade. Outros exemplos:
        
        20 + 25 = 45 => 45² = 2025*/
    {
        Scanner readline = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0");
        int n = 0;

        double numeroFinal = 0;
        double raiz = 25;
        double numero1 = 20;
        double numero2 = 25;

        while(n < 10)
        {
            while(Math.sqrt(numeroFinal) % 2 == 0)            
            {
                numeroFinal++;
            }

            if(((numero1 + numero2) == (numeroFinal / raiz)) && (df.format(numero1)+""+""+df.format(numero2)).equals(""+df.format(numeroFinal)))
            {
                n++;
            }
        }

        readline.close();
    }

    public static void main(String[] args)
    {    
        Uni5Exercise10(args);
    }
}