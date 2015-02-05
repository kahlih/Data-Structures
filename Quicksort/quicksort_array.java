/* Building a quicksort algorithm utilizing 
   my own Node/List structure is a work in progress.
   This implementation uses an array and is my outline
   for the current linked list version of quick_sort
   I'm working on */

public class quicksort_array{
	
	public static void main(String[] args){
		int [] array = {6,3,1,2};

		System.out.println("Before Sort: ");
		print_array(array);
		quicksort(array, 0, array.length - 1);
		System.out.println("After Sort: ");
		print_array(array);

		int[] array1 = {4,2,1,1,18,5,7,9,3,2};

		System.out.println("Before Sort: ");
		print_array(array1);
		quicksort(array1, 0, array1.length - 1);
		System.out.println("After Sort: ");
		print_array(array1);
	}

	public static void quicksort(int[] x, int low, int high){

		int piv = low + ((high - low)/2);
		int tmp;
		int i = low; int j = high;
		while(i<=j){

			while (x[i] < x[piv]){
				++i;
			}

			while (x[j] > x[piv]){
				--j;
			}

			//swap numbers
			if (i <= j){
				tmp = x[i];
				x[i] = x[j];
				x[j] = tmp;
				++i;
				--j;
			}

		}

		if (low < j)
			quicksort(x, low, j);

		if (i < high)
			quicksort(x, i, high);

	}

	public static void print_array(int [] x){

		for (int i = 0; i < x.length; ++i){
			System.out.print(x[i] + ", ");
		}
		System.out.println();
	}
}