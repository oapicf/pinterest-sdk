package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.QuizPinQuestion;
import com.prokarma.pkmst.model.QuizPinResult;
import com.prokarma.pkmst.model.TieBreakerType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * This field includes all quiz data including questions, options, and results.
 */
@ApiModel(description = "This field includes all quiz data including questions, options, and results.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class QuizPinData   {
  @JsonProperty("questions")
  
  private List<QuizPinQuestion> questions = null;

  @JsonProperty("results")
  
  private List<QuizPinResult> results = null;

  @JsonProperty("tie_breaker_custom_result")
  private QuizPinResult tieBreakerCustomResult;

  @JsonProperty("tie_breaker_type")
  private TieBreakerType tieBreakerType;

  public QuizPinData questions(List<QuizPinQuestion> questions) {
    this.questions = questions;
    return this;
  }

  public QuizPinData addQuestionsItem(QuizPinQuestion questionsItem) {
    if (this.questions == null) {
      this.questions = new ArrayList<>();
    }
    this.questions.add(questionsItem);
    return this;
  }

  /**
   * Get questions
   * @return questions
   */
  @ApiModelProperty(value = "")
  public List<QuizPinQuestion> getQuestions() {
    return questions;
  }

  public void setQuestions(List<QuizPinQuestion> questions) {
    this.questions = questions;
  }

  public QuizPinData results(List<QuizPinResult> results) {
    this.results = results;
    return this;
  }

  public QuizPinData addResultsItem(QuizPinResult resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

  /**
   * Get results
   * @return results
   */
  @ApiModelProperty(value = "")
  public List<QuizPinResult> getResults() {
    return results;
  }

  public void setResults(List<QuizPinResult> results) {
    this.results = results;
  }

  public QuizPinData tieBreakerCustomResult(QuizPinResult tieBreakerCustomResult) {
    this.tieBreakerCustomResult = tieBreakerCustomResult;
    return this;
  }

  /**
   * Get tieBreakerCustomResult
   * @return tieBreakerCustomResult
   */
  @ApiModelProperty(value = "")
  public QuizPinResult getTieBreakerCustomResult() {
    return tieBreakerCustomResult;
  }

  public void setTieBreakerCustomResult(QuizPinResult tieBreakerCustomResult) {
    this.tieBreakerCustomResult = tieBreakerCustomResult;
  }

  public QuizPinData tieBreakerType(TieBreakerType tieBreakerType) {
    this.tieBreakerType = tieBreakerType;
    return this;
  }

  /**
   * Get tieBreakerType
   * @return tieBreakerType
   */
  @ApiModelProperty(value = "")
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

