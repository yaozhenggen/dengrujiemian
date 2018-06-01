package com.uplook.jk.util;//DBUtil连接数据库的工具类

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	//编写四个属性

	public static final String DRIVER = "com.mysql.jdbc.Driver";
	public static final String URL = "jdbc:mysql://192.168.1.248:3306/zhuyi";
	public static final String PASSWORD = "root";
	public static final String USERNAME = "root";
	
	//加载驱动                                                   //静态，只在程序运行时加载一次
	static{
		try {
			Class.forName(DRIVER);//映射
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//获得连接
	public static Connection getConnection(){
		try {
			return DriverManager.getConnection(URL,USERNAME,PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return null;
	}
	public static void main(String[] args){
		Connection conn = DBUtil.getConnection();
		System.out.println(conn);
	}
	/**
	 * 进行MD5加密
	 * @param source
	 * @return 加密后的内容
	 */
	public static String getMD5(byte[] source) throws Exception {
        String s = null;
        char hexDigits[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
        java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
        md.update(source);
        byte tmp[] = md.digest();       // MD5 的计算结果是一个 128 位的长整数，
                                        // 用字节表示就是 16 个字节
        char str[] = new char[16 * 2];  // 每个字节用 16 进制表示的话，使用两个字符，
                                        // 所以表示成 16 进制需要 32 个字符
        int k = 0;                      // 表示转换结果中对应的字符位置
        for (int i = 0; i < 16; i++) {  // 从第一个字节开始，对 MD5 的每一个字节
                                        // 转换成 16 进制字符的转换
            byte byte0 = tmp[i];        // 取第 i 个字节
            str[k++] = hexDigits[byte0 >>> 4 & 0xf]; // 取字节中高 4 位的数字转换,
                                                     // >>> 为逻辑右移，将符号位一起右移
            str[k++] = hexDigits[byte0 & 0xf];       // 取字节中低 4 位的数字转换
        }
        s = new String(str);                         // 换后的结果转换为字符串

        return s;
    }
	

}
