/**
 * 
 * Multiples of 3 and 5. By David
 * 
 * **/


public class Multiples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result=0 ;
		//int num=1000 ;
		
		for (int n=3 ; n<1000 ; n=n+3){
			result += n ;
		}
		for (int n=5 ; n<1000 ; n=n+5){
			result += n ;
		}
		for (int n=15 ; n<1000 ; n=n+15){
			result -= n ;
		}
		System.out.print(result) ;
		
	}

}
