import java.util.Scanner;

public class LineComparisonComputationProgram {
    public static void main(String[] args) {
        Scanner Num = new Scanner(System.in);
        System.out.println("Enter the Co-ordinates of x1 & y1 : ");
        int x1 = Num.nextInt();
        int y1 = Num.nextInt();
        System.out.println("Enter the Co-ordinates of x2 & y2 : ");
        int x2 = Num.nextInt();
        int y2 = Num.nextInt();
        double length = Math.sqrt(( (x2 - x1) * (x2 - x1) ) + ( (y2 - y1) * (y2 - y1)));
        System.out.println("Length of the Line is : " + length + " Unit" );
    }
}
