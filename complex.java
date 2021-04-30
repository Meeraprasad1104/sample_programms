class complex
{
    int real,imag;
    void read(int a,int b)
    {
        real=a;
        imag=b;
    }
    void display()
    {
        System.out.println("\n\t" + real + "\t" + "+" + "\t" + imag + "i" );
    }
   
    public static void main(String arg[])
    {
        int temp1,temp2;
        complex c1=new complex();
        c1.read(2,5);
        c1.display();
        complex c2=new complex();
        c2.read(4,8);
        c2.display();
        temp1=c1.real + c2.real;
        temp2=c1.imag + c2.imag;
        System.out.println("\t___________________");
        System.out.println("\n\t" + temp1 + "\t" + "+" + "\t" + temp2 + "i");
        
    }
}