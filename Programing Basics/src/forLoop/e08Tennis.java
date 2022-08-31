package forLoop;

import java.util.Scanner;

public class e08Tennis {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countTournament = Integer.parseInt(scanner.nextLine());
        int points = Integer.parseInt(scanner.nextLine());
        int finalpoints =0;
        for (int i = 0; i <countTournament ; i++) {
            String result = scanner.nextLine();
            switch (result)
            {
                case "W":
                    points+=2000;
                    break;
            }
        }

    }
}
