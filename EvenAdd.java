public class EvenAdd{
 public static void main(String args[]){
  int addeven[]= {23,86,45,24,90};
 
 for(int i=0;i<addeven.length;i++)
 {
	 if(addeven[i]%2==0){
		 System.out.println("even:"+addeven[i]);
	 }
	 else{
		 System.out.println("add:"+addeven[i]);
	 }
 }
 }}