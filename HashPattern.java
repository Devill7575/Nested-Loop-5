/*      # = = = =
        = # = = =
        = = # = =
        = = = # =
        = = = = #        */


import java.io.*;

class HashPattern {
        public static void main(String ar []) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter row");
                int row = Integer.parseInt(br.readLine());

                 for(int i=1; i<=row; i++) {
                          for(int j=1; j<=row; j++) {
                                  if(i==j) {
                                          System.out.print("# ");
                                  }
                                  else{
                                          System.out.print("= ");
                                  }
                          }
                          System.out.println();
                 }
        }
}