import java.util.Scanner;
 
 
public class App {
public static void main(String[] args) { 

 		Scanner scan = new Scanner(System.in);
        boolean repetir = true;
        int num1, num2, menu;
        double resultado;

    
        while(repetir==true){
            System.out.println("Introduce el primer número: ");
            num1 = scan.nextInt();
            System.out.println("Introduce el segundo número: ");
            num2 = scan.nextInt();

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
            }
            System.out.println("El resultado es: " + resultado);
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