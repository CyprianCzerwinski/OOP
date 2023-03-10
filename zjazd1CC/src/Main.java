import java.time.LocalDate;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;
import static java.lang.Math.PI;
import static java.lang.Math.sqrt;
import java.util.Date;


public class Main {
    public static void main(String[] args) {
        System.out.println("Witaj szkoło");
      //  zadanie_01();
      //  zadanie_02();
      //  zadanie_03();
      //  zadanie_04();
      //  zadanie_05();
      //  zadanie_06();
      //  zadanie_07();
      //  zadanie_08();
      //  zadanie_09();
      //  zadanie_10();
      //  zadanie_11();
      //  zadanie_12();
        zadanie_13();


    }



    public static void zadanie_01() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Program policzy obwód prostokąta:");

        System.out.println("Podaj wartość boku 'a':");
        int bokA = myObj.nextInt();

        System.out.println("Podaj wartość boku 'a':");
        int bokB = myObj.nextInt();

        System.out.println("Pole prostokąta wynosi: " + bokA * bokB);
    }

    public static void zadanie_02() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Program wyświetli pierwiastek kwadratowy z liczby pi");
        System.out.println("z dokładnośią do 2 liczb po przecinku");

        System.out.println("wynik: " + sqrt(PI));
    }

    public static void zadanie_03() {
        Scanner sc = new Scanner(System.in);
        String[] input = new String[2];
        String napis1, napis2;
        System.out.print("Please enter two Strings: ");
        input = sc.nextLine().split(" ");
        napis1= input[0];
        napis2= input[1];
        System.out.println("You input: " + napis2 + " " + napis1);
    }

    public static void zadanie_04() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Program sprawdzi, czy możliwe jest zbudowanie trójkąta z podanych boków: ");

        System.out.println("wprowadz dlugosc boku 'a':");
        int bokA = myObj.nextInt();

        System.out.println("Podaj dlugosc boku 'b':");
        int bokB = myObj.nextInt();

        System.out.println("Podaj dlugosc boku 'c':");
        int bokC = myObj.nextInt();

        if (bokA > 0 && bokB > 0 && bokC > 0) {
            if (bokA + bokB > bokC && bokB + bokC > bokA) {
                System.out.println("Tak ");
            } else {
                System.out.println("Nie");
            }
        } else {
            System.out.println("Błąd ");
        }}

        public static void zadanie_05() {

            Scanner myObj = new Scanner(System.in);
            System.out.println("Po wprowadzniu numeru dnia aplikacja sprawdzi date w aktualnym roku : ");
            System.out.println("System poinformuje użytkownika, w którym miesiącu znajduje się dzień : ");
            System.out.println("oraz ile dni zawiera sie w danym miesiacu : ");


            System.out.println("podaj numer dnia :");
            int dzien = myObj.nextInt();

            if(dzien>0) {
                LocalDate data = LocalDate.ofYearDay(2023, dzien);
                String monthName = data.getMonth().toString();
                int numDays = data.lengthOfMonth();

                System.out.println("Miesiąc: " + monthName + " " + numDays );

            }else
            {
                    System.out.println("Błąd: " + dzien);
            }
    }

    public static void zadanie_06() {

        System.out.println("Program wyswietli 3 wprowadzone liczby rzeczywiste a następnie posortuje od najmniejszej: ");

        Scanner myObj = new Scanner(System.in);
        float[] liczbyRzeczywiste = new float[3];

        for (int i = 0; i < 3; i++) {
            liczbyRzeczywiste[i] = myObj.nextFloat();
        }
        if (liczbyRzeczywiste[0] > liczbyRzeczywiste[1]) {
            float tmp = liczbyRzeczywiste[0];
            liczbyRzeczywiste[0] = liczbyRzeczywiste[1];
            liczbyRzeczywiste[1] = tmp;
        }

        if (liczbyRzeczywiste[1] > liczbyRzeczywiste[2]) {
            float tmp = liczbyRzeczywiste[1];
            liczbyRzeczywiste[1] = liczbyRzeczywiste[2];
            liczbyRzeczywiste[2] = tmp;
        }

        if (liczbyRzeczywiste[0] > liczbyRzeczywiste[1]) {
            float tmp = liczbyRzeczywiste[0];
            liczbyRzeczywiste[0] = liczbyRzeczywiste[1];
            liczbyRzeczywiste[1] = tmp;
        }


            System.out.println("Posortowana tablica wygląda tak:");
            for (int i = 0; i < 3; i++) {
                String numerFormatowany = String.format("%.4f", liczbyRzeczywiste[i]);
                System.out.print(numerFormatowany + " ");

            }

            for (int i = 2; i > -1; i--) {
                String numerFormatowany = String.format("%.4f", liczbyRzeczywiste[i]);
                System.out.print(numerFormatowany + " ");
            }
        }

    public static void zadanie_07() {
        int[] A;
        int[] B;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj n: ");
        int n = scanner.nextInt();
        System.out.print("Podaj m: ");
        int m = scanner.nextInt();

        if (n <= 0 || m <= 0) {
            System.out.println("BŁĄD");
            return;
        }

        A = new int[n];
        B = new int[m];
        System.out.println("Podaj " + n + " liczb do tablicy A:");
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        System.out.println("Podaj " + m + " liczb do tablicy B:");
        for (int i = 0; i < m; i++) {
            B[i] = scanner.nextInt();
        }

        int iloczynSkalarny = 0;
        int k = Math.min(n, m);
        for (int i = 0; i < k; i++) {
            iloczynSkalarny += A[i] * B[i];
        }

        System.out.println("Iloczyn skalarny: " + iloczynSkalarny);
    }



    public static void zadanie_08() {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Podaj liczbę naturalną n: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Niepoprawne dane! Podaj liczbę naturalną n:");
                scanner.next();
            }
            n = scanner.nextInt();
        } while (n < 1);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void zadanie_09() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj słowo: ");
        char[] word = scanner.nextLine().toCharArray();
        int length = word.length;
        boolean jestPali = true;

        for (int i = 0; i < length / 2; i++) {
            if (word[i] != word[length - i - 1]) {
                jestPali = false;
                break;
            }
        }

        if (jestPali) {
            System.out.println("TAK");
        } else {
            System.out.println("NIE");
        }
    }

    public static void zadanie_10() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj ilość wierszy: ");
        int rows = scanner.nextInt();

        System.out.print("Podaj ilość kolumn: ");
        int columns = scanner.nextInt();

        if (rows < 1 || columns < 1) {
            System.out.println("BŁĄD");
            return;
        }

        int[][] matrix = new int[rows][columns];

        System.out.println("Podaj elementy macierzy: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Transpozycja macierzy: ");
        for (int j = 0; j < columns; j++) {
            for (int i = 0; i < rows; i++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

        public static void zadanie_11() {
            Scanner userInput = new Scanner(System.in);

            System.out.print("Podaj tekst: ");
            String text = userInput.nextLine();

            boolean[] letters = new boolean[26];
            int count = 0;

            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);

                if (Character.isLetter(c)) {
                    int index = Character.toLowerCase(c) - 'a';

                    if (!letters[index]) {
                        letters[index] = true;
                        count++;
                    }
                }
            }

            boolean isPangram = count == 26;

            System.out.println(isPangram);
        }

    public static void zadanie_12() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wiek w sekundach: ");
        double ageInSeconds = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Podaj planetę (Merkury, Wenus, Mars, Jowisz, Saturn, Uran, Neptun): ");
        String planet = scanner.nextLine();

        double earthYearInSeconds = 31557600.0;
        double ageInYears;

        switch (planet) {
            case "Merkury":
                ageInYears = ageInSeconds / (0.2408467 * earthYearInSeconds);
                break;
            case "Wenus":
                ageInYears = ageInSeconds / (0.61519726 * earthYearInSeconds);
                break;
            case "Mars":
                ageInYears = ageInSeconds / (1.8808158 * earthYearInSeconds);
                break;
            case "Jowisz":
                ageInYears = ageInSeconds / (11.862615 * earthYearInSeconds);
                break;
            case "Saturn":
                ageInYears = ageInSeconds / (29.447498 * earthYearInSeconds);
                break;
            case "Uran":
                ageInYears = ageInSeconds / (84.016846 * earthYearInSeconds);
                break;
            case "Neptun":
                ageInYears = ageInSeconds / (164.79132 * earthYearInSeconds);
                break;
            default:
                System.out.println("BŁĄD: Nieznana planeta!");
                return; // Zakończ działanie programu
        }

        System.out.printf("Wiek na %s: %.2f lat", planet, ageInYears);

    }

    public static void zadanie_13() {

    }

    }
