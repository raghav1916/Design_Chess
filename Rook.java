package takeHome;

public  class Rook extends Piece{
	public Rook(boolean white) 
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
        if((x==0)||(y==0)) {
        	if(x==0) {
        		if(end.getY()>start.getY()) {
        			int p=start.getY()+1;
        			while(p<end.getY()) {
        				if(board.boxes[end.getX()][p]!=null)
        					return false;
        				p++;
        			}
        			return true;
        		}
        		else {
        			int p=start.getY()-1;
        			while(p>end.getY()) {
        				if(board.boxes[end.getX()][p]!=null)
        					return false;
        				p--;
        			}
        			return true;
        		}
        	}
        	else {
        		if(end.getX()>start.getX()) {
        			int p=start.getX()+1;
        			while(p<end.getX()) {
        				if(board.boxes[end.getY()][p]!=null)
        					return false;
        				p++;
        			}
        			return true;
        		}
        		else {
        			int p=start.getX()-1;
        			while(p>end.getX()) {
        				if(board.boxes[end.getY()][p]!=null)
        					return false;
        				p--;
        			}
        			return true;
        		}
        	}
        	}
        return false;
        }
    } 
 