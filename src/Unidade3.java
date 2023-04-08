import java.util.Scanner;
import java.text.DecimalFormat; 
public class Unidade3 {

    public static void Uni3Exercise1(String[] args)
    // Uma imobiliária vende apenas terrenos retangulares. Faça um programa para ler as dimensões de um terreno e depois exibir a área do terreno.
    {
        Scanner readline = new Scanner(System.in); 

        System.out.print("Insira o valor da base do terreno: ");
        float baseTerreno = readline.nextFloat();

        System.out.print("Insira o valor da altura do terreno: ");
        float alturaTerreno = readline.nextFloat();

        float area = baseTerreno * alturaTerreno;
        System.out.print("A area do terreno é: "+area+"m²");
        readline.close();
    }

    public static void Uni3Exercise2(String[] args)
    /*Uma loja de calçados está concedendo 12% de desconto nos produtos. Escreva um programa para calcular e exibir o valor de desconto a 
    ser dado num par de sapatos e quanto deve custar o produto com o desconto. 
    O preço do par de sapatos deve ser informado pelo usuário. Como resultado, o programa deverá exibir as seguintes mensagens:
    
    O valor do desconto é de R$ xxx
    O preço do par de sapatos com desconto é R$ xxx */
    {
        Scanner readline = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Informe o preço do par de sapatos");
        double preco = readline.nextDouble();

        double vlrDesconto = preco * 12 / 100;
        double precoFinal = preco - vlrDesconto;

        System.out.println("O valor do desconto é de R$:" + df.format(vlrDesconto));
        System.out.println("O preço do par de sapatos com desconto é R$:" + df.format(precoFinal));
        
        readline.close();
    }

    public static void Uni3Exercise3(String[] args)
    /*Um motorista deseja abastecer seu tanque de combustível. Escreva um programa para ler o preço do litro da gasolina 
    e o valor do pagamento e exibir quantos litros ele conseguiu colocar no tanque. */
    {
        Scanner readline = new Scanner(System.in);

        System.out.print("Insira o preço do litro da gasolina em R$: ");
        float vlrGasolina = readline.nextFloat();

        System.out.print("Insira valor pago em R$: ");
        float vlrGasto = readline.nextFloat();

        float litros = vlrGasto / vlrGasolina;
        System.out.print("A quantidade de litros abastecido é de: "+litros);

        readline.close();
    }
    
    public static void Uni3Exercise4(String[] args)
    /*Faça um programa para ler três notas de um aluno em uma disciplina e imprimira sua 
    média ponderada (as notas tem pesos respectivos de 5, 3 e 2). */
    {
        Scanner readline = new Scanner(System.in);
            
        System.out.println("Informe a nota 1 (peso 5)");
        int nota1 = readline.nextInt();

        System.out.println("Informe a nota 2 (peso 3)");
        int nota2 = readline.nextInt();

        System.out.println("Informe a nota 3 (peso 2)");
        int nota3 = readline.nextInt();

        double media = ((nota1 * 5) + (nota2 * 3) + (nota3 * 2)) / 10 ;

        System.out.println("A média ponderada é: " + (media));
        
        readline.close();
    }

    public static void Uni3Exercise5(String[] args)
    /*Uma granja possui um controle automatizado de cada frango da sua produção. No pé direito do frango há um anel 
    com um chip de identificação; no pé esquerdo são dois anéis para indicar o tipo de alimento que ele deve consumir. 
    Sabendo que o anel com chip custa R$ 4,00 e o anel de alimento custa R$ 3,50, faça um programa para calcular 
    o gasto total da granja para marcar todos os seus frangos. */
    {
        Scanner readline = new Scanner(System.in);
       
        System.out.print("Insira a quantidade de frangos: ");
        float qtdFrangos = readline.nextFloat();

        float totalGasto = qtdFrangos * 11;
        
        System.out.print("o custo para identificação dos frangos foi de: R$" +totalGasto);

        readline.close();
    }

    public static void Uni3Exercise6(String[] args)
    /*Um restaurante cobra R$ 25,00 por cada quilo de refeição. Escreva um programa que leia o peso do prato montado pelo cliente 
    (em quilos) e imprima o valor a pagar. O peso do prato é de 750 gramas. */
    {
        Scanner readline = new Scanner(System.in);

        System.out.print("Insira o peso em kilos:");

        float pesoTotal = readline.nextFloat();

        float valorTotal = (pesoTotal - 0.750f) * 25;

        System.out.print("valor a pagar: "+valorTotal);

        readline.close();
    }

