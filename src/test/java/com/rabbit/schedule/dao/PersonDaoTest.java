package com.rabbit.schedule.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class PersonDaoTest extends AbstractJUnit4SpringContextTests {

	@Autowired
	private PersonDao personDao;
	
	@Test
	public void test() {
		System.out.println(personDao.getName(10));
	}
	
	@Test
	public void testIncreateAge(){
		System.out.println(personDao.increaseAge("zhangsan8"));
	}

}
