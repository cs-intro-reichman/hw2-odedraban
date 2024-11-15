// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String word = args[0];
            String UpperCaseWord = word.toUpperCase();
            int repeatNum = Integer.parseInt(args[1]);
            String anLetters = "AEFHILMNORSX";
            for (int i = 0; i < word.length(); i++){
                if (anLetters.indexOf(UpperCaseWord.charAt(i)) == -1){
                        System.out.println("Give me a  " + UpperCaseWord.charAt(i) + ": " + UpperCaseWord.charAt(i) + "!");
                }
                else {
                        System.out.println("Give me an " + UpperCaseWord.charAt(i) + ": " + UpperCaseWord.charAt(i) + "!");

                }
                }
                System.out.println("What does that spell?");
                for (int j = 0; j < repeatNum; j++){
                        System.out.println(UpperCaseWord + "!!!");
                }
            }
        }

