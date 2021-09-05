import java.util.Scanner;

public class Application {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Person person = new Person();

        System.out.println("What is your name? ");
        person.name = in.nextLine();
        System.out.println("What is your age? ");
        person.setAge(in.nextLine());
        System.out.println("What is your gender? (Female or Male) ");
        person.setSex(in.nextLine());

        System.out.printf("%s %d %s", person.name, person.age, person.sex);
    }
}
