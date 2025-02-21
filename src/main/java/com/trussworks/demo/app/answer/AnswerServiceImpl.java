package com.trussworks.demo.app.answer;

import org.springframework.stereotype.Service;

@Service
public class AnswerServiceImpl implements AnswerService {

    private final AnswerRepository answerRepository;

    public AnswerServiceImpl(AnswerRepository answerRepository) {
        this.answerRepository = answerRepository;
    }

    public Answer getAnswer(String question) {
        return answerRepository.findFirst1ByOrderByIdAsc();
    }
}
