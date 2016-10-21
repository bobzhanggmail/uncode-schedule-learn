package com.rabbit.schedule.mapper;

import org.apache.ibatis.annotations.Select;

public interface PersonMapper {
	
	@Select("select name from person where id = #{id}")
	public String getPerson(long id);

}
