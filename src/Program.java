import java.util.Scanner;
public class Program {
    public static void main(String args[]) {
        System.out.println("Hello, world: Java");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = in.nextLine();
        System.out.print("Age: ");
        int age = in.nextInt();
        System.out.print("Height: ");
        float height = in.nextFloat();
        System.out.print("Male: ");
        boolean isMale = in.nextBoolean();

        System.out.printf("%s, %d years old. Height - $.2f, Male - %b", name, age, height, isMale);
        in.close();
    }
}
