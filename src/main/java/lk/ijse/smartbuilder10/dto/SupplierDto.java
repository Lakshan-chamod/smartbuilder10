package lk.ijse.smartbuilder10.dto;

public class SupplierDto {
    private int supplier_id;
    private String name;
    private String address;
    private String phone;
    private String email;
    private String contact_person;

    public SupplierDto(int supplier_id, String name, String address, String phone, String email, String contact_person) {
        this.supplier_id = supplier_id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.contact_person = contact_person;
    }
    public int getSupplier_id() {
        return supplier_id;
    }
    public void setSupplier_id(int supplier_id) {
        this.supplier_id = supplier_id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getContact_person() {
        return contact_person;
    }
    public void setContact_person(String contact_person) {
        this.contact_person = contact_person;
    }

    @Override
    public String toString() {
        return "SupplierDto{" +
                "supplier_id=" + supplier_id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", contact_person='" + contact_person + '\'' +
                '}';
    }
}
