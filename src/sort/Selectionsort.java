package sort;

public class Selectionsort {

	public static void main(String[] args) {//—°‘Ò≈≈–Ú
		// TODO Auto-generated method stub
		Selectionsort sc = new Selectionsort();
		int order[] = {2,5,3,1,4,6,8,7};
		sc.selectionsort(order);
		for(int i = 0; i < order.length; i++) {
			System.out.print(order[i]+",");
		}

	}
	public void selectionsort(int []order) {
		int length = order.length;
		for(int i = 0; i < length-1; i++) {
			int min = i;
			for(int j = i+1; j < length;j++) {
				if(order[j] < order[min]) {
					min =j;
				}
			}
			if(min != i) {
				swap(i,min,order);
			}
		}
	}
	private void swap(int oneIndex, int anotherIndex, int []order) {
		int temp = order[oneIndex];
		order[oneIndex] = order[anotherIndex];
		order[anotherIndex] = temp;
	}

}
