package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.LeadFormQuestionFieldType;
import com.prokarma.pkmst.model.LeadFormQuestionType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * LeadFormQuestion
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-05T02:04:39.133647094Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class LeadFormQuestion   {
  @JsonProperty("question_type")
  private LeadFormQuestionType questionType;

  @JsonProperty("custom_question_field_type")
  private LeadFormQuestionFieldType customQuestionFieldType;

  @JsonProperty("custom_question_label")
  private String customQuestionLabel;

  @JsonProperty("custom_question_options")
  
  private List<String> customQuestionOptions = null;

  public LeadFormQuestion questionType(LeadFormQuestionType questionType) {
    this.questionType = questionType;
    return this;
  }

  /**
   * Get questionType
   * @return questionType
   */
  @ApiModelProperty(value = "")
  public LeadFormQuestionType getQuestionType() {
    return questionType;
  }

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
  @ApiModelProperty(value = "")
  public LeadFormQuestionFieldType getCustomQuestionFieldType() {
    return customQuestionFieldType;
  }

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
  @ApiModelProperty(value = "Question label for a custom question.")
  public String getCustomQuestionLabel() {
    return customQuestionLabel;
  }

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
  @ApiModelProperty(value = "Question options for a custom question.")
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

