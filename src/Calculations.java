import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Calculations implements ActionListener {
	
	JFrame frame=new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	
	Calculations(){
		frame.setVisible(true);
		frame.setTitle("Calculator");
				
		button1.setVisible(true);
		button1.setText("Add");
		button1.addActionListener(this);
		
		button2.setVisible(true);
		button2.setText("Subtract");
		button2.addActionListener(this);
		
		button3.setVisible(true);
		button3.setText("Multipy");
		button3.addActionListener(this);
		
		button4.setVisible(true);
		button4.setText("Divide");
		button4.addActionListener(this);
		
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		
		frame.add(panel);
		frame.pack();
		
		String number = JOptionPane.showInputDialog("What number do you want to use?");
		int num= Integer.parseInt(number);
		System.out.println(num);
		
		JOptionPane.showMessageDialog(null, "Choose which operation to do");
		
		
	}
	
	public static void main(String[] args) {

		Calculations cal = new Calculations();
		
		
}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		

}
}