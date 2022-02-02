public class Cylinder extends ThreeDObjects{
     private double radius;
     private double length;
     public Cylinder(){
     }
     public Cylinder(double radius, double length){
        this.radius=radius;
        this.length=length;
     }
     public double getRadius(){
        return radius;
     }
      public double getLength(){
        return length;
     }
     public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getArea() {
       return 2*Math.PI*radius*(length+radius);
    } 
    public double getVolume() {
      return Math.PI *radius*radius*length;
    }
    public double getPerimeter() {
        return 4*Math.PI*radius + 2*length;
    }
    @Override
    public String toString(){
       return "\n " + getArea() + "\n " + getPerimeter() + "\n " + getVolume();
    }
}