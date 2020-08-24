package takeHome;

public  class Bishop extends Piece{
	public Bishop(boolean white) 
    { 
        super(white); 
    } 
  
    @Override
    public boolean canMove(Board board, Spot start,  
                                            Spot end) 
    { 
        // we can't move the piece to a spot that has 
        // a piece of the same colour 
        if (end.getPiece().isWhite() == this.isWhite()) { 
            return false; 
        } 
  
        int x = Math.abs(start.getX() - end.getX()); 
        int y = Math.abs(start.getY() - end.getY()); 
        if(x==y) {
        	if(start.getX()>end.getX()) {
        	int p=start.getX()-1;
        	int q=start.getY()-1;
        	while(p>end.getX()&&q>end.getY()) {
        		if(board.boxes[p][q]!=null)
        			return false;
        		p--;
        		q--;
        	}
        	return true;
        	}
        	else {
        		int p=start.getX()+1;
            	int q=start.getY()+1;
            	while(p<end.getX()&&q<end.getY()) {
            		if(board.boxes[p][q]!=null)
            			return false;
            		p++;
            		q++;
            	}
            	return true;
        	}
        }
        return false;
    } 
} 