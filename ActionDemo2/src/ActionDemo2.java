import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ActionDemo2 {
static Container c;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
JFrame f=new JFrame("Anonymous Ineer Class");
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setBounds(200,100,700,500);



c=f.getContentPane();
c.setBackground(Color.YELLOW);
c.setLayout(null);


JButton btn=new JButton("Yellow");
btn.setBounds(100,50,100,30);


JButton btn2=new JButton("Green");
btn2.setBounds(250,50,100,30);


JButton btn3=new JButton("Red");
btn3.setBounds(450,50,100,30);

c.add(btn);
c.add(btn2);
c.add(btn3);

	}

}
