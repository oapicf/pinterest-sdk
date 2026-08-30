package org.openapitools.server.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.QuizPinOption;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * A specific quiz inquiry.
 */
public class QuizPinQuestion   {

    private List<@Valid QuizPinOption> options = new ArrayList<>();
    private BigDecimal questionId;
    private String questionText;

    /**
     * Default constructor.
     */
    public QuizPinQuestion() {
    // JSON-B / Jackson
    }

    /**
     * Create QuizPinQuestion.
     *
     * @param options options
     * @param questionId questionId
     * @param questionText questionText
     */
    public QuizPinQuestion(
        List<@Valid QuizPinOption> options, 
        BigDecimal questionId, 
        String questionText
    ) {
        this.options = options;
        this.questionId = questionId;
        this.questionText = questionText;
    }



    /**
     * Get options
     * @return options
     */
    public List<@Valid QuizPinOption> getOptions() {
        return options;
    }

    public void setOptions(List<@Valid QuizPinOption> options) {
        this.options = options;
    }

    /**
     * Get questionId
     * @return questionId
     */
    public BigDecimal getQuestionId() {
        return questionId;
    }

    public void setQuestionId(BigDecimal questionId) {
        this.questionId = questionId;
    }

    /**
     * Get questionText
     * @return questionText
     */
    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuizPinQuestion {\n");
        
        sb.append("    options: ").append(toIndentedString(options)).append("\n");
        sb.append("    questionId: ").append(toIndentedString(questionId)).append("\n");
        sb.append("    questionText: ").append(toIndentedString(questionText)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

