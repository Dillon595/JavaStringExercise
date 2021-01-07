
package homework9;

public class Test {

	public static void main(String[] args) {
		Person p1 = new Person("张三", 20, 55);
		Person p2 = new Person("张三", 20, 55);
		System.out.println(p1.equals(p2));		//此处调用的为在Person中重写的equals方法

		Person p3 = new Person("张三", 30, 55);
		Person p4 = new Person("李四", 40, 56);
		System.out.println(p3.Max(p4));			//此处Max（）为Person中的方法
	}

}
