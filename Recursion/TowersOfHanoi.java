
public class TowersOfHanoi {
  public static void move(int n, int startPole, int endPole) {
    if (n== 0){
      return; 
    }
    int intermediatePole = 6 - startPole - endPole;
    System.out.println("First n: "+n+" start: "+startPole+" end: "+endPole+" inter "+intermediatePole);
    move(n-1, startPole, intermediatePole);
    System.out.println("Move " +n + " from " + startPole + " to " +endPole);
    System.out.println("Second n: "+n+" start: "+startPole+" end: "+endPole+" inter "+intermediatePole);
    move(n-1, intermediatePole, endPole);
  }
  
  public static void main(String[] args) {
    move(3, 1, 3);
  }

  
} 