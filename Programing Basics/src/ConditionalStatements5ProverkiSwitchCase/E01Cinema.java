package ConditionalStatements5ProverkiSwitchCase;

import java.util.Scanner;

public class E01Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
         int col = Integer.parseInt(scanner.nextLine());
        int row = Integer.parseInt(scanner.nextLine());
        double sum=0.0;
        if(projection.equals("Premiere"))
        {
            sum = col*row*12.0;

        }
        else if(projection.equals("Normal"))
        {
            sum = col*row*7.50;
        }
        else if(projection.equals("Discount"))
        {
            sum = col*row*5.0;
        }
        System.out.printf("%.2f leva",sum);
    }
}
