public class operator {
        public static void main (String[] args){
            int a = 15;
            int b = 4;

            int c = a+b;
            int d = a-b;
            int e = a*b;
            int f = a/b;
            float h = a/b; // implicit conversion from high dt to low dt //
            float i = (float)a/(float)b;

            System.out.println(c);
            System.out.println(d);
            System.out.println(e);
            System.out.println(f);
            System.out.println(h);
            System.out.println(i);
        }
    }


