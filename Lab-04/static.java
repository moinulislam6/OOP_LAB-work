public class Static_method {
    static void method1(){
        System.out.println("static method");
    }
    void method2(){
        System.out.println("non static method");
    }
}
class Main1{
    public static void main(String[] args) {
        Static_method.method1();
        Static_method s1 = new Static_method();
        s1.method2();
    }
}
