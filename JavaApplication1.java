package javaapplication1;
import java.util.Scanner;
public class JavaApplication1 {
private static Scanner lerS;

public static void main(String[] args) throws Exception {
 int N,FAT=1;
 System.out.print("Digite um inteiro positivo inferior a 32:");
 lerS = new Scanner (System.in);
 N= lerS.nextInt ();
 for(int M=N; M>=1;M--)
FAT*=M;
System.out.printf("%d!=%d#",N,FAT);
    }
    
}