package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.QuizPinOption;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * A specific quiz inquiry.
 */
@ApiModel(description = "A specific quiz inquiry.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-05T02:04:39.133647094Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class QuizPinQuestion   {
  @JsonProperty("question_id")
  private BigDecimal questionId;

  @JsonProperty("question_text")
  private String questionText;

  @JsonProperty("options")
  
  private List<QuizPinOption> options = null;

  public QuizPinQuestion questionId(BigDecimal questionId) {
    this.questionId = questionId;
    return this;
  }

  /**
   * Get questionId
   * @return questionId
   */
  @ApiModelProperty(value = "")
  public BigDecimal getQuestionId() {
    return questionId;
  }

  public void setQuestionId(BigDecimal questionId) {
    this.questionId = questionId;
  }

  public QuizPinQuestion questionText(String questionText) {
    this.questionText = questionText;
    return this;
  }

  /**
   * Get questionText
   * @return questionText
   */
  @ApiModelProperty(value = "")
  public String getQuestionText() {
    return questionText;
  }

  public void setQuestionText(String questionText) {
    this.questionText = questionText;
  }

  public QuizPinQuestion options(List<QuizPinOption> options) {
    this.options = options;
    return this;
  }

  public QuizPinQuestion addOptionsItem(QuizPinOption optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

  /**
   * Get options
   * @return options
   */
  @ApiModelProperty(value = "")
  public List<QuizPinOption> getOptions() {
    return options;
  }

  public void setOptions(List<QuizPinOption> options) {
    this.options = options;
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

