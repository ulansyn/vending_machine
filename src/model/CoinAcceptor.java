package model;

import java.util.Scanner;

public class CoinAcceptor extends AbstractPaymentAcceptor {

    @Override
    public boolean authorize() {
        return true;
    }



    @Override
    public void setAmount(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Монеты должны быть неотрицательными!");
        }
        totalAmount = amount;
        System.out.println("Coin accepted: " + amount);
    }
    public int getCoin() {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.println("Пополните монеты (1, 3, 5, 10):");
            input = scanner.nextLine().trim();
            try {
                int amount = Integer.parseInt(input);
                if (amount == 1 || amount == 3 || amount == 5 || amount == 10) {
                    return amount;
                } else {
                    System.out.println("Неверная сумма. Допустимы только: 1, 3, 5, 10.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Введите корректное число.");
            }
        }
    }

}
