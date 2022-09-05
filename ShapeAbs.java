public abstract class ShapeAbs{

	//instance variables
	
	private Shape[] allShapes;
	public double p1, p2, p3, p4;
	
	//Methods
	ShapeAbs(double p1, double, p2, double, p3, double, p4){
		
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
		
	}//End constructor
	
	//Getters
	public double get p1(){
		return p1;
		
	}

	public double get p2(){
		return p2;
		
	}

	public double get p3(){
		return p3;
		
	}

	public double get p4(){
		return p4;
		
	}//End getters


}//end class