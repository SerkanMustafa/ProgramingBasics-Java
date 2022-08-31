package ConditionalStatements5ProverkiSwitchCase;

import java.util.Scanner;

public class e07HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double sumStudio = 0.0;
        double sumApartament = 0.0;
        double discount =0.0;
        if(month.equals("May") || month.equals("Octomber"))
        {
            if(nights>7 && nights<14)
            {
                double sum = (nights * 50);
                sumStudio = sum - (sum * 0.05);
                sumApartament = nights*65;
            }
            else if(nights>14)
            {
                double sum = (nights * 50);
                sumStudio = sum - (sum * 0.3);
                double sum2 = nights*65;
                sumApartament = sum2-(sum2*0.1);
            }
            else
            {
                sumApartament=nights*65;
                sumStudio=nights*50;
            }
        }

        if(month.equals("June") || month.equals("September"))
        {
            if(nights>14)
            {
                double sum = nights * 75.2;
                sumStudio = sum - (sum * 0.20);
                double sum2=0;
                sum2=nights*68.70;
                sumApartament=sum2-(sum2*0.1);
            }
            else
            {
                sumApartament=nights*68.70;
                sumStudio=nights*75.20;
            }
        }

        if(month.equals("July") || month.equals("August"))
        {
            if(nights>14)
            {
                sumStudio=nights*76;
                double sum2=0;
                sum2=nights*77;
                sumApartament=sum2-(sum2*0.1);
            }
            else
            {
                sumApartament=nights*65;
                sumStudio=nights*50;
            }
        }

        System.out.printf("Apartment: %.2f lv. %nStudio: %.2f lv.", sumApartament, sumStudio);

    }
}
