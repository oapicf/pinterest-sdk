package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.LeadFormQuestionFieldType;
import org.openapitools.server.model.LeadFormQuestionType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class LeadFormQuestion   {

    private LeadFormQuestionFieldType customQuestionFieldType;
    private String customQuestionLabel;
    private List<String> customQuestionOptions;
    private LeadFormQuestionType questionType;

    /**
     * Default constructor.
     */
    public LeadFormQuestion() {
    // JSON-B / Jackson
    }

    /**
     * Create LeadFormQuestion.
     *
     * @param customQuestionFieldType customQuestionFieldType
     * @param customQuestionLabel Question label for a custom question.
     * @param customQuestionOptions Question options for a custom question.
     * @param questionType questionType
     */
    public LeadFormQuestion(
        LeadFormQuestionFieldType customQuestionFieldType, 
        String customQuestionLabel, 
        List<String> customQuestionOptions, 
        LeadFormQuestionType questionType
    ) {
        this.customQuestionFieldType = customQuestionFieldType;
        this.customQuestionLabel = customQuestionLabel;
        this.customQuestionOptions = customQuestionOptions;
        this.questionType = questionType;
    }



    /**
     * Get customQuestionFieldType
     * @return customQuestionFieldType
     */
    public LeadFormQuestionFieldType getCustomQuestionFieldType() {
        return customQuestionFieldType;
    }

    public void setCustomQuestionFieldType(LeadFormQuestionFieldType customQuestionFieldType) {
        this.customQuestionFieldType = customQuestionFieldType;
    }

    /**
     * Question label for a custom question.
     * @return customQuestionLabel
     */
    public String getCustomQuestionLabel() {
        return customQuestionLabel;
    }

    public void setCustomQuestionLabel(String customQuestionLabel) {
        this.customQuestionLabel = customQuestionLabel;
    }

    /**
     * Question options for a custom question.
     * @return customQuestionOptions
     */
    public List<String> getCustomQuestionOptions() {
        return customQuestionOptions;
    }

    public void setCustomQuestionOptions(List<String> customQuestionOptions) {
        this.customQuestionOptions = customQuestionOptions;
    }

    /**
     * Get questionType
     * @return questionType
     */
    public LeadFormQuestionType getQuestionType() {
        return questionType;
    }

    public void setQuestionType(LeadFormQuestionType questionType) {
        this.questionType = questionType;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LeadFormQuestion {\n");
        
        sb.append("    customQuestionFieldType: ").append(toIndentedString(customQuestionFieldType)).append("\n");
        sb.append("    customQuestionLabel: ").append(toIndentedString(customQuestionLabel)).append("\n");
        sb.append("    customQuestionOptions: ").append(toIndentedString(customQuestionOptions)).append("\n");
        sb.append("    questionType: ").append(toIndentedString(questionType)).append("\n");
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

