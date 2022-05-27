
public class C_Area {
	
	public static void main(String args[]) {
		
		int choice = Integer.parseInt(args[0]);
		
		//object for class
		OverloadingFunctionsForArea areaObj = new OverloadingFunctionsForArea();
		
		if (choice==1) {

			areaObj.computeArea(Float.parseFloat(args[1]),Float.parseFloat(args[2]));
		}
		else if(choice==2) {
			
			areaObj.computeArea(Float.parseFloat(args[1]));
		}
		else if(choice==3) {
		
			areaObj.computeArea(Integer.parseInt(args[1]));
		}
		else {
			System.out.println("Pease enter valid choice");
		}
	}
	
	//overloaded methods
	void computeArea(float a,float b) {
		System.out.println("Area of Rectangle : "+(a*b));
	}
	void computeArea(float r) {
		System.out.println("Area of Circle : "+(3.14*r*r));
	}
	void computeArea(int side) {
		System.out.println("Area of Square : "+side*side);
	}
}
