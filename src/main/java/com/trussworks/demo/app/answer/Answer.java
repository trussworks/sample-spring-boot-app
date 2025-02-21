package com.trussworks.demo.app.answer;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class Answer {
    @Id
    @GeneratedValue
    private Long id;
    private String answer;

    public Answer(String answer) {
        this.answer = answer;
    }

    protected Answer() {}
}
