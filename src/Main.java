public class Main {
    public static void main(String[] args) {
        // Начальная сумма на счету клиента
        int initialBalance = 100; // Задайте начальную сумму

        // Сумма пополнения
        int refillAmount = 1100; // Задайте сумму пополнения

        // Порог для начисления бонусов
        int bonusThreshold = 1000;

        // Стоимость одного бонусного рубля
        int bonusStep = 100;

        // Расчет бонусов
        int bonus = (refillAmount > bonusThreshold) ? (refillAmount / bonusStep) : 0;

        // Итоговая сумма на счету
        int finalBalance = initialBalance + refillAmount + bonus;

        // Вывод результатов
        System.out.println("Начальная сумма на счету: " + initialBalance + " рублей");
        System.out.println("Сумма пополнения: " + refillAmount + " рублей");
        System.out.println("Начислено бонусов: " + bonus + " рублей");
        System.out.println("Итоговая сумма на счету: " + finalBalance + " рублей");
    }
}
