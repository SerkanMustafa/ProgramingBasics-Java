package forLoop;

import java.util.Scanner;

public class e05Salary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countTabs = Integer.parseInt(scanner.nextLine());

        int salary = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= countTabs; i++) {
            if (salary > 0) {
                String nameTab = scanner.nextLine();

                switch (nameTab) {
                    case "Facebook":
                        salary = salary - 150;
                        break;
                    case "Instagram":
                        salary = salary - 100;
                        break;
                    case "Reddit":
                        salary = salary - 50;
                        break;
                }
            }
        }
            if (salary <= 0) {
                System.out.println("You have lost your salary.");
            } else {
                System.out.println(salary);
            }
        }
    }

