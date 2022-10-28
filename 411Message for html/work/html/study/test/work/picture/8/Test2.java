package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//1.后端测试数据库
//2.代码测试前端连接
//3.前后端 贯通测试
public class Test2 {

	public static void main(String[] args) {
		// 连接类
		Connection conn = null;
		//编译sql语句
		Statement stmt = null;
		try {
			// 1.加载驱动
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			// 2.建立连接
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", 
					"root", "123456");
			//增加
			stmt = conn.createStatement();
			String sql = "insert into student values ('kunkun','ikun'),('kunkun','ikun')";
			int count = stmt.executeUpdate(sql);
			if (count > 0) {
				System.out.println("增加成功");
			} else {
				System.out.println("增加失败");
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
