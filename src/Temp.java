import javax.lang.model.element.Element;
import java.lang.reflect.Array;
import java.util.*;

public class Temp {


    public static int gcd(int a, int b)
    {

        while (b != 0) {
            int temp = a % b;

            a = b;
            b = temp;

        }

        return a;
    }

    public static void main(String []args) {


      //  System.out.println(gcd(3,15));

    }




}
