import java.util.Scanner;

public class AreaRectangle{
    public static void main(String[] args){
        System.out.println("the area will be shown here ");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length ");
        int l = input.nextInt();

        System.out.print("Enter the breadth ");
        int b = input.nextInt();

        Area ar1 = new Area();

        ar1.setArea(l,b);
        System.out.println("the area is " + ar1.getArea());
    }
}