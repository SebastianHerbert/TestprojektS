import java.awt.Color;
import java.awt.Container;
//http://www.java2s.com/Code/JavaAPI/java.awt/SpringLayoutConstraintssetWidthSpringwidth.htm
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Spring;
import javax.swing.SpringLayout;

public class Frame  {
	
	// initialize JPanel
    JPanel mainPannel = new JPanel();
    // initialize Buttons
    JButton filePicker = new JButton("Choose File");
    JButton addRevenue = new JButton("Einname");
    JButton addExpenditure = new JButton("Ausgabe");


    public Frame() {
    	
    	JFrame frame = new JFrame();
    	Container contentPane = frame.getContentPane();
        SpringLayout layout = new SpringLayout();
        
        // Button position
        //layout.putConstraint(SpringLayout.WEST, filePicker,5,SpringLayout.WEST, contentPane);
       //layout.putConstraint(SpringLayout.NORTH, filePicker,5, SpringLayout.NORTH, contentPane);
        
     //   layout.putConstraint(SpringLayout.WEST, addRevenue,5,SpringLayout.WEST, contentPane);
      //  layout.putConstraint(SpringLayout.NORTH, addRevenue,5, SpringLayout.SOUTH, filePicker);
        
      //  layout.putConstraint(SpringLayout.WEST, addExpenditure,5,SpringLayout.WEST, contentPane);
     //   layout.putConstraint(SpringLayout.NORTH, addExpenditure,5, SpringLayout.SOUTH, addRevenue);
       
        int offset = 5;
        contentPane.setLayout(layout);
        Spring widthS = Spring.constant(120);
        Spring heightS = Spring.constant(25);
        
        Spring x = Spring.constant(offset);
        Spring y = Spring.constant(offset);
        
       
     //  filePicker.contains(800, 250);
        contentPane.add(filePicker,  new SpringLayout.Constraints(x,y, widthS, heightS ));
        contentPane.add(addRevenue,  new SpringLayout.Constraints(x,y.sum (x, heightS), widthS, heightS ));
        contentPane.add(addExpenditure,  new SpringLayout.Constraints(x,y.sum(y.sum (x, heightS), heightS), widthS, heightS ));
       
        // Adding to JFrame
    	//contentPane.add(filePicker);
    	//contentPane.add(addRevenue);
    	//contentPane.add(addExpenditure);

        // Frame properties
    	frame.setSize(400, 400);
    	//contentPane.setBackground(Color.green);
    	frame.setTitle("Summ");
    	frame.setLocationRelativeTo(null);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setVisible(true);
    }
}
