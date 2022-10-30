package question1;

public class ArrayDemo {
	public int[] manipulateIntegerArray(int[] array) {
		int newArr[]=new int[5];
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]+5);
		}
		return newArr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};    //single Dimension Array
		
		ArrayDemo demoObj=new ArrayDemo();
		demoObj.manipulateIntegerArray(arr);

	}

}
