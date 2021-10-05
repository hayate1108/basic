package intro.operator;


public class ArithmeticOperator {
    public static void main(String[] args) {

        int a = 5, b = 3;
                System.out.println("算術演算子(二項)");
                System.out.println(a + "+" + b + "=" + (a+b));
                System.out.println(a + "-" + b + "=" + (a-b));
                System.out.println(a + "*" + b + "=" + (a*b));
                System.out.println(a + "/" + b + "=" + (a/b));
                System.out.println(a + "%" + b + "=" + (a%b));



                int e = 1,f =2;
                System.out.println("算術演算子(単項)");
                System.out.println("-e:"+ -e);//-1
                System.out.println("e:"+e++);//1
                System.out.println("f:"+ ++f);//3
                System.out.println("e++ + ++f =" + (e++ + ++f));//2+4+=6
                System.out.println("e:"+e);//3
                System.out.println("f:"+f);//4


                double c = 5;
                int d = 3;
                System.out.println(c+"+"+d+"="+(c+d));
                System.out.println(c+"-"+d+"="+(c-d));
                System.out.println(c+"*"+d+"="+(c*d));
                System.out.println(c+"/"+d+"="+(c/d));
                System.out.println(c+"%"+d+"="+(c%d));


                int g;
                double h =10;
                //g = h;
                g = (int)h;



                int i,j;
                i=j=10;
                System.out.println("i:"+i);//10
                System.out.println("j:"+j);//10




        int x =1;
        System.out.println(x+=1);//2
        System.out.println(x*=10);//20

    }
}
