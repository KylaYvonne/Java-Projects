import java.util.*;
class Shape {

public String color;
public Boolean filled;

   public Shape() {color = "red"; filled=true; }
   public Shape(String clr){color = clr; filled = true;}
   public String toString(){
      return "Shape[color=" + color + "," + "filled=" + filled + "]";
   }
   public String getColor(){ return color; }
   public void setColor(String color){ this.color = color; }
   public boolean isFilled() { return filled; }
   public void setFilled(boolean filled) {this.filled = filled;}
}
class Circle extends Shape {

public double radius;
   
   public Circle(){radius = 1.0;}
   public Circle(double rd){radius = rd;}
   public Circle(double rd, String clr){super(clr); radius = rd ;}
   public String toString(){
      return "Circle[" + super.toString() + "," + "radius=" + radius + "]";
   }
   public double getRadius(){return radius;}
   public void setRadius(){this.radius=radius;}
   public double getArea(double radius){return Math.PI * radius * radius;}
   public double getPerimeter(double radius){return 2 * Math.PI * radius;}

}
class Rectangle extends Shape {

public double width;
public double length;

   public Rectangle(){width = 1.0; length = 1.0;}
   public Rectangle(double wd, double lgth){width = wd; length = lgth;}
   public Rectangle(double wd, double lgth, String clr){super(clr); width = wd; length = lgth;}
   public String toString(){
      return "Rectangle[" + super.toString() + "," + "width=" + width + "," + "length=" + length + "]";
   }
   public double getWidth() {return width;}
   public void setWidth(double width){ this.width = width;}
   public double getLength() {return length;}
   public void setLength(double length){ this.length = length;}
   public double getArea(double width, double length){return length * width;}
   public double getPerimeter(double width, double length){return 2 * (width + length);}
}
class Square extends Rectangle{

public double side;
   
   public Square(){}
   public Square(double sd){side = sd;}
   public Square(double sd, String clr){super(); side = sd ;}
   public String toString(){return "Square[" + super.toString()+ "]";}
   public double getSide(){return side;}
   public void setSide(double side){this.side= side;}
   public void setWidth(double side){this.width= width;}
   public void setLength(double side){this.length=length;}
}
public class Demo{
public static void main(String[] args){

      Shape s = new Shape("red");
      Circle c = new Circle(1.0,"red");
      Rectangle r = new Rectangle(1.0,1.0,"red");
      Square sr = new Square (1.0, "red");
      
      System.out.println(s.toString());
      System.out.println();
      System.out.println(c.toString());
      System.out.println("Area of Circle: " + String.format("%.2f",c.getArea(1.0)));
      System.out.println("Perimeter of Circle: " + String.format("%.2f",c.getPerimeter(1.0))); 
      System.out.println();
      System.out.println(r.toString()); 
      System.out.println("Area of Rectangle: " + r.getArea(1.0,1.0));
      System.out.println("Perimeter of Rectangle: " + r.getPerimeter(1.0,1.0)); 
      System.out.println();
      System.out.println(sr.toString()); 
}
}