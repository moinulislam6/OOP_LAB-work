public class Box {
    int length;
    int weight;
    int height;
    void area(int length,int weight){
        System.out.println(length*weight);
    }
    void area(int length,int weight,int height){
        System.out.println(length*weight*height);
    }
}
class Main{
    public static void main(String[] args) {
        Box b1 = new Box();
        b1.area(12,6);
        b1.area(20,15,10);
    }
}
