public class Main {
    public static void main(String[] args) {
        int cost = 500;
        BonusMilesService service = new BonusMilesService();
        int price = 500;
        int miles = service.calculate(price);
        System.out.println("Фактический результат : " + miles);
    }
}