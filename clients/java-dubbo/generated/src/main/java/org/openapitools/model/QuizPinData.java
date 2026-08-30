package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.QuizPinQuestion;
import org.openapitools.model.QuizPinResult;
import org.openapitools.model.TieBreakerType;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * This field includes all quiz data including questions, options, and results.
 */
public class QuizPinData implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("questions")
  private List<QuizPinQuestion> questions = new ArrayList<>();

  @JsonProperty("results")
  private List<QuizPinResult> results = new ArrayList<>();

  @JsonProperty("tie_breaker_custom_result")
  private QuizPinResult tieBreakerCustomResult;

  @JsonProperty("tie_breaker_type")
  private TieBreakerType tieBreakerType;

  /**
   * 
   * @return questions
   */
  public List<QuizPinQuestion> getQuestions() {
    return questions;
  }

  public void setQuestions(List<QuizPinQuestion> questions) {
    this.questions = questions;
  }

  /**
   * 
   * @return results
   */
  public List<QuizPinResult> getResults() {
    return results;
  }

  public void setResults(List<QuizPinResult> results) {
    this.results = results;
  }

  /**
   * 
   * @return tieBreakerCustomResult
   */
  public QuizPinResult getTieBreakerCustomResult() {
    return tieBreakerCustomResult;
  }

  public void setTieBreakerCustomResult(QuizPinResult tieBreakerCustomResult) {
    this.tieBreakerCustomResult = tieBreakerCustomResult;
  }

  /**
   * 
   * @return tieBreakerType
   */
  public TieBreakerType getTieBreakerType() {
    return tieBreakerType;
  }

  public void setTieBreakerType(TieBreakerType tieBreakerType) {
    this.tieBreakerType = tieBreakerType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuizPinData quizPinData = (QuizPinData) o;
    return Objects.equals(this.questions, quizPinData.questions) &&
        Objects.equals(this.results, quizPinData.results) &&
        Objects.equals(this.tieBreakerCustomResult, quizPinData.tieBreakerCustomResult) &&
        Objects.equals(this.tieBreakerType, quizPinData.tieBreakerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questions, results, tieBreakerCustomResult, tieBreakerType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuizPinData {\n");
    
    sb.append("    questions: ").append(toIndentedString(questions)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    tieBreakerCustomResult: ").append(toIndentedString(tieBreakerCustomResult)).append("\n");
    sb.append("    tieBreakerType: ").append(toIndentedString(tieBreakerType)).append("\n");
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
