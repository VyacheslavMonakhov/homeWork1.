package Lesson6;

public class Dog extends Animal {

    private String type;

    public Dog(String name, int age, String type) {
        super(name, age);
        this.type = type;
    }

    @Override
    public void voice() {
//        super.voice();
        bark();
    }

    public void bark() {
        System.out.println("Собака гавкнула!");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

