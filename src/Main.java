public class Main {
    public static void main(String[] args) {
        int ticket = 8590;
        int bonusPerMile = 20;

        int bonusMile = ticket / bonusPerMile;

        System.out.println("Количество бонусных миль: " + bonusMile);
    }
}