import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;


public class Toolbar extends JPanel implements ActionListener {
	private JButton Hbtn;
	private JButton Gbtn;
	private StringListener textListener;
	public Toolbar(){
		
		Hbtn = new JButton("Hello");
		Gbtn = new JButton("GoodBye");
		
		Hbtn.addActionListener(this);
		Gbtn.addActionListener(this);
		setLayout(new FlowLayout());
		
		add(Hbtn);
		add(Gbtn);
		
	}
	public void setStringListener(StringListener listener){
		this.textListener = listener;
	}
	public void actionPerformed(ActionEvent e) {
		JButton clicked = (JButton)e.getSource();
		
		if(clicked==Hbtn){
			if(textListener != null){
				textListener.textEmitted("Hello\n");
			}
		}
		else if (clicked==Gbtn)
		{if(textListener != null){
			textListener.textEmitted("GoodBye\n");
		}
			
		}
	}

}
