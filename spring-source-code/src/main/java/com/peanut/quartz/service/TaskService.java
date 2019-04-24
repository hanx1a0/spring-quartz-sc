package com.peanut.quartz.service;

import org.springframework.stereotype.Component;

/**
 * 2 * @Author: hanx1a0
 * 3 * @Date: 2019/4/14 15:27
 * 4
 * 这里是在测试org.quartz.simpl.RAMJobStore的工作原理
 */

@Component("taskService")
public class TaskService {

    private int cnt1 = 0, cnt2 = 0, cnt3 = 0, cnt4 = 0, cnt5 = 0, cnt6 = 0, cnt7 = 0, cnt8 = 0, cnt9 = 0, cnt10 = 0, cnt11 = 0, cnt12 = 0, cnt13 = 0, cnt14 = 0, cnt15 = 0;

    private final int SLEEP_TIME = 8 * 1000;

    public void method1() throws InterruptedException {
        Thread.sleep(SLEEP_TIME);
        cnt1++;
    }

    public void method2() throws InterruptedException {
        Thread.sleep(SLEEP_TIME);
        cnt2++;
    }

    public void method3() throws InterruptedException {
        Thread.sleep(SLEEP_TIME);
        cnt3++;
    }

    public void method4() throws InterruptedException {
        Thread.sleep(SLEEP_TIME);
        cnt4++;
    }

    public void method5() throws InterruptedException {
        Thread.sleep(SLEEP_TIME);
        cnt5++;
    }

    public void method6() throws InterruptedException {
        Thread.sleep(SLEEP_TIME);
        cnt6++;
    }

    public void method7() throws InterruptedException {
        Thread.sleep(SLEEP_TIME);
        cnt7++;
    }

    public void method8() throws InterruptedException {
        Thread.sleep(SLEEP_TIME);
        cnt8++;
    }

    public void method9() throws InterruptedException {
        Thread.sleep(SLEEP_TIME);
        cnt9++;
    }

    public void method10() throws InterruptedException {
        Thread.sleep(SLEEP_TIME);
        cnt10++;
    }

    public void method11() throws InterruptedException {
        Thread.sleep(SLEEP_TIME);
        cnt11++;
    }

    public void method12() throws InterruptedException {
        Thread.sleep(SLEEP_TIME);
        cnt12++;
    }

    public void method13() throws InterruptedException {
        Thread.sleep(SLEEP_TIME);
        cnt13++;
    }

    public void method14() throws InterruptedException {
        Thread.sleep(SLEEP_TIME);
        cnt14++;
    }

    public void method15() throws InterruptedException {
        Thread.sleep(SLEEP_TIME);
        cnt15++;
    }

    public void printExcuteResult() {
        StringBuffer sb = new StringBuffer();
        sb.append("\nmethod1:" + cnt1);
        sb.append("\nmethod2:" + cnt2);
        sb.append("\nmethod3:" + cnt3);
        sb.append("\nmethod4:" + cnt4);
        sb.append("\nmethod5:" + cnt5);
        sb.append("\nmethod6:" + cnt6);
        sb.append("\nmethod7:" + cnt7);
        sb.append("\nmethod8:" + cnt8);
        sb.append("\nmethod9:" + cnt9);
        sb.append("\nmethod10:" + cnt10);
        sb.append("\nmethod11:" + cnt11);
        sb.append("\nmethod12:" + cnt12);
        sb.append("\nmethod13:" + cnt13);
        sb.append("\nmethod14:" + cnt14);
        sb.append("\nmethod15:" + cnt15);
        System.out.println(sb.toString());
    }

}
