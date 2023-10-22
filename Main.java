import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        IMC calc = new IMC();
        

        System.out.println("digite a sua altura");
        calc.altura = scan.nextDouble();
        

        System.out.println("digite o seu peso");
        calc.peso = scan.nextDouble();
        
      calc.imc();
      calc.status();
      scan.close();
    
   } 
}
