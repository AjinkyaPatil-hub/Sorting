
public class InsertingNumAtPos {
/*
 * 	at position 3 we want to insert 50 element
 */
	public static void main(String[] args) {
		
		int[] arr={1,8,6,7,6};
		int pos=3; int element=50;
//		
		int lastElement=arr.length-1;
		int lastElem=arr[lastElement];
		System.out.println(lastElem);
//		
		//traverse array and move the last element 
		for(int i=arr.length-1;i>pos-1;i--){
			arr[i]=arr[i-1];
		}
		arr[pos-1]=element;
		for(int a:arr)
			System.out.print(" "+a);
		
	}

}
