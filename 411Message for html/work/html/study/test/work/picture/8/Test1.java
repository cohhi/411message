package Test;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//1.��˲������ݿ�
//2.�������ǰ������
//3.ǰ��� ��ͨ����
public class Test1 {

	public static void main(String[] args){
		// ������
		Connection conn = null;
		try {
			// 1.��������
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			// 2.��������
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/students",
					"root", "123456");//����������ֵ�ֱ��� sql���˺���������
			System.out.println("���ݿ����Ӳ��Գɹ�");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (conn != null) {
					conn.close();
					System.out.println("���ݿ�ر�����");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}
		}

	}

}

