import java.util.Scanner;
 
 
public class App {
 

 		Scanner scan = new Scanner(System.in);
        boolean repetir = true;
        int num1, num2, menu;
        double resultado;

    public static void main(String[] args) {
        while(repetir==true){
            system.out.println("Introduce el primer número: ");
            num1 = scan.nextInt();
            sysout.println("Introduce el segundo número: ");
            num2 = scan.nextInt();

            system.out.println("Dime que operacion deseas realizar: sumar(1), restar(2), multiplicar(3), dividir(4)");
            menu = scan.nextInt();
            switch (menu){
                case 1:
                    system.out.println("El resultado de sumar es:" + sumar(num1, num2));
                    break;
                case 2:
                    system.out.println("El resultado de restar es:" + restar(num1, num2));
                    break;
                case 3:
                    system.out.println("El resultado de multiplicar es:" + multiplicar(num1, num2));
                    break;
                case 4:
                    system.out.println("El resultado de dividir es:" + dividir(num1, num2));
                    break;
            }
            system.out.println("El resultado es: " + resultado);
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