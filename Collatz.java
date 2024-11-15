// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int N = Integer.parseInt(args[0]);
		String mode = args[1];
		int counter = 1;
		if (mode.equals("v")) System.out.println("1 4 2 1 (4)");
		for (int i = 2; i < (N + 1); i++){
			int steps = 1;
			int currentN = i;
			while (currentN != 1){
				if (mode.equals("v")) System.out.print(currentN + " ");
				if (currentN % 2 == 0) currentN /= 2;
				else currentN = (currentN * 3) + 1;
				steps++;
			}
			if (currentN ==1) counter++;
			if (mode.equals("v")) System.out.println("1 (" + steps + ")");
		}
		if (counter == N){
			System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
		} 
	}
}
