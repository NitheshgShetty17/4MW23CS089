package pkg1;
class Shape{
    public void draw(){
        System.out.println("Drawing a shape");
    }
    public void erase() {
        System.out.println("Erasing a shape");
    }
}
class Circle extends Shape{
    public void draw(){
        System.out.println("drawing a Circle");
    }
    public void erase() {
        System.out.println("Erasing a Circle");
    }
}
class Triangle extends Shape{
    public void draw(){
        System.out.println("drawing a triangle");
    }
    public void erase() {
        System.out.println("Erasing a triangle");
    }
}
class Square extends Shape{
    public void draw(){
        System.out.println("drawing a square");
    }
    public void erase() {
        System.out.println("Erasing a square");
    }
}
public class N5 {
    public static void main(String[] args) {
        Shape[] shapes=new Shape[3];
        shapes[0]=new Circle();
        shapes[1]=new Triangle();
        shapes[2]=new Square();
        for(int i=0;i<shapes.length;i++){
            shapes[i].draw();
            shapes[i].erase();
            System.out.println("----------");
         
        }
    }
    
}
