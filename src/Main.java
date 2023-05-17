import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in,"Windows-1250");
        SeznamPojistenych seznamPojistenych = new SeznamPojistenych();

        boolean start = true;

        while (start) {

            System.out.println("----------------------------------------");
            System.out.println("EVIDENCE POJIŠTĚNÝCH");
            System.out.println("----------------------------------------\n");
            System.out.println("MENU");
            System.out.println("----------------------------------------");
            System.out.println("1. Vytvořit nového pojištěnce");
            System.out.println("2. Vypsat všechny pojištěnce");
            System.out.println("3. Vyhledat pojištěnce");
            System.out.println("4. Ukončit evidenci");
            System.out.println("----------------------------------------");

            int volba = Integer.parseInt(sc.nextLine());

            switch (volba) {
                case 1: seznamPojistenych.vytvorPojistence();
                break;
                case 2: seznamPojistenych.vypisPojistence();
                break;
                case 3: seznamPojistenych.vyhledejPojistence();
                break;
                case 4:
                    System.out.println("----------------------------------------");
                    System.out.println("-EVIDENCE UKONČENA-");
                    System.out.println("----------------------------------------");
                    start  = false;
                break;
                default:
                    System.out.println("----------------------------------------");
                    System.out.println("-ZADAL JSI NEPLATNOU VOLBU-");
                    System.out.println("----------------------------------------");
            }

        }

    }

}