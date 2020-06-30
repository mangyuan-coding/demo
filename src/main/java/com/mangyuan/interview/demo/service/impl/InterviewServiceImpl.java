package com.mangyuan.interview.demo.service.impl;

import com.mangyuan.interview.demo.model.Interview;
import com.mangyuan.interview.demo.repository.InterviewRepository;
import com.mangyuan.interview.demo.service.InterviewService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Description
 * Author niumangyuan
 * Email niumangyuan@vcredit.com
 * Date 2020/6/30
 */
@Service
public class InterviewServiceImpl implements InterviewService {

    @Resource
    private InterviewRepository interviewRepository;

    @Override
    public void save(Interview interview) {
        interviewRepository.insert(interview);
    }

    @Override
    public void remove(String name) {
        interviewRepository.delete(name);
    }
}
