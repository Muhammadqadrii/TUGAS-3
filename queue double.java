import java.util.ArrayList;

public class classqueuedouble {
	ArrayList<Double>queue = new ArrayList<Double>();
	double alief = 0;
	
	public void insert(Double value){
		alief++;
		queue.add( alief);
	}
	
	public Double get(){
		Double all = alief;
		if (alief<1){
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

