//LABORATORUL 1 EX 1--Nr. pozitive sau negative

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduceti un numar de la tastatura:");

        int nr = sc.nextInt();
        if(nr > 0){
            System.out.println("Numarul este pozitiv.");
        } else if(nr < 0){
            System.out.println("Numarul este negativ.");
        }else{
            System.out.println("Numarul nu este nici pozitiv,nici negativ.");
        }

    }
}
