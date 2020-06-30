package com.mangyuan.interview.demo.repository;

import com.mangyuan.interview.demo.model.Interview;

/**
 * Description
 * Author niumangyuan
 * Email niumangyuan@vcredit.com
 * Date 2020/6/30
 */
public interface InterviewRepository {

    Interview queryByName(String name);

    Interview insert(Interview interview);

    void delete(String name);
}
