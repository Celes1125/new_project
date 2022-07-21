public class Category {
    private String name;
    private String scope;
    private Integer id;
    private Integer level;

    public Category(String name, String scope, Integer id, Integer level) {
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}


