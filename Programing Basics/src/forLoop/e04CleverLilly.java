package forLoop;

import java.util.Scanner;

public class e04CleverLilly {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int age =Integer.parseInt(scanner.nextLine());
        double washMachine = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        int countToys=0;
        double money =0;
        double allMoney =0;
        int brother=0;
        for (int i = 1; i <= age ; i++) {
            if (i%2 == 0)
            {
                countToys++;
            }
            else
                {
                    brother++;
                    money = money +10;
                    allMoney=allMoney+money;
                }
        }
        double sumToys = countToys*toyPrice;
        double totalSum = sumToys + allMoney - brother;
        System.out.println();
    }
}
