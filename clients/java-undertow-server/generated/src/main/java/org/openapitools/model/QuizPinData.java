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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.QuizPinQuestion;
import org.openapitools.model.QuizPinResult;
import org.openapitools.model.TieBreakerType;



/**
 * This field includes all quiz data including questions, options, and results.
 */

@ApiModel(description = "This field includes all quiz data including questions, options, and results.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-08-30T09:53:14.631547469Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class QuizPinData   {
  
  private List<QuizPinQuestion> questions = new ArrayList<>();
  private List<QuizPinResult> results = new ArrayList<>();
  private QuizPinResult tieBreakerCustomResult;
  private TieBreakerType tieBreakerType;

  /**
   */
  public QuizPinData questions(List<QuizPinQuestion> questions) {
    this.questions = questions;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("questions")
  public List<QuizPinQuestion> getQuestions() {
    return questions;
  }
  public void setQuestions(List<QuizPinQuestion> questions) {
    this.questions = questions;
  }

  /**
   */
  public QuizPinData results(List<QuizPinResult> results) {
    this.results = results;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("results")
  public List<QuizPinResult> getResults() {
    return results;
  }
  public void setResults(List<QuizPinResult> results) {
    this.results = results;
  }

  /**
   */
  public QuizPinData tieBreakerCustomResult(QuizPinResult tieBreakerCustomResult) {
    this.tieBreakerCustomResult = tieBreakerCustomResult;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("tie_breaker_custom_result")
  public QuizPinResult getTieBreakerCustomResult() {
    return tieBreakerCustomResult;
  }
  public void setTieBreakerCustomResult(QuizPinResult tieBreakerCustomResult) {
    this.tieBreakerCustomResult = tieBreakerCustomResult;
  }

  /**
   */
  public QuizPinData tieBreakerType(TieBreakerType tieBreakerType) {
    this.tieBreakerType = tieBreakerType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("tie_breaker_type")
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
    return Objects.equals(questions, quizPinData.questions) &&
        Objects.equals(results, quizPinData.results) &&
        Objects.equals(tieBreakerCustomResult, quizPinData.tieBreakerCustomResult) &&
        Objects.equals(tieBreakerType, quizPinData.tieBreakerType);
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

