package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.QuizPinQuestion;
import org.openapitools.model.QuizPinResult;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.
 **/
@ApiModel(description="Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.")

public class AdCommonQuizPinData  {
  
  @ApiModelProperty(value = "")
  private List<QuizPinQuestion> questions;

  @ApiModelProperty(value = "")
  private List<QuizPinResult> results;
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

  public AdCommonQuizPinData questions(List<QuizPinQuestion> questions) {
    this.questions = questions;
    return this;
  }

  public AdCommonQuizPinData addQuestionsItem(QuizPinQuestion questionsItem) {
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

  public AdCommonQuizPinData results(List<QuizPinResult> results) {
    this.results = results;
    return this;
  }

  public AdCommonQuizPinData addResultsItem(QuizPinResult resultsItem) {
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
    AdCommonQuizPinData adCommonQuizPinData = (AdCommonQuizPinData) o;
    return Objects.equals(this.questions, adCommonQuizPinData.questions) &&
        Objects.equals(this.results, adCommonQuizPinData.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questions, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdCommonQuizPinData {\n");
    
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

