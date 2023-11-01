public class RobotSpeed {
    public static void speedTrack(double[] speed, String[] robots) {
        if (speed[0] > speed[1]) {
            System.out.println("Robot "+robots[0]+" is faster than robot "+robots[1]+".");
        }
        else if (speed[1] > speed[0]) {
            System.out.println("Robot "+robots[1]+" is faster than robot "+robots[0]+".");
        }
        else {
            System.out.println(robots[0]+" and "+robots[1]+" are the same speed.");
        }
    }
}
