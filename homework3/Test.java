/**  
 * @Title: Test.java
 * @Description: 判断回文：
	一个字符串若从头阅读与从尾阅读是相同的则是回文字符串如：asdsa
	请用两种方式判断一个字符串是否为回文
	1.**String 的 toCharArray（）将字符串转为字符数组再判断头尾是否一致
	2.**StringBuffer的reverse（）与toString()方法

 * @author LYL
 * @date 2021-01-07 11:55:21
 */

package homework3;

public class Test {
	public static void main(String[] args) {
		String s = new String("asdsa");
		char c[] = s.toCharArray();		
		
		//第一种方法

		System.out.println("************第一种***********");
		boolean isEqual = false;
		for (int i = 0; i <= c.length / 2; i++) {
			if (c[i] != c[c.length - 1 - i]) {
				System.out.println("不是回文");
				break;
			}
			isEqual = true;
		}
		if(isEqual) {
			System.out.println("是回文");
		}
		
		//第二种方法
		System.out.println("************第二种***********");
		StringBuffer sb = new StringBuffer(s);
		String sb1 = new String(sb.reverse());
		String sb2 = new String(sb.toString());
		
		if(sb1.equals(sb2)) {
			System.out.println("是回文");
		}else {
			System.out.println("不是回文");
		}
			
	}
}













