public class começo {
    public static void main(String[] args) {
        sum(10, 10);
        sub(100, 200);
        mut(5, 5);
        div(9.999, 3);
        calc(1, 1, 1);
    }
    
    static void sum(double x, double y){
        System.out.println(x + y);
    }

    static void sub(double x, double y){
        System.out.println(x - y);
    }

    static void mut( double x, double y){
        System.out.println(x * y);
    }
    static void div(double x, double y){
        System.out.println(x / y);
    }
    static void calc(double x, double y, double z){
        System.out.println(x + y + z);
        System.out.println(x - y - z);
        System.out.println(x * y * z);
        System.out.println(x / y / z);
    }

    
}