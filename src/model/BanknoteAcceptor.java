package model;

public class BanknoteAcceptor implements PaymentAcceptor{
    @Override
    public boolean authorize() {
        return true;
    }

    @Override
    public int getAmount() {
        return 0;
    }

    @Override
    public void setAmount(int amount) {

    }
}
