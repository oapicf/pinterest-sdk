package apimodels;

import apimodels.QuizPinOption;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * A specific quiz inquiry.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class QuizPinQuestion   {
  @JsonProperty("question_id")
  @Valid

  private BigDecimal questionId;

  @JsonProperty("question_text")
  
  private String questionText;

  @JsonProperty("options")
  @Valid

  private List<@Valid QuizPinOption> options = null;

  public QuizPinQuestion questionId(BigDecimal questionId) {
    this.questionId = questionId;
    return this;
  }

   /**
   * Get questionId
   * @return questionId
  **/
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
  **/
  public String getQuestionText() {
    return questionText;
  }

  public void setQuestionText(String questionText) {
    this.questionText = questionText;
  }

  public QuizPinQuestion options(List<@Valid QuizPinOption> options) {
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
  **/
  public List<@Valid QuizPinOption> getOptions() {
    return options;
  }

  public void setOptions(List<@Valid QuizPinOption> options) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

