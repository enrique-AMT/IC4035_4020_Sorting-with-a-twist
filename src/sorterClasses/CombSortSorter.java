package sorterClasses;

public class CombSortSorter<E> extends AbstractMaxValueSorter<E> {

	public CombSortSorter() {
		super("   Comb Sort");
		// TODO Auto-generated constructor stub
	}
	@Override
	protected void relocateMaxValueToLastPositionAmongFirst(int i) {
		// TODO Auto-generated method stub
		int gap=i; //initialize gap separately
	
		while(gap!=1) //runs until gap is shrunk enough
		{	
			gap=getNextGap(gap); //next shrunk gap
			for(int j=0;j<i-gap;j++)
				if(cmp.compare(arr[j], arr[j+gap])>0)
					super.swapArrayElements(j, j+gap);
		}
		
	}
	private int getNextGap(int i) {
		//shrink gap based on shrink factor
		i=(i*10)/13; //shrink factor is 1.3, in order to get a return value of int, we will mult. by 10.
		if(i<1)
			return 1;
		return i;
	}
}
