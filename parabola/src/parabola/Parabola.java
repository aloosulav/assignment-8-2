package parabola;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Parabola extends  JFrame{

	
	public static class GraphPanel extends JPanel{
		
		protected void paintComponent(Graphics g){
		g.drawLine(50,200,350,200);
		g.drawString("x",360,200);
		g.drawLine(200, 0, 200, 300);
		g.drawString("y", 200, 310);
	Polygon p=new Polygon ();
	double scaleFactor = 0.1;
	for (int x=-100; x<=100; x++) {
	p.addPoint(x+200, 200- (int)(scaleFactor *x *x));
	}
	g.drawPolygon(p);
	
}
}
	public static void main(String[]args){
		
			Parabola frame=new Parabola();
			frame.setTitle("PARABOLA");
			frame.setVisible(true);
			frame.setSize(new Dimension(500,500));	
			frame.add(new GraphPanel());
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
