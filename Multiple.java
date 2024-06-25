public class Multiple{
 public static void main(String args[]){
  int multi[] = {33,300,11,6,9,34};
  for (int i=0;i<multi.length;i++)
  {
    if(multi[i]%3==0)
	{
       System.out.print("multiple of 3:"+" "+multi[i]+" ");	
	}
	else{
	      System.out.println("not a multiple of 3:"+multi[i]);
	}
  
  }
 
 
 
 }}