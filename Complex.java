public class Complex {
    double real;
    double imag;

    Complex() {

    }

    Complex(double r, double i) {
        this.real = r;
        this.imag = i;

    }

    public static Complex difference(Complex a, Complex b) {
        Complex temp = new Complex();
        temp.real = a.real - b.real;
        temp.imag = a.imag - b.imag;
        return temp;
    }

    public static Complex Sum(Complex a, Complex b) {
        Complex temp = new Complex();
        temp.real = a.real + b.real;
        temp.imag = a.imag + b.imag;
        return temp;
    }

    public static Complex product(Complex a, Complex b) {
        Complex temp = new Complex();
        temp.real = (a.real * b.real) - (a.imag * b.imag);
        temp.imag = (a.real + b.imag) + (a.imag + b.real);
        return temp;
    }

    void showResult() {
        if (real == 0 && imag != 0) {
            System.out.println(imag + "i");
        } else if (real != 0 && imag == 0) {
            System.out.println(real);
        } else {
            System.out.println("Complex number is: " + real + " + " + imag + "i");
        }

    }

    public static void main(String[] args) {
        Complex a = new Complex(5, 6);
        Complex b = new Complex(2, 3);
        b.showResult();
        Complex Total = Complex.Sum(a, b);
        Total.showResult();
        Complex diff = Complex.difference(a, b);
        diff.showResult();
        Complex Pro = Complex.product(a, b);
        Pro.showResult();
    }

}
