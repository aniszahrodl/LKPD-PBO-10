package pythagorasproject;
import java.util.Scanner;
public class Sisi {
    void cariSisi(){
        Scanner input = new Scanner(System.in);
        double sisiA, sisiB, sisiC;                 
        System.out.print("Masukkan panjang salah satu sisi: ");
        sisiA = input.nextDouble();     
        System.out.print("Masukkan panjang sisi miring: ");
        sisiC =input.nextDouble();
        sisiB =hitung(sisiC,sisiA); 
        System.out.println("Panjang sisi yang lain: " + sisiB);    
    }
    
    public static double hitung(double sC,double sA){
            return Math.sqrt(Math.pow(sC, 2) - Math.pow(sA, 2));
    }
}