package exercitii;

public class Operator1 {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 10;
        System.out.printf("Primul numar este %d, iar al doilea %d",num1, num2 );

        int suma= num1 + num2;
        int dif= num1-num2;
        int produs= num1*num2;
        int cat= num1/num2;
        System.out.println("Suma este" + suma);
        System.out.println("Diferenta este" + dif);
        System.out.println("Produsul este"+ produs);
        System.out.println("Catul este"+ cat);

        int suma2= num2 + num1;
        int dif2= num2-num1;
        int produs2= num2*num1;
        int cat2= num2/num1;
        System.out.printf("Suma este de %d, diferenta d%, produsul %d si catul d%", suma2,dif2, produs2, cat2);

        int num3= 50;
        suma += num3;
        dif +=num3;
        produs= produs + num3;
        cat= cat + num3;        System.out.println();
        System.out.printf("Dupa ce am adaugat %d sumei mele, rezultatul a devenit %d\n", num3, suma);
        System.out.printf("Dupa ce am scazut %d diferentei mele, rezultatul a devenit %d\n", num3, dif);
        System.out.printf("Dupa ce am inmultit %d produsului meu, rezultatul a devenit %d\n", num3, produs);
        System.out.printf("Dupa ce am impartit %d catului meu, rezultatul a devenit %d\n", num3, cat);

        int numar=7;
        System.out.println(numar+"x 1="+ numar*1);
        System.out.println(numar+"x 2="+ numar*2);
        System.out.println(numar+"x 3="+ numar*3);
        System.out.println(numar+"x 4="+ numar*4);
        System.out.println(numar+"x 5="+ numar*5);
        System.out.println(numar+"x 6="+ numar*6);
        System.out.println(numar+"x 7="+ numar*7);
        System.out.println(numar+"x 8="+ numar*8);
        System.out.println(numar+"x 9="+ numar*9);

        int numar1= 88;
        int numar2= 67;
        boolean primulMaiMare= numar1>numar2;
        boolean alDoileaMaiMare= numar2> numar1;
        boolean suntEgale= numar1==numar2;
        System.out.println("Primul este mai mare\n"+ primulMaiMare);
        System.out.println("Al doilea este mai mare\n"+ alDoileaMaiMare);
        System.out.println("Numerele sunt egale\n"+ suntEgale);

        int numarulMeu=10;
        System.out.println("Vom incrementa numarulMeu in 3 moduri diferite");
        numarulMeu=numarulMeu+1;
        numarulMeu++;
        numarulMeu+=1;
        System.out.println("Dupa ce am incrementat numarulMeu in 3 moduri diferite,numarul nostru este egal cu"+ numarulMeu);

        int nr1= 15;
        int nr2= 100;
        boolean sumaMaimareDecatZero=(nr1+nr2)>0;
        boolean diferentaMaiMicaSauEgalaDecatZero = (nr1+ nr2)<=0;
        boolean produsulMaiMaredecat100=nr1*nr2>100;
        System.out.println("sumaMaiMaredecat0"+sumaMaimareDecatZero);
        System.out.println("diferentaMaiMicaSauEgalaDecatZero"+diferentaMaiMicaSauEgalaDecatZero);
        System.out.println("produsulMaiMaredecat100)"+ produsulMaiMaredecat100);

    }
}