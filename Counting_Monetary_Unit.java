

import java.util.Scanner;

public class Counting_Monetary_Unit{

    public static void main(String[] args){
        long amount,sisa;
        int seratusRibu, limaPuluhRibu, duaPuluhRibu, sepuluhRibu, limaRibu;
        Scanner input = new Scanner(System.in);
        amount = input.nextInt();
        
        seratusRibu = (int) amount / 100000;
        sisa = amount % 100000; 
        limaPuluhRibu = (int) sisa / 50000;
        sisa = sisa % 50000;
        duaPuluhRibu = (int) sisa / 20000;
        sisa = sisa % 20000;
        sepuluhRibu = (int) sisa / 10000;
        sisa = sisa % 10000;
        limaRibu = (int) sisa / 5000;

        System.out.println(amount + " terdiri dari:");
        System.out.println(seratusRibu + " Lembar 100000");
        System.out.println(limaPuluhRibu + " Lembar 50000");
        System.out.println(duaPuluhRibu + " Lembar 20000");
        System.out.println(sepuluhRibu + " Lembar 10000");
        System.out.println(limaRibu + " Lembar 5000");
        

    }
}