package com.rabbit.schedule.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rabbit.schedule.dao.PersonDao;

@Component
public class PersonGrowTask {

	private Logger log = LoggerFactory.getLogger(PersonGrowTask.class);
	
	@Autowired
	private PersonDao personDao;
	
	public void grow(){
		log.info("person's name is zhangsan8 is growing...");
		personDao.increaseAge("zhangsan8");
	}
}
