import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Slider extends JFrame {

	JTextField show;
	JSlider slider;
	public Slider() {
		
		slider= new JSlider(0,100,50);
		slider.setMinorTickSpacing(2);
		slider.setPaintTicks(true);
		slider.setMajorTickSpacing(10);
		slider.setPaintTrack(true);
		
		slider.addChangeListener(new change());
		show= new JTextField("0.0");
		show.setEditable(false);
		show.setHorizontalAlignment(JTextField.CENTER);
		show.setFont(new Font("Consola",Font.BOLD,30));
		show.setForeground(new Color(200,36,85));
		
		
		
		slider.setPaintLabels(true);
		
		
		add(slider);
		add(show);
		setTitle("Slider");
		setSize(300,300);
		setLayout(new GridLayout(2,1));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	public class change implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent e) {

			if(e.getSource()==slider) {
				show.setText(" "+slider.getValue());
			}
			
		}
		
	}
	public static void main(String[] args) {


		new Slider();
	}

}
