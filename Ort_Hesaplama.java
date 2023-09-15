// 1 . ADIM
import java.util.Scanner;
public class Ort_Hesaplama {

    public static void main(String[] args) {
        

        // 2.ADIM ders notlarının tutulduğu değişkenler
        int  mat, fizik,turkce,muzik,beden;
        
        // 3.ADIM kullanıcıdan veri alımı     
        Scanner input = new Scanner(System.in);

        // 4.ADIM: Alınan verilerin değişkenlere aktarılması 

        System.out.println("MATEMATİK NOTUNUZU GİRİNİZ : ");
        mat = input.nextInt();

        System.out.println("FİZİK NOTUNUZU GİRİNİZ : ");
        fizik = input.nextInt();

        System.out.println("TÜRKÇE NOTUNUZU GİRİNİZ : ");
        turkce = input.nextInt();

        System.out.println("MÜZİK NOTUNUZU GİRİNİZ : ");
        muzik = input.nextInt();

        System.out.println("BEDEN NOTUNUZU GİRİNİZ : ");
        beden = input.nextInt();

        int toplam =(mat + fizik + turkce + muzik + beden);

        double ort = toplam / 5.0;

        // 5.ADIM BOOLEAN veri tipini kullanarak ortlama kontrolü 

        System.out.println("DÖNEM SONU ORTALAMANIZ :" + ort);
        
        boolean gecmedurumu= (ort >=50.0);
        System.out.println("SINIFI GEÇME DURUMU : "  + gecmedurumu);

        
        

    }
}