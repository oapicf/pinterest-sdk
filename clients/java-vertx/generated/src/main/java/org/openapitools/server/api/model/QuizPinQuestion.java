package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.QuizPinOption;

/**
 * A specific quiz inquiry.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class QuizPinQuestion   {
  
  private BigDecimal questionId;
  private String questionText;
  private List<QuizPinOption> options;

  public QuizPinQuestion () {

  }

  public QuizPinQuestion (BigDecimal questionId, String questionText, List<QuizPinOption> options) {
    this.questionId = questionId;
    this.questionText = questionText;
    this.options = options;
  }

    
  @JsonProperty("question_id")
  public BigDecimal getQuestionId() {
    return questionId;
  }
  public void setQuestionId(BigDecimal questionId) {
    this.questionId = questionId;
  }

    
  @JsonProperty("question_text")
  public String getQuestionText() {
    return questionText;
  }
  public void setQuestionText(String questionText) {
    this.questionText = questionText;
  }

    
  @JsonProperty("options")
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
    return Objects.equals(questionId, quizPinQuestion.questionId) &&
        Objects.equals(questionText, quizPinQuestion.questionText) &&
        Objects.equals(options, quizPinQuestion.options);
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
