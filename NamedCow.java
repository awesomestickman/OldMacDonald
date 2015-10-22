class NamedCow extends Cow
{
	private String streetName;

 public NamedCow(String type,String n, String sound)     {         
         myType = type;         
         mySound = sound;  
         streetName=n;
   
}  
public String getName(){

return(streetName);

}




}