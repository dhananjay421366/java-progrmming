class Base {
    public int A, B;

    public Base() {
        System.out.println("Base Constructor");
    }

    public void fun() {
        System.out.println("Base fun ");
    }
}

class Derived extends Base {
    public int X, Y;

    public Derived() {
        System.out.println("Derivd Constructor");
    }

    public void gun() {
        System.out.println("Derived gun");
    }
}

class Derivedx extends Base {
    public int P, Q;

    public Derivedx() {
        System.out.println("Derivedx constructor");
    }
}

class Hairarcal {
    public static void main(String[] args) {
        Derived dobj1 = new Derived();
        Derivedx dobj2 = new Derivedx(); // no casting
       dobj1.fun();
       dobj2   .fun();
    }
}
