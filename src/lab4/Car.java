package lab4;

/**
 * This class represents a self-driving car that can be driven around a racetrack.
 * The car always knows its speed, its location on the track (as a row/column), and
 * its direction (north, south, east, or west).
 * <p>
 * The car also has three cameras (not represented by variables) that can see what's
 * happening in front of the car, to the car's left, and to the car's right.  The only
 * place these cameras are used is in the "drive" method, where the car has to choose
 * which direction to drive in based on what the cameras see around the car at the time.
 */
public class Car {
    /**
     * The current speed of the car.
     */
    private int speed;

    /**
     * The current row of the car on the track.
     */
    private int row;

    /**
     * The current column of the car on the track.
     */
    private int col;

    /**
     * The current direction the car is facing: 'N', 'E', 'S', or 'W'.
     */
    private char direction;

    /**
     * Constructor; sets initial/default values for instance variables.
     */
    public Car() {
        speed = 1;
        row = 0;
        col = 0;
        direction = 'N';
    }

    /**
     * Return the current speed of the car.
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Set the speed of the car.
     */
    public void setSpeed(int newSpeed) {
        // prevent negative speeds
        if (newSpeed >= 0) {
            speed = newSpeed;
        }
    }

    /**
     * Get the direction the car is facing.
     */
    public char getDirection() {
        return direction;
    }

    /**
     * Set the direction the car is facing.
     */
    public void setDirection(char newDirection) {
        if (newDirection == 'N' || newDirection == 'E' || newDirection == 'S' || newDirection == 'W') {
            direction = newDirection;
        }
    }

    /**
     * Get the row the car is in.
     */
    public int getRow() {
        return row;
    }

    /**
     * Get the column the car is in.
     */
    public int getCol() {
        return col;
    }

    /**
     * Set the (row, col) location of the car.
     */
    public void setLocation(int newRow, int newCol) {
        row = newRow;
        col = newCol;
    }

    /**
     * Determine which direction to drive next.  Directions are based
     * on which way the car is facing.  Return 0 to try to drive straight,
     * return -1 to try to turn left, 1 = turn right.
     * <p>
     * The three parameters below may be '.' for grass or '*' for the road
     * the car may drive on.
     *
     * @param leftOfMe:  the view from the camera on the left side of the car
     * @param aheadOfMe: the view from the camera on the front of the car
     * @param rightOfMe: the view from the camera on the right side of the car
     */
    public int drive(char leftOfMe, char aheadOfMe, char rightOfMe) {
        return 0; // Always try to drive straight ahead.
    }

    /**
     * Automatically called by println.
     */
    public String toString() {
        return "Car direction=" + direction + " row=" + row + " col=" + col;
    }
}
