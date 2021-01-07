/**  
 * @Title: Work2.java
 * @Description: 编写一个Java程序，完成以下功能：
	声明一个名为s的String对象，并使它的内容是"Call Me FeiXiang";
	1。显示该字符串长度。
	2.使用IndexOf与LastIndexOf以及substring截取出两个空格之间的内容并显示。
	3.使用CharAt 与Character的IsUpperCase()方法显示所有的大写字母
	4.**使用StringBuffer，去掉字符串中的“Me”
	5.**使用StringBuffer继续在字符串后使用append拼接上“ EDU ”
 * @author LYL
 * @date 2021-01-07 11:40:14
 */

package homework2;

public class Work2 {
	public static void main(String[] args) {
		String s = new String("Call Me FeiXiang");
		System.out.println("字符串长度为：" + s.length());
		
		System.out.println("两个空格之间的内容为：" + s.substring(s.indexOf(" "), s.lastIndexOf(" ")));
		
		for (int i = 0; i < s.length(); i++) {
			if (Character.isUpperCase(s.charAt(i))) {
				System.out.println(s.charAt(i));
			}
		}
		
		StringBuffer sb = new StringBuffer(s);
		sb.replace(sb.indexOf("Me"), sb.indexOf("Me")+2, "");
		System.out.println(sb);
		
		sb.append(" EDU ");
		System.out.println(sb);
	}
}
