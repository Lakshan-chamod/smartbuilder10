package lk.ijse.smartbuilder10.dto;


public class DiscountDto {
    private int discount_id;
    private String discount_code;
    private double discount_percentage;

    public DiscountDto(int discount_id, String discount_code, double discount_percentage) {
        this.discount_id = discount_id;
        this.discount_code = discount_code;
        this.discount_percentage = discount_percentage;

    }

    public int getDiscount_id() {
        return discount_id;
    }
    public void setDiscount_id(int discount_id) {
        this.discount_id = discount_id;
    }

    public String getDiscount_code() {
        return discount_code;
    }
    public void setDiscount_code(String discount_code) {
        this.discount_code = discount_code;
    }

    public double getDiscount_percentage() {
        return discount_percentage;
    }
    public void setDiscount_percentage(double discount_percentage) {
        this.discount_percentage = discount_percentage;
    }

    @Override
    public String toString() {
        return "DiscountDto{" +
                "discount_id=" + discount_id +
                ", discount_code='" + discount_code + '\'' +
                ", discount_percentage=" + discount_percentage +
                '}';
    }
}