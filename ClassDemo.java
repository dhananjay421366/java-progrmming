class ClassDemo {
    public static void main(String args[]) {
        System.out.println("Inside main");
        marvellous mobj1 = new marvellous();
        marvellous mobj2 = new marvellous(11, 21);

        System.out.println(mobj1);
        System.out.println(mobj2.i);
        System.out.println(mobj2.j);
        mobj2.fun();

    }
}


class marvellous {
    public int i;
    public int j;

    public marvellous() { // it is constructor
        System.out.println("Inside defaut constructor");
        this.i = 0;
        this.j = 0;
    }

    public marvellous(int a, int b) {
        System.out.println("Inside parameterised constructor");
        this.i = a;
        this.j = b;
    }

    public void fun() { // it is function
        System.out.println("Inside fun method");
    }
}

