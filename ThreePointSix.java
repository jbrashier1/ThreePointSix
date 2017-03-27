import javax.swing.JOptionPane;
public class ThreePointSix { 
	public enum Months {January, February, March, April, May, June, July, August, September, October, November, December }
	public static void main(String[] args) { 
		Months[] choices = { Months.January, Months.February, Months.March, Months.April, Months.May, Months.June, Months.July, Months.August, Months.September, Months.October, Months.November, Months.December }; 
		Months input = (Months) JOptionPane.showInputDialog(null,"What Month is it?", "Month:", JOptionPane.INFORMATION_MESSAGE, null, choices, choices[11]); 
		while (input!=null) {
			switch(input) {
				case December: case January: case February:
					JOptionPane.showMessageDialog(null, "Do you want to build a snow man?");
					break;
				case March: case April: case May:
					JOptionPane.showMessageDialog(null, "Happy Spring days!");
					break;
				case June: case July: case August:
					JOptionPane.showMessageDialog(null, "It's a summer time.");
					break;
				case September: case October: case November:
					JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
					break;
			}
			input = (Months) JOptionPane.showInputDialog(null,"What Month is it?", "Month:", JOptionPane.INFORMATION_MESSAGE, null, choices, choices[11]);
		} 
	}
}
