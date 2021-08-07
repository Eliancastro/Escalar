
import java.util.ArrayList;

public class Escalar {
	
	public int productoEscalar(ArrayList<Integer> array1, ArrayList<Integer> array2) {
		
		int productoEscalar = 0;

        if(array1.size() == 0 && array2.size() == 0) {
        	
        	return 0;
        }
        
        productoEscalar = array1.remove(0) * array2.remove(0);

        return productoEscalar + productoEscalar(array1, array2);
    }
	
	public static void main(String[] args) {
		 Escalar escalar = new Escalar();
		 ArrayList <Integer>array1 = new ArrayList <Integer>();
		 ArrayList <Integer>array2 = new ArrayList <Integer>();
		 array1.add(1) ;
		 array1.add(2) ;
		 array1.add(3) ;
		 array2.add(4) ;
		 array2.add(5) ;
		 array2.add(6) ;
		 
		 System.out.println(escalar.productoEscalar(array1, array2));
	}
	

}
