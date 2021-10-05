package intro.operator;

//関係演算子による条件の書き方
public class RelatonalOperatorSample {
    public static void main(String[] args) {
        int num = 90;

        //numが100以下である
        System.out.println(num <= 100);

        //numが奇数である
        System.out.println(num%2 == 1);
        System.out.println(num%3 == 0);

        //numが0以上かつ100以下
        System.out.println(num >=0 && num <= 100);
        System.out.println(!(num < 0 || num>100));

        //num
    }
}
