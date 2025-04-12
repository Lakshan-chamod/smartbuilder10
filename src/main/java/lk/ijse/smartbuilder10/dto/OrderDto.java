package lk.ijse.smartbuilder10.dto;

import java.sql.Date;

public class OrderDto {
    private int order_id;
    private Date order_date;
    private String status;
    private double total_amount;
    private int customer_id;

    public OrderDto(int order_id, Date order_date, String status, double total_amount, int customer_id) {
        this.order_id = order_id;
        this.order_date = order_date;
        this.status = status;
        this.total_amount = total_amount;
        this.customer_id = customer_id;
    }
    public int getOrder_id() {
        return order_id;
    }
    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }
    public Date getOrder_date() {
        return order_date;
    }
    public void setOrder_date(Date order_date) {
        this.order_date = order_date;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public double getTotal_amount() {
        return total_amount;
    }
    public void setTotal_amount(double total_amount) {
        this.total_amount = total_amount;
    }
    public int getCustomer_id() {
        return customer_id;
    }
    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    @Override
    public String toString() {
        return "OrderDto{" +
                "order_id=" + order_id +
                ", order_date=" + order_date +
                ", status='" + status + '\'' +
                ", total_amount=" + total_amount +
                ", customer_id=" + customer_id +
                '}';
    }
}