package Calculo;
import java.util.Scanner;
import java.util.Locale;
public class vidaSaudavel {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(Locale.US);
        System.out.println("BEM VINDO NO APP VIDA SAÚDAVEL");
        
        System.out.println("Neste aplicativo, você saberá quanto de proteina, calorias deve comer por dia - como também o seu IMC.");
        System.out.println("DETALHE: NÃO PODE USAR ',', TA NO PADRÃO AMERICANO, UTILIZE '.'");
        System.out.println("Digite o seu peso:");
        double peso = leitor.nextDouble();
        System.out.println("Digite o sua altura: ");
        double altura  = leitor.nextDouble();
        
         if(altura > 3){
            altura = altura / 100;
       } 
        System.out.println("Escolha a sua meta:");
        System.out.println("1 - Para ganhar massa muscular");
        System.out.println("2 - Para sendentarios");
        System.out.println("3 - Para ativos");
        
        int escolha = leitor.nextInt();        
        double resultadoImc = 0;
        double resultadoProteica = 0;
        double resultadoCalorico = 0;
        boolean opcaoValida = true;
        
       
        if (escolha == 1){
            resultadoProteica = 1.7 * peso;            
            resultadoImc = peso / (altura * altura);
            resultadoCalorico = peso * 40;
            
            
        }
    
        else if (escolha == 2){
             resultadoProteica = 0.8 * peso;
             resultadoImc = peso / (altura * altura);
             resultadoCalorico = peso * 25;
        
    } 
        else if (escolha == 3){
             resultadoProteica = 1.4 * peso;
             resultadoImc = peso / (altura * altura);
             resultadoCalorico = peso * 30;
        
    } 
        else {
           System.out.println("Opção inválida!");
           opcaoValida = false;
    } 
        
     
        if (opcaoValida) {
            System.out.println("--------------------------------");
            System.out.printf("Seu IMC é: %.2f %n", resultadoImc);
            System.out.println("Proteína Diária: " + resultadoProteica + "g");
            System.out.println("Calorias Diárias: " + resultadoCalorico + "kcal");
            System.out.println("--------------------------------");
        }
    }
        
}
