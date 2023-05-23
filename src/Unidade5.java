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
        int n = 0;
        int intNumero = 1;
        String strNumero = "";
        String stringNmr1 = "";
        String stringNmr2 = "";
        String sequencia = "";
        int raiz = 0;
        int intNumero1 = 0;
        int intNumero2 = 0;
        

        while(n < 10)
        {
            while((Math.sqrt(intNumero) - Math.floor(Math.sqrt(intNumero))) > 0)            
            {
                intNumero++;
            }

            strNumero = String.valueOf(intNumero);

            if(strNumero.length() == 2)
            {
                stringNmr1 = strNumero.charAt(0)+"";
                stringNmr2 = strNumero.charAt(1)+"";

                intNumero1 = Integer.parseInt(stringNmr1);
                intNumero2 = Integer.parseInt(stringNmr2);

                raiz = intNumero1 + intNumero2;

                if(raiz * raiz == intNumero)
                {
                    n++;
                    sequencia = sequencia+n+"º "+strNumero+"\n";
                } 
            } 
            else if(strNumero.length() == 4)
            {
                stringNmr1 = strNumero.charAt(0)+""+strNumero.charAt(1);
                stringNmr2 = strNumero.charAt(2)+""+strNumero.charAt(3);

                intNumero1 = Integer.parseInt(stringNmr1);
                intNumero2 = Integer.parseInt(stringNmr2);

                raiz = intNumero1 + intNumero2;

                if(raiz * raiz == intNumero)
                {
                    n++;
                    sequencia = sequencia+n+"º "+strNumero+"\n";
                } 
            }     
            else if(strNumero.length() == 5)
            {
                stringNmr1 = strNumero.charAt(0)+""+strNumero.charAt(1);
                stringNmr2 = strNumero.charAt(2)+""+strNumero.charAt(3)+""+strNumero.charAt(4);

                intNumero1 = Integer.parseInt(stringNmr1);
                intNumero2 = Integer.parseInt(stringNmr2);

                raiz = intNumero1 + intNumero2;

                if(raiz * raiz == intNumero)
                {
                    n++;
                    sequencia = sequencia+n+"º "+strNumero+"\n";
                } 
            }  
            else if(strNumero.length() == 6)
            {
                stringNmr1 = strNumero.charAt(0)+""+strNumero.charAt(1)+""+strNumero.charAt(2);
                stringNmr2 = strNumero.charAt(3)+""+strNumero.charAt(4)+""+strNumero.charAt(5);

                intNumero1 = Integer.parseInt(stringNmr1);
                intNumero2 = Integer.parseInt(stringNmr2);

                raiz = intNumero1 + intNumero2;

                if(raiz * raiz == intNumero)
                {
                    n++;
                    sequencia = sequencia+n+"º "+strNumero+"\n";
                } 
            }
            else if(strNumero.length() == 7)
            {
                stringNmr1 = strNumero.charAt(0)+""+strNumero.charAt(1)+""+strNumero.charAt(2);
                stringNmr2 = strNumero.charAt(3)+""+strNumero.charAt(4)+""+strNumero.charAt(5)+strNumero.charAt(6);

                intNumero1 = Integer.parseInt(stringNmr1);
                intNumero2 = Integer.parseInt(stringNmr2);

                raiz = intNumero1 + intNumero2;

                if(raiz * raiz == intNumero)
                {
                    n++;
                    sequencia = sequencia+n+"º "+strNumero+"\n";
                } 
            }
            else if(strNumero.length() == 8)
            {
                stringNmr1 = strNumero.charAt(0)+""+strNumero.charAt(1)+""+strNumero.charAt(2)+strNumero.charAt(3);
                stringNmr2 = strNumero.charAt(4)+""+strNumero.charAt(5)+""+strNumero.charAt(6)+strNumero.charAt(7);

                intNumero1 = Integer.parseInt(stringNmr1);
                intNumero2 = Integer.parseInt(stringNmr2);

                raiz = intNumero1 + intNumero2;

                if(raiz * raiz == intNumero)
                {
                    n++;
                    sequencia = sequencia+n+"º "+strNumero+"\n";
                } 
            }
            
            intNumero++;
        }

        System.out.println("Estes são os 10 primeiros números naturais que apresentam esta particularidade:\n"+sequencia);

    }

    public static void Uni5Exercise11(String[] args)
    /*Uma máquina de biscoito está com problemas. Quando ligada, após 1 hora ela quebra 1 biscoito, na segunda hora ela quebra 3 biscoitos, 
    na hora seguinte ela quebra 3 vezes a quantidade de biscoitos quebrados na hora anterior, e assim por diante. 
    Faça um algoritmo que calcule quantos biscoitos são quebrados no final de cada dia (a máquina opera 16 horas por dia).*/
    {
        int biscoitoQuebrado = 0;
        int horaAnterior = 0;

        for (int i = 0; i < 16; i++) /*i = horas*/ 
        {
            if(i == 0)
            {
                biscoitoQuebrado++;
            }
            else if(i == 1)
            {
                biscoitoQuebrado = biscoitoQuebrado + 3;
                horaAnterior = 3;
            }
            else
            {
                biscoitoQuebrado = biscoitoQuebrado + (horaAnterior * 3);
                horaAnterior = (horaAnterior * 3);
            }
        }        


        System.out.println("Total de biscoitos quebrados por dia: "+biscoitoQuebrado);    

    }

    public static void Uni5Exercise12(String[] args)
    /*Escreva um programa que leia um número inteiro positivo n e em seguida imprima n linhas do chamado Triangulo de Floyd:
      1
      2  3 
      4  5  6
      7  8  9  10
      11 12 13 14 15
    */
    {
        Scanner readline = new Scanner(System.in);
        int numero = 1;
        int qtdRepeticoes = 1;
        String triangulo = "";

        System.err.println("Informe a quantidade de linhas:");
        int n = readline.nextInt();   
      
        for(int i = 0; i < n; i++) 
        {
            for(int j = 0; j < qtdRepeticoes; j++) 
            {
                if(numero > 9)
                {
                    triangulo = triangulo+" "+numero;    
                }
                else
                {
                    triangulo = triangulo+"  "+numero;
                }
                numero++;                
            }
            triangulo = triangulo+"\n";
            qtdRepeticoes++;
        }

        System.out.println(triangulo);    

        readline.close();
    }

    public static void Uni5Exercise13(String[] args)
    /*Um motorista acaba de voltar de um feriado prolongado. Antes de sair de viagem e imediatamente após retornar, 
      o motorista encheu o tanque do veículo e registrou as medidas do odômetro. Em cada parada feita durante a viagem, 
      foi registrado o valor do odômetro e a quantidade de combustível comprado para reabastecer o veículo (suponha que o tanque foi enchido a cada parada). 
      Descreva um algoritmo que leia o número total de reabastecimentos feitos e os dados registrados relativos à compra de combustível. Calcule e escreva:

        * A quilometragem obtida por litro de combustível em cada parada;
        * A quilometragem média obtida por litro de combustível em toda a viagem.
    */
    {
        Scanner readline = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.##");
        
        double qtdLitros = 0;
        double kmsRodados = 0;
        double soma = 0;
        double media = 0;
        String resultado = "";

        System.err.println("Informe a quantidade de paradas:");
        int qtdParadas = readline.nextInt();   
      
        for(int i = 1; i < (qtdParadas+1); i++) 
        {
           System.err.println("Informe a quantidade de litros abastecidos na "+i+"ª parada: "); 
           qtdLitros = readline.nextInt();

           System.err.println("Informe a quantidade de Kms rodados até a "+i+"ª parada: "); 
           kmsRodados = readline.nextInt();

           media = kmsRodados / qtdLitros;
           soma = soma + media;

           resultado = resultado+"Quilometragem obtida por litro até a "+i+"ª parada: "+df.format(media)+" litros\n";
        }

        media = soma / qtdParadas;

        resultado = resultado+"Quilometragem obtida por litro em toda a viagem: "+df.format(media)+" litros\n";

        System.out.println(resultado);    

        readline.close();
    }

    public static void Uni5Exercise14(String[] args)
    /*Um comerciante deseja fazer um levantamento do lucro das 20 mercadorias que comercializa. Para cada mercadoria ele tem o nome, 
        o preço de compra (PC) e o preço de venda (PV). Descreva um algoritmo que:

        * Escreva quantas mercadorias proporcionam: (lucro < 10%), (10% <= lucro <= 20%) e (lucro > 20%), onde o percentual de lucro é calculado da seguinte forma:
            % = (PV - PC) / PC * 100;
        * Determine e escreva o valor total de compra e de venda de todas as mercadorias, assim como o lucro total.
    */
    {
        Scanner readline = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.##");
        
        double mercadoria = 0;
        double precoCompra = 0;
        double precoVenda = 0;
        double lucro = 0;
        String resultado = "";
 

        readline.close();
    }

    public static void main(String[] args)
    {    
        Uni5Exercise13(args);
    }
}
