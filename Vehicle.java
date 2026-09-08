public class Vehicle {
    private String name;
    private int speed;
    private int no;
    public Vehicle(String n, int s,int no){
        this.name=n;
        this.speed=s;
        this.no=no;
    }
    public void display() {
        System.out.println("Vehicle: " + name + ", Speed: " + speed + ", Number: " + no);
    }
    public void move(){
        System.out.println(name + " is moving at speed " + speed);
    }
}
