/**  
 * @Title: Person.java
 * @Description: 模拟界面输入：
	定义人类包含姓名String，年龄int，性别String，体重float，婚姻boolean状况（已婚true，未婚false）。
	构造函数给成员属性赋值，show方法显示所有成员属性。
	
	由控制台输入5个“字符串”作为参数使用构造函数给相应的属性赋值。
	注意：控制台输入的都是字符串，而属性是各种其他类型！！！！！
              在调用构造函数前先转型
 * @author LYL
 * @date 2021-01-07 11:30:59
 */

package homework1;

public class Person {
	String name;
	int age;
	String sex;
	float weight;
	boolean isMarry;

	public Person(String name, int age, String sex, float weight, boolean isMarry) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.weight = weight;
		this.isMarry = isMarry;
	}

	public void show() {
		System.out.println("Person [name=" + name + ", age=" + age + ", sex=" + sex + ", weight=" + weight
				+ ", isMarry=" + isMarry + "]");
	}

}
