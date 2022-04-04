import java.util.Scanner;

public class Main {	
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double valor = input.nextDouble();
        
        //separando a parte inteira da fracionada (o que seriam as notas)
        int notas = (int) valor;
        
        //pegando a parte fracionada (o que seriam as moedas)
        int moedas = (int) ((valor - notas) * 100);
        
        /**
         * Retirando as notas
         */
        //retirando as notas de R$100.00
        int n100 = notas / 100;
        notas -= n100 * 100;
        
        //retirando as notas de R$50.00
        int n50 = notas / 50;
        notas -= n50 * 50;
        
        //retirando as notas de R$20.00
        int n20 = notas / 20;
        notas -= n20 * 20;
        
        //retirando as notas de R$10.00
        int n10 = notas / 10;
        notas -= n10 * 10;
        
        //retirando as notas de R$5.00
        int n5 = notas / 5;
        notas -= n5 * 5;
        
        //retirando as notas de R$2.00
        int n2 = notas / 2;
        notas -= n2 * 2;
        
        /**
         * Retirando as moedas
         */
        //As moedas de R$1.00 são o que sobrou das notas
        int m1 = notas;
        notas -= m1 * 1;
        
        //Separando as moedas de R$0.5
        int m50 = moedas / 50;
        moedas -= m50 * 50;
        
        //Separando as moedas de R$0.25
        int m25 = moedas / 25;
        moedas -= m25 * 25;
        
        //Separando as moedas de R$0.10
        int m10 = moedas / 10;
        moedas -= m10 * 10;
        
        //Separando as moedas de R$0.05
        int m05 = moedas / 5;
        moedas -= m05 * 5;
        
        //As moedas de R$0.01 são o que sobrou
        int moedas01 = moedas;
        
        
        /**
         * Executando a impressão conforme informado
         */
        System.out.println("NOTAS:");
        System.out.println(n100 + " nota(s) de R$ 100.00");
        System.out.println(n50 + " nota(s) de R$ 50.00");
        System.out.println(n20 + " nota(s) de R$ 20.00");
        System.out.println(n10 + " nota(s) de R$ 10.00");
        System.out.println(n5 + " nota(s) de R$ 5.00");
        System.out.println(n2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(m1 + " moeda(s) de R$ 1.00");
        System.out.println(m50 + " moeda(s) de R$ 0.50");
        System.out.println(m25 + " moeda(s) de R$ 0.25");
        System.out.println(m10 + " moeda(s) de R$ 0.10");
        System.out.println(m05 + " moeda(s) de R$ 0.05");
        System.out.println(m1 + " moeda(s) de R$ 0.01");
    }
	
}
