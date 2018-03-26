package sortersTesterClasses;

import dataGenerator.DataGenerator;
import sorterClasses.CocktailSortSorter;
import sorterClasses.InsertionSortSorter;

public class EnteroTester {
	public static void main(String[] args) {
		DataGenerator generator = new DataGenerator(5);
		Integer[] data = generator.generateData(); 
		@SuppressWarnings("rawtypes")
		Entero[] testArray = new Entero[5]; 


		for (int i = 0; i < 5; i++) {
			testArray[i] = new Entero<Integer>(data[i]);
			System.out.println(data[i]);
		}


		@SuppressWarnings("rawtypes")
		CocktailSortSorter<Entero> sorter = new CocktailSortSorter<>();
				sorter.sort(testArray, null);
				for(int j=0; j< 5; j++){
					System.out.print(testArray[j]);
				}
	}
}
