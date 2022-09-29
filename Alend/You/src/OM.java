public class OM {
    
    
        public static void main(String [] args) {
            int a = 100, b = 10, c = 100, d = +100, e = -10;
            System.out.println(a+b);
            System.out.println(a-b);
            System.out.println(a*b);
            System.out.println(a/b);
            System.out.println(a%b);

            // Augmented Assignments
            c += 10;
            System.out.println(c);
            c -= 10;
            System.out.println(c);
            c *= 10;
            System.out.println(c);

            // Unary operator
            d++;
            System.out.println(d);
            d--;
            System.out.println(d);

            System.out.println(!true);
        }
    
}
