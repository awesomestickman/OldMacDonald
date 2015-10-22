class Chick implements Animal 
{     
     private String myType;     
     private String mySound; 
     private String mySound2;     
     public Chick(String type, String sound1, String sound2)     {         
         myType = type;         
         mySound = sound1;     
         mySound2=sound2;
     }     
     public Chick()     {         
         myType = "unknown";         
         mySound = "unknown";     
     }      
     public String getSound(){
int randomer = (int)(Math.random()*2);
System.out.println(randomer);
if(randomer==0){
     	return mySound;
}
else if(randomer==1){
     	return mySound2;
}
else{
	return mySound2;
}



     }     
     public String getType(){return myType;} 

}