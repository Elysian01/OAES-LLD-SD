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

    ItemStatus status;
}
