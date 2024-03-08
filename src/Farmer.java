public class Farmer {

    private String name;
    private int age;

    public Farmer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Farmer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
