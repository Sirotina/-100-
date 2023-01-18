public class Main {
    public static void main(String[] args) {

        int on_the_account = 50;
        int deposit_amount = 1150;
        int number_of_bonuses = deposit_amount / 100;
        int in_total = deposit_amount + on_the_account + number_of_bonuses;
        int in_total_without_bonus = on_the_account + deposit_amount;

        if (deposit_amount >= 1000) {

            System.out.println("Сумма бонуса равна: " + number_of_bonuses);

            System.out.println("Итоговый баланс: " + in_total);
        }
        if (deposit_amount < 1000) {
            System.out.println("Итоговый баланс: " + in_total_without_bonus);
        }
    }
}