package chapter2.c2_2;

import java.util.Date;

/**
 *
 * builder pattern
 * 不直接生成想要的对象，而是让客户端利用所以必要的参数调用构造器（或者静态工厂），
 * 得到一个builder对象。然后客户端在builder对象上调用类似于setter方法，来设置每个相关的可选参数。
 * 最后，客户端调用无参的build方法来生成不可变的对象。
 *
 * Created by luolingling on 2017/8/18.
 */
public class Person {

    private final String name;
    private final int age;
    private final String sex;
    private final String job;
    private final Date birthday;
    private final String home;

    public static class Builder {
        private final String name;
        private final int age;

        private String sex = "F";
        private String job = "";
        private Date birthday = new Date();
        private String home = "China";

        public Builder(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Builder job(String job) {
            this.job = job;
            return this;
        }

        public Builder birthday(Date birthday) {
            this.birthday = birthday;
            return this;
        }

        public Builder sex(String sex) {
            this.sex = sex;
            return this;
        }

        public Builder home(String home) {
            this.home = home;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    public Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.sex = builder.sex;
        this.job = builder.job;
        this.birthday = builder.birthday;
        this.home = builder.home;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", job='" + job + '\'' +
                ", birthday=" + birthday +
                ", home='" + home + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Person me = new Builder("lll", 24).sex("F").job("Java Web Developer").build();
        System.out.println(me.toString());
    }

}
