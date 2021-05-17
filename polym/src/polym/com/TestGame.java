package polym.com;

public class TestGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Team newteam =new Team();
		
         Team secondteam = new Player();

	     Player newplayer = new Player();
	     
	     
	     newteam.play();
	     
	     secondteam.play();
	     
	     newplayer.changedress();
	     newplayer.play();
	     
	     
	      //Player secondplayer = new Team();  //cannot convert from parent to child because not inheerted from child ,opposite
	     
	     Team newteamplayer = new Player(); //polymorphism
	     
	     newteamplayer.play();
	     
	     ( (Player)newteamplayer).changedress();  //casting
	     
	   
	     
	     
	     
	   
	    
	     
	     
        
        
	    }

}
