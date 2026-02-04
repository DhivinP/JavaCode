class A{
    public void welcome(){
        System.out.println("Welcome to Java Course");
    }
        }

class B extends A{
    public void welcome(){
        System.out.println("Welcome to Java and springboot Course");
    }
}

public class Main {
    public static void main(String[] args) {

        A obj = new B();
        obj.welcome();
    }
}


