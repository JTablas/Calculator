import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculations implements ActionListener {
	
	JFrame frame=new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	
	JTextField input1= new JTextField(5);
	JTextField input2= new JTextField(5);
	
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
		
		
		
		panel.add(input1);
		panel.add(input2);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		
		frame.add(panel);
		frame.pack();
		
		JOptionPane.showMessageDialog(null, "Put in two number, then select which operation to do.");
		
		
	}
	
	public static void main(String[] args) {

		Calculations cal = new Calculations();

		
}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(input1.getText());
		int num2 = Integer.parseInt(input2.getText());
		
		if(arg0.getSource()==button1){
			int num3 = num+num2;
			System.out.println(num3);
		} else if(arg0.getSource()==button2){
			int num3 = num-num2;
			System.out.println(num3);
		} else if(arg0.getSource()==button3){
			int num3 = num*num2;
			System.out.println(num3);
		} else if(arg0.getSource()==button4){
			int num3 = num/num2;
			System.out.println(num3);
		}
}
}