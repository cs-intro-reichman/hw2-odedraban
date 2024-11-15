// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int termNum = Integer.parseInt(args[0]);
		double sum = 0.0;
		if (termNum == 1) sum = 1.0;
		if ((termNum % 2) == 0){
			double plusDenominator = 1.0;
			for (int i = 0; i < (termNum / 2); i++){
				sum += (1.0 / plusDenominator);
				plusDenominator = plusDenominator + 4.0;
			}
			double minusDenominator = 3.0;
			for (int j = 0; j < (termNum / 2); j++){
				sum -= (1.0 / minusDenominator);
				minusDenominator = minusDenominator + 4.0;
			}
		}
		else {
			if ((termNum % 2) != 0){
				double plusDenominator = 1.0;
				for (int i = 0; i < ((termNum + 1) / 2); i++){
					sum += (1.0 / plusDenominator);
					plusDenominator = plusDenominator + 4.0;
				}
				double minusDenominator = 3.0;
				for (int j = 0; j < (termNum / 2); j++){
					sum -= (1.0 / minusDenominator);
					minusDenominator = minusDenominator + 4.0;
				}
			}
		}
		double approxPI = sum * 4.0;
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + approxPI);
	}
}
