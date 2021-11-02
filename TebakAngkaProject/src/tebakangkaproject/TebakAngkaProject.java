package tebakangkaproject;
import java.util.Scanner;
public class TebakAngkaProject {
    public static void main(String[] args) {
        int random, tebak;
        random = (int)(Math.random() * 100);
        System.out.println("");
        System.out.println("Halo fren! aku menyimpan satu angka, coba tebak angka berapa antara 1-100");
        System.out.println("");
        Scanner masukan = new Scanner (System.in);
        
        do {
            System.out.print("Hayo berapa hayoo????");
            tebak = masukan.nextInt();

            if (tebak > random) {
                System.out.println("Waduh fren, tebakanmu terlalu BESAR");
            } else if (tebak < random) {
                System.out.println("Waduh fren, tebakanmu terlalu KECIL");
            } else {
                System.out.print("Wihhh JOSS!!! tebakanmu BENAR!!");
            }
        } while (tebak != random);
    }
}