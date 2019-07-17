
public class SelectionSort {

	public void sortBySelection(int[] arr){
		int min;
		int temp=0;
		
		for(int i=0;i<arr.length;i++){
			min=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[min]){
					min=j;
				}
			}
			temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		System.out.println("\nSlection Sort:");
		for(int a:arr)
			System.out.print(" "+a);
		
	}
	
	public void sortBySelectionStr(String[] arr){
		int min;
		String temp="";
		
		for(int i=0;i<arr.length;i++){
			min=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j].compareTo(arr[min])<0){
					min=j;
				}
			}
			temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		System.out.println("\nSlection Sort:");
		for(String a:arr)
			System.out.print(" "+a);
		
	}
}
