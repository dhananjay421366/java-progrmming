import java. util.*;

class Arithmetic{
public int value1;
public int value2;

public Arithmetic (int A,int B){ // it construcor
    this.value1 = A;
    this.value2 = B;
}
 public int Additon(){
    int Result  = 0;
    Result = this.value1 + this.value2;
    return Result;
 }
  public int Subtraction(){
    int Result  = 0;
    Result = this.value1 - this.value2;
    return Result;
 }
}

class OOP{
    public static void main(String[] args) {
      
       int No1 = 0,No2 = 0,Ans = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the first no :");
        No1 = sobj.nextInt();

        System.out.println("Enter the Second no :");
        No2 = sobj.nextInt();

        Arithmetic aobj = new Arithmetic(No1, No2);

        Ans = aobj.Additon();
        System.out.println("Additon is :"+Ans);

        Ans = aobj.Subtraction();
        System.out.println("Substraction  is :"+Ans);
        sobj.close();
    }
}

