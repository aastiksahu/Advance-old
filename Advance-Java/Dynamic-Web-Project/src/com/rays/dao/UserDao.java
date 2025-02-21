package com.rays.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.rays.dto.UserDto;

public class UserDao {

	public List Search(UserDto dto) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");

		PreparedStatement pstmt = conn.prepareStatement("select * from user");

		ResultSet rs = pstmt.executeQuery();

		List list = new ArrayList();

		while (rs.next()) {
			dto = new UserDto();
			dto.setId(rs.getInt(1));
			dto.setFirstName(rs.getString(2));
			dto.setLastName(rs.getString(3));
			dto.setLoginId(rs.getString(4));
			dto.setPassword(rs.getString(5));
			list.add(dto);

		}
		return list;

	}

	public void add(UserDto dto) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");

		PreparedStatement pstmt = conn.prepareStatement("insert into user values(?,?,?,?,?)");

		pstmt.setInt(1, dto.getId());
		pstmt.setString(2, dto.getFirstName());
		pstmt.setString(3, dto.getLastName());
		pstmt.setString(4, dto.getLoginId());
		pstmt.setString(5, dto.getPassword());

		int i = pstmt.executeUpdate();

		System.out.println("Data Added Succeccfully:" + i);
	}

	public void delete(int id) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");

		PreparedStatement pstmt = conn.prepareStatement("delete from user where id = ?");

		pstmt.setInt(1, id);

		int i = pstmt.executeUpdate();

		System.out.println("Data Deleted Successfully:" + i);
	}

	public void update(UserDto dto) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");

		PreparedStatement pstmt = conn.prepareStatement("update user set firstName =? where id = ?");

		pstmt.setString(1, dto.getFirstName());
		pstmt.setInt(2, dto.getId());

		int i = pstmt.executeUpdate();

		System.out.println("Data Update Successfully:" + i);

	}

	public List loginid(UserDto dto) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");

		PreparedStatement pstmt = conn.prepareStatement("select * from user where loginId = ?");

		pstmt.setString(1, dto.getLoginId());

		ResultSet rs = pstmt.executeQuery();

		List list = new ArrayList();

		while (rs.next()) {
			dto = new UserDto();
			dto.setId(rs.getInt(1));
			dto.setFirstName(rs.getString(2));
			dto.setLastName(rs.getString(3));
			dto.setLoginId(rs.getString(4));
			dto.setPassword(rs.getString(5));
			list.add(dto);

		}
		return list;
	}

	public List authenticate(UserDto dto) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");

		PreparedStatement pstmt = conn.prepareStatement("select * from user where loginId = ? and password = ?");

		pstmt.setString(1, dto.getLoginId());
		pstmt.setString(2, dto.getPassword());

		ResultSet rs = pstmt.executeQuery();

		List list = new ArrayList();

		while (rs.next()) {
			dto = new UserDto();
			dto.setId(rs.getInt(1));
			dto.setFirstName(rs.getString(2));
			dto.setLastName(rs.getString(3));
			dto.setLoginId(rs.getString(4));
			dto.setPassword(rs.getString(5));
			list.add(dto);

		}
		return list;
	}

}
