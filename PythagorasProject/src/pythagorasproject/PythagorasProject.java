package pythagorasproject;
import java.util.Scanner;
public class PythagorasProject {
    public static void main(String[] args) {
        String ulang = "y";
        while (ulang.equals("y")){
        System.out.println(" ");
        Scanner input = new Scanner(System.in);
        System.out.println("--------- PROJECT PYTHAGORAS ---------");
        System.out.println(" ");
        System.out.println("1. Cek Triple Pythagoras");
        System.out.println("2. Cari Panjang Sisi Miring Segitiga");
        System.out.println("3. Cari Panjag Sisi Segitiga");
        System.out.println("4. Keluar");
        System.out.println(" ");
        System.out.print("Pilihan [1/2/3/4] = ");
        int pilih = input.nextInt();
        System.out.println(" ");
        switch (pilih) {
            case 1:{
                CekTriple cek=new CekTriple();
                cek.cek();
                break;
            }
            case 2:{
                Hypotenusa h=new Hypotenusa();
                h.hypotenus();
                break;
            }
             case 3:{
                Sisi s=new Sisi();
                s.cariSisi();
                break;
             }
            case 4:{
                System.exit(0);
            }
                break;
        }
        
        System.out.println(" ");
        System.out.print("Apakah anda ingin mengulang (y/t)? ");
            ulang = input.next();
        }
    }
}