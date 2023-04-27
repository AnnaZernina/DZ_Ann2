public class Main {
    public static void main(String[] args) {

        int startingScore = 100; // начальный счет данные входа
        int replenishment = 100; // сумма пополнения
        int bonus; // сумма бонусов
        if (replenishment > 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Итоговый счет: " + (startingScore + replenishment + bonus));
    }
}
