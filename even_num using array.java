public class array {
    public static void main (String args[])
    {
        int[] num = { 1,2,3,4,5,6,7,8,9,10,11,12};
        System.out.println("Even numbers are:");

            for (int i = 0; i < num.length; i++)
                if (num[i]%2==0)
        {
            System.out.println(num[i]);
        }
    }
}
// array is the contiguous memory location
// in array if we are not initialize the number,the default value is the zero

