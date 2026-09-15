import java.util.Scanner;

public class Operatorok {
    static void main(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("adjon meg egy stringet");
        String szoveg=scanner.nextLine();

        System.out.println("adjon meg egy karaktert");
        String char1=scanner.nextLine();

        System.out.println("adjon meg egy karaktert");
        String char2=scanner.nextLine();

        System.out.println("adjon meg egy intet");
        int int1=scanner.nextInt();

        System.out.println("adjon meg egy intet");
        int int2=scanner.nextInt();

        System.out.println("adjon meg egy doublet");
        double dou1=scanner.nextDouble();

        System.out.println("adjon meg egy doublet");
        double dou2=scanner.nextDouble();

        String osszefuz=szoveg+char1+char2;
        System.out.println(osszefuz);

        int osztas=int1/int2;
        System.out.println(osztas);

        double osszead=dou1+dou2;
        System.out.println(osszead);

        double kivonas=int1-dou1;
        System.out.println(kivonas);

        double szorzas=int2*dou2;
        System.out.println(szorzas);


    }
}
