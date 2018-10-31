import java.util.ArrayList;

public class Arraylistfloat {

	public static void main(String[] args) {

        // membuat objek arraylist float
		ArrayList<Float> isi = new ArrayList<Float>();

        // Mengisi angkadecimal 
		isi.add((float) 105.25f);
		isi.add((float) 155.905f);
		isi.add((float) 18.0555f);
		isi.add((float) 29.5220f);
		isi.add((float) 4532.0005f);
        	System.out.print("ANGKA DECIMAL ");
        	
        // menampilkan isi 
        System.out.println(isi);
        
        // menampilkan banyaknya isi 
    	System.out.println(" -ANGKA DECIMAL BERJUMLAH "+ isi.size()+" ANGKA");
    	
    	// menghapus salah satu isi 
    	isi.remove(3);
	
    		System.out.print("ANGKA DECIMAL ");
    	 // menampilkan isi 
        System.out.println(isi);
        
        // menampilkan banyaknya isi 
    	System.out.println(" -ANGKA DECIMAL BERJUMLAH "+ isi.size()+" ANGKA");
    	
    	// menambahkan isi 
    	isi.add((float) 359.002f);
    	isi.add((float) 4600.0099f);
    	
    		System.out.print("ANGKA DECIMAL ");
    		// menampilkan isi 
            System.out.println(isi);
            
            // menampilkan banyaknya isi 
        	System.out.println(" -ANGKA DECIMAL BERJUMLAH "+ isi.size()+" ANGKA");
	}

}
