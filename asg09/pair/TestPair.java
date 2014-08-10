package asg09.pair;

public class TestPair {
	public static void main(String [] args) {
		Pair<String> pair = new Pair<String>("theFirst", "theSecond");
		System.out.println(pair.toString());
		//Pair<int> pairInt = new Pair<int>(2,3); 
		Pair<Integer> pairInteger = new Pair<Integer>(4, 7);
		System.out.println(pairInteger.toString());
	}
	
}
