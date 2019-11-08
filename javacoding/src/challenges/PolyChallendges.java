package challenges;

public class PolyChallendges {
	
	
	// {12, 30, 120, 80, 10, 14, 300, 24};
	// 
	public int getArrayMax(int arrayxx[]){
		int mx=arrayxx[0];
		for(int i=0; i< arrayxx.length-1; i++){
			mx= arrayxx[i] > arrayxx[i+1]? arrayxx[i] : arrayxx[i+1];
			}
		return mx;
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[]= {12, 30, 120, 80, 10, 14, 300, 24};
		PolyChallendges p= new PolyChallendges();
		
		System.out.println(p.getArrayMaxIndex(ar)+" : "+ p.getArrayMax(ar));
		//returns//  6  :  300
	}

}
