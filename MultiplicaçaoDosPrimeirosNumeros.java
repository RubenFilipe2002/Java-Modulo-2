package multiplicaçao.dos.primeiros.numeros;
import java.util.Scanner;
public class MultiplicaçaoDosPrimeirosNumeros {

    
    public static void main(String[] args) {
   Scanner Ler= new Scanner(System.in);
   int num, fat=1;
   int cont=1;
   
   do{
    System.out.println("insira um número");
    num= Ler.nextInt();
    for(int i=1;i<=num;i++){
        fat=fat*i;
        
    }
    System.out.println("!"+ num+"="+ fat);
    cont++;
    
   }while(cont<2);
    }
    
}