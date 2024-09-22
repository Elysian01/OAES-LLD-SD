package org.assessment.itemHandler;

import org.assessment.common.DifficultyLevel;
import org.assessment.common.ItemStatus;
import org.assessment.common.QuestionType;

public abstract class Item {
    int itemId;
    String question;
    String topic;
    DifficultyLevel difficultyLevel;
    QuestionType questionType;

    public Item(String question, String topic, DifficultyLevel difficultyLevel, QuestionType questionType) {
        this.question = question;
        this.topic = topic;
        this.difficultyLevel = difficultyLevel;
        this.questionType = questionType;
    }

    public Item() {}
}
