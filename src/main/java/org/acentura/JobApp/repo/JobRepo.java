package org.acentura.JobApp.repo;

import org.acentura.JobApp.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepo extends JpaRepository<JobPost,Long> {
}
