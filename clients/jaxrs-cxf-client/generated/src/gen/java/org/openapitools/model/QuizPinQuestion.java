package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.QuizPinOption;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * A specific quiz inquiry.
 **/
@ApiModel(description="A specific quiz inquiry.")

public class QuizPinQuestion  {
  
  @ApiModelProperty(value = "")
  private BigDecimal questionId;

  @ApiModelProperty(value = "")
  private String questionText;

  @ApiModelProperty(value = "")
  private List<QuizPinOption> options = new ArrayList<>();
 /**
   * Get questionId
   * @return questionId
  **/
  @JsonProperty("question_id")
  public BigDecimal getQuestionId() {
    return questionId;
  }

  public void setQuestionId(BigDecimal questionId) {
    this.questionId = questionId;
  }

  public QuizPinQuestion questionId(BigDecimal questionId) {
    this.questionId = questionId;
    return this;
  }

 /**
   * Get questionText
   * @return questionText
  **/
  @JsonProperty("question_text")
  public String getQuestionText() {
    return questionText;
  }

  public void setQuestionText(String questionText) {
    this.questionText = questionText;
  }

  public QuizPinQuestion questionText(String questionText) {
    this.questionText = questionText;
    return this;
  }

 /**
   * Get options
   * @return options
  **/
  @JsonProperty("options")
  public List<QuizPinOption> getOptions() {
    return options;
  }

  public void setOptions(List<QuizPinOption> options) {
    this.options = options;
  }

  public QuizPinQuestion options(List<QuizPinOption> options) {
    this.options = options;
    return this;
  }

  public QuizPinQuestion addOptionsItem(QuizPinOption optionsItem) {
    this.options.add(optionsItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

