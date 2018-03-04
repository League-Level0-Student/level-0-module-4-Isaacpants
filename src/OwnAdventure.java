import javax.swing.JOptionPane;

public class OwnAdventure {
	public static void main(String[] args) {

		String RorL = JOptionPane.showInputDialog("U r in a forest and there is a fork in the road do u want to go right or left");
if(RorL.equals("left")) {
	
	String Lake = JOptionPane.showInputDialog("U find a Lake next to the forest do u drink or not");
	
	if(Lake.equals("no")) {
		JOptionPane.showMessageDialog(null, "U die of thirst U LOSE");
		
	}else {
		JOptionPane.showMessageDialog(null, "U LIVE");
		
	}
}



else {

			String House = JOptionPane.showInputDialog("U find a house next to the forest it is locked do u want to go in or not");
			if(House.equals("yes")) {
				
				JOptionPane.showMessageDialog(null, "Someone is inside they kill u YOU LOSE");
				
			}else {
				
				JOptionPane.showMessageDialog(null, "There is a storm it kills u YOU LOSE");
			}
		}

	}
}
