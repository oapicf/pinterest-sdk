package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.QuizPinQuestion;
import org.openapitools.model.QuizPinResult;
import org.openapitools.model.TieBreakerType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * This field includes all quiz data including questions, options, and results.
 **/
@ApiModel(description = "This field includes all quiz data including questions, options, and results.")
@JsonTypeName("QuizPinData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class QuizPinData   {
  private @Valid List<@Valid QuizPinQuestion> questions = new ArrayList<>();
  private @Valid List<@Valid QuizPinResult> results = new ArrayList<>();
  private QuizPinResult tieBreakerCustomResult;
  private TieBreakerType tieBreakerType;

  public QuizPinData() {
  }

  /**
   **/
  public QuizPinData questions(List<@Valid QuizPinQuestion> questions) {
    this.questions = questions;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("questions")
  @Valid public List<@Valid QuizPinQuestion> getQuestions() {
    return questions;
  }

  @JsonProperty("questions")
  public void setQuestions(List<@Valid QuizPinQuestion> questions) {
    this.questions = questions;
  }

  public QuizPinData addQuestionsItem(QuizPinQuestion questionsItem) {
    if (this.questions == null) {
      this.questions = new ArrayList<>();
    }

    this.questions.add(questionsItem);
    return this;
  }

  public QuizPinData removeQuestionsItem(QuizPinQuestion questionsItem) {
    if (questionsItem != null && this.questions != null) {
      this.questions.remove(questionsItem);
    }

    return this;
  }
  /**
   **/
  public QuizPinData results(List<@Valid QuizPinResult> results) {
    this.results = results;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("results")
  @Valid public List<@Valid QuizPinResult> getResults() {
    return results;
  }

  @JsonProperty("results")
  public void setResults(List<@Valid QuizPinResult> results) {
    this.results = results;
  }

  public QuizPinData addResultsItem(QuizPinResult resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }

    this.results.add(resultsItem);
    return this;
  }

  public QuizPinData removeResultsItem(QuizPinResult resultsItem) {
    if (resultsItem != null && this.results != null) {
      this.results.remove(resultsItem);
    }

    return this;
  }
  /**
   **/
  public QuizPinData tieBreakerCustomResult(QuizPinResult tieBreakerCustomResult) {
    this.tieBreakerCustomResult = tieBreakerCustomResult;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("tie_breaker_custom_result")
  @Valid public QuizPinResult getTieBreakerCustomResult() {
    return tieBreakerCustomResult;
  }

  @JsonProperty("tie_breaker_custom_result")
  public void setTieBreakerCustomResult(QuizPinResult tieBreakerCustomResult) {
    this.tieBreakerCustomResult = tieBreakerCustomResult;
  }

  /**
   **/
  public QuizPinData tieBreakerType(TieBreakerType tieBreakerType) {
    this.tieBreakerType = tieBreakerType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("tie_breaker_type")
  public TieBreakerType getTieBreakerType() {
    return tieBreakerType;
  }

  @JsonProperty("tie_breaker_type")
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
