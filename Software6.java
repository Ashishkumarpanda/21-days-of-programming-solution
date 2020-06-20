import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Software6 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any number : ");
        String num = br.readLine();

        int number = Integer.valueOf(num);
      
        int freq[] = new int[10];
       
        for (int i = 0; i < 10; i++) {
            freq[i] = 0;
        }
        int digit;

        while (number > 0) {
            digit = number % 10;
            freq[digit]++;
            number = number / 10;
        }
        System.out.println("Digit \t" + "Frequency");
        for (int i = 0; i < 10; i++) {
            if (freq[i] != 0) {
                System.out.println(i + "\t" + freq[i]);
            }

        }

    }

}