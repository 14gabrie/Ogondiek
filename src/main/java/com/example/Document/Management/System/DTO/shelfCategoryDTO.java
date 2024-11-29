package com.example.Document.Management.System.DTO;

import jakarta.validation.constraints.NotBlank;
import org.antlr.v4.runtime.misc.NotNull;

public class shelfCategoryDTO {
    @NotBlank(message = "Name is mandatory")
    private String name;


}
