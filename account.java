class account
{
    int acc_no;
    String acc_type,hol_name;
    int balance;
    void read(int n,String t,String h)
    {
        acc_no=n;
        acc_type=t;
        hol_name=h;
    }
    void credit(int amount)
    {
        System.out.println("\t"+acc_no+"\t"+acc_type+"\t"+hol_name);
        balance=1000;
        balance=balance+amount;
        System.out.println("\n\t credit amount="+balance);
    }
    void debit(int  withdraw)
    {
        if(balance-withdraw >= 1000)
        {
            balance =balance-withdraw;
            System.out.println("\n\t after debit="+balance);
        }
        else
        {
            System.out.println("sufficent balance is needed");
        }
    }
    
    public static void main(String arg[])
    {
        System.out.println("\n\t_____FIRST ACCOUNT HOLDER______\n");
        
        account a1=new account();
        a1.read(1,"credit/savings","raju");
        a1.credit(10000);
        a1.debit(400);
        System.out.println("\n\t_____SECOND ACCOUNT HOLDER______\n");
        account a2=new account();
        a2.read(2,"credit/savings","radha");
        a2.credit(2000);
        a2.debit(500);
       
    }
}