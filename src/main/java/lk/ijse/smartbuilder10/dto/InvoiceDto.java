package lk.ijse.smartbuilder10.dto;

import java.sql.Date;

public class InvoiceDto {
    private int invoice_id;
    private int order_id;
    private Date issue_date;
    private Date due_date;
    private double total_amount;

    public InvoiceDto(int invoice_id, int order_id, Date issue_date, Date due_date, double total_amount) {
        this.invoice_id = invoice_id;
        this.order_id = order_id;
        this.issue_date = issue_date;
        this.due_date = due_date;
        this.total_amount = total_amount;
    }
    public int getInvoice_id() {
        return invoice_id;
    }
    public void setInvoice_id(int invoice_id) {
        this.invoice_id = invoice_id;
    }
    public int getOrder_id() {
        return order_id;
    }
    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }
    public Date getIssue_date() {
        return issue_date;
    }
    public void setIssue_date(Date issue_date) {
        this.issue_date = issue_date;
    }
    public Date getDue_date() {
        return due_date;
    }
    public void setDue_date(Date due_date) {
        this.due_date = due_date;
    }
    public double getTotal_amount() {
        return total_amount;
    }
    public void setTotal_amount(double total_amount) {
        this.total_amount = total_amount;
    }

    @Override
    public String toString() {
        return "InvoiceDto{" +
                "invoice_id=" + invoice_id +
                ", order_id=" + order_id +
                ", issue_date=" + issue_date +
                ", due_date=" + due_date +
                ", total_amount=" + total_amount +
                '}';
    }
}
