
package homework8;

import java.util.Scanner;

/**  
 * @ClassName: Test
 * @Description: 使用Math类的方法 计算：
  1.输入一个数字，显示绝对值
  2.输入两个整数 ，计算幂
  3.输入一个浮点数，使用多种方式取整（向下取整，向上取整，四舍五入）
  4.**课后扩展：编写一个四舍五入类实现：能对double型数据的指定小数位取整
        3.1456精确到小数点后2位：
          3.1456==>314.56==>315==>3.15
  5.使用随机数产生6位的随机数字
    如 ：012339 ，182993 ，。。。。。。
    先获取随机数，然后转型为字符串，截取“.”后的6个数字
 * @author LYL
 * @date 2021-01-07 13:44:29
*/

public class Test {

	public static void main(String[] args) {
		System.out.println("请输入一个数字：（取绝对值）");
		Scanner sc = new Scanner(System.in);
		System.out.println(Math.abs(sc.nextInt()));			//Math.abs()为取绝对值
		
		System.out.println("请输入两个整数:(计算幂)");
		System.out.println(Math.pow(sc.nextInt(), sc.nextInt()));	//Math.pow(a,b)为取a的b次方
		
		System.out.println("请输入一个小数（取整）");
		float f1 = sc.nextFloat();
		System.out.println("向下取整"+Math.floor(f1));			
		System.out.println("向上取整"+Math.ceil(f1));
		System.out.println("四舍五入"+Math.round(f1));
		
		System.out.println(MyMath.haha(3.1456));
		StringBuffer sb = new StringBuffer();
		for(int x=0;x<6;x++) {			
			int i =(int)Math.floor(Math.random()*10);		//Math.random()*10为取0-9随机数
			sb.append(i);						//将生成的随机数依次拼接到sb中
		}
		System.out.println(sb);
		
		sc.close();
		
	}

}
