package ejercicio31;

public class Line   {
	   // A line composes of two points (as instance variables)
	   private Point begin;    // beginning point
	   private Point end;      // ending point
	   
	   // Constructors
	   public Line (Point begin, Point end) {  // caller to construct the Points
	      this.begin = begin;
	      this.end= end;
	   }
	   public Line (int beginX, int beginY, int endX, int endY) {
	      begin = new Point(beginX, beginY);   // construct the Points here
	      end = new Point (endX, endY);
	   }
	   
	   // Public methods
	   public String toString() { 
		   
		  return "x e y inicial= "+ begin + " x e y final= " + end;
	   }
	   
	   public Point getBegin() {
		   return begin;
	   }
	   public Point getEnd() { 
		   
		   return end;
	   }
	   public void setBegin (Point begin) { 
		   this.begin=begin;
		   
	   }
	   public void setEnd(Point end) {
		   this.end=end;
	   }
	   
	   public int getBeginX() { 
		   return begin.getX();
	   }
	   
	   public int getBeginY() { 
		   return begin.getY();
	   }
	   
	   public int getEndX() { 
		   return end.getX();
	   }
	   
	   public int getEndY() { 
		   return end.getY();
	   }
	   
	   public void setBeginX(int bx) { 
		  begin.setX(bx);
	   }
	   public void setBeginY(int by) { 
		   end.setY(by);
	   }
	   public void setBeginXY(int bx, int by) { 
		   begin.setX(bx);
		   begin.setY(by);
	   }
	   public void setEndX(int ex) { 
		   end.setX(ex);
	   }
	   public void setEndY(int ey) { 
		   end.setY(ey);
	   }
	   public void setEndXY(int ex, int ey) { 
		   end.setX(ex);
		   end.setY(ey);
	   }
	   
	   public double getLength() { // Length of the line
		   
	   return Math.sqrt(((begin.getX()- end.getX())*(begin.getX()- end.getX())) + ((begin.getY() - end.getY())*(begin.getY() - end.getY())));   // Math.sqrt(xDiff*xDiff + yDiff*yDiff)
	   
	   }
	   
	   public double getGradient() {       // Gradient in radians  // Math.atan2(yDiff, xDiff)
		   return Math.atan2((begin.getY() - end.getY()), (begin.getX()- end.getX()));
		   
	   } 
	                                          
	}
