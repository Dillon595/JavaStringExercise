
package homework7;

/**  
 * @ClassName: Test
 * @Description: IP地址：192.168.1.1 请获取该IP地址的每个数字并显示（ split（\\.） ）
 * @author LYL
 * @date 2021-01-07 13:31:59
*/

public class Test {

	public static void main(String[] args) {
		String ip = new String("192.168.1.1");
		String[] s1 = ip.split("\\.");
		System.out.println(s1[0]+s1[1]+s1[2]+s1[3]);
	}

}
