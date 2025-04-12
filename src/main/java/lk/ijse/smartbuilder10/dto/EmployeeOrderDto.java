package lk.ijse.smartbuilder10.dto;

public class EmployeeOrderDto {
    private int order_id;
    private int employee_id;

    public EmployeeOrderDto(int order_id, int employee_id) {
        this.order_id = order_id;
        this.employee_id = employee_id;
    }
    public int getOrder_id() {
        return order_id;
    }
    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }
    public int getEmployee_id() {
        return employee_id;
    }
    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    @Override
    public String toString() {
        return "EmployeeOrderDto{" +
                "order_id=" + order_id +
                ", employee_id=" + employee_id +
                '}';
    }
}
