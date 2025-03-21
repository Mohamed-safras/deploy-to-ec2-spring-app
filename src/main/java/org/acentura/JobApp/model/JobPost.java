package org.acentura.JobApp.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@Entity
public class JobPost {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int postId;

    @NotBlank(message = "Title is mandatory")
    @Size(min = 5, max = 255, message = "Title must be between 5 and 255 characters")
    private String postProfile;
    private String postDesc;
    private Integer reqExperience;

}
