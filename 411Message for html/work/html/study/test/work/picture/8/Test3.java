package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//1.后端测试数据库
//2.代码测试前端连接
//3.前后端 贯通测试
public class Test3 {

	public static void main(String[] args) {
		// 连接类
		Connection conn = null;
		//编译sql语句
		Statement stmt = null;
		//遍历数据库
		ResultSet rs = null;
		try {
			// 1.加载驱动
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			// 2.建立连接
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/students",
					"root", "root");
			//查询
			stmt = conn.createStatement();
			String sql = "select * from student";
			rs = stmt.executeQuery(sql);
			System.out.println("测试班学生信息表");
			System.out.println("学生姓名\t学生密码");
			while (rs.next()) {
				System.out.print(rs.getString("userName") + "\t");
				System.out.println(rs.getString(2));
			}


		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}
		}

	}

}
