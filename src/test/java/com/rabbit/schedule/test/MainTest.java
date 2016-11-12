package com.rabbit.schedule.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import cn.uncode.schedule.util.ScheduleUtil;

public class MainTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("100001");
		list.add("000021");
		list.add("000031");
		list.add("000012");
		Collections.sort(list);
		
		System.out.println(list.get(0));
	}

	@Test
	public void testProperties(){
		System.out.println("qqqqqqqqq");
		System.out.println(ScheduleUtil.getServerCode());
	}
	
	@Test
	public void testIndex(){
		List<String> list = new ArrayList<String>();
		list.add("100001");
		list.add("000021");
		list.add("000031");
		list.add("000012");
		
		System.out.println(list.indexOf("000012"));
	}
	
	@Test
	public void testSub(){
		List<String> serverList = new ArrayList<String>();
		serverList.add("192.168.7.231$urerjefru$291929");
		List<String> serverIpList = new ArrayList<String>(serverList.size());
		for(String ser:serverList){
			serverIpList.add(ser.substring(0, ser.indexOf("$")));
		}
		System.out.println(serverIpList.get(0));
	}

}
