

public class demo
{
    public static void main(String[] args)
    {
        System.out.println("Using break");
        for (int i = 1; i <= 10; i++)
        {
            if (i == 4)
            {
                break;
            }
            System.out.println(i);
        }

        System.out.println("Using continue");
        for (int j = 1; j <= 10; j++)
        {
            if (j == 4)
            {
                continue;
            }
            System.out.println(j);
        }
    }
}
