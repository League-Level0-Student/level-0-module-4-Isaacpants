import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
	
	 String Score = JOptionPane.showInputDialog("How many did you get right one through ten");
	
	int score = Integer.parseInt(Score);
	if(score==10) {
		JOptionPane.showMessageDialog(null, "U studied hard");
		
	}else if(score==9) {
		JOptionPane.showMessageDialog(null, "U did good");
		
		
	}if(score==8) {
		JOptionPane.showMessageDialog(null, "U did kinda good");
		
	}else if(score==7) {
		JOptionPane.showMessageDialog(null, "U could study more");
		
		
	}	if(score==6) {
		JOptionPane.showMessageDialog(null, "U tried");
		
	}else if(score==5) {
		JOptionPane.showMessageDialog(null, "U need to study");
		
		
	}if(score==4) {
		JOptionPane.showMessageDialog(null, "Try harder");
		
	}else if(score==3) {
		JOptionPane.showMessageDialog(null, "More effort");
}else if(score==2) {
	JOptionPane.showMessageDialog(null, "pay attention");
	
	
}if(score==1) {
	JOptionPane.showMessageDialog(null, "study a ton");
	
}else if(score==0) {
	JOptionPane.showMessageDialog(null, "try harder and study");
	


}
	
}
}
