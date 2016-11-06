package com.rabbit.schedule.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class PersonMapperTest {

	@Autowired
	private PersonMapper personMapper;
	@Test
	public void test() {
		personMapper.getPerson(8);
	}

}
