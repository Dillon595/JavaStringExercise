/**  
 * @Title: Test.java
 * @Description: 
 * @author LYL
 * @date 2021-01-07 13:20:37
 */

package homework6;

import java.util.Scanner;

/**
 * @ClassName: Test
 * @Description:
 * @author LYL
 * @date 2021-01-07 13:20:37
 */

public class Test {
	public static void check(String str) {
		int upNumber = 0;
		int lowNumber = 0;
		int number = 0;
		int otherNumber = 0;
		
		char []	arr = str.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if(Character.isUpperCase(arr[i])) {
				upNumber++;
			}else if(Character.isLowerCase(arr[i])) {
				lowNumber++;
			}else if(Character.isDigit(arr[i])){
				number++;
			}else {
				otherNumber++;
			}
		}
		
		System.out.println("大写字母有："+upNumber+"个，小写字母有："+lowNumber+"，数字有："+number+"个，其它符号有："+otherNumber+"个");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请随意输入：（空格则结束当次输入）");
		String str = sc.next();
		Test.check(str);
		sc.close();
	}
}
