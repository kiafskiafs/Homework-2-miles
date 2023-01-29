import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите стомость билета в рублях (без копеек): ");
        
        int ticketPrice = in.nextInt();
        int bonusIndex = 20;
        int bonusMiles = ticketPrice / bonusIndex;

        System.out.println("Бонусные мили: " + bonusMiles);
        in.close();
    }
}