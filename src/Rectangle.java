public class Rectangle extends Shape{
    int x0;
    int x;
    int y0;
    int y;
    Rectangle(int x0, int x, int y0, int y){
        this.x0 = x0;
        this.x = x;
        this.y0 = y0;
        this.y = y;
    }
    public void draw(){
        System.out.println("Прямоугольник:");
        int len = x-x0;
        int weight = y-y0;
        String r = "";
        for (int i=0; i<len; i++){
            r+="*";
        }
        for (int j=0; j<weight; j++){
            System.out.println(r);
        }
    }
    public void equals() {
    }
}
