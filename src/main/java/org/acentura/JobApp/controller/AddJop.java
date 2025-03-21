package org.acentura.JobApp.controller;

import jakarta.validation.Valid;
import org.acentura.JobApp.dto.PostJobDto;
import org.acentura.JobApp.service.JobService;
import org.apache.coyote.Response;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
@Validated
public class AddJop {
    private JobService jobService;

    @GetMapping("/")
    public void SayHello(Response response) {
        System.out.println("Hello");
    }

    @PostMapping("/book/create")
    public void createJob(@RequestBody @Valid PostJobDto postJobDto) {
        jobService.addJob(postJobDto);
        System.out.println("success");
    }
}
