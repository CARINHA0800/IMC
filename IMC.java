public class IMC {
    Double resultado;
    Double imc;
    Double altura;
    Double peso;
 void imc(){
    Double resultado;
    resultado = altura *altura;
    Double imc= peso/resultado;
    System.out.printf("seu imc é: %.2f\n",imc);
 }
   void status(){
    if (imc <= 18.5) {
        System.out.println("Sua Classificação é de Magreza\n");
    } else if (imc >= 18.6 && imc < 24.9){
        System.out.println("Sua Classificação Está Dentro do Normal\n");
    } else if (imc >= 25.0 && imc <= 29.9) {
        System.out.println("Sua Classificação é de Sobrepeso I\n");
    } else if (imc >= 30.0 && imc < 40) {
        System.out.println("Sua Classificação é Obesidade II\n");
    } else if (imc >= 40.0 ) {
        System.out.println("Sua Classificação é Obesidade Grave III\n");
    } 
   }
 }
  



