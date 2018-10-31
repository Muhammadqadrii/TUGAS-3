import java.util.ArrayList;

public class Arrayliststring {
    public static void main(String[] args) {

        // membuat objek array list string
        ArrayList<String> Namarokok = new ArrayList<>();

        // Mengisi Nama rokok dengan 5 jenis rokok
		Namarokok.add("Surya");
        Namarokok.add("Classmild");
        Namarokok.add("Sampoerna");
        Namarokok.add("POTENZA BOLD");
        Namarokok.add("L.A BOLD");
        	System.out.print("NAMA ROKOK ");
       

        // Menampilkan isi Nama rokok
        System.out.println(Namarokok);

        // menampilkan banyak isi Nama rokok
        System.out.println("  -NAMA ROKOK BERJUMLAH "+ Namarokok.size() +" JENIS ROKOK");
    
        // menghapus salah satu isi dari Nama rokok
        Namarokok.remove(2);
     
        System.out.print("NAMA ROKOK ");
        

        // Menampilkan isi Nama rokok
        System.out.println(Namarokok);

        // menampilkan banyak isi Nama rokok
        System.out.println("  -NAMA ROKOK BERJUMLAH "+ Namarokok.size() +" JENIS ROKOK");
        
        // menambahkan isi nama rokok
        Namarokok.add("Sampoerna");
        Namarokok.add("MAGNUM");
        
        System.out.print("NAMA ROKOK ");
        

        // Menampilkan isi Nama rokok
        System.out.println(Namarokok);

        // menampilkan banyak isi Nama rokok
        System.out.println("  -NAMA ROKOK BERJUMLAH "+ Namarokok.size() +" JENIS ROKOK");
    }
}
