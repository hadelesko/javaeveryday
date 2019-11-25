package challenges;

public class PolyChallendges {
	
	
	// {12, 30, 120, 80, 10, 14, 300, 24}; 
	public int getArrayMax(int arrayxx[]){
		int mx=arrayxx[0];
		int tempomx;

		for(int i=0; i< arrayxx.length-1; i++){
			tempomx= arrayxx[i] > arrayxx[i+1]? arrayxx[i] : arrayxx[i+1];
			arrayxx[i+1]=tempomx;
			}
		return tempomx;
		//getArrayMax({12, 30, 120, 80, 10, 14, 300, 24})// returns 300
	}
	// return the index of the index of the maximum of the array
	public int getArrayMaxIndex(int arrayxx[]){
		
		int inxx=0;
		for(int i=0; i< arrayxx.length-1; i++){
		inxx=arrayxx[i] > arrayxx[i+1]? i : i+1;
	    }
		return inxx;
		
		//getArrayMaxIndex({12, 30, 120, 80, 10, 14, 300, 24});
	}
	public int getArrayMin(int arrayxx[]){
		int minimum=arrayxx[0];
		for(int i=0; i< arrayxx.length-1; i++){
			minimum= arrayxx[i] < arrayxx[i+1]? arrayxx[i] : arrayxx[i+1];
			}
		return minimum;
		//getArrayMax({12, 30, 120, 80, 10, 14, 300, 24})// returns 10
	}
	public int getArrayMinIndex(int arrayxx[]){
		int indexMinimum=arrayxx[0];
		for(int i=0; i< arrayxx.length-1; i++){
			indexMinimum= arrayxx[i] < arrayxx[i+1]? i : i+1;
			}
		return indexMinimum;
		//getArrayMax({12, 30, 120, 80, 10, 14, 300, 24})// returns 10
	}
	
	public int getSum(int array[]){
		int sum =0;
		if(array.length==0) {
			return sum;
		}else{
			for(int i=0; i<array.length;i++) {
				sum+=array[i];
			}
			return sum;
			
		}
	}
	
	public double getMean(int array[]){
		//double average=0;
		int sum =0;
		if(array.length==0) {
			return 0.00;
		}else{
			for(int i=0; i<array.length;i++) {
				sum+=array[i];
			}
			return sum/array.length;
			
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[]= {12, 30, 120, 80, 10, 14, 300, 24};
		PolyChallendges p= new PolyChallendges();
		
		System.out.println(p.getArrayMaxIndex(ar)+" : "+ p.getArrayMax(ar));
		//returns//  6  :  300
		System.out.println("Frequency : "+ ar.length);
		System.out.println("Min : "+ p.getArrayMin(ar));
		System.out.println("Max : "+ p.getArrayMax(ar));
		System.out.println("Sum : "+ p.getSum(ar));
		System.out.println("Average : "+ p.getMean(ar));
	}

}
