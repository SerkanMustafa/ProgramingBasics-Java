package forLoop;

import java.util.Scanner;

public class e07TrackingManiq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int allPeople = 0;
        int peopleMusala = 0;
        int peopleMontblan = 0;
        int peopleKilimandjaro = 0;
        int peopleK2 = 0;
        int peopleEverest = 0;

        int groups = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < groups; i++) {
            int peopleInGroup = Integer.parseInt(scanner.nextLine());
            allPeople = allPeople + peopleInGroup;
            if (peopleInGroup <= 5) {
                peopleMusala = peopleMusala + peopleInGroup;
            } else if (peopleInGroup <= 12) {
                peopleMontblan = peopleMontblan + peopleInGroup;
            } else if (peopleInGroup <= 25) {
                peopleKilimandjaro = peopleKilimandjaro + peopleInGroup;
            } else if (peopleInGroup <= 40) {
                    peopleK2 = peopleK2 + peopleInGroup;
            } else {
                    peopleEverest = peopleEverest + peopleInGroup;
            }
        }
        System.out.printf("%.2f%%%n", peopleMusala*1.0/allPeople*100);
        System.out.printf("%.2f%%%n", peopleMontblan*1.0/allPeople*100);
        System.out.printf("%.2f%%%n", peopleKilimandjaro*1.0/allPeople*100);
        System.out.printf("%.2f%%%n", peopleK2 *1.0/allPeople*100);
        System.out.printf("%.2f%%%n", peopleEverest*1.0/allPeople*100);
    }
}
