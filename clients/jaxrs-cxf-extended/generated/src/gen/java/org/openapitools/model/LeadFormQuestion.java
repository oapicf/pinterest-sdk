package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.LeadFormQuestionFieldType;
import org.openapitools.model.LeadFormQuestionType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LeadFormQuestion  {
  
  @ApiModelProperty(value = "")
  @Valid
  private LeadFormQuestionType questionType;

  @ApiModelProperty(value = "")
  @Valid
  private LeadFormQuestionFieldType customQuestionFieldType;

 /**
  * Question label for a custom question.
  */
  @ApiModelProperty(value = "Question label for a custom question.")
  private String customQuestionLabel;

 /**
  * Question options for a custom question.
  */
  @ApiModelProperty(value = "Question options for a custom question.")
  private List<String> customQuestionOptions;
 /**
  * Get questionType
  * @return questionType
  */
  @JsonProperty("question_type")
  public LeadFormQuestionType getQuestionType() {
    return questionType;
  }

  /**
   * Sets the <code>questionType</code> property.
   */
 public void setQuestionType(LeadFormQuestionType questionType) {
    this.questionType = questionType;
  }

  /**
   * Sets the <code>questionType</code> property.
   */
  public LeadFormQuestion questionType(LeadFormQuestionType questionType) {
    this.questionType = questionType;
    return this;
  }

 /**
  * Get customQuestionFieldType
  * @return customQuestionFieldType
  */
  @JsonProperty("custom_question_field_type")
  public LeadFormQuestionFieldType getCustomQuestionFieldType() {
    return customQuestionFieldType;
  }

  /**
   * Sets the <code>customQuestionFieldType</code> property.
   */
 public void setCustomQuestionFieldType(LeadFormQuestionFieldType customQuestionFieldType) {
    this.customQuestionFieldType = customQuestionFieldType;
  }

  /**
   * Sets the <code>customQuestionFieldType</code> property.
   */
  public LeadFormQuestion customQuestionFieldType(LeadFormQuestionFieldType customQuestionFieldType) {
    this.customQuestionFieldType = customQuestionFieldType;
    return this;
  }

 /**
  * Question label for a custom question.
  * @return customQuestionLabel
  */
  @JsonProperty("custom_question_label")
  public String getCustomQuestionLabel() {
    return customQuestionLabel;
  }

  /**
   * Sets the <code>customQuestionLabel</code> property.
   */
 public void setCustomQuestionLabel(String customQuestionLabel) {
    this.customQuestionLabel = customQuestionLabel;
  }

  /**
   * Sets the <code>customQuestionLabel</code> property.
   */
  public LeadFormQuestion customQuestionLabel(String customQuestionLabel) {
    this.customQuestionLabel = customQuestionLabel;
    return this;
  }

 /**
  * Question options for a custom question.
  * @return customQuestionOptions
  */
  @JsonProperty("custom_question_options")
 @Size(min=0,max=5)  public List<String> getCustomQuestionOptions() {
    return customQuestionOptions;
  }

  /**
   * Sets the <code>customQuestionOptions</code> property.
   */
 public void setCustomQuestionOptions(List<String> customQuestionOptions) {
    this.customQuestionOptions = customQuestionOptions;
  }

  /**
   * Sets the <code>customQuestionOptions</code> property.
   */
  public LeadFormQuestion customQuestionOptions(List<String> customQuestionOptions) {
    this.customQuestionOptions = customQuestionOptions;
    return this;
  }

  /**
   * Adds a new item to the <code>customQuestionOptions</code> list.
   */
  public LeadFormQuestion addCustomQuestionOptionsItem(String customQuestionOptionsItem) {
    this.customQuestionOptions.add(customQuestionOptionsItem);
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

