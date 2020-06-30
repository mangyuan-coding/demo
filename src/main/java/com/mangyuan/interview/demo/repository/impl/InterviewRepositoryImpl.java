package com.mangyuan.interview.demo.repository.impl;

import com.mangyuan.interview.demo.model.Interview;
import com.mangyuan.interview.demo.repository.InterviewRepository;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Description
 * Author niumangyuan
 * Email niumangyuan@vcredit.com
 * Date 2020/6/30
 */
@Repository
public class InterviewRepositoryImpl implements InterviewRepository {

    private final Map<String, Interview> interviewMap = new ConcurrentHashMap<>();

    @Override
    public Interview queryByName(String name) {
        return interviewMap.get(name);
    }

    @Override
    public Interview insert(Interview interview) {
        return interviewMap.put(interview.getName(), interview);
    }

    @Override
    public void delete(String name) {
        interviewMap.remove(name);
    }
}
