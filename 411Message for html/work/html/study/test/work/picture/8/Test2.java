package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//1.��˲������ݿ�
//2.�������ǰ������
//3.ǰ��� ��ͨ����
public class Test2 {

	public static void main(String[] args) {
		// ������
		Connection conn = null;
		//����sql���
		Statement stmt = null;
		try {
			// 1.��������
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			// 2.��������
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", 
					"root", "123456");
			//����
			stmt = conn.createStatement();
			String sql = "insert into student values ('kunkun','ikun'),('kunkun','ikun')";
			int count = stmt.executeUpdate(sql);
			if (count > 0) {
				System.out.println("���ӳɹ�");
			} else {
				System.out.println("����ʧ��");
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
