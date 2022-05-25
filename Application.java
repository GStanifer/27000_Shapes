package lab8;

import java.util.Scanner;

public class Application {

	public static void main(String args[])
	{
		// DATA
		Shape[] shapes = new Shape[10];
		int nextIDNumber = 1;
		boolean exit = false;
		int selection;
		Scanner input = new Scanner(System.in);
		int id;
		double scaleFactor = 1;
		int x, y;
		double base, height, width, length, radius;
		boolean found = false;

		// ALGORITHM
		// loop until user exits
		do
		{
			// display menu
			System.out.println("1 - Add a new circle");
			System.out.println("2 - Add a new rectangle");
			System.out.println("3 - Add a new right triangle");
			System.out.println("4 - Delete a shape");
			System.out.println("5 - Delete all shape");
			System.out.println("6 - Display all shapes");
			System.out.println("7 - Move a shape");
			System.out.println("8 - Enter a scale factor");
			System.out.println("9 - Scale all shapes");
			System.out.println("10 - Exit program");

			// get user choice
			selection = input.nextInt();
			while (selection < 1 || selection > 10)
			{
				System.out.println("Please enter valid choice");
				selection = input.nextInt();
			}

			// switch on selection
			switch(selection)
			{
			case 1:
				// ADD NEW CIRCLE
				// get size from user (one variable)
				System.out.println("Enter the radius: ");
				radius = input.nextDouble();
				while (radius <= 0)
				{
					System.out.println("Invalid number, please enter positive number");
					radius = input.nextDouble();
				}
				// get location from user (two variables)
				System.out.println("Enter X location: ");
				x = input.nextInt();
				while (x < 0)
				{
					System.out.println("Invalid number, please enter positive number or zero");
					x = input.nextInt();
				}

				System.out.println("Enter Y location: ");
				y = input.nextInt();
				while (y < 0)
				{
					System.out.println("Invalid number, please enter positive number or zero");
					y = input.nextInt();
				}
				// set found to false
				found = false;

				// loop through array
				for (int i = 0; i < shapes.length; i++)
				{
					// if this is not a valid object
					if (shapes[i] == null)
					{
	 					// create new RightTriangle object and assign to current array element
						shapes[i] = new Circle(nextIDNumber++, x, y, radius);

						// set found to true
						found = true;

						// break out of loop
						break;
					}
				}

				// if not found, give error message
				if (!found)
				{
					System.out.println("No more room");
				}

				// break out of switch statement
				break;

			case 2:
				// ADD NEW RECTANGLE
				// get size from user (two variables)
				System.out.println("Enter the length: ");
				length = input.nextDouble();
				while (length <= 0)
				{
					System.out.println("Invalid number, please enter positive number");
					length = input.nextDouble();
				}

				System.out.println("Enter the width: ");
				width = input.nextDouble();
				while (width <= 0)
				{
					System.out.println("Invalid number, please enter positive number");
					width = input.nextDouble();
				}

				// get location from user (two variables)
				System.out.println("Enter X location: ");
				x = input.nextInt();
				while (x < 0)
				{
					System.out.println("Invalid number, please enter positive number or zero");
					x = input.nextInt();
				}

				System.out.println("Enter Y location: ");
				y = input.nextInt();
				while (y < 0)
				{
					System.out.println("Invalid number, please enter positive number or zero");
					y = input.nextInt();
				}

				// set found to false
				found = false;

				// loop through array
				for (int i = 0; i < shapes.length; i++)
				{
					// if this is not a valid object
					if (shapes[i] == null)
					{
	 					// create new RightTriangle object and assign to current array element
						shapes[i] = new Rectangle(nextIDNumber++, x, y, length, width);
						// set found to true
						found = true;

						// break out of loop
						break;
					}
				}

				// if not found, give error message
				if (!found)
				{
					System.out.println("No more room");
				}

				// break out of switch statement
				break;

			case 3:
				// ADD NEW RIGHT TRIANGLE
				// get size from user (two variables)
				System.out.println("Enter the base: ");
				base = input.nextDouble();
				while (base <= 0)
				{
					System.out.println("Invalid number, please enter positive number");
					base = input.nextDouble();
				}

				System.out.println("Enter the height: ");
				height = input.nextDouble();
				while (height <= 0)
				{
					System.out.println("Invalid number, please enter positive number");
					height = input.nextDouble();
				}

				// get location from user (two variables)
				System.out.println("Enter X location: ");
				x = input.nextInt();
				while (x < 0)
				{
					System.out.println("Invalid number, please enter positive number or zero");
					x = input.nextInt();
				}

				System.out.println("Enter Y location: ");
				y = input.nextInt();
				while (y < 0)
				{
					System.out.println("Invalid number, please enter positive number or zero");
					y = input.nextInt();
				}

				// set found to false
				found = false;

				// loop through array
				for (int i = 0; i < shapes.length; i++)
				{
					// if this is not a valid object
					if (shapes[i] == null)
					{
	 					// create new RightTriangle object and assign to current array element
						shapes[i] = new RightTriangle(nextIDNumber++, x, y, base, height);

						// set found to true
						found = true;

						// break out of loop
						break;
					}
				}

				// if not found, give error message
				if (!found)
				{
					System.out.println("No more room");
				}

				// break out of switch statement
				break;

			case 4:
				// DELETE ONE SHAPE
				
				System.out.println("Enter the shape ID you would like to delete: ");
				id = input.nextInt();
				
				found = false;

				// loop through array
				for (int i = 0; i < shapes.length; i++)
				{
					// if this is a valid object and the correct object
					if (shapes[i] != null && shapes[i].getID() == id)
					{
						// delete object
						shapes[i] = null;

						found = true;

						break;
					}
				

				else
					System.out.println("Error, shape with this ID not found.");
			}
				break;
				

			case 5:
				// DELETE ALL SHAPES
				for (int i=0;i <shapes.length;i++) {
					if (shapes[i]!=null) {
						shapes[i]=null;
					}
				}
				break;

			case 6:
				// DISPLAY ALL SHAPES
				// print header
				System.out.println("Here are our shapes");

				System.out.print("\n");
				for (int i = 0; i < shapes.length; i++) {
					if (shapes[i] != null){
						System.out.print("| ID: "+shapes[i].getID());
						System.out.print("\t| X Location: "+shapes[i].getxLoc());
						System.out.print("\t| Y Location: "+shapes[i].getyLoc());
						System.out.print("\t| Area: "+shapes[i].getArea());
						System.out.print("\t| Perimeter: "+shapes[i].getPerimeter());
						System.out.print("\n");
					}
				}
				
				System.out.print("\n");
				break;

			case 7:
				// MOVE A SHAPE
				
				System.out.println("Enter the ID of a shape to move: ");
				id = input.nextInt();
				System.out.println("Enter a new X location: ");
				x = input.nextInt();
				System.out.println("Enter a new Y location: ");
				y = input.nextInt();
				
				for(int i=0;i<shapes.length;i++) {
					if (shapes[i] != null && shapes[i].getID() == id){
						shapes[i].setxLoc(x);
						shapes[i].setyLoc(y);
						found = true;
						
						break;
					}
				}
				
				if (!found) {
					System.out.println("Error, shape not found.");
				}
				break;
				

			case 8:
				// ENTER A SCALE FACTOR
				System.out.println("Enter a value for the scale factor: ");
				scaleFactor = input.nextDouble();
				Shape.setSf(scaleFactor);
				break;

			case 9:
				// SCALE ALL SHAPES
				for (int i=0;i<shapes.length;i++) {
					if (shapes[i] != null) {
						shapes[i].scaleShape(scaleFactor);
					}
				}
				break;

			case 10:
				System.out.println("Are you sure you would like to exit?  Type y or n: ");
				char confirm = input.next().toLowerCase().charAt(0);
				if (confirm == 'y')
					exit = true;
				else 
					exit = false;
				break;
			}//End switch selection

		} while (!exit);

	}//End main 

}//End application class
