import static javax.swing.JOptionPane.*;
import java.util.*;
public class AntalDagar {
		 public static void main (String[] arg) {   
		 String artal;
		 String ar;
		 String man;
		 String dag;
	
			int [] jahr = new int[263];
			int [] tag = new int[365];
			int [] monat = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		 
		 artal = showInputDialog("Skriv  ett  artal pa formen YYYY-MM-DD");
		 while (artal != null) { 
		 	ar = artal.substring(1, 4);
			dag = artal.substring(9, 10);
			man = artal.substring(7, 8);
			
			int year = Integer.parseInt(ar);
			int day = Integer.parseInt(dag);
			int mon = Integer.parseInt(man);
			
			boolean c = 
			( (year >= 1754) && 
			((year % 400 == 0) || (( year % 4 == 0) && (year % 100 !=0))));
				
				 if (c) {
					showMessageDialog(null, "Skottar!");
					
					}
		
					else  { 
					showMessageDialog(null, "Inte skottar");
					}
					artal = null;
					
					artal = showInputDialog("Skriv  ett  artal");
			
			                                   
				 }
				}
				 
		 }

List<Integer> lia = new ArrayList<Integer>(263); \\ gör listor med värden
List<Integer> lim = new ArrayList<Integer>(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31);
List<Integer> lid = new ArrayList<Integer>(365);

asList(Jahr) \\ gör fält till lista

jahr.subList(0,(year-) \\hittar element från i till j i fältet
monat.subList(0,(mon-1))

tag.get(day-1)