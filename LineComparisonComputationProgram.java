import java.util.Scanner;

public class LineComparisonComputationProgram {
     static double line(int a1, int b1, int a2, int b2) {
        double measure;
        measure = Math.sqrt(((a2 - a1) * (a2 - a1)) + ((b2 - b1) * (b2 - b1)));
        return measure;
    	}

		public static void main(String[] args) {
        Scanner Num = new Scanner(System.in);
        Scanner ans = new Scanner(System.in);
		  System.out.println("Enter the Co-ordinates of x1 & y1 : ");
        int x1 = Num.nextInt();
        int y1 = Num.nextInt();
        System.out.println("Enter the Co-ordinates of x2 & y2 : ");
        int x2 = Num.nextInt();
        int y2 = Num.nextInt();
        Double length1 = Math.sqrt(( (x2 - x1) * (x2 - x1) ) + ( (y2 - y1) * (y2 - y1)));
        System.out.println("Length of the Line is : " + length1 + " Unit" );

//comparing two lines

		System.out.println("do you want to see if lines are equal (Y-yes/N-no): ");
        String stay = ans.nextLine();
        if (stay.equals("Y")) {
            System.out.println("Enter the Co-ordinates of x3 & y3 : ");
            int x3 = Num.nextInt();
            int y3 = Num.nextInt();
            System.out.println("Enter the Co-ordinates of x4 & y4 : ");
            int x4 = Num.nextInt();
            int y4 = Num.nextInt();
            Double length2;
            length2 = line(x3, y3, x4, y4);
            System.out.println("Length of the Line is : " + length2 + " Unit");
            if (length1.equals(length2)) {
                System.out.println("The length of lines are equal");
            }
				else {
                System.out.println("The lines are not equal");
            }
		}
	}
}
