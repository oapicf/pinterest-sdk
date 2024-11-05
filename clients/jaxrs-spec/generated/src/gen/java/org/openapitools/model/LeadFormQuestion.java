package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.LeadFormQuestionFieldType;
import org.openapitools.model.LeadFormQuestionType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("LeadFormQuestion")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class LeadFormQuestion   {
  private LeadFormQuestionType questionType;
  private LeadFormQuestionFieldType customQuestionFieldType;
  private String customQuestionLabel;
  private @Valid List<String> customQuestionOptions;

  /**
   **/
  public LeadFormQuestion questionType(LeadFormQuestionType questionType) {
    this.questionType = questionType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("question_type")
  public LeadFormQuestionType getQuestionType() {
    return questionType;
  }

  @JsonProperty("question_type")
  public void setQuestionType(LeadFormQuestionType questionType) {
    this.questionType = questionType;
  }

  /**
   **/
  public LeadFormQuestion customQuestionFieldType(LeadFormQuestionFieldType customQuestionFieldType) {
    this.customQuestionFieldType = customQuestionFieldType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("custom_question_field_type")
  public LeadFormQuestionFieldType getCustomQuestionFieldType() {
    return customQuestionFieldType;
  }

  @JsonProperty("custom_question_field_type")
  public void setCustomQuestionFieldType(LeadFormQuestionFieldType customQuestionFieldType) {
    this.customQuestionFieldType = customQuestionFieldType;
  }

  /**
   * Question label for a custom question.
   **/
  public LeadFormQuestion customQuestionLabel(String customQuestionLabel) {
    this.customQuestionLabel = customQuestionLabel;
    return this;
  }

  
  @ApiModelProperty(value = "Question label for a custom question.")
  @JsonProperty("custom_question_label")
  public String getCustomQuestionLabel() {
    return customQuestionLabel;
  }

  @JsonProperty("custom_question_label")
  public void setCustomQuestionLabel(String customQuestionLabel) {
    this.customQuestionLabel = customQuestionLabel;
  }

  /**
   * Question options for a custom question.
   **/
  public LeadFormQuestion customQuestionOptions(List<String> customQuestionOptions) {
    this.customQuestionOptions = customQuestionOptions;
    return this;
  }

  
  @ApiModelProperty(value = "Question options for a custom question.")
  @JsonProperty("custom_question_options")
   @Size(min=0,max=5)public List<String> getCustomQuestionOptions() {
    return customQuestionOptions;
  }

  @JsonProperty("custom_question_options")
  public void setCustomQuestionOptions(List<String> customQuestionOptions) {
    this.customQuestionOptions = customQuestionOptions;
  }

  public LeadFormQuestion addCustomQuestionOptionsItem(String customQuestionOptionsItem) {
    if (this.customQuestionOptions == null) {
      this.customQuestionOptions = new ArrayList<>();
    }

    this.customQuestionOptions.add(customQuestionOptionsItem);
    return this;
  }

  public LeadFormQuestion removeCustomQuestionOptionsItem(String customQuestionOptionsItem) {
    if (customQuestionOptionsItem != null && this.customQuestionOptions != null) {
      this.customQuestionOptions.remove(customQuestionOptionsItem);
    }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

