package Lesson6;

public class Animal /* extends Object*/ {

    protected final String name;
    protected final int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public final String getName() {
        return name;
    }

    public void printInfo() {
        System.out.println(toString());
    }

    public abstract void voice();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
