/**  
 * @Title: Test.java
 * @Description: 编写一个Java程序，用于
		1.测试两个字符串String firstString=" This is "和String secondString=" This is ";
		是否相等。（测试equals方式与“==”的结果有何不同分析为何不同）
		2.将" his father "与其中的firstString字符串连接,结果赋值给firstString并示。
		3.用z替换新字符串中的i，结果赋值给firstString并显示。
        4.去掉最后字符串中所有的空格，结果赋值给firstString并显示。

 * @author LYL
 * @date 2021-01-07 12:52:39
 */

package homework4;

public class Test {
	public static void main(String[] args) {
		String s1 = "This is";
		String s2 = "This is";
		System.out.println(s1.equals(s2));//String中的equals方法为比较两个变量里所存放的内容是否相同
		System.out.println(s1 == s2);
		/**
		 * ==用来比较引用数据类型时比较的是两个变量的地址；此处因采用字面量的方式赋值：String s1/s2 = "This is";
		 * 所以s1和s2都指向字符常量池中的同一位置，因此s1==s2为true；
		 * 若采用对象方式赋值则为false例如s3==s4。
		 */
//		String s3 = new String("This is");
//		String s4 = new String("This is");
//		System.out.println(s3==s4);
		
		s1 = s1 + " his father";
		System.out.println(s1);
		
		s1 = s1.replace('i', 'z');
		System.out.println(s1);
		
		s1 = s1.replace(" ", "");
		System.out.println(s1);
	}
}
