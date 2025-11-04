import java.util.Scanner;

public class Ex1 {

    public static double multiplca (double a, double b)
 {
    return a * b;
 
 }    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double num1, num2;

        System.out.println("Dime un primero número.");
        num1 = sc.nextDouble();
        System.out.println("Dime un segundo número");
        num2 = sc.nextDouble();

        double resultado = multiplca(num1, num2);

        System.out.println("El resultado de la multiplicación es " + resultado);
}

}
