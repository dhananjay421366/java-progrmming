
class Base {
    public void fun() { // 1000
        System.out.println("Inside the fun ");
    }

    public void gun() { // 2000
        System.out.println("Inside the gun ");
    }

    public void sun() {// 3000
        System.out.println("Inside the sun ");
    }

    public void run() {// 4000
        System.out.println("Inside the run ");
    }
}

class Derivd extends Base {

    public void fun() { // 5000
        System.out.println("Inside derived fun ");
    }

    public void sun() {// 6000
        System.out.println("Inside derived sun ");
    }

    public void run(int A) {// 7000
        System.out.println("Inside derived run  with one parameter ");
    }

    public void mun() {// 8000
        System.out.println("Inside derived mun  ");
    }
}

class Overriding {
    public static void main(String[] args) {
        Base bobj = new Derivd(); // up casting
        // Base bobj = new Base(); // no casting
        // Derivd dobj = new Derivd();// no casting
        // Derivd dobj = new Base(); //down casting

        bobj.fun();
        bobj.gun();
        bobj.sun();
        bobj.run();
        // bobj.run(11); error
        // bobj.mun(); error

    }
}
