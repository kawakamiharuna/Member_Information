package jp.co.aforce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jp.co.aforce.bean.Info;

public class InfoDAO extends DAO {
	//会員番号の重複チェック
	public int check(String lastName, String firstName, String sex, int birthYear, int birthMonth,
			int birthDay, String job, String phoneNumber, String mailAddress) throws Exception {

		Connection con = getConnection();
		

		PreparedStatement st = con.prepareStatement(
				"SELECT COUNT(*) FROM MemberInfo WHERE LastName = ? AND FirstName = ? AND Sex = ? AND BirthYear = ? AND BirthMonth = ? AND BirthDay = ? AND Job = ? AND PhoneNumber = ? AND MailAddress = ?");

		
		st.setString(1, lastName);
		st.setString(2, firstName);
		st.setString(3, sex);
		st.setInt(4, birthYear);
		st.setInt(5, birthMonth);
		st.setInt(6, birthDay);
		st.setString(7, job);
		st.setString(8, phoneNumber);
		st.setString(9, mailAddress);
		ResultSet rs = st.executeQuery();
		
		int count = 0;
		
		while(rs.next()) {
			count = rs.getInt("count(*)");
		}
	

		
		st.close();
		con.close();

		return count;
	}

	//会員番号の検索機能
//	public int search(String memberId, String lastName, String firstName, String sex, int birthYear, int birthMonth,
//			int birthDay, String job, String phoneNumber, String mailAddress) throws Exception {
//
//		//データベースの接続
//		Connection con = getConnection();
//		//SQLの実行
//		PreparedStatement st = con.prepareStatement("SELECT FROM MemberInfo WHERE MemberId = ?");
//		//値のセット
//		int count = 0;
//		st.setString(1, memberId);
//		st.setString(2, lastName);
//		st.setString(3, firstName);
//		st.setString(4, sex);
//		st.setInt(5, birthYear);
//		st.setInt(6, birthMonth);
//		st.setInt(7, birthDay);
//		st.setString(8, job);
//		st.setString(9, phoneNumber);
//		st.setString(10, mailAddress);
//		st.executeQuery();
//
//		st.close();
//		con.close();
//
//		return count;
//	}

	//登録機能
	public int insert(Info info) throws Exception {
		//データベースの接続
		Connection con = getConnection();
		//実行SQL
		PreparedStatement st = con.prepareStatement(
				"INSERT INTO MemberInfo VALUES(?,?,?,?,?,?,?,?,?,?)");
		//値のセット

		st.setString(1, info.getMemberId());
		st.setString(2, info.getLastName());
		st.setString(3, info.getFirstName());
		st.setString(4, info.getSex());
		st.setInt(5, info.getBirthYear());
		st.setInt(6, info.getBirthMonth());
		st.setInt(7, info.getBirthDay());
		st.setString(8, info.getJob());
		st.setString(9, info.getPhoneNumber());
		st.setString(10, info.getMailAddress());
		int line = st.executeUpdate();

		st.close();
		con.close();

		return line;

	}

//	//削除機能
//	public void delete(Info info) throws Exception {
//
//		try {
//			Connection con = getConnection();
//
		//PreparedStatement st = con.prepareStatement("DELETE FROM MenberInfo WHERE MemberId = ?");
//			st.setString(1, info.getMemberId());
//			st.setString(1, info.getMemberId());
//			st.setString(2, info.getLastName());
//			st.setString(3, info.getFirstName());
//			st.setString(4, info.getSex());
//			st.setInt(5, info.getBirthYear());
//			st.setInt(6, info.getBirthMonth());
//			st.setInt(7, info.getBirthDay());
//			st.setString(8, info.getJob());
//			st.setString(9, info.getPhoneNumber());
//			st.setString(10, info.getMailAddress());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	//更新機能
//
//	public String update(Info info) throws Exception {
//		String success = "";
//		try {
//			Connection con = getConnection();
//
//			PreparedStatement st = con.prepareStatement(
//					"UPDATE FROM MemberInfo SET LastName = ?,FirstName = ?, sex = ?, BirthYear = ?, BirthMonth = ?, BirthDay = ?, Job = ?, PhoneNumber = ?, MailAddress = ?  WHERE memberId = ?");
//
//			st.setString(1, info.getMemberId());
//			st.setString(2, info.getLastName());
//			st.setString(3, info.getFirstName());
//			st.setString(4, info.getSex());
//			st.setInt(5, info.getBirthYear());
//			st.setInt(6, info.getBirthMonth());
//			st.setInt(7, info.getBirthDay());
//			st.setString(8, info.getJob());
//			st.setString(9, info.getPhoneNumber());
//			st.setString(10, info.getMailAddress());
//
//			st.close();
//			con.close();
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return success;

//	}
}