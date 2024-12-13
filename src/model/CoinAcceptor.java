package model;

public class CoinAcceptor implements PaymentAcceptor {
    private int amount;

    public CoinAcceptor(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean authorize() {
        return false;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public void setAmount(int amount) {
        this.amount = amount;
    }
}
