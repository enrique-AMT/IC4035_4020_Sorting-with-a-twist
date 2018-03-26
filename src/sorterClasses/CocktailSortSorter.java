package sorterClasses;

public class CocktailSortSorter<E> extends AbstractMaxValueSorter<E> {
	private boolean swapped=true;
	
	public CocktailSortSorter() {
		super("   Cocktail Sort");
	}
	@Override
	protected void relocateMaxValueToLastPositionAmongFirst(int i) {
		// TODO Auto-generated method stub
		for (int j=0; j < i-1; j++) {
			if (cmp.compare(arr[j], arr[j+1]) > 0)
				super.swapArrayElements(j, j+1);
			for(int k=i-1;k>0;k--)
				if(cmp.compare(arr[k],arr[k-1])<0)
					super.swapArrayElements(k, k-1);
		}
	}

}
