import static javax.swing.JOptionPane.*;

  public class RatNum{
    public static int sgd(int m, int n){
      if(n==0 || m==0){
        throw IllegalArgumentException();
      }
      else{
        m = abs(m);
        n = abs(n);
        int r = m % n;
        while(r != 0){
          m = n;
          n = r;
          r= m % n;
        }
      }
      return n;
    }
  }






  system.out.println("JAKOB JAKOB JAKOB HEJ DIN GALNING");
