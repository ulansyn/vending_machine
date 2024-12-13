package model;

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


}
