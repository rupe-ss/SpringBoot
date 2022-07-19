package com.learning.springboot.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

public class Person {
    private final UUID uuid;
    //We can make name not Blank meaning value of name can not be blank.
    //Remember @NotNull and @NotBlank is different
    @NotBlank
    private final String name;

    public Person(@JsonProperty("id") UUID uuid, @JsonProperty("name") String name) {
        this.uuid = uuid;
        this.name = name;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }
}
