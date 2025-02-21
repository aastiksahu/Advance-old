package com.rays.test;

import java.util.Iterator;
import java.util.List;

import com.rays.dao.UserDao;
import com.rays.dto.UserDto;

public class TestUserDao {

	public static void main(String[] args) throws Exception {

		testSearch();
		testAdd();
		testDelete();
		testUpdate();
		testLoginid();
		testAuthenticate();
	}

	private static void testAuthenticate() throws Exception {

		UserDto dto = new UserDto();

		UserDao dao = new UserDao();

		dto.setLoginId("PriyaSingh");
		dto.setPassword("password789");

		List list = dao.authenticate(dto);

		Iterator it = list.iterator();

		while (it.hasNext()) {
			dto = (UserDto) it.next();
			System.out.println(dto.getId());
			System.out.println(dto.getFirstName());
			System.out.println(dto.getLastName());
			System.out.println(dto.getLoginId());
			System.out.println(dto.getPassword());

		}

	}

	private static void testLoginid() throws Exception {

		UserDao dao = new UserDao();

		UserDto dto = new UserDto();

		dto.setLoginId("RaviSharma");

		List list = dao.loginid(dto);

		Iterator it = list.iterator();

		while (it.hasNext()) {
			dto = (UserDto) it.next();
			System.out.println(dto.getId());
			System.out.println(dto.getFirstName());
			System.out.println(dto.getLastName());
			System.out.println(dto.getLoginId());
			System.out.println(dto.getPassword());
		}

	}

	private static void testUpdate() throws Exception {

		UserDao dao = new UserDao();

		UserDto dto = new UserDto();

		dto.setFirstName("Shubham");
		dto.setId(6);

		dao.update(dto);

	}

	private static void testDelete() throws Exception {
		UserDao dao = new UserDao();

		dao.delete(6);

	}

	private static void testAdd() throws Exception {

		UserDao dao = new UserDao();

		UserDto dto = new UserDto();

		dto.setId(6);
		dto.setFirstName("Priyansh");
		dto.setLastName("Bairagi");
		dto.setLoginId("priyanshbairagi");
		dto.setPassword("0987654321");

		dao.add(dto);

	}

	private static void testSearch() throws Exception {

		UserDao dao = new UserDao();

		UserDto dto = new UserDto();

		List list = dao.Search(dto);

		Iterator it = list.iterator();

		while (it.hasNext()) {
			dto = (UserDto) it.next();
			System.out.println(dto.getId());
			System.out.println(dto.getFirstName());
			System.out.println(dto.getLastName());
			System.out.println(dto.getLoginId());
			System.out.println(dto.getPassword());

		}

	}
}
