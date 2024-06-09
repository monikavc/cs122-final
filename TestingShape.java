
import java.util.Scanner;

public class TestingShape {

	public static void main(String[] args) {
		System.out.println("Part 1:");
		Circle c1 = new Circle("yellow", 2.5);
		Circle c2 = new Circle("red", 0.5);
		Triangle r1 = new Triangle("blue", 3.0, 5.0);
		Triangle r2 = new Triangle("blue", 1.5, 6.0);
		System.out.println(c1);
		System.out.printf("Area is %.3f", c1.computeArea());
		System.out.println();
		System.out.println(r1);
		System.out.printf("Area is %.3f", r1.computeArea());
		System.out.println();

		//Part2: add your code here ////////////////////////////////
        System.out.println();
        System.out.println("Part 2: ");

        Shape[] shapeList = new Shape[4];

        shapeList[0] = c1;
        shapeList[1] = c2;
        shapeList[2] = r1;
        shapeList[3] = r2;
        for (int i = 0; i < shapeList.length; i++)      // prints out each shape's area
            System.out.printf("Area of the shape " + (i + 1) + " is %.3f\n", shapeList[i].computeArea());

		//Part3: add your code here ////////////////////////////////
        System.out.println();
        System.out.println("Part 3: ");
        Circle[] circleList = new Circle[3];
        circleList[0] = c1;
        circleList[1] = c2;

        Scanner scan = new Scanner(System.in);
        System.out.println("Color of circle: ");
        String userColor = scan.next();

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Radius of circle: ");
        double userRadius = scan2.nextDouble();

        circleList[2] = new Circle(userColor, userRadius);

        selectionSort(circleList);
        
        for (int i = 0; i < circleList.length; i++)  // sorts circle objects (ascending order) based on radius
            System.out.println(circleList[i]);
        System.out.println();

		//Part4: add your code here /////////////////////////////////
        System.out.println("Part 4: ");

        selectionSortD(circleList);

        for (int i = 0; i < circleList.length; i++)  // sorts circle objects (descending order) based on radius
            System.out.println(circleList[i]);

        scan.close();
        scan2.close();
	}

    public static void selectionSortD(Comparable[] list) {
        // this method sorts from largest to smallest
		int min;
		Comparable temp;

		for (int index = 0; index < list.length - 1; index++) {
			// find the nth minimum value
			min = index;
			for (int scan = index + 1; scan < list.length; scan++)
				if (list[scan].compareTo(list[min]) > 0)
					min = scan;

			// Swap the values
			temp = list[min];
			list[min] = list[index];
			list[index] = temp;
		}
	}

	public static void selectionSort(Comparable[] list) {
        // this method sorts from smallest to largest
		int min;
		Comparable temp;

		for (int index = 0; index < list.length - 1; index++) {
			// find the nth minimum value
			min = index;
			for (int scan = index + 1; scan < list.length; scan++)
				if (list[scan].compareTo(list[min]) < 0)
					min = scan;

			// Swap the values
			temp = list[min];
			list[min] = list[index];
			list[index] = temp;
		}
	}
}