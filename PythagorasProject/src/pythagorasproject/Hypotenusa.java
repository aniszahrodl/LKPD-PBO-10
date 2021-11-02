package pythagorasproject;
import java.util.Scanner;
public class Hypotenusa {
    void hypotenus(){
        Scanner input = new Scanner(System.in);
        double sisiA, sisiB, sisiC;                 
        System.out.print("Masukkan panjang sisi tegak: ");
        sisiA = input.nextDouble();     
        System.out.print("Masukkan panjang sisi alas: ");
        sisiB = input.nextDouble();      
        sisiC =hitungC(sisiA,sisiB); 
        System.out.println("Panjang sisi miring adalah: " + sisiC);
    }
    
    public static double hitungC(double sA,double sB){
	return Math.sqrt(Math.pow(sA, 2) + Math.pow(sB, 2));
    }    
}