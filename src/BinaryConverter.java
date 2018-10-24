import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class BinaryConverter implements MouseListener {
		public static void main(String[] args) {
			new BinaryConverter().getGoing();
		}
		
		JTextField input;
		JLabel output = new JLabel();
		private void getGoing() {
			JFrame Frame = new JFrame();
			JPanel Panel = new JPanel();
			input = new JTextField(20);
			JButton Button = new JButton("Yee");
			Button.addMouseListener(this);
			Panel.add(input);
			Panel.add(Button);
			Panel.add(output);
			output.setText("");
			Frame.add(Panel);
			Frame.pack();
			Frame.setVisible(true);
			
			
		}
		 String convert(String input) {
	          if(input.length() != 8){
	               JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
	               return "-";
	          }
	          String binary = "[0-1]+";    //must contain numbers in the given range
	          if (!input.matches(binary)) {
	               JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
	               return "-";
	          }
	          try {
	               int asciiValue = Integer.parseInt(input, 2);
	               char theLetter = (char) asciiValue;
	               return "" + theLetter;
	          } catch (Exception e) {
	               JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
	               return "-";
	          }
	     }
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			String stringText = input.getText();
			String result = convert(stringText);
			output.setText(result);
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
}
