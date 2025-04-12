package lk.ijse.smartbuilder10.dto;

public class PaymentDto {
    private int payment_id;
    private int order_id;
    private double amount;
    private String payment_method;
    private String payment_status;

    public PaymentDto(int payment_id, int order_id, double amount, String payment_method, String payment_status) {
        this.payment_id = payment_id;
        this.order_id = order_id;
        this.amount = amount;
        this.payment_method = payment_method;
        this.payment_status = payment_status;
    }
    public int getPayment_id() {
        return payment_id;
    }
    public void setPayment_id(int payment_id) {
        this.payment_id = payment_id;
    }
    public int getOrder_id() {
        return order_id;
    }
    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public String getPayment_method() {
        return payment_method;
    }
    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }
    public String getPayment_status() {
        return payment_status;
    }
    public void setPayment_status(String payment_status) {
        this.payment_status = payment_status;
    }

    @Override
    public String toString() {
        return "PaymentDto{" +
                "payment_id=" + payment_id +
                ", order_id=" + order_id +
                ", amount=" + amount +
                ", payment_method='" + payment_method + '\'' +
                ", payment_status='" + payment_status + '\'' +
                '}';
    }
}
