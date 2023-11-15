

import java.util.Scanner;

public class LeapDay{

    public static void main(String[] args){

        int hari;
        int next;
        int nextDay;

        Scanner input = new Scanner(System.in);
        hari = input.nextInt();
        next = input.nextInt();
        nextDay = (hari + next) % 7;

        System.out.print("Hari ini hari ");
        switch(hari){
            case 0: System.out.print("Minggu"); break;
            case 1: System.out.print("Senin"); break;
            case 2: System.out.print("Selasa"); break;
            case 3: System.out.print("Rabu"); break;
            case 4: System.out.print("Kamis"); break;
            case 5: System.out.print("Jumat"); break;
            case 6: System.out.print("Sabtu"); break;
            default : System.out.print("Tidak Valid");
        }
        
        System.out.print(", " + next + " hari selanjutnya adalah hari ");
        
        switch(nextDay){
            case 0: System.out.println("Minggu"); break;
            case 1: System.out.println("Senin"); break;
            case 2: System.out.println("Selasa"); break;
            case 3: System.out.println("Rabu"); break;
            case 4: System.out.println("Kamis"); break;
            case 5: System.out.println("Jumat"); break;
            case 6: System.out.println("Sabtu"); break;
            default : System.out.println("Tidak Valid");
        }
    }
}