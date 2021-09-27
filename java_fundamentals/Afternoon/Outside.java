import java.util.ArrayList;

public class Outside{

    public String sayHello(String name) {
        // System.out.println("hello from Outside file");
        String x = "hello ";
        return x + name;
    }


    public ArrayList<Integer> manipulateArr(ArrayList<Integer> coolNums) {
        System.out.println(coolNums);
        for (int i=0; i<coolNums.size(); i++ ) {
            // System.out.println(coolNums.get(i));
            coolNums.set(i, i*20);
        }
        return coolNums;
    }


}