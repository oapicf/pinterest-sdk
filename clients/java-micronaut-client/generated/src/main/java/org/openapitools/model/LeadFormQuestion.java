/*
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.LeadFormQuestionFieldType;
import org.openapitools.model.LeadFormQuestionType;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * LeadFormQuestion
 */
@JsonPropertyOrder({
  LeadFormQuestion.JSON_PROPERTY_QUESTION_TYPE,
  LeadFormQuestion.JSON_PROPERTY_CUSTOM_QUESTION_FIELD_TYPE,
  LeadFormQuestion.JSON_PROPERTY_CUSTOM_QUESTION_LABEL,
  LeadFormQuestion.JSON_PROPERTY_CUSTOM_QUESTION_OPTIONS
})
@JsonTypeName("LeadFormQuestion")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-11-05T02:02:57.601423453Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class LeadFormQuestion {
    public static final String JSON_PROPERTY_QUESTION_TYPE = "question_type";
    private LeadFormQuestionType questionType;

    public static final String JSON_PROPERTY_CUSTOM_QUESTION_FIELD_TYPE = "custom_question_field_type";
    private LeadFormQuestionFieldType customQuestionFieldType;

    public static final String JSON_PROPERTY_CUSTOM_QUESTION_LABEL = "custom_question_label";
    private String customQuestionLabel;

    public static final String JSON_PROPERTY_CUSTOM_QUESTION_OPTIONS = "custom_question_options";
    private List<String> customQuestionOptions = null;

    public LeadFormQuestion() {
    }

    public LeadFormQuestion questionType(LeadFormQuestionType questionType) {
        this.questionType = questionType;
        return this;
    }

    /**
     * Get questionType
     * @return questionType
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_QUESTION_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public LeadFormQuestionType getQuestionType() {
        return questionType;
    }

    @JsonProperty(JSON_PROPERTY_QUESTION_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setQuestionType(LeadFormQuestionType questionType) {
        this.questionType = questionType;
    }

    public LeadFormQuestion customQuestionFieldType(LeadFormQuestionFieldType customQuestionFieldType) {
        this.customQuestionFieldType = customQuestionFieldType;
        return this;
    }

    /**
     * Get customQuestionFieldType
     * @return customQuestionFieldType
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_CUSTOM_QUESTION_FIELD_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public LeadFormQuestionFieldType getCustomQuestionFieldType() {
        return customQuestionFieldType;
    }

    @JsonProperty(JSON_PROPERTY_CUSTOM_QUESTION_FIELD_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCustomQuestionFieldType(LeadFormQuestionFieldType customQuestionFieldType) {
        this.customQuestionFieldType = customQuestionFieldType;
    }

    public LeadFormQuestion customQuestionLabel(String customQuestionLabel) {
        this.customQuestionLabel = customQuestionLabel;
        return this;
    }

    /**
     * Question label for a custom question.
     * @return customQuestionLabel
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_CUSTOM_QUESTION_LABEL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCustomQuestionLabel() {
        return customQuestionLabel;
    }

    @JsonProperty(JSON_PROPERTY_CUSTOM_QUESTION_LABEL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCustomQuestionLabel(String customQuestionLabel) {
        this.customQuestionLabel = customQuestionLabel;
    }

    public LeadFormQuestion customQuestionOptions(List<String> customQuestionOptions) {
        this.customQuestionOptions = customQuestionOptions;
        return this;
    }

    public LeadFormQuestion addCustomQuestionOptionsItem(String customQuestionOptionsItem) {
        if (this.customQuestionOptions == null) {
            this.customQuestionOptions = new ArrayList<>();
        }
        this.customQuestionOptions.add(customQuestionOptionsItem);
        return this;
    }

    /**
     * Question options for a custom question.
     * @return customQuestionOptions
     */
    @Nullable
    @Size(min=0, max=5)
    @JsonProperty(JSON_PROPERTY_CUSTOM_QUESTION_OPTIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getCustomQuestionOptions() {
        return customQuestionOptions;
    }

    @JsonProperty(JSON_PROPERTY_CUSTOM_QUESTION_OPTIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCustomQuestionOptions(List<String> customQuestionOptions) {
        this.customQuestionOptions = customQuestionOptions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LeadFormQuestion leadFormQuestion = (LeadFormQuestion) o;
        return Objects.equals(this.questionType, leadFormQuestion.questionType) &&
            Objects.equals(this.customQuestionFieldType, leadFormQuestion.customQuestionFieldType) &&
            Objects.equals(this.customQuestionLabel, leadFormQuestion.customQuestionLabel) &&
            Objects.equals(this.customQuestionOptions, leadFormQuestion.customQuestionOptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(questionType, customQuestionFieldType, customQuestionLabel, customQuestionOptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LeadFormQuestion {\n");
        sb.append("    questionType: ").append(toIndentedString(questionType)).append("\n");
        sb.append("    customQuestionFieldType: ").append(toIndentedString(customQuestionFieldType)).append("\n");
        sb.append("    customQuestionLabel: ").append(toIndentedString(customQuestionLabel)).append("\n");
        sb.append("    customQuestionOptions: ").append(toIndentedString(customQuestionOptions)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

