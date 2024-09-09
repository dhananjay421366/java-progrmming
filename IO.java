import java.util.*;

class IO {
  public static void main(String[] args) {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter the first no :");
    int no1 = sobj.nextInt();
    System.out.println("Enter the second no :");
    int no2 = sobj.nextInt();

    int Ans = 0;
    Ans = no1 + no2;
    System.out.println("additon of two number is :" + Ans);
    sobj.close(); // close the
  }
}
