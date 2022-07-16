public class Category {
    private String name;
    private String scope;
    private int id;
    private Double amount;

    public Category(String name, String scope, int id, Double amount) {
        this.name = name;
        this.scope = scope;
        this.id = id;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}


