

public class TestFan {
    public static void main(String[] args) {
        //const
        final int SLOW=1;
        final int MEDIUM=2;
        final int FAST=3;
        final double DEFAULT_RADIUS=5;

        Fan fan1=new Fan();
        Fan fan2=new Fan();
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());

        fan1.setSpeed(FAST);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setStatus(true);

        fan2.setSpeed(MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("Blue");
        fan2.setStatus(false);

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
class Fan {
    //const
    final int SLOW=1;
    final int MEDIUM=2;
    final int FAST=3;
    final double DEFAULT_RADIUS=5;
    //fields
    private int speed=SLOW;
    private boolean status=false;
    private double radius=DEFAULT_RADIUS;
    private String color="blue";
    //getters
    public int getSpeed() {
        return speed;
    }
    public boolean getStatus() {
        return status;
    }
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
    //setters
    public void setSpeed(int speed) {
        this.speed=speed;
    }
    public void setStatus(boolean status) {
        this.status=status;
    }
    public void setRadius(double radius) {
        this.radius=radius;
    }
    public void setColor(String color) {
        this.color=color;
    }
    //constructor
    public Fan() {
    }
    //methods
    public String toString() {
        String info;
        if (status){
            info="Fan is on"+", speed is "+speed+", color is "+color;
        } else {
            info="Fan is off"+", radius is "+radius+", color is "+color;
        }
        return info;
    }
}