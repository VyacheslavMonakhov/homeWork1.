package Lesson5;

public class DataEmployee {
    private String fullName;
    private String position;
    private String email;
    protected int salary;
    protected int age;

    public DataEmployee (String fullName, String position, String email,
                         int salary,int age) {
        this.fullName = fullName;
        this.position =position;
        this.email = email;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println("ФИО: " + fullName + "; Должность: " + position +
                "; email: " + email + "; Зарплата: "+ salary + "; Возраст: ");
    }


}


