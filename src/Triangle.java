public class Triangle {
	float side1, side2, side3;
	public Triangle(){
		side1 = 3;
		side2 = 4;
		side3 = 5;
	}
		
	public Triangle(float b, float h, float hy){
		side1 = b;
		side2 = h;
		side3= hy;
	}
	
	public String isRightTriangle(){
            String type = "";
            
            if(side1 > side2 + side3)
                {
                    type = "Not a Trianle A";
                }
                if(side2 > side1 + side3)
                {
                    type = "Not a Trianle B";
                }
                if(side3 > side1 + side2)
                {
                    type = "Not a Trianle C";
                }
                if(side1 <= 1 || side1 >= 200)
                {
                    type = "Value of A is not in the range of permitted values";
                }
                if(side2 <= 1 || side2 >= 200)
                {
                    type = "Value of B is not in the range of permitted values";
                }
                if(side3 <= 1 || side2 >= 200)
                {
                    type = "Value of C is not in the range of permitted values";
                }
                
                else if(side1 == side2 && side2 == side3 ){
                    type = "Triangle is Equilateral";
			
		}
		
                else if((side1 == side2 && side2 != side3) || (side1 != side2 && side3 == side1) && (side3 == side2 && side3 != side1)){
                    type = "Triangle is Isosceles";
			
		}
                
                else if(side1 != side2 && side2 != side3 && side3 != side1){
                    type = "Triangle is Scalene";
			
		}
                
                return type;
	}
	 

}
