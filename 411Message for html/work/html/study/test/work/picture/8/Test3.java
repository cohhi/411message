package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//1.��˲������ݿ�
//2.�������ǰ������
//3.ǰ��� ��ͨ����
public class Test3 {

	public static void main(String[] args) {
		// ������
		Connection conn = null;
		//����sql���
		Statement stmt = null;
		//�������ݿ�
		ResultSet rs = null;
		try {
			// 1.��������
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			// 2.��������
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/students",
					"root", "root");
			//��ѯ
			stmt = conn.createStatement();
			String sql = "select * from student";
			rs = stmt.executeQuery(sql);
			System.out.println("���԰�ѧ����Ϣ��");
			System.out.println("ѧ������\tѧ������");
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
