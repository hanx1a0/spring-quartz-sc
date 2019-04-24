package com.peanut.quartz.test;

import com.peanut.quartz.service.TaskService;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 2 * @Author: hanx1a0
 * 3 * @Date: 2019/4/14 15:46
 * 4
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:application-context.xml")
public class TestTaskService extends TestCase {

    @Autowired
    private TaskService taskService;

    @Test
    public void testService() {
        try {
            while (true) {
                Thread.sleep(11000);
                taskService.printExcuteResult();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
