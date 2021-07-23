//credit for scanner https://gist.github.com/alsuga/85ff07d7a080ec06c762
import java.io.*;
import java.util.*;

public class MyClass {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        for(long t = sc.nextLong(); t > 0; t--){
            long n = sc.nextLong();
            long c1 = -1, c2 = -1;
            if(n%3 == 0){
                c1 = n/3;
                c2 = n/3;
            }else if((n-1)%3 == 0){
                c2 = (n-1) / 3;
                c1 = c2 + 1;
            }else{
                c1 = (n-2) / 3;
                c2 = c1 + 1;
            }
            System.out.println(c1 + " " + c2);
        }
    }
}
class Scanner {
    public BufferedReader reader;
    public StringTokenizer st;
 
    public Scanner(InputStream stream) {
        reader = new BufferedReader(new InputStreamReader(stream));
        st = null;
    }
 
    public String nextLine() {
        while (st == null || !st.hasMoreTokens()) {
            try {
                String line = reader.readLine();
                if (line == null) return null;
                st = new StringTokenizer(line);
            } catch (Exception e) {
                throw (new RuntimeException());
            }
        }
        String ret = "";
        while (st.hasMoreTokens()) {
            String curr = st.nextToken();
            ret += curr + (st.hasMoreTokens() ? " " : "");
        }
        return ret;
    }
 
    public boolean hasNext(){
        return st.hasMoreTokens();
    }
 
    public String next() {
        while (st == null || !st.hasMoreTokens()) {
            try {
                String line = reader.readLine();
                if (line == null) return null;
                st = new StringTokenizer(line);
            } catch (Exception e) {
                throw (new RuntimeException());
            }
        }
        return st.nextToken();
    }
 
    public int nextInt() {
        return Integer.parseInt(next());
    }
    public long nextLong() {
        return Long.parseLong(next());
    }
    public double nextDouble() {
        return Double.parseDouble(next());
    }
}
