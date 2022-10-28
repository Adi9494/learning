package exercitii;

import java.util.Scanner;

public class Citire {

    public static void main(String[] args) {
        Scanner cititor = new Scanner(System.in);

        System.out.println("Introduceti textul dorit");
        String textIntrodus = cititor.nextLine();
        System.out.println("Am introdus textul"+ textIntrodus);
        System.out.println("Introduceti numarul dorit");
        int numarIntrodus = cititor.nextInt();
        System.out.println("Ai introdus numarul"+ numarIntrodus);
        System.out.println( "Introduceti un numar double");
        double doubleIntrodus= cititor.nextDouble();
        System.out.println("Ati introdus numarul double"+ doubleIntrodus);
        System.out.println("Introduceti un numar float");
        float floatIntrodus= cititor.nextFloat();
        System.out.println("Am introdus numarul float"+ floatIntrodus);
        System.out.println("Introduceti un numar long");
        long longIntrodus= cititor.nextLong();
        System.out.println("Am introdus numaru long"+ longIntrodus);
        System.out.println("Introduceti un boolean");
        boolean boolIntrodus= cititor.hasNextBoolean();
        System.out.println("Am introdus un boolean"+ boolIntrodus);
        System.out.println("Introduceti caracterul dorit");
        char caracterIntrodus=cititor.next().charAt(0);

    }
}