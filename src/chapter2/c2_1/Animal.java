package chapter2.c2_1;

/**
 *
 * 类不含有公有的或受保护的构造器，不能被子类化
 *
 * Created by luolingling on 2017/8/18.
 */
public class Animal {

    public static Animal animal = new Animal();

    private Animal() {
    }

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public static Animal newInstance() {
        return animal;
    }

    private String name;

    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
