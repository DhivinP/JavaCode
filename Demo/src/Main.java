class A{
    public int add(int a,int b){
        return a+b;
    }
        }

class B extends A{
    public int add(int a,int b,int c){
        return a+b+c;
    }
}
class C extends B{
    public int add(int a,int b,int c,int d){
        return a+b+c+d;
    }
}

public class Main {
    public static void main(String[] args) {

        C obj = new C();
        System.out.println(obj.add(5,6,5));
    }
}


