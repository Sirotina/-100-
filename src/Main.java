public class Main {
    public static void main(String[] args) {

        int onTheAccount = 50;
        int depositAmount = 1001;
        int numberOfBonuses = depositAmount / 100;
        int inTotal = depositAmount + onTheAccount + numberOfBonuses;
        int inTotalWithoutBonus = onTheAccount + depositAmount;

        if (depositAmount > 1000) {

            System.out.println("Сумма бонуса равна: " + numberOfBonuses);

            System.out.println("Итоговый баланс: " + inTotal);
        } else {
            depositAmount = 1000;
            System.out.println("Итоговый баланс: " + inTotalWithoutBonus);
        }
    }
}