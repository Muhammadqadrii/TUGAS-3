import java.util.ArrayList;

public class Arraylistdouble {

	public static void main(String[] args) {
		
		// membuat objek arraylistdouble
		ArrayList<Double> isi = new ArrayList<Double>();
		
		// Mengisi arraylistdouble 
		isi.add((double) 25.5);
		isi.add((double) 1.95);
		isi.add((double) 1.5);
		isi.add((double) 8.9);
		isi.add((double) 40.5);
		        	System.out.print("ANGKA DECIMAL(2) ");
	
		 // menampilkan isi 
		        System.out.println(isi);
	
		 // menampilkan banyaknya isi 
		    	System.out.println(" -ANGKA DECIMAL BERJUMLAH(2) "+ isi.size()+" ANGKA");
	
		    	// menghapus salah satu isi
		    	isi.remove(3);
			
		    		System.out.print("ANGKA DECIMAL(2) ");
		    	 // menampilkan isi isi
		        System.out.println(isi);
		        
		        // menampilkan banyaknya isi 
		    	System.out.println(" -ANGKA DECIMAL BERJUMLAH(2) "+ isi.size()+" ANGKA");
		    	
		    	// menambahkan isi 
		    	isi.add((double) 3.2);
		    	isi.add((double) 46.9);
		    	
		    		System.out.print("ANGKA DECIMAL(2) ");
		    		// menampilkan isi isi
		            System.out.println(isi);
		            
		            // menampilkan banyaknya isi 
		        	System.out.println(" -ANGKA DECIMAL(2) BERJUMLAH "+ isi.size()+" ANGKA");
	}

}
