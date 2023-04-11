import java.util.Scanner;
import java.net.http.HttpResponse.ResponseInfo;
import java.text.DecimalFormat; 

public class Unidade4 
{
    public static void Uni4Exercise1(String[] args)
    /*A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais de 40 horas receberá hora extra, cujo 
    cálculo é o valor da hora regular com um acréscimo de 50%. Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o valor 
    por hora e escreva o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas (considere que 
    o mês possua 4 semanas exatas).Para resolver este problema pode se utilizar do algoritmo descrito no fluxograma: */
    {
        Scanner readline = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,##0.00");
        double horaExtra = 0; 
        
        System.out.print("Insira a quantidade de horas trabalhadas na semana: ");
        double horasTrabalhadas = readline.nextDouble();

        System.out.print("Insira o valor da hora trabalhada: ");
        double vlrHora = readline.nextDouble();

        if(horasTrabalhadas > 40)
        {
            horaExtra = (horasTrabalhadas - 40) * (vlrHora * 1.5);    
            horasTrabalhadas = 40;
        }

        double salario = ((horasTrabalhadas * vlrHora) * 4) + horaExtra;

        System.out.print("Salário total: R$"+df.format(salario));

        readline.close();
    }

    public static void Uni4Exercise2(String[] args)
    /*Dado um valor inteiro maior do que 0 informe se o valor é par ou ímpar.
    Para resolver este problema pode se utilizar do algoritmo descrito no fluxograma:*/
    {
        Scanner readline = new Scanner(System.in);
        
        System.out.print("Entre com um valor inteiro maior que 0: ");
        int numero = readline.nextInt();
        

        if(numero % 2 == 0)
        {
            System.out.print("Número é par!");
        }
        else
        {
            System.out.print("Número é ímpar!");
        }
        
        readline.close();
    }

    public static void Uni4Exercise3(String[] args)
    /*Dados dois números inteiros descreva um algoritmo para informar o maior valor entre eles.*/
    {
        Scanner readline = new Scanner(System.in);
        
        System.out.print("Entre com um valor inteiro: ");
        int numero1 = readline.nextInt();
        
        System.out.print("Insira mais um valor inteiro: ");
        int numero2 = readline.nextInt();

        if(numero1 > numero2)
        {
            System.out.print("O maior valor é: "+numero1);
        }
        else
        {
            System.out.print("O maior valor é: "+numero2);
        }
        
        readline.close();
    }

    public static void Uni4Exercise4(String[] args)
    /*Dado um número de ponto flutuante maior do que 0, informe se foram digitadas ou não casas decimais no número.*/
    {
        Scanner readline = new Scanner(System.in);
        
        double numero = readline.nextDouble(); 

        double resto = numero - Math.floor(numero);

        if (resto > 0)
        {
            System.out.println("Foram digitadas casas decimais no número");
        }
        else
        {
            System.out.println("Foram digitadas casas decimais no número");
        }
        
        readline.close();
    }

    public static void Uni4Exercise5(String[] args)
    /*Dada uma pergunta, “a cor é azul?”, faça um programa que leia uma variável lógica com a resposta e responda “Sim”, 
    caso a resposta seja true, ou “Não”, caso seja false.*/
    {
        Scanner readline = new Scanner(System.in);
        
        System.out.print("A cor é azul? ");
        String resposta = readline.next(); 

        if(resposta.toUpperCase().equals("AZUL"))
        {
            System.out.println("Sim");
        }
        else
        {
            System.out.println("Não");
        }
        
        readline.close();
    }

    public static void Uni4Exercise6(String[] args)
    /*Faça um algoritmo que leia um caractere. Caso seja digitada a letra 'M' escreva “Masculino”. Se for digitada a letra 'F' escreva 
    “Feminino”. Se for informado 'I' escreva “Não Informado”. 
    Qualquer outra letra digitada escreva “Entrada Incorreta”. Atenção: antes de testar a letra, converta-a para maiúscula.*/
    {
        Scanner readline = new Scanner(System.in);
        
        System.out.print("Insira um caracter: ");
        String resposta = readline.next(); 

        switch (resposta.toUpperCase()) 
        {
            case "M" :         
            System.out.println("Masculino");
            break;

            case "F" :         
            System.out.println("Feminino");
            break;

            case "I" :         
            System.out.println("Não informado");
            break;

            default:
            System.out.println("Entrada incorreta");
        }    
        
        readline.close();
    }

    public static void Uni4Exercise7(String[] args)
    /*O custo do selo de uma carta com até 50 gramas é de R$ 0,45. As cartas com peso superior pagam um adicional de R$ 0,45 por cada 20 gramas, 
    ou fração, em que excedem aquele peso. Escreva um algoritmo que dado o peso da carta, em gramas, determine o custo do selo.
    Para resolver este problema pode se utilizar do algoritmo descrito no fluxograma*/
    {
        Scanner readline = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,##0.00");

        System.out.print("Insira o peso da carta (em gramas): ");
        int pesoCarta = readline.nextInt(); 
        double vlrSelo = 0;

        if(pesoCarta <= 50)
        {
            vlrSelo = 0.45;
        }
        else
        {
            vlrSelo = 0.45 + (Math.floor((pesoCarta - 50) / 20) * 0.45);
        }

        System.out.print("O custo do selo é de: "+df.format(vlrSelo));

        readline.close();
    }

    public static void Uni4Exercise8(String[] args)
    /*Dado uma letra, escreva um algoritmo que informe se ela é ou não uma vogal.
    Para resolver este problema pode se utilizar do algoritmo descrito no fluxograma:*/
    {
        Scanner readline = new Scanner(System.in);
        
        System.out.print("Insira uma letra: ");
        String resposta = readline.next(); 

        if(resposta.toUpperCase().equals("A") || resposta.toUpperCase().equals("E") || resposta.toUpperCase().equals("I")|| resposta.toUpperCase().equals("O") || resposta.toUpperCase().equals("U"))
        {
            System.out.println("É uma vogal!");
        }
        else
        {
            System.out.println("Não é uma vogal!");
        }

        readline.close();
    }

    public static void Uni4Exercise9(String[] args)
    /*Dados dois valores inteiros, escreva um algoritmo que informe se eles são múltiplos ou não. */
    {
        Scanner readline = new Scanner(System.in);
        
        System.out.print("Insira um número: ");
        double numero1 = readline.nextInt(); 

        System.out.print("Insira outro número: ");
        double numero2 = readline.nextInt(); 

        if(numero1 % numero2 == 0 || numero2 % numero1 == 0)



        readline.close();
    }

    public static void main(String[] args)
    {    
        Uni4Exercise9(args);
    }
}
