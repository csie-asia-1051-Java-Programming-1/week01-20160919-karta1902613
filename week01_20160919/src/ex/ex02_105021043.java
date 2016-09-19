package ex;
/*
 * Topic: 請寫一個程式讓使用者輸入體重單位 "公斤"，轉換成 "磅" (1磅 = 0.45359 公斤)
 * Date: 2016/09/19
 * Author: 105021043 劉凱文
 */
import java.util.Scanner;
public class ex02_105021043 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn=new Scanner(System.in);
System.out.print("請輸入公斤：");
int kg = scn.nextInt();
System.out.print(kg+"公斤="+kg/0.453590+"磅");
	}

}
