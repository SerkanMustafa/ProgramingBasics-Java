package forLoop;

import java.util.Scanner;

public class e02halfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());

            sum +=currentNum;
            if (currentNum>max)
            {
                max = currentNum;
            }
        }
        int maxWithoutMAx = sum-max;
        if (maxWithoutMAx == max)
        {
            System.out.println("Yes");
            System.out.printf("Sum = %d",maxWithoutMAx);

        }
    }
}
