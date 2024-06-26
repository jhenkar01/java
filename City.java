//create class with static array which has to accept the String elements and check if element is match or not (match value is: "Bengaluru") 
public class City {
 public static void main(String args[]){
  String citys[] = {"Bengaluru","Mangluru","Hassan"};
  String cityname = "Bengaluru";

  for (int i=0;i<citys.length;i++)
  {
     if( cityname == citys[i])
    {
	  System.out.println("city name"+citys[i]);
	}	
   else{
      System.out.println("not found");
   }	
  
  }
 
 
 
 }

}