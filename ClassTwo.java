public class ClassTwo{
	
	public static void main(String args[]){
		
		String names[]={"aa","bb","cc","dd","ee"};
		
		int numbers[] ={10,50,30,40,50}; 
		
		long phoneNumbers[]={9742616131L,7676356614L,9744256434L,9158324671L,9448728008L};
		
		char alphabet[]={'a','b','c','d','e'};
		
		
		for(int index=0; index<=5; index++){
			
			System.out.println("The names are: "+names[index]);
			
			System.out.println("The numbers are: "+numbers[index]);
			
			System.out.println("The Phone numbers are: "+phoneNumbers[index]);
						
			System.out.println("The alphabet are: "+alphabet[index]);

			System.out.println("\n");

		}
		
		
	}
}