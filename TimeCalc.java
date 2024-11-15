public class TimeCalc {
    public static void main(String[] args) {
        String time = args[0];
        int minutesToAdd = Integer.parseInt(args[1]);

        int originalHour = (time.charAt(0) - '0') * 10 + (time.charAt(1) - '0');
        int originalMinute = (time.charAt(3) - '0') * 10 + (time.charAt(4) - '0');

        int newHour = (((originalHour * 60) + originalMinute + minutesToAdd) / 60) % 24;
        String newHour1 = "" + newHour;

        if (newHour < 10) newHour1 = "0" + newHour;
        
        int newMinute = ((originalHour * 60) + originalMinute + minutesToAdd) - ((((originalHour * 60) + originalMinute + minutesToAdd) / 60) * 60);
        String newMinute1 = "" + newMinute;
        if (newMinute < 10) newMinute1 = "0" + newMinute;

        System.out.println(newHour1 + ":" + newMinute1);        
    }
}
