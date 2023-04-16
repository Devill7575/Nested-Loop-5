import java.io.*;
class AddFact {
        public static void main(String ar[])throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
                System.out.println("Enter Number :");
                int num = Integer.parseInt(br.readLine());
                int sum=0;
                        while(num!=0) {
                                int rem= num%10;
                                int fact =1;
                                for(int j=rem; j>0;j--) {
                                        fact = fact*j;
                                }
                                sum = sum+fact;
                                num = num/10;
                        }
                        System.out.println("Addition of factorial of all digit = "+sum);        }
}