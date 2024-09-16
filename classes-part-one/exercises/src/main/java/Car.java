public class Car {
    private int speed = 0;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            System.out.println("Speed must be a positive integer.");
        } else {
            this.speed = speed;
        }
    }
}
