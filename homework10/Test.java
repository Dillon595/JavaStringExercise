
package homework10;

/**  
 * @ClassName: Test
 * @Description: 字符串“hello I come from !!!”
			       使用StringBuffer 去掉 “come” 显示结果
			       使用StringBuffer在上次结果后 最后拼接上“Come On~~~~~~~~”显示结果
			       反转整个字符串并显示结果
			       将StringBuffer转型为String，赋值给变量str并显示
 * @author LYL
 * @date 2021-01-07 14:24:10
*/

public class Test {

	public static void main(String[] args) {
		String s = new String("hello i come from !!!");
		StringBuffer sb = new StringBuffer(s);
		sb = sb.replace(sb.indexOf("come"), sb.indexOf("come"), "");
		System.out.println(sb);
		
		sb = sb.append("Come On~~~~~~~~");
		System.out.println(sb);
		
		sb = sb.reverse();
		System.out.println(sb);
		
		String str = sb.toString();
		System.out.println(str);
	}

}
