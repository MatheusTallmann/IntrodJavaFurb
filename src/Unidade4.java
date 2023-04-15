import java.util.Scanner;
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
        {
            System.out.println("É múltiplo");
        }
        else
        {
            System.out.println("Não é múltiplo");
        }


        readline.close();
    }

    public static void Uni4Exercise10(String[] args)
    /*Um casal possui três filhos: Marquinhos, Zezinho e Luluzinha. Faça um algoritmo para ler as idades dos filhos e exibir quem é o caçula da família; suponha que não haja empates.*/
    {
        Scanner readline = new Scanner(System.in);
        
        System.out.print("Informe a idade de Marquinhos: ");
        int idadeM = readline.nextInt(); 

        System.out.print("Informe a idade de Zezinho: ");
        int idadeZ = readline.nextInt(); 

        System.out.print("Informe a idade de Luluzinha: ");
        int idadeL = readline.nextInt(); 

        if(idadeM < idadeZ && idadeM < idadeL)
        {
            System.out.println("Marquinhos é o caçula!");
        }
        else if(idadeZ < idadeM && idadeZ < idadeL)
        {
            System.out.println("Zezinho é o caçula!");
        }
        else
        {
            System.out.println("Luluzinha é a caçula!");            
        }

        readline.close();
    }

    public static void Uni4Exercise11(String[] args)
    /*Escreva um algoritmo para ler o ano de nascimento de 3 irmãos, escrever uma mensagem que indique se eles são TRIGÊMEOS, GÊMEOS, APENAS IRMÃOS. 
    Considere que eles são GÊMEOS se dois deles possuem a mesma idade e o outro diferente dos demais, e apenas irmãos se todas as idades forem diferentes.*/
    {
        Scanner readline = new Scanner(System.in);
        
        System.out.print("Informe a idade do filho 1: ");
        int idade1 = readline.nextInt(); 

        System.out.print("Informe a idade do filho 2: ");
        int idade2 = readline.nextInt(); 

        System.out.print("Informe a idade do filho 3: ");
        int idade3 = readline.nextInt(); 

        if(idade1 != idade2 && idade1 != idade3 && idade2 != idade3)
        {
            System.out.println("São apenas irmãos!");
        }
        else if(idade1 == idade2 && idade1 == idade3 && idade2 == idade3)
        {
            System.out.println("São trigêmeos!");
        }
        else
        {
            System.out.println("Dois são gêmeos!");            
        }

        readline.close();
    }

    public static void Uni4Exercise12(String[] args)
    /*Dados 3 valores lado1, lado2, lado3, que representam os comprimentos dos lados de um triângulo, descreva um algoritmo que verifique se os mesmos 
    podem ser os comprimentos dos lados de um triângulo. Em caso afirmativo, verifique e informe se é "triângulo equilátero", "triângulo isósceles" ou "triângulo escaleno". 
    Em caso negativo, informe que os mesmos não formam um triângulo. Considere que:
    
    Um triângulo equilátero tem três lados iguais
    Um triângulo isóscele tem dois lados iguais e um diferente
    Um triângulo escaleno tem três lados diferentes*/
    {
        Scanner readline = new Scanner(System.in);
        
        System.out.print("Informe o comprimento do lado 1: ");
        int lado1 = readline.nextInt(); 

        System.out.print("Informe o comprimento do lado 2: ");
        int lado2 = readline.nextInt(); 

        System.out.print("Informe o comprimento do lado 3: ");
        int lado3 = readline.nextInt(); 

        if(lado1 != lado2 && lado1 != lado3 && lado2 != lado3)
        {
            System.out.println("É um triângulo escaleno!");
        }
        else if(lado1 == lado2 && lado1 == lado3 && lado2 == lado3)
        {
            System.out.println("É um triângulo equilátero!");
        }
        else
        {
            System.out.println("É um triângulo isósceles!");            
        }

        readline.close();
    }

    public static void Uni4Exercise13(String[] args)
    /*Escreva um algoritmo que obtém do usuário 3 valores inteiros representando as três cartas deste usuário em uma mão de jogo de truco 
    (1 = AS; 2 = 2; 3 = 3; 7 = 7; 11 = Valete; 12 = Dama; 13 = Rei). O algoritmo deve imprimir na tela a palavra "TRUCO" (se APENAS UMA das três cartas for AS, 2 ou 3), "SEIS" 
    (se APENAS DUAS das três cartas for AS, 2 ou 3) ou "NOVE" (se AS TRÊS cartas forem AS, 2 ou 3). Se não houver AS, 2 ou 3 nas três cartas, não é impresso nada.
    Dica: criar variáveis intermediárias para contar a quantidade de "boas".*/
    {
        Scanner readline = new Scanner(System.in);
        
        System.out.print("Informe o número da carta 1: ");
        int carta1 = readline.nextInt(); 

        System.out.print("Informe o número da carta 2: ");
        int carta2 = readline.nextInt(); 

        System.out.print("Informe o número da carta 3: ");
        int carta3 = readline.nextInt(); 

        int count = 0;

        if(carta1 > 0 && carta1 < 4)
        {
            count++;
        }
        if(carta2 > 0 && carta2 < 4)
        {
            count++;
        }
        if(carta3 > 0 && carta3 < 4)
        {
            count++;
        }

        switch(count)
        {
            case 1 :
            System.out.println("TRUCO!");
            break;

            case 2 :
            System.out.println("SEIS!");
            break;

            case 3 :
            System.out.println("NOVE!");
            break;

            default:
        }

        readline.close();
    }

    public static void Uni4Exercise14(String[] args)
    /*Leia uma data e determine se ela é válida. Ou seja, verifique se o mês está entre 1 e 12, e se o dia existe naquele mês. Note que fevereiro tem 29 dias em anos bissextos, e 28 dias em anos não bissextos.*/
    {
        Scanner readline = new Scanner(System.in);
        
        System.out.print("Informe o dia: ");
        int dia = readline.nextInt(); 

        System.out.print("Informe o mês: ");
        int mes = readline.nextInt(); 

        System.out.print("Informe o ano: ");
        int ano = readline.nextInt(); 


        if((dia > 0 && dia < 32) && (mes > 0 && mes < 13) && (ano > 0))
        {
            if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
            {
                System.out.print("Data válida!");
            }
            else if(mes != 2 && dia < 31)
            {
                System.out.print("Data válida!");
            }
            else if(mes == 2 && dia < 29)
            {
                System.out.print("Data válida!");
            }
            else if(dia == 29 && ano % 4 == 0 && !(ano % 100 == 0 && ano % 400 != 0))
            {
                System.out.print("Data válida!");
            }
            else
            {
                System.out.print("Data inválida!");   
            }
        }
        else
        {
            System.out.print("Data inválida!");    
        }

        readline.close();
    }

    public static void Uni4Exercise15(String[] args)
    /*Elabore um algoritmo para exibir o valor de reajuste que um funcionário receberá no seu salário. 
    A empresa irá conceder 5% de reajuste para o funcionário que for admitido há menos de 12 meses. Para funcionário admitido entre 13 e 48 meses, irá conceder 7% de reajuste. 
    O seu algoritmo deve solicitar ao usuário que digite a quantidade de meses que o funcionário foi admitido.*/
    {
        Scanner readline = new Scanner(System.in);
        
        System.out.print("Informe a quantidade de meses que você está na empresa: ");
        int qtdMeses = readline.nextInt(); 

        if(qtdMeses < 13)
        {
            System.out.println("Você receberá 5% de reajuste no seu salário!");
        }
        else if(qtdMeses < 48)
        {
            System.out.println("Você receberá 7% de reajuste no seu salário!");
        }

        readline.close();
    }

    public static void Uni4Exercise16(String[] args)
    /*Escreva um algoritmo que leia a idade de 2 homens e 2 mulheres (considere que a idade entre homens e mulheres sempre serão diferentes). 
    Calcule e escreva a soma das idades do homem mais velho com a mulher mais nova, e o produto das idades do homem mais novo com a mulher mais velha.*/
    {
        Scanner readline = new Scanner(System.in);
        
        System.out.print("Informe a idade do homem 1: ");
        int idadeH1 = readline.nextInt(); 

        System.out.print("Informe a idade do homem 2: ");
        int idadeH2 = readline.nextInt(); 

        System.out.print("Informe a idade do mulher 1: ");
        int idadeM1 = readline.nextInt(); 

        System.out.print("Informe a idade do mulher 2: ");
        int idadeM2 = readline.nextInt(); 

        int homemMaisVelho = 0;
        int homemMaisNovo = 0;

        int mulherMaisVelha = 0;
        int mulherMaisNova = 0;

        if(idadeH1 > idadeH2)
        {
            homemMaisVelho = idadeH1;
            homemMaisNovo = idadeH2;            
        }
        else
        {
            homemMaisVelho = idadeH2;
            homemMaisNovo = idadeH1; 
        }

        if(idadeM1 > idadeM2)
        {
            mulherMaisVelha = idadeM1;
            mulherMaisNova = idadeM2;            
        }
        else
        {
            mulherMaisVelha = idadeM2;
            mulherMaisNova = idadeM1; 
        }

        System.out.println("A soma das idades do homem mais velho ("+homemMaisVelho+") com a mulher mais nova ("+mulherMaisNova+") é de: "+(homemMaisVelho+mulherMaisNova));
        System.out.println("O produto das idades do homem mais novo ("+homemMaisNovo+") com a mulher mais velha ("+mulherMaisVelha+") é de: "+(homemMaisNovo*mulherMaisVelha));
        
        readline.close();
    }

    public static void Uni4Exercise17(String[] args)
    /*Para realizar o cálculo do Imposto de Renda a ser pago, é solicitado a renda anual e o número de dependentes do contribuinte. 
    A renda líquida é calculada sobre a renda anual com um desconto de 2% para cada dependente do contribuinte. O contribuinte com uma renda líquida de até R$ 2.000,00 não paga imposto. 
    Para aqueles que possuem renda líquida entre R$ 2.000,00 e R$ 5.000,00 o imposto é de 5% sobre o valor da renda líquida; para rendas líquidas de R$ 5.000,00 até R$ 10.000,00 é de 10%. 
    Rendas superiores a R$ 10.000,00 pagam 15% de imposto.*/
    {
        Scanner readline = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,##0.00");

        System.out.print("Informe sua renda anual: ");
        double rendaAnual = readline.nextDouble(); 

        System.out.print("Informe a quantidade de dependentes que você possui: ");
        int qtdDependentes = readline.nextInt(); 
        
        double rendaLiquida = (rendaAnual / 12) * (1 - (qtdDependentes * 0.02));
        double imposto = 0;

        System.out.println("Renda líquida: R$"+df.format(rendaLiquida));

        if(rendaLiquida < 2000)
        {
            System.out.println("Não paga imposto de renda!");
        }
        else if(rendaLiquida >= 2000 && rendaLiquida < 5000)
        {
            imposto = rendaLiquida * 0.05;
            System.out.println("São aplicados 5% sobre sua renda líquida, totalizando R$"+df.format(imposto)+" a serem pagos!");
        }
        else if(rendaLiquida >= 5000 && rendaLiquida < 10000)
        {
            imposto = rendaLiquida * 0.1;
            System.out.println("São aplicados 10% sobre sua renda líquida, totalizando R$"+df.format(imposto)+" a serem pagos!");
        }
        else
        {
            imposto = rendaLiquida * 0.15;
            System.out.println("São aplicados 15% sobre sua renda líquida, totalizando R$"+df.format(imposto)+" a serem pagos!");   
        }
        
        readline.close();
    }

    public static void Uni4Exercise18(String[] args)
    /*Uma loja que trabalha com crediário funciona da seguinte maneira: se o pagamento ocorre até o dia do vencimento, o cliente ganha 10% de desconto 
    e é avisado que o pagamento está em dia. Se o pagamento é realizado até cinco dias após o vencimento o cliente perde o desconto, e se o pagamento atrasa mais de cinco dias,
    é cobrada uma multa de 2% por cada dia de atraso. Faça um algoritmo que leia o dia do vencimento, o dia do pagamento e o valor da prestação e calcule o valor a ser pago pelo cliente, 
    exibindo as devidas mensagens. Suponha que todo vencimento ocorre até o dia dez de cada mês e os clientes nunca deixam para pagar no mês seguinte.*/
    {
        
    }

    public static void Uni4Exercise27(String[] args)
    /*As tarifas de um estacionamento são as seguintes:
        1° e 2° hora - R$ 5,00 cada
        3° e 4° hora - R$ 7,50 cada
        5° hora e seguintes - R$ 10,00 cada
        
        O número de horas a pagar é sempre inteiro e arredondado para cima ou para baixo dependendo do tempo. Até 29 minutos depois da chegada, 
        arredonda-se para baixo e após 30 minutos arredonda-se para cima. Por exemplo, quem estacionar durante 1 hora e 15 minutos pagará por 1 hora 
        e quem estacionar por 1 hora e 35 minutos pagará por duas horas. Entretanto, se a pessoa permaneceu menos de 30 minutos, 
        também pagará por uma hora. Os horários de chegada e partida são apresentados na forma de pares de inteiros, representando horas e minutos. 
        Por exemplo, o par 12 50 representará meio dia e cinquenta. Assim, faça um algoritmo que leia os horários de chegada e de partida e 
        escreva na tela o tempo que ficou estacionado, e o preço a ser cobrado. Deverá haver validação de dados. Admite-se que a chegada e a 
        partida se dão com intervalo não superior a 24 horas, e sempre chegam e saem no mesmo dia.*/
    {
        Scanner readline = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,##0.00");

        double vlrTotal = 0;
        
        System.out.print("Insira a hora de entrada: ");
        int horaEntrada = readline.nextInt();

        System.out.print("Insira o minuto de entrada: ");
        int minutoEntrada = readline.nextInt();

        System.out.print("Insira a hora de saída: ");
        int horaSaida = readline.nextInt();

        System.out.print("Insira o minuto de saída: ");
        int minutoSaida = readline.nextInt();

        int horasPassadas = horaSaida - horaEntrada;
        int minutosPassados = minutoSaida - minutoEntrada;
        
        if(minutosPassados >= 30)
        {
            horasPassadas++;
        }

        if(horasPassadas <= 2)       
        {
            vlrTotal = 5 * horasPassadas;
        }
        else if(horasPassadas <= 4)
        {
            vlrTotal = (7.5 * (horasPassadas - 2) + 10);
        }
        else if(horasPassadas > 4)
        {
            vlrTotal = (10 * (horasPassadas - 4) + 25);
        }
        
        System.out.print("Valor total a ser pago: R$"+df.format(vlrTotal));

        readline.close();
    }

    public static void main(String[] args)
    {    
        Uni4Exercise18(args);
    }
}
