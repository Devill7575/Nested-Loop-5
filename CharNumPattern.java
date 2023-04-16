import java.io.*;

class CharNumPattern {
        public static void main(String ar []) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter row");
                int row = Integer.parseInt(br.readLine());
                int num = 0;
                for (int i=1; i<=row;i++) {
                        num = num+i;
                }

                char ch = 'A';
                int asciiValue = (int) ch;
                int newAsciiValue = asciiValue + (num-1);
                char newCh = (char) newAsciiValue;

                for(int i=1;i<=row;i++) {
                        for(int j=1;j<=i;j++) {
                                if(row%2==1) {

                                                if(i%2==1) {
                                                        System.out.print(newCh+" ");
                                                }
                                                else{
                                                        System.out.print(num+" ");
                                                }
                                }
                                else{
                                        if(i%2==0) {
                                                        System.out.print(newCh+" ");
                                                }
                                                else{
                                                        System.out.print(num+" ");
                                                }
                                }

                                newCh--;
                                num--;
                        }
                        System.out.println();
                }
        }
}