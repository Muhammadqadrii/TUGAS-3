package qadriii;

	import java.util.ArrayList;


	public class classstackstring {
		ArrayList<String>containert = new ArrayList<String>();
		int top = -1;
		
		public void push(String value){
			top++;
			containert.add(top,value);
		}
		public String pop(){
			String value = "kosong";
			if (top>-1){
			value = containert.get(top);
			containert.remove(top);
			top--;}
			return value;
			}
		
		public void cetak (){
			System.out.println("JUMLAH NAMA DIMULAI DARI 0, ADALAH "+top+" NAMA  YAITU : "+containert.toString());
		}
	}


