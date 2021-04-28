class product
{
    int pcode,price;
    String pname;
    void read(int c,String n,int p)
    {
        pcode=c;
        pname=n;
        price=p;
    }
    void disp()
    {
        System.out.println("\t" + pcode + "\t" + pname + "\t" + price);
    }
    
    public static void main(String arg[])
    {
        System.out.println("\t"+"***** PRODUCTS *****");
        product p1=new product();
        p1.read(100,"samsung",29000);
        p1.disp();
        product p2=new product();
        p2.read(200,"vivo",20600);
        p2.disp();
        product p3=new product();
        p3.read(300,"relame",10000);
        p3.disp();
        if(p1.price<p2.price && p1.price<p3.price)
        {
            System.out.println("\n\t"+p1.price+ "is smallest");
        }
        else if( p2.price <  p3.price)
        {
            System.out.println("\n\t"+p2.price+" is smallest");
        }
        else
        {
            System.out.println("\n\t"+p3.price+" is smallest");
        }
        

    }
 
}