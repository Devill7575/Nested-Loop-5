import java.io.*;

class TablePattern {
        public static void main(String ar[]) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter row");
                int row = Integer.parseInt(br.readLine());
                int n=row;


                for(int i=1; i<=row; i++) {
                        int m = n;
                        for(int j=m; j>=1; j--) {
                                int mult = i*j;
                                System.out.print(mult+" ");
                                m--;
                        }

                        System.out.println();
                n--;
                }
        }
}