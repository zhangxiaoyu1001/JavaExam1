package com.hand;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("请输入工资：");
        Scanner sc = new Scanner(System.in);
        double sumMoney = sc.nextDouble();
        double shuiMoney = calculateMoney(sumMoney);
        if (shuiMoney>=0){
            System.out.println("所需要缴纳的税费为："+shuiMoney);
        }else{
            System.out.println("您输入的工资金额有误！");
        }

    }

    private static double calculateMoney(double sumMoney) {
        if (sumMoney > 3500) {
            double shuiMoney;
            sumMoney = sumMoney - 3500;
            if (sumMoney <= 1500 && sumMoney > 0) {
                shuiMoney = sumMoney * 0.03;

            } else if (sumMoney <= 4500) {
                shuiMoney = sumMoney * 0.1;

            } else if (sumMoney <= 9000) {
                shuiMoney = sumMoney * 0.2;

            } else if (sumMoney <= 35000) {
                shuiMoney = sumMoney * 0.25;

            } else if (sumMoney <= 55000) {
                shuiMoney = sumMoney * 0.3;

            } else if (sumMoney <= 80000) {
                shuiMoney = sumMoney * 0.35;

            } else {

                shuiMoney = sumMoney * 0.45;
            }
            return shuiMoney;
        }
        else if (sumMoney>0 && sumMoney<3500){
            return 0;
        }
        else{
            return -1;
        }
    }


}
