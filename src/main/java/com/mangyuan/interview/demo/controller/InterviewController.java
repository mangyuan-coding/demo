package com.mangyuan.interview.demo.controller;

import com.mangyuan.interview.demo.model.Interview;
import com.mangyuan.interview.demo.repository.InterviewRepository;
import com.mangyuan.interview.demo.service.InterviewService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Description
 * Author niumangyuan
 * Email niumangyuan@vcredit.com
 * Date 2020/6/30
 */
@RestController
public class InterviewController {

    @Resource
    private InterviewService interviewService;
    @Resource
    private InterviewRepository interviewRepository;

    @PostMapping("/interviews")
    public ResponseEntity<?> save(@RequestBody Interview interview) {
        interviewService.save(interview);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/interviews/{name}")
    public ResponseEntity<?> query(@PathVariable("name") String name) {
        return ResponseEntity.ok(interviewRepository.queryByName(name));
    }

    @DeleteMapping("/interviews/{name}")
    public ResponseEntity<?> remove(@PathVariable("name") String name) {
        interviewService.remove(name);
        return ResponseEntity.ok().build();
    }
}
