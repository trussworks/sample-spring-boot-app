package com.trussworks.demo.app.question;

import com.trussworks.demo.app.answer.Answer;
import com.trussworks.demo.app.answer.AnswerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/question")
public class QuestionController {

    private final AnswerService answerService;

    public QuestionController(AnswerService answerService) {
        this.answerService = answerService;
    }

    @PostMapping("/ask")
    ResponseEntity<String> ask(@RequestBody QuestionRequest request) {
        String question = request.question();
        if (question == null || question.isBlank() || !question.endsWith("?")) {
            return ResponseEntity
                    .badRequest()
                    .body("Did you forget to ask me a question?");
        }

        Answer answer = answerService.getAnswer(question);

        return ResponseEntity.ok(answer.getAnswer());
    }
}
