import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class strejn {
    void main(){

        //bekeres
        Scanner scanner=new Scanner(System.in);

        System.out.println("adja meg a vezeteknevet");
        String veznev=scanner.nextLine();

        System.out.println("adja meg a keresztnevet");
        String kernev=scanner.nextLine();

        System.out.println("adja meg a szuletesi helyet");
        String szulhely=scanner.nextLine();

        System.out.println("adja meg az eletkorat");
        String eletkor=scanner.nextLine();

        //3.feladat
        String fullname=veznev+" "+kernev;
        System.out.println(fullname);

        //4.feladat
        System.out.println(fullname.toUpperCase());

        //5.feladat
        System.out.println(fullname.indexOf(" ")+1);

        //6.feladat
        System.out.println(fullname.toLowerCase()+szulhely.toLowerCase());

        //7.feladat
        System.out.println(eletkor+" Szuletesi hely: "+szulhely+" "+fullname);

        //8.feladat
        if(kernev.startsWith("A")){
            System.out.println("A keresztnev 'A' betuvel kezdodik");
        }else{
            System.out.println("A keresztnev nem 'A' betuvel kezdodik");
        }

        //9.feladat
        if(veznev.endsWith("t")){
            System.out.println("A vezeteknev 't' betuvel vegzodik");
        }else{
            System.out.println("A vezeteknev nem 't' betuvel vegzodik");
        }

        //10.feladat
        System.out.println(fullname.length());

        //11.feladat
        System.out.println(fullname.replace("i","y"));

    }

}
