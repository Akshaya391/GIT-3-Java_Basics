public class prime {
    public static void main (String[] args)
    {
        int a = 10;
        int count = 0;

        for(int i=1;i<=a;i++)
        {
            if (a % i == 0)
            {
                count++;
            }
        }
            if(count==0)
                System.out.println("It is a prime number");
            else
            {
                System.out.println("Not a prime number");
            }
        }
    }

