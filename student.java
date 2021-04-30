class student
{
    int rollno,mark1,mark2,mark3,total;
    String name;
    void read(int r,String n,int m1 ,int m2,int m3)
    {
        rollno=r;
        name=n;
        mark1=m1;
        mark2=m2;
        mark3=m3;
    }
    void display()
    {
        
        System.out.println("\n\t"+rollno+"\t"+name+"\t"+mark1+"\t"+mark2+"\t"+mark3+"\n");
        
    }
    void total(int m1,int m2,int m3)
    {
        total=mark1+mark2+mark3;
        System.out.println(total);
    }
    public static void main(String arg[])
    {
        student s1=new student();
        s1.read(1,"Dev",34,45,78);
        s1.display();
        
        student s2=new student();
        s2.read(2,"Raju",22,56,88);
        s2.display();
        
        student s3=new student();
        s3.read(3,"Ganga",99,44,67);
        s3.display();

        if (s1.total > s2.total && s1.total > s3.total)
        {
            System.out.println("\t"+s1.name+"\tscored  Highest  mark");
        }
        else if(s2.total > s3.total)
        {
            System.out.println("\t"+s2.name+"\tscored  Highest  mark");
        }
        else
        {
            System.out.println("\t"+s3.name+"\tscored  Highest  mark ");
        }
     
    }
}