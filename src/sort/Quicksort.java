package sort;

public class Quicksort {//øÏÀŸ≈≈–Ú

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quicksort qc = new Quicksort();
		int order[] = {2,5,3,1,4,6,8,7};
		qc.quickSort(order);
		for(int i = 0; i < order.length; i++) {
			System.out.print(order[i]+",");
		}
	}
	public void quickSort(int...order) {
		quickSort(0,order.length-1,order);
	}
	private void quickSort(int low, int high, int ...order) {
		if(low < high) {
			int pivot = partition(low,high,order);
			quickSort(low,pivot - 1,order);
			quickSort(pivot + 1, high ,order);
		}
	}
	private int partition(int low, int high, int ...order) {
		int pivot = order[low];
		while(low < high) {
			while(low < high && order[high] >= pivot) {
				high --;
			}
			swap(low,high,order);
			while(low < high && order[low] < pivot) {
				low ++;
			}
			swap(low,high,order);
		}
		
		return low;
	}
	private void swap(int oneIndex, int anotherIndex, int []order) {
		int temp = order[oneIndex];
		order[oneIndex] = order[anotherIndex];
		order[anotherIndex] = temp;
	}

}
