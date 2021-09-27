public class OtherFile{

    public void sayGenericHello() {
        System.out.println("hello there!");
    }

    public String sayHelloName() {
        return "123";
    }

    public String sayHelloName(String n) {
        // return "hello " + n;
        return String.format("hello %s ", n);
    }

}