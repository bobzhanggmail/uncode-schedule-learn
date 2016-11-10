package com.rabbit.schedule.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


/**
 * @author juny.ye
 */
@Component
public class SimpleTask {

    private static int i = 0;
    private Logger log = LoggerFactory.getLogger(SimpleTask.class);
    
    //@Scheduled(fixedDelay = 1000)
    public void annoPrint(){
    	log.info("===========annoPrint start!=========");
        log.info("annoPrint:"+i);i++;
        log.info("===========annoPrint end !=========");
    }
    
    public void print() {
    	log.info("===========print start!=========");
        log.info("print:"+i);i++;
        log.info("===========print end !=========");
    }
    
    public void print1() {
        log.info("===========print1 start!=========");
        log.info("print1:"+i);i++;
        log.info("===========print1 end !=========");
    }
    
    public void print2() {
        log.info("===========print2 start!=========");
        log.info("print2:"+i);i++;
        log.info("===========print2 end !=========");
    }
    
    public void print3() {
        log.info("===========print3 start!=========");
        log.info("print3:"+i);i++;
        log.info("===========print3 end !=========");
    }
    
    public void print4() {
        log.info("===========print4 start!=========");
        log.info("print4:"+i);i++;
        log.info("===========print4 end !=========");
    }
    


}
