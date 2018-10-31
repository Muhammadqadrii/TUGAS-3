import java.util.ArrayList;

public class classqueuestring {
		ArrayList<String>queue = new ArrayList<String>();
		int alief = -1;
		
		public void insert(String value){
			alief++;
			queue.add(alief,value);
		}
		
		public String get(){
			String value = "KOSONG";
			if (alief>-1){
				value = queue.get(0);
				queue.remove(0);
				alief--;
			}
			return value;
		}
		
		public void cetak (){
			System.out.println("ECOR : "+alief+" > kelas E : "+queue.toString());
		}
}
