import java.util.Arrays;
import java.util.ArrayList;

public class Hello {

     public static void main(String[] unicorns) {
        System.out.println("hello ninjas!");

        // PRIMITIVE TYPES
        int age = 9000;
        double price = 19.99;
        char letter = 'a';
        boolean isAdmin = true;

        // OBJECT TYPES
        String name = "john";
        Integer len = name.length();
        System.out.println(len);
        
        Integer num = 123;
        Double tax = 3.2;
        
        // conditionals
        if (isAdmin == true) {
            System.out.println("yes this user is admin");
        }
        if (name.equals("john")) {
            System.out.println("the name is " + name);
        }

        String a = new String("word");
        String b = new String("word");
        System.out.println(a == b); // false. not the same exact object.
        System.out.println(a.equals(b)); // true. same exact characters.

        // importing
        OtherFile x = new OtherFile();
        x.sayGenericHello();
        // System.out.println(x.sayHelloName());
        String y = x.sayHelloName();
        System.out.println(y);

        System.out.println(x.sayHelloName("Joseph"));
        System.out.println("--------\n");

        // ---ARRAYS
        int[] numbers;           // Variable Declaration
        numbers = new int[5];    // Initialization
        
        // import java.util.Arrays;
        
        
        numbers[0] = 4;          // Setting the value at index 0 to 4 (the default value was 0)
        numbers[1] = 8;
        numbers[2] = 8;
        numbers[3] = 5;
        numbers[4] = 9;
        System.out.println(Arrays.toString(numbers));
        
        int[] nums = {11,22,33,44};
        System.out.println(Arrays.toString(nums));
        
        for (int i= 0; i<nums.length; i++) {
            if (nums[0] == 11) {
                nums[0] = 1;
            }
            nums[i] = i * 10;
        }
        System.out.println(Arrays.toString(nums));
        
        // -------ARRAYLIST ------
        ArrayList<Integer> myCoolArr = new ArrayList<Integer>();
        myCoolArr.add(128);
        myCoolArr.add(128);
        myCoolArr.add(128);
        myCoolArr.add(128);
        System.out.println(myCoolArr);
        
        System.out.println(myCoolArr.getClass());
        System.out.println(name.getClass());
        System.out.println(nums.getClass());



    }
 }
