# JavaStringExercise
JavaString类的方法练习

1.模拟界面输入：
	定义人类包含姓名String，年龄int，性别String，体重float，婚姻boolean状况
（已婚true，未婚false）。构造函数给成员属性赋值，show方法显示所有成员属性。
	
由控制台输入5个“字符串”作为参数使用构造函数给相应的属性赋值。
	注意：控制台输入的都是字符串，而属性是各种其他类型！！！！！
              在调用构造函数前先转型

2.编写一个Java程序，完成以下功能：
	声明一个名为s的String对象，并使它的内容是"Call Me FeiXiang";
	1。显示该字符串长度。
	2.使用IndexOf与LastIndexOf以及substring截取出两个空格之间的内容并显示。
	3.使用CharAt 与Character的IsUpperCase()方法显示所有的大写字母
	4.**使用StringBuffer，去掉字符串中的“Me”
	5.**使用StringBuffer继续在字符串后使用append拼接上“ EDU ”

3.判断回文：
	一个字符串若从头阅读与从尾阅读是相同的则是回文字符串如：asdsa
	请用两种方式判断一个字符串是否为回文
	1.**String 的 toCharArray（）将字符串转为字符数组再判断头尾是否一致
	2.**StringBuffer的reverse（）与toString()方法

4：编写一个Java程序，用于
	1.测试两个字符串String firstString=" This is "和String secondString=" This is ";
	是否相等。（测试equals方式与“==”的结果有何不同分析为何不同）
	2.将" his father "与其中的firstString字符串连接,结果赋值给firstString并示。
	3.用z替换新字符串中的i，结果赋值给firstString并显示。
        4.去掉最后字符串中所有的空格，结果赋值给firstString并显示。

5.**电子邮件的格式要求：
	1.必须包含@和. 而且@只能有一个
	2.不能以@或.开头以及结尾
	3.@必须出现在.之前
写一个类Email，包含静态方法boolean checkEmail（String email） 可以用于检查字符串内容是否为合格电子邮件地址


6.在控制台任意输入一个字符串，统计其中大写字母的个数，小写字母的个数，数字的个数，其他符号的个数

7.IP地址：192.168.1.1 请获取该IP地址的每个数字并显示（ split（\\.） ）

8.使用Math类的方法 计算：
  1.输入一个数字，显示绝对值
  2.输入两个整数 ，计算幂
  3.输入一个浮点数，使用多种方式取整（向下取整，向上取整，四舍五入）
  4.**课后扩展：编写一个四舍五入类实现：能对double型数据的指定小数位取整
        3.1456精确到小数点后2位：
          3.1456==>314.56==>315==>3.15
  5.使用随机数产生6位的随机数字
    如 ：012339 ，182993 ，。。。。。。
    先获取随机数，然后转型为字符串，截取“.”后的6个数字

9.编写人类对象，包含属性：姓名，年龄，体重。
	要求实现：1.对象与对象之间能判断是否相等，所有属性都相等则对象也相等。
	 2.对象与对象之间能比较大小，先比较年龄，再比较体重，最后比较姓名
		  3.要求输出该对象时，显示该对象属性的值(toString)


10.字符串“hello I come from !!!”
       使用StringBuffer 去掉 “come” 显示结果
       使用StringBuffer在上次结果后 最后拼接上“Come On~~~~~~~~”显示结果
       反转整个字符串并显示结果
       将StringBuffer转型为String，赋值给变量str并显示

11、扩展练习：
	阅读API  分析String，StringBuffer，StringBuilder的异同
