public class toys extends Supermarket {
    private int age;
    private String type;

    public toys(String nameOtdela, String name, String cuntry, int retailPrice, String namesource, int age, String type) {
        super(nameOtdela, name, cuntry, retailPrice, namesource);
        this.age = age;
        this.type = type;
    }

    public int getAge() { return age; }
    public String getType() { return type; }

    public void setAge(int age) { this.age = age; }
    public void setType(String type) { this.type = type; }

    @Override
    public String toString() {
        return super.toString() + " " + age + " " + type;
    }
}
