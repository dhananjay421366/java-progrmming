class Arithmetic {
    public int Addition(int A, int B) {
        return A + B;
    }

    public double Addition(double d, int B, int C) {
        return d + B + C;
    }

    public double Addition(double A, double B) {
        return (A + B);
    }

}

class Overloading {
    public static void main(String[] args) {
        Arithmetic aobj = new Arithmetic();
        double iret = 0;
        double diret = 0.0;
        iret = aobj.Addition(10, 11);
        System.out.println("Addition is :" + iret);
        iret = aobj.Addition(10, 11, 21);
        System.out.println("Additon is :" + iret);
        diret = aobj.Addition(10.8, 11, 7);
        System.out.println("Addition is :" + diret);
    }
}
