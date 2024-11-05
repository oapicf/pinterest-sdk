package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.QuizPinOption;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A specific quiz inquiry.
 **/
@ApiModel(description = "A specific quiz inquiry.")
@JsonTypeName("QuizPinQuestion")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class QuizPinQuestion   {
  private BigDecimal questionId;
  private String questionText;
  private @Valid List<@Valid QuizPinOption> options = new ArrayList<>();

  /**
   **/
  public QuizPinQuestion questionId(BigDecimal questionId) {
    this.questionId = questionId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("question_id")
  @Valid public BigDecimal getQuestionId() {
    return questionId;
  }

  @JsonProperty("question_id")
  public void setQuestionId(BigDecimal questionId) {
    this.questionId = questionId;
  }

  /**
   **/
  public QuizPinQuestion questionText(String questionText) {
    this.questionText = questionText;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("question_text")
  public String getQuestionText() {
    return questionText;
  }

  @JsonProperty("question_text")
  public void setQuestionText(String questionText) {
    this.questionText = questionText;
  }

  /**
   **/
  public QuizPinQuestion options(List<@Valid QuizPinOption> options) {
    this.options = options;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("options")
  @Valid public List<@Valid QuizPinOption> getOptions() {
    return options;
  }

  @JsonProperty("options")
  public void setOptions(List<@Valid QuizPinOption> options) {
    this.options = options;
  }

  public QuizPinQuestion addOptionsItem(QuizPinOption optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }

    this.options.add(optionsItem);
    return this;
  }

  public QuizPinQuestion removeOptionsItem(QuizPinOption optionsItem) {
    if (optionsItem != null && this.options != null) {
      this.options.remove(optionsItem);
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
    QuizPinQuestion quizPinQuestion = (QuizPinQuestion) o;
    return Objects.equals(this.questionId, quizPinQuestion.questionId) &&
        Objects.equals(this.questionText, quizPinQuestion.questionText) &&
        Objects.equals(this.options, quizPinQuestion.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questionId, questionText, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuizPinQuestion {\n");
    
    sb.append("    questionId: ").append(toIndentedString(questionId)).append("\n");
    sb.append("    questionText: ").append(toIndentedString(questionText)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

