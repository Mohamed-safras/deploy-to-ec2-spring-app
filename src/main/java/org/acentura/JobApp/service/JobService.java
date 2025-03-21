package org.acentura.JobApp.service;

import org.acentura.JobApp.dto.PostJobDto;
import org.acentura.JobApp.model.JobPost;
import org.acentura.JobApp.repo.JobRepo;
import org.springframework.stereotype.Service;

@Service
public class JobService {
    private JobRepo jobRepo;

    public JobPost addJob(PostJobDto postJobDto) {

        JobPost jobPost = new JobPost();

        jobPost.setPostProfile(postJobDto.getPostProfile());

        System.out.println(jobPost);
        return jobRepo.save(jobPost);
    }
}
