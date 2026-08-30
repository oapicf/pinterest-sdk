package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.LeadFormQuestionFieldType;
import org.openapitools.model.LeadFormQuestionType;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class LeadFormQuestion implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("custom_question_field_type")
  private LeadFormQuestionFieldType customQuestionFieldType;

  /**
   * Question label for a custom question.
   */
  @JsonProperty("custom_question_label")
  private String customQuestionLabel;

  /**
   * Question options for a custom question.
   */
  @JsonProperty("custom_question_options")
  private List<String> customQuestionOptions;

  @JsonProperty("question_type")
  private LeadFormQuestionType questionType;

  /**
   * 
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
   * 
   * @return questionType
   */
  public LeadFormQuestionType getQuestionType() {
    return questionType;
  }

  public void setQuestionType(LeadFormQuestionType questionType) {
    this.questionType = questionType;
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
    return Objects.equals(this.customQuestionFieldType, leadFormQuestion.customQuestionFieldType) &&
        Objects.equals(this.customQuestionLabel, leadFormQuestion.customQuestionLabel) &&
        Objects.equals(this.customQuestionOptions, leadFormQuestion.customQuestionOptions) &&
        Objects.equals(this.questionType, leadFormQuestion.questionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customQuestionFieldType, customQuestionLabel, customQuestionOptions, questionType);
  }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
