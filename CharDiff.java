import java.io.*;

class CharDiff{
        public static void main (String ar []) throws IOException {
                BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
                        System.out.println("Enter 1st character");
                        char first = br.readLine().charAt(0);
                        System.out.println("Enter 2nd character");
                        char second = br.readLine().charAt(0);
                        if(first==second) {
                                System.out.println(first+" and "+second+" both characters are equal");
                        }
                        else{
                                int difference = first - second;
                                if(difference<0){
                                        difference = -difference;
                                }
                                System.out.println(first+" and "+second+" are different characters, difference = "+difference);
                        }
        }
}