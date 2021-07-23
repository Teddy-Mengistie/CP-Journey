//credit for scanner https://gist.github.com/alsuga/85ff07d7a080ec06c762
import java.io.*;
import java.util.*;
 
public class MyClass {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        for(long t = sc.nextLong(); t > 0; t--){
            HashMap<Character, Integer> map = new HashMap<Character, Integer>();
            String s = sc.nextLine();
            int sol = 0;
            int temp = 0;
            for(int i = 0; i < s.length(); i++){
                Character curr = new Character(s.charAt(i));
                if(map.containsKey(curr)){
                    map.replace(curr, map.get(curr) + 1);
                    continue;
                }
                map.put(curr, 1);
            }
            for(Character c: map.keySet()){
                if(map.get(c) >= 2) sol++;
                else if(map.get(c) == 1) temp ++;
            }
            sol += temp/2;
            System.out.println(sol);
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
