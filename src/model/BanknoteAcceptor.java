package model;

import java.util.Scanner;

public class BanknoteAcceptor extends AbstractPaymentAcceptor {

    @Override
    public boolean authorize() {
        return true;
    }



    @Override
    public void setAmount(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Деньги должны быть неотрицательными!");
        }
        totalAmount += amount;
        System.out.println("Banknote accepted: " + amount);
    }

    private int getMoney() {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.println("Пополните купюры (20, 50, 100, 200, 500, 1000, 2000, 5000):");
            input = scanner.nextLine().trim();

            try {
                int amount = Integer.parseInt(input);

                switch (amount) {
                    case 20, 50, 100, 200, 500, 1000, 2000, 5000 -> {
                        return amount; // Если сумма допустимая, возвращаем её
                    }
                    default -> System.out.println("Неверная сумма. Допустимы только: 20, 50, 100, 200, 500, 1000, 2000, 5000.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Введите корректное число.");
            }
        }
    }

}
