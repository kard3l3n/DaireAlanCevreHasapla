package dairealancevrehesapla;
import java.util.Scanner;
import java.math.*;

public class DaireAlanCevreHesapla {
    public static void main(String[] args) {
        double alan, cevre, pi=3.14;
        
        Scanner input=new Scanner(System.in);
        System.out.println("Dairenin yarıçapını giriniz");
        double yaricap=input.nextDouble();
        
        alan=pi*Math.pow(yaricap,2);
        cevre=2*pi*yaricap;
        
        System.out.println("Alan:"+alan);
        System.out.println("Çevre:"+cevre);
        
        
    }
    
}
