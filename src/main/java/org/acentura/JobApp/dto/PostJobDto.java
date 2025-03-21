package org.acentura.JobApp.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostJobDto {
    @NotBlank(message = "Title is mandatory")
    @NotNull(message = "Title is can't be null")
    @Size(min = 2, max = 256, message = "Title must be between 2 and 256 characters")
    private String postProfile;

    @Size(max = 256, message = "Title must be between 2 and 256 characters")
    private String postDesc;


    private Integer reqExperience;

}
