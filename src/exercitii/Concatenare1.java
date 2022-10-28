package exercitii;

public class Concatenare1 {
    public static void main(String[] args) {
        int numar = 10;
        String text = "Test";
        double numarDouble = 11.1;
        float numarFloat = 11.1f;
        boolean adevar = true;
        char c = '*';
        System.out.println("Variabile");
        System.out.println("Variabila mea are valoarea" + text);
        System.out.println("numarul meu este" + numar);
        System.out.println(numarDouble + "este numarul meu double");
        System.out.println(numarFloat + "este numarul meu float");
        System.out.println("am declarat un caracter" + c);

        System.out.println("am declarat o variabila string cu valoare %s" + text);
        System.out.println();
        System.out.printf("am declarat o variabila string cu valoare %s" + text);
        System.out.println();
        System.out.println("am declarat o variabilade tip int cu valoare %d" + numar);
        System.out.println("am declarat o variabila double cu valoare %f si un string cu valoarea %s" + numarDouble + text);
        System.out.println();
        System.out.printf("am declarat un boolean %b", adevar);
        System.out.println();

    }
}