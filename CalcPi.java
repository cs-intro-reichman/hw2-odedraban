// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		
	    int termNum = Integer.parseInt(args[0]);
		double sum = 0.0;

		if (termNum == 1) sum = 1.0;

		if (termNum != 1){
			for (int i = 0; i < termNum; i++){
				double denominator = (2.0 * i) + 1;
				if ((i % 2) == 0) sum += 1.0 / denominator;
				else sum -= 1.0 / denominator;
			}
		}
		
		double approxPI = sum * 4.0;
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + approxPI);
	}
}
