// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		// In Java, the command-line arguments args[0], args[1], ... are represented
		// each by a string. In this program, the single "hh:mm" input is represented
		// by the single command-line string argument args[0]. 
		//   
		// The following statement handles the hours part of the input.
		// It concatenates the empty string "" with the leftmost hour-digit. 
		// It then concatenates the resulting string with the rightmost hour-digit,
		// and then uses parseInt to cast the resulting string as an int.
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));

		int new_hours = 0;
		String part_of_day = "";

		if (hours > 12) {
			new_hours = hours - 12;
			part_of_day = "PM";
		}
		else if (hours == 12) {
			new_hours = hours;
			part_of_day = "PM";
		}
		else {
			new_hours = hours;
			part_of_day = "AM";
		}

		if (minutes < 10) {
			System.out.println(new_hours + ":0" + minutes + " " + part_of_day);
		} 
		else {
			System.out.println(new_hours + ":" + minutes + " " + part_of_day);
		}
	}
}