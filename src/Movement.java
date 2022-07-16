import java.util.Date;

public class Movement {
    private Date date;
    private Boolean isInflow;
    private String currency;
    private Double amount;
    private String category;
    private String subcategory;

    public Movement(Boolean isInflow, String currency, Double amount, String category, String subcategory) {
        this.date = new Date();
        this.isInflow = isInflow;
        this.currency = currency;
        this.amount = amount;
        this.category = category;
        this.subcategory = subcategory;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Boolean getInflow() {
        return isInflow;
    }

    public void setInflow(Boolean inflow) {
        isInflow = inflow;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(String subcategory) {
        this.subcategory = subcategory;
    }
}


