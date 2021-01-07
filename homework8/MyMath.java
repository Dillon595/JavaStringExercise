
package homework8;

/**  
 * @ClassName: MyMath
 * @Description: 一个四舍五入类实现：能对double型数据的指定小数位取整，3.1456精确到小数点后2位：3.1456==>314.56==>315==>3.15
 * @author LYL
 * @date 2021-01-07 13:55:58
*/

public class MyMath {
	public static double haha(double d) {
		double test = Math.round(d*100);	//因为需精确到小数点后两位，所以先将输入的数字*100后四舍五入
		return test/100;			//再将*100后的数字精度恢复成小数点后两位
		
	}
}
