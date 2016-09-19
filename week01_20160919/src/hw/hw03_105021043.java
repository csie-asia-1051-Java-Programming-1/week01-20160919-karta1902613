package hw;

/*
 * Topic:請寫一個程式讓使用者輸入 6 個數(可以有小數)的值，每一個值都取四捨五入後輸出這 6 個數中的最小值
 * Date: 2016/09/19
 * Author: 105021043 劉凱文
 */

import java.util.Scanner;
public class hw03_105021043 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn=new Scanner(System.in);
		 float a = scn.nextFloat();Math.round(a);
		 float b = scn.nextFloat();Math.round(b);
		 float c = scn.nextFloat();Math.round(c);
		 float d = scn.nextFloat();Math.round(d);
		 float e = scn.nextFloat();Math.round(e);
		 float f = scn.nextFloat();Math.round(f);
		 float x = Math.min(a,b);
		 float y = Math.min(c,d);
		 float z = Math.min(e,f);
		 float o = Math.min(x,y);
		 float g = Math.min(o,z);
		 System.out.print(Math.round(g));}}
