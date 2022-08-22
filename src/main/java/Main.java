import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Garland ny = new Garland(scanner.nextInt());
        System.out.println(ny.countLightBulb());
    }
}
