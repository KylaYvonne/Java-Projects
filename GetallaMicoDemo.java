/**
   OOP 12:00 - 2:30PM TTH 
   11/12/20
   Getalla, Mico D. BSIT-2
*/

//Shape
class Shape{
   protected String color;
   protected boolean filled;
   
   public Shape(){
      color = "red";
      filled = true;
   }
   public Shape(String col){
      color = col;
      filled = true;
   }    
   public String getColor(){
      return color;
   }
   public void setColor(String col){
      this.color = col;
   }
   public boolean isFilled(){
      return filled;
   }
   public void setFilled(boolean fil){
      this.filled = fil;
   }  
   public String toString(){
      return "Shape[color=" + color + "," + "filled="+filled+"]";
   }
}

//Circle
class Circle extends Shape{
   private double radius;
   
   public Circle(){
      radius = 1.0;
   }
   public Circle(double rad){
      radius = rad;
   }
   public Circle(double rad, String col){
      super(col);
      radius = rad;
   }  
   public double getRadius(){
      return radius; 
   }
   public void setRadius(){
      this.radius=radius;
   }
   public double getArea(double radius){      
      return Math.PI * radius * radius;
   }
   public double getPerimeter(double radius){
      return 2 * Math.PI * radius;
   }   
   public String toString(){
      return "Circle[" + super.toString()+","+"radius="+radius+"]";
   }
}

//Rectangle
class Rectangle extends Shape{
   protected double width;
   protected double length;
   
   public Rectangle(){
      width = 1.0;
      length = 1.0;
   }
   public Rectangle(double wid, double leng){
      width = wid;
      length = leng;
   }
   public Rectangle(double wid, double leng, String col){
      super(col);
      width = wid;
      length = leng;
   }     
   public double getWidth(){
      return width;
   }
   public void setWidth(double width){
      this.width = width;
   }
   public double getLength(){
      return length;
   }  
   public void setLength(double length){
      this.length = length;
   }
   public double getArea(double width, double length){
      return length * width;
   }
   public double getPerimeter(double width, double length){
      return 2 * (width + length);
   }   
   public String toString(){
      return "Rectangle[" + super.toString() +","+"width="+width+","+"length="+length+"]";
   }
}

//Square
class Square extends Rectangle{
   private double side;
   public Square(){}
   public Square(double side){
      side = side;
   }
   public Square(double side, String col){
      super();
      side = side;
   } 
   public double getSide(){
      return side;
   } 
   public void setSide(double side){
      this.side = side;
   }  
   public void setWidth(double width){
      this.width = width;
   }   
   public void setLength(double length){
      this.length = length;
   }     
   public String toString(){
      return "Square[" + super.toString() +"]";        
   }
}

public class GetallaMicoDemo{

   public static void main(String[] args){ 
      Shape sh = new Shape("red");
      Circle cir = new Circle(1.0, "red");
      Rectangle rec = new Rectangle(1.0, 1.0, "red");
      Rectangle sq = new Square(1.0, "red");      
      System.out.println(sh.toString());
      System.out.println("*****************************************************************");
      System.out.println(cir.toString());
      System.out.println("Area of Circle: " + cir.getArea(1.0));
      System.out.println("Perimeter of Circle: " + cir.getPerimeter(1.0)); 
      System.out.println("--------------------------------------------------------------------");
      System.out.println(rec.toString());
      System.out.println("Area of Rectangle: " + rec.getArea(1.0, 1.0));
      System.out.println("Perimeter of Rectangle: " + rec.getPerimeter(1.0, 1.0));  
      System.out.println("--------------------------------------------------------------------");      
      System.out.println(sq.toString());  
      System.out.println("Area of Square: " + sq.getArea(1.0, 1.0));
      System.out.println("Perimeter of Square: " + sq.getPerimeter(1.0, 1.0));     
   }

}//endofclass