package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.LeadFormQuestionFieldType;
import org.openapitools.vertxweb.server.model.LeadFormQuestionType;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LeadFormQuestion   {
  
  private LeadFormQuestionType questionType;
  private LeadFormQuestionFieldType customQuestionFieldType;
  private String customQuestionLabel;
  private List<String> customQuestionOptions;

  public LeadFormQuestion () {

  }

  public LeadFormQuestion (LeadFormQuestionType questionType, LeadFormQuestionFieldType customQuestionFieldType, String customQuestionLabel, List<String> customQuestionOptions) {
    this.questionType = questionType;
    this.customQuestionFieldType = customQuestionFieldType;
    this.customQuestionLabel = customQuestionLabel;
    this.customQuestionOptions = customQuestionOptions;
  }

    
  @JsonProperty("question_type")
  public LeadFormQuestionType getQuestionType() {
    return questionType;
  }
  public void setQuestionType(LeadFormQuestionType questionType) {
    this.questionType = questionType;
  }

    
  @JsonProperty("custom_question_field_type")
  public LeadFormQuestionFieldType getCustomQuestionFieldType() {
    return customQuestionFieldType;
  }
  public void setCustomQuestionFieldType(LeadFormQuestionFieldType customQuestionFieldType) {
    this.customQuestionFieldType = customQuestionFieldType;
  }

    
  @JsonProperty("custom_question_label")
  public String getCustomQuestionLabel() {
    return customQuestionLabel;
  }
  public void setCustomQuestionLabel(String customQuestionLabel) {
    this.customQuestionLabel = customQuestionLabel;
  }

    
  @JsonProperty("custom_question_options")
  public List<String> getCustomQuestionOptions() {
    return customQuestionOptions;
  }
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
    return Objects.equals(questionType, leadFormQuestion.questionType) &&
        Objects.equals(customQuestionFieldType, leadFormQuestion.customQuestionFieldType) &&
        Objects.equals(customQuestionLabel, leadFormQuestion.customQuestionLabel) &&
        Objects.equals(customQuestionOptions, leadFormQuestion.customQuestionOptions);
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
