/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.28.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.QuizPinOption;



/**
 * A specific quiz inquiry.
 */

@ApiModel(description = "A specific quiz inquiry.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-08-30T09:53:14.631547469Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class QuizPinQuestion   {
  
  private List<QuizPinOption> options = new ArrayList<>();
  private BigDecimal questionId;
  private String questionText;

  /**
   */
  public QuizPinQuestion options(List<QuizPinOption> options) {
    this.options = options;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("options")
  public List<QuizPinOption> getOptions() {
    return options;
  }
  public void setOptions(List<QuizPinOption> options) {
    this.options = options;
  }

  /**
   */
  public QuizPinQuestion questionId(BigDecimal questionId) {
    this.questionId = questionId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("question_id")
  public BigDecimal getQuestionId() {
    return questionId;
  }
  public void setQuestionId(BigDecimal questionId) {
    this.questionId = questionId;
  }

  /**
   */
  public QuizPinQuestion questionText(String questionText) {
    this.questionText = questionText;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("question_text")
  public String getQuestionText() {
    return questionText;
  }
  public void setQuestionText(String questionText) {
    this.questionText = questionText;
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
    return Objects.equals(options, quizPinQuestion.options) &&
        Objects.equals(questionId, quizPinQuestion.questionId) &&
        Objects.equals(questionText, quizPinQuestion.questionText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(options, questionId, questionText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuizPinQuestion {\n");
    
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    questionId: ").append(toIndentedString(questionId)).append("\n");
    sb.append("    questionText: ").append(toIndentedString(questionText)).append("\n");
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

