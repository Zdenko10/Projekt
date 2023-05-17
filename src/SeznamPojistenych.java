import java.util.ArrayList;
import java.util.Scanner;

public class SeznamPojistenych {
    private ArrayList<Osoba> seznam;
    private Scanner scanner;

    public SeznamPojistenych() {
        seznam = new ArrayList<>();
        scanner = new Scanner(System.in, "Windows-1250");
    }

    public void vytvorPojistence() {
        System.out.println("VYTVOŘENÍ NOVÉHO POJIŠTĚNCE");
        Osoba osoba = new Osoba();
        System.out.println("Zadejte jméno: ");
        osoba.setJmeno(scanner.nextLine());
        System.out.println("Zadejte příjmení: ");
        osoba.setPrijmeni(scanner.nextLine());
        System.out.println("Zadejte věk: ");
        osoba.setVek(Integer.parseInt(scanner.nextLine()));
        System.out.println("Zadejte telefonní číslo: ");
        osoba.setTelefon(scanner.nextLine());
        seznam.add(osoba);
        System.out.println("\n-NOVÝ POJIŠTĚNEC VYTVOŘEN-");
        System.out.println("----------------------------------------");
    }

    public void vypisPojistence() {
        System.out.println("SEZNAM POJIŠTĚNCŮ");
        for (Osoba osoba : seznam) {
            System.out.println(osoba);
        }
        System.out.println("----------------------------------------");
    }

    public void vyhledejPojistence() {
        System.out.println("VYHLEDÁNÍ POJIŠTĚNCE");
        System.out.println("Zadejte jméno: ");
        String jmeno = scanner.nextLine();
        System.out.println("Zadejte příjmení: ");
        String prijmeni = scanner.nextLine();
        for (Osoba osoba : seznam) {
            if ((jmeno.equals(osoba.getJmeno())) && (prijmeni.equals(osoba.getPrijmeni()))) {
                System.out.println(osoba);
                System.out.println("----------------------------------------");
            }

        }
    }


}

