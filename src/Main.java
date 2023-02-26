public class Main {
    public static void main(String[] args) {
        Shape[] mas = {new Circle(5), new Rectangle(0,10,0,5)};
        for(Shape shape: mas){
            shape.draw();
        }
    }
}