//credit: https://gist.github.com/alsuga/85ff07d7a080ec06c762
/////////////////////////////////////////////////////////////
import java.io.*;
import java.util.StringTokenizer;
 
public class MyClass {
  public static void main(String [] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    for(int t = sc.nextInt(); t > 0; t--){
      // interesting if Sum(x) > Sum(x+1)
      // basically, only numbers that end with a 9
      int n = sc.nextInt();
      System.out.println(n%10 == 9? n/10 + 1: n/10);
    }
  }
}
 
class Scanner{
  public BufferedReader reader;
  public StringTokenizer st;
 
  public Scanner(InputStream stream){
    reader = new BufferedReader(new InputStreamReader(stream));
    st = null;
  }
 
  public String next(){
    while(st == null || !st.hasMoreTokens()){
      try{
        String line  = reader.readLine();
        if(line == null) return null;
        st =  new StringTokenizer(line);
      }catch (Exception e){
        throw (new RuntimeException());
      }
    }
    return st.nextToken();
  }
 
  public int nextInt(){
    return Integer.parseInt(next());
  }
  public long nextLong(){
    return Long.parseLong(next());
  }
  public double nextDouble(){
    return Double.parseDouble(next());
  }
}
 
class OutputWriter{
  BufferedWriter writer;
 
  public OutputWriter(OutputStream stream){
    writer = new BufferedWriter(new OutputStreamWriter(stream));
  }
 
  public void print(int i) throws IOException {
    writer.write(i);
  }
 
  public void print(String s) throws IOException {
    writer.write(s);
  }
 
  public void print(char []c) throws IOException {
    writer.write(c);
  }
  public  void close() throws IOException {
    writer.close();
  }
 
}
