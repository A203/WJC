package Day02;

public class Class02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int j = 2;
	     for(int i=2;i<=100;i++){
//	    	 j=2;
	    	 for(int j1=2;j1<=i;j1++){
	    		 if(j1==i){
	    			 System.out.println(i);
	    		 }
	    	 if(i%j1==0)
	    		 break;
	    	 }
	     }
	}

}
