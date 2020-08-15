
/*Print the sum, difference and product of two complex numbers by creating a class named
'Complex' with separate methods for each operation whose real and imaginary parts are
entered by user.*/

import java.util.Scanner;
//Creating class complex
class Complex{
    int real;
    int imag;
    public Complex(int r, int i){
        real = r;
        imag = i;
    }
    //Addition of two complex numbers
    public static Complex add(Complex a, Complex b){
        return new Complex((a.real+b.real),(a.imag+b.imag));
    }
    //Difference of two complex numbers
    public static Complex diff(Complex a, Complex b){
        return new Complex((a.real-b.real),(a.imag-b.imag));
    }
    //Product of two complex numbers
    public static Complex product(Complex a, Complex b){
        return new Complex(((a.real*b.real)-(a.imag*b.imag)),((a.real*b.imag)+(a.imag*b.real)));
    }
    //Printing the Complex numbers
    public void printComplex(){
        if(real == 0 && imag!=0){
            System.out.println(imag+"i");
        }
        else if(imag == 0 && real!=0){
            System.out.println(real);
        }
        else{
            System.out.println(real+"+"+imag+"i");
        }
    }

}
//Driver class
class Output{
    public static void main(String[] args) {
        //Taking input from user
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int r2 = sc.nextInt();
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        //Creating instances
        Complex c = new Complex(r1, i1);
        Complex d = new Complex(r2, i2);
        //Calling the methods
        Complex e = Complex.add(c, d);
        Complex f = Complex.diff(c, d);
        Complex g = Complex.product(c, d);
        //Printing the output
        e.printComplex();
        f.printComplex();
        g.printComplex();
    }
}
