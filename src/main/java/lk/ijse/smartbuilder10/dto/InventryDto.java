package lk.ijse.smartbuilder10.dto;

public class InventryDto {
    private int item_id;
    private String item_name;
    private String category;
    private int quantity;
    private double price_per_unit;
    private int supplier_id;

    public InventryDto(int item_id, String item_name, String category, int quantity, double price_per_unit, int supplier_id) {
        this.item_id = item_id;
        this.item_name = item_name;
        this.category = category;
        this.quantity = quantity;
        this.price_per_unit = price_per_unit;
        this.supplier_id = supplier_id;
    }
    public int getItem_id() {
        return item_id;
    }
    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }
    public String getItem_name() {
        return item_name;
    }
    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getPrice_per_unit() {
        return price_per_unit;
    }
    public void setPrice_per_unit(double price_per_unit) {
        this.price_per_unit = price_per_unit;
    }
    public int getSupplier_id() {
        return supplier_id;
    }
    public void setSupplier_id(int supplier_id) {
        this.supplier_id = supplier_id;
    }

    @Override
    public String toString() {
        return "InventryDto{" +
                "item_id=" + item_id +
                ", item_name='" + item_name + '\'' +
                ", category='" + category + '\'' +
                ", quantity=" + quantity +
                ", price_per_unit=" + price_per_unit +
                ", supplier_id=" + supplier_id +
                '}';
    }
}