    public static void Uni3Exercise7(String[] args)
    /*Uma fábrica de refrigerantes vende seu produto em três formatos: lata de 350 ml, garrafa de 600 ml e garrafa de 2 litros. 
    Se um comerciante compra uma determinada quantidade de cada formato, faça um programa para calcular quantos litros de 
    refrigerante ele comprou. */
    {
        Scanner readline = new Scanner(System.in);

        System.out.println("Informe a quantidade de latas 350ml compradas");
        int latas = readline.nextInt();

        System.out.println("Informe a quantidade de garrafas 600ml compradas");
        int garrafas = readline.nextInt();

        System.out.println("Informe a quantidade de garrafas 2L compradas");
        int garrafas2l = readline.nextInt();

        double litros = ((latas * 0.35) + (garrafas * 0.6) + (garrafas2l * 2)) ;

        System.out.println("A quantidade de litros comprada é: " + (litros));
        
        readline.close();
    }

    public static void Uni3Exercise8(String[] args)
    /*Uma pessoa foi até uma casa de câmbio trocar dólares por reais. Para isto ela entregou um valor em dólares para o atendente. 
    Considerando que o atendente tem a cotação do dólar, descreva um programa para calcular quantos reais o 
    atendente deve devolverpara a pessoa. */
    {
        Scanner readline = new Scanner(System.in);

        System.out.println("Informe a cotação do dolar atual");
        int vlrDolar = readline.nextInt();

        System.out.println("Informe a quantidade de dolares");
        int qtdDolar = readline.nextInt();

        System.out.println("O atendente tera que devolver R$: "+vlrDolar * qtdDolar);

        readline.close();
    }

    public static void Uni3Exercise9(String[] args)
    /*Descreva um programa que calcule o volume de uma lata de óleo. Fórmula: Volume = 3,14 raio² * altura */
    {
        Scanner readline = new Scanner(System.in);

        System.out.println("Informe o valor do raio");
        Double raio = readline.nextDouble();

        System.out.println("Informe o valor da altura");
        Double altura = readline.nextDouble();

        System.out.println("O volume é = "+ 3.14 * (raio * raio) * altura +"L") ;
        
        readline.close();
    }

    public static void Uni3Exercise10(String[] args)
    /*Descreva um programa que leia o comprimento dos catetos de um triângulo retângulo e calcule o comprimento da hipotenusa. 
    Fórmula: Hipotenusa² = cateto1² + cateto2²*/
    {
        Scanner readline = new Scanner(System.in);
       
        System.out.println("Informe o valor do cateto 1");
        Double cateto1 = readline.nextDouble();

        System.out.println("Informe o valor da cateto 2");
        Double cateto2 = readline.nextDouble();

        Double hipotenusa = ((cateto1 * cateto1) + (cateto2 * cateto2));
        hipotenusa = hipotenusa * hipotenusa;

        System.out.println("O valor da Hipotenusa é de: " + hipotenusa) ;

        readline.close();
    }

    public static void Uni3Exercise11(String[] args)
    /*Descreva um programa que dado uma temperatura em °C informe o seu valor em °F. Fórmula:
    °F = (9/5) °C + 32*/
    {
        Scanner readline = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0");   

        System.out.println("Insira a temperatura em graus Celsius: ");
        double grausCelsius = readline.nextDouble();

        double grausFarenheit = (grausCelsius * 1.8) + 32;

        System.out.println("A temperatura de "+df.format(grausCelsius)+"°C, em Farenheit é de: "+df.format(grausFarenheit)+"ºF");

        readline.close();
    }

