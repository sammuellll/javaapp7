/*
 Dik ucgende hipotenus alan cevre hesabi
 */
package javaapplication7;

import java.util.Scanner;

public class JavaApplication7 {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Dik ucgenin dik kenarinin uzunlugunu giriniz = ");
        int x1 = scanner.nextInt();
        System.out.print("Dik ucgenin diger dik kenarinin uzunlugunu giriniz = ");
        int x2 = scanner.nextInt();
        double x3 = ((x1 * x1) + (x2 * x2)) ;
        x3 = Math.sqrt(x3);
        double a = x1 * x2 / 2;
        double p = x1 + x2 + x3 ;
        System.out.println("Dik ucgenin Hipotenusu = " + x3 );
        System.out.println("Dik ucgenin Cevresi = " + p );
        System.out.println("Dik ucgenin Alani = " + a );
        
    }
    
}
