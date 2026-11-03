import java.util.Scanner;
 
 
public class App {
public static void main(String[] args) { 

 		Scanner scan = new Scanner(System.in);
        boolean repetir = true;
        double num1, num2;
        int menu;
    
        while(repetir==true){
            System.out.println("Introduce el primer número: ");
            num1 = scan.nextDouble();
            System.out.println("Introduce el segundo número: ");
            num2 = scan.nextDouble();

            System.out.println("Dime que operacion deseas realizar: sumar(1), restar(2), multiplicar(3), dividir(4)");
            menu = scan.nextInt();
            switch (menu){
                case 1:
                    System.out.println("El resultado de sumar es:" + sumar(num1, num2));
                    break;
                case 2:
                    System.out.println("El resultado de restar es:" + restar(num1, num2));
                    break;
                case 3:
                    System.out.println("El resultado de multiplicar es:" + multiplicar(num1, num2));
                    break;
                case 4:
                    System.out.println("El resultado de dividir es:" + dividir(num1, num2));
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

 
    public static double sumar(double primerNumero, double segundoNumero) {

        // Parte de Fran
        double resultado = 0;
        resultado = primerNumero + segundoNumero;
        return resultado;
    }
 
 
    public static double restar(double primerNumero, double segundoNumero) {
        // hola mi parte soy adri

        double resultado = 0;
        resultado = primerNumero - segundoNumero;
        return resultado;
    }
 
 
    public static double multiplicar(double primerNumero, double segundoNumero) {
        //Parte de Fran
        double resultado = 0;
        resultado = primerNumero * segundoNumero;
        return resultado;
    }
 
 
    public static double dividir(double primerNumero, double segundoNumero) {
        // hola mi parte soy adri
        double resultado = 0;
        resultado = primerNumero / segundoNumero;
        return resultado;
    }
}