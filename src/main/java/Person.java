import java.util.Scanner;

public class Person {
    String name;
    int age;
    Gender sex;

    static Scanner in = new Scanner(System.in);

    public Person(String name, int age, Gender sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Person() {
        this.name = "";
        this.age = 0;
        this.sex = Gender.valueOf("MALE");
    }

    public void setSex(String sex) {
        this.sex = (sex.equalsIgnoreCase("MALE") ? Gender.MALE : Gender.FEMALE);
    }

    public void setAge(String age) {
        try {
            this.age = Integer.parseInt(age);
        } catch (NumberFormatException exception) {
            System.out.println("Response must be a number!");
            System.out.println("What is your age? ");
            this.setAge(in.nextLine());
        }
    }
}

