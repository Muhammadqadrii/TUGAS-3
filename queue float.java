import java.util.ArrayList;

public class classqueuefloat {
	ArrayList<Float>queue = new ArrayList<Float>();
	float alief = 0;
	
	public void insert(Double value){
		alief++;
		queue.add( alief);
	}
	
	public float get(){
		float all = alief;
		if (alief<0){
			all = queue.get(0);
			queue.remove(0);
			alief++;
		}
		return all;
	}
	
	public void cetak (){
		System.out.println("ECOR : "+alief+" > variable : "+queue.toString());

	}
}
