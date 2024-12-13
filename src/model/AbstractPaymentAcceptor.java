package model;

public abstract class AbstractPaymentAcceptor implements PaymentAcceptor {
    public static int totalAmount = 0; //общий счетчик в автомате

    public static int getTotalAmount() {
        return totalAmount;
    }
}
