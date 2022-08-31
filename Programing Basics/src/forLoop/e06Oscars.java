package forLoop;
/*
https://judge.softuni.org/Contests/Compete/Index/2394#5
* 6. Оскари

Поканени сте от академията да напишете софтуер, който да пресмята точките за актьор/актриса. Академията ще ви даде първоначални точки за актьора. След това всеки оценяващ ще дава своята оценка. Точките, които актьора получава се формират от: дължината на името на оценяващия умножено по точките, които дава делено на две.

Ако резултатът в някой момент надхвърли 1250.5 програмата трябва да прекъсне и да се отпечата, че дадения актьор е получил номинация.

Вход

• Име на актьора - текст

• Точки от академията - реално число в интервала [2.0... 450.5]

• Брой оценяващи n - цяло число в интервала[1… 20]

На следващите n-на брой реда:

o Име на оценяващия - текст

o Точки от оценяващия - реално число в интервала [1.0... 50.0]

Изход

Да се отпечата на конзолата един ред:

· Ако точките са над 1250.5:

"Congratulations, {име на актьора} got a nominee for leading role with {точки}!"

· Ако точките не са достатъчни:

"Sorry, {име на актьора} you need {нужни точки} more!"

Резултатът да се форматирана до първата цифра след десетичния знак!*/
import java.util.Scanner;

public class e06Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double initialPoints = Double.parseDouble(scanner.nextLine());
        int  peopleEvaluation = Integer.parseInt(scanner.nextLine());

        double totalPoints = initialPoints;
        for (int i = 0; i < peopleEvaluation; i++) {
            String nameEvaluate = scanner.nextLine();
            double points =Double.parseDouble(scanner.nextLine());
            double sumCurrentPoints = (nameEvaluate.length() * points)/2;
            if(totalPoints<1250.5)
            {
                totalPoints += sumCurrentPoints;
            }
        }
if(totalPoints >= 1250.5)
{
    System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!" ,actorName,totalPoints);
}else
    {
        System.out.printf("Sorry, %s you need %.1f more!",actorName,1250.5 - totalPoints);
    }
    }
}
