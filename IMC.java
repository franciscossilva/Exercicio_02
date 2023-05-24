import java.util.Scanner;
public class IMC
{public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("digite a altura em metros:");
    double altura = scanner.nextDouble();
    System.out.print("digite seu peso");
    double peso = scanner.nextDouble();
    double IMC =peso/(altura*altura);
    System.out.println("seu IMC é : " +IMC);{
}
