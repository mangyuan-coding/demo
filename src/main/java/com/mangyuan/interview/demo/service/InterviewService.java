package com.mangyuan.interview.demo.service;

import com.mangyuan.interview.demo.model.Interview;

/**
 * Description
 * Author niumangyuan
 * Email niumangyuan@vcredit.com
 * Date 2020/6/30
 */
public interface InterviewService {

    void save(Interview interview);

    void remove(String name);
}
