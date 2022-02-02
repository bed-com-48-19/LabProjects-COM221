public class Main{
    public static void main(String[] args){
        ThreeDObjects p1 = new Cylinder(2, 11);
        System.out.println();
       System.out.println("The area of the cylinder is " + p1.getArea());
       System.out.println("The volume of cylinder is " + p1.getVolume());
       System.out.println("The perimeter of cylinder is"  + p1.getPerimeter());
    }
}