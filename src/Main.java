public class Main {
    public static void main(String[] args) {
        /*int cost = 5000;                          тут
        int bonusIndex = 20;                        программа
                                                    работает
        int bonusMiles = cost / bonusIndex;         не ссылочно,
        System.out.println(bonusMiles);             а напрямую */
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int bonusMiles = service.calculate(price);
        System.out.println(bonusMiles);
    }
}