import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame extends JFrame{
		private TextPanel textPanel;
		private Toolbar tb;
		public MainFrame(){
		super("Hello World");
		setLayout(new BorderLayout());
		textPanel = new TextPanel();
		tb = new Toolbar();
		tb.setStringListener(new StringListener(){

			public void textEmitted(String text) {
			textPanel.addText(text);	
			}
		});
		add(tb, BorderLayout.NORTH);
		add(textPanel, BorderLayout.CENTER);
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
}
