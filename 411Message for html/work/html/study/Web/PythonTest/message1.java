上节课代码优化
import java.util.InputMismatchException;
import java.util.Scanner;
/*
author:steam-404
*/
public class Main{
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("请输入三组数字");
      double num1, num2, num3;
      try {
      num1= input.nextDouble();
      num2= input.nextDouble();
      num3= input.nextDouble();
      if(num1>=1&&num2>=1&&num3>=1){
      System.out.println(triangle(num1,num2,num3));
      }else if(num1<=0||num2<=0||num3<=0){
      System.out.println("请勿输入0和负数");
      System.out.println("请重新输入");
      }
      }catch (InputMismatchException e){
      System.out.println("数据类型有误");
      }
      }
      public static String triangle(double num1,double num2,double num3){
      String result;
      if(num1+num2>num3||num1+num3>num2||num3+num2>num1){
      if (num1+num2==num3||num1+num3==num2||num2+num3==num1){
      result="不能组成三角形";
      }else if(num1==num2&&num2==num3){
      result="等边三角形";
      }else if(num1==num2||num2==num3||num1==num3){
      result="等腰三角形";
      } else if ((num1*num1)+(num2*num2)==num3*num3||(num1*num1)+(num3*num3)==num2*num2||(num2*num2)+(num3*num3)==num1*num1) {
      result="直角三角形";
      } else{
      result="不规则三角形";
      }
      }else {
      result="不能组成三角形";
      }
   return result;
   }
}