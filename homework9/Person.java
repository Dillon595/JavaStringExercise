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

	public Person Max(Person p) {								//比较后返回大的对象
		if (p == this) {								//若引用地址相同随便返回
			return this;
		}	//先判断年龄大小       再判断体重                    最后判断名字的长度
		if (this.age > p.age || this.weight > p.weight || this.name.length() > p.name.length()) {
			return this;
		}
		return p;
	}

	public boolean equals(Person p) {				//重写的equals方法，用来比较两个Person类型的对象是否相等
		if (p == this) {					//若引用地址相同则直接返回true
			return true;
		}
		if (p.name.equals(this.name) && p.age == this.age && p.weight == this.weight) {		//判断两个对象的名字，年龄，体重是否都相同
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {						//重写toString方法显示对象信息
		return "Person [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}

}
