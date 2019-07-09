package sort;

public class SIS {//÷±Ω”≤Â»Î≈≈–Ú

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int order[] = {2,5,3,1,4,6,8,7};
		insertsort(order);
		for(int i = 0; i < order.length; i++) {
			System.out.print(order[i]+",");
		}

	}
	public static void insertsort(int []order) {
		int length = order.length;

		for(int i = 1; i < length; i++) {
			if(order[i]<order[i-1]){
				int empty = i;
				int x = order[i];
				for(int j = i-1; j>=0 && order[j] > x; j--) {
					empty = j;
					order[j+1] = order[j];
					
				}		
				order[empty] = x;
				
			}
		}
	}

}
