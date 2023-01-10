import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int matematik,fizik,turkce,kimya,muzik;
        double ort;
        Scanner input=new Scanner(System.in);

        System.out.println("matematik notunuzu giriniz");
        matematik=input.nextInt();
        if (matematik<0 || matematik>100) { matematik=0; }

        System.out.println("fizik notunuzu giriniz");
        fizik=input.nextInt();
        if (fizik<0 || fizik>100) { fizik=0; }

        System.out.println("turkce notunuzu giriniz");
        turkce=input.nextInt();
        if (turkce<0 || turkce>100) { turkce=0; }

        System.out.println("kimya notunuzu giriniz");
        kimya=input.nextInt();
        if (kimya<0 || kimya>100) { kimya=0; }

        System.out.println("muzik notunuzu giriniz");
        muzik=input.nextInt();
        if (muzik<0 || muzik>100) { muzik=0; }
        ort=(matematik+fizik+kimya+turkce+muzik)/5;

        if (ort>55){System.out.println("Sınıfı geçti ortalaması  :"+ ort);}
        else {
            System.out.println("sınıfta kaldı ortalaması  :"+ort);
        }
    }
}