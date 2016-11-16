import java.awt.Color;

import javax.swing.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// test
		JFrame frame = new JFrame ("titel");
		SpringLayout layout = new SpringLayout();
		


		frame.setSize(500, 250);
		//frame.setLayout(layout);
		//frame.setVisible(true);
		//frame.add(new JLabel("Label: "));
		//frame.add(new JTextField("Text field", 15));
	    // main-Methode
	   
	        // Erzeugung eines neuen Dialoges
	        JDialog dialog = new JDialog();
	        dialog.setTitle("JPanel Beispiel");
	        dialog.setSize(450,300);

	        // Hier erzeugen wir unsere JPanels
	        JPanel einnahme = new JPanel();
	        JPanel ausgabe = new JPanel();
	        JPanel sonstiges = new JPanel();
	
	        // Hier setzen wir die Hintergrundfarben für die JPanels
	        einnahme.setBackground(Color.RED);
	        ausgabe.setBackground(Color.BLUE);
	        sonstiges.setBackground(Color.GREEN);
	 
	 
	        // Erzeugung eines JTabbedPane-Objektes
	        JTabbedPane tabpane = new JTabbedPane
	            (JTabbedPane.TOP,JTabbedPane.SCROLL_TAB_LAYOUT );
	 
	        // Hier werden die JPanels als Registerkarten hinzugefügt
	        tabpane.addTab("Einnahmen", einnahme);
	        tabpane.addTab("Ausgaben", ausgabe);
	        tabpane.addTab("Sonstiges", sonstiges);
	 
	        // JTabbedPane wird unserem Dialog hinzugefügt
	        dialog.add(tabpane);
	        // Wir lassen unseren Dialog anzeigen
	        dialog.setVisible(true);
		
	}

}
