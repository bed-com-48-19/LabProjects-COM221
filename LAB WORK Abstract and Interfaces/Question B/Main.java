interface RegularPolygon {
    abstract public  int getNumSides();      
    abstract public double getSidelength();

}
interface Name{
    public void getName();
}
interface Polygon extends RegularPolygon {
         double sidelength = 1;
}
class EquilateralTriangle implements Name, Polygon{
  private double  sides, sidelength;
  EquilateralTriangle(int sides, double sidelength){
    this.sides = sides;
    this.sidelength = sidelength;
  }
  @Override
  public int getNumSides() {      
      return 3;
  }
  @Override
  public double getSidelength() {
      return sidelength;
  }
  @Override
  public void getName() {
    System.out.println("Name of the shape is triangle ");
  }
}
  class Main{
    public static void main(String []args) {  
      EquilateralTriangle Triangle = new EquilateralTriangle(3,6); 
      Triangle.getName();
      System.out.println("The shape's number of sides is "+ Triangle.getNumSides());
      System.out.println("It's side length is "+ Triangle.getSidelength());     
    }
  }