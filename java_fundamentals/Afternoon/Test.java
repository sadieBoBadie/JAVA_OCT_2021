import java.util.Arrays;
import java.util.ArrayList;

public class Test{

    public static void main(String[] args) {
     
  
        Outside x = new Outside();
        String result = x.sayHello("Raden");
        // System.out.println(result);
        // ------------

        int[] nums = {11,22,33,44};
        // System.out.println(Arrays.toString(nums));

        
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(11);
        numbers.add(22);
        numbers.add(33);
        numbers.add(44);
        // System.out.println(numbers);

        // System.out.println(nums == numbers); // T/F?
        x.manipulateArr(numbers);
        System.out.println(numbers);
    }
}