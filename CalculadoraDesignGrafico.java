package calculadoradesigngrafico;
import java.util.Scanner;

public class CalculadoraDesignGrafico 
{
    public static double calculaLucro(double valor, double arte)
    {
        double conducao = 10.0, total;
        total = valor - arte - conducao;
        return total;
    }
    
    public static double calculaPorcentagem(double valor)
    {
        double total;
        total = valor * 0.2;
        return total;  
    }
    
    public static double calcula4x0(double arte)
    {
        double valor = 30.0, conducao = 10.0, total;
        total = valor + arte + calculaPorcentagem(arte) + conducao;
        return total;
    }
    
    public static double calcula4x1(double arte)
    {
        double valor = 35.0, conducao = 10.0, total;
        total = valor + arte + calculaPorcentagem(arte) + conducao;
        return total;
    }
    
    public static double calcula4x4(double arte)
    {
        double valor = 60.0, conducao = 10.0, total;
        total = valor + arte + calculaPorcentagem(arte) + conducao;
        return total;
    }
    
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        double valorArte, lucro, total;
        int tipo;
        
        System.out.println("::: CALCULADORA DESIGN GRÁFICO :::\n");
        System.out.println("Olá, Leticia!");
        
        System.out.print("Digite o valor da arte: R$ ");
        valorArte = entrada.nextDouble();
        
        System.out.print("Escolha o tipo da arte: 4x");
        tipo = entrada.nextInt();
        
        switch(tipo)
        {
            case 0: total = calcula4x0(valorArte);
            System.out.printf("\nO valor a ser cobrado é R$ %2.2f.\n", total);
            lucro = calculaLucro(total, valorArte);
            System.out.printf("Seu lucro será de R$ %2.2f.\n\n", lucro);
            break;
            
            case 1: total = calcula4x1(valorArte);
            System.out.printf("\nO valor a ser cobrado é R$ %2.2f.\n\n", total);
            lucro = calculaLucro(total, valorArte);
            System.out.printf("Seu lucro será de R$ %2.2f.\n\n", lucro);
            break;
            
            case 4: total = calcula4x4(valorArte);
            System.out.printf("\nO valor a ser cobrado é R$ %2.2f.\n\n", total);
            lucro = calculaLucro(total,valorArte);
            System.out.printf("Seu lucro será de R$ 2.2f.\n\n", lucro);
            break;
            
            default: System.out.println("Opção inválida!\n\n");
        }
    }
}