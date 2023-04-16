//D4 C3 B2 A1
//A1 B2 C3 D4
//D4 C3 B2 A1
//A1 B2 C3 D4





import java.io.*;

class CharNumPattern2 {
        public static void main(String ar []) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter row");
                int row = Integer.parseInt(br.readLine());
                for(int i=1; i<=row; i++) {

                        char ch1= 'A';
                        char ch2= (char) (ch1+(row-1));
                        int num = row;

                        for(int j=1; j<=row; j++) {

                                if(i%2==1) {
                                        System.out.print(ch2);
                                        System.out.print(num);
                                        System.out.print(" ");
                                        ch2--;
                                        num--;
                                }
                                else {
                                        System.out.print(ch1);
                                        System.out.print(j);
                                        System.out.print(" ");
                                        ch1++;
                                }
                        }
                        System.out.println();
                }
        }
}
