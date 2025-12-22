public class switch_class {
    public static void main (String[] args)
    {
       int num = '2';
        switch (num)
        {
            case '1':
                System.out.println("On duty");
                break;
            case '2':
                System.out.println(" Not Attended Classes");
                break;
            case '3':
                System.out.println("Attended Classes");
                break;

            default:
                System.out.println("Invalid");
        }
    }

}
