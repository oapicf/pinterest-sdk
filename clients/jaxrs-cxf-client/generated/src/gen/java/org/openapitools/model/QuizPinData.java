package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.QuizPinQuestion;
import org.openapitools.model.QuizPinResult;
import org.openapitools.model.TieBreakerType;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This field includes all quiz data including questions, options, and results.
 */
@ApiModel(description="This field includes all quiz data including questions, options, and results.")

public class QuizPinData  {
  
  @ApiModelProperty(value = "")

  private List<QuizPinQuestion> questions = new ArrayList<>();

  @ApiModelProperty(value = "")

  private List<QuizPinResult> results = new ArrayList<>();

  @ApiModelProperty(value = "")

  private QuizPinResult tieBreakerCustomResult;

  @ApiModelProperty(value = "")

  private TieBreakerType tieBreakerType;
 /**
   * Get questions
   * @return questions
  **/
  @JsonProperty("questions")
  public List<QuizPinQuestion> getQuestions() {
    return questions;
  }

  public void setQuestions(List<QuizPinQuestion> questions) {
    this.questions = questions;
  }

  public QuizPinData questions(List<QuizPinQuestion> questions) {
    this.questions = questions;
    return this;
  }

  public QuizPinData addQuestionsItem(QuizPinQuestion questionsItem) {
    this.questions.add(questionsItem);
    return this;
  }

 /**
   * Get results
   * @return results
  **/
  @JsonProperty("results")
  public List<QuizPinResult> getResults() {
    return results;
  }

  public void setResults(List<QuizPinResult> results) {
    this.results = results;
  }

  public QuizPinData results(List<QuizPinResult> results) {
    this.results = results;
    return this;
  }

  public QuizPinData addResultsItem(QuizPinResult resultsItem) {
    this.results.add(resultsItem);
    return this;
  }

 /**
   * Get tieBreakerCustomResult
   * @return tieBreakerCustomResult
  **/
  @JsonProperty("tie_breaker_custom_result")
  public QuizPinResult getTieBreakerCustomResult() {
    return tieBreakerCustomResult;
  }

  public void setTieBreakerCustomResult(QuizPinResult tieBreakerCustomResult) {
    this.tieBreakerCustomResult = tieBreakerCustomResult;
  }

  public QuizPinData tieBreakerCustomResult(QuizPinResult tieBreakerCustomResult) {
    this.tieBreakerCustomResult = tieBreakerCustomResult;
    return this;
  }

 /**
   * Get tieBreakerType
   * @return tieBreakerType
  **/
  @JsonProperty("tie_breaker_type")
  public TieBreakerType getTieBreakerType() {
    return tieBreakerType;
  }

  public void setTieBreakerType(TieBreakerType tieBreakerType) {
    this.tieBreakerType = tieBreakerType;
  }

  public QuizPinData tieBreakerType(TieBreakerType tieBreakerType) {
    this.tieBreakerType = tieBreakerType;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

