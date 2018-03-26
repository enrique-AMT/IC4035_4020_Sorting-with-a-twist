package sortersTesterClasses;

import java.util.Comparator;
import java.util.Scanner;

import sorterClasses.BubbleSortSorter;
import sorterClasses.CocktailSortSorter;
import sorterClasses.CombSortSorter;
import sorterClasses.HeapSortSorter;
import sorterClasses.InsertionSortSorter;
import sorterClasses.SelectionSortSorter;

public class SortTesterCustom {
	private static Scanner flags;
	public static void main(String[] args) {
		Comparator<Integer> cmp;
		Integer[] arr;
		flags = new Scanner(System.in);
		System.out.println("Please select your preferred method of sorting:\n1. Ascending\n2. Descending");
		cmp= IntCompChooser(flags.nextInt());
		System.out.println("Please enter your preferred sorting algorithm."
				+ "\n1. Bubble Sort\n2. Insertion Sort\n3. Selection Sort\n4. Heap Sort"
				+ "\n5. Cocktail Sort\n6. Comb Sort\n");
		int sortType= flags.nextInt();
		switch(sortType) {
		case 1:
			arr=arrFiller();
			BubbleSortSorter<Integer> b = new BubbleSortSorter<>();
			System.out.println("Please select your preferred method of sorting:\n1. Ascending\n2. Descending");
			cmp= IntCompChooser(flags.nextInt());
			b.sort(arr, cmp);
			print(arr);
			break;
		case 2:
			arr=arrFiller();
			InsertionSortSorter<Integer> i = new InsertionSortSorter<>();
			i.sort(arr, cmp);
			print(arr);
			break;
		case 3:
			arr=arrFiller();
			SelectionSortSorter<Integer> s = new SelectionSortSorter<>();
			s.sort(arr, cmp);
			print(arr);
			break;
		case 4:
			arr=arrFiller();
			HeapSortSorter<Integer> h = new HeapSortSorter<>();
			h.sort(arr, cmp);
			print(arr);
			break;
		case 5:
			arr=arrFiller();
			CocktailSortSorter<Integer> ck = new CocktailSortSorter<>();
			ck.sort(arr, cmp);
			print(arr);
			break;
		case 6:
			arr=arrFiller();
			CombSortSorter<Integer> cb = new CombSortSorter<>();
			
			cb.sort(arr, cmp);
			print(arr);
			break;
		default:
			System.out.println("Invalid sorting type provided. Please use numbers 1-6 to select sorting type.");
		}
		
	}
	private static Comparator<Integer> IntCompChooser(int choice) {
		Comparator<Integer> cmp= new IntegerComparator1(); //using default ascending comparator just in case.
		switch(choice) {
		case 1:
			cmp= new IntegerComparator1();
			break;
		case 2:
			cmp= new IntegerComparator2();
			break;
		default:
			System.out.println("Invalid type provided! Using ascending comparator...");
			
		}
	
		return cmp;
	}
	private static Integer[] arrFiller() {
		Scanner flags= new Scanner(System.in);
		System.out.println("Enter the size of the array.");
		Integer[] arr= new Integer[flags.nextInt()];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter value #" + i +":");
			arr[i]=flags.nextInt();
		}
		flags.close();
		return arr;
	}
	public static void print(Integer[] arr) {
		for(int i=0; i<arr.length;i++)
			System.out.print(arr[i] + " ");
		System.out.println("");
	}
}
