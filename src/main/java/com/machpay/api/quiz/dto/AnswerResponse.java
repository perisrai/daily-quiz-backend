package com.machpay.api.quiz.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AnswerResponse {
    private boolean correct;

    private Long correctAnswer;
}
