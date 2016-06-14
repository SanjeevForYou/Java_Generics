package practice;

public class MainClass {

	public static void main(String[] args) {

		OwnGeneric og = new OwnGeneric("12","33edd");
		
		System.out.println(og.getID());
		
		OwnGeneric og1 = new OwnGeneric(3,4444);
		System.out.println(og1.getID());

	}

}
