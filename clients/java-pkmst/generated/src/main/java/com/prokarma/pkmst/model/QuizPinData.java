package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.QuizPinQuestion;
import com.prokarma.pkmst.model.QuizPinResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * This field includes all quiz data including questions, options, and results.
 */
@ApiModel(description = "This field includes all quiz data including questions, options, and results.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-03-14T23:02:40.880156196Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class QuizPinData   {
  @JsonProperty("questions")
  
  private List<QuizPinQuestion> questions = null;

  @JsonProperty("results")
  
  private List<QuizPinResult> results = null;

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
  **/
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
  **/
  @ApiModelProperty(value = "")
  public List<QuizPinResult> getResults() {
    return results;
  }

  public void setResults(List<QuizPinResult> results) {
    this.results = results;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

