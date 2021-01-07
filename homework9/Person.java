package homework9;

/**
 * @ClassName: Person
 * @Description: 编写人类对象，包含属性：姓名，年龄，体重。 要求实现：1.对象与对象之间能判断是否相等，所有属性都相等则对象也相等。
 *               2.对象与对象之间能比较大小，先比较年龄，再比较体重，最后比较姓名
 *               3.要求输出该对象时，显示该对象属性的值(toString)
 * @author LYL
 * @date 2021-01-07 14:11:45
 */

public class Person {
	String name;
	int age;
	float weight;

	public Person(String name, int age, float weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	public Person Max(Person p) {
		if (p == this) {
			return null;
		}
		if (this.age > p.age || this.weight > p.weight || this.name.length() > p.name.length()) {
			return this;
		}
		return p;
	}

	public boolean equals(Person p) {
		if (p == this) {
			return true;
		}
		if (p.name.equals(this.name) && p.age == this.age && p.weight == this.weight) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}

}
