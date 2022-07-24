public class Category {
    private String name;
    private String scope;
    private int id;
    private int level;

    public Category(String name, String scope, int id, int level) {
        this.name = name;
        this.scope = scope;
        this.id = id;
        this.level = level;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", scope='" + scope + '\'' +
                ", id=" + id +
                ", level=" + level +
                '}';
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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}


