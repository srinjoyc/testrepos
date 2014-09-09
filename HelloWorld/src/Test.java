
public class Test {
	
	
	public double calculate(double array[], int size){
		int i;
		double total = 0;
		double avg;
		
		for(i=0;i<=size;i++){
			total=+array[i];
		}
		
		avg=total/(size+1);
		System.out.println("done");
	return avg;
	
	
	
	}
	
	public void complete (double avg){
		System.out.println("Your average is:"+avg);
	}

}
