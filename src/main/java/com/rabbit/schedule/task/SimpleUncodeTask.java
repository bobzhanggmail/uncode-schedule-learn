package com.rabbit.schedule.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class SimpleUncodeTask {

	private static int i = 0;
    private Logger log = LoggerFactory.getLogger(SimpleUncodeTask.class);
    
    public void uncodePrint1(String name){
    	log.info("===========uncodePrint1 start!name:{}=========", name);
        log.info("uncodePrint1:"+i);i++;
        log.info("===========uncodePrint1 end !name:{}=========", name);
    }
    
    public void uncodePrint2(){
    	log.info("===========uncodePrint2 start!=========");
        log.info("uncodePrint2:"+i);i++;
        log.info("===========uncodePrint2 end !=========");
    }
    
    public void uncodePrint3(){
    	log.info("===========uncodePrint3 start!=========");
        log.info("uncodePrint3:"+i);i++;
        log.info("===========uncodePrint3 end !=========");
    }
}
