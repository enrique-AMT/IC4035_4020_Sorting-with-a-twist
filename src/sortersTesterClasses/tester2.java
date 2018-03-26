package sortersTesterClasses;

import sorterClasses.CombSortSorter;

public class tester2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CombSortSorter<Integer> sorter = new CombSortSorter<>();
		IntegerComparator1 cmp1 = new IntegerComparator1();
		IntegerComparator2 cmp2 = new IntegerComparator2();
		Integer[] m = {5, 9, 20, 22, 20, 5, 4, 13, 17, 8, 22, 1, 3, 7, 11, 9, 10};
		System.out.println("Unsorted Array: ");
		print(m);
		sorter.sort(m, cmp1);
		System.out.println("\nSorted in ascending order using Comb Sort: ");
		print(m);
		sorter.sort(m, cmp2);
		System.out.println("\nSorted in descending order using Comb Sort: ");
		print(m);
	}
	
	public static void print(Integer[] arr) {
		for(int i=0; i<arr.length;i++)
			System.out.print(arr[i] + " ");
		System.out.println("");
	}
}
