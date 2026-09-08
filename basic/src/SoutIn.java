import java.util.Scanner;

public class SoutIn {
   static void main(){
       String msg = "I'm happy today.";
       int a = 150;
       int o = 0226;
       int h = 0x96;
       double d = 10;
       System.out.println(msg);
       System.out.println(a);
       System.out.println(o);
       System.out.println(h);
       System.out.println(d);
       Scanner scanner = new Scanner(System.in);

       System.out.print("kedvenc zene: ");
       String zene = scanner.nextLine();

       System.out.print("kedvenc étel: ");
       String etel = scanner.nextLine();

       System.out.print("kedvenc hobbi: ");
       String hobbi = scanner.nextLine();

       System.out.print("kedvenc film: ");
       String film = scanner.nextLine();

       System.out.print("kedvenc uticel: ");
       String uticel = scanner.nextLine();

       System.out.println("kedvenc zenéd: "+zene);
       System.out.println("kedvenc ételed: "+etel);
       System.out.println("kedvenc hobbid: "+hobbi);
       System.out.println("kedvenc filmed: "+film);
       System.out.println("kedvenc uticélod: "+uticel);





   }

}
