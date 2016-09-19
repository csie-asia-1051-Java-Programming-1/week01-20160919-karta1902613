package hw;


/*
 * Topic:  請寫一個程式讓使用者輸入 n 並產生 6 個介於 1~n 之間的亂數 (輸出的亂數可重覆)
 * Date: 2016/09/19
 * Author: 105021043 劉凱文
 */
import java.util.Random;
public class hw02_105021043 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd =new Random();
        int v1 =rnd.nextInt(6)+1;
        int v2 =rnd.nextInt(6)+1;
        int v3 =rnd.nextInt(6)+1;
        int v4 =rnd.nextInt(6)+1;
        int v5 =rnd.nextInt(6)+1;
        int v6 =rnd.nextInt(6)+1;
        System.out.print(v1+" ");
        System.out.print(v2+" ");
        System.out.print(v3+" ");
        System.out.print(v4+" ");
        System.out.print(v5+" ");
        System.out.print(v6+" ");}}
