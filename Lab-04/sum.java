public class Sum {
    int calculate(int n){
        int sum = 0;
        for(int i=0;i<=n;i++){
            sum +=i;
        }
        return sum;
    }
}
class Main2{
    public static void main(String[] args) {
        Sum s = new Sum();
        System.out.println(s.calculate(10));
    }
}
