/**  
 * @Title: Email.java
 * @Description: 
 * @author LYL
 * @date 2021-01-07 13:07:20
 */  

package homework5;

/**  
 * @ClassName: Email
 * @Description: 电子邮件的格式要求：
	1.必须包含@和. 而且@只能有一个
	2.不能以@或.开头以及结尾
	3.@必须出现在.之前
写一个类Email，包含静态方法boolean checkEmail（String email） 可以用于检查字符串内容是否为合格电子邮件地址
 * @author LYL
 * @date 2021-01-07 13:07:20
*/

public class Email {
	public static boolean checkEmail(String email) {
		int a1Index = email.indexOf('@');
		//System.out.println(a1Index);
		int a2Index = email.indexOf('@', a1Index+1);  //注意此处应从上一个找到@的下一位开始找
		//System.out.println(a2Index);
		int dianIndex = email.indexOf('.');
		//如果没有找到@  或者没有找到.  或者找到了第二个@或者以@开头或者以.开头      或者以@结尾                或者以.结尾          或者@的索引大于.的下标就返回false
		if(a1Index==-1||dianIndex==-1||a2Index!=-1||a1Index==0||dianIndex==0||a1Index==email.length()-1||dianIndex==email.length()-1||a1Index>dianIndex) {
			return false;
		}else {
			return true;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(Email.checkEmail("asdasd@m"));
	}
}
