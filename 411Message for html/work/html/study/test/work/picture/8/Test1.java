package Test;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//1.后端测试数据库
//2.代码测试前端连接
//3.前后端 贯通测试
public class Test1 {

	public static void main(String[] args){
		// 连接类
		Connection conn = null;
		try {
			// 1.加载驱动
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			// 2.建立连接
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/students",
					"root", "123456");//这里两个数值分别是 sql的账号名和密码
			System.out.println("数据库连接测试成功");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (conn != null) {
					conn.close();
					System.out.println("数据库关闭连接");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}
		}

	}

}

