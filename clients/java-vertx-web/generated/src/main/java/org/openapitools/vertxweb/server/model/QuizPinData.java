package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.QuizPinQuestion;
import org.openapitools.vertxweb.server.model.QuizPinResult;

/**
 * This field includes all quiz data including questions, options, and results.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class QuizPinData   {
  
  private List<QuizPinQuestion> questions = new ArrayList<>();
  private List<QuizPinResult> results = new ArrayList<>();


  public enum TieBreakerTypeEnum {
    RANDOM("RANDOM"),
    CUSTOM("CUSTOM");

    private String value;

    TieBreakerTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private TieBreakerTypeEnum tieBreakerType;
  private QuizPinResult tieBreakerCustomResult;

  public QuizPinData () {

  }

  public QuizPinData (List<QuizPinQuestion> questions, List<QuizPinResult> results, TieBreakerTypeEnum tieBreakerType, QuizPinResult tieBreakerCustomResult) {
    this.questions = questions;
    this.results = results;
    this.tieBreakerType = tieBreakerType;
    this.tieBreakerCustomResult = tieBreakerCustomResult;
  }

    
  @JsonProperty("questions")
  public List<QuizPinQuestion> getQuestions() {
    return questions;
  }
  public void setQuestions(List<QuizPinQuestion> questions) {
    this.questions = questions;
  }

    
  @JsonProperty("results")
  public List<QuizPinResult> getResults() {
    return results;
  }
  public void setResults(List<QuizPinResult> results) {
    this.results = results;
  }

    
  @JsonProperty("tie_breaker_type")
  public TieBreakerTypeEnum getTieBreakerType() {
    return tieBreakerType;
  }
  public void setTieBreakerType(TieBreakerTypeEnum tieBreakerType) {
    this.tieBreakerType = tieBreakerType;
  }

    
  @JsonProperty("tie_breaker_custom_result")
  public QuizPinResult getTieBreakerCustomResult() {
    return tieBreakerCustomResult;
  }
  public void setTieBreakerCustomResult(QuizPinResult tieBreakerCustomResult) {
    this.tieBreakerCustomResult = tieBreakerCustomResult;
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
    return Objects.equals(questions, quizPinData.questions) &&
        Objects.equals(results, quizPinData.results) &&
        Objects.equals(tieBreakerType, quizPinData.tieBreakerType) &&
        Objects.equals(tieBreakerCustomResult, quizPinData.tieBreakerCustomResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questions, results, tieBreakerType, tieBreakerCustomResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuizPinData {\n");
    
    sb.append("    questions: ").append(toIndentedString(questions)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    tieBreakerType: ").append(toIndentedString(tieBreakerType)).append("\n");
    sb.append("    tieBreakerCustomResult: ").append(toIndentedString(tieBreakerCustomResult)).append("\n");
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
