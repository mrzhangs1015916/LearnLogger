package com.zs.learn.learnlogger.LogController;

import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/log")
public class Writelog {
    private static Logger logger = Logger.getLogger(Writelog.class);
    private static org.slf4j.Logger logger2= LoggerFactory.getLogger(Writelog.class);
    @RequestMapping("/age")
    public String getParam(@RequestParam(name = "age",defaultValue = "30") String age){
        logger.debug("age:"+age);
        return "age:"+age;
    }
    @RequestMapping("/{id}")
    public String getVarible(@PathVariable("id") String id){
        logger2.debug("id:"+id);
        return "id:"+id;
    }
}
