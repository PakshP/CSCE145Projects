//Paksh Patel
public class Lab05Question {
	
	public static void main(String[] args) {
		
		/*
		
		Original Code with Error
	 	double[] m = new double[4];
		
		for (int i = 1; i <= m.length; i++) {
			
			m[i] = 3*i;
			
		}
		*/
		
		//fixed code
		int k = 0;
		
	 	double[] m = new double[4];
		
		for (int i = 1; i <= m.length; i++) {
			
			m[k] = 3*i;
			
			k++;
		}
		
	}
}
