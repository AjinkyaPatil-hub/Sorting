
public class BubbleSort {
	
	public void sortByBubble(int arr[]){
		int temp;
		
		for(int i=0;i<arr.length;i++){
			int flag=0;
			//as we know after 1st round the last element is the largest so i will be - from the list
			//it will not check 
			//-i will used to traverse the list only till the list is unsorted
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=1;
				}
			}
			//this is used if the list gets sorted it will not sort for full list time management 
			if(flag==0)
				break;
		}
		System.out.println("\nbubble sort");
		for(int o:arr)
			System.out.print(" "+o);
	}
}
