import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class homework {
    // 1) Suma numerelor dintr-un sir
    public static int sumaNumere(int[] sir) {
        int suma = 0;
        for (int numar : sir) {
            suma += numar;
        }
        return suma;
    }

    // 2) Numarul de elemente impare intr-un sir
    public static int numarElementeImpare(int[] sir) {
        int numarImpare = 0;
        for (int numar : sir) {
            if (numar % 2 != 0) {
                numarImpare++;
            }
        }
        return numarImpare;
    }

    // 3) Numerele mai mari decat un anumit numar dintr-un sir
    public static List<Integer> numereMaiMari(int[] sir, int numar) {
        List<Integer> numereMaiMari = new ArrayList<>();
        for (int nr : sir) {
            if (nr > numar) {
                numereMaiMari.add(nr);
            }
        }
        return numereMaiMari;
    }

    // 4) Campanie de donatii pana la o suma dorita
    public static void campanieDonatii(int target) {
        int sumaDonata = 0;
        int numarDonatii = 0;
        Random random = new Random();
        while (sumaDonata < target) {
            int donatie = random.nextInt(100) + 1;
            sumaDonata += donatie;
            numarDonatii++;
            System.out.println("Donatie noua: " + donatie);
        }
        System.out.println("Suma dorita de donatii a fost atinsa! Numar total de donatii: " + numarDonatii);
    }

    // 5) Campanie de donatii cu un numar maxim de donatii
    public static void campanieDonatiiMaxim(int target, int maximDonatii) {
        int sumaDonata = 0;
        int numarDonatii = 0;
        Random random = new Random();
        while (sumaDonata < target && numarDonatii < maximDonatii) {
            int donatie = random.nextInt(100) + 1;
            sumaDonata += donatie;
            numarDonatii++;
            System.out.println("Donatie noua: " + donatie);
        }
        if (sumaDonata >= target) {
            System.out.println("Suma dorita de donatii a fost atinsa!");
        } else {
            System.out.println("Numarul maxim de donatii a fost atins.");
        }
    }

    // 6) Printeaza fiecare propozitie dintr-un sir separat pe linii noi
    public static void printeazaPropozitii(String fraza) {
        String[] propozitii = fraza.split("\\.");
        for (String propozitie : propozitii) {
            System.out.println(propozitie.trim());
        }
    }

    public static void main(String[] args) {
        // Exemple de utilizare
        int[] numere = {1, 2, 3, 4, 5};
        System.out.println(sumaNumere(numere));  // Output: 15
        System.out.println(numarElementeImpare(numere));  // Output: 3
        System.out.println(numereMaiMari(numere, 2));  // Output: [3, 4, 5]
        campanieDonatii(1000);  // Vom primi donatii pana cand suma totala atinge 1000.
        campanieDonatiiMaxim(1000, 20);  // Vom primi maximum 20 de donatii sau pana cand suma totala atinge 1000.
        String fraza = "Astazi este o zi frumoasa. Soarele straluceste.";
        printeazaPropozitii(fraza);
    }
}
