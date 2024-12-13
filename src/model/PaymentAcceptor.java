package model;

public interface PaymentAcceptor {
    boolean authorize();
    void setAmount(int amount);
}