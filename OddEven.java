import java.io.*;

class OddEven {
        public static void main(String ar []) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter start");
                int start = Integer.parseInt(br.readLine());
                System.out.println("enter end");
                int end = Integer.parseInt(br.readLine());

                for (int i=end; i>=start; i--){
                        if(i%2==0) {
                                System.out.print(i+", ");
                        }
                }
                System.out.println();
                for (int j=start; j<=end; j++){
                        if(j%2==1) {
                                System.out.print(j+", ");
                        }
                }
        }
}
