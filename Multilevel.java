
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

class Derivedx extends Derived {
    public int P, Q;

    public Derivedx() {
        System.out.println("Derivedx constructor");
    }
}

class Multilevel {
    public static void main(String[] args) {
        Derivedx dobj = new Derivedx(); // no casting
        dobj.fun();
        dobj.gun();
    }
}
