package flowLayoutDemo;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class FlowLayoutDemo extends JFrame {

	private JButton b1, b2,b3,b4,b5,b6;
	public FlowLayoutDemo(){
		JFrame frame=new JFrame ("Flow Layout Demo");
		JPanel panel1=new JPanel();
		JPanel panel2=new JPanel();
		b1=new JButton ("Button 1");
		b2=new JButton ("Button 2");
		b3=new JButton ("Button 3");
		b4=new JButton ("Button 4");
		b5=new JButton ("Button 5");
		b6=new JButton ("Button 6");
		panel1.add(b1);panel1.add(b2);panel1.add(b3);
		panel2.add(b4);panel2.add(b5);panel2.add(b6);
		
		frame.setLayout(new FlowLayout());		
		frame.setSize(new Dimension(600,500));
		
		
		frame.add(panel1 ); 
		
		frame.add(panel2);
		frame.setVisible(true);
		frame.pack();
	}
	public static void main (String[]args){
	new FlowLayoutDemo();
	
	
}
}
