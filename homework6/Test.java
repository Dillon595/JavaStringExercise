/**  
 * @Title: Test.java
 * @Description: 在控制台任意输入一个字符串，统计其中大写字母的个数，小写字母的个数，数字的个数，其他符号的个数
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
		int upNumber = 0;	//大写字母数
		int lowNumber = 0;	//小写字母数
		int number = 0;		//数字数
		int otherNumber = 0;	//其它字符数
		
		char []	arr = str.toCharArray();			//先将输入的字符串转换为char型数组
		for(int i=0;i<arr.length;i++) {				//循环遍历char型数组
			if(Character.isUpperCase(arr[i])) {		//如果是大写字母
				upNumber++;
			}else if(Character.isLowerCase(arr[i])) {	//如果是小写字母
				lowNumber++;
			}else if(Character.isDigit(arr[i])){		//如果是数字
				number++;
			}else {						//其它
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
