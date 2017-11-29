

import javax.swing.*;

public class Skottar {
		 public static void main (String[] arg) {   
		 String ar = JOptionPane.showInputDialog("Skriv  ett  artal");
				int year = Integer.parseInt(ar);
				while (ar != null){
				while (ar != null){
					if ( ( (year % 4 == 0) || (year % 400 == 0) ) && (year % 100 != 0) )
					JOptionPane.showMessageDialog(null, "Skottar!");
					else 
					JOptionPane.showMessageDialog(null, "Inte skottar");
					String a = JOptionPane.showInputDialog("Skriv  ett  artal");
					int b = Integer.parseInt(a);
				}
				} 
		 }
 }
