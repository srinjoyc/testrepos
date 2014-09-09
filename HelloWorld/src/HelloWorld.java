import java.util.Scanner;




class HelloWorld{
	public static void main (String[] args){
		//function prototypes essentially 
	Scanner scanf= new Scanner(System.in); 
	Test calculator = new Test();
	
	double num=0;
	int END=-1;
	double avgarray[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,};
	int i=0;
	double avg;
	System.out.printf("Enter the numbers you want to average followed by a -1 to terminate\n");
	
	while(num!=END){
		num=scanf.nextDouble();
		avgarray[i]=num;
		i++;	
	}
	
	avg=calculator.calculate(avgarray, i);
	calculator.complete(avg);
	}
}