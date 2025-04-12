package lk.ijse.smartbuilder10.dto;

import java.sql.Date;

public class DeliveryDto {
    private int delivery_id;
    private int order_id;
    private Date delivery_date;
    private String status;

    public DeliveryDto(int delivery_id, int order_id, Date delivery_date, String status) {
        this.delivery_id = delivery_id;
        this.order_id = order_id;
        this.delivery_date = delivery_date;
        this.status = status;
    }
    public DeliveryDto() {
    }

    public int getDelivery_id() {
        return delivery_id;
    }

    public void setDelivery_id(int delivery_id) {
        this.delivery_id = delivery_id;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }
    public Date getDelivery_date() {
        return delivery_date;
    }
    public void setDelivery_date(Date delivery_date) {
        this.delivery_date = delivery_date;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "DeliveryDto{" +
                "delivery_id=" + delivery_id +
                ", order_id=" + order_id +
                ", delivery_date=" + delivery_date +
                ", status='" + status + '\'' +
                '}';
    }
}
