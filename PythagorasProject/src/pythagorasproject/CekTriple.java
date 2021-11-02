package pythagorasproject;
import java.util.Scanner;
public class CekTriple {
    void cek(){
        Scanner input = new Scanner(System.in);
        int sisiA, sisiB, sisiC;                 
        System.out.print("Masukkan panjang sisi tegak: ");
        sisiA = input.nextInt();     
        System.out.print("Masukkan panjang sisi alas: ");
        sisiB = input.nextInt();
        System.out.print("Masukkan panjang sisi miring: ");
        sisiC =input.nextInt();
    
        if(sisiC*sisiC==sisiA*sisiA + sisiB*sisiB){
            System.out.println("Merupakan Triple Pythagoras");
        }else{
            System.out.println("Bukan Triple Pythagoras");
        }       
    }
}
