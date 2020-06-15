public class Software {

    public static void main(String[] args) {

        double a = 5, b = 2, c = 1;
        double r1, r2;

        double d = b * b - 4 * a * c;
        System.out.printf("delta value :"+d);
        
        if(d > 0) {
            r1 = (-b + Math.sqrt(d)) / (2 * a);
            r2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.printf("root1 = %.2f and root2 = %.2f", r1 , r2);
        }
        else if(d == 0) {
            r1 = r2 = -b / (2 * a);

            System.out.printf("root1 = root2 = %.2f;", r1);
        }
        else {
            double real = -b / (2 *a);
            double imaginary = Math.sqrt(-d) / (2 * a);

            System.out.printf("\n root1 = %.2f+%.2fi and root2 = %.2f-%.2fi", real, imaginary, real, imaginary);
        }
    }
}
