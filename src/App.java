import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("ola mundo dnv");
        
        int base;
        int altura;

     Scanner sc = new Scanner(System.in);

     System.out.println("digite o valor da base");

     base =  sc.nextInt();

     System.out.println("digite o valor da altura");
     altura = sc.nextInt();
     
     System.out.println("valor da area");
     
     int area = (base * altura);
     System.out.println(area);
     sc.close();
    }
}
