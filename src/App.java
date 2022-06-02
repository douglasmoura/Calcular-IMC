import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe seu nome:");
        String nome = scanner.nextLine();
        System.out.println("Informe seu peso: utilize a vírgula");
        double peso = scanner.nextDouble();
        System.out.println("Informe sua altura: utilize a vírgula");
        double altura = scanner.nextDouble();
        
        double calculoIMC = Imc(peso, altura);

        String resultado = "";
           
            if (calculoIMC < 18.5) {
                resultado = "você está abaixo do peso";
                   
            }else if (calculoIMC >= 18.5 && calculoIMC <= 24.9) {
                resultado = "você está com peso normal";
                   
            }else if (calculoIMC >= 25 && calculoIMC <= 29.9) {
                resultado = "você está com sobrepeso";
                   
            }else if (calculoIMC >= 30 && calculoIMC <= 34.9) {
                resultado = "você está com obsidade Grau I";
                  
            }else if (calculoIMC >= 35 && calculoIMC <= 39.9) {
                resultado = "você está com obsidade Grau II";
                   
            }else if (calculoIMC >= 40) {
                resultado = "você está com obsidade Grau III";
                   
            }
               System.out.println("Seu nome: "+nome);
               System.out.println("Seu peso: "+peso);
               System.out.println("Sua altura: "+altura);
               System.out.printf("Seu IMC é %.2f\n",calculoIMC);
               System.out.println(resultado);
   
        scanner.close();
    }

    public static double Imc(double peso, double altura) {
        return peso / (altura * altura);
    }
}

