public class Area{
    private int length;
    private int breadth;
    
    //a no arg constructor
    public Area(){

    }

    // constructor with arguments
    public Area(int newLength, int newBreadth){
        this.length=newLength;
        this.breadth=newBreadth;
    }
    // a method that returns the area

    public double getArea(){
        double area = length * breadth;
        return area;
    }


    public void setArea(int newLength, int newBreadth){
        this.length=newLength;
        this.breadth=newBreadth;
    }
}