package sort;

public class BS {//ц╟ещеепР bubble sort

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int order[] = {2,5,3,1,4,6,8,7};
		bubblesort(order);
		for(int i = 0; i < order.length; i++) {
			System.out.print(order[i]+",");
		}

	}
	public static void bubblesort(int []order) {
		int length = order.length;
		int x;
		for(int i = 0; i < length; i++) {
			for(int j = 0; j < length-i-1; j++) {
				if(order[j] > order[j+1]) {
					x = order[j];
					order[j] = order[j+1];
					order[j+1] = x;
				}
			}
		}
	}

}
