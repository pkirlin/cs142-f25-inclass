package functions;

public class FunctionPractice {
    public static double distance(int x1, int y1, int x2, int y2) {
        // calculate Euclidean distance from (x1, y1) to (x2, y2)
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    public static int sumRange(int lower, int upper) {
        int sum = 0;
        for (int ctr = lower; ctr <= upper; ctr++) {
            sum = sum + ctr; // or sum += ctr
        }
        return sum;
    }

    public static double totalDistance(int[] points) {
        double sum = 0;
        for (int ctr = 0; ctr < points.length - 2; ctr += 2) {
            double dist = distance(points[ctr], points[ctr+1], points[ctr+2], points[ctr+3]);
            sum += dist;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Write code here to test each function:

        System.out.println("Testing distance:");
        System.out.println(distance(1, 2, 3, 4)); // should be about 2.828
        System.out.println(distance(3, 7, -5, 1));  // should be 10.0

        // test sumRange
        System.out.println(sumRange(1, 9));

        // Here is an array you can use for the totalDistance() function:
        int[] array = new int[] { 1, 2, 3, -4, -3, 0 };
        System.out.println(totalDistance(array));
    }
}
