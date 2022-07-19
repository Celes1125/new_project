public class Category {
    private String name;
    private String scope;
    private int id;

    public Category(String name, String scope, int id) {
        this.name = name;
        this.scope = scope;
        this.id = id;
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

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", scope='" + scope + '\'' +
                ", id=" + id +
                '}';
    }
}


