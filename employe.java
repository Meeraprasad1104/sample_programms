class  employe
{
    int emp_id,m_salary,y_salary;
    String emp_name;
    void read(int i,String n,int m)
    {
        emp_id=i;
        emp_name=n;
        m_salary=m;
    }
    void display()
    {
        y_salary=m_salary*12;
        System.out.println("\n\t"+emp_id+"\t"+emp_name+"\t"+m_salary);
        System.out.println("\n\tyearly salary="+y_salary);
    }
    public static void main(String arg[])
    {
        employe e1=new employe();
        e1.read(1,"reghu",7000);
        e1.display();
        employe e2=new employe();
        e2.read(2,"rahul",5000);
        e2.display();
    }
}