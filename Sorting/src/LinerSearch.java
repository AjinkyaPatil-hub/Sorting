
public class LinerSearch {

	public static void main(String[] args) {
		
		int[] arr={1,2,8,4,5,56,7};
		int search=55;
		int temp=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==search){
				System.out.println("element found"+i+"at position");
				temp=temp+1;
			}
		}
		if(temp==0){
			System.out.println("element is not in list");
		}
	}

}
