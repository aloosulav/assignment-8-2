package slider;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ScrollBarDemo extends JFrame{
private JPanel panel,displayPanel,displayPanel2;
private JLabel label, redlabel, bluelabel, greenlabel;
private JSlider sliderRed,sliderGreen,sliderBlue;
private int red, green , blue;

public ScrollBarDemo(){
	displayPanel=new JPanel();
	displayPanel2=new JPanel();
	displayPanel.setLayout(new BorderLayout());

	label=new JLabel("Show Colors");
	redlabel=new JLabel("RED");
	bluelabel=new JLabel("BLUE");
	greenlabel=new JLabel("GREEN");
	panel=new JPanel ();
	GridLayout gridLayout=new GridLayout(3,1);
	
	gridLayout.setVgap(30);
	panel.setLayout(gridLayout );
	panel.setBorder(new CompoundBorder(new TitledBorder("Choose colors"),
			new EmptyBorder(2, 2, 2, 2)));
	
	
	sliderRed=new JSlider (JSlider.HORIZONTAL,0,255,0);
	sliderRed.addChangeListener(new ChangeListener(){

		
		public void stateChanged(ChangeEvent e) {
			// TODO Auto-generated method stub
			red=((JSlider) e.getSource()).getValue();
			label.setForeground(new Color(red,green,blue));
		}
	});
	
	sliderGreen= new JSlider(JSlider.HORIZONTAL,0,255,0);
sliderGreen.addChangeListener(new ChangeListener(){

		
		public void stateChanged(ChangeEvent e) {
			// TODO Auto-generated method stub
			green=((JSlider) e.getSource()).getValue();
			label.setForeground(new Color(red,green,blue));
		}
	});
	sliderBlue=new JSlider(JSlider.HORIZONTAL,0,255,0);
sliderBlue.addChangeListener(new ChangeListener(){

		
		public void stateChanged(ChangeEvent e) {
			// TODO Auto-generated method stub
			blue=((JSlider) e.getSource()).getValue();
			label.setForeground(new Color(red,green,blue));
		}
	});
	
	panel.add(sliderRed);
	panel.add(sliderGreen);
	panel.add(sliderBlue);
	
	displayPanel.add(label,BorderLayout.NORTH);
	displayPanel.add(panel,BorderLayout.CENTER);
	add (displayPanel);
   
	setTitle("Sliders Demo");
	setSize(new Dimension(300,200));
	setVisible(true);
	pack();
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
}


}
