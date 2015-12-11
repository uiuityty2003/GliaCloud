import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Recursive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result=0 ;
		
		List<Integer> listUp = new ArrayList<>();
		List<Integer> listDown = new ArrayList<>();
		List<Integer> factor = new ArrayList<>();
		
		listUp.add(40) ;
		listDown.add(10) ;
		factor.add(1) ;
		int bufferUp ;
		int bufferDown ;
		int bufferFactor ;
		while(listUp.size() != 0){
			bufferUp = listUp.get(0) ;
			bufferDown = listDown.get(0) ;
			bufferFactor = factor.get(0) ;
			
			System.out.println(listUp.get(0) + "  " + listDown.get(0)) ;
			
			listUp.remove(0) ;
			listDown.remove(0) ;
			factor.remove(0) ;
			
			//System.out.println("No1") ;
			
			for(int n=0 ; n<listUp.size() ; n++){
				if (listUp.get(n)==bufferUp-1 && listDown.get(n)==bufferDown-1){
					factor.add(n, factor.get(n)+1) ;
				}
				else{
					listUp.add(bufferUp-1) ;
					listUp.add(bufferUp-1) ;
					factor.add(1) ;
					System.out.println("haha") ;
				}
				
				if(listUp.get(n)==bufferUp && listDown.get(n)==bufferDown-1){
					factor.add(n, factor.get(n)+1) ;
				}
				else{
					listDown.add(bufferDown) ;
					listDown.add(bufferDown-1) ;
					factor.add(1) ;		
				}
				
			}
			
			for(int n=0 ; n<listUp.size() ; n++){
				if(listUp.get(n)==listDown.get(n)){
					result = result + 1*factor.get(n) ;
					listUp.remove(n) ;
					listDown.remove(n) ;
					factor.remove(n) ;
				}
				if(listDown.get(n)==1){
					result = result + listUp.get(n)*factor.get(n) ;
					listUp.remove(n) ;
					listDown.remove(n) ;
					factor.remove(n) ;
				}
				//System.out.println("this is result:" +result) ;
				//System.out.println("this is length:" +listUp.size()) ;
			}
		}
		
		System.out.print(result) ;
		
	}

}
