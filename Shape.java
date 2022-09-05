public class Shape{

	//instance variables
	private String name;
	protected double length;
	protected double width;
	
	//points
	private double p1;
	private double p2;
	private double p3;
	private double p4;
	
	//constructor
	public Shape(double p1, double p2, double p3, double p4){
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
		
		
	}//end constructor
	
	//Getters
	public String name(){
		return this.name;
	}
	
	public double getP1(){
		return this.p1;
	}

	public double getP2(){
		return this.p2;
	}
	
	public double getP3(){
		return this.p3;
	}

	public double getP4(){
		return this.p4;
	}//End getters
	
	
	//Setters
	public void setName(String name){
		this.name=name;
	}
	
	public void setP1(double setPoint1){
		this.p1 = setPoint1;
	}

	public void setP2(double setPoint2){
		this.p2 = setPoint2;
	}

	public void setP3(double setPoint3){
		this.p3 = setPoint3;
	}

	public void setP4(double setPoint4){
		this.p4 = setPoint4;
	}//End Getters

}// End class