
public class MergeOneIntoSecond {

	public static void main(String[] args) {

		int[] arr1={1,2,3};
		int[] arr2={1,2,3,9,8};
		int a_leng=arr1.length;
		int b_leng=arr2.length;
		int c_leng=a_leng+b_leng;
		int[] arr3=new int[c_leng];
		//for inserting arr1 into arr3
		
		for(int i=0;i<arr1.length;i++){
			arr3[i]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++){
			arr3[arr1.length+i]=arr2[i];
		}
		
		System.out.println("first array");
		for(int a:arr1)
			System.out.print(" "+a);
		
		System.out.println("\nSecond array");
		for(int a:arr2)
			System.out.print(" "+a);
		
		System.out.println("\n Merged 1 and 2 array");
		for(int a:arr3)
			System.out.print(" "+a);
		
	}

}
