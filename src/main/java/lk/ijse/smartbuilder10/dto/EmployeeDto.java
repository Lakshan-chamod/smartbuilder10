package lk.ijse.smartbuilder10.dto;

public class EmployeeDto {
    private int order_id;
    private  String name;
    private String email;
    private String phone;
    private String position;

    public EmployeeDto(int order_id, String name, String email, String phone, String position) {
        this.order_id = order_id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.position = position;
    }
    public int getOrder_id() {
        return order_id;
    }
    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "EmployeeDto{" +
                "order_id=" + order_id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
