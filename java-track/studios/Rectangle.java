
public class Rectangle {
	
	private String name;
	private int length;
	private int width;
	
	public Rectangle (String name, int length, int width){
		this.name = name;
		this.length = length;
		this.width = width;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getLength(){
		return this.length;
	}
	
	public int getWidth(){
		return this.width;
	}
	
	public String area(){
		return "Area of " + this.name + ": " + this.length * this.width;
	}
	
	public String perimeter(){
		return "Perimeter of " + this.name + ": " + ((this.length *2) + (this.width * 2));
	}
	
	public String square(){
		if (this.length == this.width){
			return "Is " + this.name + " a square: Yes";
		}
		else {
			return "Is " + this.name + " a square: No";
		}
	}
	
	public String size(Rectangle other){
		if ((this.length * this.width) > (other.length * other.width)){
			return this.name + " is larger in terms of area than " + other.name + ".";
		}
		else if ((this.length * this.width) == (other.length *other.width)){
			return this.name + " has an area equal in size to " + other.name + ".";
		}
		else{
			return this.name + " is smaller in terms of area than " + other.name + ".";
		}
	}
	
	public String toString(){
		return "Name: " + this.name + " Length: " + this.length + " Width: " + this.width;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangleOne = new Rectangle ("rectangleOne", 5, 5);
		System.out.println(rectangleOne);
		System.out.println(rectangleOne.area());
		System.out.println(rectangleOne.perimeter());
		System.out.println(rectangleOne.square());
		System.out.println();
		Rectangle rectangleTwo = new Rectangle ("rectangleTwo", 10, 5);
		System.out.println(rectangleTwo);
		System.out.println(rectangleTwo.area());
		System.out.println(rectangleTwo.perimeter());
		System.out.println(rectangleTwo.square());
		System.out.println();
		System.out.println(rectangleOne.size(rectangleTwo));
	}

}
