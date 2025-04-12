package lk.ijse.smartbuilder10.dto;

public class ReturnDto {
    private int return_id;
    private int order_id;
    private String return_reason;
    private String return_status;

    public ReturnDto(int return_id, int order_id, String return_reason, String return_status) {
        this.return_id = return_id;
        this.order_id = order_id;
        this.return_reason = return_reason;
        this.return_status = return_status;
    }
    public int getReturn_id() {
        return return_id;
    }
    public void setReturn_id(int return_id) {
        this.return_id = return_id;
    }
    public int getOrder_id() {
        return order_id;
    }
    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }
    public String getReturn_reason() {
        return return_reason;
    }
    public void setReturn_reason(String return_reason) {
        this.return_reason = return_reason;
    }
    public String getReturn_status() {
        return return_status;
    }
    public void setReturn_status(String return_status) {
        this.return_status = return_status;
    }

    @Override
    public String toString() {
        return "ReturnDto{" +
                "return_id=" + return_id +
                ", order_id=" + order_id +
                ", return_reason='" + return_reason + '\'' +
                ", return_status='" + return_status + '\'' +
                '}';
    }
}