/**  
 * @Title: Email.java
 * @Description: 
 * @author LYL
 * @date 2021-01-07 13:07:20
 */  

package homework5;

/**  
 * @ClassName: Email
 * @Description: 
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
