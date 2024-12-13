package model;

public interface PaymentAcceptor {
    boolean authorize();
    int getAmount();
    void setAmount(int amount);
}