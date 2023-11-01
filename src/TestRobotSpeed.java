import java.util.Scanner;
public class TestRobotSpeed {
    public static void main(String[] Args) {
        double[] speeds = new double[2];
        String[] robots = new String[2];
        Scanner input = new Scanner(System.in);
        Scanner strings = new Scanner(System.in);
        System.out.print("Enter first robot name: ");
        robots[0] = strings.nextLine();
        System.out.print("Enter first robot speed: ");
        speeds[0] = input.nextDouble();
        System.out.print("Enter second robot name: ");
        robots[1] = strings.nextLine();
        System.out.print("Enter second robot speed: ");
        speeds[1] = input.nextDouble();

        RobotSpeed.speedTrack(speeds, robots);
    }
}