package org.openapitools.model;

import java.math.BigDecimal;
import org.openapitools.model.QuizPinOption;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * A specific quiz inquiry.
 */
public class QuizPinQuestion implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("options")
  private List<QuizPinOption> options = new ArrayList<>();

  @JsonProperty("question_id")
  private BigDecimal questionId;

  @JsonProperty("question_text")
  private String questionText;

  /**
   * 
   * @return options
   */
  public List<QuizPinOption> getOptions() {
    return options;
  }

  public void setOptions(List<QuizPinOption> options) {
    this.options = options;
  }

  /**
   * 
   * @return questionId
   */
  public BigDecimal getQuestionId() {
    return questionId;
  }

  public void setQuestionId(BigDecimal questionId) {
    this.questionId = questionId;
  }

  /**
   * 
   * @return questionText
   */
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
    return Objects.equals(this.options, quizPinQuestion.options) &&
        Objects.equals(this.questionId, quizPinQuestion.questionId) &&
        Objects.equals(this.questionText, quizPinQuestion.questionText);
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
