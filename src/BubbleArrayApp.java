
public class BubbleArrayApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BubbleArray arr = new BubbleArray(5);
		 arr.insertValue(30);
		 arr.insertValue(111);
		 arr.insertValue(21);
		 arr.insertValue(12);
		 arr.insertValue(201);
		 
		 arr.displayValues();
		 arr.sortValues();
		 System.out.println("After sorting");
		 arr.displayValues();

	}

}
