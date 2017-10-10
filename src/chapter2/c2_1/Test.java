package chapter2.c2_1;

/**
 * Created by luolingling on 2017/8/30.
 */
public class Test {

    public static void main(String[] args) {
        Animal animal = Animal.newInstance();
        System.out.println(animal.toString());

        animal.setName("lll");
        animal.setType("dog");
        System.out.println(animal);

        System.out.println(Animal.newInstance().toString());

        System.out.println(Cat.newInstance().toString());
    }

}
