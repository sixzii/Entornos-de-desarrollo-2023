package debuggin;
import javax.swing.JOptionPane;

public class debuggin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int elementos=Integer.parseInt(JOptionPane.showInputDialog("Teclea un numero + de uno=>"));
		int num_aleat[]=new int[elementos];
		for (int i=0; i< num_aleat.length;i++) {
			num_aleat[i]=(int)(Math.random()*100);//el error estaba en Math.random que había que meterlo
		}										// en (), es decir = (int)(Math.random()+100), porque Math.random
		for (int elem: num_aleat) {				// genera números aleatorios de 0 a 1 (decimales) y al convertirlos
			System.out.println(elem);			// a enteros (int) se pierde la parte decimal.
		}

	}
}
