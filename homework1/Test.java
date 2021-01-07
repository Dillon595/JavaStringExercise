/**  
 * @Title: Work1.java
 * @Description: 模拟界面输入：
	定义人类包含姓名String，年龄int，性别String，体重float，婚姻boolean状况（已婚true，未婚false）。
	构造函数给成员属性赋值，show方法显示所有成员属性。
	
	由控制台输入5个“字符串”作为参数使用构造函数给相应的属性赋值。
	注意：控制台输入的都是字符串，而属性是各种其他类型！！！！！
              在调用构造函数前先转型
 * @author LYL
 * @date 2021-01-07 11:28:42
 */  

package homework1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		System.out.println("请分别输入姓名，年龄，性别，体重，婚姻状况（已婚true，未婚false）");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int age = sc.nextInt();
		String sex = sc.next();
		float weight = sc.nextFloat();
		boolean isMarry = sc.nextBoolean();
		Person p = new Person(name,age,sex,weight,isMarry);
		p.show();
		sc.close();
	}
}
