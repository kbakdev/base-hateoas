package com.hateoas.demo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.hateoas.RepresentationModel;

public class Greeting extends RepresentationModel<Greeting> {

    private final String content;

    @JsonCreator // Signals how Jackson can create an instance of this POJO.
    public Greeting(@JsonProperty("content") String content) { // Marks the field into which Jackson should put this constructor argument.
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
