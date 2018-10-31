import java.util.ArrayList;

public class Arraylistinteger {

	public static void main(String[] args) {
		
		// membuat objek array list string
		ArrayList<Integer> HargaRokokBatangan = new ArrayList<>();
				System.out.print("Harga Rokok Batangan ");
				
		 // Mengisi Nama rokok dengan 5 harga
		HargaRokokBatangan.add(2000);
		HargaRokokBatangan.add(1500);
		HargaRokokBatangan.add(2500);
		HargaRokokBatangan.add(5000) ;
		HargaRokokBatangan.add(3000);
		
		// Menampilkan isi Nama rokok
        	System.out.println(HargaRokokBatangan);
        
        // menampilkan banyaknya isi harga rokok batangan
        	System.out.println("HARGA ROKOK BERJUMLAH "+ HargaRokokBatangan.size());
        
        // menghapus salah satu isi dari hargarokokbatangan
        	HargaRokokBatangan.remove(2);
        	System.out.print("Harga Rokok Batangan ");
        	
        // Menampilkan isi Nama rokok
        	System.out.println(HargaRokokBatangan);
        
        // menampilkan banyaknya isi harga rokok batangan
        	System.out.println("HARGA ROKOK BERJUMLAH "+ HargaRokokBatangan.size());
        	
        // menambahkan isi harga rokok batangan
        	HargaRokokBatangan.add(2500);
        	HargaRokokBatangan.add(1500);
        	
        	System.out.print("Harga Rokok Batangan ");
        // Menampilkan isi Nama rokok
            	System.out.println(HargaRokokBatangan);
            
        // menampilkan banyaknya isi harga rokok batangan
            	System.out.println("HARGA ROKOK BERJUMLAH "+ HargaRokokBatangan.size());
}

	
	}
