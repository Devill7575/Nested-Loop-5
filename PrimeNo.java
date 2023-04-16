import java.io.*;
class PrimeNo {
        public static void main(String ar[])throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
                System.out.println("Enter Starting Number :");
                int Start = Integer.parseInt(br.readLine());
                System.out.println("Enter Ending Number :");
                int End = Integer.parseInt(br.readLine());

                for(int i=Start; i<=End;i++) {
                        int count =0;
                        for (int j=1; j<=i; j++) {
                                if (i%j==0){
                                        count++;
                                }
                        }
                        if (count==2) {
                                System.out.println(i+", ");
                        }
                }
        }
}