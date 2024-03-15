package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.QuizPinQuestion;
import org.openapitools.model.QuizPinResult;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * This field includes all quiz data including questions, options, and results.
 */
@ApiModel(description="This field includes all quiz data including questions, options, and results.")

public class QuizPinData  {
  
  @ApiModelProperty(value = "")
  @Valid
  private List<@Valid QuizPinQuestion> questions;

  @ApiModelProperty(value = "")
  @Valid
  private List<@Valid QuizPinResult> results;
 /**
  * Get questions
  * @return questions
  */
  @JsonProperty("questions")
  public List<@Valid QuizPinQuestion> getQuestions() {
    return questions;
  }

  /**
   * Sets the <code>questions</code> property.
   */
 public void setQuestions(List<@Valid QuizPinQuestion> questions) {
    this.questions = questions;
  }

  /**
   * Sets the <code>questions</code> property.
   */
  public QuizPinData questions(List<@Valid QuizPinQuestion> questions) {
    this.questions = questions;
    return this;
  }

  /**
   * Adds a new item to the <code>questions</code> list.
   */
  public QuizPinData addQuestionsItem(QuizPinQuestion questionsItem) {
    this.questions.add(questionsItem);
    return this;
  }

 /**
  * Get results
  * @return results
  */
  @JsonProperty("results")
  public List<@Valid QuizPinResult> getResults() {
    return results;
  }

  /**
   * Sets the <code>results</code> property.
   */
 public void setResults(List<@Valid QuizPinResult> results) {
    this.results = results;
  }

  /**
   * Sets the <code>results</code> property.
   */
  public QuizPinData results(List<@Valid QuizPinResult> results) {
    this.results = results;
    return this;
  }

  /**
   * Adds a new item to the <code>results</code> list.
   */
  public QuizPinData addResultsItem(QuizPinResult resultsItem) {
    this.results.add(resultsItem);
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
        Objects.equals(this.results, quizPinData.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questions, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuizPinData {\n");
    
    sb.append("    questions: ").append(toIndentedString(questions)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

