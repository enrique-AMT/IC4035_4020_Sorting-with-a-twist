package sortersTesterClasses;

public class Entero<E> implements Comparable<E>{
	       private int value; 
	       public Entero(int v) { value = v; }
	       public int getValue() { return value; } 
	       public String toString() { return value + ""; } 

	@Override
	public int compareTo(E arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
