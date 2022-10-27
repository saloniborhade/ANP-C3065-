package question3;


public class ArraySortDemo {
	public void sortArray(double[] array) {
		double temp=0;
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]<array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
		
			}
		}
		System.out.println("Elements of array in sorted order: ");
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]+" ");	
		}
	}
	public static void main(String[] args) {
		double array[]= {1.2, 2.3, 4.5,0.8,0.9};
		ArraySortDemo demoObj=new ArraySortDemo();
		demoObj.sortArray(array);
	}

}
