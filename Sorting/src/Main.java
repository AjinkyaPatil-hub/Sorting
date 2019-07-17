
public class Main {

	public static void main(String[] args) {
		
		int[] arr={2,8,6,4,7,1};
		System.out.println("orginal array: ");
		for(int o:arr)
			System.out.print(" "+o);
	
//	// Bubble sort
	BubbleSort bs=new BubbleSort();
	bs.sortByBubble(arr);
	//Selection Sort
	String[] s={"ads","asd","frghbt","ettt"};
	
	
	
	SelectionSort ss=new SelectionSort();
	ss.sortBySelection(arr);
	ss.sortBySelectionStr(s);
	
	}

}
