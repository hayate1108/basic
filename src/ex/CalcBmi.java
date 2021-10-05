package ex;

import java.util.Scanner;

public class CalcBmi {
    /**
     * 実数の入力メソッド
     * @param message String 表示メッセージ
     * @return double 入力された値
     */
    static double inputDouble(String message) {
        Scanner scanner = new Scanner(System.in);//キーボード入力をするインスタンスを作成
        System.out.println(message);
        return scanner.nextDouble();//入力された値をdouble型で返す
    }

    public static void main(String[] args) {
        //身長・体重の入力
        double b = inputDouble("身長を入力してください（単位 m）");
        double a = inputDouble("体重を入力してください（単位 kg）");



        double c = a / Math.pow(b, 2);//bmi
        double d = (b * b) * 22;//ideal body weight
        c = Math.round((c  *10.0) / 10.0);
        d = Math.round((d * 10.0) / 10.0);

        System.out.println("weight" + a + "kg");
        System.out.println("height" + b + "m");
        System.out.println("BMI" +c);
        System.out.println("Ideal Body Weight" + d + "kg");

        if (c >= 40) {
            System.out.println(c + "は肥満4度です");
        } else if (c >= 35) {
            System.out.println(c + "は肥満３度です");
        } else if (c >= 30) {
            System.out.println(c + "は肥満２度です");
        } else if (c >= 25) {
            System.out.println(c + "は肥満１度です");
        } else if (c >= 18.5) {
            System.out.println(c + "は普通体重です");
        } else {
            System.out.println(c + "は低体重です");
        }
    }
}