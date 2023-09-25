import java.util.*;
class Sip {
    public void sip(int i,int y,int p){
        int n = y*12;
        double z= (i/1200.0);
        double l=1+z;
        double h= Math.pow(l,n);
        n= n*p;
        int m = (int) (p*(((h-1)/z)*l));
        Sip s= new Sip();
        int d=s.In(m,y);
        System.out.println("total amount invested in "+y+" years: Rs "+n+"\n after"+y+" years it will be (inflation adjusted) : Rs "+d);

    }
    public void amount(int i,int y,int m,int n,double z,int b){
        double l=1+z;
        double h= Math.pow(l,n);
        double g= ((h-1)/z);
        int p = (int)(b/(g*l));
        System.out.println("after adjusting inflation for "+y+" years, your new goal is:Rs "+b+"\nto get your goal you must invest atleast Rs "+p);


    }
    public int inflation( int p,int y){
        double r = 4.0;
        double rr= 1+(r/100.0);
        double j= Math.pow(rr,y);
        int a=(int)(p*j);
        return a;
    }
    public int In(int a,int y){
        double r = 4.0;
        double rr= 1+(r/100.0);
        double j= Math.pow(rr,y);
        int p= (int)(a/j);
        return p;
    }
}
public class future {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        while(true) {
            System.out.println("what do you want to use ?");
            System.out.println("1: sip calculator \n2: sip goal planner");
            int ch= t.nextInt();
            System.out.println("expected annual rate of interest ?");
            int i= t.nextInt();
            System.out.println("number of years of investing");
            int y= t.nextInt();
            Sip s= new Sip();
            switch(ch){
                case 1:
                    System.out.println("how much can you invest monthly ?");
                    int p=t.nextInt();
                    s.sip(i,y,p);
                    break;
                case 2:
                    System.out.println(" what is your goal");
                    int m = t.nextInt();
                    int n = y*12;
                    double z= (i/1200.0);
                    int b=s.inflation(m,y);
                    s.amount(i,y,m,n,z,b);
                    break;
            }
        }

    }
}
