package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.QuizPinQuestion;
import org.openapitools.model.QuizPinResult;

/**
 * This field includes all quiz data including questions, options, and results.
 */
@ApiModel(description = "This field includes all quiz data including questions, options, and results.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-03-14T23:02:29.393275857Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class QuizPinData   {
  @JsonProperty("questions")
  private List<@Valid QuizPinQuestion> questions = null;

  @JsonProperty("results")
  private List<@Valid QuizPinResult> results = null;

  public QuizPinData questions(List<@Valid QuizPinQuestion> questions) {
    this.questions = questions;
    return this;
  }

  public QuizPinData addQuestionsItem(QuizPinQuestion questionsItem) {
    if (this.questions == null) {
      this.questions = ;
    }
    this.questions.add(questionsItem);
    return this;
  }

   /**
   * Get questions
   * @return questions
  **/
  @ApiModelProperty(value = "")
  public List<@Valid QuizPinQuestion> getQuestions() {
    return questions;
  }

  public void setQuestions(List<@Valid QuizPinQuestion> questions) {
    this.questions = questions;
  }

  public QuizPinData results(List<@Valid QuizPinResult> results) {
    this.results = results;
    return this;
  }

  public QuizPinData addResultsItem(QuizPinResult resultsItem) {
    if (this.results == null) {
      this.results = ;
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @ApiModelProperty(value = "")
  public List<@Valid QuizPinResult> getResults() {
    return results;
  }

  public void setResults(List<@Valid QuizPinResult> results) {
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

