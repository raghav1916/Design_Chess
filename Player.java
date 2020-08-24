package takeHome;


	public abstract class Player { 
	    public boolean player1; 
	    public boolean player2; 
	  
	    public boolean isPlayer1() 
	    { 
	        return this.player1 == true; 
	    } 
	    public boolean isPalyer2() 
	    { 
	        return this.player2 == true; 
	    } 
	} 
	  
	public class Player2 extends Player { 
	  
	    public Player2(boolean player1) 
	    { 
	        this.player1 = player1; 
	        this.player2 = true; 
	    } 
	} 
	  
	public class Player1 extends Player { 
	  
	    public Player1(boolean player1) 
	    { 
	        this.player1 = player1; 
	        this.player2 = false; 
	    } 
	} 