    public static void Uni3Exercise12(String[] args)
    /*Uma empresa tem para um funcionário os seguintes dados: o nome, o número de horas trabalhadas mensais e o número de dependentes. 
    A empresa paga R$ 10,00 por hora (valor para cálculo do salário trabalho) e R$ 60,00 por dependente (valor para cálculo do salário família) 
    e são feitos descontos de 8,5% sobre o salário trabalho para o INSS e de 5% sobre o salário trabalho para o imposto de renda. Descreva um programa que 
    informe o nome, o salário bruto e o salário líquido do funcionário.*/
    {
        Scanner readline = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,##0.00");   

        System.out.println("Informe o nome do funcionário: ");
        String nomeFuncionario = readline.next();

        System.out.println("Informe a quantidade de horas trabalhadas no mês: ");
        int horasMes = readline.nextInt();

        System.out.println("Informe a quantidade de dependentes que o funcionário possui: ");
        int qtdDependentes = readline.nextInt();

        double salarioBruto = (horasMes * 10) + (qtdDependentes * 60);
        
        double salarioLiquido = ((horasMes * 10) * 0.865) + (qtdDependentes * 60);

        System.out.println("Funcionário: "+nomeFuncionario+"\nSalário bruto: R$"+df.format(salarioBruto)+"\nSalário liquido: R$"+df.format(salarioLiquido)+"");

        readline.close();
    }

    public static void Uni3Exercise13(String[] args)
    /*Numa loja de materiais de construção, um azulejo estampado custa R$ 12,50. Faça um programa para ler o comprimento e altura de uma parede (em metros), 
    e depois escrever o valor gasto com a compra de azulejos. Considere que um metro quadrado é formado por 9 azulejos.*/
    {
        Scanner readline = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,##0.00");   

        System.out.println("Informe o comprimento da parede: ");
        double comprimento = readline.nextDouble();

        System.out.println("Informe a altura da parede: ");
        double altura = readline.nextDouble();

        double totalGasto = (comprimento * altura) * (9 * 12.5);

        System.out.println("O total gasto com a compra de azuleijos é de: R$"+df.format(totalGasto));

        readline.close();
    }

    public static void Uni3Exercise14(String[] args)
    /*Descreva um programa que a partir da distância percorrida e o do tempo gasto por um motorista durante uma viagem de final de semana, 
    calcule a velocidade média e a quantidade de combustível gasto na viagem, sabendo que o automóvel faz 12 km por litro.*/
    {
        Scanner readline = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0"); 

        System.out.println("Informe a distância percorrida (em Km): ");
        double distanciaKm = readline.nextDouble();

        System.out.println("Informe o tempo que durou a viagem (em Horas): ");
        double tempoHrs = readline.nextDouble();

        double velocidadeMedia = distanciaKm / tempoHrs;

        double combustivelGasto = distanciaKm / 12;

        System.out.println("Velocidade média da viagem: "+df.format(velocidadeMedia)+"km/h\nQuantidade de combustível gasto na viagem: "+df.format(combustivelGasto)+" litros");

        readline.close();
    }

    public static void Uni3Exercise15(String[] args)
    /*Construa um programa para ler um número inteiro (assuma até 3 dígitos) e imprima a saída da seguinte forma:
     X centena(s)  Y dezena(s) K unidade(s)  
     Exemplo, se for submetido o número 384, o programa deverá exibir:
     3 centena(s)  8 dezena(s) 4 unidade(s) 
    */
    {
        Scanner readline = new Scanner(System.in);

        System.out.println("Informe um número de 3 dígitos: ");
        int numero = readline.nextInt();

        int centenas = numero / 100;
        numero %= 100;

        int dezenas = numero / 10;
        numero %= 10;

        int unidades = numero / 1;
        numero %= 1;

        System.out.println(centenas+" Centena(s) "+dezenas+" Dezena(s) "+unidades+" Unidade(s)");

        readline.close();
    }

    public static void Uni3Exercise16(String[] args)
    /*Suponha que um caixa disponha apenas de notas de 100, 10 e 1 reais. Considerando que alguém está pagando uma compra, faça um programa que determine e
     escreva o número mínimo de notas que o caixa deve fornecer como troco. Escreva também o número de cada tipo de nota a ser fornecido como troco. 
     Suponha que o sistema monetário não utilize centavos.
    */
    {
        Scanner readline = new Scanner(System.in);

        System.out.println("Informe a quantidade de troco a ser retornado: ");
        int troco = readline.nextInt();

        int centenas = troco / 100;
        troco %= 100;

        int dezenas = troco / 10;
        troco %= 10;

        int unidades = troco / 1;
        troco %= 1;

        System.out.println(+centenas+" Nota(s) de cem\n"+dezenas+" Nota(s) de dez\n"+unidades+" Nota(s) de um");

        readline.close();
    }
    public static void main(String[] args)
    {    
        Uni3Exercise16(args);
    }
}
