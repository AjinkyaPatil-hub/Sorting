
public class BinarySerach {

	/**
	 * one condition for binary search is array must be sorted
	 * @param args
	 */
	
	public static void main(String[] args) {

		int[] a={1,2,3,4,5,6,7};
		int hi=a.length-1;
		int li=0,mi;
		int item=6;
		mi=(li+hi)/2;
		
		while(li<=hi){
			if(a[mi]==item){
				System.out.println("item found:"+mi+"at position");
				break;
			}
			else if(a[mi]<item){
				li=mi+1;
			}
			else{
				hi=mi-1;
			}
			mi=(li+hi)/2;
		}
	}

}
