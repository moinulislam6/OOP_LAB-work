import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        Vehicle obj1 = new Vehicle();
        obj1.speed = a;
        obj1.run();

        Bike obj2 = new Bike();
        obj2.speed = b;
        obj2.run();

        Car obj3 = new Car();
        obj3.speed = c;
        obj3.run();
    }
}
