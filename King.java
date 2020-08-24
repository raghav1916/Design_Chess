package takeHome;

public  class King extends Piece{ 
	  
    public King(boolean white) 
    { 
        super(white); 
    } 
  
    @Override
    public boolean canMove(Board board, Spot start, Spot end) 
    { 
        // we can't move the piece to a Spot that  
        // has a piece of the same color 
        if (end.getPiece().isWhite() == this.isWhite()) { 
            return false; 
        } 
  
        int x = Math.abs(start.getX() - end.getX()); 
        int y = Math.abs(start.getY() - end.getY()); 
        if (x + y == 1) { 
            // check if this move will not result in the king 
            // being attacked if so return true 
        	if(board.boxes[end.getX()][end.getY()]==null)
            return true; 
        	else
        		return false;
        }
        if(x+y==2) {
        	if(board.boxes[end.getX()][end.getY()]!=null) {
        		return true;
        	}
        }
  
         return false;
    } 
  
} 

