//LABORATORUL 1
// Exercitiu 1--Nr. pozitive sau negative
/*
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
}*/

//------------------------------------------------------------------
//Exercitiu 2--media elem  matricei
/*

public class Main {
    public static void main(String[] args) {
        int [] nr = new int[]{10,20,30,40,-15};

        int suma  = 0;

        for(int i = 0; i < nr.length; ++i){
            suma  += nr[i];
        }
        double media = suma / nr.length;

        System.out.println("Media elementelor matrice este: " + media);
    }
}*/
//-----------------------------------------------------------------------
//Exercitiu 4 --concept de incapsulare-Animal

public class Main{

    public static void main(String[] args) {
        Animal pisica = new Animal("Azul","British Shorthair",3);

        System.out.println("Nume: " + pisica.getNume());
        System.out.println("Specie: " + pisica.getSpecie());
        System.out.println("Varsta: " + pisica.getVarsta());

        pisica.setNume("Luna");
        pisica.setSpecie("Siameza");
        pisica.setVarsta(5);

        System.out.println("Nume: " + pisica.getNume());
        System.out.println("Specie: " + pisica.getSpecie());
        System.out.println("Varsta: " + pisica.getVarsta());
    }
}

